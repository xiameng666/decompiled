import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class fuwj implements fuwa {
    public static final fuwh[] b;
    private final fuwo c;

    static {
        fuwj.b = new fuwh[]{fuwh.b, fuwh.i, fuwh.e, fuwh.f, fuwh.a, fuwh.d};
    }

    public fuwj(ByteBuffer byteBuffer0, long v) {
        this.c = new fuwo(fuwj.b, byteBuffer0, v);
    }

    @Override  // fuwa
    public final List a(fuwf fuwf0) {
        fuwo fuwo0;
        if(fuwf0.c >= 0.0004f && fuwf0.s >= 0.0004f) {
            TreeMap treeMap0 = new TreeMap();
            for(int v = 0; true; ++v) {
                fuwo0 = this.c;
                if(v >= fuwo0.a()) {
                    break;
                }
                Comparable comparable0 = fuwo0.b(v, fuwf0.a()).a;
                Integer integer0 = (Integer)treeMap0.get(comparable0);
                treeMap0.put(comparable0, (integer0 == null ? ((int)1) : ((int)(((int)integer0) + 1))));
            }
            fuwh fuwh0 = fuwh.c;
            gftb.checkTrue(((boolean)(treeMap0.containsKey(fuwh0) ^ 1)));
            Integer integer1 = (Integer)treeMap0.get(fuwh.d);
            if(integer1 == null) {
                integer1 = (int)0;
            }
            Integer integer2 = (Integer)treeMap0.get(fuwh.e);
            if(integer2 == null) {
                integer2 = (int)0;
            }
            int v1 = ((int)integer1) + ((int)integer2);
            if(v1 != 0) {
                treeMap0.put(fuwh0, Integer.valueOf(v1));
            }
            List list0 = new ArrayList();
            for(Object object0: treeMap0.entrySet()) {
                int v2 = (int)Math.round(((double)(((int)(((Integer)((Map.Entry)object0).getValue()))))) * 100.0 / ((double)fuwo0.a()));
                list0.add(new fuwi(((fuwh)((Map.Entry)object0).getKey()), v2));
            }
            Collections.sort(list0, fuwa.a);
            return list0;
        }
        return Collections.singletonList(new fuwi(fuwh.f, 100));
    }

    @Override  // fuwa
    public final List b(float[] arr_f) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_f.length; ++v) {
            arrayList0.add(Float.valueOf(arr_f[v]));
        }
        return this.a(fuwg.b(arrayList0));
    }
}

