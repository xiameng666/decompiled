import android.app.Notification.InboxStyle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

public final class juu extends jvg {
    private final ArrayList a;

    public juu() {
        this.a = new ArrayList();
    }

    @Override  // jvg
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override  // jvg
    protected final void b(Bundle bundle0) {
        super.b(bundle0);
        bundle0.remove("android.textLines");
    }

    @Override  // jvg
    protected final void c(Bundle bundle0) {
        super.c(bundle0);
        ArrayList arrayList0 = this.a;
        arrayList0.clear();
        if(bundle0.containsKey("android.textLines")) {
            Collections.addAll(arrayList0, bundle0.getCharSequenceArray("android.textLines"));
        }
    }

    @Override  // jvg
    public final void d(jvl jvl0) {
        Notification.InboxStyle notification$InboxStyle0 = new Notification.InboxStyle(jvl0.a).setBigContentTitle(this.h);
        if(this.j) {
            notification$InboxStyle0.setSummaryText(this.i);
        }
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            notification$InboxStyle0.addLine(((CharSequence)arrayList0.get(v1)));
        }
    }
}

