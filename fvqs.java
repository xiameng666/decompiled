import j..util.DesugarTimeZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class fvqs implements Runnable {
    public final fvqt a;
    public final Calendar b;
    public final gwvi c;

    public fvqs(fvqt fvqt0, Calendar calendar0, gwvi gwvi0) {
        this.a = fvqt0;
        this.b = calendar0;
        this.c = gwvi0;
    }

    @Override
    public final void run() {
        fvsl fvsl3;
        Iterator iterator15;
        long v37;
        Map.Entry map$Entry7;
        Iterator iterator12;
        TreeMap treeMap3;
        HashMap hashMap3;
        HashMap hashMap2;
        gwvt gwvt4;
        long v31;
        Calendar calendar1;
        int v19;
        List list0;
        ArrayList arrayList2;
        Integer integer0;
        Boolean boolean0;
        double[][] arr2_f;
        int v15;
        float f10;
        float f5;
        float f4;
        hfuo hfuo3;
        float f3;
        hfuo hfuo2;
        float f1;
        float f;
        fvuf fvuf0;
        gwvi gwvi0 = this.c;
        if(gwvi0.f.size() != 0) {
            gwtl gwtl0 = (gwtl)gwvi0.f.get(0);
            if((gwtl0.b & 0x20) != 0) {
                gwuv gwuv0 = gwtl0.h == null ? gwuv.a : gwtl0.h;
                hfuo hfuo0 = gwuv0.l;
                hfuo hfuo1 = gwuv0.f;
                if(hfuo0 == null) {
                    fvuf0 = new fvuf(Boolean.valueOf(false), ((double)0.0));
                    f = 0.0f;
                }
                else {
                    int v = hfuo0.size();
                    if(v <= 3) {
                        f1 = 0.0f;
                    }
                    else {
                        int v1 = 0;
                        for(int v2 = 3; v2 < v; ++v2) {
                            v1 += ((gwsh)hfuo0.get(v2)).c.size();
                        }
                        f1 = ((float)v1) / ((float)(v - 3));
                    }
                    float f2 = fvqo.a(hfuo0, true);
                    int v3 = hfuo0.size();
                    if(v3 < 5) {
                        hfuo2 = hfuo0;
                        f3 = 360.0f;
                        f = 0.0f;
                    }
                    else {
                        long v4 = ((long)((gwsh)hfuo0.get(v3 - 1)).b) / 2L;
                        ArrayList arrayList0 = new ArrayList();
                        Iterator iterator0 = hfuo0.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                hfuo2 = hfuo0;
                                f = 0.0f;
                                break;
                            }
                            Object object0 = iterator0.next();
                            hfuo2 = hfuo0;
                            if(((long)((gwsh)object0).b) > v4) {
                                break;
                            }
                            arrayList0.add(((gwsh)object0));
                            hfuo0 = hfuo2;
                        }
                        f3 = fvqo.a(arrayList0, true);
                    }
                    int v5 = hfuo2.size();
                    if(v5 < 5) {
                        hfuo3 = hfuo2;
                        f4 = 360.0f;
                    }
                    else {
                        int v6 = v5 - 1;
                        hfuo3 = hfuo2;
                        long v7 = ((long)((gwsh)hfuo3.get(v6)).b) / 2L;
                        ArrayList arrayList1 = new ArrayList();
                        while(v6 >= 0) {
                            gwsh gwsh0 = (gwsh)hfuo3.get(v6);
                            if(((long)gwsh0.b) <= v7) {
                                break;
                            }
                            arrayList1.add(gwsh0);
                            --v6;
                        }
                        Collections.reverse(arrayList1);
                        f4 = fvqo.a(arrayList1, false);
                    }
                    int v8 = hfuo3.size();
                    if(v8 <= 3) {
                        f5 = 0.0f;
                    }
                    else {
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        for(int v9 = 0; v9 < v8; ++v9) {
                            if(v9 >= 3) {
                                gwsh gwsh1 = (gwsh)hfuo3.get(v9);
                                float f8 = 0.0f;
                                for(int v10 = 0; v10 < gwsh1.c.size(); ++v10) {
                                    float f9 = ((gwsg)gwsh1.c.get(v10)).b;
                                    if((f9 > 18.0f)) {
                                        f8 += f9 - 18.0f;
                                    }
                                }
                                if((f8 > 0.0f)) {
                                    f7 += f8;
                                    ++f6;
                                }
                            }
                        }
                        f5 = f6 == 0.0f ? 0.0f : f7 / f6;
                    }
                    int v11 = hfuo3.size();
                    if(v11 <= 3) {
                        f10 = 0.0f;
                    }
                    else {
                        float f11 = 0.0f;
                        int v12 = 0;
                        int v13 = 0;
                        while(v12 < v11) {
                            if(v12 >= 3) {
                                gwsh gwsh2 = (gwsh)hfuo3.get(v12);
                                float f12 = 0.0f;
                                int v14 = 0;
                                while(v14 < gwsh2.c.size()) {
                                    gwsg gwsg0 = (gwsg)gwsh2.c.get(v14);
                                    float f13 = gwsg0.c;
                                    if((gwsg0.b > 18.0f) && (f13 > f12)) {
                                        f12 = f13;
                                    }
                                    ++v14;
                                    v11 = v11;
                                }
                                v15 = v11;
                                f11 += f12;
                                ++v13;
                            }
                            else {
                                v15 = v11;
                            }
                            ++v12;
                            v11 = v15;
                        }
                        f10 = f11 / ((float)v13);
                    }
                    double f14 = 1.0 / (Math.pow(2.718282, -(((double)f1) * -0.1323 + 0.7071 + ((double)f2) * -0.0256 + ((double)f3) * -0.0013 + ((double)f4) * 0.0349 + ((double)f5) * -0.0907 + ((double)f10) * -0.009)) + 1.0);
                    int v16 = f14 >= 0.5 ? 1 : 0;
                    if(v16 == 0) {
                        f14 = 1.0 - f14;
                    }
                    fvuf0 = new fvuf(Boolean.valueOf(((boolean)v16)), f14);
                }
                if(hfuo1 == null) {
                    arr2_f = null;
                }
                else if(((long)hfuo1.size()) < 200L) {
                    arr2_f = null;
                }
                else {
                    int v17 = hfuo1.size();
                    double f15 = 0.0;
                    double f16 = 0.0;
                    double f17 = 0.0;
                    double f18 = 0.0;
                    double f19 = 0.0;
                    double f20 = 0.0;
                    Iterator iterator1 = hfuo1.iterator();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        double f21 = f15 + ((double)((gwul)object1).c);
                        f18 += Math.pow(((gwul)object1).c, 2.0);
                        f16 += (double)((gwul)object1).d;
                        f19 += Math.pow(((gwul)object1).d, 2.0);
                        f17 += (double)((gwul)object1).e;
                        f20 += Math.pow(((gwul)object1).e, 2.0);
                        iterator1 = iterator1;
                        f15 = f21;
                    }
                    double f22 = f15 / ((double)v17);
                    double f23 = f16 / ((double)v17);
                    double f24 = f17 / ((double)v17);
                    arr2_f = new double[][]{new double[]{f22, f23, f24}, new double[]{f18 / ((double)v17) - Math.pow(f22, 2.0), f19 / ((double)v17) - Math.pow(f23, 2.0), f20 / ((double)v17) - Math.pow(f24, 2.0)}};
                }
                if(arr2_f == null) {
                    boolean0 = null;
                }
                else {
                    double[] arr_f = arr2_f[1];
                    boolean z = (arr_f[0] < 0.00008) && (arr_f[1] < 0.00008) && (arr_f[2] < 0.00008) ? 1 : false;
                    boolean0 = Boolean.valueOf(z);
                }
                if(gwuv0 != null && gwuv0.j.size() != 0) {
                    float f25 = 0.0f;
                    int v18 = 0;
                    for(Object object2: gwuv0.j) {
                        gwtr gwtr0 = (gwtr)object2;
                        if((gwtr0.b & 0x40) != 0 && (gwtq.a(gwtr0.f) == 0 || gwtq.a(gwtr0.f) == 1) && (gwtr0.b & 0x4000) != 0) {
                            ++v18;
                            float f26 = gwtr0.j;
                            if((f26 >= f25)) {
                                f = f25;
                                f25 = f26;
                            }
                        }
                    }
                    integer0 = v18 >= 2 ? ((int)((f25 + f) / 2.0f * 10.0f)) : null;
                }
                else {
                    integer0 = null;
                }
                fvqt fvqt0 = this.a;
                fvur fvur0 = new fvur(fvqt0.b.b(), fvqt0.c.e());
                try {
                    gwvt gwvt0 = (gwvt)fvur0.a(((Parser)((ProtoLiteMessage)gwvt.a).jf(7, null)));
                    arrayList2 = new ArrayList(gwvt0.b);
                    list0 = new ArrayList(gwvt0.c);
                }
                catch(IOException unused_ex) {
                    arrayList2 = new ArrayList();
                    list0 = new ArrayList();
                }
                Calendar calendar0 = this.b;
                String s = calendar0.getTimeZone().getID();
                if(s == null) {
                    v19 = -1;
                    goto label_215;
                }
                else {
                    int v20 = 0;
                    Iterator iterator3 = arrayList2.iterator();
                    while(true) {
                        if(!iterator3.hasNext()) {
                            v19 = v20 + 1;
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwwc.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((gwwc)hftv0).b |= 1;
                            ((gwwc)hftv0).c = s;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwwc gwwc1 = (gwwc)hftp0.b_message;
                            gwwc1.b |= 2;
                            gwwc1.d = v19;
                            arrayList2.add(((gwwc)hftp0.N_build()));
                            break;
                        }
                        Object object3 = iterator3.next();
                        gwwc gwwc0 = (gwwc)object3;
                        if((gwwc0.b & 1) != 0 && (gwwc0.b & 2) != 0) {
                            int v21 = gwwc0.d;
                            if(s.equalsIgnoreCase(gwwc0.c)) {
                                v19 = v21;
                                break;
                            }
                            v20 = Math.max(v20, v21);
                        }
                    }
                label_215:
                    if(v19 >= 0) {
                        long v22 = calendar0.getTimeInMillis();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwvs.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp1.b_message;
                        ((gwvs)hftv1).b |= 1;
                        ((gwvs)hftv1).c = v22;
                        if(!hftv1.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gwvs gwvs0 = (gwvs)hftp1.b_message;
                        gwvs0.b |= 2;
                        gwvs0.d = v19;
                        Boolean boolean1 = (Boolean)fvuf0.a;
                        if(!boolean1.booleanValue()) {
                            boolean z1 = boolean1.booleanValue();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwvs gwvs1 = (gwvs)hftp1.b_message;
                            gwvs1.b |= 4;
                            gwvs1.e = z1;
                        }
                        Object object4 = fvuf0.b;
                        if(object4 != null) {
                            double f27 = ((double)(((Double)object4))) * 100.0;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwvs gwvs2 = (gwvs)hftp1.b_message;
                            gwvs2.b |= 8;
                            gwvs2.f = (int)f27;
                        }
                        if(boolean0 != null && boolean0.booleanValue()) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwvs gwvs3 = (gwvs)hftp1.b_message;
                            gwvs3.b |= 16;
                            gwvs3.g = true;
                        }
                        if(integer0 != null) {
                            int v23 = (int)integer0;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gwvs gwvs4 = (gwvs)hftp1.b_message;
                            gwvs4.b |= 0x20;
                            gwvs4.h = v23;
                        }
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gwvs gwvs5 = (gwvs)hftp1.b_message;
                        gwvs5.b |= 0x40;
                        gwvs5.i = 1;
                        gwvs gwvs6 = (gwvs)hftp1.N_build();
                        if(gwvs6 != null) {
                            int v24 = list0.size();
                            if(v24 > 1000) {
                                list0 = list0.subList(12, v24);
                            }
                            list0.add(gwvs6);
                        }
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwvt.a).v_newBuilder();
                        int v25 = arrayList2.size();
                        for(int v26 = 0; v26 < v25; ++v26) {
                            gwwc gwwc2 = (gwwc)arrayList2.get(v26);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvt gwvt1 = (gwvt)hftp2.b_message;
                            gwwc2.getClass();
                            hfuo hfuo4 = gwvt1.b;
                            if(!hfuo4.c()) {
                                gwvt1.b = ProtoLiteMessage.E(hfuo4);
                            }
                            gwvt1.b.add(gwwc2);
                        }
                        for(Object object5: list0) {
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            gwvt gwvt2 = (gwvt)hftp2.b_message;
                            ((gwvs)object5).getClass();
                            hfuo hfuo5 = gwvt2.c;
                            if(!hfuo5.c()) {
                                gwvt2.c = ProtoLiteMessage.E(hfuo5);
                            }
                            gwvt2.c.add(((gwvs)object5));
                        }
                        gwvt gwvt3 = (gwvt)hftp2.N_build();
                        try {
                            fvur0.b(fvur0.c(((MessageLite)gwvt3)));
                        }
                        catch(IOException unused_ex) {
                        }
                        fvsl fvsl0 = (fvsl)fvrf.a.get(0);
                        HashMap hashMap0 = new HashMap();
                        for(Object object6: gwvt3.b) {
                            gwwc gwwc3 = (gwwc)object6;
                            if((gwwc3.b & 2) != 0 && (gwwc3.b & 1) != 0) {
                                hashMap0.put(Integer.valueOf(gwwc3.d), gwwc3.c);
                            }
                        }
                        Set set0 = hashMap0.entrySet();
                        HashMap hashMap1 = new HashMap(set0.size());
                        Iterator iterator6 = set0.iterator();
                        while(iterator6.hasNext()) {
                            Object object7 = iterator6.next();
                            Map.Entry map$Entry0 = (Map.Entry)object7;
                            Integer integer1 = (Integer)map$Entry0.getKey();
                            TreeMap treeMap0 = new TreeMap();
                            for(Object object8: gwvt3.c) {
                                gwvs gwvs7 = (gwvs)object8;
                                if(gwvs7.d == ((int)integer1)) {
                                    if((gwvs7.b & 2) != 0 && (gwvs7.b & 1) != 0) {
                                        String s1 = (String)hashMap0.get(Integer.valueOf(gwvs7.d));
                                        if(s1 == null) {
                                            calendar1 = null;
                                        }
                                        else {
                                            calendar1 = Calendar.getInstance(DesugarTimeZone.getTimeZone(s1));
                                            calendar1.setTimeInMillis(gwvs7.c);
                                        }
                                    }
                                    else {
                                        calendar1 = null;
                                    }
                                    if(calendar1 != null) {
                                        switch(calendar1.get(7)) {
                                            case 1: 
                                            case 7: {
                                                continue;
                                            }
                                            default: {
                                                if(!fvsl0.i(calendar1)) {
                                                    continue;
                                                }
                                                long v27 = fvsl.c(calendar1);
                                                Long long0 = (long)(v27 - (v27 - fvsl0.b) % 600000L);
                                                fvqv fvqv0 = (fvqv)treeMap0.get(long0);
                                                boolean z2 = gwvs7.e ? true : gwvs7.g;
                                                if(fvqv0 == null) {
                                                    treeMap0.put(long0, new fvqv(((int)z2)));
                                                }
                                                else {
                                                    if(z2) {
                                                        ++fvqv0.a;
                                                    }
                                                    ++fvqv0.b;
                                                }
                                                hashMap1 = hashMap1;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            TreeMap treeMap1 = new TreeMap();
                            for(Object object9: treeMap0.entrySet()) {
                                Long long1 = (Long)((Map.Entry)object9).getKey();
                                fvqv fvqv1 = (fvqv)((Map.Entry)object9).getValue();
                                treeMap1.put(long1, new fvuf(((int)fvqv1.a), ((int)fvqv1.b)));
                            }
                            TreeMap treeMap2 = new TreeMap();
                            for(Object object10: treeMap1.entrySet()) {
                                Long long2 = (Long)((Map.Entry)object10).getKey();
                                Integer integer2 = (Integer)((fvuf)((Map.Entry)object10).getValue()).a;
                                Integer integer3 = (Integer)((fvuf)((Map.Entry)object10).getValue()).b;
                                if(integer3 != null) {
                                    double f28 = (double)(((int)integer2));
                                    long v28 = (long)(((int)integer3));
                                    fvqu fvqu0 = fvqu.f;
                                    if(Long.compare(v28, 3L) >= 0) {
                                        float f29 = (float)(f28 / ((double)v28));
                                        if((f29 >= 0.8f)) {
                                            fvqu0 = fvqu.a;
                                        }
                                        else if((f29 <= 0.2f)) {
                                            fvqu0 = fvqu.c;
                                        }
                                        else {
                                            fvqu0 = fvqu.e;
                                        }
                                    }
                                    else if(v28 > 0L) {
                                        if(f28 == ((double)v28)) {
                                            fvqu0 = fvqu.b;
                                        }
                                        else if(f28 == 0.0) {
                                            fvqu0 = fvqu.d;
                                        }
                                    }
                                    treeMap2.put(long2, fvqu0);
                                }
                            }
                            long v29 = fvsl0.b;
                            for(long v30 = v29; true; v30 += 600000L) {
                                v31 = fvsl0.c;
                                if(v30 >= v31) {
                                    break;
                                }
                                Long long3 = v30;
                                if(!treeMap2.containsKey(long3)) {
                                    treeMap2.put(long3, fvqu.f);
                                }
                            }
                            for(Object object11: treeMap2.entrySet()) {
                                Map.Entry map$Entry1 = (Map.Entry)object11;
                                if(map$Entry1.getValue() == fvqu.b) {
                                    Map.Entry map$Entry2 = treeMap2.lowerEntry(((Long)map$Entry1.getKey()));
                                    Map.Entry map$Entry3 = treeMap2.higherEntry(((Long)map$Entry1.getKey()));
                                    if(map$Entry2 != null && map$Entry2.getValue() != fvqu.a || map$Entry3 != null && map$Entry3.getValue() != fvqu.a) {
                                        continue;
                                    }
                                    map$Entry1.setValue(fvqu.a);
                                }
                                else {
                                    if(map$Entry1.getValue() != fvqu.d) {
                                        continue;
                                    }
                                    Map.Entry map$Entry4 = treeMap2.lowerEntry(((Long)map$Entry1.getKey()));
                                    Map.Entry map$Entry5 = treeMap2.higherEntry(((Long)map$Entry1.getKey()));
                                    if(map$Entry4 != null && map$Entry4.getValue() != fvqu.c || map$Entry5 != null && map$Entry5.getValue() != fvqu.c) {
                                        continue;
                                    }
                                    map$Entry1.setValue(fvqu.c);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if(treeMap2.isEmpty()) {
                                gwvt4 = gwvt3;
                                hashMap2 = hashMap0;
                            }
                            else {
                                long v32 = -1L;
                                fvqu fvqu1 = null;
                                Object object12 = null;
                                Iterator iterator11 = treeMap2.entrySet().iterator();
                                while(iterator11.hasNext()) {
                                    Object object13 = iterator11.next();
                                    Map.Entry map$Entry6 = (Map.Entry)object13;
                                    fvqu fvqu2 = (fvqu)map$Entry6.getValue();
                                    if(v32 == -1L) {
                                        hashMap3 = hashMap0;
                                        if(fvqu2 == fvqu.a || fvqu2 == fvqu.c) {
                                            v32 = (long)(((Long)map$Entry6.getKey()));
                                            fvqu1 = (fvqu)map$Entry6.getValue();
                                        }
                                    }
                                    else {
                                        hashMap3 = hashMap0;
                                        if(fvqu2 != fvqu1) {
                                            gftb.check(object12);
                                            if(((long)(((Long)object12))) - v32 + 600000L >= 900000L) {
                                                treeMap3 = treeMap2;
                                                iterator12 = iterator11;
                                                arrayList3.add(new fvsl(v32, Math.min(v31, ((long)(((Long)object12))) + 600000L)));
                                            }
                                            else {
                                                treeMap3 = treeMap2;
                                                iterator12 = iterator11;
                                            }
                                            if(fvqu2 != fvqu.a && fvqu2 != fvqu.c) {
                                                v32 = -1L;
                                                fvqu1 = null;
                                            }
                                            else {
                                                v32 = (long)(((Long)map$Entry6.getKey()));
                                                fvqu1 = (fvqu)map$Entry6.getValue();
                                            }
                                            goto label_443;
                                        }
                                    }
                                    treeMap3 = treeMap2;
                                    iterator12 = iterator11;
                                label_443:
                                    object12 = (Long)map$Entry6.getKey();
                                    hashMap0 = hashMap3;
                                    gwvt3 = gwvt3;
                                    treeMap2 = treeMap3;
                                    iterator11 = iterator12;
                                }
                                gwvt4 = gwvt3;
                                hashMap2 = hashMap0;
                                if(v32 != -1L) {
                                    Long long4 = (Long)treeMap2.lastKey();
                                    if(long4 != null && ((long)long4) - v32 + 600000L >= 900000L) {
                                        arrayList3.add(new fvsl(v32, Math.min(v31, ((long)long4) + 600000L)));
                                    }
                                }
                            }
                            String s2 = (String)map$Entry0.getValue();
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(fvsl0);
                            for(Object object14: arrayList3) {
                                long v33 = ((fvsl)object14).b;
                                if(v33 != v29) {
                                    v33 += 150000L;
                                }
                                long v34 = ((fvsl)object14).c;
                                if(v34 != v31) {
                                    v34 += -150000L;
                                }
                                if(v34 > v33) {
                                    fvsl fvsl1 = new fvsl(v33, v34);
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator iterator14 = arrayList4.iterator();
                                    while(iterator14.hasNext()) {
                                        Object object15 = iterator14.next();
                                        fvsl fvsl2 = (fvsl)object15;
                                        long v35 = fvsl1.c;
                                        long v36 = fvsl2.b;
                                        if(v35 > v36) {
                                            map$Entry7 = map$Entry0;
                                            v37 = v29;
                                            long v38 = fvsl1.b;
                                            iterator15 = iterator6;
                                            fvsl3 = fvsl1;
                                            long v39 = fvsl2.c;
                                            if(v38 >= v39) {
                                                arrayList5.add(fvsl2);
                                            }
                                            else if(v38 > v36) {
                                                if(v39 > v35) {
                                                    arrayList5.add(new fvsl(v36, v38));
                                                    arrayList5.add(new fvsl(v35, v39));
                                                }
                                                else {
                                                    arrayList5.add(new fvsl(v36, v38));
                                                }
                                            }
                                            else if(v39 > v35) {
                                                arrayList5.add(new fvsl(v35, v39));
                                            }
                                        }
                                        else {
                                            fvsl3 = fvsl1;
                                            map$Entry7 = map$Entry0;
                                            v37 = v29;
                                            iterator15 = iterator6;
                                            arrayList5.add(fvsl2);
                                        }
                                        iterator6 = iterator15;
                                        fvsl0 = fvsl0;
                                        iterator14 = iterator14;
                                        map$Entry0 = map$Entry7;
                                        v29 = v37;
                                        fvsl1 = fvsl3;
                                    }
                                    arrayList4 = arrayList5;
                                }
                            }
                            for(Object object16: arrayList4) {
                                fvsl fvsl4 = (fvsl)object16;
                            }
                            hashMap1.put(((String)map$Entry0.getValue()), arrayList4);
                            hashMap1 = hashMap1;
                            iterator6 = iterator6;
                            fvsl0 = fvsl0;
                            hashMap0 = hashMap2;
                            gwvt3 = gwvt4;
                        }
                        fvqn fvqn0 = fvqt0.d;
                        long v40 = fvqt0.a.c();
                        ArrayList arrayList6 = new ArrayList(hashMap1.size());
                        for(Object object17: hashMap1.entrySet()) {
                            arrayList6.add(new fvqm(((String)((Map.Entry)object17).getKey()), ((List)((Map.Entry)object17).getValue())));
                        }
                        synchronized(fvqn0) {
                            fvqn0.i = gged_interceptors.i(arrayList6);
                            fvqn0.d = v40;
                        }
                    }
                }
            }
        }
    }
}

