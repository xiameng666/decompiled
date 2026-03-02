import android.content.Context;
import androidx.core.widget.NestedScrollView;

public final class dvxr implements kij {
    public final dvxs a;
    public final Context b;

    public dvxr(dvxs dvxs0, Context context0) {
        this.a = dvxs0;
        this.b = context0;
    }

    @Override  // kij
    public final void a(NestedScrollView nestedScrollView0, int v, int v1) {
        Context context0 = this.b;
        if(context0 != null) {
            this.a.ah = v;
            this.a.aj = nestedScrollView0.canScrollVertically(1);
            this.a.z(context0, v, this.a.ag);
        }
    }
}

