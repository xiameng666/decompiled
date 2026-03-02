import android.database.sqlite.SQLiteStatement;
import j..util.Objects;

public final class eion implements AutoCloseable {
    final eior a;
    private final String b;
    private final boolean c;

    public eion(eior eior0, String s, boolean z) {
        Objects.requireNonNull(eior0);
        this.a = eior0;
        super();
        this.b = s;
        this.c = z;
    }

    public final eiol a(String s) {
        return new eiol(this.a, s, null, eior.b);
    }

    @Override
    public final void close() {
        try(SQLiteStatement sQLiteStatement0 = this.a.c.compileStatement((this.c ? "DROP TABLE temp." : "DELETE FROM temp.") + this.b)) {
            sQLiteStatement0.execute();
        }
    }
}

