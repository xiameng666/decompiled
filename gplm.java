public final class gplm implements Runnable {
    public final gplp a;
    public final iapk b;
    public final iaof_metadata c;

    public gplm(gplp gplp0, iapk iapk0, iaof_metadata iaof0) {
        this.a = gplp0;
        this.b = iapk0;
        this.c = iaof0;
    }

    @Override
    public final void run() {
        iapk iapk0 = this.b;
        iaof_metadata iaof0 = this.c;
        gplp gplp0 = this.a;
        if(!gplp0.b) {
            try {
                gplp0.a.a(iapk0, iaof0);
            }
            finally {
                gplp0.b = true;
                gplp0.c.h.a();
            }
        }
    }
}

