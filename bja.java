public final class bja implements Runnable {
    public final bjb a;
    public final bin b;

    public bja(bjb bjb0, bin bin0) {
        this.a = bjb0;
        this.b = bin0;
    }

    @Override
    public final void run() {
        bjb bjb0 = this.a;
        synchronized(bjb0.a) {
            bjb0.c.remove(this.b);
            if(bjb0.c.isEmpty()) {
                kay.i(bjb0.e);
                bjb0.e.b(null);
                bjb0.e = null;
                bjb0.d = null;
            }
        }
    }
}

