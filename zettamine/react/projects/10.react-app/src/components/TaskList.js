import React,{useState} from 'react'
import TaskCard from './TaskCard';
import BoxCard from './BoxCard';

const TaskList = () => {
    let [tasks, setTasks] = useState([
        { id: 1001, name: "Introduction to ReactJS", completed:true },
        { id: 1002, name: "Environment Setup", completed: false },
        { id: 1003, name: "Creating React Application", completed:true }
      ]);
    
      let [show, setShow] = useState(true);
    
      let handleDelete = (id) => {
        setTasks(
          tasks.filter(task => task.id != id)
        )
      }
      return (
        <div className="App">
          <div>  
            <h1>Tasks List</h1>      
            <ul>
            <button className='trigger' onClick={() => setShow(!show)}> {show ? 'Hide Tasks' : 'Show Tasks'}</button>
    
              {
               show && tasks.map((task) => 
                  <TaskCard task={task} handleDelete={handleDelete}/>
              )
              }
            </ul>

            <BoxCard result="success" key="card1">
              <p className="title">Offerings</p>
              <p className="description">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Sit at, tempora ab dicta unde recusandae dolores neque minima molestiae laudantium. </p>
            </BoxCard>

            <BoxCard result="alert" key="card2">
              <p className="title">Cookies</p>
              <p className="description">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Sit at, tempora ab dicta unde recusandae dolores neque minima molestiae laudantium. </p>
            </BoxCard>

            <BoxCard result="warning" key="card3">
              <p className="title">Upcoming</p>
              <p className="description">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Sit at, tempora ab dicta unde recusandae dolores neque minima molestiae laudantium. </p>
            </BoxCard>           
          </div>
        </div>
      );
}

export default TaskList
