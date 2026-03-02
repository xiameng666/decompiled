import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.HashMap;

public final class ahua extends wby implements ahub, cjug {
    private final String a;
    private final String b;
    private final bxod c;
    private final cjts d;
    private final aenr e;

    public ahua() {
        super("com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public ahua(cjts cjts0, bxod bxod0, String s, String s1) {
        super("com.google.android.gms.auth.api.identity.internal.ISignInService");
        this.b = s1;
        this.a = s;
        this.c = bxod0;
        this.d = cjts0;
        this.e = (aenr)aenr.a.b();
    }

    @Override  // ahub
    public final void a(ahri ahri0, BeginSignInRequest beginSignInRequest0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cc);
        this.e.a();
        String s = hplu.a.b().b();
        HashMap hashMap0 = new HashMap();
        bxjj.a(ffrv.h, s, hashMap0);
        bxjj.a(ffrv.w, s, hashMap0);
        bxjj.a(ffrv.B, s, hashMap0);
        bxjk bxjk0 = new bxjk("*", hashMap0);
        String s1 = bxol.a();
        String s2 = (String)MoreObjects.firstNonNull(beginSignInRequest0.c, s1);
        bxrz bxrz0 = (bxrz)adxm.a.mr();
        bxrz0.ad(this.a, bxjk0);
        Objects.requireNonNull(ahri0);
        adwy adwy0 = new adwy(ahri0);
        bxrz0.ak(bbcu.dn, adwy0);
        bxrz0.ap(bxnj.v, s2);
        cjtm cjtm0 = ((ahfp)bxrz0.ag(bbcu.dn).B(new adxm(this.a, s2, beginSignInRequest0, this.c, null))).b(0xD4, "BeginSignInOperation", this.c(apiMetadata0));
        this.d.b(cjtm0);
    }

    @Override  // ahub
    public final void b(azxs azxs0, String s, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.ce);
        this.e.a();
        String s1 = (String)MoreObjects.firstNonNull(s, bxol.a());
        bxrz bxrz0 = (bxrz)adxo.a.mr();
        Objects.requireNonNull(azxs0);
        adwx adwx0 = new adwx(azxs0);
        bxrz0.al(bbcu.dn, adwx0);
        bxrz0.ap(bxnj.aj, s1);
        cjtm cjtm0 = bxrz0.ag(bbcu.dn).ar(this.a).b(0xD4, "SignOutOperation", this.c(apiMetadata0));
        this.d.b(cjtm0);
    }

    private final azug c(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.N);
        azuf0.g(bbdq.aL);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azuf0.h(true);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ahri ahri0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
                    ahri0 = (iInterface0 instanceof ahri) ? ((ahri)iInterface0) : new ahrg(iBinder0);
                }
                BeginSignInRequest beginSignInRequest0 = (BeginSignInRequest)wbz.a(parcel0, BeginSignInRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahua.gr(parcel0);
                this.a(ahri0, beginSignInRequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ahri0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                String s = parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahua.gr(parcel0);
                this.b(((azxs)ahri0), s, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
                    ahri0 = (iInterface2 instanceof ahtd) ? ((ahtd)iInterface2) : new ahtd(iBinder2);
                }
                GetSignInIntentRequest getSignInIntentRequest0 = (GetSignInIntentRequest)wbz.a(parcel0, GetSignInIntentRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahua.gr(parcel0);
                ccmq.a().a(bbdg.cd);
                this.e.a();
                bxrz bxrz0 = (bxrz)adxu.a.mr();
                Objects.requireNonNull(ahri0);
                adwv adwv0 = new adwv(((ahtd)ahri0));
                bxrz0.ak(bbcu.dn, adwv0);
                bxrz0.ap(bxnj.av, getSignInIntentRequest0.c);
                cjtm cjtm0 = ((ahfp)bxrz0.ag(bbcu.dn).B(new adxu(getSignInIntentRequest0, this.c, getSignInIntentRequest0.c, this.a))).b(0xD4, "GetSignInIntentOperation", this.c(apiMetadata2));
                this.d.b(cjtm0);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
                    ahri0 = (iInterface3 instanceof ahtc) ? ((ahtc)iInterface3) : new ahtc(iBinder3);
                }
                GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest0 = (GetPhoneNumberHintIntentRequest)wbz.a(parcel0, GetPhoneNumberHintIntentRequest.CREATOR);
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahua.gr(parcel0);
                ccmq.a().a(bbdg.cf);
                bxrz bxrz1 = (bxrz)adxq.a.mr();
                Objects.requireNonNull(ahri0);
                adww adww0 = new adww(((ahtc)ahri0));
                bxrz1.ak(bbcu.dn, adww0);
                bxrz1.ap(bxnj.aL, s1);
                cjtm cjtm1 = ((ahfp)bxrz1.ag(bbcu.dn).B(new adxq(this.c, getPhoneNumberHintIntentRequest0, s1, this.a))).b(0xD4, "GetPhoneNumberHintIntentOperation", this.c(apiMetadata3));
                this.d.b(cjtm1);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

