package pairmatching.controller;

import domain.course.Course;
import domain.crew.Crew;
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
        process(this::selectFunction);
        process(this::selectProgram);
        process(this::pairMatchingResult);
    }

    private void selectFunction() {
        outputView.printIntroMessage();
        String functionKey = service.selectFunction(InputView.readLine());
    }

    private void selectProgram() {

        outputView.printMatchingMessage();
        service.selectType(service.getFunctionKey());
    }

    private void pairMatchingResult() {
        Crew.PairMatching(Course.BACKEND);
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
