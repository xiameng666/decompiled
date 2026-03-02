import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StartRestoreSessionRequest;

public final class ffgz implements fflt {
    public final fflv a;
    public final StartRestoreSessionRequest b;
    public final fdiy c;

    public ffgz(fflv fflv0, StartRestoreSessionRequest startRestoreSessionRequest0, fdiy fdiy0) {
        this.a = fflv0;
        this.b = startRestoreSessionRequest0;
        this.c = fdiy0;
    }

    @Override  // fflt
    public final void a() {
        fcmj fcmj0 = this.a.E;
        batl.s(fcmj0);
        String s = this.b.a;
        if(hzyp.g()) {
            ((fcly)fcmj0.d).b.f(fcmj0, "/restore/restore_finished", s);
        }
        Status status0 = new Status(0);
        this.c.a(status0);
    }
}

