package pairmatching.controller;

import domain.course.Course;
import pairmatching.service.Service;
import pairmatching.util.FileReader;
import pairmatching.util.StringParser;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class MainController {
    private final OutputView outputView;
    private final Service service;

    public MainController(Service service, OutputView outputView) {
        this.service = service;
        this.outputView = outputView;
    }

    public void run() {
        process(this::setUpCrews);
        process(this::inputFunction);
    }

    private void inputFunction() {
        outputView.printIntroMessage();
        service.selectFunction(InputView.readLine());
        outputView.printMatchingMessage();
        service.selectType(InputView.readLine());
    }

    private void setUpCrews() {
        StringParser.parseFileContent(Course.BACKEND,
                FileReader.readFileToString("src/main/resources/backend-crew.md"));
        StringParser.parseFileContent(Course.FRONTEND,
                FileReader.readFileToString("src/main/resources/frontend-crew.md"));
    }


    private void process(Runnable action) {
        try {
            action.run();
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e);
            process(action);
        }
    }
}
