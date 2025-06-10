window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GerenciarContrato = window.blockly.js.blockly.GerenciarContrato || {};

/**
 * @function Executar
 *
 *
 *
 * @param ClienteId
 *
 * @author Reinaldo Dourado Santos
 * @since 05/06/2025, 10:14:21
 *
 */
window.blockly.js.blockly.GerenciarContrato.ExecutarArgs = [{ description: 'ClienteId', id: '1730f740' }];
window.blockly.js.blockly.GerenciarContrato.Executar = async function(ClienteId) {

  //
  this.cronapi.screen.changeValueOfField("Contrato.active.cliente", ClienteId);
}
