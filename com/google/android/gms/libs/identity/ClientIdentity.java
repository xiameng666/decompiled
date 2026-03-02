package com.google.android.gms.libs.identity;

import a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.os.UserHandle;
import azpm;
import baub;
import brvs;
import cjar;
import cjas;
import cjat;
import cjau;
import cjav;
import cjba;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ggdx;
import ggna;
import ibuq;
import ibzk;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import jzh;

public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int a;
    public static final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public Integer h;
    public final List i;
    public cjav j;
    public final ClientIdentity k;

    static {
        ClientIdentity.CREATOR = new cjau();
        ClientIdentity.a = Process.myUid();
        ClientIdentity.b = Process.myPid();
    }

    public ClientIdentity(int v, int v1, String s, String s1, Integer integer0, List list0, cjav cjav0, ClientIdentity clientIdentity0) {
        this(v, v1, s, s1, null, integer0, list0, cjav0, clientIdentity0);
    }

    public ClientIdentity(int v, int v1, String s, String s1, String s2, Integer integer0, List list0, cjav cjav0, ClientIdentity clientIdentity0) {
        if(clientIdentity0 != null && clientIdentity0.n()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.c = v;
        this.d = v1;
        this.e = s;
        this.f = s1;
        List list1 = null;
        if(s2 == null) {
            s2 = clientIdentity0 == null ? null : clientIdentity0.g;
        }
        this.g = s2;
        if(integer0 == null) {
            integer0 = clientIdentity0 == null ? null : clientIdentity0.h;
        }
        this.h = integer0;
        if(list0 == null) {
            if(clientIdentity0 != null) {
                list1 = clientIdentity0.i;
            }
            list0 = list1;
            if(list0 == null) {
                list0 = ggna.a;
                ibuq.e(list0, "of(...)");
            }
        }
        this.i = ggdx.a(list0);
        this.j = cjav0;
        this.k = clientIdentity0;
    }

    public final UserHandle getUserHandleForUid() {
        UserHandle userHandle0 = jzh.a(this.c);
        ibuq.e(userHandle0, "getUserHandleForUid(...)");
        return userHandle0;
    }

    public final ClientIdentity b(String s, String s1) {
        return ClientIdentity.t(this, s, s1, null, 12);
    }

    public final ClientIdentity c() {
        return this.g != null || !this.i.isEmpty() || this.k != null ? new ClientIdentity(this.c, this.d, this.e, this.f, null, this.h, null, this.j, null) : this;
    }

    public static final ClientIdentity d(Context context0) {
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        ibuq.f(cjav.a, "clientType");
        String s = context0.getAttributionTag();
        return new ClientIdentity(ClientIdentity.a, ClientIdentity.b, "com.google.android.gms", s, ((int)azpm.b), null, cjav.a, null);
    }

    public static final ClientIdentity e(brvs brvs0, GetServiceRequest getServiceRequest0, int v, int v1) {
        ibuq.f(brvs0, "clientType");
        ibuq.f(getServiceRequest0, "request");
        return cjar.b(brvs0, getServiceRequest0, v, v1);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ClientIdentity) && this.c == ((ClientIdentity)object0).c && ibuq.m(this.e, ((ClientIdentity)object0).e) && ibuq.m(this.f, ((ClientIdentity)object0).f) && ibuq.m(this.g, ((ClientIdentity)object0).g) && ibuq.m(this.k, ((ClientIdentity)object0).k) && ibuq.m(this.i, ((ClientIdentity)object0).i);
    }

    public final ClientIdentity f() {
        return this.k == null ? this : this.k;
    }

    public final ClientIdentity g(Context context0, ClientIdentity clientIdentity0, String s) {
        ibuq.f(context0, "context");
        return clientIdentity0 == null ? ClientIdentity.t(this, null, s, null, 13) : ClientIdentity.t(clientIdentity0, null, s, this.h(context0), 5);
    }

    public final cjba h(Context context0) {
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        return new cjba(this, context0, false, null);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.c), this.e, this.f, this.g, this.k});
    }

    public final void i(Context context0, String[] arr_s) {
        ibuq.f(context0, "context");
        String[] arr_s1 = (String[])Arrays.copyOf(arr_s, 2);
        ibuq.f(context0, "context");
        ibuq.f(arr_s1, "permissions");
        for(int v = 0; v < arr_s1.length; ++v) {
            if(context0.checkPermission(arr_s1[v], this.d, this.c) == 0) {
                return;
            }
        }
        String s = Arrays.toString(arr_s);
        ibuq.e(s, "toString(...)");
        throw new SecurityException("uid " + this.c + " does not have any of " + s + ".");
    }

    public final void j(Context context0) {
        ibuq.f(context0, "context");
        if(((Boolean)new cjas(this).a(context0)).booleanValue()) {
            return;
        }
        throw new SecurityException(a.i(this, "rejected identity ", " with insufficient privileges"));
    }

    public final void k(Context context0, String[] arr_s) {
        ibuq.f(context0, "context");
        for(int v = 0; v < arr_s.length; ++v) {
            context0.enforcePermission(arr_s[v], this.d, this.c, null);
        }
    }

    public final void l(Context context0) {
        ibuq.f(context0, "context");
        if(((Boolean)new cjat(this).a(context0)).booleanValue()) {
            return;
        }
        throw new SecurityException(a.i(this, "rejected identity ", " with insufficient privileges"));
    }

    public final boolean m(Context context0, String[] arr_s) {
        ibuq.f(context0, "context");
        int v = 0;
        while(v < arr_s.length) {
            if(context0.checkPermission(arr_s[v], this.d, this.c) == 0) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    public final boolean n() {
        return this.k != null;
    }

    public final boolean o() {
        return this.d == ClientIdentity.b;
    }

    public final boolean p() {
        return this.c == ClientIdentity.a;
    }

    public final boolean q() {
        return ibuq.m(this.getUserHandleForUid(), Process.myUserHandle());
    }

    public final boolean r() {
        return this.c == 1000;
    }

    public final boolean s(Feature feature0) {
        String s = feature0.a;
        ibuq.e(s, "getName(...)");
        long v = feature0.a();
        ibuq.f(s, "name");
        List list0 = this.i;
        if((list0 instanceof Collection) && list0.isEmpty()) {
            return false;
        }
        for(Object object0: list0) {
            Feature feature1 = (Feature)object0;
            if(ibuq.m(feature1.a, s) && feature1.a() >= v) {
                return true;
            }
        }
        return false;
    }

    public static ClientIdentity t(ClientIdentity clientIdentity0, String s, String s1, cjba cjba0, int v) {
        if((v & 1) != 0) {
            s = clientIdentity0.f;
        }
        if((v & 2) != 0) {
            s1 = clientIdentity0.g;
        }
        ClientIdentity clientIdentity1 = null;
        List list0 = (v & 4) == 0 ? null : clientIdentity0.i;
        if((v & 8) != 0) {
            ClientIdentity clientIdentity2 = clientIdentity0.k;
            if(clientIdentity2 == null) {
                cjba0 = null;
            }
            else {
                UserHandle userHandle0 = clientIdentity2.getUserHandleForUid();
                ibuq.f(userHandle0, "validatedUserHandle");
                cjba0 = new cjba(clientIdentity2, null, true, userHandle0);
            }
        }
        ibuq.f(list0, "clientFeatures");
        if(cjba0 == null && clientIdentity0.k == null && ibuq.m(s, clientIdentity0.f) && ibuq.m(s1, clientIdentity0.g) && ibuq.m(list0, clientIdentity0.i)) {
            return clientIdentity0;
        }
        int v1 = clientIdentity0.c;
        int v2 = clientIdentity0.d;
        String s2 = clientIdentity0.e;
        Integer integer0 = clientIdentity0.h;
        cjav cjav0 = clientIdentity0.j;
        if(cjba0 != null) {
            UserHandle userHandle1 = jzh.a(v1);
            ibuq.e(userHandle1, "getUserHandleForUid(...)");
            clientIdentity1 = cjba0.a(userHandle1);
        }
        return new ClientIdentity(v1, v2, s2, s, s1, integer0, list0, cjav0, clientIdentity1);
    }

    @Override
    public final String toString() {
        String s = this.e;
        String s1 = this.f;
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 18 + (s1 == null ? 0 : s1.length()));
        stringBuilder0.append(this.c);
        stringBuilder0.append("/");
        stringBuilder0.append(s);
        if(s1 != null) {
            stringBuilder0.append("[");
            if(ibzk.W(s1, s)) {
                stringBuilder0.append(s1, s.length(), s1.length());
            }
            else {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append("]");
        }
        String s2 = this.g;
        if(s2 != null) {
            stringBuilder0.append("/");
            stringBuilder0.append(Integer.toHexString(s2.hashCode()));
        }
        return stringBuilder0.toString();
    }

    public static final ClientIdentity u(String s, int v, String s1) {
        ibuq.f(s, "packageName");
        return cjar.c(s, v, -1, s1, null, 0x70);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.c);
        baub.v(parcel0, 3, this.e, false);
        baub.v(parcel0, 4, this.f, false);
        baub.v(parcel0, 6, this.g, false);
        baub.t(parcel0, 7, this.k, v, false);
        baub.y(parcel0, 8, this.i, false);
        baub.c(parcel0, v1);
    }
}

