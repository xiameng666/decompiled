public final class tfl implements essa {
    public tgn a;
    public tiy b;
    public byte[] c;
    private static final String d = "tfl";
    private final tfn e;

    static {
    }

    public tfl() {
        this.e = new tfn(this);
        tjk.f("--> AndroidPayPaymentState", new Object[0]);
        tjk.f("<-- AndroidPayPaymentState", new Object[0]);
    }

    @Override  // essa
    public final essh a() {
        tjk.f("--> close", new Object[0]);
        tjk.f("<-- close", new Object[0]);
        return this.e;
    }

    protected final void b(Exception exception0, tgn tgn0) {
        tjk.d("checkCompleted() - {}", exception0, new Object[]{tgn0});
        if(exception0 != null) {
            tjk.e("failure()", exception0);
            if((exception0 instanceof tfu)) {
                this.e.c(((tfu)exception0).a, ((tfu)exception0));
                return;
            }
            this.e.c(tft.e, exception0);
            return;
        }
        if(tgn0 != null && tgn0.b()) {
            tjk.f("Transaction is completed", new Object[0]);
            if(tgo.b == tgn0.c) {
                tjk.f("Transaction is approved", new Object[0]);
                this.e.f(1);
                return;
            }
            tjk.f("Transaction is declined", new Object[0]);
            this.e.c(tft.i, null);
        }
    }

    public final void c() {
        this.e.b = true;
    }

    @Override  // essa
    public final byte[] d(byte[] arr_b) {
        byte[] arr_b1;
        tjk.f("--> processApdu", new Object[0]);
        long v = System.currentTimeMillis();
        tjk.f("processApdu() - apdu {}", new Object[]{arr_b});
        teq teq0 = null;
        try {
            try {
                tfn tfn0 = this.e;
                tjk.f("apdu()", new Object[0]);
                if(tfn0.c == 3) {
                    tfn0.f(0);
                }
                tix tix0 = ((tiv)this.b).a(Byte.valueOf(new ten(arr_b).a[1]));
                ten ten0 = tix0.a(new ten(arr_b));
                teo teo0 = tix0.b(this.a, ten0);
                arr_b1 = teo0.a();
                tjk.f("processApdu() - response {}", new Object[]{teo0});
                goto label_29;
            }
            catch(teq teq1) {
            }
            catch(Exception exception0) {
                goto label_19;
            }
            teq0 = teq1;
            arr_b1 = teq0.a;
            goto label_29;
        label_19:
            tjk.g("error processing apdu", exception0);
        }
        catch(Throwable throwable0) {
            this.b(null, this.a);
            tjk.b(tfl.d, v);
            tjk.f("<-- processApdu", new Object[0]);
            throw throwable0;
        }
        this.b(exception0, this.a);
        tjk.b(tfl.d, v);
        tjk.f("<-- processApdu", new Object[0]);
        return tes.i;
    label_29:
        this.b(teq0, this.a);
        tjk.b(tfl.d, v);
        tjk.f("<-- processApdu", new Object[0]);
        return arr_b1;
    }
}

