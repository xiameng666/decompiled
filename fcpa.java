public final class fcpa implements Runnable {
    public final fcpc a;

    public fcpa(fcpc fcpc0) {
        this.a = fcpc0;
    }

    @Override
    public final void run() {
        this.a.b.c(this.a.a, false);
        this.a.b.s = true;
        this.a.b.r.b(new fctb("Something went wrong", "Please try again later", 1, bbqa.a()));
    }
}

