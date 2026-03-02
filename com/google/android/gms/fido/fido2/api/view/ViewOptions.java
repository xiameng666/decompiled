package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import blyh;
import bmky;
import bmkz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewOptions extends AbstractSafeParcelable implements blyh {
    public static final Parcelable.Creator CREATOR;
    private final int a;
    public final Set d;

    static {
        ViewOptions.CREATOR = new bmkz();
    }

    public ViewOptions() {
        this(1);
    }

    public ViewOptions(int v) {
        this.d = new HashSet();
        this.a = v;
    }

    @Override  // blyh
    public JSONObject a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("viewName", this.b().p);
            Set set0 = this.d;
            if(!set0.isEmpty()) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: set0) {
                    jSONArray0.put(((Transport)object0).h);
                }
                jSONObject0.put("alternateAvailableTransports", jSONArray0);
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    public bmky b() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    public int hV() {
        return this.a;
    }

    @Override
    public final String toString() {
        return this.a().toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.hV());
        baub.c(parcel0, v1);
    }
}

