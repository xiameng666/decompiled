import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;

public final class fuow {
    public static final Intent a(String s, String s1, String s2, long v, String s3, String s4, String s5, hkrl hkrl0) {
        if(s.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(s1.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(s2.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v == 0L) {
            throw new IllegalStateException("Check failed.");
        }
        if(s3.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(s4.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(s5.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        Intent intent0 = new Intent().setPackage(s).setClassName(s, "com.google.android.apps.wallet.wear.main.WearActivity").setAction("com.google.android.apps.wallet.wear.supervised.HOME");
        ibuq.e(intent0, "setAction(...)");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkro.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkro hkro0 = (hkro)hftp0.b_message;
        s1.getClass();
        hkro0.g = s1;
        ibuq.f(s2, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s2.getClass();
        ((hkro)hftv0).b = s2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkro)hftp0.b_message).d = v;
        ibuq.f(s3, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkro hkro1 = (hkro)hftp0.b_message;
        s3.getClass();
        hkro1.c = s3;
        ibuq.f(s4, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkro hkro2 = (hkro)hftp0.b_message;
        s4.getClass();
        hkro2.e = s4;
        ibuq.f(s5, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkro hkro3 = (hkro)hftp0.b_message;
        s5.getClass();
        hkro3.f = s5;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        hfxk.k(intent0, "SupervisedDeviceContext", ((MessageLite)(((hkro)hftv1))));
        if(hkrl0 != null) {
            hfxk.k(intent0, "PushProvisionRequest", ((MessageLite)hkrl0));
        }
        return intent0;
    }

    public static final long b(Context context0, String s) {
        try {
            return context0.getPackageManager().getPackageInfo(s, 0).getLongVersionCode();
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return 0L;
        }
    }

    public static final String c(Context context0) {
        if(fuow.d("com.google.android.apps.walletnfcrel", context0)) {
            return "com.google.android.apps.walletnfcrel";
        }
        return fuow.d("com.google.commerce.tapandpay.dev", context0) ? "com.google.commerce.tapandpay.dev" : null;
    }

    private static final boolean d(String s, Context context0) {
        try {
            context0.getPackageManager().getPackageInfo(s, 0);
            return true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }
}

