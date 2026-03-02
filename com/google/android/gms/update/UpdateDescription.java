package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezvr;
import java.util.ArrayList;
import java.util.Arrays;

public class UpdateDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        UpdateDescription.CREATOR = new ezvr();
    }

    public UpdateDescription(String s, String s1, String s2, String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof UpdateDescription) ? ((UpdateDescription)object0).a.equals(this.a) && ((UpdateDescription)object0).b.equals(this.b) && ((UpdateDescription)object0).c.equals(this.c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("title", this.a, arrayList0);
        basz.b("description", this.b, arrayList0);
        basz.b("size", this.c, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

