package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import cvxo;
import java.util.Arrays;
import java.util.Locale;

public final class ConnectionListeningOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Strategy a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public int[] g;
    public int[] h;
    public final int i;
    public AnalyticOptions j;

    static {
        ConnectionListeningOptions.CREATOR = new cvxo();
    }

    private ConnectionListeningOptions() {
        this.b = 0;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.i = 1;
    }

    public ConnectionListeningOptions(Strategy strategy0, int v, boolean z, boolean z1, boolean z2, boolean z3, int[] arr_v, int[] arr_v1, int v1, AnalyticOptions analyticOptions0) {
        this.a = strategy0;
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = arr_v;
        this.h = arr_v1;
        this.i = v1;
        this.j = analyticOptions0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ConnectionListeningOptions) && bata.b(this.a, ((ConnectionListeningOptions)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ConnectionListeningOptions)object0).b)) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((ConnectionListeningOptions)object0).c)) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((ConnectionListeningOptions)object0).d)) && bata.b(Boolean.valueOf(this.e), Boolean.valueOf(((ConnectionListeningOptions)object0).e)) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((ConnectionListeningOptions)object0).f)) && Arrays.equals(this.g, ((ConnectionListeningOptions)object0).g) && Arrays.equals(this.h, ((ConnectionListeningOptions)object0).h) && bata.b(Integer.valueOf(this.i), Integer.valueOf(((ConnectionListeningOptions)object0).i)) && bata.b(this.j, ((ConnectionListeningOptions)object0).j);
    }

    @Override
    public final int hashCode() {
        Strategy strategy0 = this.a;
        Integer integer0 = Arrays.hashCode(this.g);
        Integer integer1 = Arrays.hashCode(this.h);
        return Arrays.hashCode(new Object[]{strategy0, ((int)this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), integer0, integer1, ((int)this.i), this.j});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        Strategy strategy0 = this.a;
        String s = Arrays.toString(this.g);
        String s1 = Arrays.toString(this.h);
        return String.format(locale0, "ConnectionListeningOptions{strategy: %s, connectionType: %s, allowBluetoothRadioToggling: %s, allowWifiRadioToggling: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, upgradeMediums: %s, listeningMediums: %s, listeningEndpointType: %d, analyticOptions: %s}", strategy0, ((int)this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), s, s1, ((int)this.i), this.j);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.p(parcel0, 7, this.g, false);
        baub.p(parcel0, 8, this.h, false);
        baub.o(parcel0, 9, this.i);
        baub.t(parcel0, 10, this.j, v, false);
        baub.c(parcel0, v1);
    }
}

