import android.content.Context;
import j..time.Instant;
import java.util.concurrent.TimeUnit;

public final class aqkm {
    public static final void a(ibth ibth0, String s, String s1) {
        gmbu.t(gmbu.q(((gmcd)ibth0.a()), hqgx.a.c().a(), TimeUnit.MILLISECONDS, new bbll(1, 10)), new aqkl(s, s1), new bblp(1, 10));
    }

    public static final void b(String s, Instant instant0, aqfv aqfv0, Context context0) {
        ibuq.f(s, "packageName");
        ibuq.f(instant0, "startTime");
        ibuq.f(aqfv0, "backupType");
        ibuq.f(context0, "context");
        Object[] arr_object = {s, instant0.toEpochMilli(), aqfv0};
        aqkn.a.j("Writing BackupRecord: packageName = %s startTimeMillis: %d backupType: %s", arr_object);
        aqkm.a(new aqkk(new aqkn(context0), s, instant0, aqfv0), "Successfully added backup record for " + s, "Failed to add backup record for " + s);
    }
}

