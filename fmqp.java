import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.lang.ref.WeakReference;
import jeb.synthetic.FIN;

public final class fmqp {
    private static WeakReference a;
    private final LruCache b;

    static {
        fmqp.a = new WeakReference(null);
    }

    public fmqp() {
        this.b = new LruCache(50);
    }

    public static fmqp a() {
        fmqp fmqp0;
        synchronized(fmqp.class) {
            fmqp0 = (fmqp)fmqp.a.get();
            if(fmqp0 == null) {
                fmqp fmqp1 = new fmqp();
                fmqp.a = new WeakReference(fmqp1);
                return fmqp1;
            }
        }
        return fmqp0;
    }

    public final Bitmap b(fmeo fmeo0, int v, fmqr fmqr0) {
        Bitmap bitmap0;
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        ContactId contactId0 = fmeo0.a;
        if(contactId0 != null) {
            fmqn fmqn0 = new fmqn(contactId0, v);
            LruCache lruCache0 = this.b;
            fmqo fmqo0 = (fmqo)lruCache0.get(fmqn0);
            if(fmqo0 != null && fmqo0.b.equals(fmeo0.d) && fmqo0.c == fmeo0.hashCode()) {
                bitmap0 = fmqo0.a;
                goto label_22;
            }
            gfsx gfsx0 = fmeo0.d;
            if(gfsx0 != null) {
                int v2 = fmeo0.hashCode();
                fmqm fmqm0 = fmqr0.a.a;
                int[] arr_v = fmqr0.a.c;
                int v3 = fmqr0.a.d;
                Drawable drawable0 = fmqr0.a.getContext().getDrawable(0x7F080A54);
                Bitmap bitmap1 = fmqm0.a(fmeo0, fmqn0.a, arr_v, v3, gfqx.a, drawable0);
                if(bitmap1 != null) {
                    fmqo fmqo1 = new fmqo(bitmap1, gfsx0, v2);
                    lruCache0.put(fmqn0, fmqo1);
                    bitmap0 = fmqo1.a;
                label_22:
                    FIN.finallyCodeBegin$NT(v1);
                    return bitmap0;
                }
                throw new NullPointerException("Null avatar");
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null contactId");
    }
}

