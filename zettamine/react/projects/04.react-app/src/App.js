import './App.css';
import {Employee} from './components/Employee';
import Student from './components/Student';

function App() {
  return (
    <div>
      <Employee name="Sanjay" age="25"/>
      <Employee name="Praveen" age="29"/>

      <Student name="Kiran" course="Angular"/>
      <Student name="Manoj" course="VueJS"/>
    </div>
  );
}

export default App;
