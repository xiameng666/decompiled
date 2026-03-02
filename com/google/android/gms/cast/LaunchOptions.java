package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import atsw;
import aurf;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public String b;
    public boolean c;
    public CredentialsData d;

    static {
        LaunchOptions.CREATOR = new atsw();
    }

    public LaunchOptions() {
        this(false, aurf.i(Locale.getDefault()), false, null);
    }

    public LaunchOptions(boolean z, String s, boolean z1, CredentialsData credentialsData0) {
        this.a = z;
        this.b = s;
        this.c = z1;
        this.d = credentialsData0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof LaunchOptions) ? this.a == ((LaunchOptions)object0).a && aurf.u(this.b, ((LaunchOptions)object0).b) && this.c == ((LaunchOptions)object0).c && aurf.u(this.d, ((LaunchOptions)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override
    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.e(parcel0, 4, this.c);
        baub.t(parcel0, 5, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

