import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class ehig {
    public static String a(String s) {
        return TextUtils.isEmpty(s) ? null : "c" + Long.parseLong(s, 16);
    }

    public static List b(gdmq gdmq0) {
        List list0 = new ArrayList();
        for(Object object0: (gdmq0.d == null ? gdmx.a : gdmq0.d).d) {
            ((ArrayList)list0).add(Long.toHexString(((Long)object0).longValue()));
        }
        return list0;
    }
}

