import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.AnnotateCall.Response;
import com.google.android.gms.search.queries.Annotation;
import java.util.List;

public final class elek implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        List list0 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, Annotation.CREATOR);
                    break;
                }
                case 3: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AnnotateCall.Response(status0, list0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AnnotateCall.Response[v];
    }
}

