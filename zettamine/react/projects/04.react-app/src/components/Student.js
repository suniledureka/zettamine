import React from 'react'

const Student = (props) => {
   // console.log(props)
  return (
    <div className="card">
      <p>Name: {props.name}</p>
      <p>Course: {props.course}</p>
    </div>
  )
}

export default Student
