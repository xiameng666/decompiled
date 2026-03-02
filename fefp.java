import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fefp {
    public final String q;
    public fefo r;
    public HandlerThread s;

    protected fefp(String s, Looper looper0) {
        this.q = s;
        this.r = new fefo(looper0, this);
    }

    public final void A(fefk fefk0) {
        this.r.e = fefk0;
    }

    public final void B(fefk fefk0) {
        this.r.c(fefk0);
    }

    protected boolean C(Message message0) {
        return true;
    }

    public final void D(String s) {
        String s1 = this.q;
        if(Log.isLoggable(s1, 3)) {
            Log.d(s1, s);
        }
    }

    public final void E(int v) {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.sendMessage(fefo0.obtainMessage(2, v, 0));
    }

    public final void F() {
        this.r.h.e();
    }

    protected String a(int v) {
        return null;
    }

    protected void d() {
    }

    protected boolean j(Message message0) {
        return true;
    }

    public void n() {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.c.D("quit");
        fefo0.sendMessage(fefo0.obtainMessage(-1, fefo.a));
    }

    public void o() {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.mD(fefo0.obtainMessage(-2, fefo.a));
    }

    public final int p() {
        return this.r == null ? 0 : this.r.h.a();
    }

    public final Message q() {
        return this.r == null ? null : this.r.g;
    }

    public final fefk r() {
        return this.r == null ? null : this.r.f;
    }

    public final fefl s(int v) {
        return this.r == null ? null : this.r.h.b(v);
    }

    public final void t(fefk fefk0) {
        this.r.b(fefk0);
    }

    public final void u(fefk fefk0, fefk fefk1) {
        fefo fefo0 = this.r;
        Map map0 = fefo0.d;
        List list0 = map0.containsKey(fefk0) ? ((List)map0.get(fefk0)) : new ArrayList();
        if(!list0.contains(fefk1)) {
            list0.add(fefk1);
            map0.put(fefk0, list0);
            return;
        }
        Log.w(fefo0.c.q, a.Q(fefk1, fefk0, "Trying to add a transition that already exists! From ", " to "));
    }

    public final void v(int v) {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.removeMessages(v);
    }

    public final void w(fefk fefk0) {
        batl.l(this.q() != null);
        batl.l(this.r.getLooper().isCurrentThread());
        Message message0 = Message.obtain(this.r);
        message0.copyFrom(this.q());
        this.r.sendMessageAtFrontOfQueue(message0);
        this.r.c(fefk0);
    }

    public final void x(int v) {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.sendMessage(fefo0.obtainMessage(v));
    }

    public final void y(int v, Object object0) {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.sendMessage(fefo0.obtainMessage(v, object0));
    }

    public final void z(int v, long v1) {
        fefo fefo0 = this.r;
        if(fefo0 == null) {
            return;
        }
        fefo0.sendMessageDelayed(Message.obtain(fefo0, v), v1);
    }
}

