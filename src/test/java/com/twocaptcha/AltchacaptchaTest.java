package com.twocaptcha;

import com.twocaptcha.captcha.Altchacaptcha;

import java.util.HashMap;
import java.util.Map;

public class AltchacaptchaTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        Altchacaptcha captcha = new Altchacaptcha();
        captcha.setChallengeUrl("https://.../captcha/api/altcha/challenge");
        captcha.setPageUrl("https://site.com/");

        Map<String, String> params = new HashMap<>();
        params.put("method", "altcha");
        params.put("pageurl", "https://site.com/");
        params.put("challenge_url","https://.../captcha/api/altcha/challenge");
        params.put("soft_id", "4581");
        params.put("json", "0");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}