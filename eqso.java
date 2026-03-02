import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import java.util.ArrayList;

public final class eqso implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        AccountPickerOptions accountPickerOptions0 = null;
        String s5 = null;
        String s6 = null;
        AuthenticatingUser authenticatingUser0 = null;
        ArrayList arrayList0 = null;
        UiCustomization uiCustomization0 = null;
        boolean z = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    accountPickerOptions0 = (AccountPickerOptions)baua.m(parcel0, v2, AccountPickerOptions.CREATOR);
                    break;
                }
                case 8: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    s6 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    authenticatingUser0 = (AuthenticatingUser)baua.m(parcel0, v2, AuthenticatingUser.CREATOR);
                    break;
                }
                case 11: {
                    arrayList0 = baua.y(parcel0, v2, BootstrapAccount.CREATOR);
                    break;
                }
                case 12: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 13: {
                    uiCustomization0 = (UiCustomization)baua.m(parcel0, v2, UiCustomization.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DirectTransferConfigurations(s, s1, s2, s3, s4, z, accountPickerOptions0, s5, s6, authenticatingUser0, arrayList0, v1, uiCustomization0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DirectTransferConfigurations[v];
    }
}

