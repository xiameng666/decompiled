public final class argh implements Runnable {
    public final argm a;

    public argh(argm argm0) {
        this.a = argm0;
    }

    @Override
    public final void run() {
        argm argm0 = this.a;
        if(argm0.d != 4) {
            return;
        }
        argm0.b.a();
        argm0.d = 1;
    }
}

