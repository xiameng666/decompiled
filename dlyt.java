import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

public final class dlyt implements dmba {
    private static final bboh a;
    private final dmce b;

    static {
        dlyt.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyt(dmce dmce0) {
        this.b = dmce0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 2, "Cannot parse filter: Visibility filter does not have an impression count filter.");
        hjtx hjtx0 = hjwe0.b == 2 ? ((hjtx)hjwe0.c) : hjtx.a;
        if((hjtx0.b & 1) != 0 && !hwwq.a.d().J()) {
            try {
                hfst hfst0 = hjtx0.d == null ? hfst.a : hjtx0.d;
                Locale locale0 = Locale.ENGLISH;
                SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.b.h).c();
                String s = hjrn0.e;
                String s1 = String.valueOf(dlud.b.a());
                return DatabaseUtils.queryNumEntries(sQLiteDatabase0, "BulletinInteractions", DatabaseUtils.concatenateWhere(dmce.b, String.format(locale0, "%s<=%d", "timestamp_millis", ((long)(System.currentTimeMillis() - hfyf.e(hfst0))))), new String[]{this.b.i, this.b.j, s, s1}) <= ((long)hjtx0.c);
            }
            catch(dmhl dmhl0) {
                a.ae(dlyt.a.i(), "Failed to get interactions with minimum age count.", dmhl0);
                return 0L <= ((long)hjtx0.c);
            }
        }
        try {
            return this.b.a(hjrn0, dlud.b) <= ((long)hjtx0.c);
        }
        catch(dmhl dmhl1) {
            a.ae(dlyt.a.i(), "Failed to get interactions count.", dmhl1);
            return 0L <= ((long)hjtx0.c);
        }
    }
}

