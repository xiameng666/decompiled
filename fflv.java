import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.WorkSource;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import com.google.android.gms.wearable.internal.AccountConsentRecordParcelable;
import com.google.android.gms.wearable.internal.AddAccountToConsentRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AddSupervisedAccountRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.BooleanResponse;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.ConsentStatusRequest;
import com.google.android.gms.wearable.internal.FetchBackupRequest;
import com.google.android.gms.wearable.internal.GetBackupSettingsSupportedResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetLocalCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetRestoreStateRequest;
import com.google.android.gms.wearable.internal.LogCounterRequest;
import com.google.android.gms.wearable.internal.LogEventRequest;
import com.google.android.gms.wearable.internal.LogTimerRequest;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RecordTermConsentRequest;
import com.google.android.gms.wearable.internal.RecordUntetheredSupervisedAccountTransferRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import com.google.android.gms.wearable.internal.RequestConnectionParcelable;
import com.google.android.gms.wearable.internal.RpcResponse;
import com.google.android.gms.wearable.internal.SaveRestoreStateRequest;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StartRestoreSessionRequest;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class fflv extends fdjd implements cjug, ffmj {
    public final fcfs A;
    public final fcfw B;
    public final fdch C;
    public final fdox D;
    public final fcmj E;
    public final feti F;
    public final felr G;
    public final fenf H;
    public final Context I;
    public final ConcurrentMap J;
    public final ConcurrentMap K;
    private final ffeg L;
    private final fdmu M;
    private final ffej N;
    private final ffei O;
    public static final String[] a;
    public final ConcurrentHashMap b;
    public final ConcurrentLinkedQueue c;
    public final PackageManager d;
    public final fdpl e;
    public final fdpl f;
    final WorkSource g;
    public final fdvl h;
    public final fdxu i;
    public final fdqk j;
    public final felm k;
    public final fdri l;
    public final fdyu m;
    public final ffgm n;
    public final TelecomManager o;
    public final feah p;
    public final fcfr q;
    public final gful_cronetEngineProvider r;
    public final gful_cronetEngineProvider s;
    public final fdue t;
    public final cxxr u;
    public final boolean v;
    final azql w;
    public final ffdy x;
    public final ffek y;
    public final ffdo z;

    static {
        fflv.a = new String[]{"unknown", "s3rpc", "rpc", "nonrpc", "config", "esim", "channel", "capability", "backup_and_restore", ""};
    }

    public fflv(Context context0, PackageManager packageManager0, fdvl fdvl0, fdxu fdxu0, fdqk fdqk0, fdpl fdpl0, ffeg ffeg0, felm felm0, fdri fdri0, fdyu fdyu0, TelecomManager telecomManager0, feah feah0, fcfr fcfr0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, ffgm ffgm0, fdue fdue0, cxxr cxxr0, azql azql0, fdmu fdmu0, boolean z, ffdy ffdy0, ffek ffek0, ffej ffej0, ffei ffei0, ffdo ffdo0, fcfs fcfs0, fcfw fcfw0, fdch fdch0, fdox fdox0, fcmj fcmj0, feti feti0, felr felr0, fenf fenf0) {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentLinkedQueue();
        this.J = new ConcurrentHashMap();
        this.K = new ConcurrentHashMap();
        this.I = context0;
        batl.s(ffdy0);
        this.x = ffdy0;
        batl.s(packageManager0);
        this.d = packageManager0;
        batl.s(fdvl0);
        this.h = fdvl0;
        this.i = fdxu0;
        batl.s(fdqk0);
        this.j = fdqk0;
        this.f = fdpl0;
        batl.s(ffeg0);
        this.L = ffeg0;
        batl.s(felm0);
        this.k = felm0;
        batl.s(fdri0);
        this.l = fdri0;
        this.m = fdyu0;
        this.n = ffgm0;
        this.v = z;
        this.t = fdue0;
        this.u = cxxr0;
        batl.s(azql0);
        this.w = azql0;
        batl.s(fdmu0);
        this.M = fdmu0;
        batl.s(ffek0);
        this.y = ffek0;
        this.N = ffej0;
        this.O = ffei0;
        this.z = ffdo0;
        this.F = feti0;
        this.G = felr0;
        this.H = fenf0;
        this.o = telecomManager0;
        this.p = feah0;
        this.q = fcfr0;
        batl.s(gful0);
        this.r = gful0;
        this.s = gful1;
        this.e = ffei0.b(fdpl0);
        this.A = fcfs0;
        this.B = fcfw0;
        this.C = fdch0;
        this.D = fdox0;
        this.E = fcmj0;
        this.g = bbrd.b(context0, fdpl0.b);
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "WearableServiceStub created for requesting app: " + fdpl0);
            Log.d("WearableService", a.b(fdpl0, "Using Appkey: ", "for communication."));
        }
    }

    @Override  // fdje
    public final void A(fdiy fdiy0) {
        if(!hzxf.c()) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "Logging service feature disabled");
            }
            fdiy0.a(fdlg.a(0xFAE));
            return;
        }
        this.bk();
        fflk fflk0 = new fflk(this, fdiy0);
        this.L.a(new fflr(((int)3), this), fflk0);
    }

    @Override  // fdje
    public final void B(fdiy fdiy0, int v) {
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getConnectedCapabilities: "));
            }
            ffiw ffiw0 = new ffiw(this, v, fdiy0);
            this.L.a(new fflr(((int)7), this), ffiw0);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    public final void C(fdiy fdiy0, String s) {
        if(!hzty.c()) {
            fdiy0.a(fdlg.a(0xFAE));
        }
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            ffie ffie0 = new ffie(this, s, fdiy0);
            this.L.a(new fflr(((int)3), this), ffie0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void D(fdiy fdiy0, String s) {
        this.bj("getBackupEnabled", () -> try {
            batl.s(this.E);
            fciy fciy0 = this.E.e;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fexm fexm0 = (fexm)hftp0.b_message;
            fexm0.b |= 1;
            fexm0.c = true;
            byte[] arr_b = ((fexm)hftp0.N_build()).toBytesArray();
            fdiy0.f(new BooleanResponse(0, ((Boolean)evrg.o(fcji.h(((fcji)fciy0).c.a(s, "/backup_settings/backup_enabled", arr_b), ((Parser)((ProtoLiteMessage)fexn.a).jf(7, null)), new fciz()), hzub.b(), TimeUnit.MILLISECONDS)).booleanValue()));
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.e("WearableService", "getBackupEnabled: exception during processing", exception0);
            fdiy0.f(new BooleanResponse(8, false));
        });
    }

    @Override  // fdje
    public final void E(fdiy fdiy0, String s) {
        this.bj("getBackupSettingsSupported", () -> try {
            fcmj fcmj0 = this.E;
            batl.s(fcmj0);
            baun baun0 = fcmj.a;
            baun0.j("isCompanionBackupSettingsAvailable, nodeId %s", new Object[]{s});
            boolean z = true;
            if(Collection.-EL.stream(((fcee)evrg.o(fcmj0.c.g("com.google.android.gms.wearable.companion_backup_settings_wear_app", 1), hzub.a.d().b(), TimeUnit.MILLISECONDS)).b()).anyMatch(new fcmd(s))) {
                baun0.j("isCompanionBackupSettingsAvailable=true (capability found)", new Object[0]);
            }
            else {
                baun0.j("Companion backup settings capability not found, fallback to is_backup_supported", new Object[0]);
                evql evql0 = ((fcji)fcmj0.e).c.a(s, "/backup_settings/backup_supported", null);
                fcjb fcjb0 = new fcjb();
                Boolean boolean0 = (Boolean)evrg.o(evql0.h(gmap.a, fcjb0), hzub.b(), TimeUnit.MILLISECONDS);
                z = boolean0.booleanValue();
                baun0.j("isCompanionBackupSettingsAvailable=%b (from watch)", new Object[]{boolean0});
            }
            fdiy0.n(new GetBackupSettingsSupportedResponse(0, z));
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.e("WearableService", "getBackupSettingsSupported: exception during processing", exception0);
            fdiy0.n(new GetBackupSettingsSupportedResponse(8, false));
        });
    }

    @Override  // fdje
    public final void F(fdiy fdiy0, FetchBackupRequest fetchBackupRequest0) {
        this.bj("getCachedBackups", new ffgy(this, fdiy0, fetchBackupRequest0));
    }

    @Override  // fdje
    public final void G(fdiy fdiy0, AppTheme appTheme0) {
        if(!hzty.a.b().b()) {
            fdiy0.a(fdlg.a(0xFAE));
        }
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            ffif ffif0 = new ffif(this, appTheme0, fdiy0);
            this.L.a(new fflr(((int)3), this), ffif0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void H(fdiy fdiy0, String s, int v) {
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getConnectedCapability: " + this.e + ", " + s);
            }
            this.L.a(new fflr(((int)7), this), new ffiv(this, "getCapability:" + s, s, v, fdiy0));
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    @Deprecated
    public final void I(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getCloudSyncOptInOutDone");
            }
            this.bl();
            ffhv ffhv0 = new ffhv(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffhv0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void J(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getCloudSyncOptInStatus");
            }
            this.bk();
            ffhw ffhw0 = new ffhw(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffhw0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void K(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getCloudSyncSetting");
            }
            this.bk();
            ffia ffia0 = new ffia(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffia0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void L(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getCompanionPackageForNode: "));
            }
            ffiu ffiu0 = new ffiu(this, fdiy0, s);
            this.L.a(new fflr(((int)4), this), ffiu0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    @Deprecated
    public final void M(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            Log.e("WearableService", "getConfig is no longer supported. Use getConfigs instead.");
            fdiy0.a(new Status(10));
        }
        catch(RemoteException unused_ex) {
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void N(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getConfigs: "));
            }
            this.bk();
            ffjw ffjw0 = new ffjw(this, fdiy0, (ffgp.m() ? null : this.f.b));
            this.L.a(new fflr(((int)4), this), ffjw0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void O(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getConnectedNodes: "));
            }
            ffit ffit0 = new ffit(this, fdiy0);
            this.L.a(new fflr(((int)4), this), ffit0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void P(fdiy fdiy0, Uri uri0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getDataItem: " + this.e + ": " + uri0);
            }
            if(fdzj.a(uri0) == 2) {
                this.L.a(new fflr(((int)3), this), new ffii(this, "getDataItem:" + uri0, uri0, fdiy0));
            }
            else {
                Log.w("WearableService", "Called getDataItem with a non-exact uri. Provided: " + uri0);
                fdiy0.C(new GetDataItemResponse(13, null));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void Q(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getDataItems: "));
            }
            ffij ffij0 = new ffij(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffij0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void R(fdiy fdiy0, Uri uri0) {
        this.S(fdiy0, uri0, 0);
    }

    @Override  // fdje
    public final void S(fdiy fdiy0, Uri uri0, int v) {
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getDataItemsByUri: " + this.e + " " + uri0);
            }
            this.L.a(new fflr(((int)3), this), new ffik(this, "getDataItemsByUriFilter:" + uri0, v, fdiy0, uri0));
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    public final void T(fdiy fdiy0, int v) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "Get EAP ID for subscriptionId: " + v);
        }
        this.bk();
        ffjy ffjy0 = new ffjy(this, fdiy0, v);
        this.L.a(new fflr(((int)5), this), ffjy0);
    }

    @Override  // fdje
    public final void U(fdiy fdiy0, Account account0) {
        int v = Binder.getCallingUid();
        String s = this.f.c;
        if(!cjbc.a(this.I, v, s)) {
            throw new SecurityException(String.format("Package [%s] is not authorized", s));
        }
        this.bh("getFastpairAccountKeyByAccount", new ffhi(fdiy0, account0), new ffhj(fdiy0));
    }

    @Override  // fdje
    public final void V(fdiy fdiy0) {
        this.bl();
        this.bh("getFastpairAccountKeys", new ffhl(fdiy0), new ffhm(fdiy0));
    }

    @Override  // fdje
    public final void W(fdiy fdiy0, Asset asset0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getFdForAsset: " + this.e + asset0);
            }
            this.L.a(new fflr(((int)3), this), new ffir(this, "getFdForAsset:" + asset0.b, asset0, fdiy0));
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void X(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            ffmn.a("WearableService", "getLocalCapabilities: %s", new Object[]{this.e});
            if(hzya.e()) {
                ffix ffix0 = new ffix(this, fdiy0);
                this.L.a(new fflr(((int)7), this), ffix0);
            }
            else {
                Log.e("WearableService", "getLocalCapabilities: offload is disabled");
                fdiy0.H(new GetLocalCapabilitiesResponse(0xFAE, ggna.a, ggna.a));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void Y(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getLocalNode: "));
            }
            ffis ffis0 = new ffis(this, fdiy0);
            this.L.a(new fflr(((int)4), this), ffis0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void Z(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getNodeId: "));
            }
            fflg fflg0 = new fflg(this, s, fdiy0);
            this.L.a(new fflr(((int)4), this), fflg0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void a(fdiy fdiy0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "acceptRingingCall: "));
            }
            ffjj ffjj0 = new ffjj(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjj0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aA(fdiy fdiy0, RecordTermConsentRequest recordTermConsentRequest0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(hzwn.c()) {
                ffkx ffkx0 = new ffkx(this, recordTermConsentRequest0, fdiy0);
                this.L.a(new fflr(((int)3), this), ffkx0);
            }
            else {
                if(Log.isLoggable("WearableService", 5)) {
                    Log.w("WearableService", "First party consents feature disabled");
                }
                fdiy0.a(fdlg.a(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aB(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "removeConfig: " + this.e + " " + s);
            }
            if(TextUtils.isEmpty(s)) {
                Log.w("WearableService", "removeConfig: called with null config. Ignoring.");
                fdiy0.a(new Status(0));
            }
            else {
                this.bk();
                ffio ffio0 = new ffio(this, s, (ffgp.m() ? null : this.f.b), fdiy0);
                this.L.a(new fflr(((int)4), this), ffio0);
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aC(fdiy fdiy0, RemoveListenerRequest removeListenerRequest0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "removeListener: " + this.e + " " + removeListenerRequest0.b);
            }
            ffjc ffjc0 = new ffjc(this, removeListenerRequest0, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjc0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aD(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "removeLocalCapability: " + s);
            }
            this.L.a(new fflr(((int)7), this), new ffiz(this, "removeLocalCapability:" + s, s, fdiy0));
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aE(fdiy fdiy0, String s, boolean z) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "retryConnection: " + this.e + " " + s);
            }
            this.bk();
            ffhs ffhs0 = new ffhs(this, s, (ffgp.m() ? null : this.f.b), z, fdiy0);
            this.L.a(new fflr(((int)4), this), ffhs0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aF(fdiy fdiy0, SaveRestoreStateRequest saveRestoreStateRequest0) {
        this.bj("saveRestoreState", new ffgq(this, saveRestoreStateRequest0, fdiy0));
    }

    @Override  // fdje
    public final void aG(fdiy fdiy0, byte b) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "sendRemoteCommand: " + ((int)b));
            }
            ffjx ffjx0 = new ffjx(this, fdiy0, b);
            this.L.a(new fflr(((int)3), this), ffjx0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aH(fdiy fdiy0, String s, String s1, byte[] arr_b) {
        this.aI(fdiy0, s, s1, arr_b, new MessageOptions(0));
    }

    @Override  // fdje
    public final void aI(fdiy fdiy0, String s, String s1, byte[] arr_b, MessageOptions messageOptions0) {
        fdpl fdpl0 = this.e;
        long v = Binder.clearCallingIdentity();
        fdpl fdpl1 = this.y.b(fdpl0, s1);
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "sendMessage: " + fdpl1 + ": " + s + " " + s1 + " (" + (arr_b == null ? 0 : arr_b.length) + ")");
            }
            if(s == null) {
                fdiy0.R(new SendMessageResponse(4004, -1));
            }
            else if(hzyw.c() && !this.k.s(s, fdpl0.b)) {
                this.bi("sendMessage", s);
                fdiy0.R(new SendMessageResponse(4004, -1));
            }
            else {
                fflv.bm(arr_b);
                boolean z = fflv.bd(fdpl1.b, s1);
                this.L.a(new fflr(((int)(z ? 1 : 2)), this), new ffin(this, a.au(s1, s, (z ? "sendMessageHi" : "sendMessageLo"), ":", ","), fdiy0, arr_b, s, s1, fdpl1, messageOptions0));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aJ(fdiy fdiy0, String s, String s1, byte[] arr_b) {
        this.aK(fdiy0, s, s1, arr_b, new MessageOptions(0));
    }

    @Override  // fdje
    public final void aK(fdiy fdiy0, String s, String s1, byte[] arr_b, MessageOptions messageOptions0) {
        fdpl fdpl0 = this.e;
        long v = Binder.clearCallingIdentity();
        fdpl fdpl1 = this.y.b(fdpl0, s1);
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "sendRequest: " + fdpl1 + ": " + s + " " + s1 + " (" + (arr_b == null ? 0 : arr_b.length) + ")");
            }
            if(s == null) {
                fdiy0.S(new RpcResponse(4004, -1, new byte[0]));
            }
            else if(hzyw.c() && !this.k.s(s, fdpl0.b)) {
                this.bi("sendRequest", s);
                fdiy0.S(new RpcResponse(4004, -1, new byte[0]));
            }
            else {
                fflv.bm(arr_b);
                boolean z = fflv.bd(fdpl1.b, s1);
                this.L.a(new fflr(((int)(z ? 1 : 2)), this), new ffiq(this, a.au(s1, s, (z ? "sendRequestHi" : "sendRequestLo"), ":", ","), s, s1, arr_b, fdiy0, fdpl1, messageOptions0));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aL(fdiy fdiy0, boolean z) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "setCloudSyncSetting to: " + z);
            }
            this.bk();
            ffhx ffhx0 = new ffhx(this, z, (ffgp.m() ? null : this.f.b), fdiy0);
            this.L.a(new fflr(((int)3), this), ffhx0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aM(fdiy fdiy0, String s, boolean z) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "setCloudSyncSettingByNode - node: " + s + " to: " + z);
            }
            this.bk();
            String s1 = ffgp.m() ? null : this.f.b;
            fczq[] arr_fczq = this.k.w(s1);
            for(int v2 = 0; true; ++v2) {
                if(v2 >= arr_fczq.length) {
                    Log.e("WearableService", a.l(s, s1, "setCloudSyncSettingByNode - Caller is not allowed to modify target node. callerPackageName: ", " , watchNodeId: "));
                    fdiy0.a(new Status(13));
                    break;
                }
                if(Objects.equals(arr_fczq[v2].j, s)) {
                    ffhy ffhy0 = new ffhy(this, s, z, fdiy0);
                    this.L.a(new fflr(((int)3), this), ffhy0);
                    break;
                }
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aN(fdiy fdiy0, AppTheme appTheme0) {
        if(!hzty.c()) {
            fdiy0.a(fdlg.a(0xFAE));
            Log.w("WearableService", "setThemeForApp called but the feature is not enabled");
            return;
        }
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            ffic ffic0 = new ffic(this, appTheme0, fdiy0);
            this.L.a(new fflr(((int)3), this), ffic0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aO(fdiy fdiy0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "silenceRinger: "));
            }
            ffjk ffjk0 = new ffjk(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjk0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aP(fdiy fdiy0, StartRestoreSessionRequest startRestoreSessionRequest0) {
        this.bj("startRestoreSession", new ffgz(this, startRestoreSessionRequest0, fdiy0));
    }

    @Override  // fdje
    public final void aQ(fdiy fdiy0, String s) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", a.a(s, "syncWifiCredential: (", ")"));
            }
            ffji ffji0 = new ffji(this, fdiy0, s);
            this.L.a(new fflr(((int)3), this), ffji0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aR(fdiy fdiy0, String s, String s1) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", a.d(s1, s, "syncWifiCredential: (", ", ", ")"));
            }
            ffjh ffjh0 = new ffjh(this, fdiy0, s, s1);
            this.L.a(new fflr(((int)3), this), ffjh0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aS(fdiy fdiy0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "syncWifiCredentials: "));
            }
            ffjg ffjg0 = new ffjg(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjg0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aT(fdiy fdiy0, ConnectionConfiguration connectionConfiguration0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "updateConfig: " + this.e + ", config: " + connectionConfiguration0);
            }
            this.bk();
            ffjl ffjl0 = new ffjl(this, connectionConfiguration0, (ffgp.m() ? null : this.f.b), fdiy0);
            this.L.a(new fflr(((int)4), this), ffjl0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aU(fdiy fdiy0, String s, int v) {
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "updateConnectionStrategy: " + this.e + " " + s);
            }
            this.bk();
            ffht ffht0 = new ffht(this, s, (ffgp.m() ? null : this.f.b), v, fdiy0);
            this.L.a(new fflr(((int)4), this), ffht0);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    public final void aV(fdiy fdiy0, ConnectionDelayConfig connectionDelayConfig0) {
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            if(this.G != null && hzvj.d()) {
                ffkd ffkd0 = new ffkd(this, connectionDelayConfig0, fdiy0);
                this.L.a(new fflr(((int)4), this), ffkd0);
            }
            else {
                fdiy0.a(new Status(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aW(fdiy fdiy0, String s, ParcelFileDescriptor parcelFileDescriptor0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "writeChannelInputToFileDescriptor: "));
            }
            ffjr ffjr0 = new ffjr(this, s, parcelFileDescriptor0, fdiy0);
            this.L.a(new fflr(((int)6), this), ffjr0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    @Deprecated
    public final void aX(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            Log.e("WearableService", "setConfig is no longer supported. Use putConfig instead.");
            fdiy0.a(new Status(10));
        }
        catch(RemoteException unused_ex) {
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aY(fdiy fdiy0, fdir fdir0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getChannelInputStream: "));
            }
            ffjp ffjp0 = new ffjp(this, s, fdiy0, fdir0);
            this.L.a(new fflr(((int)6), this), ffjp0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aZ(fdiy fdiy0, fdir fdir0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getChannelOutputStream: "));
            }
            ffjq ffjq0 = new ffjq(this, s, fdiy0, fdir0);
            this.L.a(new fflr(((int)6), this), ffjq0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aa(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            fdiy0.f(new BooleanResponse(0, true));
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void ab(fdiy fdiy0, AppRecommendationsRequest appRecommendationsRequest0) {
        batl.s(this.A);
        this.bk();
        fdpl fdpl0 = this.f;
        String s = fdpl0.c;
        if(!this.N.b(s, this.N.b)) {
            String s1 = String.format("Package [%s, %s] is not authorized for recommended apps API", s, fdpl0.d);
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", s1);
            }
            throw new SecurityException(s1);
        }
        fflc fflc0 = new fflc(this, appRecommendationsRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), fflc0);
    }

    @Override  // fdje
    public final void ac(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getRelatedConfigs: "));
            }
            this.bk();
            ffkk ffkk0 = new ffkk(this, fdiy0, (ffgp.m() ? null : this.f.b));
            this.L.a(new fflr(((int)4), this), ffkk0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void ad(fdiy fdiy0, GetRestoreStateRequest getRestoreStateRequest0) {
        this.bj("getRestoreState", new ffgx(this, getRestoreStateRequest0, fdiy0));
    }

    @Override  // fdje
    public final void ae(fdiy fdiy0) {
        this.bj("getRestoreSupported", new ffhk(this, fdiy0));
    }

    @Override  // fdje
    public final void af(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "getStorageInformation: "));
            }
            this.bl();
            ffjd ffjd0 = new ffjd(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjd0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void ag(fdiy fdiy0, int v) {
        this.bk();
        long v1 = Binder.clearCallingIdentity();
        try {
            if(hzwn.c()) {
                ffkz ffkz0 = new ffkz(this, v, fdiy0);
                this.L.a(new fflr(((int)3), this), ffkz0);
            }
            else {
                if(Log.isLoggable("WearableService", 5)) {
                    Log.w("WearableService", "First party consents feature disabled");
                }
                fdiy0.a(fdlg.a(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    public final void ah(fdiy fdiy0) {
        batl.s(this.C);
        this.bk();
        ffkf ffkf0 = new ffkf(this, fdiy0);
        this.L.a(new fflr(((int)3), this), ffkf0);
    }

    @Override  // fdje
    public final void ai(fdiy fdiy0, ConsentStatusRequest consentStatusRequest0) {
        batl.s(this.C);
        this.bk();
        ffkg ffkg0 = new ffkg(this, consentStatusRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), ffkg0);
    }

    @Override  // fdje
    public final void aj(fdiy fdiy0, FetchBackupRequest fetchBackupRequest0) {
        this.bj("hasAvailableBackups", new ffgu(this, fdiy0, fetchBackupRequest0));
    }

    @Override  // fdje
    public final void ak(fdiy fdiy0, AncsNotificationParcelable ancsNotificationParcelable0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "injectAncsNotificationForTesting: " + ancsNotificationParcelable0);
            }
            ffjv ffjv0 = new ffjv(this, ancsNotificationParcelable0, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjv0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void al(fdiy fdiy0, String s) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "isNodeConnectionMetered: " + s);
        }
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            fflo fflo0 = new fflo(this, s, fdiy0);
            this.L.a(new fflr(((int)4), this), fflo0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void am(fdiy fdiy0, String s) {
        this.bj("isRestoreOngoing", new ffgr(this, s, fdiy0));
    }

    @Override  // fdje
    public final void an(fdiy fdiy0, LogCounterRequest logCounterRequest0) {
        if(!hzxf.c()) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "Logging service feature disabled");
            }
            fdiy0.a(fdlg.a(0xFAE));
            return;
        }
        this.bk();
        if(logCounterRequest0.e) {
            ffli ffli0 = new ffli(this, logCounterRequest0, fdiy0);
            this.L.a(new fflr(((int)3), this), ffli0);
            return;
        }
        fflh fflh0 = new fflh(this, logCounterRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), fflh0);
    }

    @Override  // fdje
    public final void ao(fdiy fdiy0, LogEventRequest logEventRequest0) {
        if(!hzxf.c()) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "Logging service feature disabled");
            }
            fdiy0.a(fdlg.a(0xFAE));
            return;
        }
        this.bk();
        fflf fflf0 = new fflf(this, logEventRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), fflf0);
    }

    @Override  // fdje
    public final void ap(fdiy fdiy0, LogTimerRequest logTimerRequest0) {
        if(!hzxf.c()) {
            if(Log.isLoggable("WearableService", 5)) {
                Log.w("WearableService", "Logging service feature disabled");
            }
            fdiy0.a(fdlg.a(0xFAE));
            return;
        }
        this.bk();
        fflj fflj0 = new fflj(this, logTimerRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), fflj0);
    }

    @Override  // fdje
    public final void aq(fdiy fdiy0, String s) {
        this.bk();
        ffle ffle0 = new ffle(this, s, fdiy0);
        this.L.a(new fflr(((int)3), this), ffle0);
    }

    @Override  // fdje
    public final void ar(fdiy fdiy0, String s, String s1) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "openChannel: "));
            }
            if(hzyw.c() && !this.k.s(s, this.e.b)) {
                this.bi("openChannel", s);
                fdiy0.N(new OpenChannelResponse(4004, null));
            }
            else {
                ffjm ffjm0 = new ffjm(this, s, s1, fdiy0);
                this.L.a(new fflr(((int)6), this), ffjm0);
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void as(fdiy fdiy0, boolean z) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "optInCloudSync: " + z);
            }
            this.bk();
            ffhu ffhu0 = new ffhu(this, z, fdiy0);
            this.L.a(new fflr(((int)3), this), ffhu0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void at(fdiy fdiy0, int v, String s) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "Perform EAP-AKA for subscriptionId: " + v);
        }
        this.bk();
        ffjz ffjz0 = new ffjz(this, fdiy0, v, s);
        this.L.a(new fflr(((int)5), this), ffjz0);
    }

    @Override  // fdje
    public final void au(fdiy fdiy0, ConnectionConfiguration connectionConfiguration0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "putConfig: " + this.e + " " + connectionConfiguration0);
            }
            if(connectionConfiguration0 == null) {
                Log.w("WearableService", "putConfig: called with null config. Ignoring.");
                fdiy0.a(fdlg.a(0));
            }
            else {
                this.bk();
                ffhz ffhz0 = new ffhz(this, connectionConfiguration0, (ffgp.m() ? null : this.f.b), fdiy0);
                this.L.a(new fflr(((int)4), this), ffhz0);
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void av(fdiy fdiy0, PutDataRequest putDataRequest0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "putData: " + this.e + putDataRequest0);
            }
            int v2 = putDataRequest0.c == null ? 0 : putDataRequest0.c.length;
            for(Object object0: putDataRequest0.c().keySet()) {
                v2 += ((String)object0).length();
            }
            Uri uri0 = putDataRequest0.a;
            if(Long.compare(v2 + uri0.toString().length(), hzzi.a.i().v()) <= 0) {
                for(Object object1: putDataRequest0.c().entrySet()) {
                    if(((Asset)((Map.Entry)object1).getValue()).d == null) {
                        continue;
                    }
                    Log.w("DataItems", "Asset.createFromUri behaviour has changed. App needs to be recompiled with the latest google-play-services library.");
                    fdiy0.P(new PutDataResponse(4005, null));
                    return;
                }
                this.L.a(new fflr(((int)3), this), new ffih(this, "putData:" + uri0, putDataRequest0, fdiy0));
            }
            else {
                fdiy0.P(new PutDataResponse(4003, null));
            }
        }
        catch(NullPointerException nullPointerException0) {
            Log.e("WearableService", "NPE in putData", nullPointerException0);
            StringWriter stringWriter0 = new StringWriter();
            PrintWriter printWriter0 = new PrintWriter(stringWriter0);
            nullPointerException0.printStackTrace(printWriter0);
            printWriter0.flush();
            throw new NullPointerException(stringWriter0.toString());
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void aw(fdiy fdiy0, String s, ParcelFileDescriptor parcelFileDescriptor0, long v, long v1) {
        long v2 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "readChannelOutputFromFileDescriptor: "));
            }
            ffjs ffjs0 = new ffjs(this, s, parcelFileDescriptor0, fdiy0, v, v1);
            this.L.a(new fflr(((int)6), this), ffjs0);
        }
        finally {
            Binder.restoreCallingIdentity(v2);
        }
    }

    @Override  // fdje
    public final void ax(fdiy fdiy0, RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest0) {
        long v = Binder.clearCallingIdentity();
        this.bk();
        try {
            ffkq ffkq0 = new ffkq(this, recordUntetheredSupervisedAccountTransferRequest0, fdiy0);
            this.L.a(new fflr(((int)3), this), ffkq0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void ay(fdiy fdiy0, PrivacyRecordOptinRequest privacyRecordOptinRequest0) {
        this.bk();
        ffkt ffkt0 = new ffkt(this, privacyRecordOptinRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), ffkt0);
    }

    @Override  // fdje
    public final void az(fdiy fdiy0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(hzyz.c()) {
                ffkv ffkv0 = new ffkv(this, fdiy0);
                this.L.a(new fflr(((int)3), this), ffkv0);
            }
            else {
                if(Log.isLoggable("WearableService", 5)) {
                    Log.w("WearableService", "recordSwaadlOptIn feature disabled");
                }
                fdiy0.a(fdlg.a(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void b(fdiy fdiy0, AcceptTermsRequest acceptTermsRequest0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(hzwn.c()) {
                fflb fflb0 = new fflb(this, acceptTermsRequest0, fdiy0);
                this.L.a(new fflr(((int)3), this), fflb0);
            }
            else {
                if(Log.isLoggable("WearableService", 5)) {
                    Log.w("WearableService", "First party consents feature disabled");
                }
                fdiy0.a(fdlg.a(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void ba(fdiy fdiy0, fdis fdis0) {
        long v = Binder.clearCallingIdentity();
        try {
            ffmn.a("WearableService", "releaseConnectionRequest: Attempting to release an offloaded BLE connection", new Object[0]);
            this.bk();
            ffln ffln0 = new ffln(this, fdiy0, fdis0);
            this.L.a(new fflr(((int)4), this), ffln0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void bb(fdiy fdiy0, RequestConnectionParcelable requestConnectionParcelable0, fdis fdis0) {
        long v = Binder.clearCallingIdentity();
        try {
            ffmn.a("WearableService", "requestConnection: %s ", new Object[]{requestConnectionParcelable0});
            this.bk();
            fflm fflm0 = new fflm(this, fdiy0, requestConnectionParcelable0, fdis0);
            this.L.a(new fflr(((int)4), this), fflm0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    public final void bc(fdiy fdiy0, String s, Account account0, String s1, String s2) {
        batl.s(s2);
        batl.s(s1);
        batl.s(account0);
        azzc azzc0 = new azzc();
        azzc0.a = new cyhk(((cyhq)this.u), s2, s1, account0);
        azzc0.c = new Feature[]{cumh.p};
        azzc0.d = 0x50F;
        azzd azzd0 = azzc0.a();
        evql evql0 = ((azts)this.u).iG(azzd0);
        ffgs ffgs0 = new ffgs(s, account0, fdiy0);
        evql0.y(gmap.a, ffgs0);
        ffgt ffgt0 = new ffgt(fdiy0);
        evql0.v(gmap.a, ffgt0);
    }

    public static boolean bd(String s, String s1) {
        return Objects.equals(s, "com.google.android.wearable.app") && s1.startsWith("/s3");
    }

    public static final void be(ParcelFileDescriptor parcelFileDescriptor0) {
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("WearableService", 2)) {
                    Log.v("WearableService", "closeQuietly: Exception while closing a ParcelFileDescriptor", iOException0);
                }
            }
        }
    }

    private final void bh(String s, fflq fflq0, fflq fflq1) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", s + ": " + this.e);
            }
            if(!feml.a().b) {
                if(Log.isLoggable("WearableService", 6)) {
                    Log.e("WearableService", "Fast Pair account key sync feature is not enabled");
                }
                fflq1.a(Integer.valueOf(0xFAE));
            }
            else if(feml.a().g && hzwk.a.b().b()) {
                ffhp ffhp0 = new ffhp(this, s, fflq0, s, fflq1);
                this.L.a(new fflr(((int)3), this), ffhp0);
            }
            else {
                if(Log.isLoggable("WearableService", 6)) {
                    Log.e("WearableService", "Fast Pair get account keys feature is not enabled");
                }
                fflq1.a(Integer.valueOf(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    private final void bi(String s, String s1) {
        if(Log.isLoggable("WearableService", 5)) {
            Log.w("WearableService", String.format("%s: RPCs to node \'%s\' are not allowed for \'%s\'", s, s1, this.e.b));
        }
    }

    private final void bj(String s, fflt fflt0) {
        this.bk();
        batl.s(this.E);
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", s + ": " + this.e);
            }
            ffka ffka0 = new ffka(this, s, fflt0);
            this.L.a(new fflr(((int)8), this), ffka0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    private final void bk() {
        if(ffgp.k() && this.M.b(this.f.c) || hzzm.d() && this.N.c(this.f.b) || this.O.b && this.O.j(this.f.b)) {
            return;
        }
        this.w.d(this.f.c);
    }

    private final void bl() {
        if(ffgp.k() && this.M.b(this.f.c)) {
            return;
        }
        this.w.d(this.f.c);
    }

    private static final void bm(byte[] arr_b) {
        if(arr_b != null) {
            long v = hzxl.b();
            if(((long)arr_b.length) > v && hzxl.b() >= 0L) {
                throw new RemoteException(String.format("The size of the data payload (%d bytes) exceeds the maximum allowable limit", ((int)arr_b.length)));
            }
        }
    }

    @Override  // fdje
    public final void c(fdiy fdiy0, AddAccountToConsentRequest addAccountToConsentRequest0) {
        this.bk();
        ffkj ffkj0 = new ffkj(this, addAccountToConsentRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), ffkj0);
    }

    @Override  // fdje
    public final void d(fdiy fdiy0, AddListenerRequest addListenerRequest0) {
        boolean z;
        if(ffgp.k()) {
            z = this.M.b(this.e.c);
        }
        else {
            int v = Binder.getCallingUid();
            z = this.w.i(v);
        }
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "addListener: " + this.e + " " + addListenerRequest0.a);
            }
            ffjb ffjb0 = new ffjb(this, addListenerRequest0, z, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjb0);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    public final void e(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "addLocalCapability: " + s);
            }
            this.L.a(new fflr(((int)7), this), new ffiy(this, "addLocalCapability:" + s, s, fdiy0));
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void f(fdiy fdiy0, AddSupervisedAccountRequest addSupervisedAccountRequest0) {
        this.bk();
        ffkn ffkn0 = new ffkn(this, addSupervisedAccountRequest0, fdiy0);
        this.L.a(new fflr(((int)3), this), ffkn0);
    }

    @Override  // fdje
    public final void g(fdiy fdiy0, String s, Account account0, String s1, String s2) {
        String s4;
        String s3;
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                s3 = s2;
                s4 = s1;
                Log.d("WearableService", "associateDeviceAndAccountWithFastPair: " + this.e + " " + s3 + " " + s4 + " " + s);
            }
            else {
                s4 = s1;
                s3 = s2;
            }
            if(!feml.a().b) {
                if(Log.isLoggable("WearableService", 6)) {
                    Log.e("WearableService", "Fast Pair account key sync feature is not enabled");
                }
                fdiy0.a(new Status(8));
            }
            else if(this.u == null) {
                if(Log.isLoggable("WearableService", 6)) {
                    Log.e("WearableService", "FastPairClient not available");
                }
                fdiy0.a(new Status(8));
            }
            else {
                this.bk();
                fflp fflp0 = new fflp(this, s3, fdiy0, s, account0, s4);
                this.L.a(new fflr(((int)3), this), fflp0);
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void h(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            if(!hzvs.e()) {
                fdiy0.a(new Status(0xFAE));
            }
            else if(TextUtils.isEmpty(s)) {
                fdiy0.a(new Status(4004, "The peer node ID cannot be empty"));
            }
            else {
                ffkc ffkc0 = new ffkc(this, s, fdiy0);
                this.L.a(new fflr(((int)4), this), ffkc0);
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void i(fdiy fdiy0, ConnectionConfiguration connectionConfiguration0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "cancelMigration: " + this.e + ", config: " + connectionConfiguration0);
            }
            this.bk();
            ffja ffja0 = new ffja(this, connectionConfiguration0, (ffgp.m() ? null : this.f.b), fdiy0);
            this.L.a(new fflr(((int)4), this), ffja0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void j(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "clearStorage: "));
            }
            this.bl();
            ffje ffje0 = new ffje(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffje0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void k(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "closeChannel: "));
            }
            ffjn ffjn0 = new ffjn(this, s, fdiy0);
            this.L.a(new fflr(((int)6), this), ffjn0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void l(fdiy fdiy0, String s, int v) {
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "closeChannelWithError: "));
            }
            ffjo ffjo0 = new ffjo(this, s, v, fdiy0);
            this.L.a(new fflr(((int)6), this), ffjo0);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    public final void m(fdiy fdiy0, Uri uri0) {
        this.n(fdiy0, uri0, 0);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Requester App: " + ffmr.a(this.f.b));
        bbpd0.println("Pending Events: " + this.c.size());
        ConcurrentHashMap concurrentHashMap0 = this.b;
        if(!concurrentHashMap0.isEmpty()) {
            bbpd0.println("Listeners");
            bbpd0.b();
            for(Object object0: concurrentHashMap0.entrySet()) {
                bbpd0.println(Integer.toHexString(((IBinder)((Map.Entry)object0).getKey()).hashCode()) + ": " + ((Map.Entry)object0).getValue());
            }
            bbpd0.a();
        }
    }

    @Override  // fdje
    public final void n(fdiy fdiy0, Uri uri0, int v) {
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "deleteDataItems: " + this.e + uri0);
            }
            this.L.a(new fflr(((int)3), this), new ffim(this, "deleteDataItemsByUriFilter:" + uri0, v, fdiy0, uri0));
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    @Deprecated
    public final void o(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            Log.e("WearableService", "disableConnection is no longer supported. Use disableDeviceConnection instead.");
            fdiy0.a(new Status(10));
        }
        catch(RemoteException unused_ex) {
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void p(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "disableConnection: " + this.e + " " + s);
            }
            this.bk();
            ffhr ffhr0 = new ffhr(this, s, (ffgp.m() ? null : this.f.b), fdiy0);
            this.L.a(new fflr(((int)4), this), ffhr0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void q(fdiy fdiy0, int v) {
        this.bk();
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "doAncsNegativeAction: " + v);
            }
            ffju ffju0 = new ffju(this, fdiy0, v);
            this.L.a(new fflr(((int)3), this), ffju0);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    static ConsentResponse r(ffco ffco0) {
        ArrayList arrayList1;
        Long long0 = null;
        if(hzyz.c()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ffco0.f) {
                arrayList0.add(new AccountConsentRecordParcelable(((fewv)object0).c, ((fewv)object0).d));
            }
            arrayList1 = arrayList0;
        }
        else {
            arrayList1 = null;
        }
        String s = (ffco0.b & 16) == 0 ? null : ffco0.g;
        if((ffco0.b & 0x20) != 0) {
            long0 = hfyn.b((ffco0.h == null ? hfwn.a : ffco0.h));
        }
        return new ConsentResponse(0, true, ffco0.c, ffco0.d, ffco0.e, arrayList1, s, long0);
    }

    static ConsentResponse s() {
        return hzyz.c() ? new ConsentResponse(0, false, false, false, false, ggna.a, null, null) : new ConsentResponse(0, false, false, false, false, null, null, null);
    }

    public final fdxn t() {
        return this.i.a();
    }

    @Override
    public final String toString() {
        return "WearableServiceStub[" + ffmr.a(this.e.b) + "]";
    }

    public final String u(String s) {
        if(!fdyy.k(s)) {
            return s;
        }
        fdxn fdxn0 = this.n.a();
        if(fdxn0 == null) {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "sanitizeTarget: no legacy peer, not sending to target " + s);
            }
            return null;
        }
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "sanitizeTarget: replaced target " + s + " with " + fdxn0.a);
        }
        return fdxn0.a;
    }

    @Override  // fdje
    public final void v(fdiy fdiy0, int v) {
        this.bk();
        long v1 = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "doAncsPositiveAction: " + v);
            }
            ffjt ffjt0 = new ffjt(this, fdiy0, v);
            this.L.a(new fflr(((int)3), this), ffjt0);
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
    }

    @Override  // fdje
    @Deprecated
    public final void w(fdiy fdiy0) {
        long v = Binder.clearCallingIdentity();
        try {
            Log.e("WearableService", "enableConnection is no longer supported. Use enableDeviceConnection instead.");
            fdiy0.a(new Status(10));
        }
        catch(RemoteException unused_ex) {
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void x(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "enableConnection: " + this.e + " " + s);
            }
            this.bk();
            ffhq ffhq0 = new ffhq(this, s, (ffgp.m() ? null : this.f.b), fdiy0);
            this.L.a(new fflr(((int)4), this), ffhq0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void y(fdiy fdiy0) {
        this.bk();
        long v = Binder.clearCallingIdentity();
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", ffdo.a(this, "endCall: "));
            }
            ffjf ffjf0 = new ffjf(this, fdiy0);
            this.L.a(new fflr(((int)3), this), ffjf0);
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    @Override  // fdje
    public final void z(fdiy fdiy0, String s) {
        long v = Binder.clearCallingIdentity();
        try {
            this.bk();
            if(this.G != null && hzvj.d()) {
                ffke ffke0 = new ffke(this, s, fdiy0);
                this.L.a(new fflr(((int)3), this), ffke0);
            }
            else {
                fdiy0.a(new Status(0xFAE));
            }
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }
}

