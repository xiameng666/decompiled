public final class asik implements Runnable {
    public final asit a;

    public asik(asit asit0) {
        this.a = asit0;
    }

    @Override
    public final void run() {
        asit asit0 = this.a;
        if(((Boolean)asit0.h.mr()).booleanValue()) {
            asit0.f.c(asit0.b);
            return;
        }
        if(asit0.j == null) {
            asit0.a.j("Callback not registered.", new Object[0]);
            return;
        }
        asit0.a.j("Unregistering for status updates.", new Object[0]);
        fpth fpth0 = asit0.j;
        gftb.check(fpth0);
        asit0.f.d(fpth0, asit0.b);
        asit0.j = null;
        asit0.a.j("Photos backup status callback unregistered.", new Object[0]);
    }
}

