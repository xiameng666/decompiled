import android.view.Choreographer;

public final class inn implements gqt {
    public final Choreographer a;
    private final ini c;

    public inn(Choreographer choreographer0, ini ini0) {
        this.a = choreographer0;
        this.c = ini0;
    }

    @Override  // gqt
    public final Object a(ibts ibts0, ibrl ibrl0) {
        icbk icbk0 = new icbk(ibsc.c(ibrl0), 1);
        icbk0.z();
        inm inm0 = new inm(icbk0, ibts0);
        ini ini0 = this.c;
        Choreographer choreographer0 = ini0.c;
        if(ibuq.m(choreographer0, this.a)) {
            synchronized(ini0.e) {
                ini0.f.add(inm0);
                if(!ini0.h) {
                    ini0.h = true;
                    choreographer0.postFrameCallback(ini0.i);
                }
            }
            icbk0.d(new ink(ini0, inm0));
        }
        else {
            this.a.postFrameCallback(inm0);
            icbk0.d(new inl(this, inm0));
        }
        Object object1 = icbk0.k();
        if(object1 == ibrx.a) {
            ibsi.b(ibrl0);
        }
        return object1;
    }

    @Override  // ibrt
    public final Object fold(Object object0, ibtw ibtw0) {
        return ibrq.a(this, object0, ibtw0);
    }

    @Override  // ibrr
    public final ibrr get(ibrs ibrs0) {
        return ibrq.b(this, ibrs0);
    }

    @Override  // ibrr
    public final ibrs getKey() {
        return gqt.b;
    }

    @Override  // ibrt
    public final ibrt minusKey(ibrs ibrs0) {
        return ibrq.c(this, ibrs0);
    }

    @Override  // ibrt
    public final ibrt plus(ibrt ibrt0) {
        return ibrq.d(this, ibrt0);
    }
}

