import org.example.volunteers.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testParse {

    @Test
    public void testParseTel(){
        String telTest = "+33085552814";
        String telObtenu = Utils.conversionTel("telTest");
        assertEquals("085552814", telObtenu);
    }
}
