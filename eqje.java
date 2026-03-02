import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import j..util.Objects;

final class eqje extends clht {
    final eqig a;

    public eqje(eqig eqig0, Looper looper0) {
        Objects.requireNonNull(eqig0);
        this.a = eqig0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            int v = 1;
            int v1 = message0.what;
            if(v1 == 0) {
                BootstrapOptions bootstrapOptions0 = (BootstrapOptions)message0.obj;
                erkf erkf0 = ((erjr)((eqkn)this.a.a).a).a;
                erkf0.ai = bootstrapOptions0;
                erkf0.b.f();
                return;
            }
            switch(v1) {
                case 1: {
                    ((eqkn)this.a.a).b.j("source-bootstrap-api");
                    erkf.a.j("Target disconnected", new Object[0]);
                    ((erjr)((eqkn)this.a.a).a).a.b.g();
                    return;
                }
                case 2: {
                    ((erjr)((eqkn)this.a.a).a).a.b.i(((String)message0.obj));
                    return;
                }
                case 3: {
                    int v2 = (int)(((Integer)message0.obj));
                    ((eqkn)this.a.a).b.j("source-bootstrap-api");
                    epzo epzo0 = ((eqkn)this.a.a).a;
                    String s = "Bootstrap error: " + epzh.a(v2);
                    erkf.a.f(s, new Object[0]);
                    switch(v2) {
                        case 10557: 
                        case 10584: {
                            v = 3;
                            break;
                        }
                        case 10595: {
                            v = 8;
                        }
                    }
                    ((erjr)epzo0).a.b.l(v);
                    return;
                }
                case 4: {
                    ((erjr)((eqkn)this.a.a).a).a.b.j(((VerificationInfo)message0.obj));
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

