package cz.sprinters.cb;

public class Output {
    private OutputType outputType;
    private String value;

    public Output(OutputType outputType, String value) {
        this.outputType = outputType;
        this.value = value;
    }

    public String formatOutput(String input) {
        String output = "";

        switch (outputType) {
            case TEMPLATE:
                output = String.format(value, input);
                break;
            default:
                output = value;
                break;
        }

        return output;
    }
}
