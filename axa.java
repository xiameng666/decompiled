import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class axa {
    private static final Map a;
    private static final Map b;

    static {
        HashMap hashMap0 = new HashMap();
        axa.a = hashMap0;
        HashMap hashMap1 = new HashMap();
        axa.b = hashMap1;
        Long long0 = (long)1L;
        hashMap0.put(long0, bat.b);
        List list0 = Collections.singletonList(long0);
        hashMap1.put(bat.b, list0);
        Long long1 = (long)2L;
        hashMap0.put(long1, bat.c);
        hashMap1.put(((bat)hashMap0.get(long1)), Collections.singletonList(long1));
        Long long2 = (long)4L;
        hashMap0.put(long2, bat.d);
        List list1 = Collections.singletonList(long2);
        hashMap1.put(bat.d, list1);
        Long long3 = (long)8L;
        hashMap0.put(long3, bat.e);
        List list2 = Collections.singletonList(long3);
        hashMap1.put(bat.e, list2);
        List list3 = Arrays.asList(new Long[]{((long)0x40L), ((long)0x80L), ((long)16L), ((long)0x20L)});
        for(Object object0: list3) {
            axa.a.put(((Long)object0), bat.f);
        }
        axa.b.put(bat.f, list3);
        List list4 = Arrays.asList(new Long[]{((long)0x400L), ((long)0x800L), ((long)0x100L), ((long)0x200L)});
        for(Object object1: list4) {
            axa.a.put(((Long)object1), bat.g);
        }
        axa.b.put(bat.g, list4);
    }

    public static bat a(long v) {
        return (bat)axa.a.get(Long.valueOf(v));
    }

    public static Long b(bat bat0, DynamicRangeProfiles dynamicRangeProfiles0) {
        List list0 = (List)axa.b.get(bat0);
        if(list0 != null) {
            Set set0 = dynamicRangeProfiles0.getSupportedProfiles();
            for(Object object0: list0) {
                Long long0 = (Long)object0;
                if(set0.contains(long0)) {
                    return long0;
                }
            }
        }
        return null;
    }
}

