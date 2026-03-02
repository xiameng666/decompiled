import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.List;

public final class dmhj {
    private static final bboh a;
    private List b;

    static {
        dmhj.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmhj() {
        this.b = ibps.a;
    }

    public final void a(SQLiteDatabase sQLiteDatabase0) {
        ibuq.f(sQLiteDatabase0, "db");
        if(!sQLiteDatabase0.isOpen()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((ggtj)dmhj.a.h()).x("Filling closed loop bundles buffer");
        try {
            ibqm ibqm0 = new ibqm(null);
            Cursor cursor0 = sQLiteDatabase0.query("ClosedLoopBundles", null, null, null, null, null, null);
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ContentValues contentValues0 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
                    ibqm0.add(contentValues0);
                }
                catch(Throwable throwable0) {
                    ibsx.a(cursor0, throwable0);
                    throw throwable0;
                }
            }
            ibsx.a(cursor0, null);
            this.b = ibpo.a(ibqm0);
        }
        catch(SQLException sQLException0) {
            a.ae(dmhj.a.i(), "Failed to query for closed loop bundle records", sQLException0);
        }
    }

    public final void b(SQLiteDatabase sQLiteDatabase0) {
        Iterator iterator0;
        SQLiteStatement sQLiteStatement0;
        ibuq.f(sQLiteDatabase0, "db");
        if(!sQLiteDatabase0.isOpen()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(sQLiteDatabase0.isReadOnly()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(!this.b.isEmpty()) {
            ((ggtj)dmhj.a.h()).x("Dumping closed loop bundles buffer");
            try {
                try {
                    StringBuilder stringBuilder0 = new StringBuilder("INSERT INTO ClosedLoopBundles (account_id, environment, card_id, iso_aid, bundle_state, bundle_payload, bundle_keyset, bundle_keyset_container, bundle_type, key_id, last_modified, error_info, tap_setting, sync_last_modified, report_bundle_change_required, should_support_offline_transactions) VALUES ");
                    int v = this.b.size();
                    if(v > 0) {
                        for(int v2 = 1; true; ++v2) {
                            stringBuilder0.append("(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                            stringBuilder0.append((v2 == this.b.size() ? ";" : ", "));
                            if(v2 == v) {
                                break;
                            }
                        }
                    }
                    sQLiteStatement0 = sQLiteDatabase0.compileStatement(stringBuilder0.toString());
                    iterator0 = this.b.iterator();
                    for(int v1 = 1; iterator0.hasNext(); v1 += 16) {
                        Object object0 = iterator0.next();
                        ibuq.c(sQLiteStatement0);
                        dmhj.e(sQLiteStatement0, v1, ((ContentValues)object0).getAsString("account_id"));
                        dmhj.e(sQLiteStatement0, v1 + 1, ((ContentValues)object0).getAsString("environment"));
                        dmhj.d(sQLiteStatement0, v1 + 2, ((ContentValues)object0).getAsLong("card_id"));
                        dmhj.e(sQLiteStatement0, v1 + 3, ((ContentValues)object0).getAsString("iso_aid"));
                        dmhj.d(sQLiteStatement0, v1 + 4, ((ContentValues)object0).getAsLong("bundle_state"));
                        dmhj.c(sQLiteStatement0, v1 + 5, ((ContentValues)object0).getAsByteArray("bundle_payload"));
                        dmhj.c(sQLiteStatement0, v1 + 6, ((ContentValues)object0).getAsByteArray("bundle_keyset"));
                        dmhj.c(sQLiteStatement0, v1 + 7, ((ContentValues)object0).getAsByteArray("bundle_keyset_container"));
                        dmhj.d(sQLiteStatement0, v1 + 8, ((ContentValues)object0).getAsLong("bundle_type"));
                        dmhj.e(sQLiteStatement0, v1 + 9, ((ContentValues)object0).getAsString("key_id"));
                        dmhj.d(sQLiteStatement0, v1 + 10, ((ContentValues)object0).getAsLong("last_modified"));
                        dmhj.c(sQLiteStatement0, v1 + 11, ((ContentValues)object0).getAsByteArray("error_info"));
                        dmhj.d(sQLiteStatement0, v1 + 12, ((ContentValues)object0).getAsLong("tap_setting"));
                        dmhj.d(sQLiteStatement0, v1 + 13, ((ContentValues)object0).getAsLong("sync_last_modified"));
                        dmhj.d(sQLiteStatement0, v1 + 14, ((ContentValues)object0).getAsLong("report_bundle_change_required"));
                        dmhj.d(sQLiteStatement0, v1 + 15, ((ContentValues)object0).getAsLong("should_support_offline_transactions"));
                    }
                    ibuq.c(sQLiteStatement0);
                    sQLiteStatement0.executeInsert();
                }
                catch(SQLException sQLException0) {
                    ((ggtj)((ggtj)dmhj.a.i()).s(sQLException0)).x("Failed to insert closed loop bundle records");
                }
                this.b = ibps.a;
            }
            catch(Throwable throwable0) {
                this.b = ibps.a;
                throw throwable0;
            }
        }
    }

    private static final void c(SQLiteStatement sQLiteStatement0, int v, byte[] arr_b) {
        if(arr_b == null) {
            sQLiteStatement0.bindNull(v);
            return;
        }
        sQLiteStatement0.bindBlob(v, arr_b);
    }

    private static final void d(SQLiteStatement sQLiteStatement0, int v, Long long0) {
        if(long0 == null) {
            sQLiteStatement0.bindNull(v);
            return;
        }
        sQLiteStatement0.bindLong(v, long0.longValue());
    }

    private static final void e(SQLiteStatement sQLiteStatement0, int v, String s) {
        if(s == null) {
            sQLiteStatement0.bindNull(v);
            return;
        }
        sQLiteStatement0.bindString(v, s);
    }
}

