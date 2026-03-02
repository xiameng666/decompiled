import j..util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

final class hfyl extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        Object object0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar0.setGregorianChange(new Date(0x8000000000000000L));
        ((SimpleDateFormat)object0).setCalendar(gregorianCalendar0);
        return object0;
    }
}

