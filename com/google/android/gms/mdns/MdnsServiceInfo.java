package com.google.android.gms.mdns;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cqsl;
import cqsm;
import cqsn;
import ggch;
import ggdy;
import gged_interceptors;
import ggeo;
import gggq;
import ggia;
import ggkm;
import ggna;
import glvt;
import java.net.Inet6Address;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class MdnsServiceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Charset a;
    public static final Charset b;
    public final String c;
    public final String[] d;
    public final List e;
    public final String[] f;
    public final int g;
    final List h;
    final List i;
    public final int j;
    final List k;
    final List l;
    public final Network m;
    public final ggeo n;

    static {
        MdnsServiceInfo.a = Charset.forName("us-ascii");
        MdnsServiceInfo.b = Charset.forName("utf-8");
        MdnsServiceInfo.CREATOR = new cqsn();
    }

    public MdnsServiceInfo(String s, String[] arr_s, List list0, String[] arr_s1, int v, String s1, String s2, List list1, List list2, int v1) {
        this(s, arr_s, list0, arr_s1, v, null, null, list1, list2, v1, (s1 == null ? ggna.a : gged_interceptors.l(s1)), (s2 == null ? ggna.a : gged_interceptors.l(s2)), null);
    }

    public MdnsServiceInfo(String s, String[] arr_s, List list0, String[] arr_s1, int v, String s1, String s2, List list1, List list2, int v1, List list3, List list4, Network network0) {
        this.c = s;
        this.d = arr_s;
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        if(list0 != null) {
            arrayList0.addAll(list0);
        }
        this.f = arr_s1;
        this.g = v;
        if(s1 != null && list3.isEmpty()) {
            list3 = gged_interceptors.l(s1);
        }
        this.k = list3;
        if(s2 != null && list4.isEmpty()) {
            list4 = gged_interceptors.l(s2);
        }
        this.l = list4;
        ArrayList arrayList1 = new ArrayList();
        this.h = arrayList1;
        if(list1 != null) {
            arrayList1.addAll(list1);
        }
        ArrayList arrayList2 = list2 == null ? null : new ArrayList(list2);
        this.i = arrayList2;
        if(arrayList2 == null) {
            ggdy ggdy0 = gged_interceptors.e(arrayList1.size());
            for(Object object0: arrayList1) {
                MdnsServiceInfo.TextEntry mdnsServiceInfo$TextEntry0 = MdnsServiceInfo.TextEntry.a(((String)object0).getBytes(MdnsServiceInfo.b));
                if(mdnsServiceInfo$TextEntry0 != null) {
                    ggdy0.i(mdnsServiceInfo$TextEntry0);
                }
            }
            arrayList2 = ggdy0.h();
        }
        HashMap hashMap0 = ggkm.k(arrayList2.size());
        for(Object object1: arrayList2) {
            MdnsServiceInfo.TextEntry mdnsServiceInfo$TextEntry1 = (MdnsServiceInfo.TextEntry)object1;
            String s3 = mdnsServiceInfo$TextEntry1.a.toLowerCase(Locale.ENGLISH);
            if(!hashMap0.containsKey(s3)) {
                hashMap0.put(s3, mdnsServiceInfo$TextEntry1.b());
            }
        }
        this.n = ggeo.k(hashMap0);
        this.j = v1;
        this.m = network0;
    }

    public final String a(String s) {
        byte[] arr_b = this.h(s);
        return arr_b == null ? null : new String(arr_b, MdnsServiceInfo.b);
    }

    @Deprecated
    public final String b() {
        return (String)gggq.o(this.k, null);
    }

    @Deprecated
    public final String c() {
        return (String)gggq.o(this.l, null);
    }

    public final List e() {
        cqsm cqsm0 = new cqsm();
        return ggia.h(this.k, cqsm0);
    }

    public final List f() {
        cqsl cqsl0 = (String s) -> {
            Inet6Address inet6Address0 = (Inet6Address)glvt.b(s);
            if(inet6Address0.isLinkLocalAddress()) {
                int v = this.j;
                if(v > 0) {
                    try {
                        return Inet6Address.getByAddress(inet6Address0.getHostAddress(), inet6Address0.getAddress(), v);
                    }
                    catch(UnknownHostException unknownHostException0) {
                        throw new AssertionError("Cannot happen as we are constructing from existing address.", unknownHostException0);
                    }
                }
            }
            return inet6Address0;
        };
        return ggia.h(this.l, cqsl0);
    }

    public final List g() {
        return new ArrayList(this.e);
    }

    public final byte[] h(String s) {
        return (byte[])this.n.get(s.toLowerCase(Locale.ENGLISH));
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = TextUtils.join(",", this.e);
        String s1 = TextUtils.join(",", ggch.f(this.k, this.l));
        String s2 = TextUtils.join(",", this.h);
        return String.format(locale0, "Name: %s, subtypes: %s, ips: %s, port: %d, texts: %s, network: %s", this.c, s, s1, ((int)this.g), s2, this.m);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.c, false);
        baub.w(parcel0, 3, this.d, false);
        baub.x(parcel0, 4, this.g(), false);
        baub.w(parcel0, 5, this.f, false);
        baub.o(parcel0, 6, this.g);
        baub.v(parcel0, 7, this.b(), false);
        baub.v(parcel0, 8, this.c(), false);
        baub.x(parcel0, 9, this.h, false);
        baub.y(parcel0, 10, this.i, false);
        baub.o(parcel0, 11, this.j);
        baub.x(parcel0, 12, this.k, false);
        baub.x(parcel0, 13, this.l, false);
        baub.t(parcel0, 14, this.m, v, false);
        baub.c(parcel0, v1);
    }
}

