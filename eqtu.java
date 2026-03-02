import android.content.Context;
import java.util.List;

public final class eqtu {
    public static final erqc a;
    public final epwe b;
    private final Context c;
    private final gmcg d;

    static {
        eqtu.a = new erqc(new String[]{"SmartDeviceBufferedLogs"});
    }

    public eqtu(Context context0, epwe epwe0) {
        this.c = context0;
        this.b = epwe0;
        this.d = new bblp(1, 9);
    }

    public final gmcd a(gakj gakj0, String s) {
        eqtv eqtv0 = new eqtv(this.c, s);
        List list0 = gakj0.c("/auth_consent_clearcut_logs/" + s);
        if(list0 != null && !list0.isEmpty()) {
            return this.d.e(new eqtt(this, eqtv0, "/auth_consent_clearcut_logs/" + s, s, list0.size()));
        }
        eqtu.a.m("No buffered logs for source %s after SUW is complete", new Object[]{s});
        return gmbu.i(Integer.valueOf(0));
    }
}

