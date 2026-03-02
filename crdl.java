import android.os.Build.VERSION;
import android.os.Build;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class crdl extends crlv {
    private long a;
    private String b;

    public crdl(crkt crkt0) {
        super(crkt0);
    }

    public final long a() {
        this.l();
        return this.a;
    }

    public final String b() {
        this.l();
        return Build.MODEL;
    }

    public final String c() {
        this.l();
        return Build.VERSION.RELEASE;
    }

    public final String d() {
        this.l();
        return this.b;
    }

    @Override  // crlv
    protected final boolean e() {
        Calendar calendar0 = Calendar.getInstance();
        this.a = TimeUnit.MINUTES.convert(((long)(calendar0.get(15) + calendar0.get(16))), TimeUnit.MILLISECONDS);
        Locale locale0 = Locale.getDefault();
        this.b = locale0.getLanguage().toLowerCase(Locale.ENGLISH) + "-" + locale0.getCountry().toLowerCase(Locale.ENGLISH);
        return false;
    }
}

