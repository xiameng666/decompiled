import java.util.HashSet;

public final class jse {
    public static final jrx a;
    public static int b;
    public static int c;

    static {
        jse.a = new jrx();
        jse.b = 0;
        jse.c = 0;
    }

    public static void a(int v, jro jro0, jss jss0, boolean z) {
        boolean z4;
        boolean z2;
        if(!jro0.o) {
            ++jse.b;
            if(!(jro0 instanceof jrp) && jro0.M() && jse.c(jro0)) {
                jrp.aa(jro0, jss0, new jrx());
            }
            jrn jrn0 = jro0.N(2);
            jrn jrn1 = jro0.N(4);
            int v1 = jrn0.a();
            int v2 = jrn1.a();
            HashSet hashSet0 = jrn0.a;
            if(hashSet0 != null && jrn0.c) {
                for(Object object0: hashSet0) {
                    jrn jrn2 = (jrn)object0;
                    jro jro1 = jrn2.d;
                    boolean z1 = jse.c(jro1);
                    if(jro1.M() && z1) {
                        jrp.aa(jro1, jss0, new jrx());
                    }
                    jrn jrn3 = jro1.K;
                    if(jrn2 == jrn3) {
                        jrn jrn4 = jro1.M.e;
                        if(jrn4 == null || !jrn4.c) {
                            goto label_22;
                        }
                    }
                    else {
                    label_22:
                        if(jrn2 != jro1.M || (jrn3.e == null || !jrn3.e.c)) {
                            z2 = false;
                            goto label_26;
                        }
                    }
                    z2 = true;
                label_26:
                    if(jro1.P() != 3 || z1) {
                        if(jro1.M()) {
                            continue;
                        }
                        if(jrn2 == jrn3 && jro1.M.e == null) {
                            int v3 = jrn3.b() + v1;
                            jro1.y(v3, jro1.j() + v3);
                            jse.a(v + 1, jro1, jss0, z);
                        }
                        else {
                            jrn jrn5 = jro1.M;
                            if(jrn2 == jrn5 && jrn3.e == null) {
                                int v4 = v1 - jrn5.b();
                                jro1.y(v4 - jro1.j(), v4);
                                jse.a(v + 1, jro1, jss0, z);
                            }
                            else {
                                if(!z2 || jro1.K()) {
                                    continue;
                                }
                                jse.e(v + 1, jss0, jro1, z);
                            }
                        }
                    }
                    else if(jro1.P() == 3 && jro1.x >= 0 && jro1.w >= 0 && (jro1.ai == 8 || jro1.t == 0 && jro1.Y == 0.0f) && !jro1.K() && !jro1.H && z2 && !jro1.K()) {
                        jse.f(v + 1, jro0, jss0, jro1, z);
                    }
                }
            }
            if(!(jro0 instanceof jrs)) {
                HashSet hashSet1 = jrn1.a;
                if(hashSet1 != null && jrn1.c) {
                    for(Object object1: hashSet1) {
                        jrn jrn6 = (jrn)object1;
                        jro jro2 = jrn6.d;
                        boolean z3 = jse.c(jro2);
                        if(jro2.M() && z3) {
                            jrp.aa(jro2, jss0, new jrx());
                        }
                        jrn jrn7 = jro2.K;
                        if(jrn6 == jrn7) {
                            jrn jrn8 = jro2.M.e;
                            if(jrn8 == null || !jrn8.c) {
                                goto label_60;
                            }
                        }
                        else {
                        label_60:
                            if(jrn6 != jro2.M || (jrn7.e == null || !jrn7.e.c)) {
                                z4 = false;
                                goto label_64;
                            }
                        }
                        z4 = true;
                    label_64:
                        if(jro2.P() != 3 || z3) {
                            if(jro2.M()) {
                                continue;
                            }
                            if(jrn6 == jrn7 && jro2.M.e == null) {
                                int v5 = jrn7.b() + v2;
                                jro2.y(v5, jro2.j() + v5);
                                jse.a(v + 1, jro2, jss0, z);
                            }
                            else {
                                jrn jrn9 = jro2.M;
                                if(jrn6 == jrn9 && jrn7.e == null) {
                                    int v6 = v2 - jrn9.b();
                                    jro2.y(v6 - jro2.j(), v6);
                                    jse.a(v + 1, jro2, jss0, z);
                                }
                                else {
                                    if(!z4 || jro2.K()) {
                                        continue;
                                    }
                                    jse.e(v + 1, jss0, jro2, z);
                                }
                            }
                        }
                        else if(jro2.P() == 3 && jro2.x >= 0 && jro2.w >= 0 && (jro2.ai == 8 || jro2.t == 0 && jro2.Y == 0.0f) && !jro2.K() && !jro2.H && z4 && !jro2.K()) {
                            jse.f(v + 1, jro0, jss0, jro2, z);
                        }
                    }
                }
                jro0.o = true;
            }
        }
    }

