public final class svu extends sta {
    public final srk a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final swc e;
    public final sxd f;
    public final sxd g;

    public svu(ssg ssg0, ssc ssc0, srk srk0, byte[] arr_b, byte[] arr_b1, sxd sxd0, sxd sxd1, byte[] arr_b2, swc swc0) {
        super(ssg0, ssc0);
        this.a = srk0;
        this.b = arr_b;
        this.c = arr_b1;
        if(sxd0.d() != sxd1.d()) {
            throw new stt("A KEK mac must be provided if KEK enc is provided, and vice versa");
        }
        if(ssc0.f() && !sxd0.d()) {
            throw new stt("An authentication keyset requiring static KEK must have KEK enc and KEK mac supplied");
        }
        this.f = sxd0;
        this.g = sxd1;
        this.d = arr_b2;
        this.e = swc0;
    }

    @Override  // ssx, ssw
    public final byte[] a() {
        sxk sxk0 = new sxk();
        ssc ssc0 = (ssc)this.m;
        sxk0.g(ssc0.h());
        if(ssc0.f()) {
            sxk0.g(((byte[])this.f.b()));
            sxk0.g(((byte[])this.g.b()));
        }
        sxk0.g(this.b);
        sxk0.g(this.c);
        sxk0.g(this.d);
        return sxk0.b();
    }

    public final int b() {
        return ((ssc)this.m).e() ? 3 : 1;
    }

    public final int c() {
        byte[] arr_b = ((ssc)this.m).h();
        int v = this.b();
        return arr_b[arr_b.length - v] & 15;
    }

    public final srp f() {
        return sxe.a(this.e, this.a, this.b);
    }

    public final srp g() {
        byte[] arr_b = (byte[])this.f.b();
        return sxe.a(this.e, this.a, arr_b);
    }

    public final srp h() {
        byte[] arr_b = (byte[])this.g.b();
        return sxe.a(this.e, this.a, arr_b);
    }

    public final srp i() {
        return sxe.a(this.e, this.a, this.c);
    }
}

