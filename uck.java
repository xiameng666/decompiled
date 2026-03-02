import j..util.Objects;

final class uck implements Runnable {
    final ucn a;

    public uck(ucn ucn0) {
        Objects.requireNonNull(ucn0);
        this.a = ucn0;
        super();
    }

    @Override
    public final void run() {
        while(true) {
            try {
                ucm ucm0 = (ucm)this.a.b.remove();
                this.a.c(ucm0);
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

