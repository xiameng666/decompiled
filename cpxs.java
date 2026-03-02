import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class cpxs extends cjtm {
    public final fjtv a;
    public final cpwx b;
    public final azxs c;

    public cpxs(fjtv fjtv0, cpwx cpwx0, azxs azxs0, azug azug0) {
        super(0x98, "HandleFlagChangeOperation", azug0);
        this.b = cpwx0;
        this.a = fjtv0;
        this.c = azxs0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmcd gmcd0 = gmbu.i(null);
        if(huck.c()) {
            gmcd0 = glzd.g(gmcd0, new cpxp(this), gmap.a);
        }
        gmbu.t(glzd.g(gmcd0, new cpxq(this), gmap.a), new cpxr(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0);
    }
}

