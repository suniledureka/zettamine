import React from 'react'
import { useState } from 'react'

const Student = () => {
    //let [count, setCount] = useState(10);  

    //let [state, setState] = useState({
    let [student, setStudent] = useState({    
        name: 'Praveen',
        course: 'B.Tech'
    });
    
    return (
        <div>
            {/* <h2>{count}</h2> */}

            {/* <p>Name: {state.name}</p>
            <p>Course: {state.course}</p> */}
            <p>Name: {student.name}</p>
            <p>Course: {student.course}</p>
        </div>
    )
}

export default Student
