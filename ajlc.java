import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.concurrent.Callable;

public final class ajlc implements Callable {
    public final ajlf a;
    public final RemoteDevice b;

    public ajlc(ajlf ajlf0, RemoteDevice remoteDevice0) {
        this.a = ajlf0;
        this.b = remoteDevice0;
    }

    @Override
    public final Object call() {
        byte[] arr_b;
        RemoteDevice remoteDevice0 = this.b;
        synchronized(this.a.b.b) {
            for(Object object1: this.a.b.b()) {
                ConnectionInfo connectionInfo0 = (ConnectionInfo)object1;
                if(!connectionInfo0.b.equals(remoteDevice0)) {
                    continue;
                }
                arr_b = connectionInfo0.e;
                goto label_16;
            }
        }
        arr_b = null;
    label_16:
        if(arr_b == null) {
            ((ggtj)ajlf.a.h()).x("Failed to decrypt request, no channel binding data.");
        }
        return arr_b;
    }
}

