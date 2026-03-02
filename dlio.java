import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusResponse;
import com.google.android.gms.pay.SeReadinessCheckError;
import com.google.android.gms.pay.SeReadinessCheckResponse;

public final class dlio implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse0 = null;
        SeReadinessCheckError seReadinessCheckError0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    getSeFeatureReadinessStatusResponse0 = (GetSeFeatureReadinessStatusResponse)baua.m(parcel0, v1, GetSeFeatureReadinessStatusResponse.CREATOR);
                    break;
                }
                case 2: {
                    seReadinessCheckError0 = (SeReadinessCheckError)baua.m(parcel0, v1, SeReadinessCheckError.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SeReadinessCheckResponse(getSeFeatureReadinessStatusResponse0, seReadinessCheckError0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SeReadinessCheckResponse[v];
    }
}

