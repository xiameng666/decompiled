public final class bhb implements Runnable {
    public final bhd a;
    public final bgw b;

    public bhb(bhd bhd0, bgw bgw0) {
        this.a = bhd0;
        this.b = bgw0;
    }

    @Override
    public final void run() {
        this.a.d.remove(this.b);
    }
}

