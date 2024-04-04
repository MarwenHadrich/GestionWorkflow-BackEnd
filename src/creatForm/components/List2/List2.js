import React from "react";
import { Droppable} from "react-beautiful-dnd";
import {Item} from "../index";
import "./List2.css"


const List2 = ({ data ,handleDeleteItem,handleDeleteAllItems,handleFormSubmit }) => {
    return (
        <Droppable droppableId="list2">
            {(provided) => (
                <div
                    className="card-form list2"
                    {...provided.droppableProps}
                    ref={provided.innerRef}
                >
                    {data.list2.length === 0 && <p className="drop-here">Drop here</p>}
                    {data.list2.map((item, index) => (
                        <Item item={item} index={index} handleDeleteItem={handleDeleteItem}/>

                    ))}
                    {provided.placeholder}
                    <div className="btn-space">
                        <button className="btn  btn-outline-success a" onClick={handleDeleteAllItems}>clear</button>
                        <button className="btn  btn-outline-success a" onClick={handleFormSubmit}>validate</button>

                    </div>
                </div>
            )}
        </Droppable>
    );
};

export default List2;
