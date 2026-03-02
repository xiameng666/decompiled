import android.util.StatsEvent.Builder;
import android.util.StatsEvent;
import android.util.StatsLog;
import java.util.UUID;

public final class ehks {
    public static final void a(int v, UUID uUID0) {
        long v1 = uUID0.getLeastSignificantBits();
        long v2 = uUID0.getMostSignificantBits();
        StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
        statsEvent$Builder0.setAtomId(202005);
        statsEvent$Builder0.writeInt(v);
        statsEvent$Builder0.writeLong(v1);
        statsEvent$Builder0.writeLong(v2);
        statsEvent$Builder0.usePooledBuffer();
        StatsLog.write(statsEvent$Builder0.build());
    }

    public static final void b(int v) {
        ehks.a(v, ehkt.a);
    }
}