    public static void b(int v, jro jro0, jss jss0) {
        boolean z3;
        boolean z1;
        if(!jro0.p) {
            ++jse.c;
            if(!(jro0 instanceof jrp) && jro0.M() && jse.c(jro0)) {
                jrp.aa(jro0, jss0, new jrx());
            }
            jrn jrn0 = jro0.N(3);
            jrn jrn1 = jro0.N(5);
            int v1 = jrn0.a();
            int v2 = jrn1.a();
            HashSet hashSet0 = jrn0.a;
            if(hashSet0 != null && jrn0.c) {
                for(Object object0: hashSet0) {
                    jrn jrn2 = (jrn)object0;
                    jro jro1 = jrn2.d;
                    boolean z = jse.c(jro1);
                    if(jro1.M() && z) {
                        jrp.aa(jro1, jss0, new jrx());
                    }
                    jrn jrn3 = jro1.L;
                    if(jrn2 == jrn3) {
                        jrn jrn4 = jro1.N.e;
                        if(jrn4 == null || !jrn4.c) {
                            goto label_22;
                        }
                    }
                    else {
                    label_22:
                        if(jrn2 != jro1.N || (jrn3.e == null || !jrn3.e.c)) {
                            z1 = false;
                            goto label_26;
                        }
                    }
                    z1 = true;
                label_26:
                    if(jro1.Q() != 3 || z) {
                        if(jro1.M()) {
                            continue;
                        }
                        if(jrn2 == jrn3 && jro1.N.e == null) {
                            int v3 = jrn3.b() + v1;
                            jro1.z(v3, jro1.h() + v3);
                            jse.b(v + 1, jro1, jss0);
                        }
                        else {
                            jrn jrn5 = jro1.N;
                            if(jrn2 == jrn5 && jrn3.e == null) {
                                int v4 = v1 - jrn5.b();
                                jro1.z(v4 - jro1.h(), v4);
                                jse.b(v + 1, jro1, jss0);
                            }
                            else {
                                if(!z1 || jro1.L()) {
                                    continue;
                                }
                                jse.g(v + 1, jss0, jro1);
                            }
                        }
                    }
                    else if(jro1.Q() == 3 && jro1.A >= 0 && jro1.z >= 0 && (jro1.ai == 8 || jro1.u == 0 && jro1.Y == 0.0f) && !jro1.L() && !jro1.H && z1 && !jro1.L()) {
                        jse.h(v + 1, jro0, jss0, jro1);
                    }
                }
            }
            if(!(jro0 instanceof jrs)) {
                HashSet hashSet1 = jrn1.a;
                if(hashSet1 != null && jrn1.c) {
                    for(Object object1: hashSet1) {
                        jrn jrn6 = (jrn)object1;
                        jro jro2 = jrn6.d;
                        boolean z2 = jse.c(jro2);
                        if(jro2.M() && z2) {
                            jrp.aa(jro2, jss0, new jrx());
                        }
                        jrn jrn7 = jro2.L;
                        if(jrn6 == jrn7) {
                            jrn jrn8 = jro2.N.e;
                            if(jrn8 == null || !jrn8.c) {
                                goto label_60;
                            }
                        }
                        else {
                        label_60:
                            if(jrn6 != jro2.N || (jrn7.e == null || !jrn7.e.c)) {
                                z3 = false;
                                goto label_64;
                            }
                        }
                        z3 = true;
                    label_64:
                        if(jro2.Q() != 3 || z2) {
                            if(jro2.M()) {
                                continue;
                            }
                            if(jrn6 == jrn7 && jro2.N.e == null) {
                                int v5 = jrn7.b() + v2;
                                jro2.z(v5, jro2.h() + v5);
                                jse.b(v + 1, jro2, jss0);
                            }
                            else {
                                jrn jrn9 = jro2.N;
                                if(jrn6 == jrn9 && jrn7.e == null) {
                                    int v6 = v2 - jrn9.b();
                                    jro2.z(v6 - jro2.h(), v6);
                                    jse.b(v + 1, jro2, jss0);
                                }
                                else {
                                    if(!z3 || jro2.L()) {
                                        continue;
                                    }
                                    jse.g(v + 1, jss0, jro2);
                                }
                            }
                        }
                        else if(jro2.Q() == 3 && jro2.A >= 0 && jro2.z >= 0 && (jro2.ai == 8 || jro2.u == 0 && jro2.Y == 0.0f) && !jro2.L() && !jro2.H && z3 && !jro2.L()) {
                            jse.h(v + 1, jro0, jss0, jro2);
                        }
                    }
                }
                jrn jrn10 = jro0.N(6);
                if(jrn10.a != null && jrn10.c) {
                    int v7 = jrn10.a();
                    for(Object object2: jrn10.a) {
                        jrn jrn11 = (jrn)object2;
                        jro jro3 = jrn11.d;
                        boolean z4 = jse.c(jro3);
                        if(jro3.M() && z4) {
                            jrp.aa(jro3, jss0, new jrx());
                        }
                        if((jro3.Q() != 3 || z4) && !jro3.M()) {
                            jrn jrn12 = jro3.O;
                            if(jrn11 == jrn12) {
                                int v8 = jrn11.b() + v7;
                                if(jro3.G) {
                                    int v9 = v8 - jro3.ac;
                                    int v10 = jro3.X + v9;
                                    jro3.ab = v9;
                                    jro3.L.f(v9);
                                    jro3.N.f(v10);
                                    jrn12.f(v8);
                                    jro3.n = true;
                                }
                                jse.b(v + 1, jro3, jss0);
                            }
                        }
                    }
                }
                jro0.p = true;
            }
        }
    }

