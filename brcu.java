import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;

public final class brcu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        IBinder iBinder0 = null;
        PendingIntent pendingIntent0 = null;
        IBinder iBinder1 = null;
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        long v4 = 0L;
        int v5 = 0;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    dataSource0 = (DataSource)baua.m(parcel0, v6, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)baua.m(parcel0, v6, DataType.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v6);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v6);
                    break;
                }
                case 7: {
                    v2 = baua.i(parcel0, v6);
                    break;
                }
                case 8: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v6, PendingIntent.CREATOR);
                    break;
                }
                case 9: {
                    v3 = baua.i(parcel0, v6);
                    break;
                }
                case 10: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 12: {
                    v4 = baua.i(parcel0, v6);
                    break;
                }
                case 13: {
                    iBinder1 = baua.k(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new SensorRegistrationRequest(dataSource0, dataType0, iBinder0, v1, v2, pendingIntent0, v3, v5, v4, iBinder1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SensorRegistrationRequest[v];
    }
}

