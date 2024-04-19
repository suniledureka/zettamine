import React, { Component } from 'react'
import './employee.css'

export class Employee extends Component {
  constructor(props){
    super(props);
  } 

  render() {
    //console.log(this.props)
    return (
      <div className="card">
        <h2>Employee Name: <span style={{color: 'maroon'}}>
            {this.props.name}
            </span>
        </h2>
        <h2>Employee Age: <span style={{color: 'maroon'}}> 
            {this.props.age}
            </span>
        </h2>
      </div>
    )
  }
}