    public static boolean c(jro jro0) {
        boolean z1;
        boolean z;
        int v = jro0.P();
        int v1 = jro0.Q();
        if(v != 1 && !jro0.e()) {
            switch(v) {
                case 2: {
                    z = true;
                    break;
                }
                case 3: {
                    if(!(jro0.t != 0 || jro0.Y != 0.0f) && jro0.I(0)) {
                        z = true;
                    }
                    else if(jro0.t != 1 || !jro0.J(0, jro0.j())) {
                        z = false;
                    }
                    else {
                        z = true;
                    }
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        else {
            z = true;
        }
        if(v1 != 1 && !jro0.f()) {
            switch(v1) {
                case 2: {
                    z1 = true;
                    break;
                }
                case 3: {
                    if(!(jro0.u != 0 || jro0.Y != 0.0f) && jro0.I(1)) {
                        z1 = true;
                    }
                    else if(jro0.u != 1 || !jro0.J(1, jro0.h())) {
                        z1 = false;
                    }
                    else {
                        z1 = true;
                    }
                    break;
                }
                default: {
                    z1 = false;
                }
            }
        }
        else {
            z1 = true;
        }
        if((jro0.Y > 0.0f)) {
            return z || z1 ? true : false;
        }
        return z && z1;
    }

    public static void d(jrk jrk0, jss jss0, int v, boolean z) {
        if(jrk0.c()) {
            if(v == 0) {
                jse.a(1, jrk0, jss0, z);
                return;
            }
            jse.b(1, jrk0, jss0);
        }
    }

    private static void e(int v, jss jss0, jro jro0, boolean z) {
        float f = jro0.af;
        int v1 = jro0.K.e.a();
        int v2 = jro0.M.e.a();
        int v3 = jro0.K.b() + v1;
        int v4 = v1 == v2 ? v2 : v2 - jro0.M.b();
        if(v1 == v2) {
            v3 = v1;
        }
        if(v1 == v2) {
            f = 0.5f;
        }
        int v5 = jro0.j();
        int v6 = v3 <= v4 ? v4 - v3 - v5 : v3 - v4 - v5;
        int v7 = ((int)(v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f)) + v3;
        jro0.y(v7, (v3 <= v4 ? v7 + v5 : v7 - v5));
        jse.a(v + 1, jro0, jss0, z);
    }

    private static void f(int v, jro jro0, jss jss0, jro jro1, boolean z) {
        float f = jro1.af;
        int v1 = jro1.K.b();
        int v2 = jro1.K.e.a() + v1;
        int v3 = jro1.M.b();
        int v4 = jro1.M.e.a() - v3;
        if(v4 >= v2) {
            int v5 = jro1.j();
            int v6 = v4 - v2;
            if(jro1.ai != 8) {
                int v7 = jro1.t;
                if(v7 == 2) {
                    v5 = (int)(jro1.af * 0.5f * ((float)((jro0 instanceof jrp) ? jro0.j() : jro0.V.j())));
                }
                else if(v7 == 0) {
                    v5 = v6;
                }
                v5 = Math.max(jro1.w, v5);
                int v8 = jro1.x;
                if(v8 > 0) {
                    v5 = Math.min(v8, v5);
                }
            }
            int v9 = v2 + ((int)(f * ((float)(v6 - v5)) + 0.5f));
            jro1.y(v9, v5 + v9);
            jse.a(v + 1, jro1, jss0, z);
        }
    }

    private static void g(int v, jss jss0, jro jro0) {
        float f = jro0.ag;
        int v1 = jro0.L.e.a();
        int v2 = jro0.N.e.a();
        int v3 = jro0.L.b() + v1;
        int v4 = v1 == v2 ? v2 : v2 - jro0.N.b();
        if(v1 == v2) {
            v3 = v1;
        }
        if(v1 == v2) {
            f = 0.5f;
        }
        int v5 = jro0.h();
        int v6 = v3 <= v4 ? v4 - v3 - v5 : v3 - v4 - v5;
        float f1 = v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f;
        int v7 = v3 + ((int)f1);
        int v8 = v7 + v5;
        if(v3 > v4) {
            v7 = v3 - ((int)f1);
            v8 = v7 - v5;
        }
        jro0.z(v7, v8);
        jse.b(v + 1, jro0, jss0);
    }

    private static void h(int v, jro jro0, jss jss0, jro jro1) {
        float f = jro1.ag;
        int v1 = jro1.L.b();
        int v2 = jro1.L.e.a() + v1;
        int v3 = jro1.N.b();
        int v4 = jro1.N.e.a() - v3;
        if(v4 >= v2) {
            int v5 = jro1.h();
            int v6 = v4 - v2;
            if(jro1.ai != 8) {
                int v7 = jro1.u;
                if(v7 == 2) {
                    v5 = (int)(f * 0.5f * ((float)((jro0 instanceof jrp) ? jro0.h() : jro0.V.h())));
                }
                else if(v7 == 0) {
                    v5 = v6;
                }
                v5 = Math.max(jro1.z, v5);
                int v8 = jro1.A;
                if(v8 > 0) {
                    v5 = Math.min(v8, v5);
                }
            }
            int v9 = v2 + ((int)(f * ((float)(v6 - v5)) + 0.5f));
            jro1.z(v9, v5 + v9);
            jse.b(v + 1, jro1, jss0);
        }
    }
}

