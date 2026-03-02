public final class bntv {
    public gfsx a;
    public gfsx b;
    private bnvk c;
    private gfsx d;
    private ggfp e;
    private boolean f;
    private gfsx g;
    private byte h;

    public bntv() {
        throw null;
    }

    public bntv(bntw bntw0) {
        this.d = gfqx.a;
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.g = gfqx.a;
        this.c = bntw0.a;
        this.d = bntw0.b;
        this.a = bntw0.c;
        this.e = bntw0.d;
        this.b = bntw0.e;
        this.f = bntw0.f;
        this.g = bntw0.g;
        this.h = 1;
    }

    public bntv(byte[] arr_b) {
        this.d = gfqx.a;
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.g = gfqx.a;
    }

    public final bntw a() {
        boolean z = true;
        if(this.h == 1) {
            bnvk bnvk0 = this.c;
            if(bnvk0 != null) {
                ggfp ggfp0 = this.e;
                if(ggfp0 != null) {
                    bntw bntw0 = new bntw(bnvk0, this.d, this.a, ggfp0, this.b, this.f, this.g);
                    gftb.checkTrue(!bntw0.f || !bntw0.e());
                    gftb.checkTrue(bntw0.b.i() != bntw0.c.i());
                    gftb.checkTrue(bntw0.d.isEmpty() || bntw0.c.i() || ((bnwe)bntw0.b.d()).a());
                    if(bntw0.e.i() && (!bntw0.e() || bntw0.g())) {
                        z = false;
                    }
                    gftb.checkTrue(z);
                    return bntw0;
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c == null) {
            stringBuilder0.append(" keychainClient");
        }
        if(this.e == null) {
            stringBuilder0.append(" requiredOwnerKeysWhoseImportRequiresRetrieval");
        }
        if(this.h == 0) {
            stringBuilder0.append(" isDomainToBeReset");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.f = z;
        this.h = 1;
    }

    public final void c(bnvk bnvk0) {
        if(bnvk0 == null) {
            throw new NullPointerException("Null keychainClient");
        }
        this.c = bnvk0;
    }

    public final void d(ggfp ggfp0) {
        if(ggfp0 == null) {
            throw new NullPointerException("Null requiredOwnerKeysWhoseImportRequiresRetrieval");
        }
        this.e = ggfp0;
    }

    public final void e(bnwe bnwe0) {
        this.d = gfsx.m(bnwe0);
    }

    public final void f(bntw bntw0) {
        this.g = gfsx.m(bntw0);
    }
}

