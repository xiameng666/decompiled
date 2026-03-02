public final class cjej implements Runnable {
    public final cjer_LocationSettings a;
    public final cjep b;

    public cjej(cjer_LocationSettings cjer0, cjep cjep0) {
        this.a = cjer0;
        this.b = cjep0;
    }

    @Override
    public final void run() {
        this.a.k(this.b);
    }
}

