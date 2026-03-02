import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

public final class brdh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        brai brai0 = null;
        IBinder iBinder0 = null;
        DataType dataType0 = null;
        DataSource dataSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    dataType0 = (DataType)baua.m(parcel0, v1, DataType.CREATOR);
                    break;
                }
                case 2: {
                    dataSource0 = (DataSource)baua.m(parcel0, v1, DataSource.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        if(iBinder0 != null) {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            if((iInterface0 instanceof brai)) {
                return new UnsubscribeRequest(dataType0, dataSource0, ((brai)iInterface0));
            }
            brai0 = new brag(iBinder0);
        }
        return new UnsubscribeRequest(dataType0, dataSource0, brai0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UnsubscribeRequest[v];
    }
}

