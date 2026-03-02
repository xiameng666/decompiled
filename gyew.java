import j..util.Objects;

final class gyew implements gyjv {
    final gyey a;
    private gyfq b;

    public gyew(gyey gyey0) {
        Objects.requireNonNull(gyey0);
        this.a = gyey0;
        super();
    }

    @Override  // gyjv
    public final void a(gyju gyju0) {
        if(this.b != null) {
            gyex gyex0 = new gyex(this.a, gyju0);
            gyll[] arr_gyll = new gyll[1];
            gyfq gyfq0 = this.b;
            batl.s(gyfq0);
            arr_gyll[0] = gyfq0.b;
            this.a.d(gyex0, arr_gyll);
            this.b = null;
        }
    }

    @Override  // gyjv
    public final void b(gyjy gyjy0) {
        if(this.b == null) {
            Objects.requireNonNull(this.a.h);
            this.b = new gyfq(this.a.h, this.a.q, this.a.r);
            gyer gyer0 = new gyer(this.a, gyjy0);
            this.a.d(gyer0, new gyll[]{this.b});
        }
    }
}

