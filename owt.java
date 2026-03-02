import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

public final class owt implements ibth {
    @Override  // ibth
    public final Object a() {
        try {
            Object object0 = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            ((Method)object0).setAccessible(true);
            return object0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

