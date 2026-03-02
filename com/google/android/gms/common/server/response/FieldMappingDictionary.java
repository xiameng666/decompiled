package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bbgx;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    private final HashMap c;

    static {
        FieldMappingDictionary.CREATOR = new bbgx();
    }

    public FieldMappingDictionary(int v, ArrayList arrayList0, String s) {
        this.a = v;
        HashMap hashMap0 = new HashMap();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            FieldMappingDictionary.Entry fieldMappingDictionary$Entry0 = (FieldMappingDictionary.Entry)arrayList0.get(v2);
            String s1 = fieldMappingDictionary$Entry0.b;
            HashMap hashMap1 = new HashMap();
            batl.s(fieldMappingDictionary$Entry0.c);
            int v3 = fieldMappingDictionary$Entry0.c.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                FieldMappingDictionary.FieldMapPair fieldMappingDictionary$FieldMapPair0 = (FieldMappingDictionary.FieldMapPair)fieldMappingDictionary$Entry0.c.get(v4);
                hashMap1.put(fieldMappingDictionary$FieldMapPair0.b, fieldMappingDictionary$FieldMapPair0.c);
            }
            hashMap0.put(s1, hashMap1);
        }
        this.c = hashMap0;
        batl.s(s);
        this.b = s;
        for(Object object0: hashMap0.keySet()) {
            Map map0 = (Map)this.c.get(((String)object0));
            for(Object object1: map0.keySet()) {
                ((FastJsonResponse.Field)map0.get(((String)object1))).j = this;
            }
        }
    }

    public final Map a(String s) {
        return (Map)this.c.get(s);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        HashMap hashMap0 = this.c;
        for(Object object0: hashMap0.keySet()) {
            stringBuilder0.append(((String)object0));
            stringBuilder0.append(":\n");
            Map map0 = (Map)hashMap0.get(((String)object0));
            for(Object object1: map0.keySet()) {
                stringBuilder0.append("  ");
                stringBuilder0.append(((String)object1));
                stringBuilder0.append(": ");
                stringBuilder0.append(map0.get(((String)object1)));
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = this.c;
        for(Object object0: hashMap0.keySet()) {
            arrayList0.add(new FieldMappingDictionary.Entry(((String)object0), ((Map)hashMap0.get(((String)object0)))));
        }
        baub.y(parcel0, 2, arrayList0, false);
        baub.v(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

