import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.ClientLanguageSettings;
import com.google.android.gms.languageprofile.LanguageFluencyParams;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;

public final class cbxf extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public cbxf() {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileService");
    }

    public cbxf(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileService");
        this.c = s;
        this.b = s1;
        this.a = cjts0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cbxe cbxe0 = null;
        switch(v) {
            case 1: {
                parcel0.readString();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    cbxe0 = (iInterface0 instanceof cbxe) ? ((cbxe)iInterface0) : new cbxe(iBinder0);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata1);
                azuf0.f(azud.d);
                azuf0.e(bbdp.cw);
                azuf0.g(bbdq.aU);
                azuf0.d(this.c);
                azuf0.c(this.b);
                cbyp cbyp0 = new cbyp(cbxe0, s, azuf0.a());
                this.a.b(cbyp0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                String s1 = parcel0.readString();
                LanguagePreferenceParams languagePreferenceParams0 = (LanguagePreferenceParams)wbz.a(parcel0, LanguagePreferenceParams.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    cbxe0 = (iInterface1 instanceof cbxe) ? ((cbxe)iInterface1) : new cbxe(iBinder1);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                azuf azuf1 = azug.b(apiMetadata2);
                azuf1.f(azud.d);
                azuf1.e(bbdp.cw);
                azuf1.g(bbdq.aU);
                azuf1.d(this.c);
                azuf1.c(this.b);
                azug azug0 = azuf1.a();
                cbyr cbyr0 = new cbyr(cbxe0, s1, this.c, languagePreferenceParams0, azug0);
                this.a.b(cbyr0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                String s2 = parcel0.readString();
                LanguageFluencyParams languageFluencyParams0 = (LanguageFluencyParams)wbz.a(parcel0, LanguageFluencyParams.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    cbxe0 = (iInterface2 instanceof cbxe) ? ((cbxe)iInterface2) : new cbxe(iBinder2);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                azuf azuf2 = azug.b(apiMetadata3);
                azuf2.f(azud.d);
                azuf2.e(bbdp.cw);
                azuf2.g(bbdq.aU);
                azuf2.d(this.c);
                azuf2.c(this.b);
                azug azug1 = azuf2.a();
                cbyq cbyq0 = new cbyq(cbxe0, s2, this.c, azug1);
                this.a.b(cbyq0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s3 = parcel0.readString();
                ClientLanguageSettings clientLanguageSettings0 = (ClientLanguageSettings)wbz.a(parcel0, ClientLanguageSettings.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cbxe0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                if(huln.e()) {
                    azuf azuf3 = azug.b(apiMetadata4);
                    azuf3.f(azud.d);
                    azuf3.e(bbdp.cw);
                    azuf3.g(bbdq.aU);
                    azuf3.d(this.c);
                    azuf3.c(this.b);
                    azug azug2 = azuf3.a();
                    cbyt cbyt0 = new cbyt(cbxe0, s3, this.c, clientLanguageSettings0, azug2);
                    this.a.b(cbyt0);
                }
                else {
                    cbxe0.a(Status.b);
                }
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                String s4 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cbxe0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                if(huln.e()) {
                    azuf azuf4 = azug.b(apiMetadata5);
                    azuf4.f(azud.d);
                    azuf4.e(bbdp.cw);
                    azuf4.g(bbdq.aU);
                    azuf4.d(this.c);
                    azuf4.c(this.b);
                    azug azug3 = azuf4.a();
                    cbys cbys0 = new cbys(((azxs)cbxe0), s4, this.c, azug3);
                    this.a.b(cbys0);
                }
                else {
                    ((azxs)cbxe0).a(Status.b);
                }
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                wbz.i(parcel0);
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    cbxe0 = (iInterface5 instanceof cbxe) ? ((cbxe)iInterface5) : new cbxe(iBinder5);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                azuf azuf5 = azug.b(apiMetadata6);
                azuf5.f(azud.d);
                azuf5.e(bbdp.cw);
                azuf5.g(bbdq.aU);
                azuf5.d(this.c);
                azuf5.c(this.b);
                azug azug4 = azuf5.a();
                cbyo cbyo0 = new cbyo(cbxe0, this.c, azug4);
                this.a.b(cbyo0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                String s5 = parcel0.readString();
                LanguagePreferenceParams languagePreferenceParams1 = (LanguagePreferenceParams)wbz.a(parcel0, LanguagePreferenceParams.CREATOR);
                int v1 = parcel0.readInt();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    cbxe0 = (iInterface6 instanceof cbxe) ? ((cbxe)iInterface6) : new cbxe(iBinder6);
                }
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cbxf.gr(parcel0);
                azuf azuf6 = azug.b(apiMetadata7);
                azuf6.f(azud.d);
                azuf6.e(bbdp.cw);
                azuf6.g(bbdq.aU);
                azuf6.d(this.c);
                azuf6.c(this.b);
                azug azug5 = azuf6.a();
                this.a.b(new cbyr(cbxe0, s5, this.c, languagePreferenceParams1, v1, azug5));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

