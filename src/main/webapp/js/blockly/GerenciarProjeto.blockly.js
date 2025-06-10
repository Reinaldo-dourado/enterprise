window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GerenciarProjeto = window.blockly.js.blockly.GerenciarProjeto || {};

/**
 * @function Executar
 *
 *
 *
 * @param contratoID
 *
 * @author Reinaldo Dourado Santos
 * @since 03/06/2025, 13:58:26
 *
 */
window.blockly.js.blockly.GerenciarProjeto.ExecutarArgs = [{ description: 'contratoID', id: '29c216b7' }];
window.blockly.js.blockly.GerenciarProjeto.Executar = async function(contratoID) {

  //
  this.cronapi.screen.changeValueOfField("Projetos.active.contrato", contratoID);
}
