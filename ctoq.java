import jeb.synthetic.FIN;

public final class ctoq implements ykf {
    public final ctox a;
    public final long b;
    public final long c;
    public iccs d;
    public iced e;
    private final icck f;
    private int g;

    public ctoq(ctox ctox0, ibrt ibrt0) {
        long v = ibzy.h(15, ibzz.d);
        long v1 = ibzy.h(10, ibzz.d);
        ibuq.f(ibrt0, "coroutineContext");
        super();
        this.a = ctox0;
        this.b = v;
        this.c = v1;
        icck icck0 = iccl.b(ibrt0);
        this.f = icck0;
        ctnb.a("DeviceLink", new ibuk(this.getClass()));
        icbb.b(icck0, null, null, new ctof(this, null), 3);
    }

    @Override  // ykf
    public final Object a(String s, String s1, byte[] arr_b, ibrl ibrl0) {
        Object object1;
        Object object0;
        ctok ctok0;
        if((ibrl0 instanceof ctok)) {
            ctok0 = (ctok)ibrl0;
            int v = ctok0.c;
            if((v & 0x80000000) == 0) {
                ctok0 = new ctok(this, ibrl0);
            }
            else {
                ctok0.c = v - 0x80000000;
            }
        }
        else {
            ctok0 = new ctok(this, ibrl0);
        }
        try {
            object0 = ctok0.a;
            object1 = ibrx.a;
            switch(ctok0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_31;
                }
            }
        }
        catch(Throwable throwable0) {
            this.c();
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            ctok0.d = s;
            ctok0.e = s1;
            ctok0.f = arr_b;
            ctok0.c = 1;
            if(this.b(ctok0) == object1) {
                return object1;
            }
            goto label_24;
        label_20:
            arr_b = ctok0.f;
            s1 = ctok0.e;
            s = ctok0.d;
            ibnx.b(object0);
        label_24:
            ctok0.d = null;
            ctok0.e = null;
            ctok0.f = null;
            ctok0.c = 2;
            object0 = this.a.a(s, s1, arr_b, ctok0);
            if(object0 == object1) {
                return object1;
            label_31:
                ibnx.b(object0);
            }
        }
        catch(Throwable throwable0) {
            this.c();
            throw throwable0;
        }
        this.c();
        return object0;
    }

    public final Object b(ibrl ibrl0) {
        synchronized(this) {
            ++this.g;
            iced iced0 = this.e;
            if(iced0 != null) {
                iceb.a(iced0);
            }
            this.e = null;
            if(this.d == null) {
                ctop ctop0 = new ctop(this, null);
                this.d = icbb.a(this.f, null, null, ctop0, 3);
            }
        }
        iccs iccs0 = this.d;
        if(iccs0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object object0 = iccs0.n(ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final void c() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        int v1 = this.g - 1;
        this.g = v1;
        if(v1 >= 0) {
            ctox ctox0 = this.a;
            if(ibuq.m(ctox0.b().b(), ctos.a)) {
                ctox0.d();
                FIN.finallyExec$NT(v);
                return;
            }
            if(this.g == 0) {
                ctol ctol0 = new ctol(this, null);
                this.e = icbb.b(this.f, null, null, ctol0, 3);
            }
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Request cleanup called too many times");
    }

    public final void d() {
        synchronized(this) {
            iccl.i(this.f);
            ctox ctox0 = this.a;
            if(!ibuq.m(ctox0.b().b(), ctot.a)) {
                ctox0.d();
            }
        }
    }

    @Override  // ykf
    public final String f() {
        return this.a.f();
    }

    @Override  // ykf
    public final String g() {
        return this.a.g();
    }

    @Override  // ykf
    public final icig h(String s, String s1, byte[] arr_b) {
        return new icht(new ctoj(this, s, s1, arr_b, null));
    }

    @Override  // ykf
    public final icig j(icig icig0) {
        throw null;
    }
}

