public final class hmoj extends hmnz {
    public final hmog d;
    public byte[] e;

    public hmoj() {
        this.c = new hmog();
        hmog hmog0 = (hmog)this.c;
        this.d = hmog0;
        hmog0.f = 5;
    }

    @Override  // hmnz
    public final void a(hmoe hmoe0) {
        this.d.b(hmoe0);
        this.a = this.d.a;
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
    public final void m(boolean z, hmno hmno0) {
        if(z) {
            hmog hmog0 = this.d;
            byte[] arr_b = hmog0.l;
            if(arr_b != null) {
                ++hmog0.o;
                byte[] arr_b1 = hmno0.i(hmog0.r, arr_b, new byte[16], 2);
                hmog0.p = arr_b1;
                hmog0.d(hmpy.F(new byte[][]{hmog0.g(hmog0.o), arr_b1}));
                byte[] arr_b2 = this.e;
                if(arr_b2 != null) {
                    hmog0.n = arr_b2;
                }
                this.b = true;
            }
            return;
        }
        this.n();
    }

    public final void n() {
        this.d.l = null;
    }
}

