package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bata;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfuy;
import gops;
import goqw;
import goqx;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, gops {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final Bundle b;
    public final Thing.Metadata c;
    public final String d;
    public final String e;

    static {
        Thing.CREATOR = new goqx();
    }

    public Thing(int v, Bundle bundle0, Thing.Metadata thing$Metadata0, String s, String s1) {
        this.a = v;
        this.b = bundle0;
        this.c = thing$Metadata0;
        this.d = s;
        this.e = s1;
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        gfuy.e(classLoader0);
        bundle0.setClassLoader(classLoader0);
    }

    public Thing(Bundle bundle0, Thing.Metadata thing$Metadata0, String s, String s1) {
        this.a = 10;
        this.b = bundle0;
        this.c = thing$Metadata0;
        this.d = s;
        this.e = s1;
    }

    public static int a(Bundle bundle0) {
        ArrayList arrayList0 = new ArrayList(bundle0.keySet());
        Collections.sort(arrayList0);
        ArrayList arrayList1 = new ArrayList();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = bundle0.get(((String)arrayList0.get(v1)));
            if((object0 instanceof boolean[])) {
                arrayList1.add(Integer.valueOf(Arrays.hashCode(((boolean[])object0))));
            }
            else if((object0 instanceof long[])) {
                arrayList1.add(Integer.valueOf(Arrays.hashCode(((long[])object0))));
            }
            else if((object0 instanceof double[])) {
                arrayList1.add(Integer.valueOf(Arrays.hashCode(((double[])object0))));
            }
            else if((object0 instanceof byte[])) {
                arrayList1.add(Integer.valueOf(Arrays.hashCode(((byte[])object0))));
            }
            else if((object0 instanceof Object[])) {
                arrayList1.add(Integer.valueOf(Arrays.hashCode(((Object[])object0))));
            }
            else {
                arrayList1.add(Integer.valueOf(Arrays.hashCode(new Object[]{object0})));
            }
        }
        return Arrays.hashCode(arrayList1.toArray());
    }

    public final String b() {
        String[] arr_s = this.i("name");
        return arr_s == null || arr_s.length != 1 ? null : arr_s[0];
    }

    public final String c() {
        return this.e.equals("Thing") ? "Indexable" : this.e;
    }

    public static void d(Bundle bundle0, StringBuilder stringBuilder0) {
        try {
            Set set0 = bundle0.keySet();
            String[] arr_s = (String[])set0.toArray(new String[set0.size()]);
            Arrays.sort(arr_s, new goqw());
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                stringBuilder0.append("{ key: \'");
                stringBuilder0.append(s);
                stringBuilder0.append("\' value: ");
                Object object0 = bundle0.get(s);
                if(object0 == null) {
                    stringBuilder0.append("<null>");
                }
                else if(object0.getClass().isArray()) {
                    stringBuilder0.append("[ ");
                    for(int v1 = 0; v1 < Array.getLength(object0); ++v1) {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(Array.get(object0, v1));
                        stringBuilder0.append("\' ");
                    }
                    stringBuilder0.append("]");
                }
                else {
                    stringBuilder0.append(object0.toString());
                }
                stringBuilder0.append(" } ");
            }
        }
        catch(RuntimeException unused_ex) {
            stringBuilder0.append("<error>");
        }
    }

    public static boolean e(Bundle bundle0, Bundle bundle1) {
        if(bundle0.size() != bundle1.size()) {
            return false;
        }
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            Object object2 = bundle1.get(s);
            if((object1 instanceof Bundle) && (object2 instanceof Bundle) && !Thing.e(((Bundle)object1), ((Bundle)object2))) {
                return false;
            }
            if(object1 == null) {
                if(object2 == null && bundle1.containsKey(s)) {
                    object2 = null;
                    goto label_15;
                }
                return false;
            }
        label_15:
            if((object1 instanceof boolean[])) {
                if((object2 instanceof boolean[]) && Arrays.equals(((boolean[])object1), ((boolean[])object2))) {
                    continue;
                }
                return false;
            }
            else if((object1 instanceof long[])) {
                if((object2 instanceof long[]) && Arrays.equals(((long[])object1), ((long[])object2))) {
                    continue;
                }
                return false;
            }
            else if((object1 instanceof double[])) {
                if((object2 instanceof double[]) && Arrays.equals(((double[])object1), ((double[])object2))) {
                    continue;
                }
                return false;
            }
            else if((object1 instanceof byte[])) {
                if((object2 instanceof byte[]) && Arrays.equals(((byte[])object1), ((byte[])object2))) {
                    continue;
                }
                return false;
            }
            else {
                if((object1 instanceof Object[]) && (!(object2 instanceof Object[]) || !Arrays.equals(((Object[])object1), ((Object[])object2)))) {
                    return false;
                }
                continue;
            }
            break;
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Thing) ? bata.b(Integer.valueOf(this.a), Integer.valueOf(((Thing)object0).a)) && bata.b(this.d, ((Thing)object0).d) && bata.b(this.e, ((Thing)object0).e) && bata.b(this.c, ((Thing)object0).c) && Thing.e(this.b, ((Thing)object0).b) : false;
    }

    public final double[] f(String s) {
        return (this.b.get(s) instanceof double[]) ? this.b.getDoubleArray(s) : null;
    }

    public final long[] g(String s) {
        return (this.b.get(s) instanceof long[]) ? this.b.getLongArray(s) : null;
    }

    public final Thing[] h(String s) {
        Bundle bundle0 = this.b;
        if((bundle0.get(s) instanceof Parcelable[])) {
            Parcelable[] arr_parcelable = bundle0.getParcelableArray(s);
            return arr_parcelable == null ? null : ((Thing[])Arrays.copyOf(arr_parcelable, arr_parcelable.length, Thing[].class));
        }
        return null;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Thing.a(this.b);
        return Arrays.hashCode(new Object[]{((int)this.a), this.d, this.e, this.c.hashCode(), integer0});
    }

    public final String[] i(String s) {
        return (this.b.get(s) instanceof String[]) ? this.b.getStringArray(s) : null;
    }

    public final boolean[] j(String s) {
        return (this.b.get(s) instanceof boolean[]) ? this.b.getBooleanArray(s) : null;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.c());
        stringBuilder0.append(" { { id: ");
        String s = this.d;
        if(s == null) {
            stringBuilder0.append("<null>");
        }
        else {
            stringBuilder0.append("\'");
            stringBuilder0.append(s);
            stringBuilder0.append("\'");
        }
        stringBuilder0.append(" } Properties { ");
        Thing.d(this.b, stringBuilder0);
        stringBuilder0.append("} Metadata { ");
        stringBuilder0.append(this.c.toString());
        stringBuilder0.append(" } }");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        goqx.a(this, parcel0, v);
    }
}

