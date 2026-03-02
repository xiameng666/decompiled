import android.content.Context;
import com.google.android.gms.nearby.connection.UwbSenderInfo;

public final class dgeb {
    public static final dgrf a(Context context0, dfsq dfsq0) {
        UwbSenderInfo uwbSenderInfo0;
        if(dfsq0.b()) {
            uwbSenderInfo0 = new UwbSenderInfo();
            byte[] arr_b = dfsq0.g;
            if(arr_b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            uwbSenderInfo0.a = arr_b;
            uwbSenderInfo0.b = dfsq0.c;
            uwbSenderInfo0.c = dfsq0.d;
        }
        else {
            uwbSenderInfo0 = null;
        }
        int v = djbm.d(context0);
        return new dgrf((dfsq0.f != null && dfsq0.f.ordinal() == 2 ? dgpw.a : dgpw.b), dfsq0.e, uwbSenderInfo0, v, dfsq0.a);
    }
}

