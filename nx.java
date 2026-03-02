import android.view.View;

public final class nx implements kft {
    int a;
    final ny b;
    private boolean c;

    protected nx(ny ny0) {
        this.b = ny0;
        super();
        this.c = false;
    }

    @Override  // kft
    public final void a(View view0) {
        if(this.c) {
            return;
        }
        this.b.f = null;
        this.b.setVisibility(this.a);
    }

    @Override  // kft
    public final void b() {
        ny.e(this.b);
        this.c = false;
    }

    @Override  // kft
    public final void c() {
        this.c = true;
    }

    public final void d(kfs kfs0, int v) {
        this.b.f = kfs0;
        this.a = v;
    }
}

