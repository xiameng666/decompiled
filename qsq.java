import android.graphics.Color;
import java.util.ArrayList;

public final class qsq {
    public static final int a;
    private static final qtj b;
    private static final qtj c;
    private static final qtj d;

    static {
        qsq.b = qtj.a(new String[]{"nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm"});
        qsq.c = qtj.a(new String[]{"d", "a"});
        qsq.d = qtj.a(new String[]{"ty", "nm"});
    }

    public static qrj a(qtl qtl0, qkb qkb0) {
        String s6;
        String s5;
        boolean z3;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        qtl0.i();
        Float float0 = (float)0.0f;
        String s = "UNSET";
        long v = 0L;
        long v1 = -1L;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        boolean z1 = false;
        int v6 = 1;
        int v7 = 1;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        String s1 = null;
        String s2 = null;
        qqg qqg0 = null;
        float f5 = 1.0f;
        qqj qqj0 = null;
        qse qse0 = null;
        qqe qqe0 = null;
        qqf qqf0 = null;
        qpw qpw0 = null;
        while(qtl0.o()) {
            switch(qtl0.c(qsq.b)) {
                case 0: {
                    s = qtl0.g();
                    break;
                }
                case 1: {
                    v = (long)qtl0.b();
                    break;
                }
                case 2: {
                    s2 = qtl0.g();
                    break;
                }
                case 3: {
                    int v8 = qtl0.b();
                    v2 = v8 >= 6 ? 7 : new int[]{1, 2, 3, 4, 5, 6, 7}[v8];
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 4: {
                    v1 = (long)qtl0.b();
                    break;
                }
                case 5: {
                    v3 = (int)(((float)qtl0.b()) * qty.a());
                    break;
                }
                case 6: {
                    v4 = (int)(((float)qtl0.b()) * qty.a());
                    break;
                }
                case 7: {
                    v5 = Color.parseColor(qtl0.g());
                    break;
                }
                case 8: {
                    qqg0 = qrx.a(qtl0, qkb0);
                    break;
                }
                case 9: {
                    int v9 = qtl0.b();
                    if(v9 >= 6) {
                        qkb0.f("Unsupported matte type: " + v9);
                    }
                    else {
                        v6 = qri.a()[v9];
                        if(v6 == 0) {
                            throw null;
                        }
                        switch(v6 - 1) {
                            case 3: {
                                qkb0.f("Unsupported matte type: Luma");
                                break;
                            }
                            case 4: {
                                qkb0.f("Unsupported matte type: Luma Inverted");
                            }
                        }
                        qkb0.g(1);
                    }
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 10: {
                    qtl0.h();
                    while(qtl0.o()) {
                        qtl0.i();
                        qpy qpy0 = null;
                        qqc qqc0 = null;
                        boolean z2 = false;
                        int v10 = 0;
                        while(qtl0.o()) {
                            String s3 = qtl0.f();
                            switch(s3) {
                                case "inv": {
                                    z2 = qtl0.p();
                                    break;
                                }
                                case "mode": {
                                    switch(qtl0.g()) {
                                        case "a": {
                                            v10 = 1;
                                            break;
                                        }
                                        case "i": {
                                            qkb0.f("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            v10 = 3;
                                            break;
                                        }
                                        case "n": {
                                            v10 = 4;
                                            break;
                                        }
                                        case "s": {
                                            v10 = 2;
                                            break;
                                        }
                                        default: {
                                            qtq.a(a.a(s3, "Unknown mask mode ", ". Defaulting to Add."));
                                            v10 = 1;
                                        }
                                    }
                                    break;
                                }
                                case "o": {
                                    qpy0 = qry.e(qtl0, qkb0);
                                    break;
                                }
                                case "pt": {
                                    qqc0 = qry.g(qtl0, qkb0);
                                    break;
                                }
                                default: {
                                    qtl0.n();
                                }
                            }
                        }
                        qtl0.k();
                        arrayList0.add(new qqq(v10, qqc0, qpy0, z2));
                    }
                    qkb0.g(arrayList0.size());
                    qtl0.j();
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 11: {
                    qtl0.h();
                    while(qtl0.o()) {
                        qql qql0 = qsc.a(qtl0, qkb0);
                        if(qql0 != null) {
                            arrayList1.add(qql0);
                        }
                    }
                    qtl0.j();
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 12: {
                    qtl0.i();
                    while(qtl0.o()) {
                        switch(qtl0.c(qsq.c)) {
                            case 0: {
                                qqe0 = new qqe(qry.i(qtl0, qty.a(), qkb0, qsd.a));
                                break;
                            }
                            case 1: {
                                qtl0.h();
                                if(qtl0.o()) {
                                    qtl0.i();
                                    qqf0 = null;
                                    while(qtl0.o()) {
                                        if(qtl0.c(qrw.a) == 0) {
                                            qtl0.i();
                                            qpv qpv0 = null;
                                            qpv qpv1 = null;
                                            qpw qpw1 = null;
                                            qpw qpw2 = null;
                                            while(qtl0.o()) {
                                                switch(qtl0.c(qrw.b)) {
                                                    case 0: {
                                                        qpv0 = qry.a(qtl0, qkb0);
                                                        break;
                                                    }
                                                    case 1: {
                                                        qpv1 = qry.a(qtl0, qkb0);
                                                        break;
                                                    }
                                                    case 2: {
                                                        qpw1 = qry.b(qtl0, qkb0);
                                                        break;
                                                    }
                                                    case 3: {
                                                        qpw2 = qry.b(qtl0, qkb0);
                                                        break;
                                                    }
                                                    default: {
                                                        qtl0.m();
                                                        qtl0.n();
                                                    }
                                                }
                                            }
                                            qtl0.k();
                                            qqf0 = new qqf(qpv0, qpv1, qpw1, qpw2);
                                        }
                                        else {
                                            qtl0.m();
                                            qtl0.n();
                                        }
                                    }
                                    qtl0.k();
                                    if(qqf0 == null) {
                                        qqf0 = new qqf(null, null, null, null);
                                    }
                                }
                                while(qtl0.o()) {
                                    qtl0.n();
                                }
                                qtl0.j();
                                break;
                            }
                            default: {
                                qtl0.m();
                                qtl0.n();
                            }
                        }
                    }
                    qtl0.k();
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 13: {
                    qtl0.h();
                    ArrayList arrayList2 = new ArrayList();
                    while(qtl0.o()) {
                        qtl0.i();
                        while(qtl0.o()) {
                        alab1:
                            switch(qtl0.c(qsq.d)) {
                                case 0: {
                                    int v11 = qtl0.b();
                                    if(v11 == 29) {
                                        qqj0 = null;
                                        while(true) {
                                            if(!qtl0.o()) {
                                                break alab1;
                                            }
                                            if(qtl0.c(qrz.a) == 0) {
                                                qtl0.h();
                                                while(qtl0.o()) {
                                                    qtl0.i();
                                                    qqj qqj1 = null;
                                                alab2:
                                                    while(true) {
                                                        z3 = false;
                                                    label_200:
                                                        if(!qtl0.o()) {
                                                            goto label_213;
                                                        }
                                                        switch(qtl0.c(qrz.b)) {
                                                            case 0: {
                                                                if(qtl0.b() != 0) {
                                                                    break;
                                                                }
                                                                break alab2;
                                                            }
                                                            case 1: {
                                                                goto label_208;
                                                            }
                                                            default: {
                                                                qtl0.m();
                                                                qtl0.n();
                                                                goto label_200;
                                                            }
                                                        }
                                                    }
                                                    z3 = true;
                                                    goto label_200;
                                                label_208:
                                                    if(z3) {
                                                        qqj1 = new qqj(qry.b(qtl0, qkb0));
                                                    }
                                                    else {
                                                        qtl0.n();
                                                    }
                                                    goto label_200;
                                                label_213:
                                                    qtl0.k();
                                                    if(qqj1 != null) {
                                                        qqj0 = qqj1;
                                                    }
                                                }
                                                qtl0.j();
                                            }
                                            else {
                                                qtl0.m();
                                                qtl0.n();
                                            }
                                        }
                                    }
                                    else {
                                        if(v11 != 25) {
                                            continue;
                                        }
                                        qpv qpv2 = null;
                                        qpw qpw3 = null;
                                        qpw qpw4 = null;
                                        qpw qpw5 = null;
                                        qpw qpw6 = null;
                                        while(qtl0.o()) {
                                            if(qtl0.c(qsf.a) == 0) {
                                                qtl0.h();
                                                while(qtl0.o()) {
                                                    qtl0.i();
                                                    String s4 = "";
                                                    while(qtl0.o()) {
                                                        switch(qtl0.c(qsf.b)) {
                                                            case 0: {
                                                                s4 = qtl0.g();
                                                                break;
                                                            }
                                                            case 1: {
                                                                switch(s4) {
                                                                    case "Direction": {
                                                                        qpw4 = qry.c(qtl0, qkb0, false);
                                                                        break;
                                                                    }
                                                                    case "Distance": {
                                                                        qpw5 = qry.b(qtl0, qkb0);
                                                                        break;
                                                                    }
                                                                    case "Opacity": {
                                                                        qpw3 = qry.c(qtl0, qkb0, false);
                                                                        break;
                                                                    }
                                                                    case "Shadow Color": {
                                                                        qpv2 = qry.a(qtl0, qkb0);
                                                                        break;
                                                                    }
                                                                    case "Softness": {
                                                                        qpw6 = qry.b(qtl0, qkb0);
                                                                        break;
                                                                    }
                                                                    default: {
                                                                        qtl0.n();
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            default: {
                                                                qtl0.m();
                                                                qtl0.n();
                                                            }
                                                        }
                                                    }
                                                    qtl0.k();
                                                }
                                                qtl0.j();
                                            }
                                            else {
                                                qtl0.m();
                                                qtl0.n();
                                            }
                                        }
                                        if(qpv2 != null && qpw3 != null && qpw4 != null && qpw5 != null && qpw6 != null) {
                                            qse0 = new qse(qpv2, qpw3, qpw4, qpw5, qpw6);
                                            continue;
                                        }
                                        else {
                                            qse0 = null;
                                            break;
                                        }
                                    }
                                    arrayList2.add(qtl0.g());
                                    break;
                                }
                                case 1: {
                                    arrayList2.add(qtl0.g());
                                    break;
                                }
                                default: {
                                    qtl0.m();
                                    qtl0.n();
                                }
                            }
                        }
                        qtl0.k();
                    }
                    qtl0.j();
                    qkb0.f("Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList2.toString());
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 14: {
                    f5 = (float)qtl0.a();
                    break;
                }
                case 15: {
                    f4 = (float)qtl0.a();
                    break;
                }
                case 16: {
                    f2 = (float)(qtl0.a() * ((double)qty.a()));
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 17: {
                    f3 = (float)(qtl0.a() * ((double)qty.a()));
                    float0 = float0;
                    v1 = v1;
                    break;
                }
                case 18: {
                    f = (float)qtl0.a();
                    break;
                }
                case 19: {
                    f1 = (float)qtl0.a();
                    float0 = float0;
                    break;
                }
                case 20: {
                    qpw0 = qry.c(qtl0, qkb0, false);
                    break;
                }
                case 21: {
                    s1 = qtl0.g();
                    break;
                }
                case 22: {
                    z1 = qtl0.p();
                    break;
                }
                case 23: {
                    if(qtl0.b() == 1) {
                        z = true;
                        continue;
                    }
                    else {
                        z = false;
                        break;
                    }
                    goto label_303;
                }
                case 24: {
                label_303:
                    int v12 = qtl0.b();
                    if(v12 >= 18) {
                        qkb0.f("Unsupported Blend Mode: " + v12);
                        v7 = 1;
                    }
                    else {
                        v7 = qqp.a()[v12];
                    }
                    break;
                }
                default: {
                    qtl0.m();
                    qtl0.n();
                    float0 = float0;
                    v1 = v1;
                }
            }
        }
        qtl0.k();
        ArrayList arrayList3 = new ArrayList();
        if((f > 0.0f)) {
            s5 = s;
            s6 = s1;
            arrayList3.add(new qtz(qkb0, float0, float0, null, 0.0f, f));
        }
        else {
            s5 = s;
            s6 = s1;
        }
        if(f1 <= 0.0f) {
            f1 = qkb0.l;
        }
        Float float1 = (float)1.0f;
        arrayList3.add(new qtz(qkb0, float1, float1, null, f, f1));
        arrayList3.add(new qtz(qkb0, float0, float0, null, f1, ((float)3.402823E+38f)));
        if(s5.endsWith(".ai") || "ai".equals(s6)) {
            qkb0.f("Convert your Illustrator layers to shape layers.");
        }
        if(z) {
            qqg qqg1 = qqg0 == null ? new qqg() : qqg0;
            qqg1.j = true;
            qqg0 = qqg1;
        }
        return new qrj(arrayList1, qkb0, s5, v, v2, v1, s2, arrayList0, qqg0, v3, v4, v5, f5, f4, f2, f3, qqe0, qqf0, arrayList3, v6, qpw0, z1, qqj0, qse0, v7);
    }
}

