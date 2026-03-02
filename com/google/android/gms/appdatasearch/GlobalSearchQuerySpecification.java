package com.google.android.gms.appdatasearch;

import abvw;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GlobalSearchQuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final CorpusId[] a;
    public final int b;
    final CorpusScoringInfo[] c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final byte[] i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int[] m;
    public final byte[] n;
    public final STSortSpec o;
    public final String p;
    public final CacheSpec q;
    public final transient Map r;
    public final transient Map s;

    static {
        GlobalSearchQuerySpecification.CREATOR = new abvw();
    }

    public GlobalSearchQuerySpecification(CorpusId[] arr_corpusId, int v, CorpusScoringInfo[] arr_corpusScoringInfo, int v1, int v2, int v3, String s, boolean z, byte[] arr_b, boolean z1, boolean z2, boolean z3, int[] arr_v, byte[] arr_b1, STSortSpec sTSortSpec0, String s1, CacheSpec cacheSpec0) {
        this.a = arr_corpusId;
        this.b = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = s;
        this.h = z;
        this.i = arr_b;
        this.j = z1;
        this.k = z2;
        this.l = z3;
        this.m = arr_v;
        this.n = arr_b1;
        this.o = sTSortSpec0;
        this.p = s1;
        this.q = cacheSpec0;
        this.c = arr_corpusScoringInfo;
        if(arr_corpusId != null && arr_corpusId.length != 0) {
            this.r = new HashMap();
            for(int v5 = 0; v5 < arr_corpusId.length; ++v5) {
                Set set0 = (Set)this.r.get(arr_corpusId[v5].a);
                if(set0 == null) {
                    set0 = new HashSet();
                    this.r.put(arr_corpusId[v5].a, set0);
                }
                String s2 = arr_corpusId[v5].b;
                if(s2 != null) {
                    set0.add(s2);
                }
            }
        }
        else {
            this.r = null;
        }
        if(arr_corpusScoringInfo != null && arr_corpusScoringInfo.length != 0) {
            this.s = new HashMap(arr_corpusScoringInfo.length);
            for(int v4 = 0; v4 < arr_corpusScoringInfo.length; ++v4) {
                CorpusScoringInfo corpusScoringInfo0 = arr_corpusScoringInfo[v4];
                this.s.put(corpusScoringInfo0.a, corpusScoringInfo0);
            }
            return;
        }
        this.s = null;
    }

    public final CorpusScoringInfo a(String s, String s1) {
        Map map0 = this.s;
        if(map0 == null) {
            return null;
        }
        CorpusScoringInfo corpusScoringInfo0 = (CorpusScoringInfo)map0.get(new CorpusId(s, s1));
        return corpusScoringInfo0 == null ? ((CorpusScoringInfo)map0.get(new CorpusId(s, null))) : corpusScoringInfo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GlobalSearchQuerySpecification) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((GlobalSearchQuerySpecification)object0).b)) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((GlobalSearchQuerySpecification)object0).d)) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((GlobalSearchQuerySpecification)object0).e)) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((GlobalSearchQuerySpecification)object0).f)) && bata.b(this.g, ((GlobalSearchQuerySpecification)object0).g) && bata.b(Boolean.valueOf(this.h), Boolean.valueOf(((GlobalSearchQuerySpecification)object0).h)) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((GlobalSearchQuerySpecification)object0).j)) && bata.b(Boolean.valueOf(this.k), Boolean.valueOf(((GlobalSearchQuerySpecification)object0).k)) && bata.b(Boolean.valueOf(this.l), Boolean.valueOf(((GlobalSearchQuerySpecification)object0).l)) && bata.b(this.s, ((GlobalSearchQuerySpecification)object0).s) && bata.b(this.o, ((GlobalSearchQuerySpecification)object0).o) && bata.b(this.p, ((GlobalSearchQuerySpecification)object0).p) && Arrays.equals(this.a, ((GlobalSearchQuerySpecification)object0).a) && Arrays.equals(this.i, ((GlobalSearchQuerySpecification)object0).i) && Arrays.equals(this.c, ((GlobalSearchQuerySpecification)object0).c) && Arrays.equals(this.m, ((GlobalSearchQuerySpecification)object0).m) && Arrays.equals(this.n, ((GlobalSearchQuerySpecification)object0).n) && bata.b(this.q, ((GlobalSearchQuerySpecification)object0).q);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.a);
        Integer integer1 = Arrays.hashCode(this.i);
        Integer integer2 = Arrays.hashCode(this.c);
        Integer integer3 = Arrays.hashCode(this.n);
        return Arrays.hashCode(new Object[]{((int)this.b), ((int)this.d), ((int)this.e), ((int)this.f), this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.s, this.o, this.p, integer0, integer1, integer2, integer3, this.q});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("mFilter: [");
        Map map0 = this.r;
        if(map0 != null) {
            for(Object object0: map0.keySet()) {
                String s = "";
                for(Object object1: ((Set)map0.get(((String)object0)))) {
                    s = s + ((String)object1) + ",";
                }
                stringBuilder0.append("key:");
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(", values:");
                stringBuilder0.append(s);
                stringBuilder0.append("\n");
            }
        }
        stringBuilder0.append("]\nmCorpusScoringInfoMap: [");
        Map map1 = this.s;
        if(map1 != null) {
            for(Object object2: map1.keySet()) {
                stringBuilder0.append(((CorpusId)object2).toString() + "\n");
            }
        }
        stringBuilder0.append("]\n");
        STSortSpec sTSortSpec0 = this.o;
        if(sTSortSpec0 != null) {
            stringBuilder0.append("STSortSpec: ");
            stringBuilder0.append(sTSortSpec0.toString());
            stringBuilder0.append("\n");
        }
        String s1 = this.p;
        if(s1 != null) {
            stringBuilder0.append("Origin: ");
            stringBuilder0.append(s1);
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.o(parcel0, 2, this.b);
        baub.J(parcel0, 3, this.c, v);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.o(parcel0, 6, this.f);
        baub.v(parcel0, 7, this.g, false);
        baub.e(parcel0, 8, this.h);
        baub.i(parcel0, 9, this.i, false);
        baub.e(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.e(parcel0, 12, this.l);
        baub.p(parcel0, 13, this.m, false);
        baub.i(parcel0, 14, this.n, false);
        baub.t(parcel0, 15, this.o, v, false);
        baub.v(parcel0, 16, this.p, false);
        baub.t(parcel0, 18, this.q, v, false);
        baub.c(parcel0, v1);
    }
}

