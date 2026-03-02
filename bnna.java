public final class bnna implements glzn {
    public final bnnc a;
    public final boolean b;

    public bnna(bnnc bnnc0, boolean z) {
        this.a = bnnc0;
        this.b = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v = 1;
        int v1 = this.b;
        gfsx gfsx0 = (gfsx)object0;
        bnnc bnnc0 = this.a;
        Object object1 = bnnc0.g;
        synchronized(object1) {
            if(gfsx0.i()) {
                __monitor_enter(object1);
                goto label_11;
            }
            else {
                bnnc0.e();
                bnnc0.j = false;
            }
            goto label_34;
        }
        try {
        label_11:
            if(!bnnc0.h) {
                ((ggtj)bnnc.a.h()).x("Registering network callbacks.");
                batl.s(bnnc0.f);
                bnnc0.f.registerNetworkCallback(bnnc.b, bnnc0.l);
                if(hsww.i()) {
                    bnnc0.e.b(true);
                }
                bnnc0.h = true;
                bnnc0.i = 0;
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object1);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object1);
                throw throwable0;
            }
        }
        __monitor_exit(object1);
        try {
            bnnc0.k = ((fqxm)gfsx0.d()).c;
            int v2 = gtac.b(((fqxm)gfsx0.d()).f);
            if(v2 == 0) {
                v2 = 2;
            }
            bnnc0.m = v2;
            int v3 = bnnc0.j | v1;
            bnnc0.j = v3;
            if(v3 == 0) {
                batl.s(bnnc0.f);
                v = 1 ^ bpxy.a(bnnc0.f);
            }
        label_34:
            if(!bnnc0.h || bnnc0.i != 0 || v == 0) {
                bnnc0.d();
            }
            else {
                ByteString hfsf0 = bnnc0.k;
                if(hfsf0 != null) {
                    bnnc0.c.c(hfsf0, bnnc0.m);
                    bnnc0.d.b(hfsf0);
                }
            }
        }
        catch(Throwable throwable0) {
            __monitor_exit(object1);
            throw throwable0;
        }
        __monitor_exit(object1);
        return gmbx.a;
    }
}

