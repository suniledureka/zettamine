import React, {useState} from 'react'

const Lessons = () => {
    let [state, setState] = useState({
        message: 'Lesson-1 of ReactJS'
    })

    function nextLesson(){
        setState({
            message: 'Lesson-2 of ReactJS'
        })
    }

  return (
    <div>
      <h2>{state.message}</h2>
      <button onClick={nextLesson}>Next Lesson</button>
    </div>
  )
}

export default Lessons
