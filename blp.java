import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class blp {
    private final List a;

    public blp(List list0) {
        this.a = new ArrayList(list0);
    }

    public final blj a(Class class0) {
        for(Object object0: this.a) {
            blj blj0 = (blj)object0;
            if(blj0.getClass() == class0) {
                return blj0;
            }
        }
        return null;
    }

    public final List b(Class class0) {
        List list0 = new ArrayList();
        for(Object object0: this.a) {
            blj blj0 = (blj)object0;
            if(class0.isAssignableFrom(blj0.getClass())) {
                list0.add(blj0);
            }
        }
        return list0;
    }

    public final boolean c(Class class0) {
        for(Object object0: this.a) {
            if(class0.isAssignableFrom(((blj)object0).getClass())) {
                return true;
            }
        }
        return false;
    }

    public static void d(blp blp0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: blp0.a) {
            arrayList0.add(((blj)object0).getClass().getSimpleName());
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        Iterator iterator1 = arrayList0.iterator();
        if(iterator1.hasNext()) {
            while(true) {
                Object object1 = iterator1.next();
                stringBuilder0.append(((CharSequence)object1));
                if(!iterator1.hasNext()) {
                    break;
                }
                stringBuilder0.append(" | ");
            }
        }
    }
}

