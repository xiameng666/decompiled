import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public final class fbxz implements Parcelable.Creator {
    public static void a(BuyFlowConfig buyFlowConfig0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, buyFlowConfig0.a, false);
        baub.t(parcel0, 3, buyFlowConfig0.b, v, false);
        baub.v(parcel0, 4, buyFlowConfig0.c, false);
        baub.v(parcel0, 5, buyFlowConfig0.d, false);
        baub.v(parcel0, 6, buyFlowConfig0.c(), false);
        baub.v(parcel0, 7, buyFlowConfig0.f, false);
        baub.o(parcel0, 8, buyFlowConfig0.g);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        String s = null;
        ApplicationParameters applicationParameters0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    applicationParameters0 = (ApplicationParameters)baua.m(parcel0, v2, ApplicationParameters.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new BuyFlowConfig(s, applicationParameters0, s1, s2, s3, s4, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BuyFlowConfig[v];
    }
}

