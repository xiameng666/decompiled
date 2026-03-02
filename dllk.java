import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ApiLoaderConfig;
import com.google.android.gms.pay.PresentationConfig;
import com.google.android.gms.pay.SortOrderInfo;
import com.google.android.gms.pay.WalletListConfig;

public final class dllk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ApiLoaderConfig[] arr_apiLoaderConfig = null;
        PresentationConfig presentationConfig0 = null;
        SortOrderInfo sortOrderInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_apiLoaderConfig = (ApiLoaderConfig[])baua.J(parcel0, v1, ApiLoaderConfig.CREATOR);
                    break;
                }
                case 2: {
                    presentationConfig0 = (PresentationConfig)baua.m(parcel0, v1, PresentationConfig.CREATOR);
                    break;
                }
                case 3: {
                    sortOrderInfo0 = (SortOrderInfo)baua.m(parcel0, v1, SortOrderInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new WalletListConfig(arr_apiLoaderConfig, presentationConfig0, sortOrderInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WalletListConfig[v];
    }
}

