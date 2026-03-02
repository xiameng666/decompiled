final class cel extends ibur implements ibts {
    final cep a;
    final long b;

    public cel(cep cep0, long v) {
        this.a = cep0;
        this.b = v;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cep cep0 = this.a;
        long v = 0L;
        if(cep0.h != null && cep0.a() != null && !ibuq.m(cep0.h, cep0.a())) {
            switch(((cde)object0).ordinal()) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    cco cco0 = cep0.f.b.c;
                    if(cco0 != null) {
                        jlk jlk0 = new jlk(this.b);
                        long v1 = ((jlk)cco0.b.a(jlk0)).a;
                        hel hel0 = cep0.a();
                        ibuq.c(hel0);
                        long v2 = hel0.a(this.b, v1, jlm.a);
                        hel hel1 = cep0.h;
                        ibuq.c(hel1);
                        v = jlf.c(v2, hel1.a(this.b, v1, jlm.a));
                    }
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        return new jlf(v);
    }
}

