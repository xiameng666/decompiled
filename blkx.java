import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public final class blkx extends cjtm {
    private final bmnx a;
    private final RequestOptions b;
    private final String c;
    private final boolean d;
    private final bnaf e;

    public blkx(bmnx bmnx0, RequestOptions requestOptions0, String s, boolean z, bnaf bnaf0, azug azug0) {
        super(0x94, "InitiateFidoSecurityKeyOnlyFlow", azug0);
        this.a = bmnx0;
        this.b = requestOptions0;
        this.c = s;
        this.d = z;
        this.e = bnaf0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gfsx gfsx0 = gfsx.m(this.c);
        PendingIntent pendingIntent0 = blyo.c(context0, this.e, this.b, gfsx0, gfqx.a, gfqx.a, this.d);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.a.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

