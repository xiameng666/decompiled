import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.ArrayDeque;
import java.util.Queue;

final class azde {
    public static volatile azde a;
    private final Context b;
    private final Queue c;
    private int d;

    public azde(Context context0) {
        this.d = 0;
        this.c = new ArrayDeque();
        this.b = context0;
    }

    final boolean a(LogEventParcelable logEventParcelable0) {
        synchronized(this) {
            gftb.check(logEventParcelable0.b);
            Queue queue0 = this.c;
            if(((long)queue0.size()) < hrbp.a.b().a(this.b) && ((long)(this.d + logEventParcelable0.b.length)) < hrbp.a.b().b(this.b)) {
                queue0.add(new azdd());
                this.d += logEventParcelable0.b.length;
                return true;
            }
        }
        return false;
    }
}

