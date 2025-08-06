window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AtualizaIdDoClienteNoContrato = window.blockly.js.blockly.AtualizaIdDoClienteNoContrato || {};

/**
 * @function Executar
 *
 *
 *
 * @param IdCliente
 *
 * @author Reinaldo Dourado Santos
 * @since 05/08/2025, 14:24:22
 *
 */
window.blockly.js.blockly.AtualizaIdDoClienteNoContrato.ExecutarArgs = [{ description: 'IdCliente', id: '2c9f52cd' }];
window.blockly.js.blockly.AtualizaIdDoClienteNoContrato.Executar = async function(IdCliente) {
 var clienteId;
  //
  this.cronapi.screen.changeValueOfField("Contrato.active.cliente", IdCliente);
}
