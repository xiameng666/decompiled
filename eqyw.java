import android.accounts.Account;
import android.app.KeyguardManager;
import android.app.RemoteLockscreenValidationSession;
import android.app.backup.BackupManager;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.d2d.data.SourceDeviceInfo;
import com.google.android.gms.smartdevice.d2d.data.StartServicePayload;
import com.google.android.gms.smartdevice.d2d.data.TargetDeviceInfo;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakeOptionFlags;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import com.google.android.gms.smartdevice.quickstart.QuickStartSourceEventData;
import com.google.android.gms.smartdevice.quickstart.RestoreAnytimeContext;
import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;
import j..util.Collection.-EL;
import j..util.DesugarArrays;
import j..util.stream.Collectors;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqyw extends epwu {
    public boolean A;
    public int B;
    public final AtomicBoolean C;
    eqsl D;
    public eqsl E;
    public int F;
    public String G;
    public eqyb H;
    public final cchj I;
    public String J;
    final ExecutorService K;
    public boolean L;
    final bboe M;
    private final erqn N;
    private final erqw O;
    private final epxd P;
    private final eqln Q;
    private final epza R;
    private final eqam S;
    private evql T;
    private evql U;
    private gmcd V;
    private erat W;
    private KeyguardManager X;
    private RemoteLockscreenValidationSession Y;
    private int Z;
    private boolean aa;
    private gjmw ab;
    private boolean ac;
    private eqcp ad;
    private final eqcq ae;
    public static final baun f;
    public final Context g;
    public eqwi h;
    public epyj i;
    public final erav j;
    public final bbng k;
    public final foeg l;
    public gmcd m;
    public gmcd n;
    public final List o;
    public String p;
    public BootstrapOptions q;
    public String r;
    public clht s;
    public WifiConfiguration t;
    public WifiP2pManager.Channel u;
    public TracingBroadcastReceiver v;
    int w;
    int x;
    public boolean y;
    public long z;

    static {
        eqyw.f = new erqc(new String[]{"SourceQuickStartController"});
    }

    public eqyw(Context context0, Handler handler0, epwt epwt0, eqam eqam0) {
        erqn erqn0 = new erqn(context0);
        erri erri0 = new erri(context0);
        epxd epxd0 = new epxd(context0);
        eqln eqln0 = new eqln(context0, handler0);
        epza epza0 = new epza(context0);
        foeg foeg0 = fofa.a();
        cchj cchj0 = cchj.b(context0);
        super(eqyw.f, handler0, epwt0);
        this.o = new ArrayList();
        this.w = (int)hyis.g();
        this.x = 0;
        this.y = false;
        this.aa = false;
        this.B = 1000;
        this.C = new AtomicBoolean(false);
        this.F = 0;
        this.ac = false;
        bblp bblp0 = new bblp(1, 9);
        this.K = bblp0;
        this.M = new eqyh();
        this.ae = new eqyv(this);
        this.g = context0;
        this.N = erqn0;
        this.O = erri0;
        this.P = epxd0;
        this.Q = eqln0;
        this.R = epza0;
        this.ad = null;
        this.j = erav.a(context0);
        this.W = null;
        this.X = null;
        this.k = bbnk.a;
        this.l = foeg0;
        this.S = eqam0;
        this.I = cchj0;
        if(hyis.z()) {
            bblp0.execute(new eqyi(this, context0));
        }
    }

    public final void A(JSONObject jSONObject0) {
        int v = 3;
        if(this.F == 3) {
            try {
                eqwi eqwi0 = this.h;
                String s = jSONObject0.optString("wifi_ssid");
                eqxp eqxp0 = new eqxp();
                eqxp0.a = 5;
                batl.t(s, "WiFi ssid cannot be null");
                eqxp0.b = s;
                eqwi0.f(eqxp0.a());
            }
            catch(RemoteException remoteException0) {
                eqyw.f.g("Failed to callback onEvent()", remoteException0, new Object[0]);
            }
        }
        else {
            this.c.sendEmptyMessage(4002);
        }
        JSONObject jSONObject1 = this.r();
        try {
            jSONObject1.put("wifi_network", jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqyw.f.m("JSONException " + jSONException0.toString(), new Object[0]);
            this.z(jSONObject1);
            return;
        }
        if(hyid.d()) {
            eqyw.f.d("Sending sourceDeviceInfo and wifiInfo.", new Object[0]);
        }
        else {
            eqyw.f.d("Sending sourceDeviceInfo and wifiInfo: " + jSONObject1.toString(), new Object[0]);
        }
        this.o(jSONObject1);
        erav erav0 = this.j;
        if(!jSONObject0.optString("wifi_security_type").equals("Unsupported")) {
            v = 4;
        }
        erav0.m(v);
    }

    public final void B(int v) {
        if(this.F == 7) {
            return;
        }
        eqyw.f.d("Sending source event type %d to target device", new Object[]{v});
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("source_event_type", v);
            this.o(jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqyw.f.g("Error sending source event type message", jSONException0, new Object[0]);
        }
    }

    private static Intent C(Context context0, int v) {
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartActivity");
        intent0.addFlags(0x10008000);
        intent0.putExtra("service_trigger", true);
        intent0.putExtra("launch_state", v);
        return intent0;
    }

    private final JSONObject D() {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        try {
            BootstrapOptions bootstrapOptions0 = this.q;
            if(bootstrapOptions0 != null) {
                PostTransferAction postTransferAction0 = bootstrapOptions0.u;
                if(postTransferAction0 != null) {
                    String s = postTransferAction0.e;
                    if(!TextUtils.isEmpty(s)) {
                        batl.s(this.g);
                        long v = erpp.a(s, this.g.getPackageManager());
                        jSONObject1.put("oem_package_name", s);
                        jSONObject1.put("oem_package_version_long", v);
                    }
                }
            }
        }
        catch(JSONException jSONException0) {
            eqyw.f.l(jSONException0);
        }
        try {
            String s1 = this.r;
            if(s1 != null) {
                jSONObject1.put("wifi_direct_address", s1);
            }
            jSONObject0.put("oem_connection_hint", jSONObject1);
        }
        catch(JSONException jSONException1) {
            eqyw.f.l(jSONException1);
        }
        return jSONObject0;
    }

    private final JSONObject E() {
        if(this.r == null) {
            eqyw.f.d("Get Wifi Direct MacAddress", new Object[0]);
            WifiP2pManager wifiP2pManager0 = Build.VERSION.SDK_INT < 33 || erpr.b(this.g) ? ((WifiP2pManager)erpr.a(this.g).getSystemService("wifip2p")) : null;
            HandlerThread handlerThread0 = new HandlerThread("SourceWifiDirect", 10);
            handlerThread0.start();
            clht clht0 = new clht(handlerThread0.getLooper());
            this.s = clht0;
            Looper looper0 = clht0.getLooper();
            if(wifiP2pManager0 != null) {
                eqyp eqyp0 = new eqyp();
                this.u = wifiP2pManager0.initialize(this.g, looper0, eqyp0);
                eqyq eqyq0 = new eqyq(this);
                wifiP2pManager0.requestDeviceInfo(this.u, eqyq0);
            }
        }
        String s = this.N.e();
        int v = this.N.c();
        if(!TextUtils.isEmpty(s) && !s.equals("<unknown ssid>") && v != -1) {
            GetWifiCredentialsRequest getWifiCredentialsRequest0 = new GetWifiCredentialsRequest();
            getWifiCredentialsRequest0.a = s;
            getWifiCredentialsRequest0.b = v;
            azzc azzc0 = new azzc();
            azzc0.d = 0x5110;
            azzc0.a = new errd(((erri)this.O), getWifiCredentialsRequest0);
            azzd azzd0 = azzc0.a();
            evql evql0 = ((azts)this.O).iG(azzd0);
            try {
                evrg.n(evql0);
            }
            catch(ExecutionException | InterruptedException exception0) {
                eqyw.f.n("could not getWifiCredentials", exception0, new Object[0]);
                return null;
            }
            GetWifiCredentialsResponse getWifiCredentialsResponse0 = (GetWifiCredentialsResponse)evql0.j();
            if(getWifiCredentialsResponse0 != null) {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("wifi_ssid", s);
                    jSONObject0.put("wifi_hidden_ssid", getWifiCredentialsResponse0.d);
                    jSONObject0.put("wifi_security_type", getWifiCredentialsResponse0.c);
                    String s1 = getWifiCredentialsResponse0.b;
                    if(s1 != null) {
                        jSONObject0.put("wifi_pre_shared_key", s1);
                    }
                    return jSONObject0;
                }
                catch(JSONException jSONException0) {
                    eqyw.f.m("JSONException " + jSONException0.toString(), new Object[0]);
                    return null;
                }
            }
        }
        return null;
    }

    private final void F(eras eras0) {
        if((eras0.getCause() instanceof aztb)) {
            this.N(6, ((aztb)eras0.getCause()));
            return;
        }
        this.N(eras0.a, null);
    }

    private final void G(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjjp)hftv0).b |= 1;
        ((gjjp)hftv0).c = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        erav erav0 = this.j;
        gjjp gjjp0 = (gjjp)hftp0.b_message;
        gjjp0.b |= 2;
        gjjp0.d = v;
        gjjp gjjp1 = (gjjp)hftp0.N_build();
        ProtoLiteBuilder hftp1 = erav0.o(gjkj.H);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp1.b_message;
        gjjp1.getClass();
        gjkn0.m = gjjp1;
        gjkn0.b |= 0x800;
        erav0.f(((gjkn)hftp1.N_build()));
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("open_vault_response_code", v);
            this.o(jSONObject0);
            if(v == 1) {
                this.y = true;
                baun baun0 = eqyw.f;
                baun0.d("Vault opened for LSKF.", new Object[0]);
                if(!this.aa) {
                    baun0.d("Starting account transfer.", new Object[0]);
                    BootstrapOptions bootstrapOptions0 = this.q;
                    batl.s(bootstrapOptions0);
                    this.y(bootstrapOptions0);
                }
            }
            else if(v == 3) {
                this.J();
            }
        }
        catch(JSONException jSONException0) {
            eqyw.f.n("Failed to send LSKF guess result to target.", jSONException0, new Object[0]);
            this.M(7);
        }
    }

    private final void H(byte[] arr_b) {
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        hftc hftc0;
        byte[] arr_b2;
        int v1;
        erat erat1;
        if(this.y) {
            eqyw.f.m("Vault already opened, ignoring LSKF guess.", new Object[0]);
            return;
        }
        try {
            try {
                erat erat0 = this.W;
                batl.s(erat0);
                this.W = erat0;
                if(!eqqx.b(AppContextProvider.a())) {
                    throw new eras(4);
                }
                erat0.f = erat.c(erat0.d, erat.j);
                erat1 = this.W;
                int v = erat.a(erat1.f.i, erat1.h);
                erat1.i = v;
                if(v <= 0) {
                    v1 = gmlo.d.a();
                }
                else {
                    byte[] arr_b1 = "encrypted_remote_credentials".getBytes(StandardCharsets.UTF_8);
                    KeyPair keyPair0 = erat1.g;
                    batl.s(keyPair0);
                    arr_b2 = gqpc.e(keyPair0.getPrivate(), null, arr_b1, arr_b);
                    ByteString hfsf0 = erat1.f.e;
                    hftc0 = hftc.a();
                    hfsl0 = hfsf0.k();
                    hftv0 = ((ProtoLiteMessage)aktv.a).x_newMutableInstance();
                    goto label_23;
                }
                goto label_76;
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | hfur exception0) {
                goto label_81;
            }
            try {
            label_23:
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
                goto label_46;
            }
            catch(hfur hfur0) {
            }
            catch(hfwr hfwr0) {
                goto label_33;
            }
            catch(IOException iOException0) {
                goto label_37;
            }
            catch(RuntimeException runtimeException0) {
                goto label_43;
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | BadPaddingException exception0) {
                goto label_81;
            }
            try {
                if(hfur0.b) {
                    hfur0 = new hfur(hfur0);
                }
                hfur0.a = hftv0;
                throw hfur0;
            label_33:
                hfur hfur1 = hfwr0.a();
                hfur1.a = hftv0;
                throw hfur1;
            label_37:
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur2 = new hfur(iOException0);
                hfur2.a = hftv0;
                throw hfur2;
            label_43:
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | hfur exception0) {
                goto label_81;
            }
            try {
            label_46:
                hfsl0.z(0);
                goto label_51;
            }
            catch(hfur hfur3) {
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | BadPaddingException exception0) {
                goto label_81;
            }
            try {
                hfur3.a = hftv0;
                throw hfur3;
            label_51:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                byte[] arr_b3 = erat1.d(fgeg.a(fgeh.a(((aktv)hftv0)), arr_b2), erat.j);
                if(arr_b3 == null) {
                    v1 = 0;
                }
                else {
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gmll.a), arr_b3, 0, arr_b3.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    int v2 = erat1.f.i;
                    int v3 = erat1.e.b(((gmll)hftv1)).b;
                    gmlo gmlo0 = gmlo.b(v3) == null ? gmlo.l : gmlo.b(v3);
                    if((gmlo.b(v3) == null ? gmlo.l : gmlo.b(v3)) == gmlo.b) {
                        erat.a.h("LSKF validated.", new Object[0]);
                        erat1.g = null;
                    }
                    else {
                        Object[] arr_object = {gmlo0.a()};
                        erat.a.h("Failed to open vault with result code: %d.", arr_object);
                        int v4 = erat1.h + 1;
                        erat1.h = v4;
                        int v5 = erat.a(v2 + 1, v4);
                        erat1.i = v5;
                        if(v5 <= 0) {
                            gmlo0 = gmlo.d;
                            erat1.g = null;
                        }
                    }
                    v1 = gmlo0.a();
                }
            label_76:
                int v6 = this.W.i;
                eqyw.f.d("Handle LSKF guess result", new Object[0]);
                this.G(v1, v6);
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | hfur exception0) {
                goto label_81;
            }
        }
        catch(ajqz exception0) {
        label_81:
            eqyw.f.n("Failed to use encryptedLskfGuess to open vault.", exception0, new Object[0]);
            this.M(9);
        }
        catch(eras eras0) {
            this.F(eras0);
        }
    }

    private final void I() {
        try {
            this.B(4);
            this.h.k();
        }
        catch(RemoteException remoteException0) {
            eqyw.f.l(remoteException0);
        }
    }

    private final void J() {
        this.j.g(10770, null);
        this.d.d(10770, null);
    }

    private final void K(QuickStartHandshakePayload quickStartHandshakePayload0) {
        MessagePayload messagePayload1;
        boolean z;
        String s6;
        int v4;
        eqyw.f.d("Process Handshake payload.", new Object[0]);
        long v = quickStartHandshakePayload0.b;
        long v1 = bbmq.f(this.g);
        this.j.j(v);
        try {
            this.h.i(v);
        }
        catch(RemoteException remoteException0) {
            eqyw.f.l(remoteException0);
        }
        MessagePayload messagePayload0 = new MessagePayload();
        QuickStartHandshakePayload quickStartHandshakePayload1 = new QuickStartHandshakePayload();
        cchj cchj0 = this.I;
        ArrayList arrayList0 = eqyw.q(cchj0);
        hyje hyje0 = hyje.a;
        if(hyje0.b().d()) {
            RestoreAnytimeContext restoreAnytimeContext0 = quickStartHandshakePayload0.e;
            if(restoreAnytimeContext0 != null) {
                String s = restoreAnytimeContext0.c;
                int v2 = this.Q.f();
                List list0 = restoreAnytimeContext0.e;
                int v3 = restoreAnytimeContext0.g;
                if(!TextUtils.isEmpty(s) && !s.equals(Base64.encodeToString(ghgc.a.b(v1).e(), 2))) {
                    eqyw.f.d("Source not the expected device for restore anytime", new Object[0]);
                    v4 = 3;
                }
                else if(v2 != 5) {
                    if(v3 == 4) {
                        eqyw.f.d("Target is DO, source not DO, block", new Object[0]);
                        v4 = 3;
                    }
                    else {
                        v4 = 1;
                    }
                }
                else if(hyje0.b().b() && v3 == 4) {
                    eqyw.f.d("DO -> DO enabled", new Object[0]);
                    if(list0 == null) {
                        v4 = 1;
                    }
                    else {
                        gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(list0).filter(new eqyn()).collect(ggaf.a);
                        gged_interceptors gged1 = (gged_interceptors)DesugarArrays.stream(cchj0.p("com.google")).filter(new eqyr(this)).filter(new eqys(this)).map(new eqyo()).collect(ggaf.a);
                        v4 = eqyw.U(gged1, gged0).size() == gged1.size() ? 3 : 1;
                        erqh.a();
                        if(!new BackupManager(this.g).isBackupServiceActive(UserHandle.of(UserHandle.myUserId()))) {
                            v4 = 5;
                        }
                    }
                }
                else {
                    eqyw.f.d("DO device not support restore anytime.", new Object[0]);
                    v4 = 2;
                }
                if(hyje0.b().e() && list0 != null && list0.size() == 1 && ((BootstrapAccount)list0.get(0)).f) {
                    v4 = 5;
                }
                if(v4 != 1) {
                    erav erav0 = this.j;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjx.a).v_newBuilder();
                    gjjw gjjw0 = gjjw.b(v4);
                    gftb.check(gjjw0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjjx)hftp0.b_message).c = gjjw0.g;
                    ((gjjx)hftp0.b_message).b |= 1;
                    gjjx gjjx0 = (gjjx)hftp0.N_build();
                    ProtoLiteBuilder hftp1 = erav0.o(gjkj.t);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gjkn gjkn0 = (gjkn)hftp1.b_message;
                    gjjx0.getClass();
                    gjkn0.k = gjjx0;
                    gjkn0.b |= 0x200;
                    erav0.f(((gjkn)hftp1.N_build()));
                    quickStartHandshakePayload1.q(new RestoreAnytimeContext(v4));
                    messagePayload0.ak(quickStartHandshakePayload1);
                    this.n(messagePayload0);
                    try {
                        eqwi eqwi0 = this.h;
                        eqxp eqxp0 = new eqxp();
                        eqxp0.a = 2;
                        eqwi0.f(eqxp0.a());
                    }
                    catch(RemoteException remoteException1) {
                        eqyw.f.l(remoteException1);
                    }
                    return;
                }
                RestoreAnytimeContext restoreAnytimeContext1 = new RestoreAnytimeContext(1);
                if(hyje.a.b().f()) {
                    restoreAnytimeContext1.f = eqyw.U(arrayList0, list0).isEmpty();
                    restoreAnytimeContext1.a.add(Integer.valueOf(5));
                }
                quickStartHandshakePayload1.q(restoreAnytimeContext1);
            }
        }
        String s1 = Long.toHexString(v1);
        String s2 = Build.MANUFACTURER;
        String s3 = Build.MODEL;
        String s4 = Build.FINGERPRINT;
        int v5 = Build.VERSION.SDK_INT;
        String s5 = null;
        if(hyis.z() && this.S()) {
            try {
                foec foec0 = this.n == null ? null : ((foec)this.n.get(hyis.a.k().j(), TimeUnit.MILLISECONDS));
                if(foec0 != null) {
                    s6 = foec0.d;
                    if(s6 != null && !TextUtils.isEmpty(s6)) {
                        goto label_96;
                    }
                }
            }
            catch(ExecutionException | TimeoutException | InterruptedException exception0) {
                eqyw.f.n("Failed to load account owner", exception0, new Object[0]);
            }
            goto label_97;
        label_96:
            s5 = s6;
        }
    label_97:
        TargetDeviceInfo targetDeviceInfo0 = quickStartHandshakePayload0.c;
        if(targetDeviceInfo0 == null) {
            z = false;
        }
        else {
            String s7 = this.G;
            if(s7 == null) {
                z = false;
            }
            else {
                String s8 = targetDeviceInfo0.g;
                byte[] arr_b = bbmu.f(s7);
                ggfp ggfp0 = ggfp.G(hyis.a.k().B().b);
                if((hyis.a.k().J() || ggfp0.contains(targetDeviceInfo0.b)) && arr_b != null && s8 != null) {
                    this.j.e(gjkj.u);
                    eqyb eqyb0 = new eqyb(s8, arr_b, this.S, this.j);
                    this.H = eqyb0;
                    erqj erqj0 = eqyb0.e;
                    if(erqj0 == null) {
                        z = false;
                        eqyb.a.m("Bluetooth not available.", new Object[0]);
                    }
                    else {
                        z = false;
                        BluetoothDevice bluetoothDevice0 = erqj0.a.getRemoteDevice(eqyb0.c);
                        if(bluetoothDevice0 != null) {
                            eqxz eqxz0 = new eqxz(eqyb0, bluetoothDevice0);
                            gmbu.t(eqyb0.i.d(eqxz0), new eqya(eqyb0), eqyb0.i);
                        }
                    }
                }
                else {
                    z = false;
                }
            }
        }
        if(targetDeviceInfo0 == null) {
            messagePayload1 = messagePayload0;
        }
        else {
            QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags0 = new QuickStartHandshakeOptionFlags();
            quickStartHandshakeOptionFlags0.r(1);
            boolean z1 = quickStartHandshakePayload0.f != null && quickStartHandshakePayload0.f.q(3);
            if(quickStartHandshakePayload0.f != null && quickStartHandshakePayload0.f.q(4)) {
                z = true;
            }
            int v6 = targetDeviceInfo0.f;
            messagePayload1 = messagePayload0;
            eqyw.f.d("targetLskfBeforeWifiFlag: %s, targetGmsVersion: %d, targetSupportSourceMbAndTargetLskf: %s", new Object[]{Boolean.valueOf(z1), v6, Boolean.valueOf(z)});
            this.x = this.p(targetDeviceInfo0.d, z);
            if(z1 && ((long)v6) >= hyis.a.k().m() && this.x != 0) {
                this.aa = true;
                quickStartHandshakeOptionFlags0.r(2);
            }
            quickStartHandshakePayload1.p(quickStartHandshakeOptionFlags0);
        }
        SourceDeviceInfo sourceDeviceInfo0 = new SourceDeviceInfo();
        sourceDeviceInfo0.b = s1;
        sourceDeviceInfo0.a.add(Integer.valueOf(1));
        sourceDeviceInfo0.c = s2;
        sourceDeviceInfo0.a.add(Integer.valueOf(2));
        sourceDeviceInfo0.d = s3;
        Integer integer0 = (int)3;
        sourceDeviceInfo0.a.add(integer0);
        sourceDeviceInfo0.e = s4;
        sourceDeviceInfo0.a.add(Integer.valueOf(4));
        sourceDeviceInfo0.f = v5;
        sourceDeviceInfo0.a.add(Integer.valueOf(5));
        sourceDeviceInfo0.j = s5;
        sourceDeviceInfo0.a.add(Integer.valueOf(9));
        quickStartHandshakePayload1.d = sourceDeviceInfo0;
        quickStartHandshakePayload1.a.add(integer0);
        messagePayload1.ak(quickStartHandshakePayload1);
        this.n(messagePayload1);
        try {
            this.h.j(this.x);
        }
        catch(RemoteException remoteException2) {
            eqyw.f.l(remoteException2);
        }
        if(this.aa && this.x != 4) {
            this.u();
        }
    }

    private final void L(BootstrapConfigurations bootstrapConfigurations0) {
        ArrayList arrayList0 = bootstrapConfigurations0.g;
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.al(this.D().toString().getBytes(StandardCharsets.UTF_8));
        if(hyis.m() && this.ac && arrayList0 != null) {
            ((BootstrapAccount)arrayList0.get(0)).t(true);
        }
        messagePayload0.v(bootstrapConfigurations0);
        messagePayload0.x(5);
        if(hyis.u() && this.F == 7) {
            if(!hyis.m() && arrayList0 != null && arrayList0.size() == 1) {
                String s = ((BootstrapAccount)gggq.r(arrayList0)).b;
                this.ac = bbmn.w(this.g, s);
            }
            eqyw.f.d("Target is a Chromebook, isTransferringUnicorn = %b", new Object[]{Boolean.valueOf(this.ac)});
            messagePayload0.am(new SecondDeviceAuthPayload(this.ac));
        }
        else if(this.S()) {
            if(this.J == null) {
                erqh.a();
                this.J = erqi.a(this.g);
            }
            String s1 = this.J;
            if(s1 == null) {
                eqyw.f.d("Backup account not found.", new Object[0]);
                if(!hyis.a.k().H()) {
                    this.J = "";
                }
            }
            else {
                eqyw.f.d("Backup enabled with account: " + s1, new Object[0]);
            }
            String s2 = Long.toHexString(bbmq.f(this.g));
            messagePayload0.am(new SecondDeviceAuthPayload(this.J, s2));
        }
        if(this.F == 3) {
            gmcd gmcd0 = this.m;
            if(gmcd0 != null && arrayList0 != null) {
                erei.e(arrayList0, gmcd0);
            }
        }
        if(hyit.c() && this.S() && arrayList0 != null) {
            for(int v = 0; true; ++v) {
                List list0 = this.o;
                if(v >= Math.min(list0.size(), arrayList0.size())) {
                    break;
                }
                gmcd gmcd1 = (gmcd)list0.get(v);
                if(gmcd1.isDone()) {
                    try {
                        Bitmap bitmap0 = (Bitmap)gmbu.r(gmcd1);
                        if(bitmap0 != null) {
                            eqyw.f.d("Adding avatar to account", new Object[0]);
                            Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas0 = new Canvas(bitmap1);
                            Paint paint0 = new Paint();
                            Rect rect0 = new Rect(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
                            paint0.setAntiAlias(true);
                            canvas0.drawARGB(0, 0, 0, 0);
                            canvas0.drawCircle(((float)bitmap0.getWidth()) / 2.0f, ((float)bitmap0.getHeight()) / 2.0f, ((float)Math.min(bitmap0.getWidth(), bitmap0.getHeight())) / 2.0f, paint0);
                            paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            canvas0.drawBitmap(bitmap0, rect0, rect0, paint0);
                            BootstrapAccount bootstrapAccount0 = (BootstrapAccount)arrayList0.get(v);
                            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                            bitmap1.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                            String s3 = bbmu.a(byteArrayOutputStream0.toByteArray());
                            bootstrapAccount0.a.add(Integer.valueOf(9));
                            bootstrapAccount0.i = s3;
                        }
                    }
                    catch(ExecutionException | CancellationException exception0) {
                        eqyw.f.n("Failed to load avatar", exception0, new Object[0]);
                    }
                }
                else {
                    eqyw.f.d("Couldn\'t load avatar", new Object[0]);
                }
            }
        }
        this.n(messagePayload0);
    }

    private final void M(int v) {
        this.N(v, null);
    }

    private final void N(int v, aztb aztb0) {
        eqyw.f.m("Couldn\'t continue target LSKF due to lskfFallbackReason: %s", new Object[]{v});
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("lskf_validation_fallback_reason", v);
            this.o(jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqyw.f.g("Error sending fallback message.", jSONException0, new Object[0]);
        }
        if(v == 10) {
            this.J();
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((eqoc)hftp0.b_message).c = (aztb0 == null ? 7 : 8) - 1;
        ((eqoc)hftp0.b_message).b |= 1;
        if(aztb0 != null) {
            v = aztb0.b();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqoc eqoc0 = (eqoc)hftp0.b_message;
        eqoc0.b |= 2;
        eqoc0.d = v;
        eqoc eqoc1 = (eqoc)hftp0.N_build();
        this.j.g(10769, eqoc1);
        this.d.d(10769, eqoc1);
    }

    private final void O(String s, String s1, StartServiceResponse startServiceResponse0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjkz.a).v_newBuilder();
        int v = gjky.a(startServiceResponse0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkz gjkz0 = (gjkz)hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        erav erav0 = this.j;
        gjkz0.e = v - 1;
        gjkz0.b |= 4;
        gjkz gjkz1 = (gjkz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkz1).jf(5, null);
        hftp3.X(((ProtoLiteMessage)gjkz1));
        long v1 = erav0.c;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gjkz gjkz2 = (gjkz)hftp3.b_message;
        gjkz2.b |= 1;
        gjkz2.c = v1;
        long v2 = SystemClock.elapsedRealtime();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gjkz gjkz3 = (gjkz)hftp3.b_message;
        gjkz3.b |= 2;
        gjkz3.d = v2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp2.b_message;
        gjkz gjkz4 = (gjkz)hftp3.N_build();
        gjkz4.getClass();
        gjll0.g = gjkz4;
        gjll0.b |= 16;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp1.b_message;
        gjll gjll1 = (gjll)hftp2.N_build();
        gjll1.getClass();
        gjoc0.k = gjll1;
        gjoc0.b |= 0x200;
        gjoc gjoc1 = (gjoc)hftp1.N_build();
        erav.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        erav0.i(gjoc1, false);
        MessagePayload messagePayload0 = new MessagePayload();
        StartServicePayload startServicePayload0 = new StartServicePayload();
        startServicePayload0.q(s);
        startServicePayload0.p(s1);
        startServicePayload0.d = startServiceResponse0;
        startServicePayload0.a.add(Integer.valueOf(4));
        eqyw.f.j("sendStartServiceResult: %s", new Object[]{startServicePayload0});
        messagePayload0.an(startServicePayload0);
        this.n(messagePayload0);
    }

    private final void P() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("user_verification_method", this.x);
            this.o(jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqyw.f.g("Error sending UserVerificationMethod message.", jSONException0, new Object[0]);
        }
        erav erav0 = this.j;
        int v = this.Z;
        int v1 = erei.g(this.x);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjji.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjji)hftv0).c = v1 - 1;
        ((gjji)hftv0).b |= 1;
        int v2 = gjjg.a(v);
        if(v2 != 0) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjji)hftp0.b_message).d = v2 - 1;
            ((gjji)hftp0.b_message).b |= 2;
        }
        ProtoLiteBuilder hftp1 = erav0.o(gjkj.s);
        gjji gjji0 = (gjji)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp1.b_message;
        gjji0.getClass();
        gjkn0.j = gjji0;
        gjkn0.b |= 0x100;
        erav0.f(((gjkn)hftp1.N_build()));
    }

    private final void Q(evql evql0) {
        bbre bbre0 = new bbre(this.c);
        evql0.v(bbre0, new eqyl());
        evql0.y(bbre0, new eqym(this));
    }

    private final void R(BootstrapOptions bootstrapOptions0) {
        byte[] arr_b = bauc.n(bootstrapOptions0);
        Intent intent0 = eqyw.C(this.g, 301);
        intent0.putExtra("bootstrap_options", arr_b);
        this.g.startActivity(intent0);
    }

    private final boolean S() {
        return this.F == 0 || this.F == 1 || this.F == 2;
    }

    private final boolean T() {
        if(bbqa.d()) {
            if(this.X != null && this.X.isKeyguardSecure()) {
                RemoteLockscreenValidationSession remoteLockscreenValidationSession0 = this.X.startRemoteLockscreenValidation();
                Object[] arr_object = {((int)this.w), remoteLockscreenValidationSession0.getRemainingAttempts()};
                eqyw.f.h("remainingAttempts: %d, Framework API remainingAttempts: %d", arr_object);
                int v = Math.min(this.w, remoteLockscreenValidationSession0.getRemainingAttempts());
                this.w = v;
                this.Y = remoteLockscreenValidationSession0;
                if(v == 0) {
                    this.Z = 10;
                    return false;
                }
                return v > 0;
            }
            eqyw.f.h("KeyguardManager failed to initialize or is not secure (has no lockscreen)", new Object[0]);
        }
        return false;
    }

    private static final ArrayList U(List list0, List list1) {
        ArrayList arrayList0 = new ArrayList(list0);
        if(list1 != null && !list1.isEmpty()) {
            arrayList0.removeAll(list1);
        }
        return arrayList0;
    }

    @Override  // epwu
    protected final epyj b() {
        return this.i;
    }

    @Override  // epwu
    public final void g(int v, eqoc eqoc0) {
    }

    @Override  // epwu
    protected final void i(MessagePayload messagePayload0) {
        super.i(messagePayload0);
        if(this.F != 3 && this.F != 7) {
            return;
        }
        eqyw.f.h("Received the complete message, finishing...", new Object[0]);
        this.t(messagePayload0);
    }

    @Override  // epwu
    protected final void j(MessagePayload messagePayload0) {
        JSONObject jSONObject0;
        QuickStartHandshakePayload quickStartHandshakePayload0 = messagePayload0.t;
        if(quickStartHandshakePayload0 == null) {
            byte[] arr_b = messagePayload0.r;
            if(arr_b != null) {
                baun baun0 = eqyw.f;
                baun0.j("Received %d bytes of data.", new Object[]{((int)arr_b.length)});
                try {
                    jSONObject0 = new JSONObject(new String(arr_b, StandardCharsets.UTF_8));
                }
                catch(JSONException jSONException0) {
                    eqyw.f.l(jSONException0);
                    goto label_161;
                }
                if(!hyid.d()) {
                    baun0.d("Received QuickStartPayload: %s", new Object[]{jSONObject0.toString()});
                }
                if(jSONObject0.optBoolean("forced_update_required")) {
                    this.j.e(gjkj.z);
                    this.L = true;
                    baun0.h("Target device requires forced update and restart", new Object[0]);
                    try {
                        eqwi eqwi0 = this.h;
                        eqxp eqxp0 = new eqxp();
                        eqxp0.a = 1;
                        eqwi0.f(eqxp0.a());
                    }
                    catch(RemoteException unused_ex) {
                        eqyw.f.f("Failed to send forced update event", new Object[0]);
                    }
                    JSONObject jSONObject1 = new JSONObject();
                    try {
                        jSONObject1.put("forced_update_acknowledged", true);
                        this.o(jSONObject1);
                    }
                    catch(JSONException jSONException1) {
                        eqyw.f.g("Failed to send forced update ack", jSONException1, new Object[0]);
                    }
                }
                if(jSONObject0.optBoolean("request_wifi")) {
                    this.j.e(gjkj.w);
                    if(this.F != 3) {
                        JSONObject jSONObject3 = this.E();
                        if(jSONObject3 == null) {
                            this.z(this.r());
                        }
                        else {
                            this.A(jSONObject3);
                        }
                    }
                    else if(jSONObject0.optBoolean("force_wifi_picker")) {
                        this.I();
                    }
                    else {
                        JSONObject jSONObject2 = this.E();
                        if(jSONObject2 == null) {
                            this.I();
                        }
                        else {
                            this.A(jSONObject2);
                        }
                    }
                }
                if(this.F == 3 && jSONObject0.optInt("wifi_connection_status") != 0) {
                    try {
                        eqwi eqwi1 = this.h;
                        eqxp eqxp1 = new eqxp();
                        eqxp1.a = 7;
                        eqwi1.f(eqxp1.a());
                    }
                    catch(RemoteException remoteException0) {
                        eqyw.f.l(remoteException0);
                    }
                }
                int v = 2;
                boolean z = jSONObject0.optBoolean("request_suw_completed");
                boolean z1 = jSONObject0.optBoolean("request_incoming_ota_update");
                if(z) {
                    eqyw.f.h("Receive SUW completed message from Target.", new Object[0]);
                    this.t(null);
                }
                else if(z1) {
                    eqyw.f.h("Receive incoming OTA update message from Target.", new Object[0]);
                    this.j.e(gjkj.S);
                    this.t(null);
                }
                else {
                    if(jSONObject0.optBoolean("request_start_restore")) {
                        eqyw.f.h("Receive startRestore message from target", new Object[0]);
                        this.j.n(2);
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4.put("response_start_restore", true);
                        }
                        catch(JSONException jSONException2) {
                            eqyw.f.l(jSONException2);
                        }
                        this.o(jSONObject4);
                        BootstrapOptions bootstrapOptions0 = this.q;
                        if(bootstrapOptions0 != null) {
                            boolean z2 = bootstrapOptions0.p().b(19);
                            this.C.set(this.ab != gjmw.c && !z2);
                        }
                        if(this.C.get()) {
                            eqsl eqsl0 = new eqsl(new bblp(1, 10), null, hyis.h(), new eqyt(this));
                            this.E = eqsl0;
                            eqsl0.a();
                        }
                        else {
                            this.w(this.q);
                        }
                    }
                    String s = jSONObject0.optString("shared_secret");
                    long v1 = jSONObject0.optLong("SESSION_ID", -1L);
                    if(!TextUtils.isEmpty(s)) {
                        try {
                            this.p = s;
                            this.h.i(v1);
                        }
                        catch(RemoteException remoteException1) {
                            eqyw.f.l(remoteException1);
                        }
                        this.j.j(v1);
                        new eqrm(this.g).b(bbmu.d(s), v1);
                    }
                    if(jSONObject0.optBoolean("request_lskf")) {
                        int v2 = this.x;
                        if(v2 == 1) {
                            try {
                                erat erat0 = this.W;
                                batl.s(erat0);
                                this.o(erat0.b());
                            }
                            catch(JSONException | IOException exception0) {
                                eqyw.f.g("Failed to create lskfDetails.", exception0, new Object[0]);
                                this.M(7);
                            }
                            catch(eras eras0) {
                                this.F(eras0);
                            }
                        }
                        else if((v2 == 2 || v2 == 4) && bbqa.d()) {
                            RemoteLockscreenValidationSession remoteLockscreenValidationSession0 = this.Y;
                            batl.s(remoteLockscreenValidationSession0);
                            this.Y = remoteLockscreenValidationSession0;
                            int v3 = remoteLockscreenValidationSession0.getLockType();
                            switch(v3) {
                                case 0: {
                                    break;
                                }
                                case 1: {
                                    v = 1;
                                    break;
                                }
                                case 2: {
                                    v = 3;
                                    break;
                                }
                                default: {
                                    eqyw.f.m("Invalid lockType: %d", new Object[]{v3});
                                    v = -1;
                                }
                            }
                            String s1 = bbmu.a(this.Y.getSourcePublicKey());
                            try {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("lskf_type", v);
                                jSONObject5.put("encoded_public_key", s1);
                                jSONObject5.put("remaining_attempts", this.w);
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("lskf_details", jSONObject5);
                                this.o(jSONObject6);
                            }
                            catch(JSONException jSONException3) {
                                eqyw.f.g("Failed to create lskfDetails.", jSONException3, new Object[0]);
                                this.M(7);
                            }
                        }
                        else {
                            this.M(this.Z);
                        }
                    }
                    else if(jSONObject0.has("encrypted_lskf_guess")) {
                        byte[] arr_b1 = bbmu.d(jSONObject0.optString("encrypted_lskf_guess"));
                        int v4 = this.x;
                        if(v4 == 1) {
                            this.H(arr_b1);
                        }
                        else if(v4 != 2 && v4 != 4 || !bbqa.d()) {
                            this.M(this.Z);
                        }
                        else if(this.y) {
                            eqyw.f.m("ValidateRemoteLockscreen already succeeded, ignoring LSKF guess.", new Object[0]);
                        }
                        else {
                            KeyguardManager keyguardManager0 = this.X;
                            batl.s(keyguardManager0);
                            switch(keyguardManager0.validateRemoteLockscreen(arr_b1).getResultCode()) {
                                case 1: {
                                    v = 1;
                                    break;
                                }
                                case 4: {
                                    v = 3;
                                    break;
                                }
                                default: {
                                    int v5 = this.w - 1;
                                    this.w = v5;
                                    if(v5 <= 0) {
                                        v = 3;
                                    }
                                }
                            }
                            eqyw.f.d("Handle LSKF guess result for U", new Object[0]);
                            this.G(v, this.w);
                        }
                    }
                }
            }
        label_161:
            BootstrapOptions bootstrapOptions1 = messagePayload0.d;
            if(bootstrapOptions1 != null) {
                this.B = 1003;
                hyis hyis0 = hyis.a;
                if(hyis0.k().G() && this.F == 3 && !eqqx.b(this.g)) {
                    WifiConfiguration wifiConfiguration0 = this.t;
                    if(wifiConfiguration0 != null) {
                        this.N.a(wifiConfiguration0, false);
                    }
                }
                this.q = bootstrapOptions1;
                if(this.x != 0) {
                    if(this.y) {
                        this.y(bootstrapOptions1);
                    }
                    else {
                        this.u();
                    }
                }
                else if(SystemClock.elapsedRealtime() - this.z >= hyis0.k().t()) {
                    Context context0 = this.g;
                    if(ered.C(context0)) {
                        eqyw.f.d("Initial user verification result expired. Prompting for UV again.", new Object[0]);
                        if(this.A) {
                            try {
                                this.h.j(0);
                            }
                            catch(RemoteException remoteException2) {
                                eqyw.f.l(remoteException2);
                            }
                        }
                        else {
                            context0.startActivity(eqyw.C(context0, 203));
                        }
                    }
                    else {
                        this.y(bootstrapOptions1);
                    }
                }
                else {
                    this.y(bootstrapOptions1);
                }
            }
            SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
            if(secondDeviceAuthPayload0 != null) {
                byte[] arr_b2 = secondDeviceAuthPayload0.c;
                eqcp eqcp0 = this.ad;
                if(eqcp0 != null && arr_b2 != null) {
                    eqcp0.e(arr_b2);
                }
                List list0 = secondDeviceAuthPayload0.a;
                if(list0 != null && !list0.isEmpty()) {
                    batl.c(this.q != null && this.q.i, "bootstrapOptions doesn\'t expect source fallback challenges.");
                    gged_interceptors gged0 = eqsh.l(eqsh.o(list0));
                    eqxp eqxp2 = new eqxp();
                    eqxp2.a = 9;
                    eqxp2.b(gged0);
                    QuickStartSourceEventData quickStartSourceEventData0 = eqxp2.a();
                    try {
                        this.h.f(quickStartSourceEventData0);
                    }
                    catch(RemoteException remoteException3) {
                        eqyw.f.l(remoteException3);
                    }
                }
            }
            StartServicePayload startServicePayload0 = messagePayload0.s;
            if(startServicePayload0 != null) {
                baun baun1 = eqyw.f;
                baun1.j("processStartServicePayload: %s", new Object[]{startServicePayload0});
                String s2 = startServicePayload0.b;
                String s3 = startServicePayload0.e;
                hyis hyis1 = hyis.a;
                if(hyis1.k().A().b.contains(String.format("%s/%s", new Object[]{s2, s3}))) {
                    if(!hyis1.k().Q() || !s3.equals("com.google.android.gms.esim.START_SOURCE_D2D_SERVICE")) {
                        goto label_224;
                    }
                    try {
                        boolean z3 = Collection.-EL.stream(ModuleManager.get(this.g).getAllModules()).anyMatch(new eqyk());
                    }
                    catch(InvalidConfigException invalidConfigException0) {
                        eqyw.f.n("Failed to get all modules", invalidConfigException0, new Object[0]);
                        eqyw.f.m("Service is not allowed to start.", new Object[0]);
                        this.O(s2, s3, new StartServiceResponse(3));
                        return;
                    }
                    if(z3) {
                    label_224:
                        Intent intent0 = new Intent(s3);
                        intent0.setPackage(s2);
                        Bundle bundle0 = startServicePayload0.c;
                        if(bundle0 != null) {
                            intent0.putExtras(bundle0);
                        }
                        baun1.j("Starting service with intent: %s", new Object[]{intent0});
                        this.g.startService(intent0);
                        this.O(s2, s3, new StartServiceResponse(1));
                        return;
                    }
                }
                eqyw.f.m("Service is not allowed to start.", new Object[0]);
                this.O(s2, s3, new StartServiceResponse(3));
            }
            return;
        }
        this.K(quickStartHandshakePayload0);
    }

    public final int p(int v, boolean z) {
        baun baun0 = eqyw.f;
        baun0.h("determineUserVerificationMethod with preferredMethod %d", new Object[]{v});
        int v1 = 0;
        if(this.B == 1001) {
            if(v == 0) {
                this.Z = 11;
                this.P();
                return 0;
            }
            if(this.X == null) {
                this.X = (KeyguardManager)this.g.getSystemService("keyguard");
            }
            if(this.X != null && this.X.isKeyguardSecure()) {
                if(hyis.o() && jys.d()) {
                    if(!hyis.B()) {
                        int v2 = cjit.a(this.g);
                        if(v2 == 0) {
                            baun0.h("Mandatory Biometrics enabled on Source, fall back to Source UV", new Object[0]);
                            this.Z = 17;
                            if(z && this.T()) {
                                v1 = 4;
                            }
                            this.x = v1;
                            this.P();
                            return this.x;
                        }
                        if(v2 == 7) {
                            baun0.h("Mandatory Biometrics lockout on Source, aborting flow", new Object[0]);
                            try {
                                this.h.e(10906);
                            }
                            catch(RemoteException remoteException0) {
                                eqyw.f.l(remoteException0);
                            }
                            return 0;
                        }
                    }
                    else if(cjbx.h(this.g)) {
                        baun0.h("Identity Check enabled on Source, fall back to Source UV (GmsBiometricPrompt)", new Object[0]);
                        this.Z = 17;
                        if(z && this.T()) {
                            v1 = 4;
                        }
                        this.x = v1;
                        this.P();
                        return this.x;
                    }
                }
                switch(v) {
                    case 2: {
                    label_40:
                        if(this.T()) {
                            this.x = 2;
                        }
                        else if(v != 3) {
                            if(this.Z != 10) {
                                this.Z = 12;
                            }
                        }
                        else if(this.w > 0) {
                            try {
                                if(this.W == null) {
                                    BackupManager backupManager0 = erat.b;
                                    aqee aqee0 = erat.c;
                                    azts azts0 = erat.j;
                                    if(!erpk.a(AppContextProvider.a())) {
                                        throw new eras(3);
                                    }
                                    if(!eqqx.b(AppContextProvider.a())) {
                                        throw new eras(4);
                                    }
                                    if(!backupManager0.isBackupEnabled()) {
                                        throw new eras(5);
                                    }
                                    Account account0 = aqee0.a();
                                    if(account0 == null) {
                                        throw new eras(5);
                                    }
                                    gmls gmls0 = erat.c(account0, azts0);
                                    int v3 = erat.a(gmls0.i, 0);
                                    if(v3 <= 0) {
                                        throw new eras(10);
                                    }
                                    this.W = new erat(account0, gmls0, new ajzg(AppContextProvider.a(), account0), v3);
                                }
                                this.x = 1;
                            }
                            catch(eras eras0) {
                                this.x = 0;
                                this.Z = eras0.a;
                                eqyw.f.h("Couldn\'t use TARGET_LSKF_WITH_FOLSOM_SOURCE due to lskfFallbackReason: %s", new Object[]{((int)eras0.a)});
                            }
                        }
                        break;
                    }
                    case 3: {
                        v = 3;
                        goto label_40;
                    }
                }
                this.P();
                eqyw.f.d("Determined userVerificationMethod as %d", new Object[]{((int)this.x)});
                return this.x;
            }
            baun0.h("KeyguardManager failed to initialize or is not secure (has no lockscreen)", new Object[0]);
            this.Z = 3;
            this.P();
            return this.x;
        }
        return 0;
    }

    public static ArrayList q(cchj cchj0) {
        return (ArrayList)DesugarArrays.stream(cchj0.p("com.google")).map(new eqyo()).collect(Collectors.toList());
    }

    public final JSONObject r() {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        try {
            if(this.F != 3) {
                jSONObject1.put("SOURCE_ANDROID_ID", Long.toHexString(bbmq.f(this.g)));
                jSONObject1.put("SOURCE_MANUFACTURER", Build.MANUFACTURER);
            }
            jSONObject1.put("SOURCE_MODEL", Build.MODEL);
            jSONObject1.put("source_fingerprint", Build.FINGERPRINT);
            jSONObject0.put("source_device_info", jSONObject1);
        }
        catch(JSONException jSONException0) {
            eqyw.f.m("JSONException " + jSONException0.toString(), new Object[0]);
        }
        return jSONObject0;
    }

    public final void s() {
        eqsl eqsl0 = this.D;
        if(eqsl0 != null) {
            eqsl0.b();
        }
        eqcp eqcp0 = this.ad;
        if(eqcp0 != null) {
            eqcp0.a();
            this.ad = null;
        }
    }

    final void t(MessagePayload messagePayload0) {
        PostTransferAction postTransferAction1;
        try {
            if(this.F == 3 || this.F == 7) {
                if(hyis.a.k().ad()) {
                    BootstrapOptions bootstrapOptions0 = this.q;
                    if(bootstrapOptions0 != null) {
                        postTransferAction1 = bootstrapOptions0.u;
                    }
                    else if(messagePayload0 != null) {
                        PostTransferAction postTransferAction0 = messagePayload0.u;
                        if(postTransferAction0 == null) {
                            postTransferAction1 = null;
                        }
                        else {
                            eqyw.f.h("Found post transfer action in payload: %s", new Object[]{postTransferAction0});
                            postTransferAction1 = postTransferAction0;
                        }
                    }
                    else {
                        postTransferAction1 = null;
                    }
                    if(postTransferAction1 != null && equu.b(this.g, postTransferAction1) == gjmw.d) {
                        this.w((this.q == null ? epxk.a(1, new ArrayList(), 0, Build.MODEL, false, -1L, false, false, null, postTransferAction1, new AdvertisementOptions(0), new ArrayList()) : this.q));
                    }
                }
                else if(this.q != null && equu.b(this.g, this.q.u) == gjmw.d) {
                    BootstrapOptions bootstrapOptions1 = this.q;
                    batl.s(bootstrapOptions1);
                    eqyw.f.d("Launching 1P post transfer action intent after completion: %s", new Object[]{bootstrapOptions1.u});
                    this.w(this.q);
                }
            }
            this.h.b();
        }
        catch(RemoteException remoteException0) {
            eqyw.f.l(remoteException0);
        }
        eqrl.b(this.g);
        SourceQuickStartChimeraService.e(this.g);
    }

    public final void u() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("inform_target_request_lskf", true);
            this.o(jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqyw.f.g("Error sending RequestTargetToRequestLskf message.", jSONException0, new Object[0]);
        }
    }

    public final void w(BootstrapOptions bootstrapOptions0) {
        this.c.sendEmptyMessage(4001);
        if(bootstrapOptions0 != null) {
            try {
                if(!this.A) {
                    this.R(bootstrapOptions0);
                    return;
                }
                this.h.h(bootstrapOptions0);
            }
            catch(RemoteException remoteException0) {
                eqyw.f.l(remoteException0);
                eqyw.f.d("Restart source activity onPostTransferActionFailed.", new Object[0]);
                this.R(bootstrapOptions0);
            }
        }
    }

    final void x(ArrayList arrayList0, BootstrapOptions bootstrapOptions0) {
        try {
            eqwi eqwi0 = this.h;
            eqxp eqxp0 = new eqxp();
            eqxp0.a = 6;
            batl.t(arrayList0, "Accounts cannot be null");
            eqxp0.c = arrayList0;
            eqwi0.f(eqxp0.a());
        }
        catch(RemoteException remoteException0) {
            eqyw.f.g("Failed to callback onEvent()", remoteException0, new Object[0]);
        }
        BootstrapConfigurations bootstrapConfigurations0 = new BootstrapConfigurations();
        FastJsonResponse.Field fastJsonResponse$Field0 = new FastJsonResponse.Field(11, true, 11, true, "bootstrapAccounts", 6, BootstrapAccount.class);
        BootstrapConfigurations.a.put("bootstrapAccounts", fastJsonResponse$Field0);
        bootstrapConfigurations0.s(arrayList0);
        Context context0 = this.g;
        this.ab = equu.b(context0, bootstrapOptions0.u);
        epzc epzc0 = bootstrapConfigurations0.p();
        baun baun0 = eqyw.f;
        baun0.d("PostTransferActionType: %s", new Object[]{this.ab.toString()});
        switch(this.ab.ordinal()) {
            case 1: {
                epzc0.c(8, true);
                break;
            }
            case 2: {
                epzc0.c(9, true);
            }
        }
        bootstrapConfigurations0.w(epzc0);
        epzc epzc1 = bootstrapConfigurations0.p();
        int v = arrayList0.size();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjke.a).v_newBuilder();
        boolean z = this.ac;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjke)hftv0).b |= 4;
        ((gjke)hftv0).e = z;
        if(epzc1.b(9)) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gjke)hftv1).c = 2;
            ((gjke)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjke gjke0 = (gjke)hftp0.b_message;
            gjke0.b |= 2;
            gjke0.d = v;
        }
        else if(epzc1.b(8)) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gjke)hftv2).c = 1;
            ((gjke)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjke gjke1 = (gjke)hftp0.b_message;
            gjke1.b |= 2;
            gjke1.d = v;
        }
        erav erav0 = this.j;
        gjke gjke2 = (gjke)hftp0.N_build();
        ProtoLiteBuilder hftp1 = erav0.o(gjkj.I);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp1.b_message;
        gjke2.getClass();
        gjkn0.o = gjke2;
        gjkn0.b |= 0x2000;
        erav0.f(((gjkn)hftp1.N_build()));
        if(arrayList0.isEmpty()) {
            baun0.d("No account available.", new Object[0]);
            evql evql0 = this.U;
            if(evql0 != null) {
                this.Q(evql0);
            }
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.al(this.D().toString().getBytes(StandardCharsets.UTF_8));
            messagePayload0.v(bootstrapConfigurations0);
            this.n(messagePayload0);
            this.k(4);
            if(hyis.q()) {
                this.d.d(10801, null);
                return;
            }
            erav0.g(10801, null);
            return;
        }
        if(bootstrapOptions0.f == 7) {
            baun0.d("Target device is running ChromeOS, fetching Instance ID...", new Object[0]);
            String s = ((bzoe)this.M.a(context0)).b();
            if(s == null) {
                baun0.m("Failed to get Instance ID", new Object[0]);
            }
            else {
                DeviceDetails deviceDetails0 = new DeviceDetails(bbmq.f(context0), azqk.a(context0));
                deviceDetails0.k = s;
                deviceDetails0.a.add(Integer.valueOf(11));
                bootstrapConfigurations0.t(deviceDetails0);
            }
        }
        this.L(bootstrapConfigurations0);
        baun0.h("Starting account transfer with %d accounts", new Object[]{arrayList0.size()});
        erav0.e(gjkj.K);
        baun0.d("Start FIDO timeout.", new Object[0]);
        eqsl eqsl0 = new eqsl(new bblp(1, 10), null, hyis.c(), new eqyj(this));
        this.D = eqsl0;
        eqsl0.a();
        if(this.ad == null) {
            this.ad = new eqcp(context0, this.ae);
        }
        if(this.y) {
            this.ad.d(arrayList0);
        }
        else {
            this.ad.c(arrayList0);
        }
        evql evql1 = this.T;
        if(evql1 != null) {
            evql1.s(new bbre(this.c), new eqyg(this));
        }
        evql evql2 = this.U;
        if(evql2 != null) {
            this.Q(evql2);
        }
        gmcd gmcd0 = this.V;
        if(gmcd0 != null) {
            gmcd0.hB(() -> try {
                ArrayList arrayList0 = (ArrayList)gmbu.r(gmcd0);
                eqyw.f.d("Sending %d Folsom data payloads.", new Object[]{arrayList0.size()});
                erav erav0 = this.j;
                int v = arrayList0.size();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjn.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjjn gjjn0 = (gjjn)hftp0.b_message;
                gjjn0.b |= 1;
                gjjn0.c = v;
                gjjn gjjn1 = (gjjn)hftp0.N_build();
                ProtoLiteBuilder hftp1 = erav0.o(gjkj.M);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjkn gjkn0 = (gjkn)hftp1.b_message;
                gjjn1.getClass();
                gjkn0.r = gjjn1;
                gjkn0.b |= 0x10000;
                erav0.f(((gjkn)hftp1.N_build()));
                MessagePayload messagePayload0 = new MessagePayload();
                messagePayload0.ap(arrayList0);
                this.n(messagePayload0);
            }
            catch(ExecutionException | CancellationException exception0) {
                eqyw.f.n("Unable to get Folsom data payloads.", exception0, new Object[0]);
            }, new bbre(this.c));
        }
    }

    public final void y(BootstrapOptions bootstrapOptions0) {
        List list0 = bootstrapOptions0.C;
        ArrayList arrayList0 = eqyw.q(this.I);
        if(hyje.a.b().a()) {
            arrayList0 = eqyw.U(arrayList0, list0);
        }
        boolean z = true;
        if(hyis.m()) {
            if(arrayList0.size() == 1) {
                String s = ((BootstrapAccount)gggq.r(arrayList0)).b;
                this.ac = bbmn.w(this.g, s);
            }
            if(list0 != null && !list0.isEmpty()) {
                BootstrapAccount bootstrapAccount0 = (BootstrapAccount)list0.get(0);
                if(this.ac || bootstrapAccount0.f) {
                    eqyw.f.h("Blocking transfer due to Unicorn", new Object[0]);
                    this.l(10703);
                    this.d.d(10703, null);
                    return;
                }
            }
        }
        if(bootstrapOptions0.f != 3 && bootstrapOptions0.f != 7) {
            this.T = this.P.b();
            this.U = this.Q.b();
            this.V = this.R.b(arrayList0);
        }
        if(hyis.a.k().I() && (arrayList0.size() > 1 && this.F == 3 || (this.F == 7 || this.F == 8))) {
            try {
                eqyw.f.h("Account selection is required", new Object[0]);
                this.B(3);
                String s1 = TextUtils.isEmpty(bootstrapOptions0.g) ? erei.d(this.g, this.F) : bootstrapOptions0.g;
                eqwi eqwi0 = this.h;
                eqsm eqsm0 = new eqsm();
                String s2 = this.g.getString((arrayList0.size() == 1 ? 0x7F152E53 : 0x7F152E54));  // string:smartdevice_d2d_account_picker_single_account_title "Confirm your Google 
                                                                                                   // Account"
                batl.r(s2, "Title cannot be null or empty.");
                eqsm0.a = s2;
                eqsm0.b(this.g.getString((arrayList0.size() == 1 ? 0x7F152E9F : 0x7F152E9E), new Object[]{s1}));  // string:smartdevice_quick_start_account_picker_single_account_description "Confirm 
                                                                                                                  // the Google Account you want to use to set up your %s"
                eqsm0.c();
                if(!hyis.u() || this.F != 7) {
                    z = false;
                }
                eqsm0.b = z;
                eqwi0.a(arrayList0, eqsm0.a());
            }
            catch(RemoteException remoteException0) {
                eqyw.f.g("Failed to callback onAccountSelectionRequired()", remoteException0, new Object[0]);
            }
            return;
        }
        this.x(arrayList0, bootstrapOptions0);
    }

    public final void z(JSONObject jSONObject0) {
        try {
            jSONObject0.put("wifi_network", new JSONObject());
        }
        catch(JSONException jSONException0) {
            eqyw.f.m("JSONException " + jSONException0.toString(), new Object[0]);
            return;
        }
        this.o(jSONObject0);
        this.j.m(2);
    }
}

