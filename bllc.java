import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import java.util.UUID;

public final class bllc extends cjtm {
    private final UUID a;
    private final azxs b;
    private final StateUpdate c;

    public bllc(UUID uUID0, azxs azxs0, StateUpdate stateUpdate0, azug azug0) {
        super(180, "HeadlessHandleStateUpdate", azug0);
        this.a = uUID0;
        this.b = azxs0;
        this.c = stateUpdate0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        bmfr bmfr0 = bmfr.f(this.a);
        if(bmfr0 == null) {
            Status status0 = new Status(10);
            this.b.a(status0);
            return;
        }
        bmfr0.c(new com.google.android.gms.fido.u2f.api.StateUpdate(this.c.a(), this.c.e));
        this.b.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

