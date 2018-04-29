import React, { Component } from 'react';
import './App.css';

import b from './backend';

class App extends Component {
  person = new b.BackendForFrontend().getPerson();
  state = { person: this.person };

  render() {
    return (
      <div className="App">
        <p>Who: {this.state.person.name} {this.state.person.surname}</p>
        <p>Where: {this.state.person.address.street}, {this.state.person.address.zipCode.toString()} {this.state.person.address.city}</p>
        {this.state.person.address.maybeApartment?
        (<p>Apartment: {this.state.person.address.maybeApartment}</p>)
        :null}
      </div>
    );
  }
}

export default App;
