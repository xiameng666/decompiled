import java.util.ArrayList;
import java.util.List;

final class qsp {
    static final qtj a;

    static {
        qsp.a = qtj.a(new String[]{"k"});
    }

    static List a(qtl qtl0, qkb qkb0, float f, qtg qtg0, boolean z) {
        boolean z1;
        qtg qtg1;
        float f1;
        qkb qkb1;
        qtl qtl1;
        List list0 = new ArrayList();
        if(qtl0.q() == 6) {
            qkb0.f("Lottie doesn\'t support expressions.");
            return list0;
        }
        qtl0.i();
        while(qtl0.o()) {
            if(qtl0.c(qsp.a) != 0) {
                qtl0.n();
            }
            else if(qtl0.q() == 1) {
                qtl0.h();
                if(qtl0.q() == 7) {
                    qtl1 = qtl0;
                    qkb1 = qkb0;
                    f1 = f;
                    qtg1 = qtg0;
                    z1 = z;
                    list0.add(qso.a(qtl1, qkb1, f1, qtg1, false, z1));
                }
                else {
                    while(qtl0.o()) {
                        list0.add(qso.a(qtl0, qkb0, f, qtg0, true, z));
                        qtl0 = qtl0;
                        qkb0 = qkb0;
                        f = f;
                        qtg0 = qtg0;
                        z = z;
                    }
                    qtl1 = qtl0;
                    qkb1 = qkb0;
                    f1 = f;
                    qtg1 = qtg0;
                    z1 = z;
                }
                qtl1.j();
                qtl0 = qtl1;
                qkb0 = qkb1;
                f = f1;
                qtg0 = qtg1;
                z = z1;
            }
            else {
                list0.add(qso.a(qtl0, qkb0, f, qtg0, false, z));
                qtl0 = qtl0;
            }
        }
        qtl0.k();
        qsp.b(list0);
        return list0;
    }

    public static void b(List list0) {
        int v = list0.size();
        int v1 = 0;
        while(v1 < v - 1) {
            qtz qtz0 = (qtz)list0.get(v1);
            ++v1;
            qtz qtz1 = (qtz)list0.get(v1);
            qtz0.h = (float)qtz1.g;
            if(qtz0.c == null) {
                Object object0 = qtz1.b;
                if(object0 != null) {
                    qtz0.c = object0;
                    if((qtz0 instanceof qmz)) {
                        ((qmz)qtz0).a();
                    }
                }
            }
        }
        qtz qtz2 = (qtz)list0.get(v - 1);
        if((qtz2.b == null || qtz2.c == null) && list0.size() > 1) {
            list0.remove(qtz2);
        }
    }
}

