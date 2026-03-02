import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;

public final class crwr {
    public final GetConsentInformationRequest a;

    public crwr() {
        this.a = new GetConsentInformationRequest();
    }

    public crwr(GetConsentInformationRequest getConsentInformationRequest0) {
        GetConsentInformationRequest getConsentInformationRequest1 = new GetConsentInformationRequest();
        this.a = getConsentInformationRequest1;
        getConsentInformationRequest1.a = getConsentInformationRequest0.a;
        getConsentInformationRequest1.b = getConsentInformationRequest0.b;
        getConsentInformationRequest1.c = getConsentInformationRequest0.c;
        getConsentInformationRequest1.d = getConsentInformationRequest0.d;
        getConsentInformationRequest1.e = getConsentInformationRequest0.e;
    }

    public final void a(Integer integer0) {
        this.a.c = integer0;
    }
}

