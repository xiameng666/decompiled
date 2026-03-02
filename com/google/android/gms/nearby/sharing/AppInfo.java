package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dbvi;
import java.util.Arrays;
import java.util.Locale;

public class AppInfo extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final byte f;
    public final boolean g;

    static {
        AppInfo.CREATOR = new dbvi();
    }

    public AppInfo(String s, String s1, String s2, int v, int v1, byte b, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = v1;
        this.f = b;
        this.g = z;
    }

    public final AppInfo a() {
        try {
            return (AppInfo)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    @Override
    public final Object clone() {
        return this.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof AppInfo) && bata.b(this.a, ((AppInfo)object0).a) && bata.b(this.b, ((AppInfo)object0).b) && bata.b(this.c, ((AppInfo)object0).c)) {
            Integer integer0 = (int)((AppInfo)object0).d;
            return bata.b(Integer.valueOf(this.d), integer0) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((AppInfo)object0).e)) && bata.b(Byte.valueOf(this.f), Byte.valueOf(((AppInfo)object0).f)) && bata.b(Boolean.valueOf(this.g), integer0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, ((int)this.d), ((int)this.e), ((byte)this.f), Boolean.valueOf(this.g)});
    }

    @Override
    public final String toString() {
        String s3;
        String s = this.a;
        Locale locale0 = Locale.US;
        String s1 = this.b;
        String s2 = this.c;
        int v = this.d;
        switch(v) {
            case 0: {
                s3 = "UNKNOWN";
                break;
            }
            case 1: {
                s3 = "FAILED";
                break;
            }
            case 2: {
                s3 = "INSTALLED";
                break;
            }
            default: {
                s3 = v == 3 ? "INSTALLING" : "INVALID_STATUS";
            }
        }
        switch(this.e) {
            case 0: {
                return String.format(locale0, "AppInfo<packageName: %s, label: %s, iconPath: %s, installStatus: %s, evaluateResult: %s, containsByte: %s, isFinalInstallStatus: %s>", s, s1, s2, s3, "NOT_INSTALLABLE", ((byte)this.f), Boolean.valueOf(this.g));
            }
            case 1: {
                return String.format(locale0, "AppInfo<packageName: %s, label: %s, iconPath: %s, installStatus: %s, evaluateResult: %s, containsByte: %s, isFinalInstallStatus: %s>", s, s1, s2, s3, "INSTALLABLE", ((byte)this.f), Boolean.valueOf(this.g));
            }
            case 2: {
                return String.format(locale0, "AppInfo<packageName: %s, label: %s, iconPath: %s, installStatus: %s, evaluateResult: %s, containsByte: %s, isFinalInstallStatus: %s>", s, s1, s2, s3, "ALREADY_INSTALLED", ((byte)this.f), Boolean.valueOf(this.g));
            }
            default: {
                return String.format(locale0, "AppInfo<packageName: %s, label: %s, iconPath: %s, installStatus: %s, evaluateResult: %s, containsByte: %s, isFinalInstallStatus: %s>", s, s1, s2, s3, "INVALID_RESULT", ((byte)this.f), Boolean.valueOf(this.g));
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.h(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

