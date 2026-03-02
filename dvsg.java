import j..util.Objects;

final class dvsg extends ednu {
    final dvsn a;

    public dvsg(dvsn dvsn0) {
        Objects.requireNonNull(dvsn0);
        this.a = dvsn0;
        super();
    }

    @Override  // ednu
    public final void a(int v, CharSequence charSequence0) {
        ((ggtj)dvsn.a.i()).H("Authentication error. Error code: %s Error message: %s", v, charSequence0);
        if(v == 2) {
            return;
        }
        dvsn.T(this.a);
        this.a.E();
    }

    @Override  // ednu
    public final void b() {
        ((ggtj)dvsn.a.h()).x("Failed to authenticate user.");
    }

    @Override  // ednu
    public final void c() {
        xob xob0 = this.a.an();
        if(xob0 != null && !xob0.isFinishing()) {
            xob0.runOnUiThread(new dvsf(this));
            return;
        }
        ((ggtj)dvsn.a.h()).x("Activity finished already.");
    }
}

