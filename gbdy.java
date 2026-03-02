import android.view.View;
import java.util.List;

public final class gbdy {
    public static void a(gbet gbet0, gbdq gbdq0, gbml gbml0) {
        if(gbdq0 != null) {
            int v = gbet0.d;
            if(gbet0.e(gbdq0, new int[]{1})) {
                float f = (float)gbez.c(gbdq0, 1, v);
                gbmk gbmk0 = gbml0.l;
                if(gbmk0.d != f) {
                    gbmk0.d = f;
                    gbmk0.a();
                }
            }
            if(gbet0.e(gbdq0, new int[]{2})) {
                int v1 = gbdq0.b(2, v);
                gbmk gbmk1 = gbml0.l;
                if(gbmk1.e != v1) {
                    gbmk1.e = v1;
                    gbmk1.a();
                }
            }
            List list0 = null;
            if(gbet0.e(gbdq0, new int[]{3})) {
                List list1 = gbdq0.h(3, v);
                if(list1.size() == 1) {
                    Integer integer0 = (Integer)list1.get(0);
                    list1 = gged_interceptors.o(integer0, integer0, integer0, integer0);
                }
                else if(list1.size() != 4) {
                    list1 = null;
                }
                if(list1 != null) {
                    gavs.c(list1.size() == 4, "BE_CPC_01", gbml0.h(), "List must contain exactly four colors");
                    gbmk gbmk2 = gbml0.l;
                    int v2 = (int)(((Integer)list1.get(0)));
                    int v3 = (int)(((Integer)list1.get(1)));
                    int v4 = (int)(((Integer)list1.get(2)));
                    int v5 = (int)(((Integer)list1.get(3)));
                    int[] arr_v = gbmk2.j;
                    arr_v[0] = v2;
                    arr_v[1] = v3;
                    arr_v[2] = v4;
                    arr_v[3] = v5;
                }
            }
            if(gbet0.e(gbdq0, new int[]{4})) {
                gbml0.l.h = (float)gbez.c(gbdq0, 4, v);
            }
            if(gbet0.e(gbdq0, new int[]{5})) {
                gbml0.l.i = (float)gbez.c(gbdq0, 5, v);
            }
            if(gbet0.e(gbdq0, new int[]{6})) {
                List list2 = gbdq0.h(6, v);
                if(list2.size() == 1) {
                    Integer integer1 = (Integer)list2.get(0);
                    list0 = gged_interceptors.o(integer1, integer1, integer1, integer1);
                }
                else if(list2.size() == 4) {
                    list0 = list2;
                }
                if(list0 != null) {
                    gavs.c(list0.size() == 4, "BE_CPC_02", gbml0.h(), "List must contain exactly four colors");
                    gbmk gbmk3 = gbml0.l;
                    int v6 = (int)(((Integer)list0.get(0)));
                    int v7 = (int)(((Integer)list0.get(1)));
                    int v8 = (int)(((Integer)list0.get(2)));
                    int v9 = (int)(((Integer)list0.get(3)));
                    int[] arr_v1 = gbmk3.g;
                    arr_v1[0] = v6;
                    arr_v1[1] = v7;
                    arr_v1[2] = v8;
                    arr_v1[3] = v9;
                }
            }
            if(gbet0.e(gbdq0, new int[]{7})) {
                gbml0.l.f = (float)gbez.c(gbdq0, 7, v);
            }
        }
    }

    public static void b(gbet gbet0, View view0, gbml gbml0) {
        gbdp gbdp0 = gbet0.c;
        gbfj.b(gbet0, gbdp0.c(), view0);
        gbdq gbdq0 = gbdp0.d();
        if(gbet0.e(gbdq0, new int[]{2})) {
            gbml0.ie(((float)gbez.c(gbdq0, 2, gbet0.d)));
        }
    }
}

