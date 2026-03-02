import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ack {
    private final Set a;
    private volatile Context b;

    public ack() {
        this.a = new CopyOnWriteArraySet();
    }

    public final void a(acl acl0) {
        Context context0 = this.b;
        if(context0 != null) {
            acl0.a(context0);
        }
        this.a.add(acl0);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context0) {
        this.b = context0;
        for(Object object0: this.a) {
            ((acl)object0).a(context0);
        }
    }
}

