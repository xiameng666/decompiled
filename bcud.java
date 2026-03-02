import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl.QueryFenceOperation;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;

public final class bcud implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        FenceQueryRequestImpl.QueryFenceOperation fenceQueryRequestImpl$QueryFenceOperation0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                fenceQueryRequestImpl$QueryFenceOperation0 = (FenceQueryRequestImpl.QueryFenceOperation)baua.m(parcel0, v1, FenceQueryRequestImpl.QueryFenceOperation.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new FenceQueryRequestImpl(fenceQueryRequestImpl$QueryFenceOperation0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FenceQueryRequestImpl[v];
    }
}

