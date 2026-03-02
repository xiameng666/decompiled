import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import java.util.ArrayList;
import java.util.HashSet;

public final class epxj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = null;
        Bundle bundle0 = null;
        DeviceDetails deviceDetails0 = null;
        AccountPickerOptions accountPickerOptions0 = null;
        AuthenticatingUser authenticatingUser0 = null;
        UiCustomization uiCustomization0 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        long v2 = 0L;
        long v3 = 0L;
        String s = null;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    String s3 = baua.s(parcel0, v4);
                    hashSet0.add(Integer.valueOf(2));
                    s = s3;
                    break;
                }
                case 3: {
                    String s4 = baua.s(parcel0, v4);
                    hashSet0.add(Integer.valueOf(3));
                    s = s;
                    s1 = s4;
                    break;
                }
                case 4: {
                    String s5 = baua.s(parcel0, v4);
                    hashSet0.add(Integer.valueOf(4));
                    s = s;
                    s2 = s5;
                    break;
                }
                case 5: {
                    boolean z8 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(5));
                    s = s;
                    z = z8;
                    break;
                }
                case 6: {
                    ArrayList arrayList1 = baua.y(parcel0, v4, BootstrapAccount.CREATOR);
                    hashSet0.add(Integer.valueOf(6));
                    s = s;
                    arrayList0 = arrayList1;
                    break;
                }
                case 7: {
                    Bundle bundle1 = baua.j(parcel0, v4);
                    hashSet0.add(Integer.valueOf(7));
                    s = s;
                    bundle0 = bundle1;
                    break;
                }
                case 8: {
                    boolean z9 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(8));
                    s = s;
                    z1 = z9;
                    break;
                }
                case 9: {
                    boolean z10 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(9));
                    s = s;
                    z2 = z10;
                    break;
                }
                case 10: {
                    int v5 = baua.f(parcel0, v4);
                    hashSet0.add(Integer.valueOf(10));
                    s = s;
                    v1 = v5;
                    break;
                }
                case 11: {
                    v2 = baua.i(parcel0, v4);
                    hashSet0.add(Integer.valueOf(11));
                    break;
                }
                case 12: {
                    v3 = baua.i(parcel0, v4);
                    hashSet0.add(Integer.valueOf(12));
                    break;
                }
                case 13: {
                    DeviceDetails deviceDetails1 = (DeviceDetails)baua.m(parcel0, v4, DeviceDetails.CREATOR);
                    hashSet0.add(Integer.valueOf(13));
                    s = s;
                    deviceDetails0 = deviceDetails1;
                    break;
                }
                case 14: {
                    boolean z11 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(14));
                    s = s;
                    z3 = z11;
                    break;
                }
                case 15: {
                    boolean z12 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(15));
                    s = s;
                    z4 = z12;
                    break;
                }
                case 16: {
                    boolean z13 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(16));
                    s = s;
                    z5 = z13;
                    break;
                }
                case 17: {
                    boolean z14 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(17));
                    s = s;
                    z6 = z14;
                    break;
                }
                case 18: {
                    AccountPickerOptions accountPickerOptions1 = (AccountPickerOptions)baua.m(parcel0, v4, AccountPickerOptions.CREATOR);
                    hashSet0.add(Integer.valueOf(18));
                    s = s;
                    accountPickerOptions0 = accountPickerOptions1;
                    break;
                }
                case 19: {
                    AuthenticatingUser authenticatingUser1 = (AuthenticatingUser)baua.m(parcel0, v4, AuthenticatingUser.CREATOR);
                    hashSet0.add(Integer.valueOf(19));
                    s = s;
                    authenticatingUser0 = authenticatingUser1;
                    break;
                }
                case 20: {
                    boolean z15 = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(20));
                    s = s;
                    z7 = z15;
                    break;
                }
                case 21: {
                    UiCustomization uiCustomization1 = (UiCustomization)baua.m(parcel0, v4, UiCustomization.CREATOR);
                    hashSet0.add(Integer.valueOf(21));
                    s = s;
                    uiCustomization0 = uiCustomization1;
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new BootstrapConfigurations(hashSet0, s, s1, s2, z, arrayList0, bundle0, z1, z2, v1, v2, v3, deviceDetails0, z3, z4, z5, z6, accountPickerOptions0, authenticatingUser0, z7, uiCustomization0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BootstrapConfigurations[v];
    }
}

