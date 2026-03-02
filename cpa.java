import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class cpa implements ibtx {
    public final cpb a;
    public final int b;

    public cpa(cpb cpb0, int v) {
        this.a = cpb0;
        this.b = v;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        cjf cjf0;
        Integer integer0 = (Integer)object2;
        ((goz)object1).M(431650961);
        List list0 = this.a.a;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            cpn cpn0 = (cpn)list0.get(v1);
            Integer integer1 = (int)cpn0.a;
            cpe cpe0 = cpn0.d;
            if((cpe0 instanceof cpi)) {
                cjf0 = chm.a(new cph(cpn0.b, ((cpi)cpe0)));
                goto label_15;
            }
            if((cpe0 instanceof cpg)) {
                cjf0 = chm.a(new cpf(cpn0.b, ((cpg)cpe0)));
            label_15:
                cjf cjf1 = cjf0;
                int v2 = cpn0.c;
                switch(v2) {
                    case -1: {
                        cjf1 = chm.e(0x7FFFFFFF, cjf1, cpn0.e, 0L, 8);
                        break;
                    }
                    case 0: {
                        break;
                    }
                    default: {
                        cjf1 = chm.e(v2 + 1, cjf1, cpn0.e, 0L, 8);
                    }
                }
                arrayList0.add(new ibns(integer1, cjf1));
                ++v1;
                continue;
            }
            Objects.toString(cpe0);
            throw new RuntimeException("Unexpected value type: " + cpe0);
        }
        Object object3 = new cop(arrayList0);
        if(!((Boolean)((cld)object0).f()).booleanValue()) {
            object3 = new cpl(((cii)object3), this.b);
        }
        ((goz)object1).A();
        return object3;
    }
}

