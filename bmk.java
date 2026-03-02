import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bmk {
    private final List a;

    public bmk() {
        this.a = new ArrayList();
    }

    public bmk(bmp[] arr_bmp) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        Collections.addAll(arrayList0, arr_bmp);
    }

    public final List a(List list0) {
        if(list0.isEmpty()) {
            return new ArrayList();
        }
        List list1 = this.a;
        if(list0.size() != list1.size()) {
            return null;
        }
        int v = list1.size();
        ArrayList arrayList0 = new ArrayList();
        bmk.c(arrayList0, v, new int[v], 0);
        bmp[] arr_bmp = new bmp[list0.size()];
        for(Object object0: arrayList0) {
            int[] arr_v = (int[])object0;
            int v1 = 0;
            int v2 = 1;
            while(v1 < list1.size()) {
                if(arr_v[v1] < list0.size()) {
                    bmp bmp0 = (bmp)list1.get(v1);
                    bmp bmp1 = (bmp)list0.get(arr_v[v1]);
                    ibuq.f(bmp1, "other");
                    v2 &= (bmp1.e.p > bmp0.e.p || (bmp1.d != bmp0.d || bmp0.f != bmj.a && (bmp1.f != bmj.a && bmp1.f != bmp0.f)) ? 0 : 1);
                    if(v2 != 0) {
                        int v3 = arr_v[v1];
                        arr_bmp[v3] = (bmp)list1.get(v1);
                        ++v1;
                        continue;
                    }
                    break;
                }
                ++v1;
            }
            if(v2 != 0) {
                return Arrays.asList(arr_bmp);
            }
        }
        return null;
    }

    public final void b(bmp bmp0) {
        this.a.add(bmp0);
    }

    private static void c(List list0, int v, int[] arr_v, int v1) {
        if(v1 < arr_v.length) {
            int v2 = 0;
            while(v2 < v) {
                int v3 = 0;
                while(true) {
                    if(v3 < v1) {
                        if(v2 == arr_v[v3]) {
                            break;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    arr_v[v1] = v2;
                    bmk.c(list0, v, arr_v, v1 + 1);
                    break;
                }
                ++v2;
            }
            return;
        }
        list0.add(((int[])arr_v.clone()));
    }
}

