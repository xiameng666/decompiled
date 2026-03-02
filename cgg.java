final class cgg extends ibur implements ibts {
    final iax a;
    final cgh b;
    final ibq c;

    public cgg(iax iax0, cgh cgh0, ibq ibq0) {
        this.a = iax0;
        this.b = cgh0;
        this.c = ibq0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hzk hzk0 = ((ibp)object0).o();
        if(hzk0 != null) {
            if(this.a.ep()) {
                this.b.a.d = hzk0;
            }
            else {
                this.b.a.c = hzk0;
            }
        }
        ibp.y(((ibp)object0), this.c, 0, 0);
        return ibom.a;
    }
}

