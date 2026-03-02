import java.lang.reflect.Array;
import java.util.Arrays;

public final class lw {
    public Object[] a;
    public final lv b;
    public int c;
    public final Class d;

    public lw(Class class0, lv lv0) {
        this.d = class0;
        this.a = (Object[])Array.newInstance(class0, 10);
        this.b = lv0;
        this.c = 0;
    }

    public final Object a(int v) {
        if(v < this.c && v >= 0) {
            return this.a[v];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + v + " but size is " + this.c);
    }

    public final void b() {
        int v = this.c;
        if(v == 0) {
            return;
        }
        Arrays.fill(this.a, 0, v, null);
        this.c = 0;
        this.b.d(0, v);
    }

    public final int c(Object object0, Object[] arr_object, int v, int v1) {
        int v2 = 0;
        while(v2 < v) {
            int v3 = (v2 + v) / 2;
            Object object1 = arr_object[v3];
            lv lv0 = this.b;
            int v4 = lv0.compare(object1, object0);
            if(v4 < 0) {
                v2 = v3 + 1;
            }
            else {
                if(v4 == 0) {
                    if(!lv0.e(object1, object0)) {
                        int v5 = v3 - 1;
                    alab1:
                        while(true) {
                            if(v5 >= v2) {
                                Object object2 = this.a[v5];
                                if(lv0.compare(object2, object0) == 0) {
                                    if(lv0.e(object2, object0)) {
                                        break;
                                    }
                                    --v5;
                                    continue;
                                }
                                else {
                                    v5 = v3 + 1;
                                    goto label_21;
                                }
                                goto label_20;
                            }
                            else {
                            label_20:
                                v5 = v3 + 1;
                            }
                        label_21:
                            while(v5 < v) {
                                Object object3 = this.a[v5];
                                if(lv0.compare(object3, object0) != 0) {
                                    break;
                                }
                                if(lv0.e(object3, object0)) {
                                    break alab1;
                                }
                                ++v5;
                            }
                            v5 = -1;
                            break;
                        }
                        return v1 == 1 && v5 == -1 ? v3 : v5;
                    }
                    return v3;
                }
                v = v3;
            }
        }
        return v1 == 1 ? v2 : -1;
    }
}

