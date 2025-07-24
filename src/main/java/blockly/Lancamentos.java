package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Lancamentos {

public static final int TIMEOUT = 300;

/**
 *
 * @param TimeSheet<app.entity.TimeSheetOS>
 *
 * @author Reinaldo Dourado Santos
 * @since 23/07/2025, 15:14:16
 *
 */
public static Var NovoLancamento(@ParamMetaData(description = "TimeSheet", id = "e7048a95") @RequestBody(required = false) Var TimeSheet) throws Exception {
 return new Callable<Var>() {

   private Var retorno = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(TimeSheet.getObjectAsString());
    retorno =
    cronapi.database.Operations.insert(Var.valueOf("app.entity.TimeSheetOS"),TimeSheet);
    if (
    cronapi.logic.Operations.isNullOrEmpty(retorno).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Não foi possível inserir o timesheet.")));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

