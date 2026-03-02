import java.text.SimpleDateFormat;
import java.util.Locale;

public final class idia extends ThreadLocal {
    @Override
    public final Object initialValue() {
        Object object0 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
        ((SimpleDateFormat)object0).setLenient(false);
        ((SimpleDateFormat)object0).setTimeZone(idgw.d);
        return object0;
    }
}

