package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbmu;
import blyh;
import bndo;
import bndq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@Deprecated
public class KeyHandle extends AbstractSafeParcelable implements blyh {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    static {
        KeyHandle.CREATOR = new bndo();
    }

    public KeyHandle(int v, byte[] arr_b, String s, List list0) {
        this.a = v;
        this.b = arr_b;
        try {
            this.c = ProtocolVersion.b(s);
            this.d = list0;
        }
        catch(bndq bndq0) {
            throw new IllegalArgumentException(bndq0);
        }
    }

    public KeyHandle(byte[] arr_b, ProtocolVersion protocolVersion0, List list0) {
        this.a = 1;
        this.b = arr_b;
        this.c = protocolVersion0;
        this.d = list0;
    }

    @Override  // blyh
    public final JSONObject a() {
        throw null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KeyHandle)) {
            return false;
        }
        if(!Arrays.equals(this.b, ((KeyHandle)object0).b)) {
            return false;
        }
        if(!this.c.equals(((KeyHandle)object0).c)) {
            return false;
        }
        List list0 = this.d;
        if(list0 == null && ((KeyHandle)object0).d == null) {
            return true;
        }
        if(list0 != null) {
            List list1 = ((KeyHandle)object0).d;
            return list1 != null && list0.containsAll(list1) && list1.containsAll(list0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.b), this.c, this.d});
    }

    @Override
    public final String toString() {
        return this.d == null ? String.format("{keyHandle: %s, version: %s, transports: %s}", bbmu.a(this.b), this.c, "null") : String.format("{keyHandle: %s, version: %s, transports: %s}", bbmu.a(this.b), this.c, this.d.toString());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c.d, false);
        baub.y(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

