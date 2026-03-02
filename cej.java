final class cej extends ibur implements ibts {
    final cep a;
    final long b;

    public cej(cep cep0, long v) {
        this.a = cep0;
        this.b = v;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cep cep0 = this.a;
        long v = this.b;
        switch(((cde)object0).ordinal()) {
            case 0: {
                cco cco0 = cep0.e.b.c;
                if(cco0 != null) {
                    jlk jlk0 = new jlk(v);
                    return new jlk(((jlk)cco0.b.a(jlk0)).a);
                }
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                cco cco1 = cep0.f.b.c;
                if(cco1 != null) {
                    jlk jlk1 = new jlk(v);
                    return new jlk(((jlk)cco1.b.a(jlk1)).a);
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        return new jlk(v);
    }
}

