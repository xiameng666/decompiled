final class bdkw extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    final bdla e;

    public bdkw(bdla bdla0, ibrl ibrl0) {
        this.e = bdla0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdkw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdkw(this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bdsg bdsg0;
        Object object4;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.d == 0) {
            ibnx.b(object0);
            object3 = this.e;
            object4 = this.e.h;
        }
        else {
            object2 = this.c;
            object3 = this.b;
            object4 = this.a;
            ibnx.b(object0);
            bdsg0 = (bdsg)object0;
            goto label_25;
        }
        do {
            object2 = ((icnl)object4).b();
            bdsg0 = (bdsg)object2;
            if((bdsg0 instanceof bdsd)) {
                this.a = object4;
                this.b = object3;
                this.c = object2;
                this.d = 1;
                object0 = ((bdla)object3).b(((bdsd)bdsg0), this);
                if(object0 == object1) {
                    return object1;
                }
                bdsg0 = (bdsg)object0;
            }
            else if(!(bdsg0 instanceof bdsb) && !(bdsg0 instanceof bdsc)) {
                ((ggtj)bdla.a.j()).B("Cannot start the view model from state %s", new ibuk(bdsg0.getClass()).c());
            }
        label_25:
        }
        while(!((icnl)object4).h(object2, bdsg0));
        return ibom.a;
    }
}

