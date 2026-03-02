import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

final class csez implements evqf {
    final boolean a;
    final SetConsentStatusRequest b;
    final csdj c;

    public csez(boolean z, SetConsentStatusRequest setConsentStatusRequest0, csdj csdj0) {
        this.a = z;
        this.b = setConsentStatusRequest0;
        this.c = csdj0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        if(this.a) {
            csff.a(this.b.a, this.c);
        }
    }
}

