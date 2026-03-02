import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class cpxl extends cjtm {
    public final fjtv a;
    public final boolean b;
    public final fkbg c;
    public final azxs d;
    public static final int e;

    public cpxl(fjtv fjtv0, boolean z, fkbg fkbg0, azxs azxs0, azug azug0) {
        super(0x98, "DownloadPendingGroupsOperation", azug0);
        this.a = fjtv0;
        this.b = z;
        this.c = fkbg0;
        this.d = azxs0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmcd gmcd0 = this.a.i();
        gmbu.t(glzd.g(gmcd0, new cpxh(this), gmap.a), new cpxj(this, gmcd0, context0), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(status0);
    }
}

