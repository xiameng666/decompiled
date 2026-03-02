import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import j..time.Instant;

public final class cqeg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = Instant.now().toEpochMilli();
        byte[] arr_b = null;
        SyncOptions syncOptions0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 3: {
                    syncOptions0 = (SyncOptions)baua.m(parcel0, v3, SyncOptions.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new SyncRequest(v2, arr_b, syncOptions0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SyncRequest[v];
    }
}

