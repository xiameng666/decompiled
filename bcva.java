import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;

public final class bcva implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        ContextFenceRegistrationStub contextFenceRegistrationStub0 = null;
        IBinder iBinder0 = null;
        PendingIntent pendingIntent0 = null;
        String s = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    contextFenceRegistrationStub0 = (ContextFenceRegistrationStub)baua.m(parcel0, v4, ContextFenceRegistrationStub.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = baua.k(parcel0, v4);
                    break;
                }
                case 5: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v4, PendingIntent.CREATOR);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 7: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 8: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateFenceOperation(v3, contextFenceRegistrationStub0, iBinder0, pendingIntent0, s, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateFenceOperation[v];
    }
}

