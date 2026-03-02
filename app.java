public final class app implements Runnable {
    public final aqi a;
    public final String b;

    public app(aqi aqi0, String s) {
        this.a = aqi0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.O();
        this.a.a.h(this.b);
        this.a.C();
    }
}

