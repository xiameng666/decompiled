import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ahzp implements aiah {
    private static final baun a;
    private static final Pattern b;
    private static final Pattern c;
    private final Pattern d;

    static {
        ahzp.a = new baun("OtpMessageDetector");
        ahzp.b = Pattern.compile("(^|[\\s:;!\\.,\\\"\'\\(]|[a-zA-Z]-|[^\\u0000-\\u007F])(?=[a-zA-Z]*[0-9]+)([a-zA-Z0-9]{4,10})($|[\\s:;!\\.,\\\"\'\\)]|[^\\u0000-\\u007F])");
        ahzp.c = Pattern.compile("(^|[\\s:;!\\.,\\\"\'\\(\\[]|[a-zA-Z]-|[^\\u0000-\\u007F])(?=[a-zA-Z]*[0-9]+)([a-zA-Z0-9]{4,10})($|[\\s:;!\\.,\\\"\'\\)\\]]|[^\\u0000-\\u007F])");
    }

    public ahzp() {
        this.d = Pattern.compile(hppk.a.c().d());
    }

    @Override  // aiah
    public final gged_interceptors a(String s) {
        Matcher matcher0;
        if(TextUtils.isEmpty(s)) {
            ahzp.a.m("Message body is empty.", new Object[0]);
            return ggna.a;
        }
        ggdy ggdy0 = new ggdy();
        if(hppk.g()) {
            matcher0 = this.d.matcher(s);
        }
        else {
            matcher0 = hpph.a.b().b() ? ahzp.c.matcher(s) : ahzp.b.matcher(s);
        }
        while(matcher0.find()) {
            String s1 = matcher0.group(2);
            if(s1 != null) {
                ahzp.a.d("Found OTP: %s", new Object[]{s1});
                ggdy0.i(s1);
            }
        }
        return ggdy0.h();
    }
}

