import android.content.Context;
import androidx.core.widget.NestedScrollView;

public final class dvvj implements kij {
    public final Context a;

    public dvvj(Context context0) {
        this.a = context0;
    }

    @Override  // kij
    public final void a(NestedScrollView nestedScrollView0, int v, int v1) {
        Context context0 = this.a;
        if(context0 != null) {
            int v2 = v == 0 ? fipw.a.a(context0) : fipw.c.a(context0);
            ((xob)context0).getWindow().setStatusBarColor(v2);
        }
    }
}

