import android.content.Context;

public final class aqgg extends azts {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        aqgg.b = azss0;
        aqge aqge0 = new aqge();
        aqgg.c = aqge0;
        aqgg.a = new azta_api("GmsRestore.API", aqge0, azss0);
    }

    public aqgg(Context context0) {
        super(context0, aqgg.a, null, aztr_settings.a);
    }

    public final evql b(long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqgb(this, v);
        return this.jn(azzc0.a());
    }
}

