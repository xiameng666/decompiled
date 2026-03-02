public final class tjx implements essa {
    public ttv a;
    public twg b;
    public byte[] c;
    private final tjz d;

    static {
    }

    public tjx() {
        this.d = new tjz(this);
    }

    @Override  // essa
    public final essh a() {
        return this.d;
    }

    protected final void b(Exception exception0, ttv ttv0) {
        if(exception0 != null) {
            if((exception0 instanceof tkg)) {
                this.d.f(((tkg)exception0).a);
                return;
            }
            this.d.f(tkf.e);
            return;
        }
        if(ttv0 != null && ttv0.d()) {
            if(ttw.b == ttv0.e) {
                this.d.c(1);
                return;
            }
            this.d.f(tkf.i);
        }
    }

    public final void c() {
        this.d.a = true;
    }

    @Override  // essa
    public final byte[] d(byte[] arr_b) {
        byte[] arr_b1;
        Exception exception1;
        try {
            try {
                exception1 = null;
                tjz tjz0 = this.d;
                if(tjz0.b == 3) {
                    tjz0.c(0);
                }
                twf twf0 = ((twd)this.b).a(Byte.valueOf(new sxm(arr_b).a[1]));
                sxm sxm0 = twf0.a(new sxm(arr_b));
                arr_b1 = twf0.b(this.a, sxm0).a();
            }
            catch(sxp sxp0) {
                exception1 = sxp0;
                arr_b1 = exception1.a;
            }
            catch(Exception exception0) {
                exception1 = exception0;
                arr_b1 = sxr.i;
            }
        }
        catch(Throwable throwable0) {
            this.b(null, this.a);
            throw throwable0;
        }
        this.b(exception1, this.a);
        return arr_b1;
    }
}

