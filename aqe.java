public final class aqe implements Runnable {
    public final aqf a;

    public aqe(aqf aqf0) {
        this.a = aqf0;
    }

    @Override
    public final void run() {
        aqf aqf0 = this.a;
        if(!aqf0.a) {
            aqi aqi0 = aqf0.b.b;
            kay.c(aqi0.A == 7 || aqi0.A == 8);
            if(aqf0.b.d()) {
                aqi0.A(true);
                return;
            }
            aqi0.B(true);
        }
    }
}

