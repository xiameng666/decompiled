import java.util.ArrayList;
import java.util.List;

public final class hmbz {
    public final List a;
    private final List b;

    public hmbz() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c(new hmcc());
        this.c(new hmcd());
        this.c(new hmcf());
        this.c(new hmcg());
        this.c(new hmch());
        this.c(new hmci());
    }

    public hmbz(byte[] arr_b) {
        this.c(new hmce());
    }

    public hmbz(char[] arr_c) {
        this.b(new hmcj());
        this.b(new hmcl());
        this.b(new hmcn());
        this.b(new hmck());
        this.b(new hmco());
        this.b(new hmcm());
    }

    public final List a(hmgf hmgf0) {
        return hmbz.d(this.b, hmgf0);
    }

    final void b(hmcb hmcb0) {
        this.a.add(hmcb0);
    }

    final void c(hmcb hmcb0) {
        this.b.add(hmcb0);
    }

    public static final List d(List list0, hmgf hmgf0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            for(Object object1: ((hmcb)object0).a(hmgf0)) {
                hmhq hmhq0 = (hmhq)object1;
                if(!list1.contains(hmhq0)) {
                    list1.add(hmhq0);
                }
            }
        }
        return list1;
    }
}

