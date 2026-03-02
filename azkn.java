import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j..time.Instant;
import j..util.Optional;

final class azkn {
    private final SQLiteDatabase a;

    public azkn(SQLiteDatabase sQLiteDatabase0) {
        this.a = sQLiteDatabase0;
    }

    final Optional a(azkp azkp0) {
        try(Cursor cursor0 = this.a.rawQuery("SELECT initial_enabled_time, start_disabled_time FROM Projects WHERE customer_id = ? AND project_id = ?", new String[]{Integer.toString(azkp0.a), Integer.toString(azkp0.b)})) {
            if(cursor0.moveToNext()) {
                Optional optional0 = Optional.empty();
                if(!cursor0.isNull(cursor0.getColumnIndexOrThrow("initial_enabled_time"))) {
                    optional0 = Optional.of(Instant.ofEpochMilli(cursor0.getLong(cursor0.getColumnIndexOrThrow("initial_enabled_time"))));
                }
                Optional optional1 = Optional.empty();
                if(!cursor0.isNull(cursor0.getColumnIndexOrThrow("start_disabled_time"))) {
                    optional1 = Optional.of(Instant.ofEpochMilli(cursor0.getLong(cursor0.getColumnIndexOrThrow("start_disabled_time"))));
                }
                return Optional.of(new azko(azkp0, optional0, optional1));
            }
            return Optional.empty();
        }
    }

    final void b(azko azko0) {
        ContentValues contentValues0 = azko0.a();
        this.a.insertWithOnConflict("Projects", null, contentValues0, 2);
    }

    final void c(azko azko0) {
        ContentValues contentValues0 = azko0.a();
        this.a.update("Projects", contentValues0, "customer_id = ? AND project_id = ?", new String[]{Integer.toString(azko0.a.a), Integer.toString(azko0.a.b)});
    }
}

