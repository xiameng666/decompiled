import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import j..util.Objects;

final class eqjd extends clht {
    final eqid a;

    public eqjd(eqid eqid0, Looper looper0) {
        Objects.requireNonNull(eqid0);
        this.a = eqid0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            switch(message0.what) {
                case 0: {
                    ((erjs)((eqkm)this.a.a).a).a.b.k(((BootstrapProgressResult)message0.obj));
                    return;
                }
                case 1: {
                    ((eqkm)this.a.a).b.j("source-bootstrap-api");
                    epzm epzm0 = ((eqkm)this.a.a).a;
                    if(hygl.b() > 0L) {
                        long v = hygl.b();
                        erkf.a.j("Delay disconnect for %d milliseconds", new Object[]{v});
                        bblg bblg0 = new bblg("delayDisconnect", 10);
                        bblg0.start();
                        new bblf(bblg0).postDelayed(new erjj(((erjs)epzm0).a), v);
                    }
                    ((erjs)epzm0).a.b.e();
                    return;
                }
                case 2: {
                    ((erjs)((eqkm)this.a.a).a).a.b.h(((String)message0.obj));
                    return;
                }
                default: {
                    throw new IllegalArgumentException(a.aG(message0, "Unrecognized message: "));
                }
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", remoteException0);
        }
    }
}

