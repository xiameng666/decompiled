import android.text.TextUtils;
import com.google.android.gms.auth.blockstore.StoreBytesData;

public final class ajca {
    private static final byte[] a;

    static {
        ajca.a = new byte[0];
    }

    public static String a(String s) {
        return TextUtils.isEmpty(s) ? "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY" : s;
    }

    public static boolean b(String s) {
        return TextUtils.isEmpty(s) || "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY".equals(s);
    }

    public static byte[] c(StoreBytesData storeBytesData0) {
        return storeBytesData0.a == null ? ajca.a : storeBytesData0.a;
    }
}

