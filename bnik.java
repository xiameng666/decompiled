import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.GetHistoricalAccountKeysResponse;
import com.google.android.gms.findmydevice.spot.HistoricalAccountKeyInformation;

public final class bnik implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HistoricalAccountKeyInformation[] arr_historicalAccountKeyInformation = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_historicalAccountKeyInformation = (HistoricalAccountKeyInformation[])baua.J(parcel0, v1, HistoricalAccountKeyInformation.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetHistoricalAccountKeysResponse(arr_historicalAccountKeyInformation);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetHistoricalAccountKeysResponse[v];
    }
}

