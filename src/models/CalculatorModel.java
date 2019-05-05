package models;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalculatorModel {
    private String result;
    private String operations;

    public CalculatorModel(){
        this.result = "";
        this.operations = "";
    }


    public String combineNumber(String clickButton){
        String combiningOperation = this.getOperations() ;
        combiningOperation += clickButton;
        this.setOperations(combiningOperation);
        return operations;
    }

    public String calculate() throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        this.setResult(engine.eval(operations).toString());
        this.setOperations(result);

        return result;
    }

    public String resetOperation(){
        this.setOperations("");
        return this.getOperations();
    }

    public String deleteLastOperation(){
        System.out.println(operations.substring(0, operations.length() - 1));
        this.setOperations(operations.substring(0, operations.length() - 1));
        return this.getOperations();
    }

//  GETTERS AND SETTERS
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }



}
