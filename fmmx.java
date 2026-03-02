public final class fmmx implements Runnable {
    public final String a;

    public fmmx(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        synchronized(fmna.b) {
            fmna.b.add(this.a);
            fmna.c.remove(this.a);
        }
    }
}

