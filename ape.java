public final class ape implements Runnable {
    public final aqi a;
    public final boolean b;

    public ape(aqi aqi0, boolean z) {
        this.a = aqi0;
        this.b = z;
    }

    @Override
    public final void run() {
        aqi aqi0 = this.a;
        aqi0.x = this.b;
        if(this.b && (aqi0.A == 4 || aqi0.A == 5)) {
            aqi0.A(false);
        }
    }
}

