import android.os.RemoteException;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class albb implements Runnable {
    public final albd a;

    public albb(albd albd0) {
        this.a = albd0;
    }

    @Override
    public final void run() {
        albd albd0;
        try {
            albd0 = this.a;
            albe albe0 = albd0.a;
            if(albe0.r != null) {
                try {
                    albe0.r.c(new albc(albd0));
                    albe.a.d("Exo signalingService != null, calling signalingService.setCallback", new Object[0]);
                    albe0.a(new gmaq());
                    Set set0 = albe0.c;
                    for(Object object0: set0) {
                        gftb.check(albe0.r);
                        albe0.r.a(((String)object0));
                    }
                    set0.clear();
                    Map map0 = albe0.d;
                    for(Object object1: map0.entrySet()) {
                        gftb.check(albe0.r);
                        albe0.r.d(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                    }
                    map0.clear();
                }
                catch(RemoteException remoteException0) {
                    albe.a.g("Could not set callback on service G->B", remoteException0, new Object[0]);
                }
            }
        }
        finally {
            albd0.a.g.g();
        }
    }
}

