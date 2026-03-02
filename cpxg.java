import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

public final class cpxg extends cjtm {
    public final cpws a;
    public final OverrideFileGroupRequest b;
    public final azxs c;
    private final fjtv d;

    public cpxg(fjtv fjtv0, cpws cpws0, OverrideFileGroupRequest overrideFileGroupRequest0, azxs azxs0, azug azug0) {
        super(0x98, "DiagnosticsOverrideOperation", azug0);
        this.d = fjtv0;
        this.a = cpws0;
        this.b = overrideFileGroupRequest0;
        this.c = azxs0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmbu.t(this.d.l(), new cpxf(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0);
    }
}

