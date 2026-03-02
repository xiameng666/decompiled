import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;

public final class ejuj implements Parcelable.Creator {
    public static void a(ExternalApplicationLinkEntity externalApplicationLinkEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.F(parcel0, 2, externalApplicationLinkEntity0.a);
        baub.v(parcel0, 3, externalApplicationLinkEntity0.b, false);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Integer integer0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    integer0 = baua.q(parcel0, v1);
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
        return new ExternalApplicationLinkEntity(integer0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExternalApplicationLinkEntity[v];
    }
}

