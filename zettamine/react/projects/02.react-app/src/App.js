import React from 'react';
import './App.css';
import TopicCard from './components/TopicCard';
import EnvironmentSetup from './components/EnvironmentSetup';

function App() {
  return (
    <React.Fragment>
      <nav className='navbar'>
        <h2>ReactJS Certification Training @ ZettaMine</h2>
      </nav>
      
      <TopicCard/>
      <EnvironmentSetup/>
      <h2>{3 + 5}</h2>
    </React.Fragment>
  );
}

export default App;
