package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bmiq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static {
        PublicKeyCredentialRpEntity.CREATOR = new bmiq();
    }

    public PublicKeyCredentialRpEntity(String s, String s1, String s2) {
        batl.s(s);
        this.a = s;
        batl.s(s1);
        this.b = s1;
        this.c = s2;
    }

    public static PublicKeyCredentialRpEntity a(JSONObject jSONObject0) {
        String s = jSONObject0.getString("id");
        String s1 = jSONObject0.getString("name");
        return jSONObject0.has("icon") ? new PublicKeyCredentialRpEntity(s, s1, jSONObject0.optString("icon")) : new PublicKeyCredentialRpEntity(s, s1, null);
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("id", this.a);
        jSONObject0.put("name", this.b);
        String s = this.c;
        if(s != null) {
            jSONObject0.put("icon", s);
        }
        return jSONObject0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PublicKeyCredentialRpEntity) ? bata.b(this.a, ((PublicKeyCredentialRpEntity)object0).a) && bata.b(this.b, ((PublicKeyCredentialRpEntity)object0).b) && bata.b(this.c, ((PublicKeyCredentialRpEntity)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id=\'" + this.a + "\', \n name=\'" + this.b + "\', \n icon=\'" + this.c + "\'}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

