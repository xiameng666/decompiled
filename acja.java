import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.aidl.AppSearchBatchResultParcel;

public class acja implements Parcelable.Creator {
    public AppSearchBatchResultParcel a(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                bundle0 = baua.j(parcel0, v1);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new AppSearchBatchResultParcel(bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppSearchBatchResultParcel[v];
    }
}

