import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.SemanticLocationEventRequest;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.internal.SemanticLocationParameters;
import com.google.android.gms.semanticlocation.subscriptions.Subscription;

public final class emtq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        PendingIntent pendingIntent0 = null;
        SemanticLocationParameters semanticLocationParameters0 = null;
        SemanticLocationEventRequest semanticLocationEventRequest0 = null;
        String s = null;
        SemanticLocationState semanticLocationState0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v3, PendingIntent.CREATOR);
                    break;
                }
                case 2: {
                    semanticLocationParameters0 = (SemanticLocationParameters)baua.m(parcel0, v3, SemanticLocationParameters.CREATOR);
                    break;
                }
                case 3: {
                    semanticLocationEventRequest0 = (SemanticLocationEventRequest)baua.m(parcel0, v3, SemanticLocationEventRequest.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    semanticLocationState0 = (SemanticLocationState)baua.m(parcel0, v3, SemanticLocationState.CREATOR);
                    break;
                }
                case 7: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new Subscription(pendingIntent0, semanticLocationParameters0, semanticLocationEventRequest0, v1, s, semanticLocationState0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Subscription[v];
    }
}

