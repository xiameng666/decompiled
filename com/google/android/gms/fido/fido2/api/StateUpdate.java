package com.google.android.gms.fido.fido2.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bmgi;
import bmgj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Deprecated
    public static final StateUpdate a;
    public static final StateUpdate b;
    public static final StateUpdate c;
    public static final StateUpdate d;
    public final String e;
    private final StateUpdate.Type f;

    static {
        StateUpdate.CREATOR = new bmgj();
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
        this.f = stateUpdate$Type0;
        if(jSONObject0 == null) {
            if(!stateUpdate$Type0.equals(StateUpdate.Type.a) && !stateUpdate$Type0.equals(StateUpdate.Type.b) && !stateUpdate$Type0.equals(StateUpdate.Type.c) && !stateUpdate$Type0.equals(StateUpdate.Type.d)) {
                z = false;
            }
            batl.b(z);
            this.e = null;
            return;
        }
        this.e = jSONObject0.toString();
    }

    public StateUpdate(String s, String s1) {
        batl.s(s);
        try {
            this.f = StateUpdate.Type.a(s);
            this.e = s1;
        }
        catch(bmgi bmgi0) {
            throw new IllegalArgumentException(bmgi0);
        }
    }

    public final String a() {
        return this.f.i;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof StateUpdate) ? bata.b(this.f, ((StateUpdate)object0).f) && bata.b(this.e, ((StateUpdate)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f.i, this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a(), false);
        baub.v(parcel0, 3, this.e, false);
        baub.c(parcel0, v1);
    }
}

