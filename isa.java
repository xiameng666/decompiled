import java.util.ArrayList;
import java.util.List;

public final class isa {
    public static final boolean a(List list0) {
        long v2;
        ibps ibps0;
        if(list0.size() < 2) {
            return true;
        }
        if(list0.size() <= 1) {
            ibps0 = ibps.a;
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            Object object0 = list0.get(0);
            int v = ibpo.d(list0);
            int v1 = 0;
            while(v1 < v) {
                ++v1;
                Object object1 = list0.get(v1);
                arrayList0.add(new hjz(((long)Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat(((int)(((iug)object0).b().a() >> 0x20))) - Float.intBitsToFloat(((int)(((iug)object1).b().a() >> 0x20)))))) << 0x20 | ((long)Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat(((int)(((iug)object0).b().a() & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(((iug)object1).b().a() & 0xFFFFFFFFL)))))) & 0xFFFFFFFFL));
                object0 = object1;
            }
            ibps0 = arrayList0;
        }
        if(ibps0.size() == 1) {
            v2 = ((hjz)ibpo.R(ibps0)).a;
            return Float.intBitsToFloat(((int)(0xFFFFFFFFL & v2))) < Float.intBitsToFloat(((int)(v2 >> 0x20)));
        }
        if(ibps0.isEmpty()) {
            jlz.b("Empty collection can\'t be reduced.");
        }
        Object object2 = ibpo.R(ibps0);
        int v3 = ibpo.d(ibps0);
        if(v3 > 0) {
            for(int v4 = 1; true; ++v4) {
                long v5 = ((hjz)ibps0.get(v4)).a;
                object2 = new hjz(hjz.d(((hjz)object2).a, v5));
                if(v4 == v3) {
                    break;
                }
            }
        }
        v2 = ((hjz)object2).a;
        return Float.intBitsToFloat(((int)(0xFFFFFFFFL & v2))) < Float.intBitsToFloat(((int)(v2 >> 0x20)));
    }

    public static final boolean b(iug iug0) {
        return itz.a(iug0.e(), iuz.f) != null || itz.a(iug0.e(), iuz.e) != null;
    }
}

