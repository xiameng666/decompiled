import android.content.Context;
import java.util.Arrays;

public final class cbgi {
    public static final String a(int v) {
        String s = String.format("0x%06X", Arrays.copyOf(new Object[]{v}, 1));
        ibuq.e(s, "format(...)");
        return s;
    }

    public static final cbgj b(Context context0) {
        ibuq.f(context0, "context");
        return !bbqa.d() || !gaec.y(context0) ? null : new cbgj(cbgi.c(context0, 0x1060084), cbgi.c(context0, 0x1060085), cbgi.c(context0, 0x1060086), cbgi.c(context0, 0x1060087), cbgi.c(context0, 0x1060088), cbgi.c(context0, 0x106001F), cbgi.c(context0, 0x10600AF), cbgi.c(context0, 0x10600B0), cbgi.c(context0, 0x10600B1), cbgi.c(context0, 0x10600B2), cbgi.c(context0, 0x10600B3), cbgi.c(context0, 0x1060028));
    }

    private static final int c(Context context0, int v) {
        return context0.getColor(v) & 0xFFFFFF;
    }
}

