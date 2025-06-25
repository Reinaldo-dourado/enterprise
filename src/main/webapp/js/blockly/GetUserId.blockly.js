window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GetUserId = window.blockly.js.blockly.GetUserId || {};

/**
 * @function Executar
 *
 *
 *
 *
 * @author Reinaldo Dourado Santos
 * @since 20/06/2025, 10:24:27
 *
 */
window.blockly.js.blockly.GetUserId.ExecutarArgs = [];
window.blockly.js.blockly.GetUserId.Executar = async function() {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.UserManager:GetUserNormalized', async function(sender_item) {
      item = sender_item;
  }.bind(this));
  return item;
}
