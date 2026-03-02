import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class jrp extends jrw {
    public final jry a;
    public boolean aA;
    public boolean aB;
    public WeakReference aC;
    public WeakReference aD;
    public WeakReference aE;
    public WeakReference aF;
    final HashSet aG;
    public final jrx aH;
    public jss aI;
    public final jrd as;
    public int at;
    public int au;
    public int av;
    public int aw;
    jrm[] ax;
    jrm[] ay;
    public int az;
    public final jsb b;
    public int c;
    public boolean d;

    public jrp() {
        this.a = new jry(this);
        this.b = new jsb(this);
        this.aI = null;
        this.d = false;
        this.as = new jrd();
        this.av = 0;
        this.aw = 0;
        this.ax = new jrm[4];
        this.ay = new jrm[4];
        this.az = 0x101;
        this.aA = false;
        this.aB = false;
        this.aC = null;
        this.aD = null;
        this.aE = null;
        this.aF = null;
        this.aG = new HashSet();
        this.aH = new jrx();
    }

    @Override  // jro
    public final void G(boolean z, boolean z1) {
        super.G(z, z1);
        int v = this.aJ.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((jro)this.aJ.get(v1)).G(z, z1);
        }
    }

    @Override  // jrw
    public final void W() {
        int v88;
        int v86;
        int v76;
        int v74;
        int v71;
        HashSet hashSet8;
        int v70;
        jrv jrv0;
        Iterator iterator7;
        int v68;
        HashSet hashSet7;
        jrk jrk1;
        jro jro14;
        int v66;
        jrk jrk0;
        int v65;
        int v64;
        int v63;
        int v62;
        int v61;
        int v60;
        int v59;
        boolean z5;
        int v57;
        int v51;
        int v50;
        int v49;
        jsm jsm6;
        jsm jsm4;
        int v26;
        int v25;
        int v24;
        int v23;
        int v22;
        int v21;
        boolean z4;
        boolean z3;
        this.aa = 0;
        this.ab = 0;
        this.aA = false;
        this.aB = false;
        int v = this.aJ.size();
        int v1 = Math.max(0, this.j());
        int v2 = Math.max(0, this.h());
        int[] arr_v = this.ar;
        int v3 = arr_v[1];
        int v4 = arr_v[0];
        if(this.c == 0 && jru.b(this.az, 1)) {
            jss jss0 = this.aI;
            int v5 = this.P();
            int v6 = this.Q();
            jse.b = 0;
            jse.c = 0;
            this.v();
            ArrayList arrayList0 = this.aJ;
            int v7 = arrayList0.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                ((jro)arrayList0.get(v8)).v();
            }
            boolean z = this.d;
            if(v5 == 1) {
                this.y(0, this.j());
            }
            else {
                this.K.f(0);
                this.aa = 0;
            }
            boolean z1 = false;
            boolean z2 = false;
            for(int v9 = 0; v9 < v7; ++v9) {
                jro jro0 = (jro)arrayList0.get(v9);
                if(!(jro0 instanceof jrs)) {
                    if((jro0 instanceof jrk) && ((jrk)jro0).a() == 0) {
                        z2 = true;
                    }
                }
                else if(((jrs)jro0).as == 1) {
                    int v10 = ((jrs)jro0).b;
                    if(v10 != -1) {
                        ((jrs)jro0).a(v10);
                    }
                    else if(((jrs)jro0).c != -1 && this.e()) {
                        ((jrs)jro0).a(this.j() - ((jrs)jro0).c);
                    }
                    else if(this.e()) {
                        ((jrs)jro0).a(((int)(((jrs)jro0).a * ((float)this.j()) + 0.5f)));
                    }
                    z1 = true;
                }
            }
            if(z1) {
                for(int v11 = 0; v11 < v7; ++v11) {
                    jro jro1 = (jro)arrayList0.get(v11);
                    if((jro1 instanceof jrs) && ((jrs)jro1).as == 1) {
                        jse.a(0, ((jrs)jro1), jss0, z);
                    }
                }
            }
            jse.a(0, this, jss0, z);
            if(z2) {
                for(int v13 = 0; v13 < v7; ++v13) {
                    jro jro2 = (jro)arrayList0.get(v13);
                    if((jro2 instanceof jrk) && ((jrk)jro2).a() == 0) {
                        jse.d(((jrk)jro2), jss0, 0, z);
                    }
                }
            }
            if(v6 == 1) {
                this.z(0, this.h());
            }
            else {
                this.L.f(0);
                this.ab = 0;
            }
            z3 = false;
            z4 = false;
            for(int v12 = 0; v12 < v7; ++v12) {
                jro jro3 = (jro)arrayList0.get(v12);
                if(!(jro3 instanceof jrs)) {
                    if((jro3 instanceof jrk) && ((jrk)jro3).a() == 1) {
                        z4 = true;
                    }
                }
                else if(((jrs)jro3).as == 0) {
                    int v14 = ((jrs)jro3).b;
                    if(v14 != -1) {
                        ((jrs)jro3).a(v14);
                    }
                    else if(((jrs)jro3).c != -1 && this.f()) {
                        ((jrs)jro3).a(this.h() - ((jrs)jro3).c);
                    }
                    else if(this.f()) {
                        ((jrs)jro3).a(((int)(((jrs)jro3).a * ((float)this.h()) + 0.5f)));
                    }
                    z3 = true;
                }
            }
            if(z3) {
                for(int v15 = 0; v15 < v7; ++v15) {
                    jro jro4 = (jro)arrayList0.get(v15);
                    if((jro4 instanceof jrs) && ((jrs)jro4).as == 0) {
                        jse.b(1, ((jrs)jro4), jss0);
                    }
                }
            }
            jse.b(0, this, jss0);
            if(z4) {
                for(int v16 = 0; v16 < v7; ++v16) {
                    jro jro5 = (jro)arrayList0.get(v16);
                    if((jro5 instanceof jrk) && ((jrk)jro5).a() == 1) {
                        jse.d(((jrk)jro5), jss0, 1, z);
                    }
                }
            }
            for(int v17 = 0; v17 < v7; ++v17) {
                jro jro6 = (jro)arrayList0.get(v17);
                if(jro6.M() && jse.c(jro6)) {
                    jrp.aa(jro6, jss0, jse.a);
                    if(!(jro6 instanceof jrs)) {
                        jse.a(0, jro6, jss0, z);
                        jse.b(0, jro6, jss0);
                    }
                    else if(((jrs)jro6).as == 0) {
                        jse.b(0, jro6, jss0);
                    }
                    else {
                        jse.a(0, jro6, jss0, z);
                    }
                }
            }
            for(int v18 = 0; v18 < v; ++v18) {
                jro jro7 = (jro)this.aJ.get(v18);
                if(jro7.M() && !(jro7 instanceof jrs) && !(jro7 instanceof jrk) && !(jro7 instanceof jrv) && !jro7.H && (jro7.O(0) != 3 || jro7.t == 1 || jro7.O(1) != 3 || jro7.u == 1)) {
                    jrx jrx0 = new jrx();
                    jrp.aa(jro7, this.aI, jrx0);
                }
            }
        }
        if(v <= 2) {
        label_401:
            v24 = v;
            v21 = v1;
            v22 = v4;
            v23 = v3;
            v26 = v2;
        label_406:
            v25 = 0;
        }
        else if(v4 == 2) {
        label_142:
            if(jru.b(this.az, 0x400)) {
                jss jss1 = this.aI;
                ArrayList arrayList1 = this.aJ;
                int v19 = arrayList1.size();
                int v20 = 0;
                while(v20 < v19) {
                    jro jro8 = (jro)arrayList1.get(v20);
                    if(jsf.c(this.P(), this.Q(), jro8.P(), jro8.Q()) && !(jro8 instanceof jrr)) {
                        ++v20;
                        continue;
                    }
                label_152:
                    v21 = v1;
                    v22 = v4;
                    v23 = v3;
                    v24 = v;
                    v25 = 0;
                    v26 = v2;
                    goto label_407;
                }
                List list0 = null;
                int v27 = 0;
                List list1 = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                List list2 = null;
                ArrayList arrayList4 = null;
                while(v27 < v19) {
                    jro jro9 = (jro)arrayList1.get(v27);
                    if(!jsf.c(this.P(), this.Q(), jro9.P(), jro9.Q())) {
                        jrp.aa(jro9, jss1, this.aH);
                    }
                    if((jro9 instanceof jrs)) {
                        if(((jrs)jro9).as == 0) {
                            if(arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(((jrs)jro9));
                        }
                        if(((jrs)jro9).as == 1) {
                            if(list0 == null) {
                                list0 = new ArrayList();
                            }
                            ((ArrayList)list0).add(((jrs)jro9));
                        }
                    }
                    if((jro9 instanceof jrt)) {
                        if((jro9 instanceof jrk)) {
                            if(((jrk)jro9).a() == 0) {
                                if(list1 == null) {
                                    list1 = new ArrayList();
                                }
                                ((ArrayList)list1).add(((jrk)jro9));
                            }
                            if(((jrk)jro9).a() == 1) {
                                if(arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(((jrk)jro9));
                            }
                        }
                        else {
                            if(list1 == null) {
                                list1 = new ArrayList();
                            }
                            ((ArrayList)list1).add(((jrt)jro9));
                            if(arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(((jrt)jro9));
                        }
                    }
                    if(jro9.K.e == null && jro9.M.e == null && !(jro9 instanceof jrs) && !(jro9 instanceof jrk)) {
                        if(list2 == null) {
                            list2 = new ArrayList();
                        }
                        ((ArrayList)list2).add(jro9);
                    }
                    if(jro9.L.e == null && jro9.N.e == null && jro9.O.e == null && !(jro9 instanceof jrs) && !(jro9 instanceof jrk)) {
                        if(arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(jro9);
                    }
                    ++v27;
                    v = v;
                    v2 = v2;
                    v3 = v3;
                    v1 = v1;
                }
                v24 = v;
                ArrayList arrayList5 = new ArrayList();
                if(list0 != null) {
                    int v28 = list0.size();
                    for(int v29 = 0; v29 < v28; ++v29) {
                        jsf.a(((jrs)list0.get(v29)), 0, arrayList5, null);
                    }
                }
                if(list1 != null) {
                    int v30 = list1.size();
                    for(int v31 = 0; v31 < v30; ++v31) {
                        jrt jrt0 = (jrt)list1.get(v31);
                        jsm jsm0 = jsf.a(jrt0, 0, arrayList5, null);
                        jrt0.X(arrayList5, 0, jsm0);
                        jsm0.b(arrayList5);
                    }
                }
                HashSet hashSet0 = this.N(2).a;
                if(hashSet0 != null) {
                    for(Object object0: hashSet0) {
                        jsf.a(((jrn)object0).d, 0, arrayList5, null);
                    }
                }
                HashSet hashSet1 = this.N(4).a;
                if(hashSet1 != null) {
                    for(Object object1: hashSet1) {
                        jsf.a(((jrn)object1).d, 0, arrayList5, null);
                    }
                }
                HashSet hashSet2 = this.N(7).a;
                if(hashSet2 != null) {
                    for(Object object2: hashSet2) {
                        jsf.a(((jrn)object2).d, 0, arrayList5, null);
                    }
                }
                if(list2 != null) {
                    int v32 = list2.size();
                    for(int v33 = 0; v33 < v32; ++v33) {
                        jsf.a(((jro)list2.get(v33)), 0, arrayList5, null);
                    }
                }
                if(arrayList2 != null) {
                    int v34 = arrayList2.size();
                    for(int v35 = 0; v35 < v34; ++v35) {
                        jsf.a(((jrs)arrayList2.get(v35)), 1, arrayList5, null);
                    }
                }
                if(arrayList3 != null) {
                    int v36 = arrayList3.size();
                    for(int v37 = 0; v37 < v36; ++v37) {
                        jrt jrt1 = (jrt)arrayList3.get(v37);
                        jsm jsm1 = jsf.a(jrt1, 1, arrayList5, null);
                        jrt1.X(arrayList5, 1, jsm1);
                        jsm1.b(arrayList5);
                    }
                }
                HashSet hashSet3 = this.N(3).a;
                if(hashSet3 != null) {
                    for(Object object3: hashSet3) {
                        jsf.a(((jrn)object3).d, 1, arrayList5, null);
                    }
                }
                HashSet hashSet4 = this.N(6).a;
                if(hashSet4 != null) {
                    for(Object object4: hashSet4) {
                        jsf.a(((jrn)object4).d, 1, arrayList5, null);
                    }
                }
                HashSet hashSet5 = this.N(5).a;
                if(hashSet5 != null) {
                    for(Object object5: hashSet5) {
                        jsf.a(((jrn)object5).d, 1, arrayList5, null);
                    }
                }
                HashSet hashSet6 = this.N(7).a;
                if(hashSet6 != null) {
                    for(Object object6: hashSet6) {
                        jsf.a(((jrn)object6).d, 1, arrayList5, null);
                    }
                }
                if(arrayList4 != null) {
                    int v38 = arrayList4.size();
                    for(int v39 = 0; v39 < v38; ++v39) {
                        jsf.a(((jro)arrayList4.get(v39)), 1, arrayList5, null);
                    }
                }
                for(int v40 = 0; v40 < v19; ++v40) {
                    jro jro10 = (jro)arrayList1.get(v40);
                    if(jro10.ar[0] == 3 && jro10.ar[1] == 3) {
                        jsm jsm2 = jsf.b(arrayList5, jro10.ap);
                        jsm jsm3 = jsf.b(arrayList5, jro10.aq);
                        if(jsm2 != null && jsm3 != null) {
                            jsm2.c(0, jsm3);
                            jsm3.d = 2;
                            arrayList5.remove(jsm2);
                        }
                    }
                }
                if(arrayList5.size() > 1) {
                    if(this.P() == 2) {
                        int v41 = arrayList5.size();
                        jsm4 = null;
                        int v43 = 0;
                        for(int v42 = 0; v42 < v41; ++v42) {
                            jsm jsm5 = (jsm)arrayList5.get(v42);
                            if(jsm5.d != 1) {
                                int v44 = jsm5.a(this.as, 0);
                                if(v44 > v43) {
                                    jsm4 = jsm5;
                                }
                                if(v44 > v43) {
                                    v43 = v44;
                                }
                            }
                        }
                        if(jsm4 == null) {
                            jsm4 = null;
                        }
                        else {
                            this.T(1);
                            this.F(v43);
                        }
                    }
                    else {
                        jsm4 = null;
                    }
                    if(this.Q() == 2) {
                        int v45 = arrayList5.size();
                        jsm6 = null;
                        int v47 = 0;
                        for(int v46 = 0; v46 < v45; ++v46) {
                            jsm jsm7 = (jsm)arrayList5.get(v46);
                            if(jsm7.d != 0) {
                                int v48 = jsm7.a(this.as, 1);
                                if(v48 > v47) {
                                    jsm6 = jsm7;
                                }
                                if(v48 > v47) {
                                    v47 = v48;
                                }
                            }
                        }
                        if(jsm6 == null) {
                            jsm6 = null;
                        }
                        else {
                            this.U(1);
                            this.A(v47);
                        }
                    }
                    else {
                        jsm6 = null;
                    }
                    if(jsm4 != null || jsm6 != null) {
                        if(v4 == 2) {
                            if(v1 < this.j() && v1 > 0) {
                                this.F(v1);
                                this.aA = true;
                                v49 = v1;
                            }
                            else {
                                v49 = this.j();
                            }
                            v50 = v3;
                            v4 = 2;
                        }
                        else {
                            v49 = v1;
                            v50 = v3;
                        }
                        if(v50 == 2) {
                            if(v2 < this.h() && v2 > 0) {
                                this.A(v2);
                                this.aB = true;
                                v51 = v2;
                            }
                            else {
                                v51 = this.h();
                            }
                            v50 = 2;
                        }
                        else {
                            v51 = v2;
                        }
                        v21 = v49;
                        v26 = v51;
                        v22 = v4;
                        v23 = v50;
                        v25 = 1;
                        goto label_407;
                    }
                    goto label_396;
                }
                else {
                label_396:
                    v22 = v4;
                    v26 = v2;
                    v23 = v3;
                    v21 = v1;
                    goto label_406;
                }
            }
            else {
                goto label_401;
            }
        }
        else if(v3 == 2) {
            v3 = 2;
            goto label_142;
        }
        else {
            goto label_152;
        }
    label_407:
        jrd jrd0 = this.as;
        jrd0.f = false;
        jrd0.g = false;
        if(this.az != 0 && (this.Z(0x40) || this.Z(0x80))) {
            jrd0.g = true;
        }
        ArrayList arrayList6 = this.aJ;
        int v52 = this.P() == 2 || this.Q() == 2 ? 1 : 0;
        this.ae();
        for(int v53 = 0; v53 < v24; ++v53) {
            jro jro11 = (jro)this.aJ.get(v53);
            if((jro11 instanceof jrw)) {
                ((jrw)jro11).W();
            }
        }
        int v54 = v25;
        int v55 = 0;
        int v56 = 1;
        while(v56 != 0) {
            try {
                v57 = v55 + 1;
                jrd0.k();
                this.ae();
                this.r(jrd0);
                for(int v58 = 0; v58 < v24; ++v58) {
                    ((jro)this.aJ.get(v58)).r(jrd0);
                }
                z5 = this.Z(0x40);
                this.b(jrd0, z5);
                v59 = this.aJ.size();
                v60 = 0;
                v61 = 0;
            }
            catch(Exception exception0) {
                v62 = v57;
                v63 = v52;
                goto label_601;
            }
            try {
                while(v60 < v59) {
                    v64 = v57;
                    jro jro12 = (jro)this.aJ.get(v60);
                    v64 = v57;
                    jro12.B(0, false);
                    jro12.B(1, false);
                    v61 |= jro12 instanceof jrk;
                    ++v60;
                    v57 = v64;
                }
                v64 = v57;
                if(v61 != 0) {
                    v65 = 0;
                    while(true) {
                        if(v65 >= v59) {
                            break;
                        }
                        jro jro13 = (jro)this.aJ.get(v65);
                        if(!(jro13 instanceof jrk)) {
                            ++v65;
                            continue;
                        }
                        jrk0 = (jrk)jro13;
                        v66 = 0;
                    label_463:
                        if(v66 >= jrk0.aK) {
                            ++v65;
                            continue;
                        }
                        jro14 = jrk0.aJ[v66];
                        if(!jrk0.b && !jro14.d()) {
                            jrk1 = jrk0;
                        }
                        else {
                            int v67 = jrk0.a;
                            jrk1 = jrk0;
                            if(v67 == 0 || v67 == 1) {
                                jro14.B(0, true);
                                ++v66;
                                v65 = v65;
                                jrk0 = jrk1;
                                goto label_463;
                            }
                            goto label_475;
                        }
                        ++v66;
                        v65 = v65;
                        jrk0 = jrk1;
                        goto label_463;
                    }
                }
                goto label_486;
            }
            catch(Exception exception0) {
                v63 = v52;
                v62 = v64;
                goto label_601;
            }
        label_475:
            if(v67 == 2 || v67 == 3) {
                try {
                    jro14.B(1, true);
                }
                catch(Exception exception0) {
                    v63 = v52;
                    v62 = v64;
                    goto label_601;
                }
            }
            try {
                ++v66;
                v65 = v65;
                jrk0 = jrk1;
                goto label_463;
            label_486:
                hashSet7 = this.aG;
                hashSet7.clear();
                v68 = 0;
            alab1:
                while(true) {
                label_489:
                    if(v68 >= v59) {
                        while(true) {
                        label_490:
                            if(hashSet7.size() <= 0) {
                                goto label_519;
                            }
                            int v69 = hashSet7.size();
                            iterator7 = hashSet7.iterator();
                            while(true) {
                            label_493:
                                if(iterator7.hasNext()) {
                                    Object object7 = iterator7.next();
                                    jrv0 = (jrv)(((jro)object7));
                                    v63 = v52;
                                    v70 = 0;
                                    break alab1;
                                }
                                goto label_508;
                            }
                        }
                    }
                    goto label_592;
                }
            }
            catch(Exception exception0) {
                v63 = v52;
                v62 = v64;
                goto label_601;
            }
            try {
                while(v70 < jrv0.aK) {
                    if(hashSet7.contains(jrv0.aJ[v70])) {
                        jrv0.b(jrd0, z5);
                        hashSet7.remove(jrv0);
                        goto label_510;
                    }
                    ++v70;
                }
                iterator7 = iterator7;
                v52 = v63;
                goto label_493;
            label_508:
                v63 = v52;
            label_510:
                if(v69 == hashSet7.size()) {
                    for(Object object8: hashSet7) {
                        ((jro)object8).b(jrd0, z5);
                    }
                    hashSet7.clear();
                }
                v52 = v63;
                goto label_490;
            label_519:
                v63 = v52;
                if(jrd.a) {
                    goto label_521;
                }
                else {
                    goto label_546;
                }
                goto label_574;
            }
            catch(Exception exception0) {
                v62 = v64;
                goto label_601;
            }
            try {
            label_521:
                hashSet8 = new HashSet();
                v71 = 0;
            }
            catch(Exception exception0) {
                try {
                    v62 = v64;
                }
                catch(Exception exception0) {
                }
                goto label_601;
            }
            while(v71 < v59) {
                try {
                    hashSet8.add(((jro)this.aJ.get(v71)));
                    ++v71;
                    continue;
                }
                catch(Exception exception0) {
                    try {
                    }
                    catch(Exception exception0) {
                        goto label_601;
                    }
                    while(true) {
                        try {
                            v62 = v64;
                            goto label_601;
                        }
                        catch(Exception exception0) {
                        }
                        break;
                    }
                }
                v63 = v52;
                v62 = v64;
                goto label_601;
            }
            try {
                v62 = v64;
                this.p(this, jrd0, hashSet8, (this.P() == 2 ? 0 : 1), false);
                for(Object object9: hashSet8) {
                    jru.a(this, jrd0, ((jro)object9));
                    ((jro)object9).b(jrd0, z5);
                }
                goto label_574;
            label_546:
                v62 = v64;
                int v72 = 0;
                while(v72 < v59) {
                    jro jro15 = (jro)this.aJ.get(v72);
                    if((jro15 instanceof jrp)) {
                        int v73 = jro15.ar[0];
                        v74 = v72;
                        int v75 = jro15.ar[1];
                        v76 = v59;
                        if(v73 == 2) {
                            jro15.T(1);
                            v73 = 2;
                        }
                        if(v75 == 2) {
                            jro15.U(1);
                            v75 = 2;
                        }
                        jro15.b(jrd0, z5);
                        if(v73 == 2) {
                            jro15.T(2);
                        }
                        if(v75 == 2) {
                            jro15.U(2);
                        }
                    }
                    else {
                        v74 = v72;
                        v76 = v59;
                        jru.a(this, jrd0, jro15);
                        jro15.b(jrd0, z5);
                    }
                    v72 = v74 + 1;
                    v59 = v76;
                }
            label_574:
                if(this.av > 0) {
                    jrl.a(this, jrd0, null, 0);
                }
                if(this.aw > 0) {
                    jrl.a(this, jrd0, null, 1);
                }
                if(this.aC != null && this.aC.get() != null) {
                    this.ad(((jrn)this.aC.get()), jrd0.b(this.L));
                    this.aC = null;
                }
                if(this.aE != null && this.aE.get() != null) {
                    this.ac(((jrn)this.aE.get()), jrd0.b(this.N));
                    this.aE = null;
                }
                if(this.aD != null && this.aD.get() != null) {
                    this.ad(((jrn)this.aD.get()), jrd0.b(this.K));
                    this.aD = null;
                }
                if(this.aF != null && this.aF.get() != null) {
                    this.ac(((jrn)this.aF.get()), jrd0.b(this.M));
                    this.aF = null;
                }
                jrd0.j();
                goto label_603;
            label_592:
                v63 = v52;
                v62 = v64;
                jro jro16 = (jro)this.aJ.get(v68);
                ++v68;
                v64 = v62;
                v59 = v59;
                v52 = v63;
                goto label_489;
            }
            catch(Exception exception0) {
            }
        label_601:
            exception0.printStackTrace();
            System.out.println("EXCEPTION : " + exception0.toString());
        label_603:
            boolean[] arr_z = jru.a;
            arr_z[2] = false;
            boolean z6 = this.Z(0x40);
            this.V(z6);
            int v77 = this.aJ.size();
            int v78 = 0;
            int v79 = 0;
            while(v78 < v77) {
                jro jro17 = (jro)this.aJ.get(v78);
                jro17.V(z6);
                v79 |= (jro17.l != -1 || jro17.m != -1 ? 1 : 0);
                ++v78;
                jrd0 = jrd0;
            }
            if(v63 != 0 && v62 < 8 && arr_z[2]) {
                int v81 = 0;
                int v82 = 0;
                for(int v80 = 0; v80 < v24; ++v80) {
                    jro jro18 = (jro)this.aJ.get(v80);
                    v81 = Math.max(v81, jro18.aa + jro18.j());
                    v82 = Math.max(v82, jro18.ab + jro18.h());
                }
                int v83 = Math.max(this.ad, v81);
                int v84 = Math.max(this.ae, v82);
                if(v22 == 2 && this.j() < v83) {
                    this.F(v83);
                    this.ar[0] = 2;
                    v54 = 1;
                    v79 = 1;
                }
                if(v23 == 2 && this.h() < v84) {
                    this.A(v84);
                    this.ar[1] = 2;
                    v54 = 1;
                    v79 = 1;
                }
            }
            int v85 = Math.max(this.ad, this.j());
            if(v85 > this.j()) {
                this.F(v85);
                this.ar[0] = 1;
                v54 = 1;
                v86 = 1;
            }
            else {
                v86 = v79;
            }
            int v87 = Math.max(this.ae, this.h());
            if(v87 > this.h()) {
                this.A(v87);
                this.ar[1] = 1;
                v88 = 1;
                v54 = 1;
            }
            else {
                v88 = v86;
            }
            if(v54 == 0) {
                int[] arr_v1 = this.ar;
                if(arr_v1[0] == 2 && v21 > 0 && this.j() > v21) {
                    this.aA = true;
                    arr_v1[0] = 1;
                    this.F(v21);
                    v88 = 1;
                    v54 = 1;
                }
                if(arr_v1[1] == 2 && v26 > 0 && this.h() > v26) {
                    this.aB = true;
                    arr_v1[1] = 1;
                    this.A(v26);
                    v88 = 1;
                    v54 = 1;
                }
            }
            v56 = v88 & (v62 <= 8 ? 1 : 0);
            v55 = v62;
            jrd0 = jrd0;
            v52 = v63;
        }
        this.aJ = arrayList6;
        if(v54 != 0) {
            int[] arr_v2 = this.ar;
            arr_v2[0] = v22;
            arr_v2[1] = v23;
        }
        this.w(this.as.j);
    }

    public final void X(int v) {
        this.az = v;
        jrd.a = this.Z(0x200);
    }

    public final boolean Y(boolean z, int v) {
        boolean z3;
        jsb jsb0 = this.b;
        jrp jrp0 = jsb0.a;
        boolean z1 = false;
        int v1 = jrp0.O(0);
        int v2 = jrp0.O(1);
        int v3 = jrp0.k();
        int v4 = jrp0.l();
        if(z) {
            if(v1 == 2) {
            label_11:
                ArrayList arrayList0 = jsb0.e;
                int v5 = arrayList0.size();
                for(int v6 = 0; true; ++v6) {
                    boolean z2 = true;
                    if(v6 >= v5) {
                        break;
                    }
                    jsn jsn0 = (jsn)arrayList0.get(v6);
                    if(jsn0.g == v && !jsn0.e()) {
                        z2 = false;
                        break;
                    }
                }
                if(v != 0) {
                    if(z2 && v2 == 2) {
                        jrp0.U(1);
                        jrp0.A(jsb0.a(jrp0, 1));
                        jrp0.i.f.c(jrp0.h());
                    }
                }
                else if(z2 && v1 == 2) {
                    jrp0.T(1);
                    jrp0.F(jsb0.a(jrp0, 0));
                    jrp0.h.f.c(jrp0.j());
                }
            }
            else if(v2 == 2) {
                v2 = 2;
                goto label_11;
            }
        }
        if(v == 0) {
            switch(jrp0.ar[0]) {
                case 1: 
                case 4: {
                    int v7 = jrp0.j() + v3;
                    jrp0.h.j.c(v7);
                    jrp0.h.f.c(v7 - v3);
                    z3 = true;
                    break;
                }
                default: {
                    z3 = false;
                }
            }
        }
        else {
            switch(jrp0.ar[1]) {
                case 1: 
                case 4: {
                    int v8 = jrp0.h() + v4;
                    jrp0.i.j.c(v8);
                    jrp0.i.f.c(v8 - v4);
                    z3 = true;
                    break;
                }
                default: {
                    z3 = false;
                }
            }
        }
        jsb0.c();
        ArrayList arrayList1 = jsb0.e;
        int v9 = arrayList1.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            jsn jsn1 = (jsn)arrayList1.get(v10);
            if(jsn1.g == v && (jsn1.d != jrp0 || jsn1.h)) {
                jsn1.c();
            }
        }
        int v11 = arrayList1.size();
        for(int v12 = 0; true; ++v12) {
            if(v12 >= v11) {
                z1 = true;
                break;
            }
            jsn jsn2 = (jsn)arrayList1.get(v12);
            if(jsn2.g == v && (z3 || jsn2.d != jrp0) && (!jsn2.i.i || !jsn2.j.i || !(jsn2 instanceof jrz) && !jsn2.f.i)) {
                break;
            }
        }
        jrp0.T(v1);
        jrp0.U(v2);
        return z1;
    }

    public final boolean Z(int v) {
        return (this.az & v) == v;
    }

    final void a(jro jro0, int v) {
        if(v == 0) {
            jrm[] arr_jrm = this.ay;
            if(this.av + 1 >= arr_jrm.length) {
                this.ay = (jrm[])Arrays.copyOf(arr_jrm, arr_jrm.length + arr_jrm.length);
            }
            jrm[] arr_jrm1 = this.ay;
            int v1 = this.av;
            arr_jrm1[v1] = new jrm(jro0, 0, this.d);
            this.av = v1 + 1;
            return;
        }
        jrm[] arr_jrm2 = this.ax;
        if(this.aw + 1 >= arr_jrm2.length) {
            this.ax = (jrm[])Arrays.copyOf(arr_jrm2, arr_jrm2.length + arr_jrm2.length);
        }
        jrm[] arr_jrm3 = this.ax;
        int v2 = this.aw;
        arr_jrm3[v2] = new jrm(jro0, 1, this.d);
        this.aw = v2 + 1;
    }

    public static void aa(jro jro0, jss jss0, jrx jrx0) {
        int v1;
        int v;
        if(jss0 == null) {
            return;
        }
        if(jro0.ai != 8 && !(jro0 instanceof jrs) && !(jro0 instanceof jrk)) {
            jrx0.i = jro0.P();
            jrx0.j = jro0.Q();
            jrx0.a = jro0.j();
            jrx0.b = jro0.h();
            jrx0.g = false;
            jrx0.h = 0;
            boolean z = jrx0.i == 3;
            boolean z1 = jrx0.j == 3;
            boolean z2 = z && jro0.Y > 0.0f;
            boolean z3 = z1 && jro0.Y > 0.0f;
            if(z && jro0.I(0) && jro0.t == 0 && !z2) {
                jrx0.i = 2;
                if(z1 && jro0.u == 0) {
                    jrx0.i = 1;
                }
                z = false;
            }
            if(z1 && jro0.I(1) && jro0.u == 0 && !z3) {
                jrx0.j = 2;
                if(z && jro0.t == 0) {
                    jrx0.j = 1;
                }
                z1 = false;
            }
            if(jro0.e()) {
                jrx0.i = 1;
                z = false;
            }
            if(jro0.f()) {
                jrx0.j = 1;
                z1 = false;
            }
            if(z2) {
                if(jro0.v[0] == 4) {
                    jrx0.i = 1;
                }
                else if(!z1) {
                    if(jrx0.j == 1) {
                        v = jrx0.b;
                    }
                    else {
                        jrx0.i = 2;
                        jss0.a(jro0, jrx0);
                        v = jrx0.d;
                    }
                    jrx0.i = 1;
                    jrx0.a = (int)(jro0.Y * ((float)v));
                }
            }
            if(z3) {
                if(jro0.v[1] == 4) {
                    jrx0.j = 1;
                }
                else if(!z) {
                    if(jrx0.i == 1) {
                        v1 = jrx0.a;
                    }
                    else {
                        jrx0.j = 2;
                        jss0.a(jro0, jrx0);
                        v1 = jrx0.c;
                    }
                    jrx0.j = 1;
                    jrx0.b = jro0.Z == -1 ? ((int)(((float)v1) / jro0.Y)) : ((int)(jro0.Y * ((float)v1)));
                }
            }
            jss0.a(jro0, jrx0);
            jro0.F(jrx0.c);
            jro0.A(jrx0.d);
            jro0.G = jrx0.f;
            jro0.x(jrx0.e);
            jrx0.h = 0;
            return;
        }
        jrx0.c = 0;
        jrx0.d = 0;
    }

    private final void ac(jrn jrn0, jri jri0) {
        jri jri1 = this.as.b(jrn0);
        this.as.g(jri0, jri1, 0, 5);
    }

    private final void ad(jrn jrn0, jri jri0) {
        jri jri1 = this.as.b(jrn0);
        this.as.g(jri1, jri0, 0, 5);
    }

    private final void ae() {
        this.av = 0;
        this.aw = 0;
    }

    public final void c() {
        this.b.b = true;
    }

    @Override  // jrw
    public final void t() {
        this.as.k();
        this.at = 0;
        this.au = 0;
        super.t();
    }
}

