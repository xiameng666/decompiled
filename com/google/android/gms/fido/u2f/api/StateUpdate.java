package com.google.android.gms.fido.u2f.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bnda;
import bndb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Deprecated
    public static final StateUpdate a;
    public static final StateUpdate b;
    public static final StateUpdate c;
    public static final StateUpdate d;
    public final StateUpdate.Type e;
    public final String f;

    static {
        StateUpdate.CREATOR = new bndb();
        StateUpdate.a = new StateUpdate(StateUpdate.Type.a);
        StateUpdate.b = new StateUpdate(StateUpdate.Type.b);
        StateUpdate.c = new StateUpdate(StateUpdate.Type.c);
        StateUpdate.d = new StateUpdate(StateUpdate.Type.d);
    }

    public StateUpdate(StateUpdate.Type stateUpdate$Type0) {
        this(stateUpdate$Type0, null);
    }

    public StateUpdate(StateUpdate.Type stateUpdate$Type0, JSONObject jSONObject0) {
        boolean z = true;
        super();
        batl.s(stateUpdate$Type0);
        this.e = stateUpdate$Type0;
        if(jSONObject0 == null) {
            if(!stateUpdate$Type0.equals(StateUpdate.Type.a) && !stateUpdate$Type0.equals(StateUpdate.Type.b) && !stateUpdate$Type0.equals(StateUpdate.Type.c) && !stateUpdate$Type0.equals(StateUpdate.Type.d)) {
                z = false;
            }
            batl.b(z);
            this.f = null;
            return;
        }
        this.f = jSONObject0.toString();
    }

    public StateUpdate(String s, String s1) {
        try {
            this.e = StateUpdate.Type.a(s);
            this.f = s1;
        }
        catch(bnda bnda0) {
            throw new IllegalArgumentException(bnda0);
        }
    }

    public final JSONObject a() {
        String s = this.f;
        if(s == null) {
            return null;
        }
        try {
            return new JSONObject(s);
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof StateUpdate) ? bata.b(this.e, ((StateUpdate)object0).e) && bata.b(this.f, ((StateUpdate)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e.i, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.e.i, false);
        baub.v(parcel0, 3, this.f, false);
        baub.c(parcel0, v1);
    }
}

