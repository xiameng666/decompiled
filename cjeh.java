public final class cjeh implements Runnable {
    public final cjer_LocationSettings a;
    public final cjeo b;

    public cjeh(cjer_LocationSettings cjer0, cjeo cjeo0) {
        this.a = cjer0;
        this.b = cjeo0;
    }

    @Override
    public final void run() {
        this.a.j(this.b);
    }
}

