public final class bix implements bls {
    private final bdj b;

    public bix() {
        this.b = new biy();
    }

    @Override  // bdj
    public final bdi a(biv biv0) {
        if(!this.b.a(biv0).e) {
            Throwable throwable0 = biv0.c;
            if((throwable0 instanceof bjh)) {
                bcs.a("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                return ((bjh)throwable0).a <= 0 ? bdi.a : bdi.c;
            }
            return bdi.a;
        }
        return bdi.b;
    }

    @Override  // bdj
    public final void b() {
    }

    @Override  // bls
    public final bdj c() {
        return new bix();
    }
}

