package cz.sprinters.cb;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Replies {
    private final Map<String, List<Output>> replies;

    public Replies() {
        replies = Collections.unmodifiableMap(new HashMap<String, List<Output>>() {

        });
    }

    public List<Output> getReply(String input) {
        return replies.get(input);
    }
}
