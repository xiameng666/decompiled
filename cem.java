final class cem extends ibur implements ibts {
    final cep a;
    final long b;

    public cem(cep cep0, long v) {
        this.a = cep0;
        this.b = v;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v3;
        long v2;
        cep cep0 = this.a;
        cgr cgr0 = cep0.e.b.b;
        long v = this.b;
        long v1 = 0L;
        if(cgr0 == null) {
            v2 = 0L;
        }
        else {
            jlk jlk0 = new jlk(v);
            v2 = ((jlf)cgr0.a.a(jlk0)).a;
        }
        cgr cgr1 = cep0.f.b.b;
        if(cgr1 == null) {
            v3 = 0L;
        }
        else {
            jlk jlk1 = new jlk(v);
            v3 = ((jlf)cgr1.a.a(jlk1)).a;
        }
        switch(((cde)object0).ordinal()) {
            case 0: {
                v1 = v2;
                return new jlf(v1);
            }
            case 1: {
                return new jlf(v1);
            }
            case 2: {
                return new jlf(v3);
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

