import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j..time.Instant;
import j..util.Optional;

final class azjx {
    public final SQLiteDatabase a;

    public azjx(SQLiteDatabase sQLiteDatabase0) {
        this.a = sQLiteDatabase0;
    }

    final Optional a() {
        try(Cursor cursor0 = this.a.query("CookieBucketSeed", new String[]{"seed", "last_updated_time"}, null, null, null, null, null, "1")) {
            if(cursor0.moveToFirst()) {
                Instant instant0 = Instant.ofEpochMilli(cursor0.getLong(cursor0.getColumnIndexOrThrow("last_updated_time")));
                return Optional.of(new azjy(cursor0.getLong(cursor0.getColumnIndexOrThrow("seed")), instant0));
            }
            return Optional.empty();
        }
    }
}

