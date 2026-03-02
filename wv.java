import android.view.View;

final class wv extends kfu {
    final int a;
    final ww b;
    private boolean c;

    public wv(ww ww0, int v) {
        this.b = ww0;
        this.a = v;
        super();
        this.c = false;
    }

    @Override  // kfu
    public final void a(View view0) {
        if(!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }

    @Override  // kfu
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override  // kfu
    public final void c() {
        this.c = true;
    }
}

