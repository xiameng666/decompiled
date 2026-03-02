import j..util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class cslw extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        Object object0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ", Locale.US);
        ((DateFormat)object0).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return object0;
    }
}

