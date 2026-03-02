import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

public final class owu implements ibth {
    @Override  // ibth
    public final Object a() {
        try {
            Method method0 = owv.b();
            if(method0 != null) {
                Class class0 = method0.getReturnType();
                if(class0 != null) {
                    return class0.getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

