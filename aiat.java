import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aiat implements aiah {
    private static final bboh a;
    private static final Pattern b;
    private final Pattern c;

    static {
        aiat.a = bboh.a("WebOtpMessageDetector");
        aiat.b = Pattern.compile("^[^@]*(@\\S+.*#\\S+.*)\\n*\\z", 8);
    }

    public aiat() {
        this.c = Pattern.compile(hpqd.a.b().b(), 8);
    }

    @Override  // aiah
    public final gged_interceptors a(String s) {
        if(TextUtils.isEmpty(s)) {
            ((ggtj)aiat.a.h()).x("Message body is empty.");
            return ggna.a;
        }
        ggdy ggdy0 = new ggdy();
        Matcher matcher0 = hppk.g() ? this.c.matcher(s) : aiat.b.matcher(s);
        while(matcher0.find()) {
            String s1 = matcher0.group(1);
            if(s1 != null) {
                ggdy0.i(s1);
            }
        }
        return ggdy0.h();
    }
}

