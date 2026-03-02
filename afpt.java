import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class afpt {
    public static String a() {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS", Locale.US);
        bxos bxos0 = (bxos)bxos.a.b();
        return simpleDateFormat0.format(new Date(System.currentTimeMillis()));
    }
}

