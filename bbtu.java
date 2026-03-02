import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;

public final class bbtu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataHolder dataHolder0 = null;
        DataHolder dataHolder1 = null;
        long v1 = 0L;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    dataHolder0 = (DataHolder)baua.m(parcel0, v3, DataHolder.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 5: {
                    dataHolder1 = (DataHolder)baua.m(parcel0, v3, DataHolder.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new FetchConfigIpcResponse(v2, dataHolder0, v1, dataHolder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FetchConfigIpcResponse[v];
    }
}

