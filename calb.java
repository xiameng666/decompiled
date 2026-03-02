import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class calb implements gfsi {
    final canj a;
    final cank b;

    public calb(canj canj0, cank cank0) {
        this.a = canj0;
        this.b = cank0;
        super();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((List)object0) == null) {
            return Boolean.valueOf(false);
        }
        Object object1 = Boolean.valueOf(true);
        HashSet hashSet0 = new HashSet();
        for(Object object2: ((List)object0)) {
            cald cald0 = (cald)object2;
            object1 = Boolean.valueOf(((boolean)(((Boolean)object1).booleanValue() & cald0.b.booleanValue())));
            if(cald0.b.booleanValue()) {
                hashSet0.add(cald0.a);
                canj canj0 = this.a;
                if(cald0.a.equals(canj0) && canj0.a()) {
                    this.b.g(canj0.b.longValue());
                }
            }
        }
        if(((Boolean)object1).booleanValue()) {
            cank cank0 = this.b;
            cank0.d();
            canj canj1 = this.a;
            if(canj1.a()) {
                cank0.g(canj1.b.longValue());
            }
        }
        else {
            cank cank1 = this.b;
            synchronized(cank1.b) {
                Set set0 = cand.a(cank1.e());
                HashSet hashSet1 = new HashSet();
                for(Object object4: set0) {
                    hashSet1.add(((canj)object4).toString());
                }
                HashSet hashSet2 = new HashSet();
                for(Object object5: hashSet0) {
                    hashSet2.add(((canj)object5).toString());
                }
                hashSet1.removeAll(hashSet2);
                cank1.a.edit().putStringSet("batch_indexing_windows", hashSet1).commit();
            }
        }
        ((ggtj)cale.a.h()).B("Bulk mediastore status = %b", object1);
        return object1;
    }
}

