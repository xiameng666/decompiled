package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import attm;
import aurf;
import baub;
import bbpf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    String l;
    public JSONObject m;

    static {
        TextTrackStyle.CREATOR = new attm();
    }

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public TextTrackStyle(float f, int v, int v1, int v2, int v3, int v4, int v5, int v6, String s, int v7, int v8, String s1) {
        this.a = f;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.i = s;
        this.j = v7;
        this.k = v8;
        this.l = s1;
        if(s1 != null) {
            try {
                this.m = new JSONObject(this.l);
            }
            catch(JSONException unused_ex) {
                this.m = null;
                this.l = null;
            }
            return;
        }
        this.m = null;
    }

    public static final int a(String s) {
        if(s != null && s.length() == 9 && s.charAt(0) == 35) {
            try {
                return Color.argb(Integer.parseInt(s.substring(7, 9), 16), Integer.parseInt(s.substring(1, 3), 16), Integer.parseInt(s.substring(3, 5), 16), Integer.parseInt(s.substring(5, 7), 16));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return 0;
    }

    public static final String b(int v) {
        return String.format("#%02X%02X%02X%02X", Color.red(v), Color.green(v), Color.blue(v), Color.alpha(v));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextTrackStyle)) {
            return false;
        }
        JSONObject jSONObject0 = this.m;
        JSONObject jSONObject1 = ((TextTrackStyle)object0).m;
        if((jSONObject0 == null ? 1 : 0) != (jSONObject1 == null ? 1 : 0)) {
            return false;
        }
        return jSONObject0 == null || jSONObject1 == null || bbpf.b(jSONObject0, jSONObject1) ? this.a == ((TextTrackStyle)object0).a && this.b == ((TextTrackStyle)object0).b && this.c == ((TextTrackStyle)object0).c && this.d == ((TextTrackStyle)object0).d && this.e == ((TextTrackStyle)object0).e && this.f == ((TextTrackStyle)object0).f && this.g == ((TextTrackStyle)object0).g && this.h == ((TextTrackStyle)object0).h && aurf.u(this.i, ((TextTrackStyle)object0).i) && this.j == ((TextTrackStyle)object0).j && this.k == ((TextTrackStyle)object0).k : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((float)this.a), ((int)this.b), ((int)this.c), ((int)this.d), ((int)this.e), ((int)this.f), ((int)this.g), ((int)this.h), this.i, ((int)this.j), ((int)this.k), String.valueOf(this.m)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.l = this.m == null ? null : this.m.toString();
        int v1 = baub.a(parcel0);
        baub.l(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.o(parcel0, 7, this.f);
        baub.o(parcel0, 8, this.g);
        baub.o(parcel0, 9, this.h);
        baub.v(parcel0, 10, this.i, false);
        baub.o(parcel0, 11, this.j);
        baub.o(parcel0, 12, this.k);
        baub.v(parcel0, 13, this.l, false);
        baub.c(parcel0, v1);
    }
}

