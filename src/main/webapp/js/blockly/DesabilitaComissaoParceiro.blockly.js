window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.DesabilitaComissaoParceiro = window.blockly.js.blockly.DesabilitaComissaoParceiro || {};

/**
 * @function Executar
 *
 *
 *
 * @param valorPercent
 *
 * @author Reinaldo Dourado Santos
 * @since 05/06/2025, 14:20:02
 *
 */
window.blockly.js.blockly.DesabilitaComissaoParceiro.ExecutarArgs = [{ description: 'valorPercent', id: '8176cce7' }];
window.blockly.js.blockly.DesabilitaComissaoParceiro.Executar = async function(valorPercent) {
 var clienteId;
  //
  if (!this.cronapi.logic.isNullOrEmpty(valorPercent)) {
    //
    this.cronapi.screen.hideComponent("textinput-modal-comissaoParceiro");
  }
  //
  if (this.cronapi.logic.isNullOrEmpty(valorPercent)) {
    //
    this.cronapi.screen.showComponent("textinput-modal-comissaoParceiro");
  }
}
