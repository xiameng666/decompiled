abstract class iavq implements Runnable {
    private final ialq a;

    protected iavq(ialq ialq0) {
        this.a = ialq0;
    }

    public abstract void a();

    @Override
    public final void run() {
        ialq ialq0 = this.a.a();
        try {
            this.a();
        }
        finally {
            this.a.c(ialq0);
        }
    }
}

