import j..time.Instant;
import java.util.Comparator;
import java.util.Iterator;

public final class byok implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        Instant instant5;
        Object object3;
        Instant instant2;
        Iterator iterator0 = ((byvy)object1).b.iterator();
        Object object2 = null;
        if(iterator0.hasNext()) {
            object3 = iterator0.next();
            if(iterator0.hasNext()) {
                Instant instant0 = ((bybu)object3).o;
                if(instant0 == null) {
                    instant0 = Instant.MIN;
                    ibuq.e(instant0, "MIN");
                }
                while(true) {
                    Object object4 = iterator0.next();
                    Instant instant1 = ((bybu)object4).o;
                    if(instant1 == null) {
                        instant1 = Instant.MIN;
                        ibuq.e(instant1, "MIN");
                    }
                    int v = instant0.compareTo(instant1);
                    if(v < 0) {
                        instant0 = instant1;
                    }
                    if(v < 0) {
                        object3 = object4;
                    }
                    if(iterator0.hasNext()) {
                        continue;
                    }
                    goto label_22;
                }
            }
            else {
            label_22:
                if(((bybu)object3) == null) {
                    instant2 = Instant.MIN;
                    ibuq.e(instant2, "MIN");
                }
                else {
                    instant2 = ((bybu)object3).o;
                    if(instant2 == null) {
                        instant2 = Instant.MIN;
                        ibuq.e(instant2, "MIN");
                    }
                }
            }
        }
        else {
            object3 = null;
            goto label_22;
        }
        Iterator iterator1 = ((byvy)object0).b.iterator();
        if(iterator1.hasNext()) {
            object2 = iterator1.next();
            if(iterator1.hasNext()) {
                Instant instant3 = ((bybu)object2).o;
                if(instant3 == null) {
                    instant3 = Instant.MIN;
                    ibuq.e(instant3, "MIN");
                }
                while(true) {
                    Object object5 = iterator1.next();
                    Instant instant4 = ((bybu)object5).o;
                    if(instant4 == null) {
                        instant4 = Instant.MIN;
                        ibuq.e(instant4, "MIN");
                    }
                    int v1 = instant3.compareTo(instant4);
                    if(v1 < 0) {
                        instant3 = instant4;
                    }
                    if(v1 < 0) {
                        object2 = object5;
                    }
                    if(iterator1.hasNext()) {
                        continue;
                    }
                    goto label_49;
                }
            }
            else {
                goto label_49;
            }
        }
        else {
        label_49:
            if(((bybu)object2) == null) {
                instant5 = Instant.MIN;
                ibuq.e(instant5, "MIN");
            }
            else {
                instant5 = ((bybu)object2).o;
                if(instant5 == null) {
                    ibuq.e(Instant.MIN, "MIN");
                    return ibrc.a(instant2, Instant.MIN);
                }
            }
        }
        return ibrc.a(instant2, instant5);
    }
}

