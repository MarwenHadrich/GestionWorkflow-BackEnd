import React from "react";
import { Draggable } from "react-beautiful-dnd";
import "./Item.css"
import {FaDeleteLeft} from "react-icons/fa6";

const Item = ({ item, handleDeleteItem ,index }) => {
    return (
        <Draggable key={item.id} draggableId={item.id} index={index}>
            {(provided) => (
                <div
                    className="item-container"
                    ref={provided.innerRef}
                    {...provided.draggableProps}
                    {...provided.dragHandleProps}
                >
                    {item.input ? (
                        <div>
                            <label>{item.label} :</label>
                            {
                                item.type === "textarea" ? (
                                    <textarea className="form-control"></textarea>
                                ) : (
                                    <input
                                        type={item.type}
                                        placeholder={`Enter ${item.label}`}
                                        className="form-control"
                                    />
                                )
                            }
                            <button
                                className="delete-button"
                                onClick={() => handleDeleteItem(item.id)}
                            >
                                <FaDeleteLeft/>
                            </button>
                        </div>
                    ) : (
                        <div>{item.label}</div>
                    )}
                </div>
            )}
        </Draggable>
    );
};

export default Item;
