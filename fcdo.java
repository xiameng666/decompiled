import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public final class fcdo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int v1 = 0;
        boolean z = false;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        TimeInterval timeInterval0 = null;
        String s8 = null;
        String s9 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    s6 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    s7 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 11: {
                    arrayList0 = baua.y(parcel0, v2, WalletObjectMessage.CREATOR);
                    break;
                }
                case 12: {
                    timeInterval0 = (TimeInterval)baua.m(parcel0, v2, TimeInterval.CREATOR);
                    break;
                }
                case 13: {
                    arrayList1 = baua.y(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 14: {
                    s8 = baua.s(parcel0, v2);
                    break;
                }
                case 15: {
                    s9 = baua.s(parcel0, v2);
                    break;
                }
                case 16: {
                    arrayList2 = baua.y(parcel0, v2, LabelValueRow.CREATOR);
                    break;
                }
                case 17: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 18: {
                    arrayList3 = baua.y(parcel0, v2, UriData.CREATOR);
                    break;
                }
                case 19: {
                    arrayList4 = baua.y(parcel0, v2, TextModuleData.CREATOR);
                    break;
                }
                case 20: {
                    arrayList5 = baua.y(parcel0, v2, UriData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new CommonWalletObject(s, s1, s2, s3, s4, s5, s6, s7, v1, arrayList0, timeInterval0, arrayList1, s8, s9, arrayList2, z, arrayList3, arrayList4, arrayList5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CommonWalletObject[v];
    }
}

