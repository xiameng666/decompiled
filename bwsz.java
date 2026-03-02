import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.appindexing.internal.Thing;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class bwsz {
    public static int a(Thing thing0) {
        long[] arr_v = thing0.c.c();
        if(arr_v == null) {
            return bwsz.e(thing0) ? 2 : 1;
        }
        bwsz.d(thing0);
        return (int)arr_v[0];
    }

    public static int b(glrs glrs0) {
        switch(glrs0.ordinal()) {
            case 3: {
                return 17600;
            }
            case 0: 
            case 18: {
                return 0;
            }
            case 22: {
                return 0x446A;
            }
            case 24: {
                return 17601;
            }
            case 0x20: {
                return 0x4468;
            }
            case 33: {
                return 0x4469;
            }
            case 2: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 19: 
            case 21: 
            case 23: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: {
                return 17510;
            }
            case 20: 
            case 39: {
                return 0x4467;
            }
            case 1: 
            case 5: 
            case 40: {
                throw new IllegalArgumentException("Cannot translate error to be sent to the client: " + glrs0.a());
            }
            case 42: {
                return 0x4470;
            }
            case 4: 
            case 41: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 0x2F: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: {
                return hubu.a.b().i() ? 0x4471 : 17600;
            }
            default: {
                return 17500;
            }
        }
    }

    public static void c(Thing[] arr_thing, String s, Context context0, boolean z, bwtc bwtc0) {
        int v1;
        if(arr_thing == null) {
            throw new bwsy("Indexables cannot be null.", glrs.t);
        }
        if(arr_thing.length > 1000) {
            throw new bwsy("Providing more than 1000 indexables in one update call is not allowed.", glrs.u);
        }
        int v = 0;
        while(v < arr_thing.length) {
            Thing thing0 = arr_thing[v];
            if(thing0 == null) {
                throw new bwsy("Indexable cannot be null.", glrs.t);
            }
            Bundle bundle0 = thing0.b;
            if(bundle0 == null) {
                throw new bwsy("Properties cannot be null.", thing0, glrs.t);
            }
            try {
                if(bbqa.c()) {
                    for(Object object0: bundle0.keySet()) {
                        bundle0.get(((String)object0));
                    }
                }
                else {
                    bundle0.keySet();
                }
            }
            catch(RuntimeException runtimeException0) {
                throw new bwsy("Properties contain bad parcelable.", thing0, glrs.I, runtimeException0);
            }
            Thing thing1 = bwtg.a(thing0);
            arr_thing[v] = thing1;
            try {
                bwsz.g(thing1, s, context0, z, 0, bwtc0);
            }
            catch(bwsy bwsy0) {
                throw new bwsy((bwsy0.getMessage() == null ? bwsy0.toString() : bwsy0.getMessage()), thing1, bwsy0.a);
            }
            hlne hlne0 = bwth.b(thing1);
            if(((ProtoLiteMessage)hlne0).isImmutable()) {
                v1 = ((ProtoLiteMessage)hlne0).t(null);
                if(v1 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v1);
                }
            }
            else {
                int v2 = hlne0.memoizedSerializedSize & 0x7FFFFFFF;
                if(v2 == 0x7FFFFFFF) {
                    v2 = ((ProtoLiteMessage)hlne0).t(null);
                    if(v2 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                    }
                    hlne0.memoizedSerializedSize = hlne0.memoizedSerializedSize & 0x80000000 | v2;
                }
                v1 = v2;
            }
            if(v1 > 30000) {
                throw new bwsy(a.f(v1, "Indexable is ", " bytes, which is larger than the maximum allowed size of 30000 bytes"), thing1, glrs.w);
            }
            ++v;
            s = s;
            context0 = context0;
            z = z;
            bwtc0 = bwtc0;
            continue;
        }
    }

    public static void d(Thing thing0) {
        long[] arr_v = thing0.c.c();
        if(arr_v != null) {
            int v = arr_v.length;
            if(v != 1) {
                throw new bwsy(a.a((v <= 0 ? "unknown" : Arrays.toString(arr_v)), "The scope of this indexable is not valid, scope value is ", "."), thing0, glrs.J);
            }
            if(!gopv.c(((int)arr_v[0]))) {
                v = 1;
                throw new bwsy(a.a((v <= 0 ? "unknown" : Arrays.toString(arr_v)), "The scope of this indexable is not valid, scope value is ", "."), thing0, glrs.J);
            }
        }
    }

    public static boolean e(Thing thing0) {
        boolean[] arr_z = thing0.c.b();
        return arr_z == null || arr_z.length == 0 || arr_z[0];
    }

    private static void f(Thing thing0, String s, Context context0) {
        Intent intent0;
        if(!"com.google.android.gms".equals(s) && bwsz.a(thing0) != 1) {
            try {
                intent0 = hubu.a.b().D() ? Intent.parseUri(thing0.d, 0) : new Intent("android.intent.action.VIEW", Uri.parse(thing0.d));
                intent0.setPackage(s);
            }
            catch(URISyntaxException uRISyntaxException0) {
                throw new bwsy("Unable to parse URI: " + thing0.d + ".", thing0, glrs.p, uRISyntaxException0);
            }
            if(context0.getPackageManager().queryIntentActivities(intent0, 0x10000).isEmpty()) {
                throw new bwsy(a.O(intent0, "Intent \'", "\' cannot be resolved."), thing0, glrs.p);
            }
        }
    }

    private static void g(Thing thing0, String s, Context context0, boolean z, int v, bwtc bwtc0) {
        int v3;
        bwtc bwtc1 = bwtc0;
        if(v > 5) {
            throw new bwsy("Nested Indexable cannot be deeper than 5 levels.", thing0, glrs.g);
        }
        String s1 = thing0.d;
        if(!TextUtils.isEmpty(s1)) {
            try {
                bwtj.b(s1);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new bwsy((illegalArgumentException0.getMessage() == null ? illegalArgumentException0.toString() : illegalArgumentException0.getMessage()), thing0, glrs.v, illegalArgumentException0);
            }
        }
        String[] arr_s = thing0.i("image");
        if(arr_s != null) {
            try {
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    bwtj.b(arr_s[v1]);
                }
            }
            catch(IllegalArgumentException illegalArgumentException1) {
                throw new bwsy((illegalArgumentException1.getMessage() == null ? illegalArgumentException1.toString() : illegalArgumentException1.getMessage()), thing0, glrs.v, illegalArgumentException1);
            }
        }
        String[] arr_s1 = thing0.i("sameAs");
        if(arr_s1 != null) {
            try {
                for(int v2 = 0; v2 < arr_s1.length; ++v2) {
                    bwtj.c(arr_s1[v2]);
                }
            }
            catch(IllegalArgumentException illegalArgumentException2) {
                throw new bwsy((illegalArgumentException2.getMessage() == null ? illegalArgumentException2.toString() : illegalArgumentException2.getMessage()), thing0, glrs.m, illegalArgumentException2);
            }
        }
        if(v == 0) {
            v3 = 0;
        }
        else {
            if(!thing0.c.a()) {
                throw new bwsy("Metadata can only be set on the top-level Indexable.", thing0, glrs.n);
            }
            v3 = v;
        }
        if(z && !thing0.c.a()) {
            throw new bwsy("Metadata can not be set in the patch Indexable.", thing0, glrs.F);
        }
        if(!((Boolean)bwvu.f.b()).booleanValue() && !bwsz.e(thing0)) {
            throw new bwsy("Handling of non-global searchable indexables is not supported yet.", thing0, glrs.c);
        }
        bwsz.d(thing0);
        int v4 = v3 == 0 ? 0 : 1;
        if(v3 == 0) {
            String s2 = thing0.d;
            if(TextUtils.isEmpty(s2)) {
                throw new bwsy("The URL of the top-level Indexable isn\'t set. Call the builder\'s setUrl() method.", thing0, glrs.q);
            }
            if(s2.length() > 0x100) {
                throw new bwsy("URL too long (max 256 characters).", thing0, glrs.x);
            }
            String s3 = thing0.e;
            if(!hubg.k().isEmpty() && bbmt.e(hubg.k().split(","), s3)) {
                throw new bwsy(a.a(s3, "Handling of indexables of type \'", "\' is not supported yet."), thing0, glrs.H);
            }
            if(bwtc1.b.contains(s3)) {
                throw new bwsy(a.a(s3, "Indexable of type ", " can only be used as a parameter in other builders, it cannot be passed to the update() method directly"), thing0, glrs.D);
            }
            String[] arr_s2 = thing0.i("sameAs");
            if(arr_s2 != null && arr_s2.length > 1) {
                throw new bwsy("The sameAs field of the top-level Indexable cannot be repeated.", thing0, glrs.l);
            }
            bwsz.f(thing0, s, context0);
        }
        for(Object object0: bwtc1.b(thing0.e, ((boolean)(v4 ^ 1))).d) {
            bwqj bwqj0 = (bwqj)object0;
            List list0 = bwtc.g(thing0, bwqj0.b);
            if(bwqi.a(bwqj0.c) != 0 && bwqi.a(bwqj0.c) != 1 && list0.size() > 1) {
                throw new bwsy(String.format("The %s field of type %s cannot be repeated.", bwqj0.b, thing0.c()), thing0, glrs.r);
            }
            if(v4 == 0) {
                if(z) {
                    if(!list0.isEmpty() && !((Boolean)bwvu.o.b()).booleanValue()) {
                        throw new bwsy(String.format("The predefined %s field of the top-level Indexable is set. Don\'t call the builder\'s set%s%s() method.", bwqj0.b, bwqj0.b.substring(0, 1).toUpperCase(Locale.US), bwqj0.b.substring(1)), thing0, glrs.F);
                    }
                    continue;
                }
                else {
                    if(bwqi.a(bwqj0.c) != 3 || !list0.isEmpty()) {
                        continue;
                    }
                    throw new bwsy(String.format("The %s field of the top-level Indexable isn\'t set. Call the builder\'s set%s%s() method.", bwqj0.b, bwqj0.b.substring(0, 1).toUpperCase(Locale.US), bwqj0.b.substring(1)), thing0, glrs.q);
                }
                break;
            }
        }
        Bundle bundle0 = thing0.b;
        if(bundle0.size() > 20) {
            throw new bwsy("Indexable contains more than 20 fields.", thing0, glrs.o);
        }
        for(Object object1: bundle0.keySet()) {
            String s4 = (String)object1;
            if(s4 == null) {
                throw new bwsy("Property key cannot be null.", thing0, glrs.t);
            }
            if(s4.length() > 50) {
                throw new bwsy("Key string length is longer than 50, key : " + s4, thing0, glrs.j);
            }
            String[] arr_s3 = thing0.i(s4);
            Thing[] arr_thing = thing0.h(s4);
            long[] arr_v = thing0.g(s4);
            double[] arr_f = thing0.f(s4);
            boolean[] arr_z = thing0.j(s4);
            if(arr_s3 == null) {
                if(arr_thing != null) {
                    if(arr_thing.length > 100) {
                        arr_thing = (Thing[])Arrays.copyOf(arr_thing, 100);
                        bundle0.putParcelableArray(s4, arr_thing);
                    }
                    int v6 = 0;
                    while(v6 < arr_thing.length) {
                        bwsz.g(arr_thing[v6], s, context0, z, v3 + 1, bwtc1);
                        ++v6;
                        bwtc1 = bwtc0;
                    }
                }
                else if(arr_v == null) {
                    if(arr_f == null) {
                        if(arr_z == null) {
                            if(((bundle0.get(s4) instanceof byte[]) ? bundle0.getByteArray(s4) : null) == null) {
                                Object object2 = bundle0.get(s4);
                                if(!z && object2 == null) {
                                    throw new bwsy("Property value cannot be null.", thing0, glrs.t);
                                }
                                if(!z || object2 != null) {
                                    throw new bwsy("Indexable contains unsupported data type.", thing0, glrs.h);
                                }
                            }
                        }
                        else if(arr_z.length > 100) {
                            bundle0.putBooleanArray(s4, Arrays.copyOf(arr_z, 100));
                        }
                    }
                    else if(arr_f.length > 100) {
                        bundle0.putDoubleArray(s4, Arrays.copyOf(arr_f, 100));
                    }
                }
                else if(arr_v.length > 100) {
                    bundle0.putLongArray(s4, Arrays.copyOf(arr_v, 100));
                }
                bwtc1 = bwtc0;
            }
            else {
                if(arr_s3.length > 100) {
                    arr_s3 = (String[])Arrays.copyOf(arr_s3, 100);
                    bundle0.putStringArray(s4, arr_s3);
                }
                for(int v5 = 0; v5 < arr_s3.length; ++v5) {
                    arr_s3[v5] = goqy.b(arr_s3[v5]);
                }
            }
            continue;
        }
    }
}

