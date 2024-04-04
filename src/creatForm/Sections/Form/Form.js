import React, { useState } from "react";
import { DragDropContext } from "react-beautiful-dnd";
import "./Form.css"; // Import the CSS file
import Data from "../../Data";
import {List1,List2} from "../../components";




const initialData =Data;

const Form = () => {
    const [data, setData] = useState(initialData);

    const handleDragEnd = (result) => {
        const { source, destination, draggableId, reason } = result;

        if (!destination || reason === "CANCEL") {
            return;
        }

        // Prevent reordering within the same list
        if (source.droppableId === destination.droppableId) {
            return;
        }

        const sourceList = data[source.droppableId];
        const destinationList = data[destination.droppableId];

        const usedIds = data.list2.map((item) => item.id);

        if (source.droppableId === "list1") {
            const newId = `item-${Date.now()}-${Math.random().toString(36).substring(7)}`;

            const itemToAdd = {
                ...sourceList.find((item) => item.id === draggableId),
                id: newId,
                input: true,
            };

            usedIds.push(newId);

            destinationList.splice(destination.index, 0, itemToAdd);

            setData({
                ...data,
                list2: destinationList,
                usedIds,
            });

        } else if (destination.droppableId === "list2") {
            const itemToAdd = {
                ...destinationList.find((item) => item.id === draggableId),
                input: true,
            };

            const newId = `item-${Date.now()}-${Math.random().toString(36).substring(7)}`;

            if (!usedIds.includes(newId)) {
                itemToAdd.id = newId;

                usedIds.push(newId);

                destinationList.splice(destination.index, 0, itemToAdd);

                setData({
                    ...data,
                    list2: destinationList,
                    usedIds,
                });
            }
        }
    };


    const handleDeleteItem = (itemId) => {
        const itemToDeleteIndex = data.list2.findIndex((item) => item.id === itemId);

        if (itemToDeleteIndex !== -1) {
            const updatedList2 = [...data.list2];
            updatedList2.splice(itemToDeleteIndex, 1);

            setData({
                ...data,
                list2: updatedList2,
            });
        }
    };
    const handleDeleteAllItems = () => {
        setData({
            ...data,
            list2: []
        });
    };

    const handleFormSubmit = () => {
        // Handle form submission logic here
        console.log( "Form submitted");

    };

    return (
        <DragDropContext onDragEnd={handleDragEnd}>
            <div className="layout__wrapper-form">
                <List1 data={data}/>
                <List2 data={data}  handleDeleteItem={handleDeleteItem} handleDeleteAllItems={handleDeleteAllItems}   handleFormSubmit={handleFormSubmit}/>


            </div>
        </DragDropContext>
    );
};

export default Form;
