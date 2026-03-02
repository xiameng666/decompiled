import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class ajfl {
    private static final baun a;

    static {
        ajfl.a = new baun(new String[]{"CryptauthServiceScheduling"}, null);
    }

    public static void a(Context context0, String s, String s1, cllc cllc0, long v, long v1, Bundle bundle0, boolean z) {
        if(s1.length() > 100) {
            ajfl.a.f("Tag length=%d exceeds max possible length=%d. Cryptauth reschedule may be broken on this account", new Object[]{s1.length(), ((int)100)});
            s1 = s1.substring(0, 100);
        }
        clkn clkn0 = new clkn();
        clkn0.e(TimeUnit.MILLISECONDS.toSeconds(v), TimeUnit.MILLISECONDS.toSeconds(v1));
        clkn0.t(s1);
        clkn0.u = bundle0;
        clkn0.j = s;
        clkn0.x(0, 1);
        clkn0.t = cllc0;
        clkn0.p = true;
        clkn0.g(0);
        clkn0.u(z);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

