import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class SampleTestCase {

    User user;

    @Before
    public void setUp(){
        RestTemplate restTemplate = new RestTemplate();
        user = restTemplate.getForObject("https://api.github.com/users/dreamofgut", User.class);
    }

    @Test
    public void testUserInfoResponse(){
        assertTrue(user.getHtml_url().contains("Dreamofgut"));
    }

}
