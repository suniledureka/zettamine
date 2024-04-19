import React, {Fragment} from 'react';
import ReactDOM from 'react-dom';
import './index.css';
/*
function ZettaMine() {
    return (
        <h2>ZettaMine Labs Private Limited</h2>
    );
}
*/

const ZettaMine = () => {
    let styles = {
        color: "white",
        backgroundColor: "teal",
        padding: '10px',
        textAlign: 'center'
    }
    return (
        /*
        <h2 style={{color: 'blue'}}>ZettaMine Labs Private Limited</h2>
        */
        <Fragment>
            <h2 style={styles}>ZettaMine Labs Private Limited</h2>
            <h2 className="header">Begumpet, Hyderabad, Telangana</h2>
            <img src="../logo512.png"/>
        </Fragment>
    );
}
//ReactDOM.render(<h2>ZettaMine Labs</h2>, document.getElementById('root'));
//ReactDOM.render(<ZettaMine/>, document.getElementById('root'))
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<ZettaMine />);