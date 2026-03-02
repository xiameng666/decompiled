import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

public final class ann {
    public final ComponentName a;
    public final bs b;
    private final bt c;

    public ann(bt bt0, bs bs0, ComponentName componentName0) {
        this.c = bt0;
        this.b = bs0;
        this.a = componentName0;
    }

    public final boolean a(List list0) {
        boolean z;
        Bundle bundle0 = new Bundle();
        try {
            bt bt0 = this.c;
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcel0.writeStrongInterface(this.b);
                parcel0.writeTypedObject(null, 0);
                parcel0.writeTypedObject(bundle0, 0);
                int v1 = list0.size();
                parcel0.writeInt(v1);
                for(int v2 = 0; v2 < v1; ++v2) {
                    parcel0.writeTypedObject(((Parcelable)list0.get(v2)), 0);
                }
                bt0.a.transact(4, parcel0, parcel1, 0);
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

