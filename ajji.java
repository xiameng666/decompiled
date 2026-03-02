import android.app.Activity;
import android.app.AppOpsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class ajji {
    private final Context a;
    private final ajjm b;
    private final ajjo c;
    private final bhnc d;
    private static final baun e;

    static {
        ajji.e = new baun(new String[]{"ClientAppMetadataHelper"}, null);
    }

    public ajji(Context context0, ajjm ajjm0, ajjo ajjo0, bhnc bhnc0) {
        this.a = context0;
        this.b = ajjm0;
        this.c = ajjo0;
        this.d = bhnc0;
    }

    public final gquv a(List list0) {
        boolean z14;
        boolean z8;
        int v2;
        String s1;
        String s;
        ajjn ajjn0 = this.c.a();
        bzoe bzoe0 = bzoe.h(this.a);
        try {
            s = bzoe0.c(hpta.h(), "GCM");
            s1 = bzoe0.b();
        }
        catch(IOException iOException0) {
            throw new ajgo("Can\'t read instanceId", iOException0);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gquv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((gquv)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).d = s;
        long v = (long)this.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).e = v;
        String s2 = hpta.a.g().m() ? Locale.getDefault().toLanguageTag() : Locale.getDefault().toString();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gquv gquv0 = (gquv)hftp0.b_message;
        s2.getClass();
        gquv0.f = s2;
        String s3 = Build.DISPLAY;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gquv gquv1 = (gquv)hftp0.b_message;
        s3.getClass();
        gquv1.g = s3;
        long v1 = (long)Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).h = v1;
        String s4 = Build.VERSION.RELEASE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gquv gquv2 = (gquv)hftp0.b_message;
        s4.getClass();
        gquv2.i = s4;
        String s5 = Build.VERSION.CODENAME;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gquv gquv3 = (gquv)hftp0.b_message;
        s5.getClass();
        gquv3.j = s5;
        Context context0 = this.a;
        if((context0 instanceof Activity)) {
            Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics0 = new DisplayMetrics();
            display0.getRealMetrics(displayMetrics0);
            float f = ((float)displayMetrics0.heightPixels) * 1000.0f / displayMetrics0.ydpi;
            float f1 = ((float)displayMetrics0.widthPixels) * 1000.0f / displayMetrics0.xdpi;
            v2 = (int)Math.sqrt(f * f + f1 * f1);
        }
        else {
            ajji.e.m("Skipping display calculation since didn\'t have access to a visual context", new Object[0]);
            v2 = 0;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).k = v2;
        String s6 = Build.MODEL;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gquv gquv4 = (gquv)hftp0.b_message;
        s6.getClass();
        gquv4.l = s6;
        String s7 = Build.MANUFACTURER;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s7.getClass();
        ((gquv)hftv1).m = s7;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        boolean z = true;
        ((gquv)hftp0.b_message).n = 1;
        boolean z1 = this.b.a.isDeviceSecure();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gquv)hftv2).o = z1;
        boolean z2 = ajjn0.a;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gquv)hftv3).p = z2;
        boolean z3 = ajjn0.b;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).q = z3;
        boolean z4 = bahu.a(context0) != null;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).r = z4;
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        boolean z5 = bluetoothAdapter0 == null ? false : bluetoothAdapter0.isEnabled();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).s = z5;
        boolean z6 = context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).t = z6;
        boolean z7 = ((ConnectivityManager)context0.getSystemService("connectivity")).getNetworkInfo(0) != null;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).u = z7;
        if("7.1".equals(Build.VERSION.RELEASE)) {
        label_119:
            z8 = false;
        }
        else {
            try {
                ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                if(hvbk.f() && connectivityManager0.isTetheringSupported()) {
                    goto label_117;
                }
                else {
                    goto label_119;
                }
            }
            catch(SecurityException | IllegalStateException exception0) {
                a.ae(bboh.b("ClientAppMetadataHelper", bbcu.gF).j(), "Error determining tether support.", exception0);
                z8 = false;
            }
            goto label_122;
        label_117:
            z8 = true;
        }
    label_122:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).v = z8;
        Context context1 = this.a;
        boolean z9 = bbnp.m(context1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).x = z9;
        boolean z10 = context1.getPackageManager().hasSystemFeature("org.chromium.arc");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gquv)hftp0.b_message).y = z10;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gquu.a).v_newBuilder();
        String s8 = bsoa.a(context1);
        if(s8 != null) {
            ByteString hfsf0 = ByteString.A(s8);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            ((gquu)hftv4).b = hfsf0;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp1.b_message;
            ((gquu)hftv5).d = "25.34.34 (190400-{{cl}})";
            if(!hftv5.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gquu)hftp1.b_message).e = 0xF1B18ADL;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gquu gquu0 = (gquu)hftp1.b_message;
            "com.google.android.gms".getClass();
            gquu0.f = "com.google.android.gms";
            Boolean boolean0 = this.b();
            if(boolean0 != null) {
                boolean z11 = boolean0.booleanValue();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gquu)hftp1.b_message).c = z11;
            }
            gquu gquu1 = (gquu)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gquv gquv5 = (gquv)hftp0.b_message;
            gquu1.getClass();
            hfuo hfuo0 = gquv5.b;
            if(!hfuo0.c()) {
                gquv5.b = ProtoLiteMessage.E(hfuo0);
            }
            gquv5.b.add(gquu1);
            boolean z12 = this.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gquv)hftp0.b_message).z = z12;
            boolean z13 = this.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gquv)hftp0.b_message).B = z13;
            if(!hptz.c()) {
                z14 = false;
            }
            else if(Settings.Secure.getInt(context1.getContentResolver(), "mandatory_biometrics", 0) != 0) {
                z14 = true;
            }
            else {
                z14 = false;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gquv)hftp0.b_message).D = z14;
            if(!hptw.a.b().c()) {
                BiometricManager biometricManager0 = (BiometricManager)context1.getSystemService(BiometricManager.class);
                if(biometricManager0 == null || biometricManager0.canAuthenticate() != 0) {
                    FingerprintManager fingerprintManager0 = (FingerprintManager)context1.getSystemService(FingerprintManager.class);
                    if(fingerprintManager0 == null || !fingerprintManager0.isHardwareDetected() || !fingerprintManager0.hasEnrolledFingerprints()) {
                        z = false;
                    }
                }
            }
            else if(alh.c(context1).b(0xFF) != 0) {
                z = false;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gquv)hftp0.b_message).A = z;
            if(hptm.a.b().a()) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("instanceId", ghgc.a.a(s1.getBytes()).toString());
                long v3 = (long)this.c();
                hashMap0.put("deviceId", ghgc.a.b(v3).toString());
                String s9 = this.d.d("cryptauth_synckeys_request", hashMap0, null);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gquv gquv6 = (gquv)hftp0.b_message;
                s9.getClass();
                gquv6.C = s9;
            }
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    byte[] arr_b = (byte[])object0;
                    if(arr_b != null && arr_b.length > 0) {
                        try {
                            ProtoLiteMessage hftv6 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqux.a), arr_b, 0, arr_b.length, hftc.a);
                            ProtoLiteMessage.P_makeImmutable(hftv6);
                            gqux gqux0 = (gqux)hftv6;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gquv gquv7 = (gquv)hftp0.b_message;
                            gqux0.getClass();
                            hfuo hfuo1 = gquv7.w;
                            if(!hfuo1.c()) {
                                gquv7.w = ProtoLiteMessage.E(hfuo1);
                            }
                            gquv7.w.add(gqux0);
                        }
                        catch(hfur hfur0) {
                            ajji.e.g("Fail to parse featureMetadata", hfur0, new Object[0]);
                        }
                    }
                    else {
                        ajji.e.d("Null/empty featureMetadata", new Object[0]);
                    }
                }
            }
            return (gquv)hftp0.N_build();
        }
        Intent intent0 = new Intent();
        intent0.setClassName(context1, "com.google.android.gms.gcm.gmsproc.GmsAutoStarter");
        context1.sendBroadcast(intent0);
        throw new ajgo();
    }

    final Boolean b() {
        AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
        int v = this.a.getApplicationInfo().uid;
        try {
            Class class0 = Class.forName(AppOpsManager.class.getName());
            return ((int)(((Integer)class0.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager0, ((Integer)class0.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)), v, "com.google.android.gms")))) == 0 ? Boolean.valueOf(true) : Boolean.valueOf(false);
        }
        catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException exception0) {
            ajji.e.n("Exception while finding whether notifications are enabled for GmsCore", exception0, new Object[0]);
            return null;
        }
    }

    final Long c() {
        return bbmq.d(this.a);
    }

    private final boolean d() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
    }
}

