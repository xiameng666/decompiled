import android.content.Intent;
import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;

final class ffgb extends ffgn {
    final NodeParcelable a;
    final fdxn b;

    public ffgb(ffgc ffgc0, Intent intent0, NodeParcelable nodeParcelable0, fdxn fdxn0) {
        this.a = nodeParcelable0;
        this.b = fdxn0;
        Objects.requireNonNull(ffgc0);
        super("onPeerDisconnected", intent0);
    }

    @Override  // ffgn
    public final String a() {
        return this.b.a;
    }

    @Override  // ffgn
    public final void b(fffu fffu0, fdjb fdjb0) {
        fdjb0.m(this.a);
    }

    @Override  // ffgn
    public final boolean c() {
        return false;
    }
}

