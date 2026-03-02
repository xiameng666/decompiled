package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bndp;
import bndq;
import java.io.UnsupportedEncodingException;

@Deprecated
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator CREATOR;
    public final String d;

    static {
        ProtocolVersion.CREATOR = new bndp();
    }

    private ProtocolVersion(String s1) {
        this.d = s1;
    }

    public static ProtocolVersion a(byte[] arr_b) {
        try {
            return ProtocolVersion.b(new String(arr_b, "UTF-8"));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    public static ProtocolVersion b(String s) {
        if(s == null) {
            return ProtocolVersion.a;
        }
        ProtocolVersion[] arr_protocolVersion = ProtocolVersion.values();
        for(int v = 0; v < arr_protocolVersion.length; ++v) {
            ProtocolVersion protocolVersion0 = arr_protocolVersion[v];
            if(s.equals(protocolVersion0.d)) {
                return protocolVersion0;
            }
        }
        throw new bndq(s);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.d);
    }
}

