import android.content.Context;
import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public final class czzx {
    static int a(List list0, int v, int v1) {
        Integer integer0 = v;
        if(list0.contains(integer0) && list0.indexOf(integer0) >= v1) {
            list0.remove(integer0);
            list0.add(v1, integer0);
            return v1 + 1;
        }
        return v1;
    }

    static List b(List list0) {
        if(list0.isEmpty()) {
            return ggna.a;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ScanResult scanResult0 = (ScanResult)object0;
            if(czmk.I(scanResult0.frequency)) {
                arrayList0.add(Integer.valueOf(scanResult0.frequency));
            }
        }
        return czzx.e(arrayList0);
    }

    static List c(List list0, int v) {
        if(list0.isEmpty()) {
            return ggna.a;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ScanResult scanResult0 = (ScanResult)object0;
            if(czmk.J(scanResult0.frequency)) {
                ArrayList arrayList1 = new ArrayList();
            alab1:
                switch(v) {
                    case 0: {
                        switch(scanResult0.channelWidth) {
                            case 0: {
                                arrayList1.add(Integer.valueOf(scanResult0.frequency));
                                break alab1;
                            }
                            case 1: {
                                for(Object object1: hvog.bh().b) {
                                    Integer integer0 = (Integer)object1;
                                    int v1 = (int)integer0;
                                    if(scanResult0.centerFreq0 - 20 < v1 && v1 < scanResult0.centerFreq0 + 20) {
                                        arrayList1.add(integer0);
                                    }
                                }
                                break alab1;
                            }
                            case 2: {
                                for(Object object2: hvog.bh().b) {
                                    Integer integer1 = (Integer)object2;
                                    int v2 = (int)integer1;
                                    if(scanResult0.centerFreq0 - 40 < v2 && v2 < scanResult0.centerFreq0 + 40) {
                                        arrayList1.add(integer1);
                                    }
                                }
                                break alab1;
                            }
                            default: {
                                break alab1;
                            }
                        }
                    }
                    case 1: {
                        switch(scanResult0.channelWidth) {
                            case 1: {
                                arrayList1.add(Integer.valueOf(scanResult0.centerFreq0));
                                break alab1;
                            }
                            case 2: {
                                Iterator iterator3 = hvog.bi().b.iterator();
                                while(true) {
                                    if(!iterator3.hasNext()) {
                                        break alab1;
                                    }
                                    Object object3 = iterator3.next();
                                    Integer integer2 = (Integer)object3;
                                    int v3 = (int)integer2;
                                    if(scanResult0.centerFreq0 - 40 < v3 && v3 < scanResult0.centerFreq0 + 40) {
                                        arrayList1.add(integer2);
                                    }
                                }
                            }
                            default: {
                                break alab1;
                            }
                        }
                    }
                    default: {
                        if(scanResult0.channelWidth == 2) {
                            arrayList1.add(Integer.valueOf(scanResult0.centerFreq0));
                        }
                    }
                }
                arrayList0.addAll(arrayList1);
            }
        }
        return czzx.e(arrayList0);
    }

    static List d(List list0, List list1) {
        if(list0.size() <= 1) {
            return list0;
        }
        Collections.shuffle(list0);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = hvog.bi().b.iterator();
        while(true) {
            int v = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Integer integer0 = (Integer)object0;
            int v1 = (int)integer0;
            for(Object object1: list0) {
                int v2 = (int)(((Integer)object1));
                if(v1 - 20 <= v2 && v2 <= v1 + 20) {
                    if(v + 1 == 2) {
                        arrayList0.add(integer0);
                        break;
                    }
                    ++v;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: hvog.a.bk().ew().b) {
            Integer integer1 = (Integer)object2;
            int v3 = (int)integer1;
            int v4 = 0;
            for(Object object3: arrayList0) {
                int v5 = (int)(((Integer)object3));
                if(v3 - 40 <= v5 && v5 <= v3 + 40) {
                    if(v4 + 1 == 2) {
                        arrayList1.add(integer1);
                        break;
                    }
                    ++v4;
                }
            }
        }
        List list2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: czzx.f(arrayList1, czzx.c(list1, 2))) {
            int v6 = (int)(((Integer)object4));
            for(Object object5: list0) {
                Integer integer2 = (Integer)object5;
                int v7 = (int)integer2;
                if(v6 - 40 <= v7 && v7 <= v6 + 40 && !list2.contains(integer2) && !arrayList2.contains(integer2)) {
                    arrayList2.add(integer2);
                }
            }
        }
        list2.addAll(arrayList2);
        arrayList2.clear();
        for(Object object6: czzx.f(arrayList0, czzx.c(list1, 1))) {
            int v8 = (int)(((Integer)object6));
            for(Object object7: list0) {
                Integer integer3 = (Integer)object7;
                int v9 = (int)integer3;
                if(v8 - 20 <= v9 && v9 <= v8 + 20 && !list2.contains(integer3) && !arrayList2.contains(integer3)) {
                    arrayList2.add(integer3);
                }
            }
        }
        list2.addAll(arrayList2);
        arrayList2.clear();
        for(Object object8: list0) {
            Integer integer4 = (Integer)object8;
            if(!list2.contains(integer4) && !arrayList2.contains(integer4)) {
                arrayList2.add(integer4);
            }
        }
        list2.addAll(czzx.f(arrayList2, czzx.c(list1, 0)));
        return list2;
    }

    static List e(List list0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            Integer integer0 = (Integer)object0;
            if(hashMap0.containsKey(integer0)) {
                hashMap0.put(integer0, Integer.valueOf(((int)(((Integer)hashMap0.get(integer0)))) + 1));
            }
            else {
                hashMap0.put(integer0, Integer.valueOf(1));
            }
        }
        ArrayList arrayList0 = new ArrayList(hashMap0.entrySet());
        Collections.sort(arrayList0, new czzv());
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Map.Entry map$Entry0 = (Map.Entry)arrayList0.get(v1);
            linkedHashMap0.put(((Integer)map$Entry0.getKey()), ((Integer)map$Entry0.getValue()));
        }
        return new ArrayList(linkedHashMap0.keySet());
    }

    static List f(List list0, List list1) {
        Collections.shuffle(list0);
        if(list1 != null && !list1.isEmpty()) {
            List list2 = new ArrayList(list0);
            Collections.sort(list2, new czzw(list1));
            return list2;
        }
        return list0;
    }

    public static List g(Context context0, List list0, List list1, int v, int v1, boolean z, gywn gywn0) {
        int v6;
        List list2;
        gged_interceptors gged0;
        int v2 = (int)hvog.a.bk().eo();
        if(v2 <= 0) {
            boolean z1 = czkc.b(context0).q();
            cunf cunf0 = czkq.a;
            cunf0.b().i("[WifiBandwidth] isWifiGetUsableChannelsSupported:%s (refreshCacheWifiChannelsRightAfterNetworkCallbackInvoked:%s)", Boolean.valueOf(z1), Boolean.valueOf(hvol.aA()));
            if(z1) {
                gged0 = hvol.ao() ? ((gged_interceptors)gxyl.a(new czzt(context0), "Get usable Channel", new gxyk(new gxyj(hvog.O()), null, ((int)hvog.N())))) : czkc.b(context0).h();
            }
            else {
                czkc czkc0 = czkc.b(context0);
                if(czkc0.y(czkc0.b, 8)) {
                    gged0 = hvol.ao() ? ((gged_interceptors)gxyl.a(new czzt(context0), "Get usable Channel", new gxyk(new gxyj(hvog.O()), null, ((int)hvog.N())))) : czkc.b(context0).h();
                }
                else {
                    gged0 = null;
                }
            }
            if(gged0 == null || gged0.isEmpty()) {
                gged0 = hvol.ao() ? ((gged_interceptors)gxyl.a(new czzu(context0), "Get available Channel", new gxyk(new gxyj(hvog.O()), null, ((int)hvog.N())))) : czkc.b(context0).d();
            }
            if(gged0 == null) {
                gged0 = ggna.a;
            }
            if(list0 == null) {
                list2 = gged0;
            }
            else {
                list2 = new ArrayList();
                for(Object object0: gged0) {
                    Integer integer0 = (Integer)object0;
                    if(list0.contains(integer0)) {
                        list2.add(integer0);
                    }
                }
            }
            cunf cunf1 = cunf0.b();
            List list3 = czmk.y(gged0);
            if(list0 != null) {
                list0 = czmk.y(list0);
            }
            cunf1.j("Optimize Wi-Fi available/usable frequencies, Local available frequencies: %s. Remote available frequencies: %s. Intersection available frequencies: %s", list3, list0, czmk.y(list2));
            if(list2.size() > 1) {
                int v3 = 0;
                cunf0.b().l("Optimize Wi-Fi available/usable frequencies, localApFrequency:%d, remoteApFrequency:%d, use5Ghz:%s, use6Ghz:%s, specifiedBandwidth:%s", Integer.valueOf(v), Integer.valueOf(v1), Boolean.valueOf(z), Boolean.valueOf(false), gywn0.name());
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for(Object object1: list2) {
                    Integer integer1 = (Integer)object1;
                    int v4 = (int)integer1;
                    if(czmk.I(v4)) {
                        arrayList0.add(integer1);
                    }
                    else if(czmk.J(v4)) {
                        if(!hvog.bh().b.contains(integer1)) {
                            continue;
                        }
                        arrayList1.add(integer1);
                    }
                    else if(czmk.L(v4)) {
                        arrayList2.add(integer1);
                    }
                    else {
                        cunf0.b().h("Optimize Wi-Fi available/usable frequencies but got unknown or invalid frequency %d.", integer1);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if(gywn0 == gywn.a) {
                    if(z) {
                        arrayList3.addAll(czzx.d(arrayList1, list1));
                    }
                    for(Object object3: czzx.f(arrayList0, czzx.b(list1))) {
                        Integer integer3 = (Integer)object3;
                        if(!arrayList3.contains(integer3)) {
                            arrayList3.add(integer3);
                        }
                    }
                }
                else {
                    switch(gywn0.ordinal()) {
                        case 1: {
                            for(Object object2: czzx.f(arrayList0, czzx.b(list1))) {
                                Integer integer2 = (Integer)object2;
                                if(!arrayList3.contains(integer2)) {
                                    arrayList3.add(integer2);
                                }
                            }
                            break;
                        }
                        case 2: {
                            arrayList3.addAll(czzx.d(arrayList1, list1));
                            break;
                        }
                        case 3: {
                            arrayList3.addAll(arrayList2);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for(Object object4: arrayList3) {
                    Integer integer4 = (Integer)object4;
                    int v5 = (int)integer4;
                    if(czmk.I(v5)) {
                        arrayList4.add(integer4);
                    }
                    else if(czmk.J(v5)) {
                        arrayList5.add(integer4);
                    }
                    else if(czmk.L(v5)) {
                        arrayList6.add(integer4);
                    }
                    else {
                        cunf0.b().h("Reprioritize Wi-Fi frequencies by MHz but got unknown or invalid frequency %d.", integer4);
                    }
                }
                if(czmk.I(v)) {
                    v6 = czzx.a(arrayList4, v, 0);
                }
                else if(czmk.J(v)) {
                    v6 = czzx.a(arrayList5, v, 0);
                }
                else {
                    v6 = czmk.L(v) ? czzx.a(arrayList6, v, 0) : 0;
                }
                if(v != v1) {
                    if(czmk.I(v) && czmk.I(v1) || czmk.J(v) && czmk.J(v1) || czmk.J(v) && czmk.J(v1)) {
                        v3 = v6;
                    }
                    if(czmk.I(v1)) {
                        czzx.a(arrayList4, v1, v3);
                    }
                    else if(czmk.J(v1)) {
                        czzx.a(arrayList5, v1, v3);
                    }
                    else if(czmk.L(v1)) {
                        czzx.a(arrayList6, v1, v3);
                    }
                }
                if(hvol.a.r().by() && !arrayList5.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for(Object object5: arrayList5) {
                        Integer integer5 = (Integer)object5;
                        if(czmk.P(integer5.intValue())) {
                            arrayList8.add(integer5);
                        }
                        else {
                            arrayList7.add(integer5);
                        }
                    }
                    arrayList7.addAll(arrayList8);
                    arrayList5 = gged_interceptors.i(arrayList7);
                }
                list2 = new ArrayList();
                list2.addAll(arrayList6);
                list2.addAll(arrayList5);
                list2.addAll(arrayList4);
                cunf0.b().h("Optimize Wi-Fi available/usable frequencies result : %s", list2);
            }
            return list2;
        }
        Integer integer6 = v2;
        czkq.a.b().h("[WifiBandwidth] optimizeFrequenciesForGroupCreation() returns test channel: %d", integer6);
        return gged_interceptors.l(integer6);
    }
}

