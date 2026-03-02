import j..util.Objects;

public final class flwv {
    public static gfsx a(hnqn hnqn0) {
        int v = hnqn0.d;
        int v1 = hnsu.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        int v3 = 2;
        if(v1 - 2 == 1) {
            v3 = 1;
        }
        else {
            switch(v1 - 2) {
                case 2: {
                    break;
                }
                case 3: {
                    v3 = 3;
                    break;
                }
                default: {
                    v3 = 5;
                    switch(v1 - 2) {
                        case 4: {
                            v3 = 4;
                            break;
                        }
                        case 5: {
                            break;
                        }
                        default: {
                            v3 = 0;
                        }
                    }
                }
            }
        }
        int v4 = hnsu.a(v);
        gfsx gfsx0 = gfqx.a;
        if(v4 != 0) {
            v2 = v4;
        }
        if(v2 - 2 != 3 && v2 - 2 != 4) {
            return gfsx0;
        }
        hnqv hnqv0 = hnqn0.b == 11 ? ((hnqv)hnqn0.c) : hnqv.a;
        ggdy ggdy0 = new ggdy();
        for(Object object0: hnqv0.b) {
            ggdy0.i(flxa.a(((hnry)object0)));
        }
        gged_interceptors gged0 = ggdy0.h();
        if(gged0 == null) {
            throw new NullPointerException("Null contactIds");
        }
        fmgn fmgn0 = new fmgn(gged0);
        Objects.requireNonNull(fmgn0);
        return gfsx.m(new fmei(v3, ((fmeh)((gftm)gfsx.m(new fmcg(fmgn0))).a)));
    }
}

