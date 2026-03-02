import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.EnterUserCreatedPassIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dldd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ProtoSafeParcelable protoSafeParcelable0 = null;
        ProtoSafeParcelable protoSafeParcelable1 = null;
        ProtoSafeParcelable protoSafeParcelable2 = null;
        Uri[] arr_uri = null;
        ProtoSafeParcelable protoSafeParcelable3 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 2: {
                    protoSafeParcelable1 = (ProtoSafeParcelable)baua.m(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 3: {
                    protoSafeParcelable2 = (ProtoSafeParcelable)baua.m(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 5: {
                    arr_uri = (Uri[])baua.J(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 6: {
                    protoSafeParcelable3 = (ProtoSafeParcelable)baua.m(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new EnterUserCreatedPassIntentArgs(protoSafeParcelable0, protoSafeParcelable1, protoSafeParcelable2, v1, arr_uri, protoSafeParcelable3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new EnterUserCreatedPassIntentArgs[v];
    }
}

