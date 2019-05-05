import controllers.CalculatorController;
import models.CalculatorModel;
import views.CalculatorInterface;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        CalculatorInterface theView = new CalculatorInterface();
        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theModel,theView);



    }
}
