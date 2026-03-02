import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class iams {
    private List a;
    private final iakk b;
    private Object[][] c;

    public iams() {
        this.b = iakk.a;
        this.c = new Object[0][2];
    }

    public final iamu a() {
        return new iamu(this.a, this.b, this.c);
    }

    public final void b(iamt iamt0, Object object0) {
        int v;
        for(v = 0; true; ++v) {
            Object[][] arr2_object = this.c;
            if(v >= arr2_object.length) {
                v = -1;
                break;
            }
            if(iamt0.equals(arr2_object[v][0])) {
                break;
            }
        }
        if(v == -1) {
            Object[][] arr2_object1 = this.c;
            Object[][] arr2_object2 = new Object[arr2_object1.length + 1][2];
            System.arraycopy(arr2_object1, 0, arr2_object2, 0, arr2_object1.length);
            this.c = arr2_object2;
            v = arr2_object2.length - 1;
        }
        this.c[v] = new Object[]{iamt0, object0};
    }

    public final void c(List list0) {
        gftb.b(((boolean)(list0.isEmpty() ^ 1)), "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list0));
    }
}

