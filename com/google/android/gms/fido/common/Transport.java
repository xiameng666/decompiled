package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import blyd;
import blye;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator CREATOR;
    public final String h;

    static {
        Transport.CREATOR = new blyd();
    }

    private Transport(String s1) {
        this.h = s1;
    }

    public static Transport a(String s) {
        Transport[] arr_transport = Transport.values();
        for(int v = 0; v < arr_transport.length; ++v) {
            Transport transport0 = arr_transport[v];
            if(s.equals(transport0.h)) {
                return transport0;
            }
        }
        throw new blye(String.format("Transport %s not supported", s));
    }

    public static List b(JSONArray jSONArray0) {
        if(jSONArray0 == null) {
            return null;
        }
        HashSet hashSet0 = new HashSet(jSONArray0.length());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            String s = jSONArray0.getString(v);
            if(s != null && !s.isEmpty()) {
                try {
                    hashSet0.add(Transport.a(s));
                }
                catch(blye unused_ex) {
                    Log.w("Transport", "Ignoring unrecognized transport " + s);
                }
            }
        }
        return new ArrayList(hashSet0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.h;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.h);
    }
}

