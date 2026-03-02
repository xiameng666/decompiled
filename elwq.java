import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.Note;
import com.google.android.gms.semanticlocation.TimelineMemory;
import com.google.android.gms.semanticlocation.Trip;

public final class elwq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Trip trip0 = null;
        Note note0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    trip0 = (Trip)baua.m(parcel0, v1, Trip.CREATOR);
                    break;
                }
                case 2: {
                    note0 = (Note)baua.m(parcel0, v1, Note.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TimelineMemory(trip0, note0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TimelineMemory[v];
    }
}

