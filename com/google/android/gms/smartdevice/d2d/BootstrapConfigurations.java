package com.google.android.gms.smartdevice.d2d;

import a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbgi;
import bxd;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epxj;
import epzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class BootstrapConfigurations extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public static final Map a;
    public final Set b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public ArrayList g;
    public Bundle h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public long m;
    public DeviceDetails n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public AccountPickerOptions s;
    public AuthenticatingUser t;
    public boolean u;
    public UiCustomization v;

    static {
        BootstrapConfigurations.CREATOR = new epxj();
        bxd bxd0 = new bxd();
        bxd0.put("wifiNetworkSsid", new FastJsonResponse.Field(7, false, 7, false, "wifiNetworkSsid", 2, null));
        bxd0.put("wifiNetworkPassword", new FastJsonResponse.Field(7, false, 7, false, "wifiNetworkPassword", 3, null));
        bxd0.put("wifiNetworkSecurity", new FastJsonResponse.Field(7, false, 7, false, "wifiNetworkSecurity", 4, null));
        bxd0.put("isLockScreenShown", new FastJsonResponse.Field(6, false, 6, false, "isLockScreenShown", 5, null));
        bxd0.put("bootstrapAccounts", new FastJsonResponse.Field(11, true, 11, true, "bootstrapAccounts", 6, BootstrapAccount.class));
        bxd0.put("extraParameters", new FastJsonResponse.Field(10, false, 10, false, "extraParameters", 7, null));
        bxd0.put("hasUserConfirmed", new FastJsonResponse.Field(6, false, 6, false, "hasUserConfirmed", 8, null));
        bxd0.put("supportsUnencryptedCommunication", new FastJsonResponse.Field(6, false, 6, false, "supportsUnencryptedCommunication", 9, null));
        bxd0.put("maxPacketSize", new FastJsonResponse.Field(0, false, 0, false, "maxPacketSize", 10, null));
        bxd0.put("optionFlags", new FastJsonResponse.Field(2, false, 2, false, "optionFlags", 11, null));
        bxd0.put("optionFlagSetIndicators", new FastJsonResponse.Field(2, false, 2, false, "optionFlagSetIndicators", 12, null));
        bxd0.put("deviceDetails", new FastJsonResponse.Field(11, false, 11, false, "deviceDetails", 13, DeviceDetails.class));
        bxd0.put("nearbyDirectTransfer", new FastJsonResponse.Field(6, false, 6, false, "nearbyDirectTransfer", 14, null));
        bxd0.put("targetNearbyDirectTransfer", new FastJsonResponse.Field(6, false, 6, false, "targetNearbyDirectTransfer", 15, null));
        bxd0.put("hideSkipAccount", new FastJsonResponse.Field(6, false, 6, false, "hideSkipAccount", 16, null));
        bxd0.put("accountPickerEnabled", new FastJsonResponse.Field(6, false, 6, false, "accountPickerEnabled", 17, null));
        bxd0.put("accountPickerOptions", new FastJsonResponse.Field(11, false, 11, false, "accountPickerOptions", 18, AccountPickerOptions.class));
        bxd0.put("authenticatingUser", new FastJsonResponse.Field(11, false, 11, false, "authenticatingUser", 19, AuthenticatingUser.class));
        bxd0.put("unicornChallengeDeduplicationEnabled", new FastJsonResponse.Field(6, false, 6, false, "unicornChallengeDeduplicationEnabled", 20, null));
        bxd0.put("uiCustomization", new FastJsonResponse.Field(11, false, 11, false, "uiCustomization", 21, UiCustomization.class));
        BootstrapConfigurations.a = bxd0;
    }

    public BootstrapConfigurations() {
        this.b = new HashSet();
    }

    public BootstrapConfigurations(String s, String s1, String s2, boolean z, ArrayList arrayList0, Map map0, long v, long v1) {
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = z;
        this.g = arrayList0;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.l = v;
        this.m = v1;
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.entrySet()) {
            bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        this.h = bundle0;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = null;
        this.b.add(Integer.valueOf(2));
        this.b.add(Integer.valueOf(3));
        this.b.add(Integer.valueOf(4));
        this.b.add(Integer.valueOf(5));
        this.b.add(Integer.valueOf(6));
        this.b.add(Integer.valueOf(7));
        this.b.add(Integer.valueOf(8));
        this.b.add(Integer.valueOf(9));
        this.b.add(Integer.valueOf(10));
        this.b.add(Integer.valueOf(11));
        this.b.add(Integer.valueOf(12));
        this.b.add(Integer.valueOf(17));
        this.b.add(Integer.valueOf(18));
        this.b.add(Integer.valueOf(19));
        this.b.add(Integer.valueOf(20));
        this.b.add(Integer.valueOf(21));
    }

    public BootstrapConfigurations(Set set0, String s, String s1, String s2, boolean z, ArrayList arrayList0, Bundle bundle0, boolean z1, boolean z2, int v, long v1, long v2, DeviceDetails deviceDetails0, boolean z3, boolean z4, boolean z5, boolean z6, AccountPickerOptions accountPickerOptions0, AuthenticatingUser authenticatingUser0, boolean z7, UiCustomization uiCustomization0) {
        this.b = set0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = z;
        this.g = arrayList0;
        this.h = bundle0;
        this.i = z1;
        this.j = z2;
        this.k = v;
        this.l = v1;
        this.m = v2;
        this.n = deviceDetails0;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = accountPickerOptions0;
        this.t = authenticatingUser0;
        this.u = z7;
        this.v = uiCustomization0;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return this.c;
            }
            case 3: {
                return this.d;
            }
            case 4: {
                return this.e;
            }
            case 5: {
                return Boolean.valueOf(this.f);
            }
            case 6: {
                return this.g;
            }
            case 7: {
                return this.q();
            }
            case 8: {
                return Boolean.valueOf(this.i);
            }
            case 9: {
                return Boolean.valueOf(this.j);
            }
            case 10: {
                return (int)this.k;
            }
            case 11: {
                return (long)this.l;
            }
            case 12: {
                return (long)this.m;
            }
            case 13: {
                return this.n;
            }
            case 14: {
                return Boolean.valueOf(this.o);
            }
            case 15: {
                return Boolean.valueOf(this.p);
            }
            case 16: {
                return Boolean.valueOf(this.q);
            }
            case 17: {
                return Boolean.valueOf(this.r);
            }
            case 18: {
                return this.s;
            }
            case 19: {
                return this.t;
            }
            case 20: {
                return Boolean.valueOf(this.u);
            }
            case 21: {
                return this.v;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    protected final void ae(FastJsonResponse.Field fastJsonResponse$Field0, String s, Map map0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 7) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string map.", v));
        }
        this.u(map0);
        this.b.add(Integer.valueOf(7));
    }

    @Override  // bbgi
    public final Map b() {
        return BootstrapConfigurations.a;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.b.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.c = s1;
                break;
            }
            case 3: {
                this.d = s1;
                break;
            }
            case 4: {
                this.e = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
            }
        }
        this.b.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    public final void gE(FastJsonResponse.Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 6) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not a known array of custom type.)"));
        }
        this.g = arrayList0;
        this.b.add(Integer.valueOf(6));
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 13: {
                this.n = (DeviceDetails)bbgi0;
                break;
            }
            case 18: {
                this.s = (AccountPickerOptions)bbgi0;
                break;
            }
            case 19: {
                this.t = (AuthenticatingUser)bbgi0;
                break;
            }
            case 21: {
                this.v = (UiCustomization)bbgi0;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d not a concrete type", v));
            }
        }
        this.b.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 10) {
            throw new IllegalStateException(String.format("Field with id=%d  is not known to be an integer.", v1));
        }
        this.k = v;
        this.b.add(Integer.valueOf(10));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 5: {
                this.f = z;
                break;
            }
            case 8: {
                this.i = z;
                break;
            }
            case 9: {
                this.j = z;
                break;
            }
            case 14: {
                this.o = z;
                break;
            }
            case 15: {
                this.p = z;
                break;
            }
            case 16: {
                this.q = z;
                break;
            }
            case 17: {
                this.r = z;
                break;
            }
            case 20: {
                this.u = z;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", v));
            }
        }
        this.b.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void k(FastJsonResponse.Field fastJsonResponse$Field0, String s, long v) {
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 11: {
                this.l = v;
                break;
            }
            case 12: {
                this.m = v;
                break;
            }
            default: {
                throw new IllegalStateException(String.format("Field id %d is not a known long", v1));
            }
        }
        this.b.add(Integer.valueOf(v1));
    }

    public final epzc p() {
        return new epzc(this.l, this.m);
    }

    public final Map q() {
        if(this.h == null) {
            return new HashMap();
        }
        Map map0 = new HashMap();
        Bundle bundle0 = this.h;
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                String s1 = bundle0.getString(s);
                if(s1 != null) {
                    map0.put(s, s1);
                }
            }
            return map0;
        }
        return Collections.EMPTY_MAP;
    }

    public final void r(AuthenticatingUser authenticatingUser0) {
        this.t = authenticatingUser0;
        this.b.add(Integer.valueOf(19));
    }

    public final void s(ArrayList arrayList0) {
        this.g = arrayList0;
        this.b.add(Integer.valueOf(6));
    }

    public final void t(DeviceDetails deviceDetails0) {
        this.n = deviceDetails0;
        this.b.add(Integer.valueOf(13));
    }

    public final void u(Map map0) {
        Bundle bundle0;
        if(map0 == null) {
            bundle0 = null;
        }
        else {
            Bundle bundle1 = new Bundle();
            for(Object object0: map0.entrySet()) {
                bundle1.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            bundle0 = bundle1;
        }
        this.h = bundle0;
        this.b.add(Integer.valueOf(7));
    }

    public final void v(int v) {
        this.k = v;
        this.b.add(Integer.valueOf(10));
    }

    public final void w(epzc epzc0) {
        this.l = epzc0.a;
        this.b.add(Integer.valueOf(11));
        this.m = epzc0.b;
        this.b.add(Integer.valueOf(12));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.b;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.c, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.d, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.e, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.e(parcel0, 5, this.f);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.y(parcel0, 6, this.g, true);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.g(parcel0, 7, this.h, true);
        }
        if(set0.contains(Integer.valueOf(8))) {
            baub.e(parcel0, 8, this.i);
        }
        if(set0.contains(Integer.valueOf(9))) {
            baub.e(parcel0, 9, this.j);
        }
        if(set0.contains(Integer.valueOf(10))) {
            baub.o(parcel0, 10, this.k);
        }
        if(set0.contains(Integer.valueOf(11))) {
            baub.q(parcel0, 11, this.l);
        }
        if(set0.contains(Integer.valueOf(12))) {
            baub.q(parcel0, 12, this.m);
        }
        if(set0.contains(Integer.valueOf(13))) {
            baub.t(parcel0, 13, this.n, v, true);
        }
        if(set0.contains(Integer.valueOf(14))) {
            baub.e(parcel0, 14, this.o);
        }
        if(set0.contains(Integer.valueOf(15))) {
            baub.e(parcel0, 15, this.p);
        }
        if(set0.contains(Integer.valueOf(16))) {
            baub.e(parcel0, 16, this.q);
        }
        if(set0.contains(Integer.valueOf(17))) {
            baub.e(parcel0, 17, this.r);
        }
        if(set0.contains(Integer.valueOf(18))) {
            baub.t(parcel0, 18, this.s, v, true);
        }
        if(set0.contains(Integer.valueOf(19))) {
            baub.t(parcel0, 19, this.t, v, true);
        }
        if(set0.contains(Integer.valueOf(20))) {
            baub.e(parcel0, 20, this.u);
        }
        if(set0.contains(Integer.valueOf(21))) {
            baub.t(parcel0, 21, this.v, v, true);
        }
        baub.c(parcel0, v1);
    }

    public final void x(boolean z) {
        this.u = z;
        this.b.add(Integer.valueOf(20));
    }
}

