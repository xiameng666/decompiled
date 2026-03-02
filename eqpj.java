import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;

public final class eqpj implements eqos {
    public final Queue a;
    public eqos b;
    private final Handler c;

    public eqpj(Looper looper0) {
        this.a = new LinkedList();
        this.c = new clht(looper0);
    }

    public final void a(eqos eqos0, int v, Bundle bundle0) {
        eqpi eqpi0 = new eqpi(this, eqos0, v, bundle0);
        this.c.post(eqpi0);
    }

    public final void b(eqos eqos0) {
        this.b = eqos0;
        kau kau0 = (kau)this.a.poll();
        if(eqos0 != null && kau0 != null) {
            Object object0 = kau0.a;
            if(object0 != null) {
                Object object1 = kau0.b;
                if(object1 != null) {
                    this.a(eqos0, ((Integer)object0).intValue(), ((Bundle)object1));
                }
            }
        }
    }

    @Override  // eqos
    public final void c(int v, Bundle bundle0) {
        eqos eqos0 = this.b;
        if(eqos0 == null) {
            this.a.add(new kau(v, bundle0));
            return;
        }
        eqos0.c(v, bundle0);
    }
}

