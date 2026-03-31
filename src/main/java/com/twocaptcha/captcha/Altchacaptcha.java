package com.twocaptcha.captcha;

public class Altchacaptcha extends Captcha {

    public Altchacaptcha() {
        super();
        params.put("method", "altcha");
    }

    public void setChallengeUrl(String challengeUrl) {
        params.put("challenge_url", challengeUrl);
    }

    public void setPageUrl(String pageurl) {
        params.put("pageurl", pageurl);
    }

    public void setChallengeJson(String challengeJson) {
        params.put("challenge_json", challengeJson);
    }
}
