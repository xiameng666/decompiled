import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl.Inclusion;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;

public final class bcve implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        QueryFilterParameters queryFilterParameters0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arrayList0 = baua.y(parcel0, v1, ContextDataFilterImpl.Inclusion.CREATOR);
                    break;
                }
                case 3: {
                    arrayList1 = baua.x(parcel0, v1);
                    break;
                }
                case 4: {
                    queryFilterParameters0 = (QueryFilterParameters)baua.m(parcel0, v1, QueryFilterParameters.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContextDataFilterImpl(arrayList0, arrayList1, queryFilterParameters0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContextDataFilterImpl[v];
    }
}

