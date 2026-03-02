import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dck.DigitalKeyAccessProfile;
import com.google.android.gms.dck.DigitalKeyData;
import com.google.android.gms.dck.DigitalKeySupportedEntitlements;
import j..time.LocalDateTime;
import java.util.List;

public final class bhce implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CharSequence charSequence0 = null;
        gged_interceptors gged0 = DigitalKeyData.a;
        gged_interceptors gged1 = ggna.a;
        CharSequence charSequence1 = null;
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        DigitalKeyAccessProfile digitalKeyAccessProfile0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        String s10 = null;
        String s11 = null;
        List list0 = null;
        List list1 = null;
        DigitalKeySupportedEntitlements digitalKeySupportedEntitlements0 = null;
        Boolean boolean0 = null;
        String s12 = null;
        String s13 = null;
        String s14 = null;
        int v1 = -1;
        boolean z = false;
        boolean z1 = false;
        int v2 = 0;
        int v3 = 0;
        boolean z2 = false;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v5);
                    break;
                }
                case 4: {
                    digitalKeyAccessProfile0 = (DigitalKeyAccessProfile)baua.m(parcel0, v5, DigitalKeyAccessProfile.CREATOR);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 6: {
                    charSequence0 = baua.s(parcel0, v5);
                    break;
                }
                case 7: {
                    charSequence1 = baua.s(parcel0, v5);
                    break;
                }
                case 8: {
                    s3 = baua.s(parcel0, v5);
                    break;
                }
                case 9: {
                    s4 = baua.s(parcel0, v5);
                    break;
                }
                case 10: {
                    s5 = baua.s(parcel0, v5);
                    break;
                }
                case 11: {
                    s6 = baua.s(parcel0, v5);
                    break;
                }
                case 12: {
                    s7 = baua.s(parcel0, v5);
                    break;
                }
                case 13: {
                    s8 = baua.s(parcel0, v5);
                    break;
                }
                case 14: {
                    s9 = baua.s(parcel0, v5);
                    break;
                }
                case 15: {
                    s10 = baua.s(parcel0, v5);
                    break;
                }
                case 16: {
                    s11 = baua.s(parcel0, v5);
                    break;
                }
                case 17: {
                    gged0 = baua.v(parcel0, v5);
                    break;
                }
                case 18: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 19: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 20: {
                    list0 = baua.x(parcel0, v5);
                    break;
                }
                case 21: {
                    list1 = baua.x(parcel0, v5);
                    break;
                }
                case 22: {
                    digitalKeySupportedEntitlements0 = (DigitalKeySupportedEntitlements)baua.m(parcel0, v5, DigitalKeySupportedEntitlements.CREATOR);
                    break;
                }
                case 23: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 24: {
                    boolean0 = baua.n(parcel0, v5);
                    break;
                }
                case 25: {
                    s12 = baua.s(parcel0, v5);
                    break;
                }
                case 26: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 27: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 28: {
                    s13 = baua.s(parcel0, v5);
                    break;
                }
                case 29: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 30: {
                    v1 = baua.z(parcel0, v5);
                    break;
                }
                case 0x1F: {
                    s14 = baua.s(parcel0, v5);
                    break;
                }
                case 0x20: {
                    gged1 = baua.x(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new DigitalKeyData(s, s1, arr_s, digitalKeyAccessProfile0, s2, LocalDateTime.parse(charSequence0), LocalDateTime.parse(charSequence1), s3, s4, s5, s6, s7, s8, s9, s10, s11, gged0, z, v4, list0, list1, digitalKeySupportedEntitlements0, z1, boolean0, s12, v2, v3, s13, z2, ((short)v1), s14, gged1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DigitalKeyData[v];
    }
}

