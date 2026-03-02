import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;

public final class broi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        PendingIntent pendingIntent0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    dataSource0 = (DataSource)baua.m(parcel0, v1, DataSource.CREATOR);
                    break;
                }
                case 4: {
                    dataType0 = (DataType)baua.m(parcel0, v1, DataType.CREATOR);
                    break;
                }
                case 5: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataUpdateListener(s, s1, dataSource0, dataType0, pendingIntent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataUpdateListener[v];
    }
}

