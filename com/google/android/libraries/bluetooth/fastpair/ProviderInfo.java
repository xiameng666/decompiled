package com.google.android.libraries.bluetooth.fastpair;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fgom;
import fgsj;
import j..util.Objects;
import java.util.Arrays;

public class ProviderInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final int c;

    static {
        ProviderInfo.CREATOR = new fgom();
    }

    public ProviderInfo() {
        this(fgsj.a.name(), new byte[0], 0);
    }

    public ProviderInfo(String s, byte[] arr_b, int v) {
        this.a = s;
        this.b = arr_b;
        this.c = v;
    }

    public final fgsj a() {
        return fgsj.a(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ProviderInfo) && this.c == ((ProviderInfo)object0).c && Arrays.equals(this.b, ((ProviderInfo)object0).b) && this.a.equals(((ProviderInfo)object0).a);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.b);
        return Objects.hash(new Object[]{this.a, integer0, ((int)this.c)});
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.b);
        return "ProviderInfo{spotProvisioningStateName=\'" + this.a + "\', spotAccountKey=" + s + ", deviceFeatures=" + this.c + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

