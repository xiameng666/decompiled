import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import java.util.List;

public final class cizv implements Parcelable.Creator {
    public static void a(GoogleSettingsItem googleSettingsItem0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, googleSettingsItem0.a, v, false);
        baub.o(parcel0, 3, googleSettingsItem0.b);
        baub.v(parcel0, 4, googleSettingsItem0.c, false);
        baub.o(parcel0, 6, googleSettingsItem0.d);
        baub.e(parcel0, 7, googleSettingsItem0.e);
        baub.e(parcel0, 8, googleSettingsItem0.f);
        baub.e(parcel0, 9, googleSettingsItem0.g);
        baub.v(parcel0, 10, googleSettingsItem0.h, false);
        baub.e(parcel0, 11, googleSettingsItem0.i);
        baub.e(parcel0, 12, googleSettingsItem0.j);
        baub.x(parcel0, 13, googleSettingsItem0.k, false);
        baub.e(parcel0, 14, googleSettingsItem0.l);
        baub.v(parcel0, 15, googleSettingsItem0.m, false);
        baub.o(parcel0, 16, googleSettingsItem0.n);
        baub.o(parcel0, 18, googleSettingsItem0.o);
        baub.v(parcel0, 19, googleSettingsItem0.p, false);
        baub.v(parcel0, 20, googleSettingsItem0.q, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Intent intent0 = null;
        String s = null;
        String s1 = null;
        List list0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int v3 = 0;
        int v4 = 0;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    intent0 = (Intent)baua.m(parcel0, v5, Intent.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 9: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 10: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 11: {
                    z3 = baua.D(parcel0, v5);
                    break;
                }
                case 12: {
                    z4 = baua.D(parcel0, v5);
                    break;
                }
                case 13: {
                    list0 = baua.x(parcel0, v5);
                    break;
                }
                case 14: {
                    z5 = baua.D(parcel0, v5);
                    break;
                }
                case 15: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 16: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 18: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 19: {
                    s3 = baua.s(parcel0, v5);
                    break;
                }
                case 20: {
                    s4 = baua.s(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new GoogleSettingsItem(intent0, v1, s, v2, z, z1, z2, s1, z3, z4, list0, z5, s2, v3, v4, s3, s4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleSettingsItem[v];
    }
}

