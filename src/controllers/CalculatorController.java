package controllers;

import models.CalculatorModel;
import views.CalculatorInterface;

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
                new buttonNumberAndOperationsListener()
        );
    }

    class buttonNumberAndOperationsListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                String buttonClicked = calculatorInterface.getButtonValue(e.getActionCommand());
                switch (buttonClicked){
                    case "Calcul":
                        calculatorModel.calculate();
                        break;
                    default:
                        calculatorModel.combineNumber(buttonClicked);
                        break;
                }


        }
    }
}
