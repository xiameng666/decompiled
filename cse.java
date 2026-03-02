final class cse implements icih {
    final ibvb a;
    final ibvb b;
    final ibvb c;
    final csg d;

    public cse(ibvb ibvb0, ibvb ibvb1, ibvb ibvb2, csg csg0) {
        this.a = ibvb0;
        this.b = ibvb1;
        this.c = ibvb2;
        this.d = csg0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        int v = 1;
        if((((dge)object0) instanceof dgj)) {
            ++this.a.a;
        }
        else if((((dge)object0) instanceof dgk)) {
            --this.a.a;
        }
        else if((((dge)object0) instanceof dgi)) {
            --this.a.a;
        }
        else if((((dge)object0) instanceof dgc)) {
            ++this.b.a;
        }
        else if((((dge)object0) instanceof dgd)) {
            --this.b.a;
        }
        else if((((dge)object0) instanceof dfx)) {
            ++this.c.a;
        }
        else if((((dge)object0) instanceof dfy)) {
            --this.c.a;
        }
        int v1 = 0;
        boolean z = this.a.a > 0;
        boolean z1 = this.b.a > 0;
        boolean z2 = this.c.a > 0;
        csg csg0 = this.d;
        if(csg0.b != z) {
            csg0.b = z;
            v1 = 1;
        }
        if(csg0.c == z1) {
            v = v1;
        }
        else {
            csg0.c = z1;
        }
        if(csg0.d != z2) {
            csg0.d = z2;
            iex.a(csg0);
            return ibom.a;
        }
        if(v != 0) {
            iex.a(csg0);
        }
        return ibom.a;
    }
}

