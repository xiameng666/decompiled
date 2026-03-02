import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class fdil implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        NodeParcelable nodeParcelable0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    nodeParcelable0 = (NodeParcelable)baua.m(parcel0, v2, NodeParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetLocalNodeResponse(v1, nodeParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetLocalNodeResponse[v];
    }
}

