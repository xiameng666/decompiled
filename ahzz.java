import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import j..util.Optional;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.function.Supplier;

final class ahzz {
    public static final baun a;
    public static final String[] b;
    public static final String[] c;
    public static final Uri d;
    public final Context e;

    static {
        ahzz.a = new baun("RcsMessageHandler");
        ahzz.b = new String[]{"_id", "mid", "chset", "ct", "text"};
        ahzz.c = new String[]{"address"};
        ahzz.d = Uri.parse("content://mms/part");
    }

    public ahzz(Context context0) {
        this.e = context0;
    }

    public final Optional a(Supplier supplier0, Function function0, String s) {
        int v1 = 0;
        for(long v = 100L; v1 < 5; v += 100L) {
            Optional optional0 = (Optional)supplier0.get();
            if(((Boolean)function0.apply(optional0)).booleanValue()) {
                return optional0;
            }
            ++v1;
            ahzz.a.d("%s: retrying in %d ms, attempt: %d", new Object[]{s, v, v1});
            SystemClock.sleep(v);
        }
        ahzz.a.d("%s: failed after all retries", new Object[]{s});
        return Optional.empty();
    }

    public static String b(byte[] arr_b, int v) {
        if(v == 0) {
            return new String(arr_b);
        }
        try {
            return new String(arr_b, ahxn.a(v));
        }
        catch(UnsupportedEncodingException unused_ex) {
            return new String(arr_b, StandardCharsets.ISO_8859_1);
        }
    }
}

