import android.content.Context;

public final class bmdz extends azts implements bmco {
    private static final azta_api a;
    private static final azss b;

    static {
        azss azss0 = new azss();
        bmdz.b = azss0;
        bmdz.a = new azta_api("Fido.FIDO_CREDENTIAL_STORE_API", new bmcu(), azss0);
    }

    public bmdz(Context context0) {
        super(context0, bmdz.a, azsx.s, aztr_settings.a);
    }

    @Override  // bmco
    public final evql b(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmdq(this, s);
        azzc0.d = 5404;
        return this.iG(azzc0.a());
    }

    @Override  // bmco
    public final void c(String s, long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmdn(this, s, v);
        azzc0.d = 5405;
        this.iG(azzc0.a());
    }
}

