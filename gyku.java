public final class gyku implements Runnable {
    public final gykz a;
    public final gyjk b;

    public gyku(gykz gykz0, gyjk gyjk0) {
        this.a = gykz0;
        this.b = gyjk0;
    }

    @Override
    public final void run() {
        gykz gykz0;
        try {
            gykz0 = this.a;
            this.b.run();
        }
        catch(Exception exception0) {
            ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(exception0)).ar(0x4F6D)).B("%s ERROR in background job!", gykz0.b);
            gykz0.f = true;
        }
        gykz0.c.f(gykz0.e);
    }
}

