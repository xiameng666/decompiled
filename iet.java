public final class iet {
    public final ieq a;
    public final ieq b;
    public final ieq c;

    public iet() {
        this.a = new ieq();
        this.b = new ieq();
        this.c = new ieq();
    }

    public final boolean a() {
        return !this.a.d() || !this.c.d() || !this.b.d();
    }

    public final boolean b(ify ify0) {
        return ify0.i != null && (this.a.c(ify0) || this.b.c(ify0));
    }

    public final void c(ify ify0) {
        this.a.e(ify0);
        this.b.e(ify0);
        this.c.e(ify0);
    }

    public final void d(ify ify0, int v) {
        switch(v - 1) {
            case 0: {
                this.a.b(ify0);
                this.c.b(ify0);
                return;
            }
            case 1: {
                this.b.b(ify0);
                this.c.b(ify0);
                return;
            }
            case 2: {
                if(ify0.i != null) {
                    this.c.b(ify0);
                    return;
                }
                this.a.b(ify0);
                return;
            }
            default: {
                if(ify0.i != null) {
                    this.c.b(ify0);
                    return;
                }
                this.b.b(ify0);
            }
        }
    }
}

