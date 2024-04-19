import React from 'react'

const BoxCard = ({result, children}) => {
 let [show, setShow] = React.useState(true)

 return (
   <div className={show ? "" : "hidden"}> 
    <div className={`box ${result}`}>
      {children}
      <button onClick={() => setShow(!show)} className="trigger">Hide</button>

    </div>
   </div>  
  )
}

export default BoxCard
