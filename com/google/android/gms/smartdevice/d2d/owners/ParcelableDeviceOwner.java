package com.google.android.gms.smartdevice.d2d.owners;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import eqnx;
import fntm;
import gftb;
import j..util.Objects;

public class ParcelableDeviceOwner implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Bitmap e;
    public boolean f;

    static {
        ParcelableDeviceOwner.CREATOR = new eqnx();
    }

    public ParcelableDeviceOwner(Parcel parcel0) {
        boolean z = true;
        this.f = true;
        String s = parcel0.readString();
        gftb.check(s);
        this.a = s;
        this.b = parcel0.readString();
        this.c = parcel0.readString();
        this.d = parcel0.readString();
        this.e = (Bitmap)parcel0.readParcelable(Bitmap.class.getClassLoader());
        if(parcel0.readInt() != 1) {
            z = false;
        }
        this.f = z;
    }

    public ParcelableDeviceOwner(fntm fntm0, Bitmap bitmap0) {
        this.f = true;
        this.a = fntm0.c;
        this.b = fntm0.b;
        this.c = fntm0.d;
        this.d = fntm0.e;
        this.e = bitmap0;
    }

    public final BootstrapAccount a() {
        return new BootstrapAccount(this.a, "com.google");
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParcelableDeviceOwner)) {
            return false;
        }
        if(Objects.equals(this.a, ((ParcelableDeviceOwner)object0).a) && Objects.equals(this.b, ((ParcelableDeviceOwner)object0).b) && Objects.equals(this.c, ((ParcelableDeviceOwner)object0).c) && Objects.equals(this.d, ((ParcelableDeviceOwner)object0).d) && this.f == ((ParcelableDeviceOwner)object0).f) {
            Bitmap bitmap0 = this.e;
            if(bitmap0 != null) {
                Bitmap bitmap1 = ((ParcelableDeviceOwner)object0).e;
                return bitmap1 == null ? this.e == ((ParcelableDeviceOwner)object0).e : bitmap0.sameAs(bitmap1);
            }
        }
        return this.e == ((ParcelableDeviceOwner)object0).e;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeParcelable(this.e, v);
        parcel0.writeInt(((int)this.f));
    }
}

