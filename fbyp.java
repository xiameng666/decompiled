import j..util.Objects;

final class fbyp extends fbnw {
    final fbyr a;

    public fbyp(fbyr fbyr0) {
        Objects.requireNonNull(fbyr0);
        this.a = fbyr0;
        super();
    }

    @Override  // fbnw
    public final void L(hcho hcho0) {
        hchp hchp0;
        getf getf0;
        gete gete0;
        getj getj0 = null;
        if((hcho0.b & 2) == 0) {
            gete0 = null;
        }
        else {
            gete0 = hcho0.d == null ? gete.c : hcho0.d;
        }
        hcdu hcdu0 = hcdu.b;
        if((hcho0.b & 4) == 0) {
            getf0 = null;
        }
        else {
            getf0 = hcho0.e == null ? getf.a : hcho0.e;
        }
        if((hcho0.b & 8) == 0) {
            hchp0 = null;
        }
        else {
            hchp0 = hcho0.f == null ? hchp.a : hcho0.f;
        }
        hfuo hfuo0 = hcho0.g;
        if((hcho0.b & 1) != 0) {
            getj0 = hcho0.c;
            if(getj0 == null) {
                getj0 = getj.a;
            }
        }
        this.a.ac(gete0, hcdu0, getf0, hchp0, hfuo0, getj0, true, "onInitializeResponse");
    }

    @Override  // fbnw
    public final void O(hchs hchs0) {
        hchp hchp0;
        getf getf0;
        gete gete0 = hchs0.c == null ? gete.c : hchs0.c;
        hcdu hcdu0 = hcdu.b(hchs0.h) == null ? hcdu.a : hcdu.b(hchs0.h);
        getj getj0 = null;
        if((hchs0.b & 4) == 0) {
            getf0 = null;
        }
        else {
            getf0 = hchs0.e == null ? getf.a : hchs0.e;
        }
        if((hchs0.b & 8) == 0) {
            hchp0 = null;
        }
        else {
            hchp0 = hchs0.f == null ? hchp.a : hchs0.f;
        }
        hfuo hfuo0 = hchs0.g;
        if((hchs0.b & 2) != 0) {
            getj0 = hchs0.d;
            if(getj0 == null) {
                getj0 = getj.a;
            }
        }
        this.a.ac(gete0, hcdu0, getf0, hchp0, hfuo0, getj0, false, "onSubmitResponse");
    }

    @Override  // fbnw
    public final void b() {
        this.a.bS(22);
        this.a.bO(-1);
    }

    @Override  // fbnw
    public final void c() {
        this.a.bS(20);
        this.a.bO(-1);
    }

    @Override  // fbnw
    public final void f() {
        this.a.bS(21);
        this.a.lC();
    }
}

