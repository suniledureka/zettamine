import axios from 'axios';
class UserService{
    
  static getAllUsers(){
    let serverURL = 'https://jsonplaceholder.typicode.com/users';
    return axios.get(serverURL)
  }
}
export default UserService;
