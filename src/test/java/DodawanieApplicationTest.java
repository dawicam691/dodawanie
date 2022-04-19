import org.junit.Test;

import static org.junit.Assert.*;

public class DodawanieApplicationTest {
    @Test
    public void added(){
        DodawanieApplication dodawanieApplication = new DodawanieApplication();
        assertEquals(25, dodawanieApplication.added(5,5));
    }
}