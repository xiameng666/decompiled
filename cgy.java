import java.util.concurrent.CancellationException;

final class cgy extends ibsl implements ibts {
    Object a;
    Object b;
    int c;
    final chb d;
    final Object e;
    final chi f;
    final long g;
    final ibts h;

    public cgy(chb chb0, Object object0, chi chi0, long v, ibts ibts0, ibrl ibrl0) {
        this.d = chb0;
        this.e = object0;
        this.f = chi0;
        this.g = v;
        this.h = ibts0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new cgy(this.d, this.e, this.f, this.g, this.h, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        int v = 1;
        if(this.c != 0) {
            try {
                object2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                goto label_22;
            }
            catch(CancellationException cancellationException0) {
                this.d.g();
                throw cancellationException0;
            }
        }
        ibnx.b(object0);
        try {
            this.d.a.a = (cht)this.d.f.a.a(this.e);
            this.d.i(((ckv)this.f).a);
            this.d.h(true);
            Object object4 = this.d.a.a();
            cht cht0 = chu.a(this.d.a.a);
            chn chn0 = new chn(this.d.a.e, object4, cht0, this.d.a.b, 0x8000000000000000L, this.d.a.d);
            ibuz ibuz0 = new ibuz();
            cgx cgx0 = new cgx(this.d, chn0, this.h, ibuz0);
            this.a = chn0;
            this.b = ibuz0;
            this.c = 1;
            if(cku.b(chn0, this.f, this.g, cgx0, this) != object1) {
                object3 = chn0;
                object2 = ibuz0;
            label_22:
                if(!((ibuz)object2).a) {
                    v = 2;
                }
                this.d.g();
                return new chj(((chn)object3), v);
            }
            return object1;
        }
        catch(CancellationException cancellationException0) {
            this.d.g();
            throw cancellationException0;
        }
    }
}

