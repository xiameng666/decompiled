import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.SaveRestoreStateRequest;

public final class ffgq implements fflt {
    public final fflv a;
    public final SaveRestoreStateRequest b;
    public final fdiy c;

    public ffgq(fflv fflv0, SaveRestoreStateRequest saveRestoreStateRequest0, fdiy fdiy0) {
        this.a = fflv0;
        this.b = saveRestoreStateRequest0;
        this.c = fdiy0;
    }

    @Override  // fflt
    public final void a() {
        batl.s(this.a.E);
        Integer integer0 = (int)this.b.b;
        fcmj.a.j("Save restore state, node id %s, state %d", new Object[]{this.b.a, integer0});
        gftb.check(this.b.a);
        gftb.check(this.b.c);
        this.a.E.f.put(this.b.a, integer0);
        this.a.E.g.put(this.b.a, this.b.c);
        Status status0 = new Status(0);
        this.c.a(status0);
    }
}

