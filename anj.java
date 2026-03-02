import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;

public final class anj {
    private final ComponentName a;
    private final bt b;

    public anj(bt bt0, ComponentName componentName0) {
        this.b = bt0;
        this.a = componentName0;
    }

    public final ann a(amy amy0) {
        bs bs0 = new bs(amy0);
        try {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcel0.writeStrongInterface(bs0);
                this.b.a.transact(3, parcel0, parcel1, 0);
                parcel1.readException();
                int v1 = parcel1.readInt();
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
            if(v1 != 0) {
                return new ann(this.b, bs0, this.a);
            }
        }
        catch(RemoteException unused_ex) {
        }
        return null;
    }

    public static boolean b(Context context0, String s, anm anm0) {
        anm0.a = context0.getApplicationContext();
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent0.setPackage(s);
        return context0.bindService(intent0, anm0, 33);
    }

    public final boolean c() {
        boolean z;
        try {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcel0.writeLong(0L);
                this.b.a.transact(2, parcel0, parcel1, 0);
                parcel1.readException();
                z = parcel1.readInt() != 0;
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
            return z;
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }
}

