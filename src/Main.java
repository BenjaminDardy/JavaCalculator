import controllers.CalculatorController;
import models.CalculatorModel;
import views.CalculatorInterface;

public class Main {

    public static void main(String[] args)  {

        CalculatorInterface theView = new CalculatorInterface();
        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theModel,theView);



    }
}
