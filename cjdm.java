import jeb.synthetic.FIN;

public class cjdm {
    public volatile Object a;
    public boolean b;
    public boolean c;
    private final ibrt d;

    public cjdm(Object object0, ibrt ibrt0) {
        ibuq.f(ibrt0, "coroutineContext");
        super();
        this.d = ibrt0;
        this.a = object0;
    }

    public final Object a(cjdi cjdi0, ibrl ibrl0) {
        Throwable throwable2;
        cjdi cjdi2;
        ibuz ibuz2;
        Throwable throwable1;
        ibuz ibuz1;
        cjdi cjdi1;
        cjdj cjdj0;
        if((ibrl0 instanceof cjdj)) {
            cjdj0 = (cjdj)ibrl0;
            int v = cjdj0.d;
            if((v & 0x80000000) == 0) {
                cjdj0 = new cjdj(this, ibrl0);
            }
            else {
                cjdj0.d = v - 0x80000000;
            }
        }
        else {
            cjdj0 = new cjdj(this, ibrl0);
        }
        Object object0 = cjdj0.b;
        Object object1 = ibrx.a;
        switch(cjdj0.d) {
            case 0: {
                ibnx.b(object0);
                if(this.h()) {
                    ibuz ibuz0 = new ibuz();
                    cjdj0.a = cjdi0;
                    cjdj0.e = ibuz0;
                    cjdj0.d = 1;
                    if(cjdi0.b() == object1) {
                        return object1;
                    }
                    cjdi1 = cjdi0;
                    ibuz1 = ibuz0;
                    goto label_26;
                }
                return ibom.a;
            }
            case 1: {
                ibuz1 = cjdj0.e;
                cjdi1 = (cjdi)cjdj0.a;
                ibnx.b(object0);
                try {
                label_26:
                    cjdk cjdk0 = new cjdk(this, cjdi1, ibuz1, null);
                    cjdj0.a = cjdi1;
                    cjdj0.e = ibuz1;
                    cjdj0.d = 2;
                    if(icbd.a(this.d, cjdk0, cjdj0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    ibuz2 = ibuz1;
                    cjdi2 = cjdi1;
                    goto label_45;
                }
                ibuz2 = ibuz1;
                cjdi2 = cjdi1;
                goto label_53;
            }
            case 2: {
                ibuz2 = cjdj0.e;
                cjdi2 = (cjdi)cjdj0.a;
                try {
                    ibnx.b(object0);
                    goto label_53;
                }
                catch(Throwable throwable1) {
                }
            label_45:
                cjdl cjdl0 = new cjdl(cjdi2, ibuz2, null);
                cjdj0.a = throwable1;
                cjdj0.e = null;
                cjdj0.d = 4;
                if(icbd.a(icey.a, cjdl0, cjdj0) == object1) {
                    return object1;
                }
                throwable2 = throwable1;
                throw throwable2;
            label_53:
                cjdl cjdl1 = new cjdl(cjdi2, ibuz2, null);
                cjdj0.a = null;
                cjdj0.e = null;
                cjdj0.d = 3;
                return icbd.a(icey.a, cjdl1, cjdj0) == object1 ? object1 : ibom.a;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            case 4: {
                throwable2 = (Throwable)cjdj0.a;
                ibnx.b(object0);
                throw throwable2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    protected void b() {
    }

    protected void c() {
    }

    protected void d(Exception exception0) {
        throw new AssertionError(exception0);
    }

    protected void e(Object object0) {
        ibuq.f(object0, "key");
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0;
    }

    protected void f() {
    }

    public final void g(cjdh cjdh0) {
        if(cjdh0 == null) {
            return;
        }
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.a == null) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        ibrn ibrn0 = (ibrn)this.d.get(ibrn.k);
        if((ibrn0 instanceof iccd)) {
            ibuz ibuz0 = new ibuz();
            icdt.a(((iccd)ibrn0)).execute(new cjdg(this, cjdh0, ibuz0));
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean h() {
        return this.b && this.a != null;
    }
}

