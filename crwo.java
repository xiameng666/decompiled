import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;

public final class crwo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SafeHtml safeHtml0 = null;
        SafeHtml[] arr_safeHtml = null;
        SafeHtml[] arr_safeHtml1 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    safeHtml0 = (SafeHtml)baua.m(parcel0, v2, SafeHtml.CREATOR);
                    break;
                }
                case 2: {
                    arr_safeHtml = (SafeHtml[])baua.J(parcel0, v2, SafeHtml.CREATOR);
                    break;
                }
                case 3: {
                    arr_safeHtml1 = (SafeHtml[])baua.J(parcel0, v2, SafeHtml.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 8: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConsentAgreementText(safeHtml0, arr_safeHtml, arr_safeHtml1, s, s1, s2, v1, s3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConsentAgreementText[v];
    }
}

