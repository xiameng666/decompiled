final class bdkz extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    boolean d;
    int e;
    final bdla f;
    final boolean g;

    public bdkz(bdla bdla0, boolean z, ibrl ibrl0) {
        this.f = bdla0;
        this.g = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdkz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdkz(this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bdsg bdsg0;
        Object object4;
        Object object3;
        Object object2;
        boolean z;
        Object object1 = ibrx.a;
        if(this.e == 0) {
            ibnx.b(object0);
            z = this.g;
            object3 = this.f;
            object4 = this.f.h;
        }
        else {
            z = this.d;
            object2 = this.c;
            object3 = this.b;
            object4 = this.a;
            ibnx.b(object0);
            bdsg0 = (bdsg)object0;
            goto label_32;
        }
        do {
            object2 = ((icnl)object4).b();
            bdsg0 = (bdsg)object2;
            if(!z) {
                bdsg0 = bdsg0.a();
            }
            else if((bdsg0 instanceof bdsd)) {
                this.a = object4;
                this.b = object3;
                this.c = object2;
                this.d = true;
                this.e = 1;
                object0 = ((bdla)object3).b(((bdsd)bdsg0), this);
                if(object0 == object1) {
                    return object1;
                }
                bdsg0 = (bdsg)object0;
            }
            else if(!(bdsg0 instanceof bdsf)) {
                ((ggtj)bdla.a.j()).B("Cannot apply update to state %s, because we expected loading or preview state", new ibuk(bdsg0.getClass()).c());
                bdsg0 = bdsg0.a();
            }
        label_32:
        }
        while(!((icnl)object4).h(object2, bdsg0));
        return ibom.a;
    }
}

