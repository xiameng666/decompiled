import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class ilk extends khe {
    final ilt a;

    public ilk(ilt ilt0) {
        this.a = ilt0;
        super();
    }

    @Override  // khe
    public final khb a(int v) {
        bza bza2;
        int v20;
        int v19;
        boolean z7;
        boolean z6;
        Resources resources1;
        int v8;
        boolean z2;
        khb khb0;
        lpf lpf0;
        ilt ilt0 = this.a;
        ili ili0 = ilt0.b;
        iki iki0 = ili0.C();
        if(iki0 == null) {
            lpf0 = null;
        }
        else {
            lpg lpg0 = iki0.a.getLifecycle();
            lpf0 = lpg0 == null ? null : lpg0.a();
        }
        if(lpf0 == lpf.a) {
            khb0 = ilt0.r();
            goto label_469;
        }
        iui iui0 = (iui)ilt0.q().a(v);
        if(iui0 == null) {
            khb0 = ilt0.r();
            goto label_469;
        }
        iug iug0 = iui0.a;
        ity ity0 = iug0.e();
        ivi ivi0 = iuz.n;
        boolean z = ibuq.m(itz.a(ity0, ivi0), Boolean.valueOf(true));
        if(z && !ilt0.E()) {
            khb0 = null;
            goto label_469;
        }
        khb khb1 = khb.d();
        if(Build.VERSION.SDK_INT >= 34) {
            khb1.a.setAccessibilityDataSensitive(z);
        }
        else {
            khb1.t(0x40, z);
        }
        if(v == -1) {
            ViewParent viewParent0 = ili0.getParentForAccessibility();
            khb1.R(((viewParent0 instanceof View) ? ((View)viewParent0) : null));
            goto label_41;
        }
        iug iug1 = iug0.g();
        Integer integer0 = iug1 == null ? null : ((int)iug1.d);
        if(integer0 != null) {
            int v1 = integer0.intValue();
            if(v1 == ili0.m.a().d) {
                v1 = -1;
            }
            khb1.S(ili0, v1);
        label_41:
            khb1.Z(ili0, v);
            khb1.v(ilt0.n(iui0));
            Resources resources0 = ili0.getContext().getResources();
            khb1.y("android.view.View");
            ity ity1 = iug0.b;
            ivi ivi1 = iuz.E;
            if(ity1.f(ivi1)) {
                khb1.y("android.widget.EditText");
            }
            if(ity1.f(iuz.A)) {
                khb1.y("android.widget.TextView");
            }
            ivi ivi2 = iuz.x;
            its its0 = (its)itz.a(ity1, ivi2);
            if(its0 != null && (iug0.c || iug0.i().isEmpty())) {
                int v2 = its0.a;
                if(v2 == 4) {
                    khb1.U("Tab");
                }
                else if(v2 == 2) {
                    khb1.U("Switch");
                }
                else {
                    String s = iql.d(v2);
                    if(v2 != 5 || iug0.j() || ity1.a) {
                        khb1.y(s);
                    }
                }
            }
            khb1.P("com.google.android.gms");
            khb1.K(iuk.b(iug0));
            boolean z1 = ilt0.E();
            List list0 = iug0.i();
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            while(v4 < v3) {
                iug iug2 = (iug)list0.get(v4);
                bxv bxv0 = ilt0.q();
                int v6 = iug2.d;
                if(bxv0.b(v6)) {
                    jmw jmw0 = (jmw)ili0.D().b.get(iug2.a);
                    if(v6 != -1) {
                        if(jmw0 == null) {
                            iui iui1 = (iui)ilt0.q().a(v6);
                            if(iui1 != null) {
                                iug iug3 = iui1.a;
                                if(iug3 != null) {
                                    z2 = ibuq.m(itz.a(iug3.e(), ivi0), Boolean.valueOf(true));
                                    goto label_88;
                                }
                            }
                            z2 = false;
                        label_88:
                            if(z1 || !z2) {
                                khb1.p(ili0, v6);
                            }
                        }
                        else {
                            khb1.o(jmw0);
                        }
                        ilt0.B.c(v6, v5);
                        ++v5;
                        goto label_94;
                    }
                }
                v5 = v5;
            label_94:
                ++v4;
                z1 = z1;
            }
            if(v == ilt0.e) {
                khb1.s(true);
                khb1.n(kgx.h);
            }
            else {
                khb1.s(false);
                khb1.n(kgx.g);
            }
            ilt0.z(iug0, khb1);
            ivi ivi3 = iuz.K;
            if(ity1.f(ivi3)) {
                khb1.a.setContentInvalid(true);
                khb1.F(((CharSequence)itz.a(ity1, ivi3)));
            }
            khb1.aa(ilx.c(iug0, resources0));
            khb1.w(ilx.e(iug0));
            ivz ivz0 = (ivz)itz.a(ity1, iuz.I);
            if(ivz0 != null) {
                if(ivz0 == ivz.a) {
                    khb1.x(true);
                }
                else if(ivz0 == ivz.b) {
                    khb1.x(false);
                }
            }
            ivi ivi4 = iuz.H;
            Boolean boolean0 = (Boolean)itz.a(ity1, ivi4);
            if(boolean0 != null) {
                boolean z3 = boolean0.booleanValue();
                if(its0 != null && its0.a == 4) {
                    khb1.X(z3);
                }
                else {
                    khb1.x(z3);
                }
            }
            if(!ity1.a || iug0.i().isEmpty()) {
                List list1 = (List)itz.a(ity1, iuz.a);
                khb1.C((list1 == null ? null : ((String)ibpo.T(list1))));
            }
            ivi ivi5 = iuz.y;
            String s1 = (String)itz.a(ity1, ivi5);
            if(s1 != null) {
                iug iug4 = iug0;
                while(iug4 != null) {
                    ity ity2 = iug4.b;
                    ivi ivi6 = ivc.a;
                    if(!ity2.f(ivi6)) {
                        iug4 = iug4.g();
                        continue;
                    }
                    else if(((Boolean)ity2.c(ivi6)).booleanValue()) {
                        khb1.a.setViewIdResourceName(s1);
                    }
                    break;
                }
            }
            if(((ibom)itz.a(ity1, iuz.h)) != null) {
                khb1.I(true);
            }
            if(v != -1) {
                int v7 = ilt0.B.d(iug0.d);
                if(v7 == -1) {
                    Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                }
                else {
                    khb1.a.setDrawingOrder(v7);
                }
            }
            boolean z4 = ity1.f(iuz.J);
            AccessibilityNodeInfo accessibilityNodeInfo0 = khb1.a;
            accessibilityNodeInfo0.setPassword(z4);
            accessibilityNodeInfo0.setEditable(ity1.f(iuz.M));
            Integer integer1 = (Integer)itz.a(ity1, iuz.N);
            khb1.N((integer1 == null ? -1 : ((int)integer1)));
            khb1.E(ilx.d(iug0));
            ivi ivi7 = iuz.k;
            khb1.G(ity1.f(ivi7));
            if(khb1.aj()) {
                khb1.H(((Boolean)ity1.c(ivi7)).booleanValue());
                if(khb1.ak()) {
                    khb1.m(2);
                    ilt0.f = v;
                }
                else {
                    khb1.m(1);
                }
            }
            khb1.af(((boolean)(iuk.a(iug0) ^ 1)));
            itp itp0 = (itp)itz.a(ity1, iuz.j);
            if(itp0 != null) {
                switch(itp0.a) {
                    case 0: {
                        v8 = 1;
                        break;
                    }
                    case 1: {
                        v8 = 2;
                        break;
                    }
                    default: {
                        v8 = 1;
                    }
                }
                accessibilityNodeInfo0.setLiveRegion(v8);
            }
            khb1.z(false);
            itj itj0 = (itj)itz.a(ity1, itw.b);
            if(itj0 == null) {
                resources1 = resources0;
            }
            else {
                resources1 = resources0;
                boolean z5 = ibuq.m(itz.a(ity1, ivi4), Boolean.valueOf(true));
                if(its0 == null) {
                    z6 = z5;
                    goto label_185;
                }
                else {
                    z6 = z5;
                    if(its0.a == 4) {
                    label_191:
                        z7 = !z6;
                    }
                    else {
                    label_185:
                        if(its0 == null) {
                            z7 = true;
                        }
                        else if(its0.a != 3) {
                            z7 = true;
                        }
                        else {
                            goto label_191;
                        }
                    }
                }
                khb1.z(z7);
                if(ilx.d(iug0) && khb1.ah()) {
                    khb1.n(new kgx(16, itj0.a));
                }
            }
            khb1.M(false);
            itj itj1 = (itj)itz.a(ity1, itw.c);
            if(itj1 != null) {
                khb1.M(true);
                if(ilx.d(iug0)) {
                    khb1.n(new kgx(0x20, itj1.a));
                }
            }
            itj itj2 = (itj)itz.a(ity1, itw.p);
            if(itj2 != null) {
                khb1.n(new kgx(0x4000, itj2.a));
            }
            if(ilx.d(iug0)) {
                itj itj3 = (itj)itz.a(ity1, itw.j);
                if(itj3 != null) {
                    khb1.n(new kgx(0x200000, itj3.a));
                }
                itj itj4 = (itj)itz.a(ity1, itw.o);
                if(itj4 != null) {
                    khb1.n(new kgx(0x1020054, itj4.a));
                }
                itj itj5 = (itj)itz.a(ity1, itw.q);
                if(itj5 != null) {
                    khb1.n(new kgx(0x10000, itj5.a));
                }
                itj itj6 = (itj)itz.a(ity1, itw.r);
                if(itj6 != null && khb1.ak()) {
                    ClipDescription clipDescription0 = ili0.x.a.getPrimaryClipDescription();
                    if(clipDescription0 != null && clipDescription0.hasMimeType("text/*")) {
                        khb1.n(new kgx(0x8000, itj6.a));
                    }
                }
            }
            String s2 = ilt.O(iug0);
            if(s2 != null && s2.length() != 0) {
                accessibilityNodeInfo0.setTextSelection(ilt0.l(iug0), ilt0.k(iug0));
                itj itj7 = (itj)itz.a(ity1, itw.i);
                khb1.n(new kgx(0x20000, (itj7 == null ? null : itj7.a)));
                khb1.m(0x100);
                khb1.m(0x200);
                khb1.O(11);
                List list2 = (List)itz.a(ity1, iuz.a);
                if((list2 == null || list2.isEmpty()) && ity1.f(itw.a) && (!ity1.f(ivi1) || ibuq.m(itz.a(ity1, ivi7), Boolean.valueOf(true)))) {
                    ify ify0 = ilx.a(iug0.a, ilu.a);
                    if(ify0 == null) {
                        khb1.O(khb1.b() | 20);
                    }
                    else {
                        ity ity3 = ify0.u();
                        if(ity3 != null && ibuq.m(itz.a(ity3, ivi7), Boolean.valueOf(true))) {
                            khb1.O(khb1.b() | 20);
                        }
                    }
                }
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add("androidx.compose.ui.semantics.id");
            CharSequence charSequence0 = khb1.j();
            if(charSequence0 != null && charSequence0.length() != 0 && ity1.f(itw.a)) {
                arrayList0.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if(ity1.f(ivi5)) {
                arrayList0.add("androidx.compose.ui.semantics.testTag");
            }
            if(ity1.f(iuz.O)) {
                arrayList0.add("androidx.compose.ui.semantics.shapeType");
                arrayList0.add("androidx.compose.ui.semantics.shapeRect");
                arrayList0.add("androidx.compose.ui.semantics.shapeCorners");
                arrayList0.add("androidx.compose.ui.semantics.shapeRegion");
            }
            accessibilityNodeInfo0.setAvailableExtraData(arrayList0);
            itr itr0 = (itr)itz.a(ity1, iuz.c);
            if(itr0 != null) {
                ivi ivi8 = itw.h;
                if(ity1.f(ivi8)) {
                    khb1.y("android.widget.SeekBar");
                }
                else {
                    khb1.y("android.widget.ProgressBar");
                }
                if(itr0 != itr.a) {
                    khb1.T(kha.a(((Number)itr0.c.c()).floatValue(), ((Number)itr0.c.b()).floatValue(), itr0.b));
                }
                if(ity1.f(ivi8) && ilx.d(iug0)) {
                    float f = itr0.b;
                    ibwh ibwh0 = itr0.c;
                    if((f < ibwt.d(((Number)ibwh0.b()).floatValue(), ((Number)ibwh0.c()).floatValue()))) {
                        khb1.n(kgx.m);
                    }
                    if((f > ibwt.e(((Number)ibwh0.c()).floatValue(), ((Number)ibwh0.b()).floatValue()))) {
                        khb1.n(kgx.n);
                    }
                }
            }
            if(ilx.d(iug0)) {
                itj itj8 = (itj)itz.a(ity1, itw.h);
                if(itj8 != null) {
                    khb1.n(new kgx(0x102003D, itj8.a));
                }
            }
            ity ity4 = iug0.e();
            ivi ivi9 = iuz.f;
            itk itk0 = (itk)itz.a(ity4, ivi9);
            if(itk0 == null) {
                ArrayList arrayList1 = new ArrayList();
                if(itz.a(iug0.e(), iuz.e) != null) {
                    List list3 = iug0.i();
                    int v9 = list3.size();
                    for(int v10 = 0; v10 < v9; ++v10) {
                        iug iug5 = (iug)list3.get(v10);
                        if(iug5.e().f(ivi4)) {
                            arrayList1.add(iug5);
                        }
                    }
                }
                if(!arrayList1.isEmpty()) {
                    boolean z8 = isa.a(arrayList1);
                    khb1.A(kgy.a((z8 ? 1 : arrayList1.size()), (z8 ? arrayList1.size() : 1), 0));
                }
            }
            else {
                khb1.A(kgy.a(itk0.a, itk0.b, 0));
            }
            itl itl0 = (itl)itz.a(iug0.e(), iuz.g);
            if(itl0 != null) {
                boolean z9 = ((Boolean)iug0.e().d(ivi4, irz.a)).booleanValue();
                khb1.B(kgz.a(itl0.a, itl0.b, itl0.c, itl0.d, false, z9));
            }
            iug iug6 = iug0.g();
            if(iug6 != null && itz.a(iug6.e(), iuz.e) != null) {
                itk itk1 = (itk)itz.a(iug6.e(), ivi9);
                if((itk1 == null || itk1.a >= 0 && itk1.b >= 0) && iug0.e().f(ivi4)) {
                    ArrayList arrayList2 = new ArrayList();
                    List list4 = iug6.i();
                    int v11 = list4.size();
                    int v13 = 0;
                    for(int v12 = 0; v12 < v11; ++v12) {
                        iug iug7 = (iug)list4.get(v12);
                        if(iug7.e().f(ivi4)) {
                            arrayList2.add(iug7);
                            if(iug7.a.g() < iug0.a.g()) {
                                ++v13;
                            }
                        }
                    }
                    if(!arrayList2.isEmpty()) {
                        boolean z10 = isa.a(arrayList2);
                        khb1.B(kgz.a((z10 ? 0 : v13), 1, (z10 ? v13 : 0), 1, false, ((Boolean)iug0.e().d(ivi4, iry.a)).booleanValue()));
                    }
                }
            }
            itu itu0 = (itu)itz.a(ity1, iuz.t);
            itj itj9 = (itj)itz.a(ity1, itw.d);
            if(itu0 != null && itj9 != null) {
                if(!isa.b(iug0)) {
                    khb1.y("android.widget.HorizontalScrollView");
                }
                if((((Number)itu0.b.a()).floatValue() > 0.0f)) {
                    khb1.W(true);
                }
                if(ilx.d(iug0)) {
                    if(ilt.I(itu0)) {
                        khb1.n(kgx.m);
                        khb1.n((ilx.f(iug0) ? kgx.z : kgx.B));
                    }
                    if(ilt.H(itu0)) {
                        khb1.n(kgx.n);
                        khb1.n((ilx.f(iug0) ? kgx.B : kgx.z));
                    }
                }
            }
            itu itu1 = (itu)itz.a(ity1, iuz.u);
            if(itu1 != null && itj9 != null) {
                if(!isa.b(iug0)) {
                    khb1.y("android.widget.ScrollView");
                }
                if((((Number)itu1.b.a()).floatValue() > 0.0f)) {
                    khb1.W(true);
                }
                if(ilx.d(iug0)) {
                    if(ilt.I(itu1)) {
                        khb1.n(kgx.m);
                        khb1.n(kgx.A);
                    }
                    if(ilt.H(itu1)) {
                        khb1.n(kgx.n);
                        khb1.n(kgx.y);
                    }
                }
            }
            its its1 = (its)itz.a(ity1, ivi2);
            if(ilx.d(iug0) && (its1 == null || its1.a != 8)) {
                itj itj10 = (itj)itz.a(ity1, itw.x);
                if(itj10 != null) {
                    khb1.n(new kgx(0x1020046, itj10.a));
                }
                itj itj11 = (itj)itz.a(ity1, itw.z);
                if(itj11 != null) {
                    khb1.n(new kgx(0x1020047, itj11.a));
                }
                itj itj12 = (itj)itz.a(ity1, itw.y);
                if(itj12 != null) {
                    khb1.n(new kgx(0x1020048, itj12.a));
                }
                itj itj13 = (itj)itz.a(ity1, itw.A);
                if(itj13 != null) {
                    khb1.n(new kgx(0x1020049, itj13.a));
                }
            }
            khb1.Q(((CharSequence)itz.a(ity1, iuz.d)));
            if(ilx.d(iug0)) {
                itj itj14 = (itj)itz.a(ity1, itw.s);
                if(itj14 != null) {
                    khb1.n(new kgx(0x40000, itj14.a));
                }
                itj itj15 = (itj)itz.a(ity1, itw.t);
                if(itj15 != null) {
                    khb1.n(new kgx(0x80000, itj15.a));
                }
                itj itj16 = (itj)itz.a(ity1, itw.u);
                if(itj16 != null) {
                    khb1.n(new kgx(0x100000, itj16.a));
                }
                ivi ivi10 = itw.w;
                if(ity1.f(ivi10)) {
                    List list5 = (List)ity1.c(ivi10);
                    bxt bxt0 = ilt.a;
                    if(list5.size() >= bxt0.b) {
                        throw new IllegalStateException("Can\'t have more than " + bxt0.b + " custom actions for one widget");
                    }
                    bzt bzt0 = new bzt(null);
                    bza bza0 = new bza(null);
                    bzt bzt1 = ilt0.k;
                    if(bzt1.i(v)) {
                        bza bza1 = (bza)bzu.a(bzt1, v);
                        bxt bxt1 = new bxt(null);
                        int[] arr_v = bxt0.a;
                        int v14 = bxt0.b;
                        for(int v15 = 0; v15 < v14; ++v15) {
                            bxt1.g(arr_v[v15]);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int v16 = list5.size();
                        int v17 = 0;
                        while(v17 < v16) {
                            itn itn0 = (itn)list5.get(v17);
                            ibuq.c(bza1);
                            String s3 = itn0.a;
                            if(bza1.a(s3) >= 0) {
                                int v18 = bza1.a(s3);
                                v19 = v17;
                                if(v18 < 0) {
                                    v20 = v18;
                                    cad.d(a.i(s3, "There is no key ", " in the map"));
                                }
                                else {
                                    v20 = v18;
                                }
                                int v21 = bza1.c[v20];
                                bzt0.h(v21, s3);
                                bza0.f(s3, v21);
                                bza2 = bza1;
                                int v22 = bxt1.b;
                                int[] arr_v1 = bxt1.a;
                                int v23 = 0;
                                while(true) {
                                    if(v23 < v22) {
                                        if(v21 == arr_v1[v23]) {
                                            break;
                                        }
                                        else {
                                            ++v23;
                                            v22 = v22;
                                            continue;
                                        }
                                    }
                                    v23 = -1;
                                    break;
                                }
                                if(v23 >= 0) {
                                    bxt1.h(v23);
                                }
                                khb1.n(new kgx(v21, s3));
                            }
                            else {
                                bza2 = bza1;
                                v19 = v17;
                                arrayList3.add(itn0);
                            }
                            v17 = v19 + 1;
                            v16 = v16;
                            bza1 = bza2;
                        }
                        int v24 = arrayList3.size();
                        for(int v25 = 0; v25 < v24; ++v25) {
                            itn itn1 = (itn)arrayList3.get(v25);
                            int v26 = bxt1.a(v25);
                            bzt0.h(v26, itn1.a);
                            bza0.f(itn1.a, v26);
                            khb1.n(new kgx(v26, itn1.a));
                        }
                    }
                    else {
                        int v27 = list5.size();
                        for(int v28 = 0; v28 < v27; ++v28) {
                            itn itn2 = (itn)list5.get(v28);
                            int v29 = bxt0.a(v28);
                            bzt0.h(v29, itn2.a);
                            bza0.f(itn2.a, v29);
                            khb1.n(new kgx(v29, itn2.a));
                        }
                    }
                    ilt0.j.h(v, bzt0);
                    bzt1.h(v, bza0);
                }
            }
            khb1.V(ilx.g(iug0, resources1));
            int v30 = ilt0.y.d(v);
            if(v30 != -1) {
                View view0 = iql.a(ili0.D(), v30);
                if(view0 == null) {
                    khb1.ae(ili0, v30);
                }
                else {
                    khb1.ad(view0);
                }
                ilt0.t(v, khb1, ilt0.p, null);
            }
            int v31 = ilt0.z.d(v);
            if(v31 != -1) {
                View view1 = iql.a(ili0.D(), v31);
                if(view1 != null) {
                    khb1.ac(view1);
                    ilt0.t(v, khb1, ilt0.q, null);
                }
            }
            String s4 = (String)itz.a(ity1, ivc.b);
            if(s4 != null) {
                khb1.y(s4);
            }
            khb0 = khb1;
        label_469:
            if(ilt0.i) {
                if(v == ilt0.e) {
                    ilt0.g = khb0;
                }
                if(v == ilt0.f) {
                    ilt0.h = khb0;
                }
            }
            return khb0;
        }
        hxt.b(a.f(v, "semanticsNode ", " has null parent"));
        throw new ibnm();
    }

    @Override  // khe
    public final khb b(int v) {
        switch(v) {
            case 1: {
                int v1 = this.a.f;
                return v1 == 0x80000000 ? null : this.a(v1);
            }
            case 2: {
                return this.a(this.a.e);
            }
            default: {
                throw new IllegalArgumentException("Unknown focus type: " + v);
            }
        }
    }

    @Override  // khe
    public final void c(int v, khb khb0, String s, Bundle bundle0) {
        this.a.t(v, khb0, s, bundle0);
    }

    @Override  // khe
    public final boolean d(int v, int v1, Bundle bundle0) {
        int v20;
        ijt ijt0;
        itj itj18;
        int v8;
        float f1;
        Boolean boolean1;
        int v12;
        Bundle bundle1 = bundle0;
        ilt ilt0 = this.a;
        iui iui0 = (iui)ilt0.q().a(v);
        if(iui0 != null) {
            iug iug0 = iui0.a;
            if(iug0 == null) {
                return false;
            }
            ity ity0 = iug0.b;
            int v2 = 1;
            Boolean boolean0 = Boolean.valueOf(true);
            if(ibuq.m(itz.a(ity0, iuz.n), boolean0) && !ilt0.E()) {
                return false;
            }
            String s = null;
            switch(v1) {
                case 0x40: {
                    if(!ilt0.F()) {
                        return false;
                    }
                    if(!ilt0.C(v)) {
                        int v21 = ilt0.e;
                        if(v21 != 0x80000000) {
                            ilt.K(ilt0, v21, 0x10000, null, 12);
                        }
                        ilt0.e = v;
                        ilt0.b.invalidate();
                        ilt.K(ilt0, v, 0x8000, null, 12);
                        return true;
                    }
                    return false;
                }
                case 0x80: {
                    break;
                }
                default: {
                    int v3 = 0x100;
                    int v4 = -1;
                    if(v1 != 0x100 && v1 != 0x200) {
                        switch(v1) {
                            case 0x4000: {
                                itj itj21 = (itj)itz.a(ity0, itw.p);
                                if(itj21 != null) {
                                    ibth ibth15 = (ibth)itj21.b;
                                    return ibth15 == null ? false : ((Boolean)ibth15.a()).booleanValue();
                                }
                                return false;
                            }
                            case 0x20000: {
                                if(bundle1 == null) {
                                    bundle1 = null;
                                    v12 = -1;
                                }
                                else {
                                    v12 = bundle1.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                }
                                if(bundle1 != null) {
                                    v4 = bundle1.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                                }
                                boolean z = ilt0.J(iug0, v12, v4, false);
                                if(z) {
                                    ilt.K(ilt0, ilt0.m(iug0.d), 0, null, 12);
                                }
                                return z;
                            }
                            default: {
                                if(!ilx.d(iug0)) {
                                    return false;
                                }
                                switch(v1) {
                                    case 1: {
                                        ili ili0 = ilt0.b;
                                        if(ili0.isInTouchMode()) {
                                            ili0.requestFocusFromTouch();
                                        }
                                        itj itj4 = (itj)itz.a(ity0, itw.v);
                                        if(itj4 != null) {
                                            ibth ibth4 = (ibth)itj4.b;
                                            return ibth4 == null ? false : ((Boolean)ibth4.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 2: {
                                        if(!ibuq.m(itz.a(ity0, iuz.k), boolean0)) {
                                            return false;
                                        }
                                        ilt0.b.R.l(false, true, 8);
                                        return true;
                                    }
                                    case 16: {
                                        itj itj5 = (itj)itz.a(ity0, itw.b);
                                        if(itj5 == null) {
                                            boolean1 = null;
                                        }
                                        else {
                                            ibth ibth5 = (ibth)itj5.b;
                                            boolean1 = ibth5 == null ? null : ((Boolean)ibth5.a());
                                        }
                                        ilt.K(ilt0, v, 1, null, 12);
                                        return boolean1 == null ? false : boolean1.booleanValue();
                                    }
                                    case 0x20: {
                                        itj itj6 = (itj)itz.a(ity0, itw.c);
                                        if(itj6 != null) {
                                            ibth ibth6 = (ibth)itj6.b;
                                            return ibth6 == null ? false : ((Boolean)ibth6.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x1000: 
                                    case 0x2000: {
                                    label_88:
                                        if(v1 != 0x1020038 && v1 != 0x102003A && v1 != 0x1000 && v1 != 0x2000) {
                                            v2 = 0;
                                        }
                                        if(v1 == 0x1000 || v1 == 0x2000) {
                                            itr itr0 = (itr)itz.a(ity0, iuz.c);
                                            itj itj7 = (itj)itz.a(ity0, itw.h);
                                            if(itr0 != null && itj7 != null) {
                                                float f = (ibwt.d(((Number)itr0.c.b()).floatValue(), ((Number)itr0.c.c()).floatValue()) - ibwt.e(((Number)itr0.c.c()).floatValue(), ((Number)itr0.c.b()).floatValue())) / 20.0f;
                                                if(v1 == 0x2000) {
                                                    f = -f;
                                                }
                                                ibts ibts0 = (ibts)itj7.b;
                                                return ibts0 == null ? false : ((Boolean)ibts0.a(Float.valueOf(itr0.b + f))).booleanValue();
                                            }
                                        }
                                        long v7 = hzl.d(iug0.a.r()).b();
                                        ArrayList arrayList0 = new ArrayList();
                                        itj itj8 = (itj)itz.a(ity0, itw.B);
                                        if(itj8 != null) {
                                            ibts ibts1 = (ibts)itj8.b;
                                            if(ibts1 != null && ((Boolean)ibts1.a(arrayList0)).booleanValue()) {
                                                s = (Float)arrayList0.get(0);
                                            }
                                        }
                                        itj itj9 = (itj)itz.a(ity0, itw.d);
                                        if(itj9 == null) {
                                            return false;
                                        }
                                        itu itu0 = (itu)itz.a(ity0, iuz.t);
                                        if(itu0 != null && (v1 == 0x1020039 || v1 == 0x102003B || v1 == 0x1000 || v1 == 0x2000)) {
                                            if(s == null) {
                                                v8 = v2;
                                                f1 = Float.intBitsToFloat(((int)(v7 >> 0x20)));
                                            }
                                            else {
                                                f1 = (float)(((Float)s));
                                                v8 = v2;
                                            }
                                            if(v1 == 0x1020039 || v1 == 0x2000) {
                                                f1 = -f1;
                                            }
                                            if(itu0.c) {
                                                f1 = -f1;
                                            }
                                            if(ilx.f(iug0) && (v1 == 0x1020039 || v1 == 0x102003B)) {
                                                f1 = -f1;
                                            }
                                            if(ilt.G(itu0, f1)) {
                                                ivi ivi0 = itw.y;
                                                if(!ity0.f(ivi0) && !ity0.f(itw.A)) {
                                                    ibtw ibtw0 = (ibtw)itj9.b;
                                                    return ibtw0 == null ? false : ((Boolean)ibtw0.a(Float.valueOf(f1), Float.valueOf(0.0f))).booleanValue();
                                                }
                                                itj itj10 = f1 > 0.0f ? ((itj)itz.a(ity0, itw.A)) : ((itj)itz.a(ity0, ivi0));
                                                if(itj10 != null) {
                                                    ibth ibth7 = (ibth)itj10.b;
                                                    return ibth7 == null ? false : ((Boolean)ibth7.a()).booleanValue();
                                                }
                                                return false;
                                            }
                                        }
                                        else {
                                            v8 = v2;
                                        }
                                        itu itu1 = (itu)itz.a(ity0, iuz.u);
                                        if(itu1 != null && v8 != 0) {
                                            float f2 = s == null ? Float.intBitsToFloat(((int)(v7 & 0xFFFFFFFFL))) : ((float)(((Float)s)));
                                            if(v1 == 0x1020038 || v1 == 0x2000) {
                                                f2 = -f2;
                                            }
                                            if(itu1.c) {
                                                f2 = -f2;
                                            }
                                            if(ilt.G(itu1, f2)) {
                                                ivi ivi1 = itw.x;
                                                if(!ity0.f(ivi1) && !ity0.f(itw.z)) {
                                                    ibtw ibtw1 = (ibtw)itj9.b;
                                                    return ibtw1 == null ? false : ((Boolean)ibtw1.a(Float.valueOf(0.0f), Float.valueOf(f2))).booleanValue();
                                                }
                                                itj itj11 = f2 > 0.0f ? ((itj)itz.a(ity0, itw.z)) : ((itj)itz.a(ity0, ivi1));
                                                if(itj11 != null) {
                                                    ibth ibth8 = (ibth)itj11.b;
                                                    return ibth8 == null ? false : ((Boolean)ibth8.a()).booleanValue();
                                                }
                                            }
                                        }
                                        return false;
                                    }
                                    case 0x8000: {
                                        itj itj12 = (itj)itz.a(ity0, itw.r);
                                        if(itj12 != null) {
                                            ibth ibth9 = (ibth)itj12.b;
                                            return ibth9 == null ? false : ((Boolean)ibth9.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x10000: {
                                        itj itj13 = (itj)itz.a(ity0, itw.q);
                                        if(itj13 != null) {
                                            ibth ibth10 = (ibth)itj13.b;
                                            return ibth10 == null ? false : ((Boolean)ibth10.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x40000: {
                                        itj itj14 = (itj)itz.a(ity0, itw.s);
                                        if(itj14 != null) {
                                            ibth ibth11 = (ibth)itj14.b;
                                            return ibth11 == null ? false : ((Boolean)ibth11.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x80000: {
                                        itj itj15 = (itj)itz.a(ity0, itw.t);
                                        if(itj15 != null) {
                                            ibth ibth12 = (ibth)itj15.b;
                                            return ibth12 == null ? false : ((Boolean)ibth12.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x100000: {
                                        itj itj16 = (itj)itz.a(ity0, itw.u);
                                        if(itj16 != null) {
                                            ibth ibth13 = (ibth)itj16.b;
                                            return ibth13 == null ? false : ((Boolean)ibth13.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x200000: {
                                        if(bundle1 != null) {
                                            s = bundle1.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                        }
                                        itj itj17 = (itj)itz.a(ity0, itw.j);
                                        if(itj17 != null) {
                                            ibts ibts2 = (ibts)itj17.b;
                                            if(ibts2 != null) {
                                                if(s == null) {
                                                    s = "";
                                                }
                                                return ((Boolean)ibts2.a(new iwj(s))).booleanValue();
                                            }
                                        }
                                        return false;
                                    }
                                    case 0x1020036: {
                                        iug iug1 = iug0.g();
                                        if(iug1 != null) {
                                            itj18 = (itj)itz.a(iug1.b, itw.d);
                                            goto label_191;
                                        }
                                        while(true) {
                                            itj18 = null;
                                        label_191:
                                            if(iug1 == null || itj18 != null) {
                                                break;
                                            }
                                            iug1 = iug1.g();
                                            if(iug1 == null) {
                                                continue;
                                            }
                                            itj18 = (itj)itz.a(iug1.b, itw.d);
                                            goto label_191;
                                        }
                                        if(iug1 == null) {
                                            hka hka0 = iug0.b();
                                            return ilt0.b.requestRectangleOnScreen(new Rect(((int)(((float)Math.floor(hka0.b)))), ((int)(((float)Math.floor(hka0.c)))), ibvr.c(((float)Math.ceil(hka0.d))), ibvr.c(((float)Math.ceil(hka0.e)))));
                                        }
                                        hzk hzk0 = iug1.a.r().ef();
                                        long v9 = 0L;
                                        long v10 = hzk0 == null ? 0L : hzl.a(hzk0);
                                        hka hka1 = hzl.d(iug1.a.r()).f(v10);
                                        long v11 = iug0.a();
                                        ihy ihy0 = iug0.d();
                                        if(ihy0 != null) {
                                            v9 = ihy0.c;
                                        }
                                        hka hka2 = hkb.b(v11, jll.b(v9));
                                        itu itu2 = (itu)itz.a(iug1.b, iuz.t);
                                        itu itu3 = (itu)itz.a(iug1.b, iuz.u);
                                        float f3 = itu2 == null || !itu2.c ? ilt.j(hka2.b - hka1.b, hka2.d - hka1.d) : -ilt.j(hka2.b - hka1.b, hka2.d - hka1.d);
                                        if(ilx.f(iug0)) {
                                            f3 = -f3;
                                        }
                                        float f4 = itu3 == null || !itu3.c ? ilt.j(hka2.c - hka1.c, hka2.e - hka1.e) : -ilt.j(hka2.c - hka1.c, hka2.e - hka1.e);
                                        if(itj18 != null) {
                                            ibtw ibtw2 = (ibtw)itj18.b;
                                            return ibtw2 == null ? false : ((Boolean)ibtw2.a(Float.valueOf(f3), Float.valueOf(f4))).booleanValue();
                                        }
                                        return false;
                                    }
                                    case 0x102003D: {
                                        if(bundle1 != null) {
                                            if(!bundle1.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                return false;
                                            }
                                            itj itj19 = (itj)itz.a(ity0, itw.h);
                                            if(itj19 != null) {
                                                ibts ibts3 = (ibts)itj19.b;
                                                return ibts3 == null ? false : ((Boolean)ibts3.a(Float.valueOf(bundle1.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                            }
                                        }
                                        return false;
                                    }
                                    case 0x1020054: {
                                        itj itj20 = (itj)itz.a(ity0, itw.o);
                                        if(itj20 != null) {
                                            ibth ibth14 = (ibth)itj20.b;
                                            return ibth14 == null ? false : ((Boolean)ibth14.a()).booleanValue();
                                        }
                                        return false;
                                    }
                                    default: {
                                        if(v1 != 0x1020038 && v1 != 0x1020039 && v1 != 0x102003A && v1 != 0x102003B) {
                                            switch(v1) {
                                                case 0x1020046: {
                                                    itj itj0 = (itj)itz.a(ity0, itw.x);
                                                    if(itj0 != null) {
                                                        ibth ibth0 = (ibth)itj0.b;
                                                        return ibth0 == null ? false : ((Boolean)ibth0.a()).booleanValue();
                                                    }
                                                    return false;
                                                }
                                                case 0x1020047: {
                                                    itj itj1 = (itj)itz.a(ity0, itw.z);
                                                    if(itj1 != null) {
                                                        ibth ibth1 = (ibth)itj1.b;
                                                        return ibth1 == null ? false : ((Boolean)ibth1.a()).booleanValue();
                                                    }
                                                    return false;
                                                }
                                                case 0x1020048: {
                                                    itj itj2 = (itj)itz.a(ity0, itw.y);
                                                    if(itj2 != null) {
                                                        ibth ibth2 = (ibth)itj2.b;
                                                        return ibth2 == null ? false : ((Boolean)ibth2.a()).booleanValue();
                                                    }
                                                    return false;
                                                }
                                                case 0x1020049: {
                                                    itj itj3 = (itj)itz.a(ity0, itw.A);
                                                    if(itj3 != null) {
                                                        ibth ibth3 = (ibth)itj3.b;
                                                        return ibth3 == null ? false : ((Boolean)ibth3.a()).booleanValue();
                                                    }
                                                    return false;
                                                }
                                                default: {
                                                    bzt bzt0 = (bzt)bzu.a(ilt0.j, v);
                                                    if(bzt0 != null) {
                                                        CharSequence charSequence0 = (CharSequence)bzu.a(bzt0, v1);
                                                        if(charSequence0 == null) {
                                                            return false;
                                                        }
                                                        List list0 = (List)itz.a(ity0, itw.w);
                                                        if(list0 == null) {
                                                            return false;
                                                        }
                                                        int v5 = list0.size();
                                                        for(int v6 = 0; v6 < v5; ++v6) {
                                                            itn itn0 = (itn)list0.get(v6);
                                                            if(ibuq.m(itn0.a, charSequence0)) {
                                                                return ((Boolean)itn0.b.a()).booleanValue();
                                                            }
                                                        }
                                                    }
                                                    return false;
                                                }
                                            }
                                        }
                                        goto label_88;
                                    }
                                }
                            }
                        }
                    }
                    if(bundle1 != null) {
                        int v13 = v1 == 0x100 ? 1 : 0;
                        int v14 = iug0.d;
                        int v15 = bundle1.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        boolean z1 = bundle1.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        if(ilt0.m == null || v14 != ((int)ilt0.m)) {
                            ilt0.l = -1;
                            ilt0.m = v14;
                        }
                        String s1 = ilt.O(iug0);
                        if(s1 != null) {
                            if(s1.length() == 0) {
                                return false;
                            }
                            String s2 = ilt.O(iug0);
                            if(s2 != null && s2.length() != 0) {
                                switch(v15) {
                                    case 1: {
                                        Locale locale0 = ilt0.b.getContext().getResources().getConfiguration().locale;
                                        if(ijt.b == null) {
                                            ijt.b = new ijt(locale0);
                                        }
                                        ijt0 = ijt.b;
                                        ibuq.d(ijt0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                        ijt0.a = s2;
                                        BreakIterator breakIterator0 = ijt0.c;
                                        if(breakIterator0 == null) {
                                            ibuq.j("impl");
                                        }
                                        else {
                                            s = breakIterator0;
                                        }
                                        ((BreakIterator)s).setText(s2);
                                        s = ijt0;
                                        break;
                                    }
                                    case 2: {
                                        Locale locale1 = ilt0.b.getContext().getResources().getConfiguration().locale;
                                        if(ijy.b == null) {
                                            ijy.b = new ijy(locale1);
                                        }
                                        ijt0 = ijy.b;
                                        ibuq.d(ijt0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                        ijt0.a = s2;
                                        BreakIterator breakIterator1 = ijt0.c;
                                        if(breakIterator1 == null) {
                                            ibuq.j("impl");
                                        }
                                        else {
                                            s = breakIterator1;
                                        }
                                        ((BreakIterator)s).setText(s2);
                                        s = ijt0;
                                        break;
                                    }
                                    case 4: {
                                    label_290:
                                        if(ity0.f(itw.a)) {
                                            jbe jbe0 = iql.c(ity0);
                                            if(jbe0 != null) {
                                                if(v15 == 4) {
                                                    if(iju.b == null) {
                                                        iju.b = new iju();
                                                    }
                                                    s = iju.b;
                                                    ibuq.d(s, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                    s.a = s2;
                                                    s.c = jbe0;
                                                }
                                                else {
                                                    if(ijv.b == null) {
                                                        ijv.b = new ijv();
                                                    }
                                                    s = ijv.b;
                                                    ibuq.d(s, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                    s.a = s2;
                                                    s.c = jbe0;
                                                    s.d = iug0;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    case 8: {
                                        if(ijw.b == null) {
                                            ijw.b = new ijw();
                                        }
                                        s = ijw.b;
                                        ibuq.d(s, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                        s.a = s2;
                                        break;
                                    }
                                    default: {
                                        if(v15 == 16) {
                                            goto label_290;
                                        }
                                    }
                                }
                            }
                            if(s == null) {
                                return false;
                            }
                            int v16 = ilt0.k(iug0);
                            if(v16 == -1) {
                                v16 = v13 == 0 ? s1.length() : 0;
                            }
                            int[] arr_v = v13 == 0 ? ((ijx)s).d(v16) : ((ijx)s).c(v16);
                            if(arr_v == null) {
                                return false;
                            }
                            int v17 = arr_v[0];
                            int v18 = arr_v[1];
                            int v19 = 1 == v13 ? v18 : v17;
                            if(z1 && !ity0.f(iuz.a) && ity0.f(iuz.E)) {
                                v20 = ilt0.l(iug0);
                                if(v20 == -1) {
                                    v20 = 1 == v13 ? v17 : v18;
                                }
                            }
                            else {
                                v20 = v19;
                            }
                            if(1 != v13) {
                                v3 = 0x200;
                            }
                            ilt0.o = new ill(iug0, v3, v15, v17, v18, SystemClock.uptimeMillis());
                            ilt0.J(iug0, v20, v19, true);
                            return true;
                        }
                    }
                    return false;
                }
            }
            if(ilt0.C(v)) {
                ilt0.e = 0x80000000;
                ilt0.g = null;
                ilt0.b.invalidate();
                ilt.K(ilt0, v, 0x10000, null, 12);
                return true;
            }
            return false;
        }
        return false;
    }
}

