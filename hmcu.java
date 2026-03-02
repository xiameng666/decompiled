public final class hmcu extends hmdb {
    public hmcv a;
    public hmgz b;
    public hmgz c;
    public hmgz d;
    public hmgz e;
    public hmgz f;
    public hmgz g;
    public final hmgz h;
    public final hmgz i;
    public final hmgz j;

    public hmcu(hmie hmie0) {
        super(hmie0.a());
        hmid hmid0 = hmie0.c();
        byte[] arr_b = hmid0.a;
        if(arr_b == null) {
            throw new hmfq(hmfl.w);
        }
        this.m = hmgz.e(arr_b);
        if(this.m.b() < 18) {
            throw new hmfq(hmfl.O);
        }
        if(hmid0.c == null || hmid0.c.length <= 0) {
            throw new hmfq(hmfl.B);
        }
        this.a = new hmcv(hmid0.c);
        byte[] arr_b1 = hmid0.d;
        if(arr_b1 == null) {
            throw new hmfq(hmfl.D);
        }
        this.b = hmgz.e(arr_b1);
        byte[] arr_b2 = hmid0.e;
        if(arr_b2 == null) {
            throw new hmfq(hmfl.E);
        }
        this.c = hmgz.e(arr_b2);
        byte[] arr_b3 = hmid0.f;
        if(arr_b3 == null) {
            throw new hmfq(hmfl.F);
        }
        if(arr_b3[0] > 9) {
            throw new hmfq(hmfl.F);
        }
        this.d = hmgz.e(arr_b3);
        byte[] arr_b4 = hmid0.b;
        if(arr_b4 != null) {
            this.e = hmgz.e(arr_b4);
        }
        byte[] arr_b5 = hmid0.g;
        if(arr_b5 != null) {
            this.f = hmgz.e(arr_b5);
        }
        this.o = 1;
        this.p = 1;
        this.h = new hmgz("FF0000000000");
        this.i = new hmgz("FF0000000000");
        this.j = new hmgz("FF0000000000");
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        this.k.i();
        hmbb0.e();
        this.l.i();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        this.a.a().a();
        hmbb0.e();
        this.b.i();
        hmbb0.e();
        this.c.i();
        hmbb0.e();
        this.d.i();
        hmbb0.e();
        hmgz hmgz0 = this.e;
        if(hmgz0 != null) {
            hmgz0.i();
        }
        hmbb0.e();
        hmgz hmgz1 = this.f;
        if(hmgz1 != null) {
            hmgz1.i();
        }
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        return "DsrpProfileData";
    }
}

