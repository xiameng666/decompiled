import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;

final class aiio implements azuk {
    final String a;
    final NodeParcelable b;

    public aiio(aiiq aiiq0, String s, NodeParcelable nodeParcelable0) {
        this.a = s;
        this.b = nodeParcelable0;
        Objects.requireNonNull(aiiq0);
        super();
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        int v = ((fdjn)azuj0).a.i;
        if(v != 0) {
            ((ggtj)aiiq.a.j()).X("Sending message failed. Path: %s, Node: %s, Status code: %d", this.a, this.b.a, Integer.valueOf(v));
        }
    }
}

