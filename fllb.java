import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public final class fllb implements Callable {
    public final flmu a;
    public final String b;
    public final String c;
    public final gfsi d;
    public final long e;

    public fllb(flmu flmu0, String s, String s1, gfsi gfsi0, long v) {
        this.a = flmu0;
        this.b = s;
        this.c = s1;
        this.d = gfsi0;
        this.e = v;
    }

    @Override
    public final Object call() {
        flmu flmu0 = this.a;
        gfsx gfsx0 = flmu0.u(this.b);
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            ArrayList arrayList0 = new ArrayList();
            gged_interceptors gged0 = ((Notification)object0).g().d();
            int v1 = gged0.size();
            int v2 = 0;
            for(int v = 0; v < v1; ++v) {
                MessageReceivedNotification messageReceivedNotification0 = (MessageReceivedNotification)gged0.get(v);
                if(this.c == null || messageReceivedNotification0.i().equals(this.c)) {
                    long v3 = this.e;
                    fmgh fmgh0 = messageReceivedNotification0.e();
                    Integer integer0 = messageReceivedNotification0.a();
                    fmgh0.h(((Integer)this.d.apply(integer0)).intValue());
                    if(v3 >= 0L) {
                        fmgh0.k(v3);
                    }
                    messageReceivedNotification0 = fmgh0.a();
                    ++v2;
                }
                if(messageReceivedNotification0.a() != 3) {
                    arrayList0.add(messageReceivedNotification0);
                }
            }
            Collections.sort(arrayList0, new fmgi());
            fmgj fmgj0 = new fmgj(((Notification)object0));
            fmgq fmgq0 = ((Notification)object0).g().c();
            fmgq0.c(gged_interceptors.i(arrayList0));
            fmgj0.f(fmgq0.a());
            Notification notification0 = fmgj0.a();
            Uri uri0 = flmu0.l("notifications");
            ContentValues contentValues0 = flor.a(notification0);
            if(flmu0.e.c(uri0, contentValues0, 5) < 0L) {
                throw new SQLiteException("Failed to save notification.");
            }
            flmu0.R();
            return v2;
        }
        return (int)0;
    }
}

