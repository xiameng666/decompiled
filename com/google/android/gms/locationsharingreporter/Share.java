package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import coci;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class Share extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Counterpart b;
    public final int c;
    public final OutgoingShareDetails d;

    static {
        Share.CREATOR = new coci();
    }

    public Share(String s, Counterpart counterpart0, int v, OutgoingShareDetails outgoingShareDetails0) {
        this.a = s;
        this.b = counterpart0;
        this.c = v;
        this.d = outgoingShareDetails0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof Share) && Objects.equals(this.a, ((Share)object0).a) && Objects.equals(this.b, ((Share)object0).b) && this.c == ((Share)object0).c && Objects.equals(this.d, ((Share)object0).d);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, ((int)this.c), this.d});
    }

    @Override
    public final String toString() {
        return "Share [shareId=\'" + this.a + ", counterpart=" + this.b + ", shareDirection=" + this.c + ", outgoingShareDetails=" + this.d + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

