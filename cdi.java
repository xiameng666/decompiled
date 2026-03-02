final class cdi extends ibur implements ibts {
    final ceq a;
    final cer b;

    public cdi(ceq ceq0, cer cer0) {
        this.a = ceq0;
        this.b = cer0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cde cde0 = cde.b;
        if(((cld)object0).h(cde.a, cde0)) {
            ces ces0 = this.a.b.a;
            if(ces0 != null) {
                Object object1 = ces0.a;
                if(object1 != null) {
                    return object1;
                }
            }
            return cef.a;
        }
        if(((cld)object0).h(cde0, cde.c)) {
            ces ces1 = this.b.b.a;
            if(ces1 != null) {
                Object object2 = ces1.a;
                if(object2 != null) {
                    return object2;
                }
            }
            return cef.a;
        }
        return cef.a;
    }
}

