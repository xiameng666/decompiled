import android.content.SharedPreferences.Editor;
import j..util.Objects;

final class crnd implements Runnable {
    final crdk a;
    final crni b;

    public crnd(crni crni0, crdk crdk0) {
        this.a = crdk0;
        Objects.requireNonNull(crni0);
        this.b = crni0;
        super();
    }

    @Override
    public final void run() {
        crni crni0 = this.b;
        crjx crjx0 = crni0.ap();
        crjx0.m();
        crjx0.n();
        int v = crjx0.d().b;
        crdk crdk0 = this.a;
        int v1 = crdk0.b;
        if(crmb.r(v1, v)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = crjx0.b().edit();
            sharedPreferences$Editor0.putString("dma_consent_settings", crdk0.c);
            sharedPreferences$Editor0.apply();
            crni0.aJ().k.b("Setting DMA consent(FE)", crdk0);
            if(crni0.k().E()) {
                croz croz0 = crni0.k();
                croz0.n();
                croz0.a();
                croz0.x(new crob(croz0));
                return;
            }
            crni0.k().H();
            return;
        }
        crni0.aJ().i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(v1));
    }
}

