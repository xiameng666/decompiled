import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.InternalSetSchemaResponse;
import com.google.android.gms.appsearch.SetSchemaResponse;

public final class achm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SetSchemaResponse setSchemaResponse0 = null;
        boolean z = false;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    setSchemaResponse0 = (SetSchemaResponse)baua.m(parcel0, v1, SetSchemaResponse.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new InternalSetSchemaResponse(z, setSchemaResponse0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InternalSetSchemaResponse[v];
    }
}

