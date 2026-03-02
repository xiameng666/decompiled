public final class bqn implements bcc {
    public final Object a;
    public bcd b;
    private final bcc c;
    private boolean d;

    public bqn(bcc bcc0) {
        this.c = bcc0;
        this.a = new Object();
    }

    @Override  // bcc
    public final void a(long v, bcd bcd0) {
        ibuq.f(bcd0, "screenFlashListener");
        synchronized(this.a) {
            this.d = true;
            this.b = bcd0;
        }
        bcc bcc0 = this.c;
        if(bcc0 != null) {
            bcc0.a(v, new bqm(this));
            return;
        }
        bcs.a("ScreenFlashWrapper", "apply: screenFlash is null!");
        this.d();
    }

    @Override  // bcc
    public final void b() {
        this.c();
    }

    public final void c() {
        synchronized(this.a) {
            if(this.d) {
                bcc bcc0 = this.c;
                if(bcc0 == null) {
                    bcs.a("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
                else {
                    bcc0.b();
                }
            }
            else {
                bcs.d("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            this.d = false;
        }
    }

    public final void d() {
        synchronized(this.a) {
            bcd bcd0 = this.b;
            if(bcd0 != null) {
                bcd0.a();
            }
            this.b = null;
        }
    }
}

