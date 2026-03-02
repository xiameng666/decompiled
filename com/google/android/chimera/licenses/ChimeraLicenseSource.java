package com.google.android.chimera.licenses;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import gftb;
import j..util.Objects;
import xju;
import xjv;

@ChimeraApiVersion(added = 0x71L)
public final class ChimeraLicenseSource implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String a;
    private final String b;

    static {
        ChimeraLicenseSource.CREATOR = new xju();
    }

    public ChimeraLicenseSource(Parcel parcel0, xjv xjv0) {
        String s = parcel0.readString();
        gftb.check(s);
        this.a = s;
        String s1 = parcel0.readString();
        gftb.check(s1);
        this.b = s1;
    }

    public ChimeraLicenseSource(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof ChimeraLicenseSource) ? Objects.equals(this.a, ((ChimeraLicenseSource)object0).a) && Objects.equals(this.b, ((ChimeraLicenseSource)object0).b) : false;
    }

    public String getDisplayName() {
        return this.b;
    }

    public String getKey() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public String toString() {
        return this.b + " [" + this.a + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
    }
}

