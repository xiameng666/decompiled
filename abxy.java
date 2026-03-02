import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class abxy {
    public static String a(abyc abyc0) {
        return abyc0.a + "_delete_trigger_appdatasearch";
    }

    public static String b(abyc abyc0) {
        return abyc0.a + "_insert_trigger_appdatasearch";
    }

    public static String c(abyc abyc0) {
        return abyc0.a + "_seqno_table_appdatasearch";
    }

    public static String d(abyc abyc0) {
        return abyc0.a + "_update_trigger_appdatasearch";
    }

    public static Set e(SQLiteDatabase sQLiteDatabase0) {
        return abyd.a(sQLiteDatabase0, new String[]{"_seqno_table_appdatasearch"});
    }

    public static Set f(SQLiteDatabase sQLiteDatabase0) {
        return abyd.b(sQLiteDatabase0, new String[]{"_trigger_appdatasearch"});
    }

    public static Set g(abyc abyc0) {
        return new HashSet(Arrays.asList(new String[]{abxy.b(abyc0), abxy.a(abyc0), abxy.d(abyc0)}));
    }
}

