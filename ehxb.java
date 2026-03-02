public final class ehxb implements lqj {
    public final ehxc a;

    public ehxb(ehxc ehxc0) {
        this.a = ehxc0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ehwt ehwt0;
        gfsx gfsx2;
        ehws ehws0 = new ehws(null);
        int v = ((ehwq)object0).f - 1;
        if(((ehwq)object0).f == 0) {
            throw null;
        }
        ehxc ehxc0 = this.a;
        switch(v) {
            case 0: {
                ehws0.b(ehwt.a);
                ehxc0.d = gfqx.a;
                goto label_33;
            }
            case 1: {
                if(ehxc0.b) {
                    ehxc0.c.removeCallbacksAndMessages(null);
                    ehxc0.b = false;
                }
                gfsx gfsx0 = ((ehwq)object0).c;
                gfsx gfsx1 = ((ehwq)object0).d;
                if(!hxjr.f()) {
                    gfsx2 = gfqx.a;
                }
                else if(!gfsx1.i()) {
                    gfsx2 = gfqx.a;
                }
                else {
                    gfsx2 = gfsx.m(ehwr.a(((Float)gfsx1.d()).floatValue(), ehxc0.d));
                }
                if(hxjr.f()) {
                    ehwt0 = ehwt.b;
                }
                else {
                    ehwt0 = ((Boolean)gfsx1.b(new ehwz()).f(Boolean.valueOf(false))).booleanValue() ? ehwt.c : ehwt.b;
                }
                ehws0.b(ehwt0);
                ehws0.c(gfsx0);
                ehws0.a = gfsx1.b(new ehwy());
                ehws0.b = gfqx.a;
                ehws0.c = gfsx2;
                ehxc0.d = gfsx2;
                if(!hxjr.a.b().k() || gfsx0.i() || gfsx1.i()) {
                label_33:
                    ehwv ehwv0 = ehws0.a();
                    ehxc0.a.l(ehwv0);
                    return;
                }
                break;
            }
            case 2: {
                hrtd hrtd0 = hrtd.a;
                if(!hrtd0.I().aQ()) {
                    ehxa ehxa0 = new ehxa(ehxc0);
                    long v1 = hrtd0.I().y();
                    ehxc0.c.postDelayed(ehxa0, v1);
                    ehxc0.b = true;
                    ehxc0.d = gfqx.a;
                    return;
                }
                break;
            }
            default: {
                ehws0.b(ehwt.d);
                goto label_33;
            }
        }
    }
}

