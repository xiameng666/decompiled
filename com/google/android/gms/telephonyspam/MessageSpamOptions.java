package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evrl;
import java.util.List;

public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final long c;
    public final List d;

    static {
        MessageSpamOptions.CREATOR = new evrl();
    }

    public MessageSpamOptions(int v, String s, long v1, List list0) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.y(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

