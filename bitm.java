import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import com.google.android.gms.dtdi.core.internal.ConnectParams;

public final class bitm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TokenWrapper tokenWrapper0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        WakeUpRequest wakeUpRequest0 = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    tokenWrapper0 = (TokenWrapper)baua.m(parcel0, v1, TokenWrapper.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                case 4: {
                    wakeUpRequest0 = (WakeUpRequest)baua.m(parcel0, v1, WakeUpRequest.CREATOR);
                    break;
                }
                case 5: {
                    iBinder2 = baua.k(parcel0, v1);
                    break;
                }
                case 6: {
                    iBinder3 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectParams(tokenWrapper0, iBinder0, iBinder1, wakeUpRequest0, iBinder2, iBinder3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectParams[v];
    }
}

