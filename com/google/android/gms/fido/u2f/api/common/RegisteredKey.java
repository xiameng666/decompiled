package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import batl;
import baub;
import blyh;
import bndu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class RegisteredKey extends AbstractSafeParcelable implements blyh {
    public static final Parcelable.Creator CREATOR;
    public final KeyHandle a;
    public final String b;
    public String c;

    static {
        RegisteredKey.CREATOR = new bndu();
    }

    public RegisteredKey(KeyHandle keyHandle0) {
        this(keyHandle0, null, null);
    }

    public RegisteredKey(KeyHandle keyHandle0, String s, String s1) {
        batl.s(keyHandle0);
        this.a = keyHandle0;
        this.c = s;
        this.b = s1;
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
        if(!(object0 instanceof RegisteredKey)) {
            return false;
        }
        String s = this.c;
        if(s == null) {
            if(((RegisteredKey)object0).c != null) {
                return false;
            }
        }
        else if(!s.equals(((RegisteredKey)object0).c)) {
            return false;
        }
        if(!this.a.equals(((RegisteredKey)object0).a)) {
            return false;
        }
        return this.b == null ? ((RegisteredKey)object0).b == null : this.b.equals(((RegisteredKey)object0).b);
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.c == null ? 0 : this.c.hashCode()) + 0x1F) * 0x1F + this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            KeyHandle keyHandle0 = this.a;
            jSONObject0.put("keyHandle", Base64.encodeToString(keyHandle0.b, 11));
            ProtocolVersion protocolVersion0 = keyHandle0.c;
            if(protocolVersion0 != ProtocolVersion.a) {
                jSONObject0.put("version", protocolVersion0.d);
            }
            List list0 = keyHandle0.d;
            if(list0 != null) {
                jSONObject0.put("transports", list0.toString());
            }
            String s = this.c;
            if(s != null) {
                jSONObject0.put("challenge", s);
            }
            String s1 = this.b;
            if(s1 != null) {
                jSONObject0.put("appId", s1);
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.b, false);
        baub.c(parcel0, v1);
    }
}

