import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

public final class epwf {
    private static final baun a;
    private final eqhi b;
    private final eqmj c;
    private final cuvm d;

    static {
        epwf.a = new erqc(new String[]{"common", "NearbyConnectionsHelper"});
    }

    public epwf(eqhi eqhi0, eqmj eqmj0, cuvm cuvm0) {
        this.b = eqhi0;
        this.c = eqmj0;
        this.d = cuvm0;
    }

    public final void a(byte[] arr_b, String s) {
        try {
            eqhi eqhi0 = this.b;
            if(eqhi0 != null) {
                eqhi0.c(arr_b);
            }
            eqgo eqgo0 = new eqgo(this.d, s);
            TargetConnectionArgs targetConnectionArgs0 = new TargetConnectionArgs();
            this.c.a(eqgo0, targetConnectionArgs0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            epwf.a.g("Failed to validate authentication token", generalSecurityException0, new Object[0]);
            eqmj eqmj0 = this.c;
            if((eqmj0 instanceof eqzj)) {
                eqmj0.d(10807, null);
            }
            this.d.r(s);
        }
    }

    public final boolean b(String s) {
        eqhi eqhi0 = this.b;
        if(eqhi0 != null) {
            try {
                cuwu cuwu0 = cuwu.b(eqhi0.d());
                this.d.k(s, cuwu0);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                epwf.a.g("Encryption error", generalSecurityException0, new Object[0]);
            }
            return true;
        }
        return false;
    }

    public static byte[] c() {
        try {
            return eqhi.b().getEncoded();
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            epwf.a.g("AES key generator not supported.", noSuchAlgorithmException0, new Object[0]);
            return null;
        }
    }
}

