package examples;

import com.twocaptcha.TwoCaptcha;
import com.twocaptcha.captcha.Altchacaptcha;

public class AltchaCaptchaExample {

    public static void main(String[] args) {
        TwoCaptcha solver = new TwoCaptcha(args[0]);

        Altchacaptcha captcha = new Altchacaptcha();
        captcha.setChallengeUrl("https://.../captcha/api/altcha/challenge");
        captcha.setPageUrl("https://site.com/");

        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
