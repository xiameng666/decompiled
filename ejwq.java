import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;

final class ejwq {
    public final ejth a;
    private final Context b;
    private final ContentResolver c;

    static {
        bboh.b("RemindersSync", bbcu.s);
    }

    public ejwq(Context context0, ejth ejth0) {
        this.b = context0;
        this.c = context0.getContentResolver();
        this.a = ejth0;
    }

    final ContentProviderOperation a() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("deleted", Boolean.valueOf(true));
        return ContentProviderOperation.newUpdate(ejtz.a).withSelection(ejxf.a("account_id=?", "dirty_sync_bit=1"), new String[]{String.valueOf(this.a.a)}).withValues(contentValues0).build();
    }

    final ContentProviderOperation b(gedm gedm0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("deleted", Integer.valueOf(1));
        return ContentProviderOperation.newUpdate(ejtz.a).withSelection("account_id=? AND client_assigned_id=?", new String[]{String.valueOf(this.a.a), gedm0.c.toString()}).withValues(contentValues0).build();
    }

    final ContentProviderOperation c(gefy gefy0) {
        ContentValues contentValues0 = new ContentValues();
        ejxk.c(contentValues0, gefy0);
        contentValues0.put("account_id", Long.valueOf(this.a.a));
        return ContentProviderOperation.newInsert(ejtz.b).withValues(contentValues0).build();
    }

    final gefz d() {
        return ejws.e(this.b, null, false);
    }

    final boolean e(ArrayList arrayList0) {
        arrayList0.add(0, ContentProviderOperation.newAssertQuery(ejtw.a).withSelection("account_id=?", new String[]{String.valueOf(this.a.a)}).withExpectedCount(0).build());
        return bbeh.c(this.c, arrayList0, "RemindersSync");
    }
}

