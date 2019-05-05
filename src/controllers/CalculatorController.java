package controllers;

import models.CalculatorModel;
import views.CalculatorInterface;

import javax.script.ScriptException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorInterface calculatorInterface;
    private CalculatorModel calculatorModel;

    public CalculatorController(CalculatorModel pCalculatorModel, CalculatorInterface pCalculatorInterface){
        this.calculatorModel = pCalculatorModel;
        this.calculatorInterface = pCalculatorInterface;

        this.calculatorInterface.addCalculatorListeners(
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener(),
                new buttonNumberAndOperationsListener()
        );
    }

    class buttonNumberAndOperationsListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                String buttonClicked = calculatorInterface.getButtonValue(e.getActionCommand());

                if (calculatorModel.getResult().equals("Infinity")){
                    calculatorModel.setOperations("");
                    calculatorModel.setResult("");
                }

                    switch (buttonClicked){
                        case "=":
                            try {
                                calculatorInterface.setOperationsLabel(calculatorModel.calculate());
                            } catch (ScriptException ex) {
                                ex.printStackTrace();
                            }
                            break;
                        case "CE":
                            calculatorModel.resetOperation();
                            calculatorInterface.setOperationsLabel("0");
                            break;
                        default:
                            calculatorInterface.setOperationsLabel(calculatorModel.combineNumber(buttonClicked));
                            break;
                    }
        }
    }
}
