import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.accountsettings.PrewarmingParameters;
import com.google.android.gms.accountsettings.service.AccountSettingsApiService;
import com.google.android.gms.common.api.ApiMetadata;

public final class zgy extends wby implements IInterface, cjug {
    private final Context a;
    private final cjts b;
    private final String c;
    private final String d;

    public zgy() {
        super("com.google.android.gms.accountsettings.internal.IAccountSettingsService");
    }

    public zgy(Context context0, cjts cjts0, String s, String s1) {
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.accountsettings.internal.IAccountSettingsService");
        this.a = context0;
        this.b = cjts0;
        this.c = s;
        this.d = s1;
        new baun("AccountSettings", new String[]{new ibuk(AccountSettingsApiService.class).c()});
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        boolean z;
        if(v == 1) {
            PrewarmingParameters prewarmingParameters0 = (PrewarmingParameters)wbz.a(parcel0, PrewarmingParameters.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            zgy.gr(parcel0);
            ibuq.f(prewarmingParameters0, "prewarmingParameters");
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grxw.a), prewarmingParameters0.b, 0, prewarmingParameters0.b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((grxw)hftv0), "parseFrom(...)");
            if((((grxw)hftv0).b & 1) != 0 && ((grxw)hftv0).c != 0) {
                switch(prewarmingParameters0.c) {
                    case 1: {
                        z = false;
                        break;
                    }
                    case 2: {
                        z = true;
                        break;
                    }
                    default: {
                        z = cchl.d();
                    }
                }
                azuf azuf0 = azug.b(apiMetadata0);
                azuf0.f(azud.a);
                azuf0.e(bbdp.c);
                azuf0.g(bbdq.aT);
                String s = this.c;
                azuf0.d(s);
                azuf0.c(this.d);
                azug azug0 = azuf0.a();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aatb.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                String s1 = prewarmingParameters0.a;
                ibuq.f(s1, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aatb aatb0 = (aatb)hftp0.b_message;
                s1.getClass();
                aatb0.b = s1;
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                aatv aatv0 = new aatv(((aatb)hftv1), ((grxw)hftv0), fhrt.a(s), z, new aaux(), new bbll(1, 9), aatt.a, azug0);
                this.b.b(aatv0);
            }
            if(prewarmingParameters0.d) {
                aaur.b(new Intent("com.google.android.gms.octarine.action.WARMUP").putExtra("extra.accountName", prewarmingParameters0.a), this.a);
            }
            return true;
        }
        return false;
    }
}

