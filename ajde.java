import android.content.SharedPreferences;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ajde implements ajcx {
    public static final baun a;
    public final einq b;
    private static final String c;
    private final ajdb d;
    private final amff e;

    static {
        ajde.a = new baun("Auth", new String[]{"PhenotypeConfigSyncer"});
        ajde.c = "com.google.android.gms";
    }

    public ajde(einq einq0, amff amff0, ajdb ajdb0) {
        this.b = einq0;
        this.e = amff0;
        this.d = ajdb0;
    }

    @Override  // ajcx
    public final void a(String s) {
        int v3;
        baun baun0 = ajde.a;
        baun0.j("Called doInitialConfigSync().", new Object[0]);
        String s1 = s == null ? ajde.c : s;
        if(ajde.b().getBoolean("AUTH_CONFIG_SYNC_FINISHED", false)) {
            baun0.h("Already synced configs, returning early", new Object[0]);
            this.c(3, 0L, s1);
            return;
        }
        long v = System.currentTimeMillis();
        int v1 = this.d.a.getCurrentModule().moduleVersion;
        RegistrationInfo[] arr_registrationInfo = {new RegistrationInfo("com.google.android.gms.auth_account", v1, new String[]{"ANDROID_AUTH"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.auth_cryptauth", v1, new String[]{"ANDROID_AUTH"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.auth_folsom", v1, new String[]{"ANDROID_AUTH"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.auth_managed", v1, new String[]{"AUTH_MANAGED"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.droidguard", v1, new String[]{"DROIDGUARD", "DROIDGUARD_ONDEVICE", "STREAMZ_DROIDGUARD"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.enterprise", v1, new String[]{"ZERO_TOUCH_GMSCORE"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.fido", v1, new String[]{"FIDO"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.setupservices", v1, new String[]{"ANDROID_AUTH"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.smartdevice", v1, new String[]{"SMART_SETUP"}, null, true, null, ajde.c, RegistrationInfo.b), new RegistrationInfo("com.google.android.gms.auth.blockstore", v1, new String[]{"BLOCKSTORE"}, null, true, null, ajde.c, RegistrationInfo.b)};
        evql evql0 = this.b.k(arr_registrationInfo).h(new bblp(1, 9), new ajdd(this, v1));
        try {
            evrg.o(evql0, 5000L, TimeUnit.MILLISECONDS);
            baun0.h("Successfully synced sidecar_aps configs", new Object[0]);
            ajde.b().edit().putBoolean("AUTH_CONFIG_SYNC_FINISHED", true).commit();
            this.c(2, System.currentTimeMillis() - v, s1);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            ajde.a.g("Encountered exception trying to sync sidecar_aps Phenotype configs", exception0, new Object[0]);
            long v2 = System.currentTimeMillis() - v;
            if((exception0 instanceof ExecutionException)) {
                v3 = 5;
            }
            else if((exception0 instanceof InterruptedException)) {
                v3 = 6;
            }
            else if((exception0 instanceof TimeoutException)) {
                v3 = 4;
            }
            else {
                v3 = 7;
            }
            this.c(v3, v2, s1);
            throw new ajcv(exception0);
        }
    }

    private static SharedPreferences b() {
        return AppContextProvider.a().getSharedPreferences("AuthConfigSyncSharedPrefs", 0);
    }

    private final void c(int v, long v1, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.M;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghon)hftp0.b_message).e = ghom0.av;
        ((ghon)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghps.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((ghps)hftv0).b |= 1;
        ((ghps)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((ghps)hftv1).b |= 2;
        ((ghps)hftv1).d = (int)v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghps)hftp1.b_message).e = v - 1;
        ((ghps)hftp1.b_message).b |= 4;
        ghps ghps0 = (ghps)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ghps0.getClass();
        ghon0.J = ghps0;
        ghon0.c |= 0x400;
        ghon ghon1 = (ghon)hftp0.N_build();
        this.e.a(ghon1);
    }
}

