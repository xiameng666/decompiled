public final class asil implements Runnable {
    public final asit a;

    public asil(asit asit0) {
        this.a = asit0;
    }

    @Override
    public final void run() {
        asit asit0 = this.a;
        if(asit0.j != null) {
            asit0.a.f("Permissions callback already registered.", new Object[0]);
            return;
        }
        if(((Boolean)asit0.h.mr()).booleanValue()) {
            asim asim0 = new asim(asit0);
            asin asin0 = new asin(asit0);
            asit0.f.b(asim0, asin0, asit0.b);
            return;
        }
        baun baun0 = asit0.a;
        baun0.j("Registering for status updates.", new Object[0]);
        asis asis0 = new asis(asit0);
        if(!asit0.f.e(asis0, asit0.b)) {
            asit0.d();
            return;
        }
        asit0.j = asis0;
        baun0.j("Photos backup status callback registered", new Object[0]);
    }
}

