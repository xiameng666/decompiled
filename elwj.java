import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.ActivityEndEvent;
import com.google.android.gms.semanticlocation.ActivityOngoingEvent;
import com.google.android.gms.semanticlocation.ActivityStartEvent;
import com.google.android.gms.semanticlocation.PlaceEnterEvent;
import com.google.android.gms.semanticlocation.PlaceExitEvent;
import com.google.android.gms.semanticlocation.PlaceOngoingEvent;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;

public final class elwj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        PlaceEnterEvent placeEnterEvent0 = null;
        PlaceExitEvent placeExitEvent0 = null;
        PlaceOngoingEvent placeOngoingEvent0 = null;
        ActivityStartEvent activityStartEvent0 = null;
        ActivityEndEvent activityEndEvent0 = null;
        ActivityOngoingEvent activityOngoingEvent0 = null;
        int v1 = 0;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    placeEnterEvent0 = (PlaceEnterEvent)baua.m(parcel0, v3, PlaceEnterEvent.CREATOR);
                    break;
                }
                case 5: {
                    placeExitEvent0 = (PlaceExitEvent)baua.m(parcel0, v3, PlaceExitEvent.CREATOR);
                    break;
                }
                case 6: {
                    placeOngoingEvent0 = (PlaceOngoingEvent)baua.m(parcel0, v3, PlaceOngoingEvent.CREATOR);
                    break;
                }
                case 7: {
                    activityStartEvent0 = (ActivityStartEvent)baua.m(parcel0, v3, ActivityStartEvent.CREATOR);
                    break;
                }
                case 8: {
                    activityEndEvent0 = (ActivityEndEvent)baua.m(parcel0, v3, ActivityEndEvent.CREATOR);
                    break;
                }
                case 9: {
                    activityOngoingEvent0 = (ActivityOngoingEvent)baua.m(parcel0, v3, ActivityOngoingEvent.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new SemanticLocationEvent(v2, s, v1, placeEnterEvent0, placeExitEvent0, placeOngoingEvent0, activityStartEvent0, activityEndEvent0, activityOngoingEvent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SemanticLocationEvent[v];
    }
}

