import android.os.Trace;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import jeb.synthetic.FIN;

public final class ilj implements Runnable {
    public final ilt a;

    public ilj(ilt ilt0) {
        this.a = ilt0;
    }

    @Override
    public final void run() {
        int v74;
        long v73;
        long v71;
        int[] arr_v14;
        long[] arr_v13;
        int v50;
        int v46;
        AccessibilityEvent accessibilityEvent1;
        int v44;
        int v42;
        int v41;
        int v30;
        int v29;
        int v28;
        iug iug4;
        int v27;
        long[] arr_v6;
        iqk iqk2;
        ArrayList arrayList2;
        boolean z1;
        int v25;
        int v24;
        int v19;
        long[] arr_v5;
        int v14;
        int v13;
        iqk iqk1;
        iug iug2;
        int v12;
        long[] arr_v4;
        int[] arr_v3;
        ArrayList arrayList1;
        int v11;
        int v10;
        bxv bxv1;
        Trace.beginSection("measureAndLayout");
        ilt ilt0 = this.a;
        try {
            iim.a(ilt0.b);
        }
        catch(Throwable throwable0) {
            Trace.endSection();
            throw throwable0;
        }
        Trace.endSection();
        Trace.beginSection("checkForSemanticsChanges");
        try {
            Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
            try {
                if(ilt0.D()) {
                    ilt0.w(ilt0.b.m.a(), ilt0.r);
                }
            }
            finally {
                Trace.endSection();
            }
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            int v1 = FIN.finallyOpen$NT();
            bxv bxv0 = ilt0.q();
            List list0 = ilt0.u;
            ArrayList arrayList0 = new ArrayList(list0);
            list0.clear();
            int[] arr_v = bxv0.b;
            long[] arr_v1 = bxv0.a;
            int v2 = arr_v1.length - 2;
            if(v2 >= 0) {
                int v3 = 0;
                while(true) {
                    long v4 = arr_v1[v3];
                    if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_396;
                    }
                    int v5 = 8 - (~(v3 - v2) >>> 0x1F);
                    int v6 = 0;
                    long v7 = v4;
                    while(v6 < v5) {
                        if((v7 & 0xFFL) < 0x80L) {
                            int v8 = arr_v[(v3 << 3) + v6];
                            iqk iqk0 = (iqk)ilt0.A.a(v8);
                            if(iqk0 == null) {
                                goto label_372;
                            }
                            else {
                                iui iui0 = (iui)bxv0.a(v8);
                                iug iug0 = iui0 == null ? null : iui0.a;
                                if(iug0 == null) {
                                    hxt.b("no value for specified key");
                                    throw new ibnm();
                                }
                                ity ity0 = iug0.b;
                                Object[] arr_object = ity0.c.b;
                                bxv1 = bxv0;
                                long[] arr_v2 = ity0.c.a;
                                iug iug1 = iug0;
                                int v9 = arr_v2.length - 2;
                                Object[] arr_object1 = ity0.c.c;
                                if(v9 < 0) {
                                    v10 = v8;
                                    v11 = v3;
                                    arrayList1 = arrayList0;
                                    arr_v3 = arr_v;
                                    arr_v4 = arr_v1;
                                    v12 = v6;
                                    iug2 = iug1;
                                    iqk1 = iqk0;
                                    v13 = v2;
                                    v14 = 0;
                                    goto label_352;
                                }
                                else {
                                    int v15 = 0;
                                    int v16 = 0;
                                    int v17 = v9;
                                alab1:
                                    while(true) {
                                        long v18 = arr_v2[v15];
                                        arr_v3 = arr_v;
                                        arr_v4 = arr_v1;
                                        if((~v18 << 7 & v18 & 0x8080808080808080L) == 0x8080808080808080L) {
                                            iqk1 = iqk0;
                                            v11 = v3;
                                            arrayList1 = arrayList0;
                                            arr_v5 = arr_v2;
                                            v12 = v6;
                                            iug2 = iug1;
                                            v10 = v8;
                                            v13 = v2;
                                            v19 = v17;
                                        }
                                        else {
                                            int v20 = 8 - (~(v15 - v17) >>> 0x1F);
                                            int v21 = 0;
                                            long v22 = v18;
                                            while(v21 < v20) {
                                                if((v22 & 0xFFL) < 0x80L) {
                                                    int v23 = (v15 << 3) + v21;
                                                    Object object0 = arr_object[v23];
                                                    Object object1 = arr_object1[v23];
                                                    ivi ivi0 = (ivi)object0;
                                                    v24 = v3;
                                                    ivi ivi1 = iuz.t;
                                                    boolean z = true;
                                                    if(ibuq.m(ivi0, ivi1)) {
                                                        v25 = v21;
                                                    }
                                                    else {
                                                        v25 = v21;
                                                        if(ibuq.m(ivi0, iuz.u)) {
                                                            goto label_95;
                                                        }
                                                        goto label_103;
                                                    }
                                                label_95:
                                                    iqj iqj0 = iql.b(arrayList0, v8);
                                                    if(iqj0 == null) {
                                                        iqj0 = new iqj(v8, list0);
                                                        z1 = true;
                                                    }
                                                    else {
                                                        z1 = false;
                                                    }
                                                    list0.add(iqj0);
                                                    if(!z1) {
                                                    label_103:
                                                        if(!ibuq.m(object1, itz.a(iqk0.a, ivi0))) {
                                                            goto label_104;
                                                        }
                                                        goto label_309;
                                                    }
                                                label_104:
                                                    ivi ivi2 = iuz.d;
                                                    if(ibuq.m(ivi0, ivi2)) {
                                                        ibuq.d(object1, "null cannot be cast to non-null type kotlin.String");
                                                        if(iqk0.a.f(ivi2)) {
                                                            ilt0.x(v8, 8, ((String)object1));
                                                        }
                                                        goto label_309;
                                                    }
                                                    else if(ibuq.m(ivi0, iuz.b) || ibuq.m(ivi0, iuz.I)) {
                                                        iqk2 = iqk0;
                                                        arrayList2 = arrayList0;
                                                        arr_v6 = arr_v2;
                                                        v27 = v6;
                                                        iug4 = iug1;
                                                        v28 = v8;
                                                        v29 = v2;
                                                        v30 = v17;
                                                        ilt.K(ilt0, ilt0.m(v28), 0x800, Integer.valueOf(0x40), 8);
                                                        ilt.K(ilt0, ilt0.m(v28), 0x800, Integer.valueOf(0), 8);
                                                        goto label_326;
                                                    label_309:
                                                        iqk2 = iqk0;
                                                        arrayList2 = arrayList0;
                                                    label_311:
                                                        arr_v6 = arr_v2;
                                                        v27 = v6;
                                                        iug4 = iug1;
                                                        v28 = v8;
                                                        goto label_324;
                                                    }
                                                    else if(!ibuq.m(ivi0, iuz.c)) {
                                                        ivi ivi3 = iuz.H;
                                                        arrayList2 = arrayList0;
                                                        if(ibuq.m(ivi0, ivi3)) {
                                                            its its0 = (its)itz.a(ity0, iuz.x);
                                                            if(its0 == null || its0.a != 4) {
                                                                ilt.K(ilt0, ilt0.m(v8), 0x800, Integer.valueOf(0x40), 8);
                                                                ilt.K(ilt0, ilt0.m(v8), 0x800, Integer.valueOf(0), 8);
                                                            }
                                                            else if(ibuq.m(itz.a(ity0, ivi3), Boolean.valueOf(true))) {
                                                                AccessibilityEvent accessibilityEvent0 = ilt0.o(ilt0.m(v8), 4);
                                                                iug iug3 = iug1.f();
                                                                List list1 = (List)itz.a(iug3.e(), iuz.a);
                                                                String s = list1 == null ? null : jlz.c(list1, ",", null, null, null, 62);
                                                                List list2 = (List)itz.a(iug3.e(), iuz.A);
                                                                String s1 = list2 == null ? null : jlz.c(list2, ",", null, null, null, 62);
                                                                if(s != null) {
                                                                    accessibilityEvent0.setContentDescription(s);
                                                                }
                                                                if(s1 != null) {
                                                                    accessibilityEvent0.getText().add(s1);
                                                                }
                                                                ilt0.P(accessibilityEvent0);
                                                            }
                                                            else {
                                                                ilt.K(ilt0, ilt0.m(v8), 0x800, Integer.valueOf(0), 8);
                                                            }
                                                            goto label_139;
                                                        }
                                                        else if(ibuq.m(ivi0, iuz.a)) {
                                                            int v26 = ilt0.m(v8);
                                                            ibuq.d(object1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            ilt0.M(v26, 0x800, Integer.valueOf(4), ((List)object1));
                                                        label_139:
                                                            iqk2 = iqk0;
                                                            goto label_311;
                                                        }
                                                        else {
                                                            String s2 = "";
                                                            ivi ivi4 = iuz.E;
                                                            if(!ibuq.m(ivi0, ivi4)) {
                                                                arr_v6 = arr_v2;
                                                                v27 = v6;
                                                                iug4 = iug1;
                                                                v28 = v8;
                                                                v29 = v2;
                                                                v30 = v17;
                                                                iqk2 = iqk0;
                                                                ivi ivi5 = iuz.F;
                                                                if(ibuq.m(ivi0, ivi5)) {
                                                                    iwj iwj0 = ilt.L(ity0);
                                                                    if(iwj0 != null) {
                                                                        String s3 = iwj0.b;
                                                                        if(s3 != null) {
                                                                            s2 = s3;
                                                                        }
                                                                    }
                                                                    long v31 = ((jbk)ity0.c(ivi5)).b;
                                                                    ilt0.P(ilt0.p(ilt0.m(v28), Integer.valueOf(jbk.e(v31)), Integer.valueOf(jbk.a(v31)), Integer.valueOf(s2.length()), ilt.N(s2)));
                                                                    ilt0.y(iug4.d);
                                                                }
                                                                else if(ibuq.m(ivi0, ivi1) || ibuq.m(ivi0, iuz.u)) {
                                                                    ilt0.u(iug4.a);
                                                                    iqj iqj1 = iql.b(list0, v28);
                                                                    ibuq.c(iqj1);
                                                                    iqj1.d = (itu)itz.a(ity0, ivi1);
                                                                    iqj1.e = (itu)itz.a(ity0, iuz.u);
                                                                    ilt0.v(iqj1);
                                                                }
                                                                else if(!ibuq.m(ivi0, iuz.k)) {
                                                                    ivi ivi6 = itw.w;
                                                                    if(ibuq.m(ivi0, ivi6)) {
                                                                        List list3 = (List)ity0.c(ivi6);
                                                                        List list4 = (List)itz.a(iqk2.a, ivi6);
                                                                        if(list4 != null) {
                                                                            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                                                                            int v32 = list3.size();
                                                                            for(int v33 = 0; v33 < v32; ++v33) {
                                                                                linkedHashSet0.add(((itn)list3.get(v33)).a);
                                                                            }
                                                                            LinkedHashSet linkedHashSet1 = new LinkedHashSet();
                                                                            int v34 = list4.size();
                                                                            for(int v35 = 0; v35 < v34; ++v35) {
                                                                                linkedHashSet1.add(((itn)list4.get(v35)).a);
                                                                            }
                                                                            v16 = linkedHashSet0.containsAll(linkedHashSet1) && linkedHashSet1.containsAll(linkedHashSet0) ? 0 : 1;
                                                                        }
                                                                        else if(!list3.isEmpty()) {
                                                                            v16 = 1;
                                                                        }
                                                                    }
                                                                    else {
                                                                        if((object1 instanceof itj)) {
                                                                            Object object2 = itz.a(iqk2.a, ivi0);
                                                                            if(((itj)object1) == object2) {
                                                                                v16 = 0;
                                                                                goto label_326;
                                                                            }
                                                                            else if((object2 instanceof itj) && ibuq.m(((itj)object1).a, ((itj)object2).a)) {
                                                                                ibnk ibnk0 = ((itj)object1).b;
                                                                                if((ibnk0 != null || ((itj)object2).b == null) && (ibnk0 == null || ((itj)object2).b != null)) {
                                                                                    v16 = 0;
                                                                                    goto label_326;
                                                                                }
                                                                            }
                                                                        }
                                                                        v16 = 1;
                                                                    }
                                                                }
                                                                else {
                                                                    ibuq.d(object1, "null cannot be cast to non-null type kotlin.Boolean");
                                                                    if(((Boolean)object1).booleanValue()) {
                                                                        ilt0.P(ilt0.o(ilt0.m(iug4.d), 8));
                                                                    }
                                                                    ilt.K(ilt0, ilt0.m(iug4.d), 0x800, Integer.valueOf(0), 8);
                                                                }
                                                            }
                                                            else if(ity0.f(itw.j)) {
                                                                ity ity1 = iqk0.a;
                                                                iwj iwj1 = ilt.L(ity1);
                                                                if(iwj1 == null) {
                                                                    iwj1 = "";
                                                                }
                                                                iwj iwj2 = ilt.L(ity0);
                                                                if(iwj2 == null) {
                                                                    iwj2 = "";
                                                                }
                                                                CharSequence charSequence0 = ilt.N(iwj2);
                                                                int v36 = iwj1.length();
                                                                arr_v6 = arr_v2;
                                                                int v37 = iwj2.length();
                                                                v27 = v6;
                                                                int v38 = ibwt.h(v36, v37);
                                                                int v39 = v36;
                                                                int v40 = 0;
                                                                while(true) {
                                                                    if(v40 < v38) {
                                                                        v41 = v37;
                                                                        v42 = v38;
                                                                        if(iwj1.charAt(v40) == iwj2.charAt(v40)) {
                                                                            ++v40;
                                                                            v37 = v41;
                                                                            v38 = v42;
                                                                            continue;
                                                                        }
                                                                        else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    v41 = v37;
                                                                    v42 = v38;
                                                                    break;
                                                                }
                                                                int v43 = 0;
                                                                while(true) {
                                                                    if(v43 < v42 - v40) {
                                                                        v44 = v43;
                                                                        if(iwj1.charAt(v39 - 1 - v43) == iwj2.charAt(v41 - 1 - v44)) {
                                                                            v43 = v44 + 1;
                                                                            continue;
                                                                        }
                                                                        else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    v44 = v43;
                                                                    break;
                                                                }
                                                                boolean z2 = ity1.f(iuz.J);
                                                                boolean z3 = ity0.f(iuz.J);
                                                                boolean z4 = ity1.f(ivi4);
                                                                int v45 = !z4 || z2 || !z3 ? 0 : 1;
                                                                if(!z4 || !z2 || z3) {
                                                                    z = false;
                                                                }
                                                                if(v45 == 0 && !z) {
                                                                    accessibilityEvent1 = ilt0.o(ilt0.m(v8), 16);
                                                                    accessibilityEvent1.setFromIndex(v40);
                                                                    accessibilityEvent1.setRemovedCount(v39 - v44 - v40);
                                                                    accessibilityEvent1.setAddedCount(v41 - v44 - v40);
                                                                    accessibilityEvent1.setBeforeText(iwj1);
                                                                    accessibilityEvent1.getText().add(charSequence0);
                                                                    v28 = v8;
                                                                    v46 = 0;
                                                                    iug4 = iug1;
                                                                    iqk2 = iqk0;
                                                                    v29 = v2;
                                                                    v30 = v17;
                                                                }
                                                                else {
                                                                    Integer integer0 = (int)0;
                                                                    v28 = v8;
                                                                    v46 = v45;
                                                                    iug4 = iug1;
                                                                    iqk2 = iqk0;
                                                                    v29 = v2;
                                                                    v30 = v17;
                                                                    accessibilityEvent1 = ilt0.p(ilt0.m(v8), integer0, integer0, Integer.valueOf(v41), charSequence0);
                                                                }
                                                                accessibilityEvent1.setClassName("android.widget.EditText");
                                                                ilt0.P(accessibilityEvent1);
                                                                if(v46 != 0 || z) {
                                                                    long v47 = ((jbk)ity0.c(iuz.F)).b;
                                                                    accessibilityEvent1.setFromIndex(jbk.e(v47));
                                                                    accessibilityEvent1.setToIndex(jbk.a(v47));
                                                                    ilt0.P(accessibilityEvent1);
                                                                }
                                                            }
                                                            else {
                                                                arr_v6 = arr_v2;
                                                                v27 = v6;
                                                                iug4 = iug1;
                                                                v28 = v8;
                                                                v29 = v2;
                                                                v30 = v17;
                                                                iqk2 = iqk0;
                                                                ilt.K(ilt0, ilt0.m(v28), 0x800, Integer.valueOf(2), 8);
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        ilt.K(ilt0, ilt0.m(v8), 0x800, Integer.valueOf(0x40), 8);
                                                        ilt.K(ilt0, ilt0.m(v8), 0x800, Integer.valueOf(0), 8);
                                                        goto label_309;
                                                    }
                                                }
                                                else {
                                                    v24 = v3;
                                                    arrayList2 = arrayList0;
                                                    v25 = v21;
                                                    arr_v6 = arr_v2;
                                                    v27 = v6;
                                                    iug4 = iug1;
                                                    v28 = v8;
                                                    iqk2 = iqk0;
                                                label_324:
                                                    v29 = v2;
                                                    v30 = v17;
                                                }
                                            label_326:
                                                v22 >>= 8;
                                                iqk0 = iqk2;
                                                v17 = v30;
                                                v8 = v28;
                                                v2 = v29;
                                                v3 = v24;
                                                arr_v2 = arr_v6;
                                                v6 = v27;
                                                v21 = v25 + 1;
                                                iug1 = iug4;
                                                arrayList0 = arrayList2;
                                            }
                                            iqk1 = iqk0;
                                            v11 = v3;
                                            arrayList1 = arrayList0;
                                            arr_v5 = arr_v2;
                                            v12 = v6;
                                            iug2 = iug1;
                                            v10 = v8;
                                            v13 = v2;
                                            if(v20 == 8) {
                                                v19 = v17;
                                            }
                                            else {
                                                v14 = v16;
                                                goto label_352;
                                            }
                                        }
                                        if(v15 == v19) {
                                            v14 = v16;
                                        label_352:
                                            if(v14 == 0) {
                                                Iterator iterator0 = iqk1.a.iterator();
                                                while(true) {
                                                    if(!iterator0.hasNext()) {
                                                        break alab1;
                                                    }
                                                    Object object3 = iterator0.next();
                                                    if(!iug2.e().f(((ivi)((Map.Entry)object3).getKey()))) {
                                                        break;
                                                    }
                                                }
                                            }
                                            ilt.K(ilt0, ilt0.m(v10), 0x800, Integer.valueOf(0), 8);
                                            break;
                                        }
                                        ++v15;
                                        iqk0 = iqk1;
                                        v17 = v19;
                                        v8 = v10;
                                        v2 = v13;
                                        arr_v = arr_v3;
                                        arr_v1 = arr_v4;
                                        v3 = v11;
                                        arr_v2 = arr_v5;
                                        v6 = v12;
                                        iug1 = iug2;
                                        arrayList0 = arrayList1;
                                    }
                                }
                            }
                        }
                        else {
                        label_372:
                            v11 = v3;
                            bxv1 = bxv0;
                            arrayList1 = arrayList0;
                            arr_v3 = arr_v;
                            arr_v4 = arr_v1;
                            v13 = v2;
                            v12 = v6;
                        }
                        v7 >>= 8;
                        v6 = v12 + 1;
                        bxv0 = bxv1;
                        v2 = v13;
                        arr_v = arr_v3;
                        arr_v1 = arr_v4;
                        v3 = v11;
                        arrayList0 = arrayList1;
                    }
                    bxv bxv2 = bxv0;
                    ArrayList arrayList3 = arrayList0;
                    int[] arr_v7 = arr_v;
                    long[] arr_v8 = arr_v1;
                    if(v5 == 8) {
                        int v48 = v2;
                        int v49 = v3;
                        goto label_402;
                    label_396:
                        bxv2 = bxv0;
                        arrayList3 = arrayList0;
                        arr_v7 = arr_v;
                        arr_v8 = arr_v1;
                        v49 = v3;
                        v48 = v2;
                    label_402:
                        if(v49 != v48) {
                            v3 = v49 + 1;
                            v2 = v48;
                            bxv0 = bxv2;
                            arr_v = arr_v7;
                            arr_v1 = arr_v8;
                            arrayList0 = arrayList3;
                            continue;
                        }
                    }
                    goto label_410;
                }
            }
            else {
            label_410:
                FIN.finallyCodeBegin$NT(v1);
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                v50 = FIN.finallyOpen$NT();
                bxx bxx0 = new bxx(null);
                bxx bxx1 = ilt0.x;
                int[] arr_v9 = bxx1.b;
                long[] arr_v10 = bxx1.a;
                int v51 = arr_v10.length - 2;
                if(v51 >= 0) {
                    int v52 = 0;
                    while(true) {
                        long v53 = arr_v10[v52];
                        if((~v53 << 7 & v53 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_440;
                        }
                        int v54 = 8 - (~(v52 - v51) >>> 0x1F);
                        long v55 = v53;
                        for(int v56 = 0; v56 < v54; ++v56) {
                            if((v55 & 0xFFL) < 0x80L) {
                                int v57 = arr_v9[(v52 << 3) + v56];
                                iui iui1 = (iui)ilt0.q().a(v57);
                                iug iug5 = iui1 == null ? null : iui1.a;
                                if(iug5 == null || !iug5.b.f(iuz.d)) {
                                    bxx0.d(v57);
                                    iqk iqk3 = (iqk)ilt0.A.a(v57);
                                    ilt0.x(v57, 0x20, (iqk3 == null ? null : ((String)itz.a(iqk3.a, iuz.d))));
                                }
                            }
                            v55 >>= 8;
                        }
                        if(v54 == 8) {
                        label_440:
                            if(v52 != v51) {
                                ++v52;
                                continue;
                            }
                        }
                        goto label_443;
                    }
                }
                else {
                label_443:
                    int[] arr_v11 = bxx0.b;
                    long[] arr_v12 = bxx0.a;
                    int v58 = arr_v12.length - 2;
                    if(v58 >= 0) {
                        int v59 = 0;
                        while(true) {
                            long v60 = arr_v12[v59];
                            if((~v60 << 7 & v60 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_501;
                            }
                            int v61 = 8 - (~(v59 - v58) >>> 0x1F);
                            long v62 = v60;
                            int v63 = 0;
                            while(v63 < v61) {
                                if((v62 & 0xFFL) < 0x80L) {
                                    int v64 = arr_v11[(v59 << 3) + v63];
                                    int v65 = bxx1.c;
                                    int v66 = 0xCC9E2D51 * v64 ^ 0xCC9E2D51 * v64 << 16;
                                    int v67 = v66 >>> 7 & v65;
                                    int v68 = 0;
                                    while(true) {
                                        arr_v13 = arr_v12;
                                        int v69 = (v67 & 7) << 3;
                                        arr_v14 = arr_v11;
                                        long v70 = bxx1.a[v67 >> 3] >>> v69 | bxx1.a[(v67 >> 3) + 1] << 0x40 - v69 & -((long)v69) >> 0x3F;
                                        v71 = v62;
                                        long v72 = ((long)(v66 & 0x7F)) * 0x101010101010101L ^ v70;
                                        v73 = v72 - 0x101010101010101L & ~v72 & 0x8080808080808080L;
                                    label_467:
                                        if(v73 != 0L) {
                                            goto label_479;
                                        }
                                        v74 = v63;
                                        if((v70 & ~v70 << 6 & 0x8080808080808080L) != 0L) {
                                            break;
                                        }
                                        v68 += 8;
                                        v67 = v67 + v68 & v65;
                                        v62 = v71;
                                        arr_v12 = arr_v13;
                                        arr_v11 = arr_v14;
                                        v63 = v74;
                                    }
                                    int v75 = -1;
                                    goto label_485;
                                label_479:
                                    v75 = (Long.numberOfTrailingZeros(v73) >> 3) + v67 & v65;
                                    v74 = v63;
                                    if(bxx1.b[v75] != v64) {
                                        v73 &= v73 - 1L;
                                        v63 = v74;
                                        goto label_467;
                                    }
                                label_485:
                                    if(v75 >= 0) {
                                        bxx1.c(v75);
                                    }
                                }
                                else {
                                    arr_v13 = arr_v12;
                                    arr_v14 = arr_v11;
                                    v74 = v63;
                                    v71 = v62;
                                }
                                v63 = v74 + 1;
                                v62 = v71 >> 8;
                                arr_v12 = arr_v13;
                                arr_v11 = arr_v14;
                            }
                            long[] arr_v15 = arr_v12;
                            int[] arr_v16 = arr_v11;
                            if(v61 == 8) {
                                goto label_503;
                            label_501:
                                arr_v15 = arr_v12;
                                arr_v16 = arr_v11;
                            label_503:
                                if(v59 != v58) {
                                    ++v59;
                                    arr_v12 = arr_v15;
                                    arr_v11 = arr_v16;
                                    continue;
                                }
                            }
                            goto label_508;
                        }
                    }
                    else {
                    label_508:
                        bxv bxv3 = ilt0.A;
                        bxv3.f();
                        bxv bxv4 = ilt0.q();
                        int[] arr_v17 = bxv4.b;
                        Object[] arr_object2 = bxv4.c;
                        long[] arr_v18 = bxv4.a;
                        int v76 = arr_v18.length - 2;
                        if(v76 >= 0) {
                            int v77 = 0;
                            while(true) {
                                long v78 = arr_v18[v77];
                                if((~v78 << 7 & v78 & 0x8080808080808080L) == 0x8080808080808080L) {
                                    goto label_538;
                                }
                                int v79 = 8 - (~(v77 - v76) >>> 0x1F);
                                long v80 = v78;
                                for(int v81 = 0; v81 < v79; ++v81) {
                                    if((v80 & 0xFFL) < 0x80L) {
                                        int v82 = (v77 << 3) + v81;
                                        int v83 = arr_v17[v82];
                                        iug iug6 = ((iui)arr_object2[v82]).a;
                                        ity ity2 = iug6.b;
                                        ivi ivi7 = iuz.d;
                                        if(ity2.f(ivi7) && bxx1.d(v83)) {
                                            ilt0.x(v83, 16, ((String)ity2.c(ivi7)));
                                        }
                                        bxv3.g(v83, new iqk(iug6, ilt0.q()));
                                    }
                                    v80 >>= 8;
                                }
                                if(v79 == 8) {
                                label_538:
                                    if(v77 != v76) {
                                        ++v77;
                                        continue;
                                    }
                                    break;
                                }
                                else {
                                    ilt0.r = new iqk(ilt0.b.m.a(), ilt0.q());
                                }
                                goto label_544;
                            }
                        }
                        ilt0.r = new iqk(ilt0.b.m.a(), ilt0.q());
                    }
                }
            }
        label_544:
            FIN.finallyCodeBegin$NT(v50);
            Trace.endSection();
            FIN.finallyCodeEnd$NT(v50);
        }
        catch(Throwable throwable1) {
            Trace.endSection();
            throw throwable1;
        }
        Trace.endSection();
        ilt0.s = false;
    }
}

