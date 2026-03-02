public final class szp implements essa {
    public tax a;
    public byte[] b;
    public tdq c;
    private final szr d;

    static {
    }

    public szp() {
        this.d = new szr(this);
    }

    @Override  // essa
    public final essh a() {
        return this.d;
    }

    protected final void b(Exception exception0, tax tax0) {
        if(exception0 != null) {
            if((exception0 instanceof taa)) {
                this.d.f(((taa)exception0).a);
                return;
            }
            this.d.f(szx.e);
            return;
        }
        if(tax0 != null) {
            tay tay0 = tax0.d;
            if(tay0.d) {
                if(tay.b == tay0) {
                    this.d.c(1);
                    return;
                }
                this.d.f(szx.i);
            }
        }
    }

    public final void c() {
        this.d.a = true;
    }

    @Override  // essa
    public final byte[] d(byte[] arr_b) {
        byte[] arr_b1;
        tnh tnh0;
        Exception exception1;
        try {
            try {
                exception1 = null;
                szr szr0 = this.d;
                if(szr0.b == 3) {
                    szr0.c(0);
                }
                tdq tdq0 = this.c;
                if(arr_b != null) {
                    int v = arr_b.length - 1;
                    switch(arr_b[1]) {
                        case -92: {
                            tna tna0 = (tna)tdq0;
                            tnh.i(arr_b[v]);
                            break;
                        }
                        case -88: {
                            new tnb(((tna)tdq0).b);
                            tnb.c(arr_b[v]);
                            break;
                        }
                        case -82: {
                            tna tna1 = (tna)tdq0;
                            tnc.c(arr_b[v]);
                            break;
                        }
                        case -78: {
                            new tng(((tna)tdq0).b);
                            tng.d(arr_b[v]);
                            break;
                        }
                        case -54: {
                            new tnd(((tna)tdq0).b);
                            tnd.c(arr_b[v]);
                        }
                    }
                }
                syi syi0 = new syi(arr_b);
                int v1 = syi0.a();
                Byte byte0 = (byte)v1;
                int v2 = syi0.a[1];
                if(!tna.a.contains(byte0)) {
                    throw new syl("Cla Not Supported", syn.b);
                }
                byte0.getClass();
                if(v1 != 0 || v2 != -92) {
                    byte0.getClass();
                    if(v1 != 0 || v2 != -78) {
                        byte0.getClass();
                        if(v1 != 0xFFFFFF80 || v2 != -88) {
                            byte0.getClass();
                            if(v1 != 0xFFFFFF80 || v2 != -82) {
                                byte0.getClass();
                                if(v1 != 0xFFFFFF80 || v2 != -54) {
                                    throw new syl("Sw Ins Not Supported", syn.h);
                                }
                                tnh0 = new tnd(((tna)tdq0).b);
                            }
                            else {
                                tnh0 = new tnc(((tna)tdq0).b);
                            }
                        }
                        else {
                            tnh0 = new tnb(((tna)tdq0).b);
                        }
                    }
                    else {
                        tnh0 = new tng(((tna)tdq0).b);
                    }
                }
                else {
                    tnh0 = new tnh(((tna)tdq0).b);
                }
                syi syi1 = tnh0.a(new syi(arr_b));
                arr_b1 = tnh0.b(this.a, syi1).a();
            }
            catch(syl syl0) {
                exception1 = syl0;
                arr_b1 = exception1.a;
            }
            catch(Exception exception0) {
                exception1 = exception0;
                arr_b1 = syn.k;
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

