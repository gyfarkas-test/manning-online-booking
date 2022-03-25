import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Navbar } from 'react-bootstrap'

function App() {
  return (
    <div className="App">
      <Navbar bg="dark" variant="dark">
        <Navbar.Brand href="#home">Ar Salon & Day Spa</Navbar.Brand>
      </Navbar>
      <main role="main" className="container">
        <div className='padding-container'>
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
        </div>
      </main>
    </div>
  );
}

export default App;
