import android.database.Cursor;
import dagger.producers.ProducerModule;

@ProducerModule
public final class caly {
    public static final bboh a;

    static {
        caly.a = bboh.b("GmscoreIpa", bbcu.ee);
    }

    public static void a(caot caot0, caod caod0) {
        while(caot0.e()) {
            capc capc0 = (capc)caot0.d();
            if(capc0 != null) {
                caod0.c(capc0);
            }
        }
    }

    public static void b(Cursor cursor0, int v, caoh caoh0) {
        while(!cursor0.isAfterLast()) {
            caoh0.c(new canr(cursor0.getLong(v)));
            cursor0.moveToNext();
        }
    }
}

