final class cen extends ibur implements ibts {
    final cep a;

    public cen(cep cep0) {
        this.a = cep0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cde cde0 = cde.b;
        Object object1 = null;
        if(((cld)object0).h(cde.a, cde0)) {
            cco cco0 = this.a.e.b.c;
            if(cco0 != null) {
                object1 = cco0.c;
            }
        }
        else if(((cld)object0).h(cde0, cde.c)) {
            cco cco1 = this.a.f.b.c;
            if(cco1 != null) {
                object1 = cco1.c;
            }
        }
        else {
            object1 = cef.c;
        }
        return object1 == null ? cef.c : object1;
    }
}

