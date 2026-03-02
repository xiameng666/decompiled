import java.util.ArrayList;

public final class hmgo {
    public static final hmgz a(hmcy hmcy0, hmgz hmgz0, hmbb hmbb0, hmgz hmgz1, hmgz hmgz2, hmgz hmgz3, boolean z) {
        hmgz hmgz7;
        int v = hmgo.c(hmcy0.b);
        if(hmgz0.b() >= hmgo.c(hmcy0.a) + v + 1) {
            int v1 = hmgo.c(hmcy0.b) - Integer.parseInt(hmcy0.c.i(), 16);
            hmgz hmgz4 = hmgo.b(hmgz1, hmgo.c(hmcy0.a));
            try {
                hmgz hmgz5 = hmgo.d(hmcy0.a, hmgz0.b());
            }
            catch(hmdl unused_ex) {
                hmbb0.a("Could not copy CVC3 Track data into DS", new Object[0]);
                goto label_20;
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v2 = 0; v2 < hmgz5.b(); ++v2) {
                if(hmgz5.a(v2) == new hmgz('1').a(1) && arrayList0.size() < hmgz4.b()) {
                    arrayList0.add(Integer.valueOf(v2));
                }
            }
            for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                hmgz0.m(((Integer)arrayList0.get(v3)).intValue(), hmgz4.a(v3));
            }
        label_20:
            long v4 = (long)(((double)Long.parseLong(hmgz3.i())) % Math.pow(10.0, v1));
            int v5 = String.valueOf(v4).length();
            hmgz hmgz6 = v5 >= v1 ? hmgz.e(String.valueOf(v4).getBytes()) : hmgz.e(String.format(("%0" + (v1 - v5) + "d%s"), ((int)0), String.valueOf(v4)).getBytes());
            try {
                hmgz7 = hmgo.d(hmcy0.b, hmgz0.b());
            }
            catch(hmdl unused_ex) {
                hmbb0.a("Could not copy CVC3 Track data into DS", new Object[0]);
                goto label_40;
            }
            ArrayList arrayList1 = new ArrayList();
            int v6 = hmgz7.b();
            while(true) {
                --v6;
                if(v6 < 0) {
                    break;
                }
                if(hmgz7.a(v6) == new hmgz('1').a(1) && arrayList1.size() < hmgz6.b()) {
                    arrayList1.add(Integer.valueOf(v6));
                }
            }
            for(int v7 = 0; v7 < arrayList1.size(); ++v7) {
                int v8 = hmgz6.a(v7);
                hmgz0.m(((Integer)arrayList1.get(arrayList1.size() - 1 - v7)).intValue(), ((byte)v8));
            }
        label_40:
            int v9 = Byte.parseByte(hmcy0.c.i(), 16);
            if(v9 != 0) {
                hmgz hmgz8 = hmgo.b(hmgz2, v9);
                try {
                    hmgz hmgz9 = hmgo.d(hmcy0.b, hmgz0.b());
                }
                catch(hmdl unused_ex) {
                    hmbb0.a("Could not copy ATC Track data into DS", new Object[0]);
                    goto label_59;
                }
                ArrayList arrayList2 = new ArrayList();
                for(int v10 = 0; v10 < hmgz9.b(); ++v10) {
                    if(hmgz9.a(v10) == new hmgz('1').a(1) && arrayList2.size() < hmgz8.b()) {
                        arrayList2.add(Integer.valueOf(v10));
                    }
                }
                for(int v11 = 0; v11 < arrayList2.size(); ++v11) {
                    hmgz0.m(((Integer)arrayList2.get(v11)).intValue(), hmgz8.a(v11));
                }
            }
        label_59:
            int v12 = hmcy0.b.b() - 1;
            if((hmcy0.b.a(v12) & 1) == 0 && (hmcy0.a.a(v12) & 1) == 0) {
                hmgz0.m(hmgz0.b() - 1, hmgz.e(String.valueOf((z ? (v1 + 5) % 10 : v1)).getBytes()).a(0));
            }
            return hmgz0;
        }
        return new hmgz(0);
    }

    private static final hmgz b(hmgz hmgz0, int v) {
        String s;
        for(s = Long.valueOf(hmgz0.i(), 16).toString(); s.length() < v; s = "0" + s) {
        }
        return hmgz.e(s.substring(s.length() - v).getBytes());
    }

    private static final int c(hmgz hmgz0) {
        int v1 = 0;
        for(int v = 0; v < hmgz0.b(); ++v) {
            int v2 = hmgz0.a(v);
            for(int v3 = 7; v3 >= 0; --v3) {
                if(hmgw.i(((byte)v2), v3)) {
                    ++v1;
                }
            }
        }
        return v1;
    }

    private static final hmgz d(hmgz hmgz0, int v) {
        hmgz hmgz1 = hmgz.e(hmgz0.h().replaceAll(" ", "").getBytes());
        return hmgz1.c(hmgz1.b() - v, hmgz1.b());
    }
}

