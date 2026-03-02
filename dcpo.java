import android.content.Context;
import j..util.Objects;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;

public final class dcpo {
    public final dcwh a;
    private final Context b;

    public dcpo(Context context0) {
        this.b = context0;
        this.a = new dcwh(((int)hvqs.g()));
    }

    final void a(Level level0, String s) {
        if(hvqs.g() > 0L) {
            String s1 = String.format("%s %s NearbySharing:  %s", new SimpleDateFormat("MM/dd HH:mm:ss.SSS", Locale.US).format(new Date()), level0, s);
            this.a.add(s1);
            if(hvqz.a.b().Q() && Objects.equals(level0, Level.WARNING)) {
                cuuk.a(this.b, "Nearby bugreport: WARNING event", s1);
            }
        }
    }
}

