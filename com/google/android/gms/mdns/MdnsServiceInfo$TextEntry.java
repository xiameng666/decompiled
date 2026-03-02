package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cquc;
import glwl;
import java.util.Arrays;

public final class MdnsServiceInfo.TextEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    private final byte[] b;

    static {
        MdnsServiceInfo.TextEntry.CREATOR = new cquc();
    }

    public MdnsServiceInfo.TextEntry(String s, String s1) {
        this(s, s1.getBytes(MdnsServiceInfo.b));
    }

    public MdnsServiceInfo.TextEntry(String s, byte[] arr_b) {
        this.a = s;
        this.b = (byte[])arr_b.clone();
    }

    public static MdnsServiceInfo.TextEntry a(byte[] arr_b) {
        if(arr_b.length != 0) {
            int v = glwl.a(arr_b, 61);
            if(v < 0) {
                return new MdnsServiceInfo.TextEntry(new String(arr_b, MdnsServiceInfo.a), "");
            }
            if(v != 0) {
                byte[] arr_b1 = Arrays.copyOf(arr_b, v);
                byte[] arr_b2 = Arrays.copyOfRange(arr_b, v + 1, arr_b.length);
                return new MdnsServiceInfo.TextEntry(new String(arr_b1, MdnsServiceInfo.a), arr_b2);
            }
        }
        return null;
    }

    public final byte[] b() {
        return (byte[])this.b.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MdnsServiceInfo.TextEntry) ? this.a.equals(((MdnsServiceInfo.TextEntry)object0).a) && Arrays.equals(this.b, ((MdnsServiceInfo.TextEntry)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return this.a.hashCode() * 0x1F + v;
    }

    @Override
    public final String toString() {
        return this.a + "=" + new String(this.b, MdnsServiceInfo.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b(), false);
        baub.c(parcel0, v1);
    }
}

