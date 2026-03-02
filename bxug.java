import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;

public final class bxug implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PendingIntent pendingIntent0 = null;
        CreateCredentialResponse createCredentialResponse0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                case 2: {
                    createCredentialResponse0 = (CreateCredentialResponse)baua.m(parcel0, v1, CreateCredentialResponse.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateCredentialHandle(pendingIntent0, createCredentialResponse0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateCredentialHandle[v];
    }
}

