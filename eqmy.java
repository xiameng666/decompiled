import android.content.Context;
import java.io.UnsupportedEncodingException;

public final class eqmy {
    public static eqmz a(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        return arr_b[0] != 1 ? new eqnb(s) : new eqnd(arr_b);
    }

    public static gjpi b(Context context0) {
        if(erpa.b(context0)) {
            return hyim.a.e().L() ? gjpi.d : gjpi.a;
        }
        return gjpi.b(((int)hyim.a.e().r()));
    }
}

