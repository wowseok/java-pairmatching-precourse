package pairmatching.service;

public class Service {
    private String functionKey = "";

    public String selectFunction(String input) {
        functionKey = input;
        return functionKey;
    }

    public void selectType(String functionKey) {
        if (functionKey == "1" || functionKey == "2") {

        }
        if (functionKey == "3") {

        }

        if (functionKey == "Q") {

        }
    }

    public int getFunctionKey() {
        return functionKey;
    }

}
