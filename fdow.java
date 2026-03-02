import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class fdow {
    private static fdow a;
    private final gdgh b;
    private final gdgn c;

    private fdow(Context context0) {
        gdgh gdgh0 = new gdgh();
        this.b = gdgh0;
        ScheduledExecutorService scheduledExecutorService0 = clhl.b.h(1, clhr.a);
        faig faig0 = new faig();
        gdgn gdgn0 = new gdgn(faig0, new azts(context0, faig0), gdgh0, scheduledExecutorService0);
        this.c = gdgn0;
        gdgn0.a();
    }

    public static fdow a(Context context0) {
        synchronized(fdow.class) {
            if(fdow.a == null) {
                fdow.a = new fdow(context0);
            }
        }
        return fdow.a;
    }

    public final boolean b() {
        return ((Boolean)this.b.a().b(new fdou()).f(Boolean.valueOf(false))).booleanValue();
    }
}

