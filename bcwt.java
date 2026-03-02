import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;

public final class bcwt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 3) {
                arrayList0 = baua.y(parcel0, v1, ContextData.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new WriteBatchImpl(arrayList0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WriteBatchImpl[v];
    }
}

