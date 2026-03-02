import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import java.util.List;

public final class bbws implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        IdTokenRequest idTokenRequest0 = null;
        Bundle bundle0 = null;
        List list0 = null;
        List list1 = null;
        boolean z = false;
        int v1 = 0;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    idTokenRequest0 = (IdTokenRequest)baua.m(parcel0, v3, IdTokenRequest.CREATOR);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v3, ImsiRequest.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 8: {
                    list1 = baua.v(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new VerifyPhoneNumberRequest(s, v2, idTokenRequest0, bundle0, list0, z, v1, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new VerifyPhoneNumberRequest[v];
    }
}

