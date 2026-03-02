public final class bwi implements Runnable {
    public final bwo a;
    public final bel b;

    public bwi(bwo bwo0, bel bel0) {
        this.a = bwo0;
        this.b = bel0;
    }

    @Override
    public final void run() {
        bwo bwo0 = this.a;
        if(bwo0.f != null && bwo0.f == this.b) {
            bwo0.f = null;
            bwo0.e = null;
        }
        bwo0.h();
    }
}

