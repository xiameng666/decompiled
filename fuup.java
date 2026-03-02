final class fuup {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public fuup() {
        this.a = 0;
        this.c = -1L;
        this.d = -1L;
        this.b = 0;
        this.e = -1L;
    }

    public final void a(long v) {
        if(this.a > 0 && v - this.d > 250000L) {
            this.c = -1L;
            this.d = -1L;
            this.a = 0;
            this.b = 0;
        }
        if(this.b > 0 && v - this.e > 1000000L) {
            this.b = 0;
        }
    }
}

