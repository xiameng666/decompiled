package com.google.location.nearby.common.fastpair.slice;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gxyc;
import gzex;
import j..util.Objects;
import java.util.Arrays;

public abstract class DeviceDetailsLinks implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        DeviceDetailsLinks.CREATOR = new gxyc();
    }

    public abstract gzex a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DeviceDetailsLinks) ? Arrays.equals(this.k(), ((DeviceDetailsLinks)object0).k()) && Objects.equals(this.b(), ((DeviceDetailsLinks)object0).b()) && this.g() == ((DeviceDetailsLinks)object0).g() && Objects.equals(this.c(), ((DeviceDetailsLinks)object0).c()) && Objects.equals(this.d(), ((DeviceDetailsLinks)object0).d()) && this.i() == ((DeviceDetailsLinks)object0).i() && this.e().equals(((DeviceDetailsLinks)object0).e()) && this.f().equals(((DeviceDetailsLinks)object0).f()) && this.j() == ((DeviceDetailsLinks)object0).j() && this.a().equals(((DeviceDetailsLinks)object0).a()) && this.h() == ((DeviceDetailsLinks)object0).h() : false;
    }

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.k(), this.b(), Boolean.valueOf(this.g()), this.c(), this.d(), Boolean.valueOf(this.i()), this.e(), this.f(), Boolean.valueOf(this.j()), this.a().a(), Boolean.valueOf(this.h())});
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract byte[] k();

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        byte[] arr_b = this.k();
        parcel0.writeInt(arr_b.length);
        parcel0.writeByteArray(arr_b);
        parcel0.writeString(this.b());
        parcel0.writeByte(((byte)this.g()));
        parcel0.writeString(this.c());
        parcel0.writeString(this.d());
        parcel0.writeByte(((byte)this.i()));
        parcel0.writeString(this.e());
        parcel0.writeString(this.f());
        parcel0.writeByte(((byte)this.j()));
        parcel0.writeInt(this.a().a());
        parcel0.writeByte(((byte)this.h()));
    }
}

