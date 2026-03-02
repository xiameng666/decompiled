import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class swz {
    public static srp a(byte[] arr_b, swc swc0) {
        return (srp)swc0.a(srk.b, arr_b).c(new svq(srk.b, arr_b));
    }

    public static stb b(svt svt0, byte[] arr_b) {
        sxd sxd0 = svt0.i(new ssy(sto.a(arr_b)));
        if(sxd0.d()) {
            return (stb)sxd0.b();
        }
        throw sxf.h("HOTP referenced object not found");
    }

    public static void c(srb srb0, svt svt0, stb stb0) {
        swh swh0 = new swh();
        swh0.a(svt0, stb0);
        srb0.c(swh0);
    }

    public static byte[] d(svt svt0, svv svv0) {
        return svv0.b() ? swz.b(svt0, svv0.c()).a() : svv0.c();
    }

    public static byte[] e(srp srp0, byte[] arr_b) {
        try {
            Mac mac0 = Mac.getInstance("HmacSHA1");
            Key key0 = (srp0 instanceof svn) ? ((svn)srp0).b : new SecretKeySpec(srp0.i(), "HmacSHA1");
            mac0.init(key0);
            return mac0.doFinal(arr_b);
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            throw new sqy(srg.s, exception0);
        }
    }
}

