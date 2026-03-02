import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class ffmh {
    public static fcez a(ffmg ffmg0) {
        fcez fcez0 = new fcez();
        for(Object object0: ffmg0.a.b) {
            List list0 = ffmg0.b;
            String s = ((ffni)object0).c;
            ffnh ffnh0 = ((ffni)object0).d;
            if(ffnh0 == null) {
                ffnh0 = ffnh.a;
            }
            ffmh.d(list0, fcez0, s, ffnh0);
        }
        return fcez0;
    }

    public static ffmg b(fcez fcez0) {
        ArrayList arrayList0 = new ArrayList();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffnj.a).v_newBuilder();
        TreeSet treeSet0 = new TreeSet(fcez0.h());
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: treeSet0) {
            Object object1 = fcez0.c(((String)object0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffni.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffni ffni0 = (ffni)hftp1.b_message;
            ((String)object0).getClass();
            ffni0.b |= 1;
            ffni0.c = (String)object0;
            ffnh ffnh0 = ffmh.c(arrayList0, object1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffni ffni1 = (ffni)hftp1.b_message;
            ffnh0.getClass();
            ffni1.d = ffnh0;
            ffni1.b |= 2;
            arrayList1.add(((ffni)hftp1.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffnj ffnj0 = (ffnj)hftp0.b_message;
        hfuo hfuo0 = ffnj0.b;
        if(!hfuo0.c()) {
            ffnj0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList1, ffnj0.b);
        return new ffmg(((ffnj)hftp0.N_build()), arrayList0);
    }

    private static ffnh c(List list0, Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffnh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ffnh)hftv0).c = 1;
        ((ffnh)hftv0).b |= 1;
        if(object0 == null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffnh)hftp0.b_message).c = 14;
            ((ffnh)hftp0.b_message).b |= 1;
            return (ffnh)hftp0.N_build();
        }
        int v = 0;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffng.a).v_newBuilder();
        if((object0 instanceof String)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffnh)hftp0.b_message).c = 2;
            ((ffnh)hftp0.b_message).b |= 1;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ffng ffng0 = (ffng)hftp1.b_message;
            ffng0.b |= 2;
            ffng0.d = (String)object0;
        }
        else {
            if((object0 instanceof Integer)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 6;
                ((ffnh)hftp0.b_message).b |= 1;
                int v1 = (int)(((Integer)object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng1 = (ffng)hftp1.b_message;
                ffng1.b |= 0x20;
                ffng1.h = v1;
                goto label_233;
            }
            if((object0 instanceof Long)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 5;
                ((ffnh)hftp0.b_message).b |= 1;
                long v2 = (long)(((Long)object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng2 = (ffng)hftp1.b_message;
                ffng2.b |= 16;
                ffng2.g = v2;
                goto label_233;
            }
            if((object0 instanceof Double)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 3;
                ((ffnh)hftp0.b_message).b |= 1;
                double f = (double)(((Double)object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng3 = (ffng)hftp1.b_message;
                ffng3.b |= 4;
                ffng3.e = f;
                goto label_233;
            }
            if((object0 instanceof Float)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 4;
                ((ffnh)hftp0.b_message).b |= 1;
                float f1 = (float)(((Float)object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng4 = (ffng)hftp1.b_message;
                ffng4.b |= 8;
                ffng4.f = f1;
                goto label_233;
            }
            if((object0 instanceof Boolean)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 8;
                ((ffnh)hftp0.b_message).b |= 1;
                boolean z = ((Boolean)object0).booleanValue();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng5 = (ffng)hftp1.b_message;
                ffng5.b |= 0x80;
                ffng5.j = z;
                goto label_233;
            }
            if((object0 instanceof Byte)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 7;
                ((ffnh)hftp0.b_message).b |= 1;
                int v3 = (byte)(((Byte)object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng6 = (ffng)hftp1.b_message;
                ffng6.b |= 0x40;
                ffng6.i = v3;
                goto label_233;
            }
            if((object0 instanceof byte[])) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 1;
                ((ffnh)hftp0.b_message).b |= 1;
                ByteString hfsf0 = ByteString.copyFrom(((byte[])object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng7 = (ffng)hftp1.b_message;
                ffng7.b |= 1;
                ffng7.c = hfsf0;
                goto label_233;
            }
            if((object0 instanceof String[])) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 11;
                ((ffnh)hftp0.b_message).b |= 1;
                List list1 = Arrays.asList(((String[])object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng8 = (ffng)hftp1.b_message;
                hfuo hfuo0 = ffng8.m;
                if(!hfuo0.c()) {
                    ffng8.m = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list1, ffng8.m);
                goto label_233;
            }
            if((object0 instanceof long[])) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 12;
                ((ffnh)hftp0.b_message).b |= 1;
                List list2 = glxd.g(((long[])object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng9 = (ffng)hftp1.b_message;
                hfui hfui0 = ffng9.n;
                if(!hfui0.c()) {
                    ffng9.n = ProtoLiteMessage.D(hfui0);
                }
                hfrj.E(list2, ffng9.n);
                goto label_233;
            }
            if((object0 instanceof float[])) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 15;
                ((ffnh)hftp0.b_message).b |= 1;
                List list3 = glws.c(((float[])object0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng10 = (ffng)hftp1.b_message;
                hfue hfue0 = ffng10.o;
                if(!hfue0.c()) {
                    ffng10.o = ProtoLiteMessage.B(hfue0);
                }
                hfrj.E(list3, ffng10.o);
                goto label_233;
            }
            if((object0 instanceof Asset)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 13;
                ((ffnh)hftp0.b_message).b |= 1;
                list0.add(((Asset)object0));
                int v4 = list0.size() - 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng11 = (ffng)hftp1.b_message;
                ffng11.b |= 0x100;
                ffng11.p = (long)v4;
                goto label_233;
            }
            if((object0 instanceof fcez)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffnh)hftp0.b_message).c = 9;
                ((ffnh)hftp0.b_message).b |= 1;
                TreeSet treeSet0 = new TreeSet(((fcez)object0).h());
                ffni[] arr_ffni = new ffni[treeSet0.size()];
                for(Object object1: treeSet0) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ffni.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ffni ffni0 = (ffni)hftp2.b_message;
                    ((String)object1).getClass();
                    ffni0.b |= 1;
                    ffni0.c = (String)object1;
                    ffnh ffnh0 = ffmh.c(list0, ((fcez)object0).c(((String)object1)));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ffni ffni1 = (ffni)hftp2.b_message;
                    ffnh0.getClass();
                    ffni1.d = ffnh0;
                    ffni1.b |= 2;
                    arr_ffni[v] = (ffni)hftp2.N_build();
                    ++v;
                }
                List list4 = Arrays.asList(arr_ffni);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng12 = (ffng)hftp1.b_message;
                hfuo hfuo1 = ffng12.k;
                if(!hfuo1.c()) {
                    ffng12.k = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(list4, ffng12.k);
                goto label_233;
            }
            if(!(object0 instanceof ArrayList)) {
                throw new RuntimeException("newFieldValueFromValue: unexpected value " + object0.getClass().getSimpleName());
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffnh)hftp0.b_message).c = 10;
            ((ffnh)hftp0.b_message).b |= 1;
            int v5 = ((ArrayList)object0).size();
            Object object2 = null;
            int v6 = 14;
            while(v < v5) {
                Object object3 = ((ArrayList)object0).get(v);
                ffnh ffnh1 = ffmh.c(list0, object3);
                int v7 = ffnh1.c;
                if(ffnf.a(v7) != 2 && ffnf.a(v7) != 6 && ffnf.a(v7) != 9 && ffnf.a(v7) != 14) {
                    throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + object3.getClass());
                }
                if(v6 == 14) {
                    if(ffnf.a(v7) == 14) {
                        v6 = 14;
                    }
                    else {
                        v6 = ffnf.a(v7) == 0 ? 1 : ffnf.a(v7);
                        object2 = object3;
                        goto label_222;
                    }
                }
                if((ffnf.a(v7) == 0 ? 1 : ffnf.a(v7)) != v6) {
                    throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + object2.getClass() + " and a " + object3.getClass());
                }
            label_222:
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ffng ffng13 = (ffng)hftp1.b_message;
                ffnh1.getClass();
                hfuo hfuo2 = ffng13.l;
                if(!hfuo2.c()) {
                    ffng13.l = ProtoLiteMessage.E(hfuo2);
                }
                ffng13.l.add(ffnh1);
                ++v;
                continue;
            }
        }
    label_233:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffnh ffnh2 = (ffnh)hftp0.b_message;
        ffng ffng14 = (ffng)hftp1.N_build();
        ffng14.getClass();
        ffnh2.d = ffng14;
        ffnh2.b |= 2;
        return (ffnh)hftp0.N_build();
    }

    private static void d(List list0, fcez fcez0, String s, ffnh ffnh0) {
        int v = ffnf.a(ffnh0.c);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v != 14) {
            ffng ffng0 = ffnh0.d == null ? ffng.a : ffnh0.d;
            if(v == 1) {
                fcez0.k(s, ffng0.c.toByteArray());
                return;
            }
            switch(v) {
                case 2: {
                    fcez0.s(s, ffng0.d);
                    return;
                }
                case 3: {
                    fcez0.n(s, ffng0.e);
                    return;
                }
                case 4: {
                    fcez0.o(s, ffng0.f);
                    return;
                }
                case 5: {
                    fcez0.r(s, ffng0.g);
                    return;
                }
                case 6: {
                    fcez0.p(s, ffng0.h);
                    return;
                }
                case 7: {
                    fcez0.a.put(s, Byte.valueOf(((byte)ffng0.i)));
                    return;
                }
                case 8: {
                    fcez0.j(s, ffng0.j);
                    return;
                }
                case 9: {
                    fcez fcez1 = new fcez();
                    for(Object object0: ffng0.k) {
                        ffni ffni0 = (ffni)object0;
                        try {
                            ffmh.d(list0, fcez1, ffni0.c, (ffni0.d == null ? ffnh.a : ffni0.d));
                        }
                        catch(RuntimeException runtimeException0) {
                            throw new RuntimeException("DataBundle parse error for: " + s, runtimeException0);
                        }
                    }
                    fcez0.l(s, fcez1);
                    return;
                }
                case 10: {
                    Iterator iterator1 = ffng0.l.iterator();
                    int v2 = 14;
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        ffnh ffnh1 = (ffnh)object1;
                        if(v2 == 14) {
                            int v3 = ffnh1.c;
                            switch(ffnf.a(v3)) {
                                case 2: 
                                case 6: 
                                case 9: {
                                    int v5 = ffnf.a(v3);
                                    v2 = v5 == 0 ? 1 : v5;
                                    continue;
                                }
                                case 14: {
                                    v2 = 14;
                                    continue;
                                }
                                default: {
                                    int v4 = ffnf.a(v3);
                                    if(v4 != 0) {
                                        v1 = v4;
                                    }
                                    throw new IllegalArgumentException(a.l(s, Integer.toString(v1), "Unexpected TypedValue type: ", " for key "));
                                }
                            }
                            break;
                        }
                        if((ffnf.a(ffnh1.c) == 0 ? 1 : ffnf.a(ffnh1.c)) != v2) {
                            String s1 = Integer.toString(v2);
                            int v6 = ffnf.a(ffnh1.c);
                            if(v6 != 0) {
                                v1 = v6;
                            }
                            throw new IllegalArgumentException(a.ai(Integer.toString(v1), s1, s, "The ArrayList elements should all be the same type, but ArrayList with key ", " contains items of type ", " and "));
                        }
                    }
                    ArrayList arrayList0 = new ArrayList(ffng0.l.size());
                    for(Object object2: ffng0.l) {
                        ffnh ffnh2 = (ffnh)object2;
                        if(ffnf.a(ffnh2.c) == 14) {
                            arrayList0.add(null);
                        }
                        else {
                            if(v2 != 9) {
                                if(v2 == 2) {
                                    arrayList0.add((ffnh2.d == null ? ffng.a : ffnh2.d).d);
                                }
                                else {
                                    if(v2 != 6) {
                                        throw new IllegalArgumentException("Unexpected typeOfArrayList: " + Integer.toString(v2));
                                    }
                                    arrayList0.add(Integer.valueOf((ffnh2.d == null ? ffng.a : ffnh2.d).h));
                                }
                                continue;
                            }
                            fcez fcez2 = new fcez();
                            for(Object object3: (ffnh2.d == null ? ffng.a : ffnh2.d).k) {
                                String s2 = ((ffni)object3).c;
                                ffnh ffnh3 = ((ffni)object3).d;
                                if(ffnh3 == null) {
                                    ffnh3 = ffnh.a;
                                }
                                ffmh.d(list0, fcez2, s2, ffnh3);
                            }
                            arrayList0.add(fcez2);
                        }
                    }
                    if(v2 == 14) {
                        fcez0.t(s, arrayList0);
                        return;
                    }
                    if(v2 == 9) {
                        fcez0.m(s, arrayList0);
                        return;
                    }
                    if(v2 == 2) {
                        fcez0.t(s, arrayList0);
                        return;
                    }
                    if(v2 != 6) {
                        throw new IllegalStateException("Unexpected typeOfArrayList: " + Integer.toString(v2));
                    }
                    fcez0.q(s, arrayList0);
                    return;
                }
                case 11: {
                    String[] arr_s = (String[])ffng0.m.toArray(new String[0]);
                    fcez0.a.put(s, arr_s);
                    return;
                }
                case 12: {
                    long[] arr_v = glxd.j(ffng0.n);
                    fcez0.a.put(s, arr_v);
                    return;
                }
                case 13: {
                    Asset asset0 = (Asset)list0.get(((int)ffng0.p));
                    fcez0.a.put(s, asset0);
                    return;
                }
                case 15: {
                    float[] arr_f = glws.d(ffng0.o);
                    fcez0.a.put(s, arr_f);
                    return;
                }
                default: {
                    throw new RuntimeException("populateBundle: unexpected type " + Integer.toString(v));
                }
            }
        }
        fcez0.s(s, null);
    }
}

