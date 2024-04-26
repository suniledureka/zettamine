import React , {useState, useEffect}from 'react'
import UserService from '../services/UserService';
const UserList = () => {
    let [state, setState] = useState({
        users: []
    });

    useEffect(() => {
        //promise in JS  or we can use Async & Await
        UserService.getAllUsers().then((response) => {
            //console.log(response);	
            //console.log(response.data);	
            setState(() => ({
                users: response.data
            }));
        }).catch((error) => {
            console.log(error);
        });
    }, []);

    let { users } = state; //destructuring

    return (
        <React.Fragment>
            <div className="container mt-3">
                <div className="row">
                    <div className="col">
                        <p className="h3 text-success">User List</p>
                        <p>lorem30</p>
                    </div>
                </div>
            </div>

            <div className="container mt-3">
                <div className="row">
                    <div className="col">
         // <pre>{JSON.stringify(state.users)}</pre>
                        <table className="table table-hover text-center text-striped">
                            <thead className="bg-dark text-whte">
                                <tr>
                                    <th>SNO</th>
                                    <th>NAME</th>
                                    <th>EMAIL</th>
                                    <th>STREET</th>
                                    <th>CITY</th>
                                    <th>WEBSITE</th>
                                </tr>
                            </thead>

                            <tbody>
                                {
                                    users.length > 0 &&
                                    users.map(user => {
                                        return (
                                            <tr key={user.id}>
                                                <td>{user.id}</td>
                                                <td>{user.name}</td>
                                                <td>{user.email}</td>
                                                <td>{user.address.street}</td>
                                                <td>{user.address.city}</td>
                                                <td>{user.website}</td>
                                            </tr>
                                        );
                                    })
                                }
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </React.Fragment>
    );
};

export default UserList;

