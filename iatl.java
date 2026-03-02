import j..util.Objects;
import jeb.synthetic.FIN;

final class iatl implements Runnable {
    final iatj a;
    final String b;
    final iaof_metadata c;
    final gRPCMethodDescriptor d;
    final ibfn e;
    final iakq f;
    final iatm g;

    public iatl(iatm iatm0, String s, iaof_metadata iaof0, gRPCMethodDescriptor iaoj0, ibfn ibfn0, iakq iakq0) {
        this.b = s;
        this.c = iaof0;
        this.d = iaoj0;
        this.e = ibfn0;
        this.f = iakq0;
        Objects.requireNonNull(iatm0);
        this.g = iatm0;
        super();
        this.a = new iatj(s, iatm0.a, iatm0.e, iaof0, iatm0, this, iatm0.c, iaoj0, ibfn0, iakq0, iatm0.f);
    }

    @Override
    public final void run() {
        iatm iatm0 = this.g;
        Object object0 = iatm0.c;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(iatm0.i) {
            iapk iapk0 = iatm0.j;
            iaof_metadata iaof0 = new iaof_metadata();
            this.a.o.l(iapk0, true, iaof0);
            goto label_12;
        }
        if(iatm0.k) {
            iatm0.d.add(this.a);
            this.a.o.h.p = iatm0.h;
        label_12:
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new AssertionError("Transport is not started");
    }
}

