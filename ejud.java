import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import java.util.List;

public final class ejud implements Parcelable.Creator {
    public static void a(CategoryInfoEntity categoryInfoEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.v(parcel0, 2, categoryInfoEntity0.a, false);
        baub.v(parcel0, 3, categoryInfoEntity0.b, false);
        baub.x(parcel0, 4, categoryInfoEntity0.c, false);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        List list0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    list0 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CategoryInfoEntity(s, list0, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CategoryInfoEntity[v];
    }
}

