public final class audh implements Runnable {
    public final audm a;
    public final String b;

    public audh(audm audm0, String s) {
        this.a = audm0;
        this.b = s;
    }

    @Override
    public final void run() {
        audm audm0 = this.a;
        String s = this.b;
        if(s != null) {
            audm0.n.c(s, new Object[0]);
            avjj.a().c(audm0.b, s);
        }
        audm0.f.k(0);
        audm0.e();
    }
}

