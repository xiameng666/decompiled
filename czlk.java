public final class czlk implements Runnable {
    public final czln a;
    public final String b;

    public czlk(czln czln0, String s) {
        this.a = czln0;
        this.b = s;
    }

    @Override
    public final void run() {
        czlm czlm0 = (czlm)this.a.a.get(this.b);
        this.a.e(this.b, czlm0);
    }
}

