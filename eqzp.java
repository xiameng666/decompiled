import android.app.RemoteLockscreenValidationSession.Builder;
import android.app.RemoteLockscreenValidationSession;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.Settings.Global;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.d2d.data.SourceDeviceInfo;
import com.google.android.gms.smartdevice.d2d.data.StartServicePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakeOptionFlags;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.RestoreAnytimeContext;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService;
import com.google.android.gms.smartdevice.quickstart.WifiTransferOptions;
import j..util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqzp extends epwu implements erqp {
    private String A;
    private eqft B;
    private final epxd C;
    private final epza D;
    private byte[] E;
    private ArrayList F;
    private ArrayList G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private erqq M;
    private String N;
    public static final baun f;
    public final Context g;
    public eqwu h;
    public eqwo i;
    public epyj j;
    public final eray k;
    public long l;
    public BootstrapOptions m;
    public boolean n;
    public boolean o;
    public RestoreAnytimeContext p;
    public eqsl q;
    public int r;
    public String s;
    public int t;
    public eqzo u;
    public final ConcurrentHashMap v;
    final eqfu w;
    private static final Pattern x;
    private boolean y;
    private ereg z;

    static {
        eqzp.f = new erqc(new String[]{"TargetQuickStartController"});
        eqzp.x = Pattern.compile(".*");
    }

    public eqzp(Context context0, Handler handler0, eqwu eqwu0, epwt epwt0, eray eray0, int v) {
        super(eqzp.f, handler0, epwt0);
        this.n = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.o = false;
        this.t = 1000;
        this.v = new ConcurrentHashMap();
        this.w = new eqzm(this);
        this.g = context0;
        this.h = eqwu0;
        if(v != 1) {
            this.z = new ereg(context0);
        }
        this.C = new epxd(context0, eray0);
        this.D = new epza(context0);
        this.k = eray0;
        this.r = v;
        if(v == 2) {
            this.p = new RestoreAnytimeContext(gakq.d(context0, "source_device_name"), gakq.d(context0, "source_device_android_id_hash"));
        }
    }

    public final void A() {
        erqq erqq0 = this.M;
        if(erqq0 != null) {
            erqq0.b();
        }
    }

    private final void B(int v, boolean z) {
        eqzp.f.m("Falling back due to LskfFallbackReason: %s", new Object[]{v});
        if(v == 10) {
            this.d.d(10770, null);
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((eqoc)hftv0).c = 6;
        ((eqoc)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqoc eqoc0 = (eqoc)hftp0.b_message;
        eqoc0.b |= 2;
        eqoc0.d = v;
        eqoc eqoc1 = (eqoc)hftp0.N_build();
        if(!z) {
            this.m(10769, eqoc1);
        }
        this.d.d(10769, eqoc1);
    }

    @Override  // epwu
    protected final epyj b() {
        return this.j;
    }

    @Override  // epwu
    public final void g(int v, eqoc eqoc0) {
    }

    @Override  // epwu
    protected final void i(MessagePayload messagePayload0) {
        if(messagePayload0.c == 4) {
            this.k.n(10801, null);
        }
        super.i(messagePayload0);
    }

    @Override  // epwu
    protected final void j(MessagePayload messagePayload0) {
        boolean z3;
        int v4;
        JSONObject jSONObject0;
        byte[] arr_b = messagePayload0.r;
        if(arr_b != null) {
            try {
                jSONObject0 = new JSONObject(new String(arr_b, StandardCharsets.UTF_8));
            }
            catch(JSONException jSONException0) {
                eqzp.f.g("Exception while handling QuickStart payload", jSONException0, new Object[0]);
                goto label_287;
            }
            if(!hyid.d()) {
                eqzp.f.d("Received QuickStartPayload: %s", new Object[]{jSONObject0.toString()});
            }
            if(jSONObject0.optBoolean("await_user_verification")) {
                try {
                    this.h.a();
                }
                catch(RemoteException remoteException0) {
                    eqzp.f.l(remoteException0);
                }
            }
            if(jSONObject0.has("user_verification_result")) {
                int v = jSONObject0.optInt("user_verification_result", 1);
                boolean z = jSONObject0.optBoolean("is_first_user_verification");
                eqzp.f.h("Received %s user verification result: %d", new Object[]{(z ? "first" : "second"), v});
                new eqrm(this.g).c(erei.a(v));
                if(v != 0 && v != 2 && v != 3) {
                    this.d.d(0x2A0F, null);
                }
                else {
                    if(v == 0) {
                        this.k.o(gjjm.m);
                    }
                    else if(v == 2) {
                        this.k.o(gjjm.n);
                        v = 2;
                    }
                    if(z && this.r != 1) {
                        this.w();
                    }
                    else {
                        try {
                            this.h.i(v);
                        }
                        catch(RemoteException remoteException1) {
                            eqzp.f.l(remoteException1);
                        }
                    }
                }
            }
            if(jSONObject0.has("user_verification_method")) {
                int v1 = jSONObject0.optInt("user_verification_method");
                this.L = v1;
                eray eray0 = this.k;
                int v2 = erei.g(v1);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjji.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjji)hftp0.b_message).c = v2 - 1;
                ((gjji)hftp0.b_message).b |= 1;
                gjji gjji0 = (gjji)hftp0.N_build();
                ProtoLiteBuilder hftp1 = eray0.y(gjjm.k);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjle gjle0 = (gjle)hftp1.b_message;
                gjji0.getClass();
                gjle0.i = gjji0;
                gjle0.b |= 0x200;
                eray0.k(((gjle)hftp1.N_build()));
            }
            if(jSONObject0.optBoolean("inform_target_request_lskf")) {
                this.v();
            }
            String s = jSONObject0.optString("lskf_details");
            if(!TextUtils.isEmpty(s)) {
                try {
                    JSONObject jSONObject1 = new JSONObject(s);
                    int v3 = jSONObject1.getInt("lskf_type");
                    switch(v3) {
                        case 1: {
                            v4 = 1;
                            goto label_69;
                        }
                        case 2: {
                            v4 = 0;
                            goto label_69;
                        }
                        case 3: {
                            v4 = 2;
                        label_69:
                            byte[] arr_b1 = bbmu.d(jSONObject1.getString("encoded_public_key"));
                            if(arr_b1 == null) {
                                eqzp.f.m("Invalid public key", new Object[0]);
                                this.u(7);
                            }
                            else {
                                int v5 = jSONObject1.optInt("remaining_attempts");
                                if(v5 <= 0) {
                                    eqzp.f.m("No more remaining LSKF guess attempts.", new Object[0]);
                                    this.B(10, true);
                                }
                                else {
                                    RemoteLockscreenValidationSession remoteLockscreenValidationSession0 = new RemoteLockscreenValidationSession.Builder().setLockType(v4).setSourcePublicKey(arr_b1).setRemainingAttempts(v5).build();
                                    this.h.h(remoteLockscreenValidationSession0);
                                }
                            }
                            break;
                        }
                        default: {
                            eqzp.f.m("Invalid LSKF type: %d", new Object[]{v3});
                            this.u(7);
                        }
                    }
                }
                catch(JSONException jSONException1) {
                    eqzp.f.n("Error unpacking LSKF details JSON.", jSONException1, new Object[0]);
                    this.u(7);
                }
                catch(RemoteException remoteException2) {
                    eqzp.f.n("Error prompting for LSKF.", remoteException2, new Object[0]);
                    this.u(8);
                }
            }
            else if(jSONObject0.has("open_vault_response_code")) {
                switch(jSONObject0.optInt("open_vault_response_code")) {
                    case 1: {
                        eqzp.f.d("Open vault response successful", new Object[0]);
                        this.K = 1;
                        if(this.I) {
                            this.w();
                        }
                    label_98:
                        if(!this.I || this.K != 1) {
                            eqzp.f.d("onLskfValidationResult: %s, verifyTargetLskfBeforeWiFiTransfer: %s", new Object[]{((int)this.K), Boolean.valueOf(this.I)});
                            try {
                                this.i.a(this.K);
                            }
                            catch(RemoteException remoteException3) {
                                eqzp.f.l(remoteException3);
                            }
                        }
                        break;
                    }
                    case 3: {
                        this.d.d(10770, null);
                        break;
                    }
                    default: {
                        this.K = 2;
                        goto label_98;
                    }
                }
            }
            else if(jSONObject0.has("lskf_validation_fallback_reason")) {
                this.B(jSONObject0.optInt("lskf_validation_fallback_reason"), true);
            }
            JSONObject jSONObject2 = jSONObject0.optJSONObject("wifi_network");
            JSONObject jSONObject3 = jSONObject0.optJSONObject("source_device_info");
            if(jSONObject2 != null) {
                gfsx gfsx0 = gfsx.l(jSONObject3);
                baun baun0 = eqzp.f;
                baun0.d("Processing WiFi info and setting RestoreInfo.", new Object[0]);
                if(this.I && this.K == 1) {
                    baun0.d("onLskfValidationResult: %s, verifyTargetLskfBeforeWiFiTransfer: %s", new Object[]{((int)1), Boolean.valueOf(this.I)});
                    try {
                        this.i.a(this.K);
                    }
                    catch(RemoteException remoteException4) {
                        eqzp.f.l(remoteException4);
                    }
                }
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjju.a).v_newBuilder();
                try {
                    String s1 = jSONObject2.optString("wifi_ssid");
                    String s2 = jSONObject2.optString("wifi_security_type");
                    Bundle bundle0 = new Bundle();
                    if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)) {
                        eqzp.f.m("Received empty WiFi ssid/securityType", new Object[0]);
                        bundle0.putBundle("wifi_network", Bundle.EMPTY);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gjju)hftp2.b_message).c = 1;
                    }
                    else if(s2.equals("Unsupported")) {
                        eqzp.f.m("Received unsupported securityType", new Object[0]);
                        bundle0.putBundle("wifi_network", Bundle.EMPTY);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gjju)hftp2.b_message).c = 2;
                    }
                    else {
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("wifi_ssid", s1);
                        bundle1.putString("wifi_security_type", s2);
                        bundle1.putBoolean("wifi_hidden_ssid", jSONObject2.getBoolean("wifi_hidden_ssid"));
                        bundle1.putString("wifi_pre_shared_key", jSONObject2.optString("wifi_pre_shared_key"));
                        bundle0.putBundle("wifi_network", bundle1);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gjju)hftp2.b_message).c = 3;
                    }
                    ((gjju)hftp2.b_message).b |= 1;
                    if(this.r != 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("shared_secret", this.A);
                        bundle2.putBoolean("source_not_transferring_new_account", this.J);
                        bundle0.putBundle("ss_context", bundle2);
                        bundle0.putBoolean("keep_connection_after_wifi_transfer", this.H);
                    }
                    String s3 = this.N;
                    if(s3 != null) {
                        bundle0.putString("source_account_given_name", s3);
                    }
                    this.h.j(bundle0);
                }
                catch(RemoteException | JSONException exception0) {
                    eqzp.f.m("Exception " + exception0.toString(), new Object[0]);
                }
                if(gfsx0.i()) {
                    JSONObject jSONObject4 = (JSONObject)gfsx0.d();
                    String s4 = jSONObject4.optString("SOURCE_MODEL");
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gjjj.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gjjj gjjj0 = (gjjj)hftp3.b_message;
                    s4.getClass();
                    gjjj0.b |= 2;
                    gjjj0.d = s4;
                    String s5 = jSONObject4.optString("source_fingerprint");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gjjj gjjj1 = (gjjj)hftp3.b_message;
                    s5.getClass();
                    gjjj1.b |= 1;
                    gjjj1.c = s5;
                    gjjj gjjj2 = (gjjj)hftp3.N_build();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gjju gjju0 = (gjju)hftp2.b_message;
                    gjjj2.getClass();
                    gjju0.d = gjjj2;
                    gjju0.b |= 2;
                    if(this.r != 1) {
                        ereg ereg0 = this.z;
                        if(ereg0 != null) {
                            String s6 = jSONObject4.optString("SOURCE_ANDROID_ID");
                            String s7 = jSONObject4.optString("SOURCE_MANUFACTURER");
                            if(!TextUtils.isEmpty(s6) && !TextUtils.isEmpty(s7) && !TextUtils.isEmpty(s4)) {
                                Settings.Global.putString(ereg0.c.getContentResolver(), "quick_start_source_manufacturer", s7);
                                erop erop0 = ereg0.b;
                                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)eqoj.a).v_newBuilder();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp4.b_message;
                                s6.getClass();
                                ((eqoj)hftv0).b |= 1;
                                ((eqoj)hftv0).c = s6;
                                if(!hftv0.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp4.b_message;
                                s7.getClass();
                                ((eqoj)hftv1).b |= 2;
                                ((eqoj)hftv1).d = s7;
                                if(!hftv1.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                eqoj eqoj0 = (eqoj)hftp4.b_message;
                                s4.getClass();
                                eqoj0.b |= 4;
                                eqoj0.e = s4;
                                eroi eroi0 = new eroi(hftp4);
                                ereg0.a(erop0.a.b(eroi0, gmap.a));
                            }
                            ereg0.b(3);
                            if(gfqz.e(Build.MANUFACTURER, "samsung")) {
                                ereg0.c(2);
                            }
                            else {
                                ereg0.c(1);
                            }
                        }
                    }
                }
                eray eray1 = this.k;
                gjju gjju1 = (gjju)hftp2.N_build();
                ProtoLiteBuilder hftp5 = eray1.y(gjjm.q);
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gjle gjle1 = (gjle)hftp5.b_message;
                gjju1.getClass();
                gjle1.j = gjju1;
                gjle1.b |= 0x400;
                eray1.k(((gjle)hftp5.N_build()));
            }
            JSONObject jSONObject5 = jSONObject0.optJSONObject("oem_connection_hint");
            if(jSONObject5 != null) {
                long v6 = jSONObject5.optLong("oem_package_version_long");
                String s8 = jSONObject5.optString("oem_package_name");
                String s9 = jSONObject5.optString("wifi_direct_address");
                eqzp.f.d("Received WiFi direct mac address: " + s9, new Object[0]);
                cjpa cjpa0 = new eqrm(this.g).b.c();
                cjpa0.h("wifi_direct_address", s9);
                cjpa0.h("pkg_name", s8);
                cjpa0.h("pkg_version", Long.toString(v6));
                cjpd.g(cjpa0);
            }
            if(jSONObject0.optBoolean("response_start_restore")) {
                eqzo eqzo0 = this.u;
                if(eqzo0 != null) {
                    eray eray2 = ((TargetQuickStartChimeraService)eqzo0).h;
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gjlg.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp6.b_message;
                    ((gjlg)hftv2).e = 2;
                    ((gjlg)hftv2).b |= 4;
                    if(!hftv2.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gjlg gjlg0 = (gjlg)hftp6.b_message;
                    gjlg0.b |= 8;
                    gjlg0.f = 0L;
                    eray2.q(((gjlg)hftp6.N_build()));
                    try {
                        eqxd eqxd0 = ((TargetQuickStartChimeraService)eqzo0).g;
                        if(eqxd0 != null) {
                            eqxd0.a(0);
                        }
                    }
                    catch(RemoteException remoteException5) {
                        TargetQuickStartChimeraService.a.l(remoteException5);
                    }
                    if(((long)azqk.a(((Context)eqzo0))) >= hyis.i()) {
                        TargetQuickStartChimeraService.a.d("Multiplex turned on, extend connection.", new Object[0]);
                    }
                    else {
                        ((TargetQuickStartChimeraService)eqzo0).c.e();
                        ((Service)eqzo0).stopSelf();
                    }
                }
            }
            if(jSONObject0.has("source_event_type")) {
                int v7 = jSONObject0.optInt("source_event_type");
                baun baun1 = eqzp.f;
                Integer integer0 = v7;
                baun1.h("Processing source event type: %d", new Object[]{integer0});
                try {
                    switch(v7) {
                        case 3: {
                            this.h.f(new QuickStartTargetEventData(6, null, null, 0, false, null, 0, null, false, null, 0));
                            break;
                        }
                        case 4: {
                            this.h.f(new QuickStartTargetEventData(7, null, null, 0, false, null, 0, null, false, null, 0));
                            break;
                        }
                        case 8: {
                            this.h.f(new QuickStartTargetEventData(10, null, null, 0, false, null, 0, null, false, null, 0));
                            this.k.o(gjjm.s);
                            break;
                        }
                        default: {
                            baun1.m("Received unexpected source event type: %d", new Object[]{integer0});
                        }
                    }
                }
                catch(RemoteException remoteException6) {
                    eqzp.f.g("Failed to call onEvent callback", remoteException6, new Object[0]);
                }
            }
        }
    label_287:
        QuickStartHandshakePayload quickStartHandshakePayload0 = messagePayload0.t;
        if(quickStartHandshakePayload0 != null) {
            if(hyje.c()) {
                RestoreAnytimeContext restoreAnytimeContext0 = quickStartHandshakePayload0.e;
                if(restoreAnytimeContext0 != null) {
                    int v8 = restoreAnytimeContext0.d;
                    if(v8 != 1) {
                        eray eray3 = this.k;
                        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gjjx.a).v_newBuilder();
                        gjjw gjjw0 = gjjw.b(v8);
                        gftb.check(gjjw0);
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        ((gjjx)hftp7.b_message).c = gjjw0.g;
                        ((gjjx)hftp7.b_message).b |= 1;
                        gjjx gjjx0 = (gjjx)hftp7.N_build();
                        ProtoLiteBuilder hftp8 = eray3.y(gjjm.C);
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gjle gjle2 = (gjle)hftp8.b_message;
                        gjjx0.getClass();
                        gjle2.l = gjjx0;
                        gjle2.b |= 0x1000;
                        eray3.k(((gjle)hftp8.N_build()));
                        try {
                            this.h.f(new QuickStartTargetEventData(4, null, null, restoreAnytimeContext0.d, false, null, 0, null, false, null, 0));
                        }
                        catch(RemoteException remoteException7) {
                            eqzp.f.l(remoteException7);
                        }
                    }
                    eqzp.f.d("sourceNotTransferringNewAccount: " + restoreAnytimeContext0.f, new Object[0]);
                    this.J = restoreAnytimeContext0.f;
                }
            }
            SourceDeviceInfo sourceDeviceInfo0 = quickStartHandshakePayload0.d;
            if(sourceDeviceInfo0 != null) {
                this.N = sourceDeviceInfo0.j;
                if(this.r != 1) {
                    int v9 = sourceDeviceInfo0.f;
                    if(v9 > 0) {
                        Context context0 = this.g;
                        if(context0.checkCallingOrSelfPermission("com.google.android.setupwizard.WRITE_DEVICE_ORIGIN") == 0) {
                            eqzp.f.d("source device sdk version: %d ", new Object[]{v9});
                            ContentValues contentValues0 = new ContentValues();
                            contentValues0.put("value", String.valueOf(v9));
                            contentValues0.put("type", "java.lang.String");
                            Uri uri0 = gakq.b("source_device_os_version");
                            contentValues0.put("key", "source_device_os_version");
                            try {
                                context0.getContentResolver().update(uri0, contentValues0, null, null);
                            }
                            catch(IllegalArgumentException illegalArgumentException0) {
                                Log.e("DeviceOrigin", "Failed to write value", illegalArgumentException0);
                            }
                        }
                    }
                }
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gjjj.a).v_newBuilder();
                String s10 = sourceDeviceInfo0.d;
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                gjjj gjjj3 = (gjjj)hftp9.b_message;
                s10.getClass();
                gjjj3.b |= 2;
                gjjj3.d = s10;
                String s11 = sourceDeviceInfo0.g;
                String s12 = sourceDeviceInfo0.h;
                if(!TextUtils.isEmpty(s11) && !TextUtils.isEmpty(s12)) {
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp9.b_message;
                    s11.getClass();
                    ((gjjj)hftv3).b |= 4;
                    ((gjjj)hftv3).e = s11;
                    if(!hftv3.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gjjj gjjj4 = (gjjj)hftp9.b_message;
                    s12.getClass();
                    gjjj4.b |= 8;
                    gjjj4.f = s12;
                }
                if(!TextUtils.isEmpty(sourceDeviceInfo0.i)) {
                    String s13 = sourceDeviceInfo0.i;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gjjj gjjj5 = (gjjj)hftp9.b_message;
                    s13.getClass();
                    gjjj5.b |= 16;
                    gjjj5.g = s13;
                }
                eray eray4 = this.k;
                gjjj gjjj6 = (gjjj)hftp9.N_build();
                ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gjjr.a).v_newBuilder();
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                gjjr gjjr0 = (gjjr)hftp10.b_message;
                gjjj6.getClass();
                gjjr0.c = gjjj6;
                gjjr0.b |= 1;
                gjjr gjjr1 = (gjjr)hftp10.N_build();
                ProtoLiteBuilder hftp11 = eray4.y(gjjm.j);
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                gjle gjle3 = (gjle)hftp11.b_message;
                gjjr1.getClass();
                gjle3.h = gjjr1;
                gjle3.b |= 0x100;
                eray4.k(((gjle)hftp11.N_build()));
                try {
                    this.h.f(new QuickStartTargetEventData(11, null, null, 0, false, null, (this.n ? 2 : 1), null, false, null, 0));
                }
                catch(RemoteException remoteException8) {
                    eqzp.f.g("Failed to call onEvent callback", remoteException8, new Object[0]);
                }
            }
            QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags0 = quickStartHandshakePayload0.f;
            if(quickStartHandshakeOptionFlags0 != null) {
                try {
                    this.H = quickStartHandshakeOptionFlags0.q(1);
                    boolean z1 = quickStartHandshakeOptionFlags0.q(2);
                    this.I = z1;
                    this.h.f(new QuickStartTargetEventData(13, null, null, 0, false, null, 0, null, z1, null, 0));
                }
                catch(RemoteException remoteException9) {
                    eqzp.f.g("Failed to call onEvent callback", remoteException9, new Object[0]);
                }
            }
            if(this.L != 0 && !this.I) {
                this.w();
            }
        }
        BootstrapConfigurations bootstrapConfigurations0 = messagePayload0.e;
        if(bootstrapConfigurations0 != null) {
            ArrayList arrayList0 = bootstrapConfigurations0.g;
            boolean z2 = arrayList0 != null && arrayList0.size() == 1 && ((BootstrapAccount)arrayList0.get(0)).f;
            ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gjjq.a).v_newBuilder();
            int v10 = arrayList0 == null ? -1 : arrayList0.size();
            if(!hftp12.b_message.isImmutable()) {
                hftp12.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp12.b_message;
            ((gjjq)hftv4).b |= 1;
            ((gjjq)hftv4).c = v10;
            if(!hftv4.isImmutable()) {
                hftp12.ensureMutable();
            }
            gjjq gjjq0 = (gjjq)hftp12.b_message;
            gjjq0.b |= 2;
            gjjq0.d = z2;
            gjjq gjjq1 = (gjjq)hftp12.N_build();
            eray eray5 = this.k;
            ProtoLiteBuilder hftp13 = eray5.y(gjjm.K);
            if(!hftp13.b_message.isImmutable()) {
                hftp13.ensureMutable();
            }
            gjle gjle4 = (gjle)hftp13.b_message;
            gjjq1.getClass();
            gjle4.n = gjjq1;
            gjle4.b |= 0x4000;
            eray5.k(((gjle)hftp13.N_build()));
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                epxf epxf0 = this.e;
                epxf0.h = arrayList0.size();
                epxf0.i = (BootstrapAccount)arrayList0.get(0);
                epxf0.j = new ArrayList(arrayList0);
            }
            if(arrayList0 != null) {
                try {
                    this.h.f(new QuickStartTargetEventData(8, null, null, 0, false, new ArrayList(arrayList0), 0, null, false, null, 0));
                }
                catch(RemoteException remoteException10) {
                    eqzp.f.g("Failed to call onEvent callback", remoteException10, new Object[0]);
                }
            }
        }
        if(messagePayload0.c == 5) {
            SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
            if(secondDeviceAuthPayload0 != null) {
                String s14 = secondDeviceAuthPayload0.e;
                String s15 = secondDeviceAuthPayload0.d;
                ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)gjjs.a).v_newBuilder();
                int v11 = s15 == null ? -1 : s15.length();
                if(!hftp14.b_message.isImmutable()) {
                    hftp14.ensureMutable();
                }
                gjjs gjjs0 = (gjjs)hftp14.b_message;
                gjjs0.b |= 1;
                gjjs0.c = v11;
                gjjs gjjs1 = (gjjs)hftp14.N_build();
                eray eray6 = this.k;
                ProtoLiteBuilder hftp15 = eray6.y(gjjm.L);
                if(!hftp15.b_message.isImmutable()) {
                    hftp15.ensureMutable();
                }
                gjle gjle5 = (gjle)hftp15.b_message;
                gjjs1.getClass();
                gjle5.t = gjjs1;
                gjle5.b |= 0x100000;
                eray6.k(((gjle)hftp15.N_build()));
                if(s14 != null) {
                    this.e.b = s14;
                }
                if(!TextUtils.isEmpty(s15)) {
                    epxf epxf1 = this.e;
                    epxf1.d = new BootstrapAccount(s15, "com.google");
                    try {
                        eqwu eqwu0 = this.h;
                        batl.t(s15, "Restore account cannot be null");
                        eqwu0.f(new QuickStartTargetEventData(12, null, null, 0, false, null, 0, s15, false, null, 0));
                    }
                    catch(RemoteException remoteException11) {
                        eqzp.f.l(remoteException11);
                    }
                }
            }
            if(this.B == null) {
                eray eray7 = eray.i(this.g);
                z3 = true;
                this.B = new eqft(this.g, eray7, this.w, this.m.i, (this.n ? 2 : 1));
            }
            else {
                z3 = true;
            }
            this.B.l = (long)this.l;
            eqft eqft0 = this.B;
            if(this.r != 3) {
                z3 = false;
            }
            eqft0.e = z3;
            eqft0.d();
        }
        SecondDeviceAuthPayload secondDeviceAuthPayload1 = messagePayload0.p;
        if(secondDeviceAuthPayload1 != null) {
            eqft eqft1 = this.B;
            if(eqft1 != null) {
                byte[] arr_b2 = secondDeviceAuthPayload1.c;
                if(arr_b2 != null) {
                    eqft1.e(arr_b2);
                }
                List list0 = secondDeviceAuthPayload1.a;
                if(messagePayload0.c == 6 && list0 != null) {
                    eqzp.f.j("Source completed fallback.", new Object[0]);
                    this.B.c(list0);
                }
            }
        }
        BlockstorePayload blockstorePayload0 = messagePayload0.o;
        if(blockstorePayload0 != null) {
            this.E = blockstorePayload0.b;
        }
        ArrayList arrayList1 = messagePayload0.q;
        if(arrayList1 != null) {
            this.F = arrayList1;
        }
        WorkProfilePayload workProfilePayload0 = messagePayload0.m;
        if(workProfilePayload0 != null) {
            eqzp.f.h("Persisting work profile %s", new Object[]{baun.q(workProfilePayload0.b)});
            new eqln(this.g, this.c).e(workProfilePayload0);
            this.e.e = workProfilePayload0.c;
            CleanSharedSecretChimeraService.e(this.g);
        }
        StartServicePayload startServicePayload0 = messagePayload0.s;
        if(startServicePayload0 != null) {
            baun baun2 = eqzp.f;
            baun2.j("processStartServicePayload: %s", new Object[]{startServicePayload0});
            StartServiceResponse startServiceResponse0 = startServicePayload0.d;
            String s16 = startServicePayload0.b;
            String s17 = startServicePayload0.e;
            if(startServiceResponse0 == null) {
                baun2.m("Did not receive startServiceResponse from the source device for package: %s and action: %s", new Object[]{s16, s17});
                return;
            }
            kau kau0 = new kau(s16, s17);
            kau kau1 = (kau)this.v.get(kau0);
            if(kau1 == null) {
                baun2.m("Could not find startServiceOnSource callbacks for package: %s and action: %s", new Object[]{s16, s17});
                return;
            }
            eray eray8 = this.k;
            eqxg eqxg0 = (eqxg)kau1.a;
            eqsl eqsl0 = (eqsl)kau1.b;
            ProtoLiteBuilder hftp16 = ((ProtoLiteMessage)gjkz.a).v_newBuilder();
            int v12 = gjky.a(startServiceResponse0.b);
            if(!hftp16.b_message.isImmutable()) {
                hftp16.ensureMutable();
            }
            gjkz gjkz0 = (gjkz)hftp16.b_message;
            if(v12 == 0) {
                throw null;
            }
            gjkz0.e = v12 - 1;
            gjkz0.b |= 4;
            eray8.r(((gjkz)hftp16.N_build()));
            try {
                try {
                    eqxg0.a(Status.b, startServiceResponse0);
                    eqsl0.b();
                    baun2.d("sendStartServiceResult: %s for package: %s and action: %s", new Object[]{startServiceResponse0, s16, s17});
                    goto label_541;
                }
                catch(RemoteException remoteException12) {
                }
                eqzp.f.l(remoteException12);
            }
            catch(Throwable throwable0) {
                this.v.remove(kau0);
                throw throwable0;
            }
            this.v.remove(kau0);
            return;
        label_541:
            this.v.remove(kau0);
        }
    }

    public final void p() {
        int v = 2;
        this.k(2);
        BootstrapCompletionResult bootstrapCompletionResult0 = this.a();
        if(hyis.y() && this.r != 3) {
            ArrayList arrayList0 = bootstrapCompletionResult0.k;
            ArrayList arrayList1 = bootstrapCompletionResult0.c;
            int v1 = eqri.a(arrayList0);
            int v2 = eqri.a(arrayList1);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gjjb)hftv0).b |= 2;
            ((gjjb)hftv0).d = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjjb gjjb0 = (gjjb)hftp0.b_message;
            gjjb0.b |= 1;
            gjjb0.c = v2;
            if(this.r == 1 && eqsh.a(this.g) == 3) {
                gjjb gjjb1 = (gjjb)hftp0.N_build();
                this.k.m(gjjb1);
            }
            else if(arrayList0 != null && !arrayList0.isEmpty()) {
                BootstrapAccount bootstrapAccount0 = bootstrapCompletionResult0.d;
                BootstrapAccount bootstrapAccount1 = (BootstrapAccount)arrayList0.get(0);
                if(bootstrapAccount0 != null && !TextUtils.isEmpty(bootstrapAccount0.b)) {
                    if(!eqsh.u(bootstrapAccount0.b, arrayList1)) {
                        v = 3;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjjb)hftp0.b_message).e = v - 1;
                    ((gjjb)hftp0.b_message).b |= 4;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjjb)hftp0.b_message).e = 3;
                    ((gjjb)hftp0.b_message).b |= 4;
                    if(!eqsh.u(bootstrapAccount1.b, arrayList1)) {
                        v = 3;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjjb)hftp0.b_message).f = v - 1;
                    ((gjjb)hftp0.b_message).b |= 8;
                }
                gjjb gjjb2 = (gjjb)hftp0.N_build();
                this.k.m(gjjb2);
            }
        }
        this.d.b(bootstrapCompletionResult0);
        if(this.y) {
            byte[] arr_b = this.E;
            if(arr_b != null) {
                this.C.c(arr_b, this.c);
            }
        }
        gmcd gmcd0 = this.D.c(this.F, this.G);
        if(gmcd0 == null) {
            return;
        }
        eqzp.f.d("Storing Folsom data.", new Object[0]);
        gmcd0.hB(() -> try {
            Integer integer0 = (Integer)gmbu.r(gmcd0);
            int v = (int)integer0;
            eqzp.f.d("Stored Folsom keys for %s accounts.", new Object[]{integer0});
            eray eray0 = this.k;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjjn gjjn0 = (gjjn)hftp0.b_message;
            gjjn0.b |= 1;
            gjjn0.c = v;
            gjjn gjjn1 = (gjjn)hftp0.N_build();
            ProtoLiteBuilder hftp1 = eray0.y(gjjm.U);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjle gjle0 = (gjle)hftp1.b_message;
            gjjn1.getClass();
            gjle0.A = gjjn1;
            gjle0.b |= 0x8000000;
            eray0.k(((gjle)hftp1.N_build()));
        }
        catch(ExecutionException | CancellationException exception0) {
            eqzp.f.n("Unable to store all Folsom keys.", exception0, new Object[0]);
        }, new bbre(this.c));
    }

    @Override  // erqp
    public final void r(Set set0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: set0) {
            ScanResult scanResult0 = (ScanResult)object0;
            if(!TextUtils.isEmpty(scanResult0.SSID)) {
                String s = erqr.c(scanResult0);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("wifi_ssid", scanResult0.SSID);
                    jSONObject0.put("wifi_security_type", s);
                    jSONObject0.put("wifi_rssi", scanResult0.level);
                }
                catch(JSONException jSONException0) {
                    eqzp.f.l(jSONException0);
                }
                ggdy0.i(jSONObject0);
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        if(gged0.isEmpty()) {
            return;
        }
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("wifi_list", gged0);
        }
        catch(JSONException jSONException1) {
            eqzp.f.l(jSONException1);
        }
        eqzp.f.d("Sending WiFi list", new Object[0]);
        this.o(jSONObject1);
    }

    @Override  // erqp
    public final void s(Set set0) {
    }

    @Override  // erqp
    public final void t(Set set0) {
    }

    public final void u(int v) {
        this.B(v, false);
    }

    public final void v() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("request_lskf", true);
        }
        catch(JSONException jSONException0) {
            eqzp.f.n("Error sending request for LSKF details", jSONException0, new Object[0]);
            return;
        }
        this.o(jSONObject0);
    }

    final void w() {
        this.x(null);
    }

    public final void x(WifiTransferOptions wifiTransferOptions0) {
        baun baun0 = eqzp.f;
        baun0.h("Send WiFi request.", new Object[0]);
        if(wifiTransferOptions0 != null && this.n) {
            baun0.h("Start WiFi scan.", new Object[0]);
            if(this.M == null) {
                this.M = new erqq(this.g, eqzp.x, this);
            }
            this.M.a();
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("request_wifi", true);
            jSONObject0.put("SESSION_ID", this.l);
            if(this.r != 1) {
                String s = bbmu.a(epwf.c());
                this.A = s;
                jSONObject0.put("shared_secret", s);
                new eqrm(this.g).b(bbmu.d(this.A), this.l);
            }
            else if(wifiTransferOptions0 != null && wifiTransferOptions0.a) {
                jSONObject0.put("force_wifi_picker", true);
            }
        }
        catch(JSONException jSONException0) {
            eqzp.f.l(jSONException0);
            return;
        }
        this.k.o(gjjm.p);
        this.o(jSONObject0);
    }

    public final void y(List list0) {
        this.y |= list0.isEmpty() ^ 1;
        epxf epxf0 = this.e;
        ArrayList arrayList0 = epxf0.a().c;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
        }
        if(this.G == null) {
            this.G = new ArrayList(list0.size());
        }
        arrayList0.addAll(list0);
        this.G.addAll(eqsh.j(list0));
        epxf0.c = new ArrayList(arrayList0);
    }

    protected final void z() {
        eqsl eqsl0 = this.q;
        if(eqsl0 != null) {
            eqsl0.b();
        }
    }
}

