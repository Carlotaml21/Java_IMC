package com.carlotaml21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class IMCAppTest {
    @Test
    public void testIMCApp() {
        System.setIn(new ByteArrayInputStream("70\n1.75\n".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IMCApp.main(null);

        assertTrue(output.toString().contains("IMC"));
    }
}
