public final class cgx implements ibts {
    public final chb a;
    public final chn b;
    public final ibts c;
    public final ibuz d;

    public cgx(chb chb0, chn chn0, ibts ibts0, ibuz ibuz0) {
        this.a = chb0;
        this.b = chn0;
        this.c = ibts0;
        this.d = ibuz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        chb chb0 = this.a;
        chn chn0 = chb0.a;
        cku.f(((chk)object0), chn0);
        Object object1 = chb0.b(((chk)object0).a());
        boolean z = ibuq.m(object1, ((chk)object0).a());
        ibts ibts0 = this.c;
        if(!z) {
            chn0.c(object1);
            this.b.c(object1);
            if(ibts0 != null) {
                ibts0.a(chb0);
            }
            ((chk)object0).c();
            this.d.a = true;
            return ibom.a;
        }
        if(ibts0 != null) {
            ibts0.a(chb0);
        }
        return ibom.a;
    }
}

