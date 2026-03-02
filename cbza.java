import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.gms.dynamic.ObjectWrapper;

public class cbza extends BoundService {
    private final Object a;
    private final ccdd b;
    private ccdh c;

    public cbza() {
        this.b = new ccdd(this);
        this.a = new Object();
    }

    public void a(String s, byte[] arr_b, byte[] arr_b1, cccs cccs0, grhf grhf0) {
        throw null;
    }

    private final ccdh b() {
        synchronized(this.a) {
        }
        return this.c;
    }

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        ccdh ccdh0;
        synchronized(this.a) {
            ccdh0 = this.c;
            if(ccdh0 == null) {
                try {
                    ccdh0 = (ccdh)ccdp.a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", new cbyz());
                }
                catch(ccdn ccdn0) {
                    if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", ccdn0);
                    }
                    return new ccdi("No IInAppExampleStoreProxy implementation found");
                }
                try {
                    ObjectWrapper objectWrapper0 = new ObjectWrapper(this);
                    Parcel parcel0 = ccdh0.jo();
                    wbz.h(parcel0, objectWrapper0);
                    wbz.h(parcel0, this.b);
                    ccdh0.jp(1, parcel0);
                    this.c = ccdh0;
                }
                catch(RemoteException remoteException0) {
                    if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", remoteException0);
                    }
                    return new ccdi("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            Parcel parcel1 = ccdh0.jo();
            wbz.f(parcel1, intent0);
            Parcel parcel2 = ccdh0.hM(3, parcel1);
            IBinder iBinder0 = parcel2.readStrongBinder();
            parcel2.recycle();
            return iBinder0;
        }
        catch(RemoteException remoteException1) {
            if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", remoteException1);
            }
            return new ccdi("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onDestroy() {
        ccdh ccdh0 = this.b();
        if(ccdh0 != null) {
            try {
                ccdh0.jp(2, ccdh0.jo());
            }
            catch(RemoteException remoteException0) {
                if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onRebind(Intent intent0) {
        ccdh ccdh0 = this.b();
        if(ccdh0 != null) {
            try {
                Parcel parcel0 = ccdh0.jo();
                wbz.f(parcel0, intent0);
                ccdh0.jp(6, parcel0);
            }
            catch(RemoteException remoteException0) {
                if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onTrimMemory(int v) {
        ccdh ccdh0 = this.b();
        if(ccdh0 != null) {
            try {
                Parcel parcel0 = ccdh0.jo();
                parcel0.writeInt(v);
                ccdh0.jp(4, parcel0);
            }
            catch(RemoteException remoteException0) {
                if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        ccdh ccdh0 = this.b();
        if(ccdh0 != null) {
            try {
                Parcel parcel0 = ccdh0.jo();
                wbz.f(parcel0, intent0);
                Parcel parcel1 = ccdh0.hM(5, parcel0);
                boolean z = wbz.i(parcel1);
                parcel1.recycle();
                return z;
            }
            catch(RemoteException remoteException0) {
                if(Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", remoteException0);
                }
            }
        }
        return false;
    }
}

