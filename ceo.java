final class ceo extends ibur implements ibts {
    final cep a;

    public ceo(cep cep0) {
        this.a = cep0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cde cde0 = cde.b;
        if(((cld)object0).h(cde.a, cde0)) {
            cgr cgr0 = this.a.e.b.b;
            if(cgr0 != null) {
                Object object1 = cgr0.b;
                if(object1 != null) {
                    return object1;
                }
            }
            return cef.b;
        }
        if(((cld)object0).h(cde0, cde.c)) {
            cgr cgr1 = this.a.f.b.b;
            if(cgr1 != null) {
                Object object2 = cgr1.b;
                if(object2 != null) {
                    return object2;
                }
            }
            return cef.b;
        }
        return cef.b;
    }
}

