final class fogs extends fogj {
    static final gfsi a;

    static {
        fogs.a = new fogs();
    }

    @Override  // fogj
    public final void a(egha egha0, foea foea0) {
        if(egha0.h() && !"null".equals(egha0.f())) {
            foea0.c = egha0.f();
        }
    }

    @Override  // fogj
    public final void b(egha egha0, foea foea0) {
        if(egha0.i() && !"null".equals(egha0.g())) {
            foea0.b = egha0.g();
        }
    }

    @Override  // fogj
    public final void c(egha egha0, foea foea0) {
        int v = 1;
        switch(egha0.q("is_dasher")) {
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 2;
            }
        }
        foea0.e(v);
    }
}

