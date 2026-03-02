package com.google.firebase.auth.api.model;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbqr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gorh;
import goxb;
import goyg;
import hgja;
import org.json.JSONException;
import org.json.JSONObject;

public class GetTokenResponse extends AbstractSafeParcelable implements goxb {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public Long c;
    public String d;
    public Long e;

    static {
        GetTokenResponse.CREATOR = new goyg();
    }

    public GetTokenResponse() {
        this.e = System.currentTimeMillis();
    }

    public GetTokenResponse(String s, String s1, Long long0, String s2) {
        this(s, s1, long0, s2, Long.valueOf(System.currentTimeMillis()));
    }

    public GetTokenResponse(String s, String s1, Long long0, String s2, Long long1) {
        this.a = s;
        this.b = s1;
        this.c = long0;
        this.d = s2;
        this.e = long1;
    }

    @Override  // goxb
    public final Parser a() {
        return (Parser)((ProtoLiteMessage)hgja.a).jf(7, null);
    }

    @Override  // goxb
    public final void b(MessageLite hfvm0) {
        if(!(hfvm0 instanceof hgja)) {
            throw new IllegalArgumentException("The passed proto must be an instance of GrantTokenResponse.");
        }
        this.a = bbqr.b(((hgja)hfvm0).e);
        this.b = bbqr.b(((hgja)hfvm0).b);
        this.c = (long)((hgja)hfvm0).c;
        this.d = bbqr.b(((hgja)hfvm0).d);
        this.e = System.currentTimeMillis();
    }

    public static GetTokenResponse c(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            GetTokenResponse getTokenResponse0 = new GetTokenResponse();
            getTokenResponse0.a = jSONObject0.optString("refresh_token", null);
            getTokenResponse0.b = jSONObject0.optString("access_token", null);
            getTokenResponse0.c = jSONObject0.optLong("expires_in");
            getTokenResponse0.d = jSONObject0.optString("token_type", null);
            getTokenResponse0.e = jSONObject0.optLong("issued_at");
            return getTokenResponse0;
        }
        catch(JSONException jSONException0) {
            throw new gorh(jSONException0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.I(parcel0, 4, Long.valueOf((this.c == null ? 0L : ((long)this.c))));
        baub.v(parcel0, 5, this.d, false);
        baub.I(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

