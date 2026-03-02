import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jeb.synthetic.FIN;

public final class jec implements ibts {
    public final jed a;
    public final jff b;

    public jec(jed jed0, jff jff0) {
        this.a = jed0;
        this.b = jff0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        jfj jfj0;
        Object object1;
        Object object11;
        ibns ibns0;
        Object object9;
        Object object10;
        jdh jdh0;
        jek jek0;
        jff jff0 = this.b;
        jdz jdz0 = jff0.a;
        if((jdz0 instanceof jeh)) {
            List list0 = ((jeh)jdz0).f;
            jeu jeu0 = jff0.b;
            int v = jff0.c;
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object2 = list0.get(v2);
                jdy jdy0 = (jdy)object2;
                if(ibuq.m(jdy0.c(), jeu0) && jem.b(jdy0.b(), v)) {
                    arrayList0.add(object2);
                }
            }
            if(arrayList0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList(list0.size());
                int v3 = list0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object3 = list0.get(v4);
                    if(jem.b(((jdy)object3).b(), v)) {
                        arrayList1.add(object3);
                    }
                }
                if(!arrayList1.isEmpty()) {
                    list0 = arrayList1;
                }
                if(jeu0.a(jeu.a) < 0) {
                    int v5 = list0.size();
                    int v6 = 0;
                    jeu jeu1 = null;
                    jeu jeu2 = null;
                    while(v6 < v5) {
                        jeu jeu3 = ((jdy)list0.get(v6)).c();
                        if(jeu3.a(jeu0) < 0) {
                            if(jeu1 == null || jeu3.a(jeu1) > 0) {
                                jeu1 = jeu3;
                            }
                            ++v6;
                            continue;
                        }
                        else if(jeu3.a(jeu0) > 0) {
                            if(jeu2 == null || jeu3.a(jeu2) < 0) {
                                jeu2 = jeu3;
                            }
                            ++v6;
                            continue;
                        }
                        else {
                            jeu1 = jeu3;
                            jeu2 = jeu1;
                        }
                        break;
                    }
                    arrayList0 = new ArrayList(list0.size());
                    int v7 = list0.size();
                    for(int v8 = 0; v8 < v7; ++v8) {
                        Object object4 = list0.get(v8);
                        if(ibuq.m(((jdy)object4).c(), (jeu1 == null ? jeu2 : jeu1))) {
                            arrayList0.add(object4);
                        }
                    }
                }
                else {
                    jeu jeu4 = jeu.b;
                    if(jeu0.a(jeu4) > 0) {
                        int v9 = list0.size();
                        int v10 = 0;
                        jeu jeu5 = null;
                        jeu jeu6 = null;
                        while(v10 < v9) {
                            jeu jeu7 = ((jdy)list0.get(v10)).c();
                            if(jeu7.a(jeu0) < 0) {
                                if(jeu5 == null || jeu7.a(jeu5) > 0) {
                                    jeu5 = jeu7;
                                }
                                ++v10;
                                continue;
                            }
                            else if(jeu7.a(jeu0) > 0) {
                                if(jeu6 == null || jeu7.a(jeu6) < 0) {
                                    jeu6 = jeu7;
                                }
                                ++v10;
                                continue;
                            }
                            else {
                                jeu5 = jeu7;
                                jeu6 = jeu5;
                            }
                            break;
                        }
                        arrayList0 = new ArrayList(list0.size());
                        int v11 = list0.size();
                        for(int v12 = 0; v12 < v11; ++v12) {
                            Object object5 = list0.get(v12);
                            if(ibuq.m(((jdy)object5).c(), (jeu6 == null ? jeu5 : jeu6))) {
                                arrayList0.add(object5);
                            }
                        }
                    }
                    else {
                        int v13 = list0.size();
                        int v14 = 0;
                        jeu jeu8 = null;
                        jeu jeu9 = null;
                        while(v14 < v13) {
                            jeu jeu10 = ((jdy)list0.get(v14)).c();
                            if(jeu4 != null && jeu10.a(jeu4) > 0) {
                                ++v14;
                                continue;
                            }
                            else if(jeu10.a(jeu0) < 0) {
                                if(jeu8 == null || jeu10.a(jeu8) > 0) {
                                    jeu8 = jeu10;
                                }
                                ++v14;
                                continue;
                            }
                            else if(jeu10.a(jeu0) > 0) {
                                if(jeu9 == null || jeu10.a(jeu9) < 0) {
                                    jeu9 = jeu10;
                                }
                                ++v14;
                                continue;
                            }
                            else {
                                jeu8 = jeu10;
                                jeu9 = jeu8;
                            }
                            break;
                        }
                        arrayList0 = new ArrayList(list0.size());
                        int v15 = list0.size();
                        for(int v16 = 0; v16 < v15; ++v16) {
                            Object object6 = list0.get(v16);
                            if(ibuq.m(((jdy)object6).c(), (jeu9 == null ? jeu8 : jeu9))) {
                                arrayList0.add(object6);
                            }
                        }
                        if(arrayList0.isEmpty()) {
                            int v17 = list0.size();
                            int v18 = 0;
                            jeu jeu11 = null;
                            jeu jeu12 = null;
                            while(v18 < v17) {
                                jeu jeu13 = ((jdy)list0.get(v18)).c();
                                if(jeu4 != null && jeu13.a(jeu4) < 0) {
                                    ++v18;
                                    continue;
                                }
                                else if(jeu13.a(jeu0) < 0) {
                                    if(jeu11 == null || jeu13.a(jeu11) > 0) {
                                        jeu11 = jeu13;
                                    }
                                    ++v18;
                                    continue;
                                }
                                else if(jeu13.a(jeu0) > 0) {
                                    if(jeu12 == null || jeu13.a(jeu12) < 0) {
                                        jeu12 = jeu13;
                                    }
                                    ++v18;
                                    continue;
                                }
                                else {
                                    jeu11 = jeu13;
                                    jeu12 = jeu11;
                                }
                                break;
                            }
                            arrayList0 = new ArrayList(list0.size());
                            int v19 = list0.size();
                            for(int v20 = 0; v20 < v19; ++v20) {
                                Object object7 = list0.get(v20);
                                if(ibuq.m(((jdy)object7).c(), (jeu12 == null ? jeu11 : jeu12))) {
                                    arrayList0.add(object7);
                                }
                            }
                        }
                    }
                }
            }
            jed jed0 = this.a;
            int v21 = arrayList0.size();
            int v22 = 0;
            Object object8 = null;
        alab1:
            while(true) {
                jek0 = jed0.a;
                ibts ibts0 = jed0.b;
                jdh0 = jed0.c;
                if(v22 < v21) {
                    jdt jdt0 = jek0.a;
                    jdy jdy1 = (jdy)arrayList0.get(v22);
                    int v23 = jdy1.a();
                    if(v23 == 0) {
                        jiz jiz0 = jdt0.b;
                        __monitor_enter(jiz0);
                        int v24 = FIN.finallyOpen$NT();
                        jdr jdr0 = new jdr(jdy1);
                        jdq jdq0 = (jdq)jdt0.a.d(jdr0);
                        if(jdq0 == null) {
                            jdq0 = (jdq)jdt0.c.a(jdr0);
                        }
                        if(jdq0 == null) {
                            FIN.finallyCodeBegin$NT(v24);
                            try {
                                object10 = jdh0.b(jdy1);
                            }
                            catch(Exception unused_ex) {
                                object10 = ibts0.a(jff0);
                            }
                            object9 = object10;
                            jdt.a(jdt0, jdy1, object9);
                        }
                        else {
                            object9 = jdq0.a;
                            FIN.finallyExec$NT(v24);
                        }
                        if(object9 == null) {
                            object9 = ibts0.a(jff0);
                        }
                        ibns0 = new ibns(object8, jeo.a(jff0.d, object9, jdy1, jff0.b, jff0.c));
                        break;
                    }
                    switch(v23) {
                        case 1: {
                            jiz jiz1 = jdt0.b;
                            __monitor_enter(jiz1);
                            int v25 = FIN.finallyOpen$NT();
                            jdr jdr1 = new jdr(jdy1);
                            jdq jdq1 = (jdq)jdt0.a.d(jdr1);
                            if(jdq1 == null) {
                                jdq1 = (jdq)jdt0.c.a(jdr1);
                            }
                            if(jdq1 == null) {
                                FIN.finallyCodeBegin$NT(v25);
                                __monitor_exit(jiz1);
                                FIN.finallyCodeEnd$NT(v25);
                                try {
                                    object11 = jdh0.b(jdy1);
                                }
                                catch(Throwable throwable0) {
                                    object11 = ibnx.a(throwable0);
                                }
                                if((object11 instanceof ibnv)) {
                                    object11 = null;
                                }
                                jdt.a(jdt0, jdy1, object11);
                            }
                            else {
                                object11 = jdq1.a;
                                FIN.finallyExec$NT(v25);
                            }
                            if(object11 != null) {
                                ibns0 = new ibns(object8, jeo.a(jff0.d, object11, jdy1, jff0.b, jff0.c));
                                break alab1;
                            }
                            break;
                        }
                        case 2: {
                            jdr jdr2 = new jdr(jdy1);
                            jiz jiz2 = jdt0.b;
                            __monitor_enter(jiz2);
                            int v26 = FIN.finallyOpen$NT();
                            jdq jdq2 = (jdq)jdt0.a.d(jdr2);
                            if(jdq2 == null) {
                                jdq2 = (jdq)jdt0.c.a(jdr2);
                            }
                            FIN.finallyCodeBegin$NT(v26);
                            __monitor_exit(jiz2);
                            FIN.finallyCodeEnd$NT(v26);
                            if(jdq2 == null) {
                                if(object8 == null) {
                                    object8 = ibpo.i(new jdy[]{jdy1});
                                }
                                else {
                                    ((List)object8).add(jdy1);
                                }
                            }
                            else if(jdq2.a != null) {
                                ibns0 = new ibns(object8, jeo.a(jff0.d, jdq2.a, jdy1, jff0.b, jff0.c));
                                break alab1;
                            }
                            break;
                        }
                        default: {
                            Objects.toString(jdy1);
                            throw new IllegalStateException("Unknown font type " + jdy1);
                        }
                    }
                    ++v22;
                    continue;
                }
                ibns0 = new ibns(object8, ibts0.a(jff0));
                break;
            }
            List list1 = (List)ibns0.a;
            Object object12 = ibns0.b;
            if(list1 == null) {
                object1 = new jfj(object12);
            }
            else {
                jdp jdp0 = new jdp(list1, object12, jff0, jek0.a, ((ibts)object0), jdh0);
                icck icck0 = jek0.b;
                jei jei0 = new jei(jdp0, null);
                icbb.b(icck0, null, iccm.d, jei0, 1);
                object1 = new jfi(jdp0);
            }
        }
        else {
            object1 = null;
        }
        if(object1 == null) {
            jdz jdz1 = jff0.a;
            if(jdz1 == null || (jdz1 instanceof jdu)) {
                jfj0 = new jfj(jfb.a(null, jff0.b, jff0.c));
            }
            else if((jdz1 instanceof jew)) {
                jfj0 = new jfj(jfb.b(((jew)jdz1), jff0.b, jff0.c));
            }
            else if((jdz1 instanceof jex)) {
                jfj0 = new jfj(((jex)jdz1).f.a);
            }
            else {
                jfj0 = null;
            }
            if(jfj0 != null) {
                return jfj0;
            }
            throw new IllegalStateException("Could not load font");
        }
        return object1;
    }
}

