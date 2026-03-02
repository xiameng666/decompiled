final class bgoy {
    public final gged_interceptors a;
    public final bgrt b;
    public final bgqg c;
    public final bgwj d;
    public final bgpz e;

    static {
        bgrz.a("AFH");
    }

    public bgoy(gged_interceptors gged0, bgpz bgpz0, bgrt bgrt0, bgqg bgqg0, bgwj bgwj0) {
        this.a = gged0;
        this.e = bgpz0;
        this.b = bgrt0;
        this.c = bgqg0;
        this.d = bgwj0;
    }

    public static final String a(hguc hguc0, hgug hgug0) {
        hgtr hgtr0;
        if((hgug0.b & 1) == 0) {
            hgtr0 = hguc0.j.isEmpty() ? hgtr.a : ((hgtr)hguc0.j.get(0));
        }
        else {
            hgtr0 = hgug0.c;
            if(hgtr0 == null) {
                hgtr0 = hgtr.a;
            }
        }
        switch((hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e)).ordinal()) {
            case 1: {
                return String.format("%s: [%s]:%s", (hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e)).name(), hgtr0.c, (hgtr0.d == null ? hgts.a : hgtr0.d).b);
            }
            case 2: {
                return String.format("%s: [%s]:%s", (hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e)).name(), hgtr0.c, (hgtr0.e == null ? hgtt.a : hgtr0.e).b);
            }
            default: {
                return String.format("%s: [%s]:%s", (hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e)).name(), hgtr0.c, "");
            }
        }
    }
}

