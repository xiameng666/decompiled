import com.google.android.gms.wearable.internal.NodeParcelable;

public final class aiil implements evqf {
    public final String a;
    public final NodeParcelable b;

    public aiil(String s, NodeParcelable nodeParcelable0) {
        this.a = s;
        this.b = nodeParcelable0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        aiiq.j.h("Sending message succeeded. Path: %s, Node: %s, ID: %d", new Object[]{this.a, this.b.a, ((Integer)object0)});
    }
}

