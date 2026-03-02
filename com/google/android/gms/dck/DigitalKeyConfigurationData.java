package com.google.android.gms.dck;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import bhcd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..time.LocalDateTime;

public class DigitalKeyConfigurationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final DigitalKeyAccessProfile a;
    public final String b;
    public final short c;
    private final LocalDateTime d;
    private final LocalDateTime e;

    static {
        DigitalKeyConfigurationData.CREATOR = new bhcd();
    }

    public DigitalKeyConfigurationData(DigitalKeyAccessProfile digitalKeyAccessProfile0, String s, String s1, String s2, short v) {
        this.a = digitalKeyAccessProfile0;
        this.b = s;
        this.d = LocalDateTime.parse(s1);
        this.e = LocalDateTime.parse(s2);
        this.c = v;
    }

    @Override
    public final String toString() {
        return TextUtils.join("\n", new String[]{"DigitalKeyAccessProfile:", this.a.toString().replaceAll("(?m)^", "  "), "FriendlyName: " + this.b, "NotAfterTime: " + this.d, "NotBeforeTime: " + this.e, "AccountRole: " + Integer.toHexString(((char)this.c))});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.d.toString(), false);
        baub.v(parcel0, 4, this.e.toString(), false);
        baub.u(parcel0, 5, this.c);
        baub.c(parcel0, v1);
    }
}

