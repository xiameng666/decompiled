public final class bha implements Runnable {
    public final bhd a;

    public bha(bhd bhd0) {
        this.a = bhd0;
    }

    @Override
    public final void run() {
        this.a.c = null;
        this.a.b();
    }
}

