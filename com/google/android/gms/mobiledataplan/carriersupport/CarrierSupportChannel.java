package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crwj;
import java.util.ArrayList;
import java.util.Arrays;

public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    static {
        CarrierSupportChannel.CREATOR = new crwj();
    }

    public CarrierSupportChannel() {
    }

    public CarrierSupportChannel(String s, String s1, String s2, String s3, String s4, int v) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CarrierSupportChannel) && bata.b(this.a, ((CarrierSupportChannel)object0).a) && bata.b(this.b, ((CarrierSupportChannel)object0).b) && bata.b(this.c, ((CarrierSupportChannel)object0).c) && bata.b(this.d, ((CarrierSupportChannel)object0).d) && bata.b(this.e, ((CarrierSupportChannel)object0).e) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((CarrierSupportChannel)object0).f));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, ((int)this.f)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("Title", this.a, arrayList0);
        basz.b("SubTitle", this.b, arrayList0);
        basz.b("Target", this.c, arrayList0);
        basz.b("DefaultMessageSubject", this.d, arrayList0);
        basz.b("DefaultMessageBody", this.e, arrayList0);
        basz.b("Type", Integer.valueOf(this.f), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

