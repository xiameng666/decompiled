public final class hmgl {
    private final hmhi a;
    private final hmga b;
    private final hmcs c;
    private final hmba d;

    public hmgl(hmhi hmhi0, hmga hmga0, hmcs hmcs0, hmba hmba0) {
        this.a = hmhi0;
        this.b = hmga0;
        this.c = hmcs0;
        this.d = hmba0;
    }

    public final hmgk a(int v) {
        hmgk hmgk0;
        hmgd hmgd0;
        if(v - 1 == 0) {
            hmgd0 = new hmgc();
            hmgd0.g = new hmbz(null);
            hmgd0.i = new hmft(((hmgc)hmgd0));
            hmgk0 = new hmgi(hmgd0);
        }
        else {
            hmgd0 = new hmgd();
            hmgd0.g = new hmbz(null);
            hmgd0.i = new hmfu(hmgd0);
            hmgk0 = new hmgj(hmgd0);
        }
        hmgd0.t = this.d;
        hmgd0.p = this.c;
        hmgd0.u = this.b.e;
        hmgd0.e = new hmdi();
        hmgd0.f = new hmdj();
        hmgd0.h = new hmcp(this.b.b);
        hmgd0.j = this.b.c;
        hmgd0.k = this.b.b;
        hmgd0.m = this.b.a;
        hmgd0.l = this.b.d;
        hmgd0.q = this.a;
        hmgd0.n = new hmde(hmgd0.e, hmgd0.f);
        hmgd0.r = new hmfz();
        return hmgk0;
    }
}

