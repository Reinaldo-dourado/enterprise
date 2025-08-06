window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.PreencheIdProjetonaOS = window.blockly.js.blockly.PreencheIdProjetonaOS || {};

/**
 * @function PreencheIdProjetonaOS
 *
 *
 *
 * @param ProjetoId
 *
 * @author Reinaldo Dourado Santos
 * @since 31/07/2025, 16:42:12
 *
 */
window.blockly.js.blockly.PreencheIdProjetonaOS.PreencheIdProjetonaOSArgs = [{ description: 'ProjetoId', id: 'b33548e5' }];
window.blockly.js.blockly.PreencheIdProjetonaOS.PreencheIdProjetonaOS = async function(ProjetoId) {

  //
  this.cronapi.screen.changeValueOfField("OrdemDeServicos.active.projetos", this.cronapi.screen.getValueOfField("params.ProjetoId"));
}
