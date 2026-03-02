import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;

public final class bcub implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        String s = null;
        ContextFenceStub contextFenceStub0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    contextFenceStub0 = (ContextFenceStub)baua.m(parcel0, v2, ContextFenceStub.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContextFenceRegistrationStub(s, contextFenceStub0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContextFenceRegistrationStub[v];
    }
}

