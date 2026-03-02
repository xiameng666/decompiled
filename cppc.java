import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;

abstract class cppc extends cppd {
    final cppg e;

    public cppc(cppg cppg0) {
        Objects.requireNonNull(cppg0);
        this.e = cppg0;
        super(cppg0.b);
    }

    @Override  // cppd
    public final Object b() {
        try {
            cppg cppg0 = this.e;
            cpph cpph0 = cppg0.a;
            if(cpph0 != null) {
                return ObjectWrapper.a(this.a(cpph0));
            }
            cppl cppl0 = cppg0.b.a;
            if(cppl0 != null) {
                cppg0.a = cppl0.newCameraUpdateFactoryDelegate();
                return ObjectWrapper.a(this.a(cppg0.a));
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("maps.CreatorImpl", "Failed to compute lazy value.", remoteException0);
        }
        return null;
    }
}

