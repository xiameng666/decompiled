import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;

public final class abtd extends lsb {
    public static final bboh a;
    public final Context b;
    public final becb c;
    public evql d;
    public final lqi e;
    public final lqi f;
    public final lqi g;
    public final lqi h;
    public final lqi i;
    public final lqi j;
    public final bxox k;
    public final aysr l;

    static {
        abtd.a = bboh.b("LocalPasswordViewModel", bbcu.dH);
    }

    public abtd(Context context0, aysr aysr0, becb becb0) {
        this.d = null;
        this.e = new lqi();
        this.f = new lqi();
        this.g = new lqi();
        this.h = new lqi();
        this.i = new lqi();
        this.j = new lqi();
        this.k = new bxox();
        this.b = context0.getApplicationContext();
        this.l = aysr0;
        this.c = becb0;
    }

    static void a(PendingIntent pendingIntent0) {
        try {
            pendingIntent0.send();
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            a.ae(abtd.a.j(), "Error starting credential manager", pendingIntent$CanceledException0);
        }
    }
}

