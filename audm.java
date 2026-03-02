import android.content.Context;
import android.provider.Settings.Global;
import android.text.TextUtils;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.EqualizerBandSettings;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class audm extends auqv {
    final boolean a;
    public final Context b;
    public final auxc c;
    public final ausd d;
    public final audj e;
    public final ausd f;
    public final ausb g;
    public final ausd h;
    public final audr i;
    public double j;
    public int k;
    public int l;
    final aucd m;
    private final int q;
    private final int r;
    private final ScheduledExecutorService s;
    private final avij t;
    private final ausb u;
    private final audi v;
    private final boolean w;
    private String x;
    private final atty y;
    private ScheduledFuture z;

    public audm(aucd aucd0, Context context0, ScheduledExecutorService scheduledExecutorService0, String s, auxc auxc0, String s1) {
        Objects.requireNonNull(aucd0);
        this.m = aucd0;
        super(avjg.b, "ReceiverControlChannel", s1);
        int v = (int)hqub.a.b().a();
        this.q = v;
        int v1 = (int)hqub.a.b().b();
        this.r = v1;
        this.a = hqtx.a.c().d();
        this.j = NaN;
        this.w = hqqp.d();
        this.x = "";
        this.s = scheduledExecutorService0;
        this.c = auxc0;
        this.t = avij.e();
        audi audi0 = new audi(this);
        this.v = audi0;
        this.y = new atty(context0, audi0, s1);
        this.k = -1;
        this.l = -1;
        this.b = context0;
        this.x = s;
        this.d = new ausd(((long)v), "launch");
        this.e = new audj(this);
        this.f = new ausd(((long)v1), "stop");
        this.g = new audl(this);
        this.h = new ausd(((long)v1), "status");
        this.u = new audk(this);
        this.i = new audr(((long)v1));
    }

    @Override  // auqv
    public final void E(String s) {
        String s7;
        aube aube0;
        int v2;
        boolean z;
        aurs aurs0 = this.n;
        aurs0.c("Received: %s", new Object[]{s});
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = aurf.j(jSONObject0, "type");
            if(s1 == null) {
                return;
            }
            long v = jSONObject0.optLong("requestId", -1L);
            if(!"LAUNCH_STATUS".equals(s1)) {
                z = true;
            }
            else if(jSONObject0.optString("status", "").equals("USER_PENDING_AUTHORIZATION")) {
                aurs0.c("Creating User Accept Dialog in ReceiverControlChannel for device %s (context %s)", new Object[]{this.x, this.b});
                this.y.b(1, this.x, -1);
                z = true;
            }
            else {
                z = true;
                aurs0.c("Closing User Accept Dialog (launchStatus assumed resolved)", new Object[0]);
                this.y.a();
            }
            if(!"RECEIVER_STATUS".equals(s1)) {
                if(!"LAUNCH_ERROR".equals(s1)) {
                    if(!"INVALID_REQUEST".equals(s1)) {
                        return;
                    }
                    String s2 = aurf.j(jSONObject0, "reason");
                    int v1 = "INVALID_COMMAND".equals(s2) || "INVALID_PARAMS".equals(s2) || "DUPLICATE_REQUEST_ID".equals(s2) || "INVALID_SESSION_ID".equals(s2) ? 2001 : 13;
                    this.d.g(v, v1);
                    this.f.g(v, v1);
                    this.h.g(v, v1);
                    return;
                }
                String s3 = aurf.j(jSONObject0, "extendedError");
                atty atty0 = this.y;
                String s4 = this.x;
                if(s3 == null) {
                    atty0.a.c("skip showing connection fail dialog for null extendedError", new Object[0]);
                }
                else {
                    if(s3.equals("USER_NOTIFICATIONS_DISABLED")) {
                        v2 = 2021;
                    }
                    else if(s3.equals("USER_NOT_ALLOWED")) {
                        v2 = 2019;
                    }
                    else if(s3.equals("USER_TIMEOUT")) {
                        v2 = 2020;
                    }
                    else {
                        v2 = s3.equals("USER_PROFILE_DISABLED") ? 2022 : -1;
                    }
                    switch(v2) {
                        case -1: {
                            atty0.a.c("skip showing connection fail dialog with unknown extendedError (%s)", new Object[]{s3});
                            goto label_51;
                        }
                        case 2021: {
                            atty0.b(3, s4, 2021);
                            break;
                        }
                        case 2022: {
                            atty0.b(4, s4, 2022);
                            break;
                        }
                        default: {
                            atty0.b(2, s4, v2);
                        }
                    }
                    this.d.e();
                    return;
                }
            label_51:
                String s5 = aurf.j(jSONObject0, "reason");
                int v3 = 0x9AC;
                if(s5 != null) {
                    switch(s5) {
                        case "BAD_PARAMETER": {
                            v3 = 0x9A7;
                            break;
                        }
                        case "CANCELLED": {
                            v3 = 0x9A8;
                            break;
                        }
                        case "CAST_INIT_TIMEOUT": {
                            v3 = 0x9A9;
                            break;
                        }
                        case "MULTICHANNEL_NOT_CONNECTED": {
                            v3 = 0x9AE;
                            break;
                        }
                        case "NOT_ALLOWED": {
                            v3 = 0x9AA;
                            break;
                        }
                        case "NOT_FOUND": {
                            v3 = 2004;
                            break;
                        }
                        case "SYSTEM_ERROR": {
                            v3 = 0x9AB;
                        }
                    }
                }
                this.d.g(v, v3);
                return;
            }
            this.y.a();
            JSONObject jSONObject1 = jSONObject0.getJSONObject("status");
            int v4 = !this.t.q(this.b) || !jSONObject1.has("version") ? 1 : jSONObject1.getInt("version");
            if(jSONObject1.has("applications")) {
                JSONArray jSONArray0 = jSONObject1.getJSONArray("applications");
                if(jSONArray0.length() <= 0) {
                    aube0 = null;
                }
                else {
                    JSONObject jSONObject2 = jSONArray0.getJSONObject(0);
                    try {
                        aube0 = new aube(jSONObject2);
                    }
                    catch(JSONException unused_ex) {
                        this.n.c("Error extracting the application info.", new Object[0]);
                        aube0 = null;
                    }
                }
            }
            else {
                aube0 = null;
            }
            if(this.d.g(v, 0)) {
                if(aube0 != null) {
                    this.n.c("application launch has completed", new Object[0]);
                    aucd aucd0 = this.m;
                    if(aucd0.w != null && aucd0.v != null) {
                        aucd0.k.m("an app was running before; notifying that it\'s gone now");
                        aucd0.E(2005);
                    }
                    aucd0.B(aube0, true, v, v4);
                    return;
                }
                return;
            }
            if(this.f.g(v, 0)) {
                this.e();
                return;
            }
            auxc auxc0 = this.c;
            String s6 = auxc0.f;
            if(s6 != null) {
                if(aube0 == null) {
                    aube0 = null;
                    s7 = null;
                }
                else {
                    s7 = aube0.e;
                }
                if(s7 != null && s7.equals(s6)) {
                    z = false;
                }
                aurs aurs1 = this.n;
                aurs1.c("The current session ID is %s and the new session ID is %s", new Object[]{s6, s7});
                if(!z) {
                    this.h();
                    if(this.d()) {
                        aurs1.c("There is an in-progress stream expansion and sessionId (%s) is matched", new Object[]{s6});
                        auxf auxf0 = auxc0.a;
                        if(auxf0 != null && auxf0.a == auxe.c) {
                            auxf0.b();
                        }
                    }
                }
                else if(this.d()) {
                    aurs1.c("Ignore the session ID changing from %s to %s during the stream expansion", new Object[]{s6, s7});
                    this.h();
                }
                else {
                    String s8 = String.format(Locale.ROOT, "Session stopped as sessionId changes from %s to %s", s6, s7);
                    aurs1.c("Delay stopping application as sessionId changes from %s to %s", new Object[]{s6, s7});
                    audh audh0 = new audh(this, s8);
                    this.z = this.s.schedule(audh0, 1000L, TimeUnit.MILLISECONDS);
                }
            }
            DeviceStatus deviceStatus0 = new DeviceStatus(NaN, false, -1, null, -1, null, NaN);
            this.k = -1;
            if(jSONObject1.has("isActiveInput")) {
                this.k = jSONObject1.getBoolean("isActiveInput");
            }
            deviceStatus0.c = this.k;
            this.l = -1;
            if(jSONObject1.has("isStandBy")) {
                this.l = jSONObject1.getBoolean("isStandBy");
            }
            deviceStatus0.e = this.l;
            boolean z1 = this.h.g(v, 0);
            if(jSONObject1.has("userEq") && this.w) {
                JSONObject jSONObject3 = jSONObject1.getJSONObject("userEq");
                EqualizerSettings equalizerSettings0 = null;
                if(jSONObject3 != null && (jSONObject3.has("low_shelf") && jSONObject3.has("high_shelf"))) {
                    try {
                        equalizerSettings0 = new EqualizerSettings(EqualizerBandSettings.a(jSONObject3.getJSONObject("low_shelf")), EqualizerBandSettings.a(jSONObject3.getJSONObject("high_shelf")));
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                deviceStatus0.f = equalizerSettings0;
            }
            if(!jSONObject1.has("volume")) {
                this.f(aube0, z1, deviceStatus0, v4);
                return;
            }
            JSONObject jSONObject4 = jSONObject1.getJSONObject("volume");
            if(this.a) {
                double f = jSONObject4.optDouble("stepInterval");
                this.j = f;
                deviceStatus0.g = f;
            }
            double f1 = jSONObject4.getDouble("level");
            deviceStatus0.a = f1;
            boolean z2 = jSONObject4.getBoolean("muted");
            deviceStatus0.b = z2;
            if(this.i.b(v, f1, z2)) {
                this.n.c("Ignore the received device volume (%f) and mute state (%b)", new Object[]{f1, Boolean.valueOf(z2)});
                return;
            }
            this.n.c("notify device update with volume (%f) and mute (%b) state report", new Object[]{f1, Boolean.valueOf(z2)});
            this.f(aube0, z1, deviceStatus0, v4);
        }
        catch(JSONException jSONException0) {
            this.n.g("Message is malformed (%s); ignoring: %s", new Object[]{jSONException0.getMessage(), s});
        }
    }

    public final long a(String s, String s1, String[] arr_s, CredentialsData credentialsData0) {
        JSONObject jSONObject0 = new JSONObject();
        long v = this.k();
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "LAUNCH");
            jSONObject0.put("appId", s);
            jSONObject0.put("senderDeviceName", Settings.Global.getString(this.b.getContentResolver(), "device_name"));
            if(s1 != null) {
                jSONObject0.put("language", s1);
            }
            if(arr_s != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    jSONArray0.put(arr_s[v1]);
                }
                jSONObject0.put("supportedAppTypes", jSONArray0);
            }
            if(credentialsData0 != null) {
                JSONObject jSONObject1 = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    String s2 = credentialsData0.a;
                    if(s2 != null) {
                        jSONObject3.put("credentials", s2);
                    }
                    String s3 = credentialsData0.b;
                    if(s3 != null) {
                        jSONObject3.put("credentialsType", s3);
                    }
                }
                catch(JSONException unused_ex) {
                }
                jSONObject2.put("credentialsData", jSONObject3);
                jSONObject1.put("launchCheckerParams", jSONObject2);
                jSONObject0.put("appParams", jSONObject1);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.e.a = s;
        this.e.b = s1;
        this.e.c = arr_s;
        this.e.d = credentialsData0;
        this.d.f(v, this.e);
        this.m(jSONObject0.toString(), v, this.c.a());
        return v;
    }

    public final void b() {
        if(this.h.j()) {
            return;
        }
        long v = this.k();
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "GET_STATUS");
        }
        catch(JSONException unused_ex) {
        }
        this.m(jSONObject0.toString(), v, this.c.a());
        this.h.f(v, this.u);
    }

    public final boolean d() {
        auxf auxf0 = this.c.a;
        return auxf0 != null && auxf0.a != auxe.a;
    }

    protected final void e() {
        int v = this.m.y ? 0 : 0x807;
        this.m.y = false;
        this.m.R = null;
        this.m.S = null;
        this.m.E(v);
    }

    protected final void f(aube aube0, boolean z, DeviceStatus deviceStatus0, int v) {
        boolean z1;
        this.n.c("onStatusReceived", new Object[0]);
        aucd aucd0 = this.m;
        avjh avjh0 = aucd0.k;
        avjh0.p("processReceiverStatus: applicationInfo=%s, deviceStatus=%s", aube0, deviceStatus0);
        aucd0.x = aube0 == null ? null : aube0.f;
        if(aucd0.p()) {
            if(aucd0.I) {
                if(aube0 != null) {
                    deviceStatus0.d = aucd.ab(aube0, v);
                }
                aubj aubj0 = aucd0.O;
                if(aubj0 != null) {
                    aubj0.e.j(deviceStatus0);
                }
                aubj aubj1 = aucd0.O;
                if(aubj1 != null) {
                    ApplicationStatus applicationStatus0 = new ApplicationStatus(null);
                    applicationStatus0.a = aucd0.x;
                    aubj1.e.hk(applicationStatus0);
                }
            }
            else {
                aubj aubj2 = aucd0.O;
                if(aubj2 != null) {
                    aubj2.e.n(aucd0.x, deviceStatus0.a, deviceStatus0.b);
                }
            }
        }
        if(z) {
            String s = aucd0.B;
            if(s != null) {
                String s1 = aucd0.E;
                if(aube0 != null) {
                    if(TextUtils.isEmpty(s1)) {
                        boolean z2 = aucd0.B != null && aucd0.B.equals("");
                        if(!"ANDROID_TV".equals(aube0.c) || !aucd0.W) {
                            if(z2) {
                                z1 = aucd0.Z(aube0.c);
                                goto label_39;
                            }
                            else if(s.equals(aube0.a)) {
                                z1 = aucd0.Z(aube0.c);
                                goto label_39;
                            }
                            else if(s.equals(aube0.b)) {
                                z1 = aucd0.Z(aube0.c);
                            label_39:
                                if(z1) {
                                    if(!TextUtils.isEmpty(aucd0.E) && !aucd0.E.equals(aube0.e)) {
                                        String s2 = aucd0.B;
                                        if(s2 != null) {
                                            String s3 = aucd0.E;
                                            aucd0.B = null;
                                            aucd0.E = null;
                                            if(aucd0.z) {
                                                LaunchOptions launchOptions0 = aucd0.A;
                                                if(launchOptions0 != null) {
                                                    aucd0.z = false;
                                                    aucd0.A = null;
                                                    aucd0.L(s2, launchOptions0);
                                                    return;
                                                }
                                            }
                                            aucd0.M(0x803, s2, s3);
                                            return;
                                        }
                                    }
                                    aucd0.x = aube0.f;
                                    if(TextUtils.isEmpty(aube0.e)) {
                                        int v1 = "".equals(aucd0.B) ? 0x804 : 2004;
                                        avjh0.n("listener.onApplicationConnectionFailed(%s)", atru.a(v1));
                                        aubj aubj3 = aucd0.O;
                                        if(aubj3 != null) {
                                            aubj3.e.hi(v1);
                                        }
                                    }
                                    else {
                                        aucd0.B(aube0, false, -1L, v);
                                    }
                                    aucd0.B = null;
                                    aucd0.E = null;
                                    aucd0.z = false;
                                    aucd0.A = null;
                                    return;
                                }
                            }
                            else {
                                avjh0.m("Active app has a different app ID");
                            }
                        }
                    }
                    else {
                        z1 = s1.equals(aube0.e);
                        goto label_39;
                    }
                }
                avjh0.n("application to join (%s) is NOT available!", aucd0.B);
                String s4 = aucd0.B;
                batl.s(s4);
                String s5 = aucd0.E;
                aucd0.B = null;
                aucd0.E = null;
                aucd0.R = null;
                aucd0.S = null;
                if(aucd0.z) {
                    LaunchOptions launchOptions1 = aucd0.A;
                    if(launchOptions1 != null) {
                        aucd0.z = false;
                        aucd0.A = null;
                        aucd0.L(s4, launchOptions1);
                        return;
                    }
                }
                if(aucd0.Q.b()) {
                    aucd0.N(false);
                    return;
                }
                aucd0.M(2050, s4, s5);
            }
        }
    }

    private final void h() {
        ScheduledFuture scheduledFuture0 = this.z;
        if(scheduledFuture0 != null) {
            this.n.c("Cancel the stop application", new Object[0]);
            scheduledFuture0.cancel(false);
        }
        this.z = null;
    }
}

