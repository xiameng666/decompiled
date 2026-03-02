import android.content.Context;
import android.view.View;

public final class oh extends nl {
    final oo d;

    public oh(oo oo0, Context context0, nv nv0, View view0) {
        this.d = oo0;
        super(context0, nv0, view0, false);
        if(!nv0.m.o()) {
            View view1 = oo0.h;
            if(view1 == null) {
                view1 = (View)oo0.f;
            }
            this.a = view1;
        }
        this.e(oo0.o);
    }

    @Override  // nl
    protected final void c() {
        this.d.m = null;
        this.d.p = 0;
        super.c();
    }
}

