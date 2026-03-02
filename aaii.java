import android.view.MenuItem;

public final class aaii implements fyqb {
    public final aaiu a;
    public final aaox b;

    public aaii(aaiu aaiu0, aaox aaox0) {
        this.a = aaiu0;
        this.b = aaox0;
    }

    @Override  // fyqb
    public final void a(MenuItem menuItem0) {
        aaiu aaiu0 = this.a;
        int v = gggq.a(aaiu0.aj, new aaik(menuItem0));
        if(v == -1) {
            aaiu0.a.c(((grxw)this.b.c.get(Integer.valueOf(((nd)menuItem0).a))), 3);
            return;
        }
        aaiu0.ag.i(v);
    }
}

