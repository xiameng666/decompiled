import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class cpxe extends cjtm {
    public final azxs a;
    private final cpwx b;

    public cpxe(cpwx cpwx0, azxs azxs0, azug azug0) {
        super(0x98, "AddConfigsForDownloadOperation", azug0);
        this.b = cpwx0;
        this.a = azxs0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmbu.t((huck.c() ? this.b.a() : gmbu.i(null)), new cpxd(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

