import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class lo {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final lm d;
    private final int e;
    private final int f;

    public lo(lm lm0, List list0, int[] arr_v, int[] arr_v1) {
        this.a = list0;
        this.b = arr_v;
        this.c = arr_v1;
        Arrays.fill(arr_v, 0);
        Arrays.fill(arr_v1, 0);
        this.d = lm0;
        int v = lm0.b();
        this.e = v;
        int v1 = lm0.a();
        this.f = v1;
        ln ln0 = list0.isEmpty() ? null : ((ln)list0.get(0));
        if(ln0 == null || ln0.a != 0 || ln0.b != 0) {
            list0.add(0, new ln(0, 0, 0));
        }
        list0.add(new ln(v, v1, 0));
        for(Object object0: list0) {
            ln ln1 = (ln)object0;
            for(int v2 = 0; v2 < ln1.c; ++v2) {
                int v3 = ln1.a + v2;
                int v4 = ln1.b + v2;
                int v5 = this.d.d(v3, v4) ? 1 : 2;
                this.b[v3] = v4 << 4 | v5;
                this.c[v4] = v3 << 4 | v5;
            }
        }
        int v6 = 0;
        for(Object object1: this.a) {
            while(v6 < ((ln)object1).a) {
                if(this.b[v6] == 0) {
                    int v7 = this.a.size();
                    int v9 = 0;
                alab1:
                    for(int v8 = 0; v8 < v7; ++v8) {
                        ln ln2 = (ln)this.a.get(v8);
                        while(v9 < ln2.b) {
                            if(this.c[v9] == 0 && this.d.e(v6, v9)) {
                                int v10 = this.d.d(v6, v9) ? 8 : 4;
                                this.b[v6] = v9 << 4 | v10;
                                this.c[v9] = v10 | v6 << 4;
                                break alab1;
                            }
                            ++v9;
                        }
                        v9 = ln2.b();
                    }
                }
                ++v6;
            }
            v6 = ((ln)object1).a();
        }
    }

    public final int a(int v) {
        if(v < 0 || v >= this.e) {
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + v + ", old list size = " + this.e);
        }
        int v1 = this.b[v];
        return (v1 & 15) == 0 ? -1 : v1 >> 4;
    }

    public final void b(lu lu0) {
        lk lk0 = (lu0 instanceof lk) ? ((lk)lu0) : new lk(lu0);
        int v = this.e;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        List list0 = this.a;
        int v1 = list0.size() - 1;
        int v2 = this.f;
        int v3 = v;
        while(v1 >= 0) {
            ln ln0 = (ln)list0.get(v1);
            int v4 = ln0.a();
            int v5 = ln0.b();
            while(v3 > v4) {
                --v3;
                int v7 = this.b[v3];
                if((v7 & 12) == 0) {
                    lk0.d(v3, 1);
                    --v;
                }
                else {
                    lq lq0 = lo.d(arrayDeque0, v7 >> 4, false);
                    if(lq0 == null) {
                        arrayDeque0.add(new lq(v3, v - v3 - 1, true));
                    }
                    else {
                        int v8 = v - lq0.b - 1;
                        lk0.c(v3, v8);
                        if((v7 & 4) == 0) {
                            continue;
                        }
                        lk0.a(v8, 1, this.d.c(v3, v7 >> 4));
                    }
                }
            }
            while(v2 > v5) {
                --v2;
                int v9 = this.c[v2];
                if((v9 & 12) == 0) {
                    lk0.b(v3, 1);
                    ++v;
                }
                else {
                    lq lq1 = lo.d(arrayDeque0, v9 >> 4, true);
                    if(lq1 == null) {
                        arrayDeque0.add(new lq(v2, v - v3, false));
                    }
                    else {
                        lk0.c(v - lq1.b - 1, v3);
                        if((v9 & 4) == 0) {
                            continue;
                        }
                        lk0.a(v3, 1, this.d.c(v9 >> 4, v2));
                    }
                }
            }
            v3 = ln0.a;
            v2 = ln0.b;
            int v10 = v3;
            int v11 = v2;
            for(int v6 = 0; v6 < ln0.c; ++v6) {
                if((this.b[v10] & 15) == 2) {
                    lk0.a(v10, 1, this.d.c(v10, v11));
                }
                ++v10;
                ++v11;
            }
            --v1;
        }
        lk0.e();
    }

    public final void c(tk tk0) {
        this.b(new lj(tk0));
    }

    private static lq d(Collection collection0, int v, boolean z) {
        lq lq0;
        Iterator iterator0 = collection0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            lq0 = (lq)object0;
            if(lq0.a != v || lq0.c != z) {
                continue;
            }
            iterator0.remove();
            goto label_8;
        }
        lq0 = null;
    label_8:
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            lq lq1 = (lq)object1;
            if(z) {
                --lq1.b;
            }
            else {
                ++lq1.b;
            }
        }
        return lq0;
    }
}

