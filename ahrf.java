import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleRequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ahrf extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final bxod c;
    private final String d;

    public ahrf() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public ahrf(cjts cjts0, bxod bxod0, String s, String s1) {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        this.b = s1;
        this.a = cjts0;
        this.d = s;
        this.c = bxod0;
    }

    private final azug a(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.N);
        azuf0.g(bbdq.aL);
        azuf0.d(this.d);
        azuf0.c(this.b);
        azuf0.h(true);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
                    object0 = (iInterface0 instanceof ahre) ? ((ahre)iInterface0) : new ahre(iBinder0);
                }
                AuthorizationRequest authorizationRequest0 = (AuthorizationRequest)wbz.a(parcel0, AuthorizationRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrf.gr(parcel0);
                ccmq.a().a(bbdg.ch);
                bxrz bxrz0 = ((bxrz)aejk.a.mr()).ag(bbcu.dx);
                Objects.requireNonNull(object0);
                aeja aeja0 = new aeja(((ahre)object0));
                bxrz0.ak(bbcu.dx, aeja0);
                bxrz0.ap(bxnj.au, authorizationRequest0.g);
                cjtm cjtm0 = ((ahfp)bxrz0.B(new aejk(this.d, authorizationRequest0.g, authorizationRequest0, this.c))).b(0xDB, "AuthorizeOperation", this.a(apiMetadata0));
                this.a.b(cjtm0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback");
                    object0 = (iInterface1 instanceof ahuf) ? ((ahuf)iInterface1) : new ahuf(iBinder1);
                }
                VerifyWithGoogleRequest verifyWithGoogleRequest0 = (VerifyWithGoogleRequest)wbz.a(parcel0, VerifyWithGoogleRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrf.gr(parcel0);
                bxjk bxjk0 = new bxjk(hplu.a.b().a(), ggnf.a);
                bxrz bxrz1 = (bxrz)aejz.a.mr();
                bxrz1.E(new aejy());
                bxrz1.ad(this.d, bxjk0);
                bxrz bxrz2 = bxrz1.ag(bbcu.dx);
                Objects.requireNonNull(object0);
                aejb aejb0 = new aejb(((ahuf)object0));
                bxrz2.ak(bbcu.dx, aejb0);
                bxrz2.ap(bxnj.bh, verifyWithGoogleRequest0.d);
                cjtm cjtm1 = ((ahfp)bxrz2.B(new aejz(this.d, verifyWithGoogleRequest0.d, verifyWithGoogleRequest0))).b(0xDB, "VerifyWithGoogleOperation", this.a(apiMetadata1));
                this.a.b(cjtm1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    object0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                RevokeAccessRequest revokeAccessRequest0 = (RevokeAccessRequest)wbz.a(parcel0, RevokeAccessRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrf.gr(parcel0);
                bxrz bxrz3 = (bxrz)aeju.a.mr();
                bxrz3.E(new aejt());
                bxrz bxrz4 = bxrz3.ag(bbcu.dx);
                Objects.requireNonNull(object0);
                aejc aejc0 = new aejc(((azxs)object0));
                bxrz4.al(bbcu.dx, aejc0);
                bxrz4.ap(bxnj.bq, revokeAccessRequest0.c);
                cjtm cjtm2 = ((ahfp)bxrz4.B(new aeju(this.d, revokeAccessRequest0.c, revokeAccessRequest0))).b(0xDB, "RevokeAccessOperation", this.a(apiMetadata2));
                this.a.b(cjtm2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    object0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                }
                ClearTokenRequest clearTokenRequest0 = (ClearTokenRequest)wbz.a(parcel0, ClearTokenRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrf.gr(parcel0);
                bxrz bxrz5 = (bxrz)aejn.a.mr();
                bxrz5.E(new aejm());
                bxrz bxrz6 = bxrz5.ag(bbcu.dx);
                Objects.requireNonNull(object0);
                aejc aejc1 = new aejc(((azxs)object0));
                bxrz6.al(bbcu.dx, aejc1);
                bxrz6.ap(bxnj.bv, clearTokenRequest0.b);
                cjtm cjtm3 = bxrz6.L(this.d, clearTokenRequest0.b, clearTokenRequest0).b(0xDB, "ClearTokenOperation", this.a(apiMetadata3));
                this.a.b(cjtm3);
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

