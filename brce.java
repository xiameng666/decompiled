import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;

public final class brce implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        PendingIntent pendingIntent0 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v1, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)baua.m(parcel0, v1, DataType.CREATOR);
                    break;
                }
                case 3: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataUpdateListenerRegistrationRequest(dataSource0, dataType0, pendingIntent0, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataUpdateListenerRegistrationRequest[v];
    }
}

