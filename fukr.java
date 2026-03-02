final class fukr implements ibtw {
    final hfc a;
    final fryv b;
    final fryv c;
    final fryv d;
    final boolean e;
    final ibth f;
    final ibth g;
    final int h;
    final long i;
    final fulb j;
    final fryk k;
    final fryv l;
    final frxs m;

    public fukr(hfc hfc0, fryv fryv0, fryv fryv1, fryv fryv2, boolean z, ibth ibth0, ibth ibth1, int v, long v1, fulb fulb0, fryk fryk0, fryv fryv3, frxs frxs0) {
        this.a = hfc0;
        this.b = fryv0;
        this.c = fryv1;
        this.d = fryv2;
        this.e = z;
        this.f = ibth0;
        this.g = ibth1;
        this.h = v;
        this.i = v1;
        this.j = fulb0;
        this.k = fryk0;
        this.l = fryv3;
        this.m = frxs0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibth ibth3;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        gze gze0 = gzf.e(0xEE686709, new fukq(this.j, this.k, this.l, this.m), ((goz)object0));
        fryv fryv0 = this.b;
        fryv fryv1 = this.c;
        fryv fryv2 = this.d;
        boolean z = this.e;
        hfc hfc0 = this.a;
        ibth ibth1 = this.f;
        ibth ibth2 = this.g;
        ((goz)object0).M(-806008081);
        if(ibth2 == null) {
            ibth3 = null;
        }
        else {
            ((goz)object0).M(-1633490746);
            int v = ((goz)object0).X(ibth0) | ((goz)object0).X(ibth2);
            Object object2 = ((goz)object0).k();
            if(v != 0 || object2 == gop.a) {
                object2 = new fukp(ibth0, ibth2);
                ((goz)object0).R(object2);
            }
            ibth3 = (ibth)object2;
            ((goz)object0).A();
        }
        ((goz)object0).A();
        fuky.f(hfc0, gze0, fryv0, fryv1, fryv2, z, ibth1, ibth3, this.h, this.i, ((goz)object0), 0x30, 0);
        return ibom.a;
    }
}

