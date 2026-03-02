public final class czzg implements Runnable {
    public final czzi a;
    public final gmcu b;
    public final String c;

    public czzg(czzi czzi0, gmcu gmcu0, String s) {
        this.a = czzi0;
        this.b = gmcu0;
        this.c = s;
    }

    @Override
    public final void run() {
        gmcu gmcu0 = this.b;
        String s = this.c;
        czzi czzi0 = this.a;
        if(czzi0.a != null && czzi0.a.b()) {
            gmcu0.q(czzi0.a.a(czzi.a(s)));
            return;
        }
        ggeo ggeo0 = czzi.a(s);
        gmcu0.q(bhnc.c(czzi0.b, "tachyon_registration", ggeo0));
    }
}

