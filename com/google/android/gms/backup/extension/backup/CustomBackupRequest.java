package com.google.android.gms.backup.extension.backup;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import arsl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public final class CustomBackupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    @Deprecated
    public final int b;
    public final boolean c;

    static {
        CustomBackupRequest.CREATOR = new arsl();
    }

    public CustomBackupRequest(int v, boolean z) {
        this.a = v;
        this.b = v;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof CustomBackupRequest) && this.a == ((CustomBackupRequest)object0).a && this.c == ((CustomBackupRequest)object0).c;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), Boolean.valueOf(this.c)});
    }

    @Override
    public final String toString() {
        return "CustomBackupRequest{networkPreference=" + this.a + ", userRequested=" + this.c + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

