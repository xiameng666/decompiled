import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class cpye extends cjtm {
    public final azxs a;
    private final fjtv b;

    public cpye(fjtv fjtv0, azxs azxs0, azug azug0) {
        super(0x98, "MaintenanceOperation", azug0);
        this.b = fjtv0;
        this.a = azxs0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmbu.t(this.b.m(), new cpyd(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

