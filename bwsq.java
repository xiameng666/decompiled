public final class bwsq implements Runnable {
    public final bwsr a;

    public bwsq(bwsr bwsr0) {
        this.a = bwsr0;
    }

    @Override
    public final void run() {
        this.a.a = true;
    }
}

