import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

public final class crwv {
    public final SetConsentStatusRequest a;

    public crwv() {
        this.a = new SetConsentStatusRequest();
    }

    public crwv(SetConsentStatusRequest setConsentStatusRequest0) {
        SetConsentStatusRequest setConsentStatusRequest1 = new SetConsentStatusRequest();
        this.a = setConsentStatusRequest1;
        setConsentStatusRequest1.a = setConsentStatusRequest0.a;
        setConsentStatusRequest1.b = setConsentStatusRequest0.b;
        setConsentStatusRequest1.c = setConsentStatusRequest0.c;
        setConsentStatusRequest1.d = setConsentStatusRequest0.d;
        setConsentStatusRequest1.e = setConsentStatusRequest0.e;
        setConsentStatusRequest1.f = setConsentStatusRequest0.f;
        setConsentStatusRequest1.g = setConsentStatusRequest0.g;
        setConsentStatusRequest1.h = setConsentStatusRequest0.h;
    }

    public final void a(ConsentStatus consentStatus0) {
        this.a.c = consentStatus0;
    }

    public final void b(Integer integer0) {
        this.a.f = integer0;
    }
}

