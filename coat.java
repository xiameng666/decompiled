import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.AnonymousCounterpart;
import com.google.android.gms.locationsharingreporter.Counterpart;
import com.google.android.gms.locationsharingreporter.IdentifiedUser;

public final class coat implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IdentifiedUser identifiedUser0 = null;
        AnonymousCounterpart anonymousCounterpart0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    identifiedUser0 = (IdentifiedUser)baua.m(parcel0, v1, IdentifiedUser.CREATOR);
                    break;
                }
                case 2: {
                    anonymousCounterpart0 = (AnonymousCounterpart)baua.m(parcel0, v1, AnonymousCounterpart.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Counterpart(identifiedUser0, anonymousCounterpart0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Counterpart[v];
    }
}

