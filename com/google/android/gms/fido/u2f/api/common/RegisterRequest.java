package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import blyh;
import bndq;
import bndr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

@Deprecated
public class RegisterRequest extends AbstractSafeParcelable implements blyh {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final ProtocolVersion b;
    public final byte[] c;
    public final String d;

    static {
        RegisterRequest.CREATOR = new bndr();
    }

    public RegisterRequest(int v, String s, byte[] arr_b, String s1) {
        this.a = v;
        try {
            this.b = ProtocolVersion.b(s);
            this.c = arr_b;
            this.d = s1;
        }
        catch(bndq bndq0) {
            throw new IllegalArgumentException(bndq0);
        }
    }

    public RegisterRequest(ProtocolVersion protocolVersion0, byte[] arr_b) {
        boolean z = true;
        this.a = 1;
        batl.s(protocolVersion0);
        this.b = protocolVersion0;
        this.c = arr_b;
        if(protocolVersion0 == ProtocolVersion.b) {
            if(arr_b.length != 65) {
                z = false;
            }
            batl.c(z, "invalid challengeValue length for V1");
        }
        this.d = null;
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
        if(!(object0 instanceof RegisterRequest)) {
            return false;
        }
        if(!Arrays.equals(this.c, ((RegisterRequest)object0).c)) {
            return false;
        }
        if(this.b != ((RegisterRequest)object0).b) {
            return false;
        }
        return this.d == null ? ((RegisterRequest)object0).d == null : this.d.equals(((RegisterRequest)object0).d);
    }

    @Override
    public final int hashCode() {
        int v = (Arrays.hashCode(this.c) + 0x1F) * 0x1F + this.b.hashCode();
        return this.d == null ? v * 0x1F : v * 0x1F + this.d.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b.d, false);
        baub.i(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

