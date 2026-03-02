import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse;

public final class fdih implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        FastPairAccountKeyParcelable fastPairAccountKeyParcelable0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    fastPairAccountKeyParcelable0 = (FastPairAccountKeyParcelable)baua.m(parcel0, v2, FastPairAccountKeyParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetFastpairAccountKeyByAccountResponse(v1, fastPairAccountKeyParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetFastpairAccountKeyByAccountResponse[v];
    }
}

