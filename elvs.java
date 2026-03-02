import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.ActivityStatistics;
import com.google.android.gms.semanticlocation.Date;
import com.google.android.gms.semanticlocation.PeriodSummary;
import com.google.android.gms.semanticlocation.Visit;
import java.util.List;

public final class elvs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        Date date0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.y(parcel0, v1, Visit.CREATOR);
                    break;
                }
                case 2: {
                    list1 = baua.y(parcel0, v1, ActivityStatistics.CREATOR);
                    break;
                }
                case 3: {
                    date0 = (Date)baua.m(parcel0, v1, Date.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PeriodSummary(list0, list1, date0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PeriodSummary[v];
    }
}

