window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Atualizavalor = window.blockly.js.blockly.Atualizavalor || {};

/**
 * @function Executar
 *
 *
 *
 * @param ClienteId
 *
 * @author Reinaldo Dourado Santos
 * @since 11/06/2025, 16:45:28
 *
 */
window.blockly.js.blockly.Atualizavalor.ExecutarArgs = [{ description: 'ClienteId', id: '46465251' }];
window.blockly.js.blockly.Atualizavalor.Executar = async function(ClienteId) {
 var GetClienteId;
  //
  GetClienteId = ClienteId;
  //
  if (!this.cronapi.logic.isNull(GetClienteId)) {
    //
    this.cronapi.screen.refreshDatasource("Contrato", 'true');
  }
  //
  this.cronapi.screen.createDefaultModal('Entrou aqui, é nula', GetClienteId, '', '', async function() {
    }.bind(this), async function() {
    }.bind(this), async function() {
    }.bind(this));
  return ClienteId;
}
