import j..util.Objects;

final class dvxe extends ednu {
    final dvxj a;

    public dvxe(dvxj dvxj0) {
        Objects.requireNonNull(dvxj0);
        this.a = dvxj0;
        super();
    }

    @Override  // ednu
    public final void a(int v, CharSequence charSequence0) {
        ((ggtj)dvxj.a.i()).H("Authentication error. Error code: %s Error message: %s", v, charSequence0);
        if(v == 2) {
            return;
        }
        dvxj.W(this.a);
        this.a.I();
    }

    @Override  // ednu
    public final void b() {
        ((ggtj)dvxj.a.h()).x("Failed to authenticate user.");
    }

    @Override  // ednu
    public final void c() {
        xob xob0 = this.a.an();
        if(xob0 != null && !xob0.isFinishing()) {
            xob0.runOnUiThread(new dvxd(this));
            return;
        }
        ((ggtj)dvxj.a.h()).x("Activity finished already.");
    }
}

