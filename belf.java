public final class belf implements lqj {
    public final belh a;

    public belf(belh belh0) {
        this.a = belh0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        belh belh0 = this.a;
        belh0.c = false;
        int v = ((bedv)object0).a.ordinal();
        switch(v) {
            case 0: {
                gfsx gfsx0 = (gfsx)((bedv)object0).b;
                if(gfsx0 != null && gfsx0.i()) {
                    Object object1 = gfsx0.d();
                    bedv bedv1 = new bedv(bedu.a, object1, null);
                    belh0.b.l(bedv1);
                    return;
                }
                belh0.c = true;
                bedv bedv2 = (bedv)belh0.a.ij();
                belh0.b.l(bedv2);
                return;
            }
            case 1: {
                bedv bedv3 = new bedv(bedu.b, null, null);
                belh0.b.l(bedv3);
                return;
            }
            default: {
                if(v != 2) {
                    return;
                }
                bedv bedv0 = new bedv(bedu.c, null, ((bedv)object0).c);
                belh0.b.l(bedv0);
            }
        }
    }
}

