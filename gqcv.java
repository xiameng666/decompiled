import java.util.ArrayDeque;

public final class gqcv extends gqad {
    static final gqcv a;

    static {
        gqcv.a = new gqcv();
    }

    @Override  // gqad
    public final Object a(gqff gqff0) {
        return this.c(gqff0);
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        this.e(gqfh0, ((gpzq)object0));
    }

    public final gpzq c(gqff gqff0) {
        int v = gqff0.u();
        gpzq gpzq0 = gqcv.g(gqff0, v);
        if(gpzq0 == null) {
            return gqcv.f(gqff0, v);
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        while(true) {
            if(gqff0.s()) {
                String s = (gpzq0 instanceof gpzt) ? gqff0.h() : null;
                int v1 = gqff0.u();
                gpzq gpzq1 = gqcv.g(gqff0, v1);
                gpzq gpzq2 = gpzq1 == null ? gqcv.f(gqff0, v1) : gpzq1;
                if((gpzq0 instanceof gpzo)) {
                    ((gpzo)gpzq0).e(gpzq2);
                }
                else {
                    ((gpzt)gpzq0).k(s, gpzq2);
                }
                if(gpzq1 == null) {
                    continue;
                }
                arrayDeque0.addLast(gpzq0);
                gpzq0 = gpzq2;
            }
            else {
                if((gpzq0 instanceof gpzo)) {
                    gqff0.n();
                }
                else {
                    gqff0.o();
                }
                if(arrayDeque0.isEmpty()) {
                    break;
                }
                gpzq0 = (gpzq)arrayDeque0.removeLast();
            }
        }
        return gpzq0;
    }

    public final void e(gqfh gqfh0, gpzq gpzq0) {
        if(gpzq0 != null && !(gpzq0 instanceof gpzs)) {
            if((gpzq0 instanceof gpzw)) {
                gpzw gpzw0 = gpzq0.j();
                if(gpzw0.l()) {
                    gqfh0.l(gpzw0.c());
                    return;
                }
                if(gpzw0.k()) {
                    gqfh0.n(gpzw0.g());
                    return;
                }
                gqfh0.m(gpzw0.d());
                return;
            }
            if((gpzq0 instanceof gpzo)) {
                gqfh0.e();
                for(Object object0: gpzq0.h()) {
                    this.e(gqfh0, ((gpzq)object0));
                }
                gqfh0.g();
                return;
            }
            if(!(gpzq0 instanceof gpzt)) {
                throw new IllegalArgumentException("Couldn\'t write " + gpzq0.getClass());
            }
            gqfh0.f();
            gqbn gqbn0 = new gqbn(((gqbo)gpzq0.i().f()));
            while(gqbn0.hasNext()) {
                gqbs gqbs0 = gqbn0.a();
                gqfh0.i(((String)gqbs0.f));
                this.e(gqfh0, ((gpzq)gqbs0.h));
            }
            gqfh0.h();
            return;
        }
        gqfh0.j();
    }

    private static final gpzq f(gqff gqff0, int v) {
        switch(v - 1) {
            case 5: {
                return new gpzw(gqff0.j());
            }
            case 6: {
                return new gpzw(new gqbl(gqff0.j()));
            }
            case 7: {
                return new gpzw(Boolean.valueOf(gqff0.t()));
            }
            case 8: {
                gqff0.p();
                return gpzs.a;
            }
            default: {
                throw new IllegalStateException("Unexpected token: " + gqfg.a(v));
            }
        }
    }

    private static final gpzq g(gqff gqff0, int v) {
        switch(v - 1) {
            case 0: {
                gqff0.l();
                return new gpzo();
            }
            case 2: {
                gqff0.m();
                return new gpzt();
            }
            default: {
                return null;
            }
        }
    }
}

