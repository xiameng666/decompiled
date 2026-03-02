package com.google.android.gms.auth.api.fido;

import ByteString;
import ahlt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class BrowserOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final ByteString b;
    public final ChromeOptions c;

    static {
        BrowserOptions.CREATOR = new ahlt();
    }

    public BrowserOptions(String s, ByteString hfsf0, ChromeOptions chromeOptions0) {
        batl.s(s);
        this.a = s;
        this.b = hfsf0;
        this.c = chromeOptions0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BrowserOptions) ? bata.b(this.a, ((BrowserOptions)object0).a) && bata.b(this.b, ((BrowserOptions)object0).b) && bata.b(this.c, ((BrowserOptions)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.i(parcel0, 3, (this.b == null ? null : this.b.toByteArray()), false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

