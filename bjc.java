public final class bjc implements Runnable {
    public final apw a;

    public bjc(apw apw0) {
        this.a = apw0;
    }

    @Override
    public final void run() {
        aqi aqi0 = this.a.b;
        if(aqi0.A != 4 && aqi0.A != 5) {
            return;
        }
        aqi0.B(false);
    }
}

