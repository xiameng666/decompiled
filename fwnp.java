import jeb.synthetic.FIN;

public final class fwnp implements kar {
    @Override  // kar
    public final void accept(Object object0) {
        cngm cngm0 = (cngm)object0;
        Object object1 = cngm0.a;
        __monitor_enter(object1);
        int v = FIN.finallyOpen$NT();
        cngm0.o = false;
        cngm0.j();
        cndx cndx0 = cngm0.f;
        if(cndx0.a) {
            cndx0.a = false;
            cngm0.h.f();
            cngm0.l.j(cngm0);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}

