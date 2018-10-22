package cz.sprinters.cb;

import java.util.List;

public class CetBotImpl implements CetBot {

    @Override
    public String respond(Input input) {

        final String formattedInput = new InputFormatting().format(input.getValue());

        List<Output> outputs = new Replies().getReply(formattedInput);

        // Kontextova Knihovna

        final Output output = outputs.get(0);

        return output.formatOutput(input.getValue());
    }
}
