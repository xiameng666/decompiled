import android.content.Context;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;

public final class cyvl {
    public final int a;
    public final Context b;
    public long c;
    public int d;
    public final BitSet e;
    public int f;
    public final BitSet g;
    public int h;
    public final BitSet i;
    public final cjpc j;

    public cyvl(Context context0) {
        cjpc cjpc0 = cygf.a(context0);
        super();
        int v = (int)(hvpg.aM() * 60L);
        this.a = v;
        this.b = context0;
        this.j = cjpc0;
        this.c = cjpd.b(cjpc0, "MESSAGE_MONITOR_CURRENT_HOUR", cyvl.a(System.currentTimeMillis()));
        this.d = cjpd.a(cjpc0, "MESSAGE_MONITOR_SENT_COUNT", 0);
        this.e = cyvl.d(v, cjpd.b(cjpc0, "MESSAGE_MONITOR_SENT_BITS", 0L));
        this.f = cjpd.a(cjpc0, "MESSAGE_MONITOR_RECEIVED_COUNT", 0);
        this.g = cyvl.d(v, cjpd.b(cjpc0, "MESSAGE_MONITOR_RECEIVED_BITS", 0L));
        this.h = cjpd.a(cjpc0, "MESSAGE_MONITOR_EVENT_TRIGGER_COUNT", 0);
        this.i = cyvl.d(v, cjpd.b(cjpc0, "MESSAGE_MONITOR_EVENT_TRIGGER_BITS", 0L));
    }

    public static long a(long v) {
        long v1 = hvpg.aM();
        return TimeUnit.MILLISECONDS.toHours(v) / v1 * v1;
    }

    public static long b(BitSet bitSet0) {
        long[] arr_v = bitSet0.toLongArray();
        return arr_v.length == 0 ? 0L : arr_v[0];
    }

    public final BitSet c() {
        BitSet bitSet0 = new BitSet(this.a);
        bitSet0.or(this.e);
        bitSet0.or(this.g);
        return bitSet0;
    }

    private static BitSet d(int v, long v1) {
        return v1 == 0L ? new BitSet(v) : BitSet.valueOf(new long[]{v1});
    }
}

