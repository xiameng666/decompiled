import android.content.Context;
import android.view.View;

final class ol extends nl {
    final oo d;

    public ol(oo oo0, Context context0, na na0, View view0) {
        this.d = oo0;
        super(context0, na0, view0, true);
        this.b = 0x800005;
        this.e(oo0.o);
    }

    @Override  // nl
    protected final void c() {
        oo oo0 = this.d;
        na na0 = oo0.c;
        if(na0 != null) {
            na0.close();
        }
        oo0.l = null;
        super.c();
    }
}

