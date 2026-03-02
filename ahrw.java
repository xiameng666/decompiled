import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ahrw extends wby implements ahrx, cjug {
    private final String a;
    private final String b;
    private final String c;
    private final bxod d;
    private final cjts e;

    public ahrw() {
        super("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public ahrw(cjts cjts0, bxod bxod0, String s, String s1, String s2) {
        super("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        this.b = s2;
        this.a = s;
        this.c = s1;
        this.d = bxod0;
        this.e = cjts0;
    }

    @Override  // ahrx
    public final void a(ahty ahty0, SavePasswordRequest savePasswordRequest0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.cj);
        ((aenr)aenr.a.b()).a();
        bxrz bxrz0 = ((bxrz)aesd.a.mr()).ag(bbcu.dB);
        Objects.requireNonNull(ahty0);
        aerw aerw0 = new aerw(ahty0);
        bxrz0.ak(bbcu.dB, aerw0);
        bxrz0.ap(bxnj.aq, savePasswordRequest0.b);
        cjtm cjtm0 = bxrz0.Q(savePasswordRequest0, this.a, savePasswordRequest0.b, this.d, this.c).b(0xDF, "SavePasswordOperation", this.c(apiMetadata0));
        this.e.b(cjtm0);
    }

    private final azug c(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.N);
        azuf0.g(bbdq.aL);
        azuf0.d(this.c);
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
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
                    object0 = (iInterface0 instanceof ahtv) ? ((ahtv)iInterface0) : new ahtv(iBinder0);
                }
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest0 = (SaveAccountLinkingTokenRequest)wbz.a(parcel0, SaveAccountLinkingTokenRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrw.gr(parcel0);
                ccmq.a().a(bbdg.ci);
                String s = bxol.a();
                String s1 = (String)MoreObjects.firstNonNull(saveAccountLinkingTokenRequest0.e, s);
                ((aggr)aggr.a.b()).b.put(new aggq(s1, this.c), saveAccountLinkingTokenRequest0);
                bxrz bxrz0 = ((bxrz)aesa.a.mr()).ag(bbcu.dB);
                Objects.requireNonNull(object0);
                aerx aerx0 = new aerx(((ahtv)object0));
                bxrz0.ak(bbcu.dB, aerx0);
                bxrz0.ap(bxnj.aw, s1);
                cjtm cjtm0 = ((ahfp)bxrz0.B(new aesa(this.c, s1, saveAccountLinkingTokenRequest0, this.d))).b(0xDF, "SaveAccountLinkingTokenOperation", this.c(apiMetadata0));
                this.e.b(cjtm0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
                    object0 = (iInterface1 instanceof ahty) ? ((ahty)iInterface1) : new ahtw(iBinder1);
                }
                SavePasswordRequest savePasswordRequest0 = (SavePasswordRequest)wbz.a(parcel0, SavePasswordRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahrw.gr(parcel0);
                this.a(((ahty)object0), savePasswordRequest0, apiMetadata1);
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

