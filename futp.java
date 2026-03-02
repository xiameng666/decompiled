public final class futp {
    public fwyc a;
    public fwyc b;
    public fwyc c;
    public long d;
    public long e;

    public futp() {
        this.a = new fyaz(6);
        this.b = new fyaz(6);
        this.c = new fyaz(6);
        this.d = 0x7FFFFFFFFFFFFFFFL;
        this.e = 0x7FFFFFFFFFFFFFFFL;
    }

    public final void a() {
        long v = this.d;
        if(v != 0x7FFFFFFFFFFFFFFFL && this.e != 0x7FFFFFFFFFFFFFFFL) {
            fyaz fyaz0 = new fyaz(6);
            this.c = fyaz0;
            fyaz0.b(this.a);
            this.c.b(this.b);
            return;
        }
        if(this.e < v) {
            this.c = this.b;
            return;
        }
        this.c = this.a;
    }
}

