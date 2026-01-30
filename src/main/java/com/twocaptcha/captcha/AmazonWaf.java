package com.twocaptcha.captcha;

public class AmazonWaf extends Captcha {

    public AmazonWaf() {
        super();
        params.put("method", "amazon_waf");
    }

    public void setSiteKey(String siteKey) {
        params.put("sitekey", siteKey);
    }

    public void setUrl(String url) {
        params.put("pageurl", url);
    }

    public void setIV(String iv) {
        params.put("iv", iv);
    }

    public void setContext(String context) {
        params.put("context", context);
    }

    public void setChallengeScript(String challengeScript) {
        params.put("challenge_script", challengeScript);
    }

    public void setCaptchaScript(String captchaScript) {
        params.put("captcha_script", captchaScript);
    }

    public void setHeaderAcao(Integer headerAcao) {
        params.put("header_acao", java.lang.String.valueOf(headerAcao));
    }
}
