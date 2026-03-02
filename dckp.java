import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;

public final class dckp implements evqf {
    public final dcks a;
    public final ShareTarget b;
    public final int c;

    public dckp(dcks dcks0, ShareTarget shareTarget0, int v) {
        this.a = dcks0;
        this.b = shareTarget0;
        this.c = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        List list0 = (List)object0;
        dcvz.a.b().i("Displaying \'incoming file complete\' notification for ShareTarget: %s with %d actions.", Long.valueOf(this.b.a), Integer.valueOf(list0.size()));
        this.a.a.l(this.b, list0, this.c);
    }
}

