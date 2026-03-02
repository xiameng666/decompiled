public final class api implements Runnable {
    public final aqi a;

    public api(aqi aqi0) {
        this.a = aqi0;
    }

    @Override
    public final void run() {
        aqi aqi0 = this.a;
        aqi0.O();
        if(aqi0.A != 1 && aqi0.A != 2) {
            bac bac0 = new bac(8, null);
            aqi0.e.a(bim.c, bac0);
            aqi0.K(2, bac0);
            aqi0.g.c();
            aqi0.z.a();
            if(aqi0.i != null) {
                aqi0.M();
                return;
            }
            aqi0.q();
        }
    }
}

