public final class armb implements Runnable {
    public final armf a;
    public final armd b;

    public armb(armf armf0, armd armd0) {
        this.a = armf0;
        this.b = armd0;
    }

    @Override
    public final void run() {
        try {
            this.a.c(this.b);
        }
        catch(InterruptedException interruptedException0) {
            armf.a.g("Reading interrupted: ", interruptedException0, new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}

