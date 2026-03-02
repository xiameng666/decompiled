public final class hmol extends hmnz {
    public final hmoh d;
    public hmok e;
    public hmok f;
    public boolean g;
    public boolean h;

    public hmol() {
        this.c = new hmoh();
        hmoh hmoh0 = (hmoh)this.c;
        this.d = hmoh0;
        hmoh0.f = 2;
    }

    @Override  // hmnz
    public final void a(hmoe hmoe0) {
        this.d.b(hmoe0);
    }

    @Override  // hmnz
    public final int g() {
        return this.d.f;
    }

    @Override  // hmnz
    public final hmoe h() {
        return this.d.a();
    }

    @Override  // hmnz
    public final void i(hmno hmno0) {
        this.e = new hmok(this.d.l);
        this.a = new byte[4];
        this.d.d(new byte[4]);
        super.i(hmno0);
        this.m(false, hmno0);
    }

    @Override  // hmnz
    public final void m(boolean z, hmno hmno0) {
        if(z) {
            hmoh hmoh0 = this.d;
            hmoh0.l = new hmok(this.e);
            if(this.p()) {
                hmoh0.m = new hmok(this.f);
            }
        }
        else {
            hmoh hmoh1 = this.d;
            hmoh1.l = new hmok(hmoh1.l);
            if(this.p()) {
                this.f = new hmok(hmoh1.m);
            }
        }
        this.g = false;
        this.h = false;
    }

    public final void n() {
        hmok hmok0 = new hmok(this.e);
        this.f = hmok0;
        hmok0.b(this.e);
    }

    public final boolean o() {
        return (this.d.n & 2) != 0;
    }

    public final boolean p() {
        return (this.d.n & 1) != 0;
    }
}

