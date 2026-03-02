package com.google.android.libraries.bluetooth.fastpair.fmd;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fgsh;
import fgsk;
import j..util.Objects;
import java.util.Arrays;

public abstract class FmdRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        FmdRequest.CREATOR = new fgsk();
    }

    public abstract int a();

    public abstract fgsh b();

    public abstract String c();

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        return (object0 instanceof FmdRequest) ? Objects.equals(this.c(), ((FmdRequest)object0).c()) && this.a() == ((FmdRequest)object0).a() && Objects.equals(this.b(), ((FmdRequest)object0).b()) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c(), this.a(), this.b()});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.c());
        parcel0.writeInt(this.a());
        parcel0.writeString(this.b().name());
    }
}

