import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.List;

public final class fxuj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        Conditions conditions0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    list0 = baua.y(parcel0, v1, AccountConfig.CREATOR);
                    break;
                }
                case 3: {
                    conditions0 = (Conditions)baua.m(parcel0, v1, Conditions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReportingConfig(list0, conditions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReportingConfig[v];
    }
}

