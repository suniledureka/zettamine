import React from 'react'
import {createElement} from 'react'
function Header(){
  return(
    //React.createElement('h2', {}, 'React.js Certification Training')
    //React.createElement('h2', {style: {color: 'blue'}}, 'React.js Certification Training')
    //createElement('h2', {style: {color: 'blue'}}, 'React.js Certification Training')
    React.createElement('div', {style: {backgroundColor: 'lightgreen', padding: '5px'}},          
          createElement('h2', {}, 'ReactJS Certification Training'),
          createElement('img', {src: 'http://localhost:3000/static/media/logo.8a1dffdccf1d537bdea5.png', style: {width: '100px'}}, null)
        )
 )
}

export default Header
