package pairmatching;

import pairmatching.controller.MainController;
import pairmatching.service.Service;
import pairmatching.view.OutputView;

public class Application {
    public static void main(String[] args) {
        MainController mainController = new MainController(new Service(), new OutputView());
        mainController.run();
    }
}
