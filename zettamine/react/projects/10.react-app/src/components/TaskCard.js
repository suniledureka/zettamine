import React from 'react'

//const TaskCard = (props) => {
const TaskCard = ({task, handleDelete}) => {   
    return (
        <li key={task.id} className={task.completed ? "completed" : "incomplete"}>
            <span>{task.id} - {task.name} </span>
            <button className='delete' onClick={() => handleDelete(task.id)}>Delete</button>
        </li>
    )
}

export default TaskCard
