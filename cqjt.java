import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import android.security.authenticationpolicy.AuthenticationPolicyManager;
import android.security.authenticationpolicy.EnableSecureLockDeviceParams;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public abstract class cqjt extends TracingIntentService {
    protected final ccmg a;
    protected String b;
    protected boolean c;
    protected long d;
    protected Account e;
    protected cqig f;
    public String[] g;

    public cqjt(cqig cqig0) {
        this("GcmReceiverChimeraService", cqig0);
        this.setIntentRedelivery(true);
    }

    public cqjt(String s, cqig cqig0) {
        super(s);
        this.f = cqig0;
        this.a = new ccmp();
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        Throwable throwable1;
        esaa esaa0;
        if(!bbnp.d(this) && intent0 != null) {
            try {
                esaa0 = new esaa(this, 1, "com.google.android.gms.mdm.services.GcmReceiverService", null, "com.google.android.gms");
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                esaa0 = null;
                goto label_12;
            }
            try {
                esaa0.b();
                this.g(intent0);
                goto label_16;
            }
            catch(Throwable throwable2) {
                throwable1 = throwable2;
            }
        label_12:
            if(esaa0 != null && esaa0.l()) {
                esaa0.g();
            }
            bsoa.b(intent0);
            throw throwable1;
        label_16:
            if(esaa0.l()) {
                esaa0.g();
            }
            bsoa.b(intent0);
        }
    }

    protected gmcd b(hltz[] arr_hltz, Location location0, String s, hltu hltu0) {
        throw null;
    }

    protected final void c(boolean z) {
        this.j(cqqa.c(this, z));
    }

    protected abstract void d();

    protected abstract void e(hlud arg1);

    public final void f(String s, String s1, String s2, String s3) {
        boolean z;
        hltu hltu0;
        if(!this.o()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        cqix.o.b(this, s3);
        if(cqqg.a(this)) {
            if(!s.isEmpty()) {
                arrayList0.add(hltz.t);
            }
            if(hxwq.a.b().a()) {
                if(bbqa.a()) {
                    if(!au.a) {
                        au.b();
                    }
                    if(au.c) {
                        AuthenticationPolicyManager authenticationPolicyManager0 = (AuthenticationPolicyManager)this.getSystemService(AuthenticationPolicyManager.class);
                        if(authenticationPolicyManager0 == null) {
                            cqqt.c("AuthenticationPolicyManager is not available to enable Secure lock", new Object[0]);
                        }
                        else {
                            int v1 = authenticationPolicyManager0.enableSecureLockDevice(new EnableSecureLockDeviceParams("Device Locked"));
                            if(v1 != 0 && v1 != 6) {
                                cqqt.c("Secure lock could not be enabled, result: %d", new Object[]{v1});
                            }
                            else {
                                cqqt.c("Secure lock enabled, result: %d", new Object[]{v1});
                            }
                        }
                    }
                    else {
                        cqqt.c("Secure lock is not supported by the system", new Object[0]);
                    }
                }
                else {
                    cqqt.c("Secure lock is not supported pre-Baklava", new Object[0]);
                }
            }
            if(!fhcd.g(this)) {
                cqqa.h(this);
                cqjt.w(this);
            }
            hltu0 = null;
        }
        else {
            DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)this.getSystemService("device_policy");
            if(devicePolicyManager0 == null) {
                cqqt.d("Null DevicePolicyManager when locking and resetting password", new Object[0]);
                hltu0 = null;
            }
            else {
                if(s != null && !s.isEmpty()) {
                    if(!hxvi.a.e().z()) {
                        char[] arr_c = s.toCharArray();
                        int v2 = 0;
                        while(v2 < arr_c.length) {
                            int v3 = arr_c[v2];
                            if(v3 < 0x20 || v3 > 0x7E) {
                                goto label_47;
                            }
                            ++v2;
                        }
                    }
                    try {
                        z = devicePolicyManager0.resetPassword(s, 0);
                        goto label_48;
                    }
                    catch(SecurityException | IllegalStateException | IllegalArgumentException unused_ex) {
                    }
                }
            label_47:
                z = false;
            label_48:
                cqqa.h(this);
                if(z) {
                    hltu0 = null;
                }
                else {
                    cqqt.d("Unable to reset. Password was not strong enough", new Object[0]);
                    hltu0 = cqqa.b(devicePolicyManager0);
                }
            }
            cqjt.w(this);
            if(hltu0 != null) {
                arrayList0.add(hltz.k);
            }
        }
        char[] arr_c1 = s2.toCharArray();
        int v4 = 0;
        while(v4 < arr_c1.length) {
            if(PhoneNumberUtils.isISODigit(arr_c1[v4]) || arr_c1[v4] == 43) {
                ++v4;
                continue;
            }
            arrayList0.add(hltz.r);
            s2 = null;
            goto label_69;
        }
        if(PhoneNumberUtils.isEmergencyNumber(s2)) {
            arrayList0.add(hltz.r);
            s2 = null;
        }
    label_69:
        if(!TextUtils.isEmpty(s2) && !bbmq.O(this)) {
            arrayList0.add(hltz.s);
            s2 = null;
        }
        if(arrayList0.isEmpty()) {
            this.j(hltz.a);
        }
        else {
            hltz[] arr_hltz = new hltz[arrayList0.size()];
            for(int v = 0; v < arrayList0.size(); ++v) {
                arr_hltz[v] = (hltz)arrayList0.get(v);
            }
            this.b(arr_hltz, null, s3, hltu0);
        }
        if(TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2)) {
            cqjr.b(this);
            this.p().a();
            return;
        }
        cqjr.a(this, s1, s2);
    }

    protected abstract void g(Intent arg1);

    protected abstract void h(hltx arg1);

    protected abstract void i();

    protected final void j(hltz hltz0) {
        this.u(hltz0, null, this.b);
    }

    protected abstract void k(hltx arg1);

    protected abstract void l();

    protected abstract void m();

    protected abstract void n();

    protected final boolean o() {
        hltz hltz0 = cqqa.c(this, true);
        if(hltz0 != hltz.m && hltz0 != hltz.a) {
            cqqt.d("Device admin policy is not auto enabled. Response code: %s", new Object[]{hltz0});
            this.e(hlud.k);
            this.j(hltz.i);
            return false;
        }
        return true;
    }

    @Override  // com.google.android.chimera.IntentService
    public final void onCreate() {
        super.onCreate();
        this.g = TextUtils.split("@googlemail.com", ",");
    }

    protected abstract cqim p();

    protected static final boolean q(String s, byte[] arr_b) {
        byte[] arr_b1 = bbmq.aa(s.toLowerCase(Locale.US), "SHA-256");
        return arr_b1 != null && arr_b1.length > 0 && Arrays.equals(arr_b1, arr_b);
    }

    public static final void r(Context context0, List list0) {
        String s = (String)Collection.-EL.stream(list0).map(new cqip()).map(new cqiq()).collect(Collectors.joining(","));
        cqix.t.d(s);
        if(hxwm.o()) {
            cqqa.e(context0);
        }
        if(hxwm.p()) {
            cqqa.g(context0);
        }
        cqjj.a(true);
        cqix.u.d(Boolean.valueOf(true));
    }

    protected abstract void s();

    protected final void t(hltz hltz0) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            cqqt.e(new Object[0]);
        }
        gmcd gmcd0 = this.u(hltz0, null, this.b);
        try {
            hlub hlub0 = (hlub)((glyq)gmcd0).u();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException unused_ex) {
        }
    }

    protected final gmcd u(hltz hltz0, Location location0, String s) {
        return this.b(new hltz[]{hltz0}, location0, s, null);
    }

    protected static final boolean v(hltz[] arr_hltz) {
        int v = 0;
        while(v < arr_hltz.length) {
            hltz hltz0 = arr_hltz[v];
            if(hltz0 != hltz.j && hltz0 != hltz.f) {
                ++v;
                continue;
            }
            return true;
        }
        return false;
    }

    private static void w(Context context0) {
        cqqa.g(context0);
        cqqa.e(context0);
        cqjj.a(true);
    }
}

