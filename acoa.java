import android.content.Context;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.Feature;

public final class acoa extends azts {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        acoa.b = azss0;
        acnt acnt0 = new acnt();
        acoa.c = acnt0;
        acoa.a = new azta_api("Asterism.API", acnt0, azss0);
    }

    public acoa(Context context0) {
        super(context0, acoa.a, azsx.s, aztr_settings.a);
    }

    public final evql b(GetAsterismConsentRequest getAsterismConsentRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new acnv(this, getAsterismConsentRequest0);
        azzc0.c = new Feature[]{bbvm.a};
        azzc0.d = 11301;
        return this.iG(azzc0.a());
    }

    public final evql c(SetAsterismConsentRequest setAsterismConsentRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new acnx(this, setAsterismConsentRequest0);
        azzc0.c = new Feature[]{bbvm.a};
        azzc0.d = 11302;
        return this.iG(azzc0.a());
    }
}

