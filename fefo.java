import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class fefo extends clht {
    public static final Object a;
    public fefp c;
    public final Map d;
    public fefk e;
    public fefk f;
    public Message g;
    public final fefm h;
    private fefk i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final fefk m;

    static {
        fefo.a = new Object();
    }

    public fefo(Looper looper0, fefp fefp0) {
        super(looper0);
        this.d = new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.h = new fefm();
        fefn fefn0 = new fefn();
        this.m = fefn0;
        this.c = fefp0;
        this.b(fefn0);
    }

    final void b(fefk fefk0) {
        Map map0 = this.d;
        if(!map0.containsKey(fefk0)) {
            map0.put(fefk0, new ArrayList());
            return;
        }
        Log.w(this.c.q, "Trying to add state that has already been added: " + fefk0);
    }

    final void c(fefk fefk0) {
        if(this.j) {
            Log.w(this.c.q, "transitionTo called while transition already in progress to: " + this.i + ", new target state: " + fefk0);
        }
        this.i = fefk0;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(this.k) {
            Log.w("BleConnectionManager", a.aG(message0, "Received message but state machine has already quit. Ignoring msg.what: "));
            return;
        }
        if(this.c.j(message0)) {
            this.c.D("[" + (this.f == null ? "" : this.f.a()) + "] handleMessage: msg.what=" + message0.what + "(" + this.c.a(message0.what) + ")");
        }
        this.g = message0;
        if(this.l) {
            if(message0.what == -1 && message0.obj == fefo.a) {
                this.c(this.m);
                goto label_17;
            }
            if(this.f.d(message0)) {
                goto label_17;
            }
            this.c.D(a.aG(message0, "unhandledMessage: msg.what="));
        }
        else {
            if(message0.what != -2 || message0.obj != fefo.a) {
                throw new RuntimeException(a.aG(message0, "StateMachine.handleMessage: Start method not called, received msg.what: "));
            }
            this.l = true;
            this.f = this.e;
            this.e.b();
        }
    label_17:
        if(this.c.C(this.g) && this.g.obj != fefo.a) {
            this.h.d(this.c, this.g, this.f, this.i);
        }
        if(this.i != null) {
            if(!((List)this.d.get(this.f)).contains(this.i) && this.i != this.m) {
                Log.w(this.c.q, "Trying to perform an invalid transition from " + this.f.a() + " to " + this.i.a());
                return;
            }
            this.j = true;
            this.f.c();
            fefk fefk0 = this.i;
            this.f = fefk0;
            this.i = null;
            this.j = false;
            fefk0.b();
            if(this.f == this.m) {
                this.c.d();
                this.c.r = null;
                this.c = null;
                this.g = null;
                this.h.c();
                this.f = null;
                this.i = null;
                this.e = null;
                this.k = true;
            }
        }
    }
}

