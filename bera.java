public final class bera implements ibts {
    public final berk a;
    public final bgmk b;

    public bera(berk berk0, bgmk bgmk0) {
        this.a = berk0;
        this.b = bgmk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        berk berk0 = this.a;
        lrf lrf0 = berk0.b;
        if(lrf0.d("initial_navigation_executed") == null) {
            switch(this.b.ordinal()) {
                case 1: {
                    berk0.g.l(null);
                    break;
                }
                case 2: {
                    berk0.h.l(null);
                    break;
                }
                case 3: {
                    berk0.i.l(null);
                    break;
                }
                case 0: 
                case 4: {
                    berk0.f.l(null);
                    break;
                }
                case 5: {
                    berk0.j.l(null);
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            lrf0.e("initial_navigation_executed", Boolean.valueOf(true));
        }
        return ibom.a;
    }
}

