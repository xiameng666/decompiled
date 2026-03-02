public final class bjx implements Runnable {
    public final bka a;
    public final String b;

    public bjx(bka bka0, String s) {
        this.a = bka0;
        this.b = s;
    }

    @Override
    public final void run() {
        bka bka0;
        try {
            bka0 = this.a;
            bka0.i.get();
            bka0.g("Surface terminated", bka.d.decrementAndGet(), bka.c.get());
        }
        catch(Exception exception0) {
            bcs.a("DeferrableSurface", "Unexpected surface termination for " + bka0 + "\nStack Trace:\n" + this.b);
            synchronized(bka0.e) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", bka0, Boolean.valueOf(bka0.g), ((int)bka0.f)), exception0);
            }
        }
    }
}

