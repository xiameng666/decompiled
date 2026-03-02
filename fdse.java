import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j..util.Objects;
import java.io.IOException;

public final class fdse extends clht {
    final fdsh a;

    public fdse(fdsh fdsh0, Looper looper0) {
        Objects.requireNonNull(fdsh0);
        this.a = fdsh0;
        super(looper0);
    }

    public final void b(int v) {
        synchronized(this.a.A) {
            fdsh.i(this.a.A);
            this.a.j.removeMessages(v);
            this.a.j.obtainMessage(v).sendToTarget();
        }
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            fdsh fdsh0 = this.a;
            Log.d("CloudNode", "Entering the handler: " + fdsh0.w.a() + " pending rpcs in queue.");
            if(fdsh0.w.b(fdsh0.A) && hzuz.i()) {
                ((fdue)fdsh0.G.get()).v();
            }
        }
        catch(IOException iOException0) {
            this.a.v.c();
            Log.w("CloudNode", "caught IOException in RpcHandler retrying in " + this.a.v.a() + " ms: " + iOException0.getMessage());
            long v = this.a.v.b();
            this.a.l(v, "rpc_alarm_wakeup");
        }
        catch(fdsp fdsp0) {
            this.a.f(fdsp0, "RpcHandler");
        }
        esaa esaa0 = this.a.A;
        synchronized(esaa0) {
            if(!this.hasMessages(6)) {
                esaa0.g();
            }
        }
    }
}

