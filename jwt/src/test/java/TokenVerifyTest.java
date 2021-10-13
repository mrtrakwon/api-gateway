import com.mrtrakwon.token.AccessToken;
import com.mrtrakwon.token.TokenGenerator;
import com.mrtrakwon.token.TokenVerifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.util.HashMap;
import java.util.Map;

public class TokenVerifyTest {

    private String secretKey;
    private Map<String, Object> claims;

    @BeforeEach
    public void setup() {
        this.secretKey = "MY_REAL_TRIP_rakwon.seong@myrealtrip.com";
        this.claims = new HashMap<>(){{
            put("sub", "auth");
            put("iss", "rakwon");
        }};

    }

    @Test
    public void 액세스_토큰_검증_통과_테스트() {
        //given
        TokenGenerator tokenGenerator = new TokenGenerator(this.secretKey);
        final AccessToken accessToken = tokenGenerator.generateAccessToken(this.claims);

        //when
        TokenVerifier tokenVerifier = new TokenVerifier(this.secretKey);
        tokenVerifier.verify(accessToken);

        //then

    }
}
