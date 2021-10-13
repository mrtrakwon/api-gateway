import com.mrtrakwon.token.AccessToken;
import com.mrtrakwon.token.RefreshToken;
import com.mrtrakwon.token.TokenGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.*;

public class TokenGeneratorTest {

    private String secretKey;

    @BeforeEach
    public void setup() {
        this.secretKey = "MY_REAL_TRIP_rakwon.seong@myrealtrip.com";
    }


    @Test
    @DisplayName("액세스_토큰_생성_테스트")
    public void 엑세스_토큰_생성_테스트() {

        // given
        TokenGenerator tokenGenerator = new TokenGenerator(this.secretKey);
        Map<String, Object> claims = new HashMap<>(){{
            put("sub", "auth");
            put("iss", "rakwon");
        }};

        //when
        final AccessToken accessToken = tokenGenerator.generateAccessToken(claims);

        //then
        assertThat(accessToken, notNullValue());
        System.out.println(accessToken);
    }

    @Test
    @DisplayName("리프레시_토큰_생성_테스트")
    public void 리프레시_토큰_생성_테스트() {
        // given
        TokenGenerator tokenGenerator = new TokenGenerator(this.secretKey);
        Map<String, Object> claims = new HashMap<>(){{
            put("sub", "auth");
            put("iss", "rakwon");
        }};

        //when
        final RefreshToken refreshToken = tokenGenerator.generateRefreshToken(claims);

        //then
        assertThat(refreshToken, notNullValue());
        System.out.println(refreshToken);
    }
}
