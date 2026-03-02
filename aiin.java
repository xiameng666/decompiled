import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;

final class aiin implements azuk {
    final aiiq a;

    public aiin(aiiq aiiq0) {
        Objects.requireNonNull(aiiq0);
        this.a = aiiq0;
        super();
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        for(Object object0: ((fdke)azuj0).a) {
            NodeParcelable nodeParcelable0 = (NodeParcelable)object0;
            aiiq aiiq0 = this.a;
            if(!aiiq0.g || nodeParcelable0.d) {
                aiiq0.i.a(aiiq0.c, nodeParcelable0.a, aiiq0.f, aiiq0.h).e(new aiio(aiiq0, aiiq0.f, nodeParcelable0));
            }
        }
    }
}

