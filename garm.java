import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

public final class garm implements gana, gbap {
    private static final ggfp a;
    private final Context b;
    private final gbkz c;
    private final gcsk d;
    private final gaxk e;

    static {
        garm.a = ggfp.O("appValidationAction", "ContactsAddressAction", "requestContextBuilder", "DataValueEncryptionAction", "O2DocumentDownloadAction", "O2DocumentUploadAction", new String[]{"droidGuardAction", "enqueueDownload", "fetchDeviceStoredValueCardAction", "getInitializationTemplateAction", "getIntegratorDataAction", "LoadLazyDataAction", "LoadWebLoginUrlAction", "o2NetworkAction", "PerformSdkOperationAction", "PlayIntegrityApiAction", "TapAndPayVerification", "UnifiedTokenizationAction"});
    }

    public garm(Context context0, gaxk gaxk0, gcsk gcsk0) {
        this.b = context0;
        this.e = gaxk0;
        this.d = gcsk0;
        this.c = new gbkz(context0);
    }

    @Override  // gana
    public final ganp a(gano gano0) {
        gbay gbay0;
        switch(gano0.g()) {
            case "ContactsAddressAction": {
                gbay0 = new gapd();
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "DataValueEncryptionAction": {
                gbay0 = new gape(gano0.e(), this.e);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "LoadLazyDataAction": {
                gbay0 = new gbbf(gano0.e(), this, this.d);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "LoadWebLoginUrlAction": {
                gbay0 = new gapt(this.b);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "O2DocumentDownloadAction": {
                gbay0 = new gbas(gano0.e(), this, this.d);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "O2DocumentUploadAction": {
                gbay0 = new gbav(gano0.e(), this, this.e, this.d);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "PerformSdkOperationAction": {
                gbay0 = new gapw(this.b);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "PlayIntegrityApiAction": {
                gbay0 = new gapx(gano0.e());
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "TapAndPayVerification": {
                gbay0 = new gard(gano0.e());
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "UnifiedTokenizationAction": {
                gbay0 = new garh(gano0.e());
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "appValidationAction": {
                gbay0 = new ganz(this.b);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "droidGuardAction": {
                gbay0 = new gapf(this.b);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "enqueueDownload": {
                gbay0 = new gbay(gano0.e(), this);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "fetchDeviceStoredValueCardAction": {
                gbay0 = new gapi(this.b);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "getInitializationTemplateAction": {
                gbay0 = new gbaz(gano0.e(), this.c);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "getIntegratorDataAction": {
                gbay0 = new gbba(gano0.e());
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "o2NetworkAction": {
                gbay0 = new gbbl(gano0.e(), this.c, this, this.d);
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            case "requestContextBuilder": {
                gbay0 = new gbgx(gano0.e());
                return gbay0 == null ? ganp.j() : gbay0.a(gano0);
            }
            default: {
                return ganp.j();
            }
        }
    }

    @Override  // gana
    public final boolean b(gano gano0) {
        String s = gano0.g();
        return garm.a.contains(s);
    }

    @Override  // gbap
    public final String c(gamx gamx0, Context context0, Account account0, String s, boolean z) {
        if(z) {
            gaym gaym0 = gamx0.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkxq)hftp0.b_message).c = 3;
            ((gkxq)hftp0.b_message).b |= 1;
            gayy.c(gaym0, ((gkxq)hftp0.N_build()));
        }
        try {
            String s1 = TextUtils.isEmpty(s) ? "" : gcqs.a(context0, account0, s).a();
            if(z) {
                gaym gaym1 = gamx0.b;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxq.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gkxq)hftp1.b_message).c = 3;
                ((gkxq)hftp1.b_message).b |= 1;
                gayy.b(gaym1, ((gkxq)hftp1.N_build()), gkxf.b);
            }
            return s1;
        }
        catch(gcqt gcqt0) {
            if(z) {
                gaym gaym2 = gamx0.b;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkxq.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gkxq)hftp2.b_message).c = 3;
                ((gkxq)hftp2.b_message).b |= 1;
                gayy.b(gaym2, ((gkxq)hftp2.N_build()), gkxf.e);
            }
            throw gcqt0;
        }
    }
}

