package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import dahn;
import daiu;
import java.util.Arrays;

public class ClientAppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ClientAppIdentifier a;
    public final ClientAppContext b;
    public final String c;
    public int d;

    static {
        ClientAppIdentifier.CREATOR = new dahn();
        ClientAppIdentifier.a = new ClientAppIdentifier(new ClientAppContext("com.google.android.gms", "0p:com.google.android.gms"), "com.google.android.gms");
    }

    public ClientAppIdentifier(ClientAppContext clientAppContext0, String s) {
        this(clientAppContext0, s, 0);
    }

    public ClientAppIdentifier(ClientAppContext clientAppContext0, String s, int v) {
        this.b = clientAppContext0;
        this.c = s;
        this.d = v;
    }

    public final String a() {
        return this.e() ? this.b.c : this.b.b;
    }

    public final String b() {
        return this.e() ? "com.google.android.gms" : this.b.b;
    }

    public final boolean c(int v) {
        return (this.d & v) != 0;
    }

    public final boolean d() {
        return this.e() ? daiu.b(this.b.c) : daiu.b(this.c);
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.b.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClientAppIdentifier)) {
            return false;
        }
        ClientAppContext clientAppContext0 = ((ClientAppIdentifier)object0).b;
        return ClientAppIdentifier.g(this.b.b, clientAppContext0.b) && ClientAppIdentifier.g(this.b.c, clientAppContext0.c) && this.b.d == clientAppContext0.d && this.b.e == clientAppContext0.e;
    }

    public final boolean f() {
        ClientAppContext clientAppContext0 = this.b;
        if(clientAppContext0 != null) {
            return clientAppContext0.c == null ? false : clientAppContext0.c.equals("0p:discoverer");
        }
        return false;
    }

    private static boolean g(String s, String s1) {
        return TextUtils.isEmpty(s) ? TextUtils.isEmpty(s1) : s.equals(s1);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b.b, this.b.c, Boolean.valueOf(this.b.d), ((int)this.b.e)});
    }

    @Override
    public final String toString() {
        return this.e() ? this.b.b + "#" + this.b.c + "#" + this.b.d : this.b.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

