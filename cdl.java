final class cdl extends ibur implements ibts {
    final ceq a;
    final cer b;

    public cdl(ceq ceq0, cer cer0) {
        this.a = ceq0;
        this.b = cer0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cde cde0 = cde.b;
        if(((cld)object0).h(cde.a, cde0)) {
            cez cez0 = this.a.b.d;
            if(cez0 != null) {
                Object object1 = cez0.c;
                if(object1 != null) {
                    return object1;
                }
            }
            return cef.a;
        }
        if(((cld)object0).h(cde0, cde.c)) {
            cez cez1 = this.b.b.d;
            if(cez1 != null) {
                Object object2 = cez1.c;
                if(object2 != null) {
                    return object2;
                }
            }
            return cef.a;
        }
        return cef.a;
    }
}

