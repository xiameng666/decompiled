import android.app.Dialog;
import android.view.View;

final class dd extends ee {
    final ee a;
    final de b;

    public dd(de de0, ee ee0) {
        this.b = de0;
        this.a = ee0;
        super();
    }

    @Override  // ee
    public final View a(int v) {
        ee ee0 = this.a;
        if(ee0.b()) {
            return ee0.a(v);
        }
        Dialog dialog0 = this.b.c;
        return dialog0 == null ? null : dialog0.findViewById(v);
    }

    @Override  // ee
    public final boolean b() {
        return this.a.b() || this.b.d;
    }
}

