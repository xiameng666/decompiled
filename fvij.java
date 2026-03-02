public final class fvij {
    private int a;
    private long b;
    private double c;

    public fvij() {
        this.a = -1;
    }

    public final fvhw a(fvgh fvgh0) {
        fvhw fvhw0;
        synchronized(this) {
            int v1 = fvgh0.i;
            if(v1 != this.a || !fvij.b(fvgh0)) {
                if(fvij.b(fvgh0)) {
                    this.b = fvgh0.d;
                    this.c = fvgh0.e;
                    this.a = v1;
                    return fvhw.o(fvgh0.b - this.b, -this.c);
                }
                this.a = -1;
                return null;
            }
            this.a = v1;
            fvhw0 = fvhw.o(fvgh0.b - this.b, -this.c);
        }
        return fvhw0;
    }

    private static boolean b(fvgh fvgh0) {
        return fvgh0.d != 0L && fvgh0.d != 0x8000000000000000L && fvgh0.b != 0L;
    }
}

