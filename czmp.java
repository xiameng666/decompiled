public final class czmp implements Runnable {
    public final czno a;
    public final czvg b;

    public czmp(czno czno0, czvg czvg0) {
        this.a = czno0;
        this.b = czvg0;
    }

    @Override
    public final void run() {
        this.a.b.e(this.b);
    }
}

