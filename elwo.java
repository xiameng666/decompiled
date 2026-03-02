import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.Activity;
import com.google.android.gms.semanticlocation.SemanticSegment;
import com.google.android.gms.semanticlocation.Visit;

public final class elwo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        String s = null;
        Visit visit0 = null;
        Activity activity0 = null;
        long v6 = 0L;
        long v7 = 0L;
        while(parcel0.dataPosition() < v) {
            int v8 = parcel0.readInt();
            switch(((char)v8)) {
                case 1: {
                    v6 = baua.i(parcel0, v8);
                    break;
                }
                case 2: {
                    v7 = baua.i(parcel0, v8);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v8);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v8);
                    break;
                }
                case 6: {
                    baua.D(parcel0, v8);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v8);
                    break;
                }
                case 8: {
                    v3 = baua.f(parcel0, v8);
                    break;
                }
                case 9: {
                    visit0 = (Visit)baua.m(parcel0, v8, Visit.CREATOR);
                    break;
                }
                case 10: {
                    activity0 = (Activity)baua.m(parcel0, v8, Activity.CREATOR);
                    break;
                }
                case 11: {
                    v4 = baua.f(parcel0, v8);
                    break;
                }
                case 12: {
                    v5 = baua.f(parcel0, v8);
                    break;
                }
                default: {
                    baua.C(parcel0, v8);
                }
            }
        }
        baua.A(parcel0, v);
        return new SemanticSegment(v6, v7, v1, v2, s, v3, visit0, activity0, v4, v5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SemanticSegment[v];
    }
}

