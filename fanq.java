import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.usonia.auth.internal.CertificateRequestInformation;
import com.google.android.gms.usonia.auth.internal.SignAppCertificateParams;

public final class fanq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CertificateRequestInformation certificateRequestInformation0 = null;
        String s = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    certificateRequestInformation0 = (CertificateRequestInformation)baua.m(parcel0, v1, CertificateRequestInformation.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SignAppCertificateParams(certificateRequestInformation0, s, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SignAppCertificateParams[v];
    }
}

