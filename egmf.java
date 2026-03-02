public final class egmf implements gftc {
    public final int a;
    public final egqs b;

    public egmf(int v, egqs egqs0) {
        this.a = v;
        this.b = egqs0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        egqs egqs0 = this.b;
        if(egqr.a(egqs0.e) == 3) {
            int v = egzf.a(((String)object0));
            if(!gggq.c(new hfuh(egqs0.f, egqs.a), new egmh(v)).i()) {
                return false;
            }
        }
        int v1 = egqs0.g;
        if(egqr.a(v1) == 2) {
            return egzf.b(((String)object0)) == this.a;
        }
        if(egqr.a(v1) == 3) {
            int v2 = egzf.b(((String)object0));
            return gggq.c(new hfuh(egqs0.h, egqs.b), new egmi(v2)).i();
        }
        return true;
    }
}

