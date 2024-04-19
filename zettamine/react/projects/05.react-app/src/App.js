import logo from './logo.svg';
import './App.css';
import Employee from './components/Employee';
import Student from './components/Student';
import Lessons from './components/Lessons';

function App() {
  return (
    <div className="App">
      <Employee/>
      <Student/>
      <Lessons/>
    </div>
  );
}

export default App;
