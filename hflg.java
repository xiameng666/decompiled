public final class hflg {
    public static gged_interceptors a(hhew hhew0, hfnl hfnl0) {
        int v;
        ggdy ggdy0 = new ggdy();
        if((hhew0.c & 0x1000) != 0) {
            ggdy0.i(Integer.valueOf(hhew0.h));
        }
        switch((hfnl0.c == null ? hfno.a : hfnl0.c).e) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 3 && !hhew0.k && (hfnf.a(hhew0.l) == 0 || hfnf.a(hhew0.l) == 1)) {
            ggdy0.k(hhew0.i);
        }
        return ggdy0.h();
    }
}

