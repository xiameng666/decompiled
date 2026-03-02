import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import j..util.DesugarCollections;
import j..util.Objects;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class fdpn {
    public static final int a;

    static {
        ggeo.s("58e1c4133f7441ec3d2c270270a14802da47ba0e", "38918a453d07199354f8b19af05ec6562ced5788", "4ba713dfece93d47572dc5e845a7a82c4a891f2f", "24bb24c05e47e0aefa68a58a766179d9b613a600", "77f9bed9359a2a59a121fd52c7c46731049ac147", "a197f9212f2fed64f0ff9c2a4edf24b9c8801c8c", "089de470ca283db2d5747091cc9955757a506e39", "78f631ae7d905e163085a790049b875db65cab52", "b28c3edb665df32686224df800f603e9959bbe4e", "0980a12be993528c19107bc21ad811478c63cefc", "a014aba6933bf146d3f1a150fd992874069fa2fa", "29a4514c3b90b90cb6badc79614262195c6a5747", "c1c777a3fa6b4d5cf487d1e62f3b286516f09fcf", "18272fbe0e3a02a587759e5f9bde45ca72c41841", "916d13ca1f0a57e4d67147b7c49f73aa437e8f5e", "896a3b334075c628e0b25bd01e7ee06d9b143afc");
    }

    public static fdpl a(Context context0, String s) {
        return fdpn.c(s, fdpn.e(context0, s, null));
    }

    public static fdpl b(Context context0, String s, PackageInfo packageInfo0) {
        return fdpn.c(s, fdpn.e(context0, s, packageInfo0));
    }

    public static fdpl c(String s, String s1) {
        hztu hztu0 = hztu.a;
        if(hztu0.b().b()) {
            fexj fexj0 = (fexj)DesugarCollections.unmodifiableMap(hztu0.b().a().b).get(s);
            if(fexj0 != null && s1.equals(fexj0.b)) {
                return fdpl.a(s, fexj0.c);
            }
        }
        if(!Objects.equals(Build.TYPE, "user")) {
            hzzi hzzi0 = hzzi.a;
            if(hzzi0.i().ao()) {
                if(hzzi0.i().am()) {
                    String s2 = (String)DesugarCollections.unmodifiableMap(hzzi0.i().T().b).get(s1);
                    return s2 == null ? fdpl.a(s, s1) : fdpl.a(s, s2);
                }
                for(int v = 0; v < 7; ++v) {
                    fdpm[] arr_fdpm = fdpm.a;
                    if(arr_fdpm[v].a(s, s1)) {
                        return fdpl.a(s, arr_fdpm[v].d);
                    }
                }
                if(hzzi0.i().an()) {
                    return fdpm.b.a(s, s1) ? fdpl.a(s, fdpm.b.d) : fdpl.a(s, s1);
                }
            }
        }
        return fdpl.a(s, s1);
    }

    public static String d(Signature signature0) {
        try {
            return bboy.c(MessageDigest.getInstance("SHA1").digest(signature0.toByteArray()));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new IllegalStateException("Proper crypto support not installed", noSuchAlgorithmException0);
        }
    }

    private static String e(Context context0, String s, PackageInfo packageInfo0) {
        if(ffgp.k() && s.equals("com.google.android.wearable.app")) {
            packageInfo0 = null;
            s = "com.google.android.wearable.app.cn";
        }
        if(packageInfo0 == null) {
            packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0x40);
        }
        if(packageInfo0 != null && packageInfo0.signatures != null && packageInfo0.signatures.length != 0 && packageInfo0.signatures[0] != null) {
            return fdpn.d(packageInfo0.signatures[0]);
        }
        throw new IllegalArgumentException("Unable to get signature for package:" + s);
    }
}

