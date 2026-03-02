import android.content.Context;
import androidx.core.widget.NestedScrollView;

public final class dvxq implements kij {
    public final dvxs a;
    public final Context b;

    public dvxq(dvxs dvxs0, Context context0) {
        this.a = dvxs0;
        this.b = context0;
    }

    @Override  // kij
    public final void a(NestedScrollView nestedScrollView0, int v, int v1) {
        Context context0 = this.b;
        if(context0 != null) {
            this.a.ag = v;
            this.a.ai = nestedScrollView0.canScrollVertically(1);
            this.a.z(context0, v, this.a.ah);
        }
    }
}

