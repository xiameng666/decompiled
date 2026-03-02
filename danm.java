import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;

public final class danm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Message message0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    message0 = (Message)baua.m(parcel0, v2, Message.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new MessageWrapper(v1, message0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MessageWrapper[v];
    }
}

