import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.userlocation.LegacySemanticLocationEventSubscription;

public final class gald implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SemanticLocationEventRequest semanticLocationEventRequest0 = null;
        PlacesParams placesParams0 = null;
        PendingIntent pendingIntent0 = null;
        PendingIntent pendingIntent1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    semanticLocationEventRequest0 = (SemanticLocationEventRequest)baua.m(parcel0, v1, SemanticLocationEventRequest.CREATOR);
                    break;
                }
                case 2: {
                    placesParams0 = (PlacesParams)baua.m(parcel0, v1, PlacesParams.CREATOR);
                    break;
                }
                case 3: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                case 4: {
                    pendingIntent1 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LegacySemanticLocationEventSubscription(semanticLocationEventRequest0, placesParams0, pendingIntent0, pendingIntent1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LegacySemanticLocationEventSubscription[v];
    }
}

