import React from "react";

class App extends React.Component {
  state = {
    valor1: '',
    valor2: '',
    resultado: ''
  }

  somar = () => {
    const resultado = parseInt(this.state.valor1) + parseInt(this.state.valor2);
    this.setState({ resultado: resultado });
  }

  render() {
    return (
      <>
        <h1>Calculadora</h1>
        <label>Valor 1</label>
        <input type="text" value={this.state.valor1}
          onChange={(e) => this.setState({ valor1: e.target.value })} />
        <br />
        <label>Valor 2</label>
        <input type="text" value={this.state.valor2}
          onChange={(e) => this.setState({ valor2: e.target.value })} />
        <br />
        <button onClick={this.somar}>Somar</button>
        <p>O resultado é: {this.state.resultado}</p>
      </>
    );
  }
}

export default App; // Exportar componente
