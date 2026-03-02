public final class gpiu implements Runnable {
    public final gpiw a;
    public final gpiv b;

    public gpiu(gpiw gpiw0, gpiv gpiv0) {
        this.a = gpiw0;
        this.b = gpiv0;
    }

    @Override
    public final void run() {
        synchronized(this.a.b) {
            this.a.b.remove(this.b);
        }
    }
}

