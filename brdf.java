import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.SubscribeRequest;

public final class brdf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Subscription subscription0 = null;
        boolean z = false;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    subscription0 = (Subscription)baua.m(parcel0, v1, Subscription.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SubscribeRequest(subscription0, z, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SubscribeRequest[v];
    }
}

