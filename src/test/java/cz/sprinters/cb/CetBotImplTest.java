package cz.sprinters.cb;

import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;


public class CetBotImplTest {
    @Test
    public void respond() throws Exception {
        final Input in = new Input(UUID.randomUUID(), "Nazdar");

        final String out = new CetBotImpl().respond(in);

        Assert.assertEquals("Ahoj", out);
    }

}
