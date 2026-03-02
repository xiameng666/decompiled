import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;

public final class azqx {
    static byk a;
    static volatile azqu b;
    private static azqv c;
    private static bbhe d;

    static {
    }

    public static boolean a(Context context0) {
        azqx.h(context0);
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            azpy.c();
            return azpy.g.isFineGrainedPackageVerificationAvailable();
        }
        catch(bjhw | RemoteException exception0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", exception0);
            return false;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    public static final azqz b(Context context0, String s) {
        bbhf bbhf2;
        String s3;
        Long long0;
        boolean z = azqk.e(context0);
        if(!azqx.a(context0)) {
            throw new azqw();
        }
        bbhq bbhq0 = bbhs.a;
        bbht bbht0 = bbhq0.d();
        bbhf bbhf0 = null;
        String s1 = azqx.f(s, z, null);
        if(!bbhq0.k() && azqx.b != null && azqx.b.a.equals(s1)) {
            return azqx.b.b;
        }
        if(s.isEmpty()) {
            bbht0.c();
        }
        if(bbhq0.h()) {
            try {
                long0 = bbsr.b(context0).e(s, 0).getLongVersionCode();
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                bbht0.d(packageManager$NameNotFoundException0);
                long0 = null;
            }
        }
        else {
            long0 = null;
        }
        if(bbhq0.k()) {
            String s2 = azqx.f(s, z, long0);
            Integer integer0 = bbhq0.e();
            batl.s(integer0);
            azqz azqz0 = azqx.d(s2, integer0.intValue());
            if(azqz0 != null) {
                bbhf bbhf1 = azqz0.d;
                if(bbhf1 != null) {
                    bbht0.a(context0, bbhf1);
                    return azqz0;
                }
                return azqz0;
            }
            s3 = s2;
        }
        else {
            s3 = null;
        }
        boolean z1 = bbhq0.i(context0, s, long0);
        azqx.h(context0);
        azqd azqd0 = new azqd();
        azqd0.a = s;
        azqd0.b(z);
        azqd0.c(false);
        azqd0.d = z1;
        azqg azqg0 = azpy.a(azqd0.a());
        if(bbhq0.g() && bbht0.g()) {
            bbhe bbhe0 = azqx.e(context0);
            long v = azqg0.f;
            if(azqg0.c != azpg.c) {
                bbhf2 = new bbhf(s, long0, bbhe.a, v, bbhg.d);
            }
            else if(long0 == null) {
                bbhf2 = new bbhf(s, null, bbhe.a, v, bbhg.c);
            }
            else {
                bbhq bbhq1 = bbhe0.c;
                bbhp bbhp0 = bbhq1.c(bbhe0.b, s, long0.longValue());
                if(bbhp0 != null) {
                    bbhf2 = new bbhf(s, long0, bbhe.a, v, bbhg.e, bbhp0);
                }
                else if(v == -1L) {
                    bbhf2 = new bbhf(s, long0, bbhe.a, -1L, bbhg.b);
                }
                else if(v == 0L) {
                    bbhf2 = new bbhf(s, long0, bbhe.a, 0L, bbhg.i);
                }
                else {
                    if(bbhe.a == null) {
                        bbhe0.a();
                    }
                    Long long1 = bbhe.a;
                    if(long1 == null) {
                        bbhf2 = new bbhf(s, long0, null, v, bbhg.g);
                    }
                    else if(((long)long1) == -1L) {
                        bbhf2 = new bbhf(s, long0, bbhe.a, v, bbhg.f);
                    }
                    else if(((long)bbhe.a) == 0L) {
                        bbhf2 = new bbhf(s, long0, bbhe.a, v, bbhg.h);
                    }
                    else {
                        long v1 = bbhq1.b();
                        bbhf2 = new bbhf(s, long0, bbhe.a, v, (Long.compare(((long)bbhe.a) - v1, v) > 0 ? bbhg.j : bbhg.k));
                    }
                }
            }
            bbhf0 = bbhf2;
            bbht0.a(context0, bbhf0);
        }
        if(azqg0.b) {
            azqz azqz1 = new azqz(s, azqg0.c, true, null, null, bbhf0);
            if(bbhq0.k()) {
                batl.s(s3);
                azqx.g(s3, azqz1);
                return azqz1;
            }
            azqx.b = new azqu(s1, azqz1);
            return azqz1;
        }
        batl.s(azqg0.d);
        return new azqz(s, azpg.a, false, azqg0.d, azqg0.e, bbhf0);
    }

    public static final azqz c(Context context0, String s) {
        try {
            azqz azqz0 = azqx.b(context0, s);
            azqz0.a();
            return azqz0;
        }
        catch(SecurityException securityException0) {
            azqz azqz1 = azqx.b(context0, s);
            if(azqz1.b) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", securityException0);
            }
            return azqz1;
        }
    }

    private static azqz d(String s, int v) {
        azqz azqz0;
        synchronized(azqx.class) {
            if(azqx.a == null) {
                azqx.a = new byk(v);
            }
            azqz0 = (azqz)azqx.a.d(s);
        }
        return azqz0;
    }

    private static bbhe e(Context context0) {
        synchronized(azqx.class) {
            if(azqx.d == null) {
                azqx.d = new bbhe(context0);
            }
        }
        return azqx.d;
    }

    private static String f(String s, boolean z, Long long0) {
        String s1 = s + (z ? "-1" : "-0");
        return long0 == null ? s1 : s1 + "-" + long0;
    }

    private static void g(String s, azqz azqz0) {
        synchronized(azqx.class) {
            byk byk0 = azqx.a;
            batl.s(byk0);
            byk0.e(s, azqz0);
        }
    }

    private static void h(Context context0) {
        synchronized(azqx.class) {
            if(azqx.c == null) {
                azqx.c = new azqv(context0);
            }
        }
    }
}

