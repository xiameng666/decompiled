import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class gaxu extends gaxs {
    private final gazw a;

    public gaxu(gazw gazw0, Bundle bundle0) {
        gazg gazg0;
        Set set0;
        Object object0;
        this.a = gazw0;
        Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("nested");
        synchronized(gazw0.a) {
            gazw0.a.clear();
            Integer integer0 = bundle1 == null ? null : bundle1.getInt("metric_count");
            if(integer0 != null && ((int)integer0) > 0) {
                int v1 = (int)integer0;
                int v2 = 0;
                while(v2 < v1) {
                    String s = String.format("metric_data_%d", Arrays.copyOf(new Object[]{v2}, 1));
                    ibuq.e(s, "format(...)");
                    Bundle bundle2 = bundle1.getBundle(s);
                    if(bundle2 != null) {
                        String s1 = bundle2.getString("metric_name");
                        if(s1 != null) {
                            int v3 = bundle2.getInt("metric_type");
                            ibot ibot0 = new ibot(((ibow)gazj.d));
                            while(ibot0.hasNext()) {
                                object0 = ibot0.next();
                                if(((gazj)object0).ordinal() != v3) {
                                    continue;
                                }
                                goto label_25;
                            }
                            object0 = null;
                        label_25:
                            if(((gazj)object0) != null) {
                                int v4 = ((gazj)object0).ordinal();
                                switch(v4) {
                                    case 0: {
                                        break;
                                    }
                                    case 1: {
                                        gazg0 = new gazg(bundle2.getLong("counter_value"));
                                        gazw0.a.put(s1, gazg0);
                                        break;
                                    }
                                    default: {
                                        if(v4 != 2) {
                                            throw new ibnq();
                                        }
                                        long[] arr_v = bundle2.getLongArray("entries");
                                        if(arr_v == null) {
                                            set0 = ibpu.a;
                                        }
                                        else {
                                            switch(arr_v.length) {
                                                case 0: {
                                                    set0 = ibpu.a;
                                                    break;
                                                }
                                                case 1: {
                                                    set0 = ibqg.b(Long.valueOf(arr_v[0]));
                                                    break;
                                                }
                                                default: {
                                                    set0 = new LinkedHashSet(ibpz.a(arr_v.length));
                                                    for(int v5 = 0; v5 < arr_v.length; ++v5) {
                                                        set0.add(Long.valueOf(arr_v[v5]));
                                                    }
                                                }
                                            }
                                            if(set0 == null) {
                                                set0 = ibpu.a;
                                            }
                                        }
                                        gazg0 = new gazh(set0);
                                        gazw0.a.put(s1, gazg0);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++v2;
                }
            }
        }
    }

    @Override  // gaxs
    protected final void lv() {
        this.a.a();
    }

    @Override  // gaxs
    protected final void lx(Bundle bundle0) {
        Bundle bundle1;
        Map map0 = this.a.a;
        synchronized(map0) {
            if(map0.isEmpty()) {
                bundle1 = null;
            }
            else {
                bundle1 = new Bundle();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(map0.size()));
                for(Object object0: map0.entrySet()) {
                    Object object1 = ((Map.Entry)object0).getKey();
                    Bundle bundle2 = new Bundle();
                    gazi gazi0 = (gazi)((Map.Entry)object0).getValue();
                    bundle2.putString("metric_name", ((String)((Map.Entry)object0).getKey()));
                    bundle2.putInt("metric_type", gazi0.b.ordinal());
                    if((gazi0 instanceof gazg)) {
                        long v1 = ((gazg)gazi0).a.get();
                        Long.valueOf(v1).getClass();
                        bundle2.putLong("counter_value", v1);
                        linkedHashMap0.put(object1, bundle2);
                        continue;
                    }
                    if(!(gazi0 instanceof gazh)) {
                        throw new ibnq();
                    }
                    bundle2.putLongArray("entries", ibpo.aG(((gazh)gazi0).a()));
                    linkedHashMap0.put(object1, bundle2);
                    continue;
                }
                List list0 = ibpo.ao(linkedHashMap0.entrySet(), new gazv());
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object2: list0) {
                    arrayList0.add(((Bundle)((Map.Entry)object2).getValue()));
                }
                bundle1.putInt("metric_count", arrayList0.size());
                int v2 = arrayList0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    String s = String.format("metric_data_%d", Arrays.copyOf(new Object[]{v3}, 1));
                    ibuq.e(s, "format(...)");
                    bundle1.putBundle(s, ((Bundle)arrayList0.get(v3)));
                }
            }
        }
        if(bundle1 != null) {
            bundle0.putBundle("nested", bundle1);
        }
    }
}

