import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import com.google.android.gms.mdm.receivers.MdmDeviceAdminChimeraReceiver;
import com.google.android.gms.mdm.services.SitrepHelperIntentOperation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class cqqa {
    private static final Object a = null;
    private static boolean b = false;
    private static boolean c = false;

    static {
        cqqa.a = new Object();
    }

    public static ComponentName a() {
        return new ComponentName(babh.a(), elhb.c(MdmDeviceAdminChimeraReceiver.class));
    }

    public static hltu b(DevicePolicyManager devicePolicyManager0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hltu.a).v_newBuilder();
        int v = devicePolicyManager0.getPasswordQuality(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu0 = (hltu)hftp0.b_message;
        hltu0.b |= 1;
        hltu0.c = v;
        int v1 = devicePolicyManager0.getPasswordMaximumLength(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu1 = (hltu)hftp0.b_message;
        hltu1.b |= 2;
        hltu1.d = v1;
        int v2 = devicePolicyManager0.getPasswordMinimumLength(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu2 = (hltu)hftp0.b_message;
        hltu2.b |= 4;
        hltu2.e = v2;
        int v3 = devicePolicyManager0.getPasswordMinimumLetters(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu3 = (hltu)hftp0.b_message;
        hltu3.b |= 8;
        hltu3.f = v3;
        int v4 = devicePolicyManager0.getPasswordMinimumLowerCase(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu4 = (hltu)hftp0.b_message;
        hltu4.b |= 16;
        hltu4.g = v4;
        int v5 = devicePolicyManager0.getPasswordMinimumNonLetter(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu5 = (hltu)hftp0.b_message;
        hltu5.b |= 0x20;
        hltu5.h = v5;
        int v6 = devicePolicyManager0.getPasswordMinimumNumeric(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu6 = (hltu)hftp0.b_message;
        hltu6.b |= 0x40;
        hltu6.i = v6;
        int v7 = devicePolicyManager0.getPasswordMinimumSymbols(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu7 = (hltu)hftp0.b_message;
        hltu7.b |= 0x80;
        hltu7.j = v7;
        int v8 = devicePolicyManager0.getPasswordMinimumUpperCase(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltu hltu8 = (hltu)hftp0.b_message;
        hltu8.b |= 0x100;
        hltu8.k = v8;
        return (hltu)hftp0.N_build();
    }

    public static hltz c(Context context0, boolean z) {
        if(z == cqqa.k(context0)) {
            cqqt.d("Device admin action is a no-op. Action: %s", new Object[]{Boolean.valueOf(z)});
            return z ? hltz.m : hltz.p;
        }
        if(z) {
            return cqqa.s();
        }
        cqqa.m(context0);
        return hltz.a;
    }

    public static void d(Context context0) {
        if(cqqa.k(context0)) {
            cqqa.m(context0);
        }
    }

    public static void e(Context context0) {
        if(!hxvi.p()) {
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
            if(nfcAdapter0 != null) {
                if(hxvi.u()) {
                    synchronized(cqqa.a) {
                        cqqa.o(nfcAdapter0);
                    }
                    return;
                }
                synchronized(cqqa.a) {
                    cqqa.n(nfcAdapter0);
                }
            }
        }
    }

    public static void f(Context context0) {
        if(!hxvi.p()) {
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
            if(nfcAdapter0 != null) {
                Object object0 = cqqa.a;
                synchronized(object0) {
                    if(hxvi.r()) {
                        if(cqqa.b || ((Boolean)cqix.r.c()).booleanValue()) {
                            cqqa.q(false);
                            nfcAdapter0.enable();
                            cqqt.c("Enable NFC", new Object[0]);
                        }
                    }
                    else if(cqqa.b) {
                        cqqa.q(false);
                        nfcAdapter0.enable();
                        cqqt.c("Enable NFC", new Object[0]);
                    }
                    if(hxvi.u()) {
                        if(hxvi.r()) {
                            if(cqqa.c || ((Boolean)cqix.s.c()).booleanValue()) {
                            label_18:
                                cqqa.p(false);
                                if(nfcAdapter0.isSecureNfcSupported()) {
                                    if(nfcAdapter0.isEnabled()) {
                                        nfcAdapter0.enableSecureNfc(false);
                                    }
                                    else {
                                        nfcAdapter0.enable();
                                        nfcAdapter0.enableSecureNfc(false);
                                        nfcAdapter0.disable();
                                    }
                                    cqqt.c("Disable Secure NFC", new Object[0]);
                                }
                            }
                        }
                        else if(cqqa.c) {
                            goto label_18;
                        }
                    }
                }
            }
        }
    }

    public static void g(Context context0) {
        if(!cqqa.r(context0, false)) {
            DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
            if(devicePolicyManager0 == null) {
                cqqt.d("Null DevicePolicyManager when hiding private notifications", new Object[0]);
                return;
            }
            ComponentName componentName0 = cqqa.a();
            try {
                devicePolicyManager0.setKeyguardDisabledFeatures(componentName0, 8);
            }
            catch(SecurityException unused_ex) {
                cqqa.s();
                try {
                    devicePolicyManager0.setKeyguardDisabledFeatures(componentName0, 8);
                }
                catch(SecurityException unused_ex) {
                    cqqt.d("FMD does not own an admin that uses USES_POLICY_DISABLE_KEYGUARD_FEATURESeven after refreshing device admin", new Object[0]);
                }
            }
            catch(UnsupportedOperationException unused_ex) {
                cqqt.d("Disabling unredacted notifications is not supported on this device.", new Object[0]);
            }
        }
    }

    public static void h(Context context0) {
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
        if(devicePolicyManager0 == null) {
            cqqt.d("Null DevicePolicyManager when locking screen", new Object[0]);
            return;
        }
        try {
            devicePolicyManager0.lockNow();
        }
        catch(SecurityException unused_ex) {
            cqqt.d("FMD does not own an active administrator that uses USES_POLICY_FORCE_LOCK", new Object[0]);
        }
    }

    public static void i(Context context0, boolean z) {
        Intent intent0 = SitrepHelperIntentOperation.getStartIntent(context0, SitrepHelperIntentOperation.class, "com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED");
        if(intent0 == null) {
            cqqt.d("Null sitrep intent when changing DeviceAdminState", new Object[0]);
        }
        else {
            intent0.putExtra("force", false);
            intent0.putExtra("enabled", z);
            intent0.putExtra("reason", (z ? 4 : 3));
            context0.startService(intent0);
        }
        Intent intent1 = new Intent("com.google.android.gms.mdm.DEVICE_ADMIN_CHANGE_INTENT");
        intent1.putExtra("device_admin_enabled", z);
        lvj.a(context0).e(intent1);
        bayn bayn0 = bayn.f(context0);
        if(bayn0 != null) {
            bayn0.o("mdm.notification_reminder", 1, evuh.ct);
            return;
        }
        cqqt.d("Null NotificationManager when cancelling notification after state change", new Object[0]);
    }

    public static void j(Context context0) {
        if(cqqa.r(context0, true)) {
            return;
        }
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
        if(devicePolicyManager0 == null) {
            cqqt.d("Null DevicePolicyManager when showing private notifications", new Object[0]);
            return;
        }
        ComponentName componentName0 = cqqa.a();
        try {
            devicePolicyManager0.setKeyguardDisabledFeatures(componentName0, 0);
        }
        catch(SecurityException unused_ex) {
            cqqt.d("FMD does not own an admin that uses USES_POLICY_DISABLE_KEYGUARD_FEATURES", new Object[0]);
        }
        catch(UnsupportedOperationException unused_ex) {
            cqqt.d("Re-enabling unredacted notifications is not supported on this device.", new Object[0]);
        }
    }

    public static boolean k(Context context0) {
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
        if(devicePolicyManager0 == null) {
            cqqt.d("Null DevicePolicyManager checking if device admin enabled", new Object[0]);
            return false;
        }
        return devicePolicyManager0.isAdminActive(cqqa.a());
    }

    public static void l(Context context0) {
        if(!cqqa.k(context0)) {
            Intent intent0 = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent0.putExtra("android.app.extra.DEVICE_ADMIN", cqqa.a());
            intent0.putExtra("android.app.extra.ADD_EXPLANATION", "If you lose your device, Find Hub can lock or erase it remotely. But first you must grant some administrator rights.");
            context0.startActivity(intent0);
        }
    }

    private static void m(Context context0) {
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
        if(devicePolicyManager0 == null) {
            cqqt.d("Null DevicePolicyManager when removing device admin", new Object[0]);
            return;
        }
        try {
            devicePolicyManager0.removeActiveAdmin(cqqa.a());
        }
        catch(SecurityException unused_ex) {
            cqqt.d("FMD is not in the owner application of admin", new Object[0]);
        }
    }

    private static void n(NfcAdapter nfcAdapter0) {
        if(nfcAdapter0.isEnabled()) {
            cqqa.q(true);
            nfcAdapter0.disable();
            cqqt.c("Disable NFC", new Object[0]);
        }
    }

    private static void o(NfcAdapter nfcAdapter0) {
        try {
            if(nfcAdapter0.isSecureNfcSupported() && !nfcAdapter0.isSecureNfcEnabled()) {
                cqqa.p(true);
                if(nfcAdapter0.isEnabled()) {
                    nfcAdapter0.enableSecureNfc(true);
                }
                else {
                    nfcAdapter0.enable();
                    nfcAdapter0.enableSecureNfc(true);
                    nfcAdapter0.disable();
                }
                cqqt.c("Enable Secure NFC", new Object[0]);
                return;
            }
            cqqa.n(nfcAdapter0);
        }
        catch(UnsupportedOperationException unused_ex) {
            cqqa.n(nfcAdapter0);
        }
    }

    private static void p(boolean z) {
        cqqa.c = z;
        if(hxvi.r()) {
            cqix.s.d(Boolean.valueOf(z));
        }
    }

    private static void q(boolean z) {
        cqqa.b = z;
        if(hxvi.r()) {
            cqix.r.d(Boolean.valueOf(z));
        }
    }

    private static boolean r(Context context0, boolean z) {
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        try {
            Method method0 = KeyguardManager.class.getMethod("setPrivateNotificationsAllowed", Boolean.TYPE);
            if(method0 != null && keyguardManager0 != null) {
                method0.invoke(keyguardManager0, Boolean.valueOf(z));
                return true;
            }
            cqqt.d("Could not find KeyguardManager#setAllowPrivateNotifications", new Object[0]);
        }
        catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException | SecurityException | IllegalArgumentException unused_ex) {
            cqqt.c("Exception trying to set keyguard through KeyguardManager", new Object[0]);
        }
        return false;
    }

    private static hltz s() {
        cqqt.d("Q+ devices does not need device admin.", new Object[0]);
        return hltz.a;
    }
}

