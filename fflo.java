import android.util.Log;
import com.google.android.gms.wearable.internal.BooleanResponse;
import j..util.Objects;
import jeb.synthetic.FIN;

final class fflo extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public fflo(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("isNodeConnectionMetered");
    }

    @Override  // ffee
    public final void a() {
        try {
            String s = this.c;
            Object object0 = this.e.i.d;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            this.e.i.r();
            fdyo fdyo0 = this.e.i.g.b(s);
            if(fdyo0 != null) {
                fdyp fdyp0 = (fdyp)fdyo0.e.get("cloud");
                if(fdyp0 != null) {
                    FIN.finallyCodeBegin$NT(v);
                    BooleanResponse booleanResponse0 = new BooleanResponse(0, fdyp0.b);
                    this.d.f(booleanResponse0);
                    return;
                }
                throw new fdwn(a.a(s, "nodeId", " does not have a connection to the cloud"));
            }
            throw new fdwn(a.a(s, "nodeId ", " not found"));
        }
        catch(fdwn fdwn0) {
            BooleanResponse booleanResponse1 = new BooleanResponse(4004, false);
            this.d.f(booleanResponse1);
            Log.w("WearableService", "isNodeConnectionMetered failed", fdwn0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "isNodeConnectionMetered: exception during processing", exception0);
            BooleanResponse booleanResponse2 = new BooleanResponse(8, false);
            this.d.f(booleanResponse2);
        }
    }
}

