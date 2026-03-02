import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public final class jsb {
    public final jrp a;
    public boolean b;
    public boolean c;
    public final jrp d;
    public final ArrayList e;
    final ArrayList f;
    public jss g;
    private final jrx h;

    public jsb(jrp jrp0) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList();
        new ArrayList();
        this.g = null;
        this.h = new jrx();
        this.f = new ArrayList();
        this.a = jrp0;
        this.d = jrp0;
    }

    public final int a(jrp jrp0, int v) {
        long v12;
        ArrayList arrayList1;
        jrp jrp1 = jrp0;
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        int v2 = 0;
        long v3 = 0L;
        while(v2 < v1) {
            jsj jsj0 = (jsj)arrayList0.get(v2);
            jsn jsn0 = jsj0.b;
            if((jsn0 instanceof jrz)) {
                if(((jrz)jsn0).g == v) {
                    goto label_12;
                }
                else {
                    goto label_41;
                }
                goto label_11;
            }
            else {
            label_11:
                if(!(v == 0 ? !(jsn0 instanceof jsi) : !(jsn0 instanceof jsk))) {
                label_12:
                    jsc jsc0 = v == 0 ? jrp1.h.j : jrp1.i.j;
                    boolean z = jsn0.i.k.contains((v == 0 ? jrp1.h.i : jrp1.i.i));
                    boolean z1 = jsj0.b.j.k.contains(jsc0);
                    long v4 = jsj0.b.a();
                    if(z && z1) {
                        long v5 = jsj0.b(jsj0.b.i, 0L);
                        long v6 = jsj0.a(jsj0.b.j, 0L);
                        long v7 = v5 - v4;
                        jsn jsn1 = jsj0.b;
                        arrayList1 = arrayList0;
                        long v8 = (long)jsn1.j.e;
                        if(v7 >= ((long)(-jsn1.j.e))) {
                            v7 += v8;
                        }
                        long v9 = (long)jsn1.i.e;
                        long v10 = -v6 - v4 - v9;
                        float f = v == 0 ? jsn1.d.af : jsn1.d.ag;
                        long v11 = Float.compare(f, 0.0f) <= 0 ? 0L : ((long)(((float)(v10 < v9 ? -v6 - v4 - v9 : v10 - v9)) / f + ((float)v7) / (1.0f - f)));
                        v12 = v9 + (((long)(f * ((float)v11) + 0.5f)) + v4 + ((long)(((float)v11) * (1.0f - f) + 0.5f))) - v8;
                    }
                    else {
                        arrayList1 = arrayList0;
                        if(z) {
                            v12 = Math.max(jsj0.b(jsj0.b.i, ((long)jsj0.b.i.e)), ((long)jsj0.b.i.e) + v4);
                        }
                        else if(z1) {
                            v12 = Math.max(-jsj0.a(jsj0.b.j, ((long)jsj0.b.j.e)), ((long)(-jsj0.b.j.e)) + v4);
                        }
                        else {
                            long v13 = (long)jsj0.b.j.e;
                            v12 = ((long)jsj0.b.i.e) + jsj0.b.a() - v13;
                        }
                    }
                    goto label_43;
                }
            }
        label_41:
            v12 = 0L;
            arrayList1 = arrayList0;
        label_43:
            v3 = Math.max(v3, v12);
            ++v2;
            jrp1 = jrp0;
            arrayList0 = arrayList1;
        }
        return (int)v3;
    }

    public final void b() {
        ArrayList arrayList0 = this.e;
        arrayList0.clear();
        jrp jrp0 = this.d;
        jrp0.h.d();
        jrp0.i.d();
        arrayList0.add(jrp0.h);
        arrayList0.add(jrp0.i);
        ArrayList arrayList1 = jrp0.aJ;
        int v = arrayList1.size();
        Collection collection0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            jro jro0 = (jro)arrayList1.get(v1);
            if((jro0 instanceof jrs)) {
                arrayList0.add(new jsg(jro0));
            }
            else {
                if(jro0.K()) {
                    if(jro0.f == null) {
                        jro0.f = new jrz(jro0, 0);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(jro0.f);
                }
                else {
                    arrayList0.add(jro0.h);
                }
                if(jro0.L()) {
                    if(jro0.g == null) {
                        jro0.g = new jrz(jro0, 1);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(jro0.g);
                }
                else {
                    arrayList0.add(jro0.i);
                }
                if((jro0 instanceof jrt)) {
                    arrayList0.add(new jsh(jro0));
                }
            }
        }
        if(collection0 != null) {
            arrayList0.addAll(collection0);
        }
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((jsn)arrayList0.get(v3)).d();
        }
        int v4 = arrayList0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            jsn jsn0 = (jsn)arrayList0.get(v5);
            if(jsn0.d != jrp0) {
                jsn0.b();
            }
        }
        this.f.clear();
        jsj.a = 0;
        this.e(this.a.h, 0, this.f);
        this.e(this.a.i, 1, this.f);
        this.b = false;
    }

    public final void c() {
        boolean z1;
        boolean z;
        int v6;
        jsb jsb0;
        ArrayList arrayList0 = this.a.aJ;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            jro jro0 = (jro)arrayList0.get(v1);
            if(jro0.e) {
                jsb0 = this;
            }
            else {
                int v2 = jro0.ar[0];
                int v3 = jro0.ar[1];
                int v4 = jro0.t;
                int v5 = jro0.u;
                switch(v2) {
                    case 2: {
                        v6 = 2;
                        z = true;
                        break;
                    }
                    case 3: {
                        z = v4 == 1;
                        v6 = 3;
                        break;
                    }
                    default: {
                        v6 = v2;
                        z = false;
                    }
                }
                switch(v3) {
                    case 2: {
                        z1 = true;
                        break;
                    }
                    case 3: {
                        z1 = v5 == 1;
                        v3 = 3;
                        break;
                    }
                    default: {
                        z1 = false;
                    }
                }
                jsd jsd0 = jro0.h.f;
                boolean z2 = jsd0.i;
                jsd jsd1 = jro0.i.f;
                boolean z3 = jsd1.i;
                if(z2 && z3) {
                    jsb0 = this;
                    jsb0.f(jro0, 1, jsd0.f, 1, jsd1.f);
                    jro0.e = true;
                }
                else {
                    if(z2 && z1) {
                        this.f(jro0, 1, jsd0.f, 2, jsd1.f);
                        if(v3 == 3) {
                            jro0.i.f.m = jro0.h();
                        }
                        else {
                            jro0.i.f.c(jro0.h());
                            jro0.e = true;
                        }
                    }
                    else if(z3 && z) {
                        jsb0 = this;
                        jsb0.f(jro0, 2, jsd0.f, 1, jsd1.f);
                        if(v6 == 3) {
                            jro0.h.f.m = jro0.j();
                        }
                        else {
                            jro0.h.f.c(jro0.j());
                            jro0.e = true;
                        }
                        goto label_55;
                    }
                    jsb0 = this;
                }
            label_55:
                if(jro0.e) {
                    jsd jsd2 = jro0.i.b;
                    if(jsd2 != null) {
                        jsd2.c(jro0.ac);
                    }
                }
            }
            ++v1;
            this = jsb0;
        }
    }

    public final void d(jrp jrp0) {
        int v11;
        float f2;
        int v8;
        ArrayList arrayList0 = jrp0.aJ;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            jro jro0 = (jro)arrayList0.get(v1);
            int v2 = jro0.ar[0];
            int v3 = jro0.ar[1];
            if(jro0.ai == 8) {
                jro0.e = true;
            }
            else {
                float f = jro0.y;
                int v4 = 2;
                if(Float.compare(f, 1.0f) < 0 && v2 == 3) {
                    jro0.t = 2;
                    v2 = 3;
                }
                float f1 = jro0.B;
                if((f1 < 1.0f) && v3 == 3) {
                    jro0.u = 2;
                    v3 = 3;
                }
                if((jro0.Y > 0.0f)) {
                    if(v2 == 3 && (v3 == 1 || v3 == 2)) {
                        jro0.t = 3;
                    }
                    else if(v3 == 3 && (v2 == 1 || v2 == 2)) {
                        jro0.u = 3;
                    }
                    else if(v2 == 3 && v3 == 3) {
                        if(jro0.t == 0) {
                            jro0.t = 3;
                        }
                        if(jro0.u == 0) {
                            jro0.u = 3;
                        }
                    }
                }
                if(v2 == 3 && jro0.t == 1 && (jro0.K.e == null || jro0.M.e == null)) {
                    v2 = 2;
                }
                if(v3 == 3 && jro0.u == 1 && (jro0.L.e == null || jro0.N.e == null)) {
                    v3 = 2;
                }
                jro0.h.k = v2;
                int v5 = jro0.t;
                jro0.h.c = v5;
                jro0.i.k = v3;
                int v6 = jro0.u;
                jro0.i.c = v6;
                switch(v2) {
                    case 2: {
                        v2 = 2;
                        goto label_44;
                    }
                    case 1: 
                    case 4: {
                    label_44:
                        switch(v3) {
                            case 2: {
                                goto label_117;
                            }
                            case 1: 
                            case 4: {
                                goto label_116;
                            }
                        }
                    }
                }
                if(v2 == 3 && (v3 == 1 || v3 == 2)) {
                alab1:
                    switch(v5) {
                        case 1: {
                            this.f(jro0, 2, 0, v3, 0);
                            jro0.h.f.m = jro0.j();
                            goto label_131;
                        }
                        case 2: {
                            switch(jrp0.ar[0]) {
                                case 1: 
                                case 4: {
                                    this.f(jro0, 1, ((int)(f * ((float)jrp0.j()) + 0.5f)), v3, jro0.h());
                                    jro0.h.f.c(jro0.j());
                                    jro0.i.f.c(jro0.h());
                                    jro0.e = true;
                                    goto label_131;
                                }
                                default: {
                                    break alab1;
                                }
                            }
                        }
                        case 3: {
                            if(v3 == 2) {
                                this.f(jro0, 2, 0, 2, 0);
                            }
                            int v7 = jro0.h();
                            this.f(jro0, 1, ((int)(((float)v7) * jro0.Y + 0.5f)), 1, v7);
                            jro0.h.f.c(jro0.j());
                            jro0.i.f.c(jro0.h());
                            jro0.e = true;
                            goto label_131;
                        }
                        default: {
                            if(jro0.S[0].e == null || jro0.S[1].e == null) {
                                this.f(jro0, 2, 0, v3, 0);
                                jro0.h.f.c(jro0.j());
                                jro0.i.f.c(jro0.h());
                                jro0.e = true;
                                goto label_131;
                            }
                        }
                    }
                }
                if(v3 == 3 && (v2 == 1 || v2 == 2)) {
                    switch(v6) {
                        case 1: {
                            this.f(jro0, v2, 0, 2, 0);
                            jro0.i.f.m = jro0.h();
                            goto label_131;
                        }
                        case 3: {
                            if(v2 == 2) {
                                this.f(jro0, 2, 0, 2, 0);
                            }
                            int v9 = jro0.j();
                            this.f(jro0, 1, v9, 1, ((int)(((float)v9) * (jro0.Z == -1 ? 1.0f / jro0.Y : jro0.Y) + 0.5f)));
                            jro0.h.f.c(jro0.j());
                            jro0.i.f.c(jro0.h());
                            jro0.e = true;
                            goto label_131;
                        }
                        default: {
                            v8 = v2;
                            f2 = f;
                            if(v6 == 2) {
                                switch(jrp0.ar[1]) {
                                    case 1: 
                                    case 4: {
                                        this.f(jro0, v8, jro0.j(), 1, ((int)(((float)jrp0.h()) * f1 + 0.5f)));
                                        jro0.h.f.c(jro0.j());
                                        jro0.i.f.c(jro0.h());
                                        jro0.e = true;
                                        goto label_131;
                                    }
                                }
                            }
                            else if(jro0.S[2].e == null || jro0.S[3].e == null) {
                                this.f(jro0, 2, 0, 3, 0);
                                jro0.h.f.c(jro0.j());
                                jro0.i.f.c(jro0.h());
                                jro0.e = true;
                                goto label_131;
                            }
                        }
                    }
                }
                else {
                    v8 = v2;
                    f2 = f;
                }
                if(v8 == 3 && v3 == 3) {
                    if(v5 == 1) {
                        this.f(jro0, 2, 0, 2, 0);
                        jro0.h.f.m = jro0.j();
                        jro0.i.f.m = jro0.h();
                        goto label_131;
                    label_116:
                        v4 = v3;
                    label_117:
                        int v10 = jro0.j();
                        if(v2 == 4) {
                            v10 = jrp0.j() - jro0.K.f - jro0.M.f;
                            v11 = 1;
                        }
                        else {
                            v11 = v2;
                        }
                        int v12 = jro0.h();
                        if(v4 == 4) {
                            v12 = jrp0.h() - jro0.L.f - jro0.N.f;
                            v4 = 1;
                        }
                        this.f(jro0, v11, v10, v4, v12);
                        jro0.h.f.c(jro0.j());
                        jro0.i.f.c(jro0.h());
                        jro0.e = true;
                    }
                    else {
                        switch(v6) {
                            case 1: {
                                this.f(jro0, 2, 0, 2, 0);
                                jro0.h.f.m = jro0.j();
                                jro0.i.f.m = jro0.h();
                                break;
                            }
                            case 2: {
                                if(v5 == 2 && (jrp0.ar[0] == 1 && jrp0.ar[1] == 1)) {
                                    this.f(jro0, 1, ((int)(f2 * ((float)jrp0.j()) + 0.5f)), 1, ((int)(f1 * ((float)jrp0.h()) + 0.5f)));
                                    jro0.h.f.c(jro0.j());
                                    jro0.i.f.c(jro0.h());
                                    jro0.e = true;
                                }
                            }
                        }
                    }
                }
            }
        label_131:
            ++v1;
        }
    }

    private final void e(jsn jsn0, int v, ArrayList arrayList0) {
        jsc jsc0 = jsn0.i;
        for(Object object0: jsc0.j) {
            jsa jsa0 = (jsa)object0;
            if((jsa0 instanceof jsc)) {
                this.g(((jsc)jsa0), v, jsn0.j, arrayList0, null);
            }
            else {
                if(!(jsa0 instanceof jsn)) {
                    continue;
                }
                this.g(((jsn)jsa0).i, v, jsn0.j, arrayList0, null);
            }
        }
        for(Object object1: jsn0.j.j) {
            jsa jsa1 = (jsa)object1;
            if((jsa1 instanceof jsc)) {
                this.g(((jsc)jsa1), v, jsc0, arrayList0, null);
            }
            else {
                if(!(jsa1 instanceof jsn)) {
                    continue;
                }
                this.g(((jsn)jsa1).j, v, jsc0, arrayList0, null);
            }
        }
        if(v == 1) {
            for(Object object2: ((jsk)jsn0).a.j) {
                jsa jsa2 = (jsa)object2;
                if((jsa2 instanceof jsc)) {
                    this.g(((jsc)jsa2), 1, null, arrayList0, null);
                }
            }
        }
    }

    private final void f(jro jro0, int v, int v1, int v2, int v3) {
        this.h.i = v;
        this.h.j = v2;
        this.h.a = v1;
        this.h.b = v3;
        this.g.a(jro0, this.h);
        jro0.F(this.h.c);
        jro0.A(this.h.d);
        jro0.G = this.h.f;
        jro0.x(this.h.e);
    }

    private final void g(jsc jsc0, int v, jsc jsc1, ArrayList arrayList0, jsj jsj0) {
        jsn jsn0 = jsc0.d;
        if(jsn0.e == null && (jsn0 != this.a.h && jsn0 != this.a.i)) {
            if(jsj0 == null) {
                jsj0 = new jsj(jsn0);
                arrayList0.add(jsj0);
            }
            jsn0.e = jsj0;
            jsj0.c.add(jsn0);
            jsc jsc2 = jsn0.i;
            for(Object object0: jsc2.j) {
                jsa jsa0 = (jsa)object0;
                if((jsa0 instanceof jsc)) {
                    this.g(((jsc)jsa0), v, jsc1, arrayList0, jsj0);
                }
            }
            jsc jsc3 = jsn0.j;
            for(Object object1: jsc3.j) {
                jsa jsa1 = (jsa)object1;
                if((jsa1 instanceof jsc)) {
                    this.g(((jsc)jsa1), v, jsc1, arrayList0, jsj0);
                }
            }
            if(v == 1 && (jsn0 instanceof jsk)) {
                for(Object object2: ((jsk)jsn0).a.j) {
                    jsa jsa2 = (jsa)object2;
                    if((jsa2 instanceof jsc)) {
                        this.g(((jsc)jsa2), 1, jsc1, arrayList0, jsj0);
                    }
                }
            }
            for(Object object3: jsc2.k) {
                this.g(((jsc)object3), v, jsc1, arrayList0, jsj0);
            }
            for(Object object4: jsc3.k) {
                this.g(((jsc)object4), v, jsc1, arrayList0, jsj0);
            }
            if(v == 1 && (jsn0 instanceof jsk)) {
                for(Object object5: ((jsk)jsn0).a.k) {
                    this.g(((jsc)object5), 1, jsc1, arrayList0, jsj0);
                }
            }
        }
    }
}

