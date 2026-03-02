import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class bab {
    public static final bab a;
    public static final bab b;
    public final LinkedHashSet c;

    static {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        baa.a(0, linkedHashSet0);
        bab.a = new bab(linkedHashSet0);
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        baa.a(1, linkedHashSet1);
        bab.b = new bab(linkedHashSet1);
    }

    public bab(LinkedHashSet linkedHashSet0) {
        this.c = linkedHashSet0;
    }

    public final bin a(LinkedHashSet linkedHashSet0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: linkedHashSet0) {
            arrayList0.add(((bin)object0).b());
        }
        List list0 = this.c(arrayList0);
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        for(Object object1: linkedHashSet0) {
            bin bin0 = (bin)object1;
            if(list0.contains(bin0.b())) {
                linkedHashSet1.add(bin0);
            }
        }
        Iterator iterator2 = linkedHashSet1.iterator();
        if(iterator2.hasNext()) {
            return iterator2.next();
        }
        StringBuilder stringBuilder0 = new StringBuilder("Cams:");
        stringBuilder0.append(linkedHashSet0.size());
        for(Object object3: linkedHashSet0) {
            bik bik0 = ((bin)object3).e();
            stringBuilder0.append(String.format(" Id:%s  Lens:%s", bik0.j(), bik0.a()));
        }
        String s = stringBuilder0.toString();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(String.format("PhyId:%s  Filters:%s", 0, this.c.size()));
        for(Object object4: this.c) {
            azw azw0 = (azw)object4;
            stringBuilder1.append(" Id:");
            stringBuilder1.append(azw0.a());
            if((azw0 instanceof bkt)) {
                stringBuilder1.append(" LensFilter:");
                stringBuilder1.append(((bkt)azw0).b);
            }
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", s, stringBuilder1.toString()));
    }

    public final Integer b() {
        Integer integer0 = null;
        for(Object object0: this.c) {
            azw azw0 = (azw)object0;
            if((azw0 instanceof bkt)) {
                Integer integer1 = (int)((bkt)azw0).b;
                if(integer0 == null) {
                    integer0 = integer1;
                }
                else if(!integer0.equals(integer1)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return integer0;
    }

    public final List c(List list0) {
        List list1 = new ArrayList(list0);
        for(Object object0: this.c) {
            list1 = ((azw)object0).b(DesugarCollections.unmodifiableList(list1));
        }
        list1.retainAll(list0);
        return list1;
    }
}

