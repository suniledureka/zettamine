import React, { Component } from 'react'

export default class Employee extends Component {
    constructor() {
        super();
        /*
        this.state = {
            name: 'Manoj Kumar'
        }
        */
        this.state = {
            employee: {
                name: 'Manoj Kumar',
                age: 29,
                designation: 'Asst. Manager'
            }
        }  

        this.changeData = this.changeData.bind(this);
    }

    changeData(){
        this.setState({
            employee: {
                name: 'MANOJ KUMAR',
                age: 30,
                designation: 'Manager'
            }
        } ) 
    }

    render() {
        return (
            <div>
                {/* <h2>{this.state.name}</h2> */}
                <div style={{fontSize:'20px', color: 'blue', border: '1px solid black', padding:'10px', width: '300px'}}>
                    <p>Name: {this.state.employee.name}</p>
                    <p>Age: {this.state.employee.age}</p>
                    <p>Designation: {this.state.employee.designation}</p>
                   
                    {/* <button onClick = {() => this.changeData()}>Change Data</button> */}
                    {/* <button onClick = {this.changeData.bind(this)}>Change Data</button> */}

                    <button onClick = {this.changeData}>Change Data</button>
                </div>                
            </div>
        )
    }
}
