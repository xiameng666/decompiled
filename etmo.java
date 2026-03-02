public final class etmo {
    public static final bboh a;
    private static boolean b;

    static {
        etmo.a = bboh.b("TapAndPay", bbcu.aM);
        etmo.b = false;
    }

    public static void a() {
        etmp.e("google_pay_biometric_unlock_key", 2);
        etmp.e("google_pay_device_credential_unlock_key", 1);
    }

    public static void b() {
        etmp.d("google_pay_keyguard_fuse_key", 315360000);
    }

    public static void c() {
        etmp.a("google_pay_biometric_unlock_key");
        etmp.a("google_pay_device_credential_unlock_key");
    }

    public static void d() {
        etmp.a("google_pay_keyguard_fuse_key");
    }

    public static void e() {
        etmp.a("android_pay_recent_unlock_key_2");
        etmp.a("android_pay_cdcvm_key");
    }

    public static void f() {
        etmo.c();
        etmo.a();
    }

    public static void g() {
        etmp.d("android_pay_recent_unlock_key_2", 30);
    }

    public static void h() {
        etmo.e();
        etmo.g();
    }

    public static void i() {
        synchronized(etmo.class) {
            if(!etmo.b) {
                etmo.b = true;
                etmo.g();
                etmo.a();
            }
        }
    }
}

