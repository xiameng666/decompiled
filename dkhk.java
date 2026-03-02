import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ocr.CreditCardOcrAnalyticsData;
import com.google.android.gms.ocr.CreditCardOcrResult;

public final class dkhk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        CreditCardOcrResult creditCardOcrResult0 = null;
        CreditCardOcrResult creditCardOcrResult1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    creditCardOcrResult0 = (CreditCardOcrResult)baua.m(parcel0, v2, CreditCardOcrResult.CREATOR);
                    break;
                }
                case 2: {
                    creditCardOcrResult1 = (CreditCardOcrResult)baua.m(parcel0, v2, CreditCardOcrResult.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreditCardOcrAnalyticsData(creditCardOcrResult0, creditCardOcrResult1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreditCardOcrAnalyticsData[v];
    }
}

