import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContactTest {

    @BeforeAll
    public static void preTest() {
        System.out.println("Tests started");
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Test start");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete");
    }

    @Test
    public void isClass() {
        Contact sut = new Contact("Oleg", "M.", "+7-903-111-22-33");
        assertThat(sut, instanceOf(Contact.class));
    }
}
