import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl.Operation;

public final class bcwj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        InterestRecordStub interestRecordStub0 = null;
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    interestRecordStub0 = (InterestRecordStub)baua.m(parcel0, v2, InterestRecordStub.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new InterestUpdateBatchImpl.Operation(v1, interestRecordStub0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InterestUpdateBatchImpl.Operation[v];
    }
}

