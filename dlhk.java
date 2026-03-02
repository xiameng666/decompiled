import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProvisionSePrepaidCardIntentArgs;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlhk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SeServiceProvider seServiceProvider0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v1, SeServiceProvider.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new ProvisionSePrepaidCardIntentArgs(seServiceProvider0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProvisionSePrepaidCardIntentArgs[v];
    }
}

