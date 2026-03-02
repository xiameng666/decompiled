import android.database.sqlite.SQLiteDatabase;
import android.util.TimingLogger;
import java.util.LinkedHashMap;

public abstract class fduv extends glyq {
    protected abstract void c(TimingLogger arg1, SQLiteDatabase arg2, LinkedHashMap arg3);

    protected abstract boolean d(TimingLogger arg1, SQLiteDatabase arg2);

    public static final void e(LinkedHashMap linkedHashMap0, fduq fduq0) {
        fdup fdup0 = new fdup(fduq0);
        linkedHashMap0.remove(fdup0);
        linkedHashMap0.put(fdup0, fduq0);
    }
}

