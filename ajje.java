import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class ajje {
    public static final cllc a;
    public final baun b;
    private final Context c;

    static {
        ajje.a = cllb.a(0, ((int)TimeUnit.MILLISECONDS.toSeconds(hpta.d())), ((int)TimeUnit.MILLISECONDS.toSeconds(hpta.e())));
    }

    public ajje(Context context0) {
        this.b = new baun(new String[]{"EnrollmentScheduler"}, null);
        this.c = context0;
    }

    public final void a(String s, long v, long v1, cllc cllc0) {
        this.b.d("scheduleServerDirective with server : start=%d, end=%d", new Object[]{v, v1});
        this.b("ClientDirectiveTag_" + s, s, cllc0, v, v1, true);
    }

    public final void b(String s, String s1, cllc cllc0, long v, long v1, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("account", s1);
        ajfl.a(this.c, "com.google.android.gms.auth.cryptauth.register.ReEnrollmentService", s, cllc0, v, v1, bundle0, z);
    }
}

