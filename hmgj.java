public final class hmgj extends hmgk {
    public final hmgf a;
    public final hmbb b;
    public hmdj c;
    public hmdi d;
    public hmcu e;
    public hmgz f;
    public hmgz g;
    public int h;
    public int i;

    public hmgj(hmgf hmgf0) {
        this.a = hmgf0;
        this.b = hmhe.a();
    }

    @Override  // hmgk
    public final hmgf a() {
        return this.a;
    }

    public final hmgm c() {
        this.b.e();
        throw new hmhy("DECLINED");
    }

    @Override  // hmgk
    public final boolean d() {
        if(!hmbz.d(this.a.g.a, this.a).isEmpty()) {
            this.b.e();
            return false;
        }
        return true;
    }
}

