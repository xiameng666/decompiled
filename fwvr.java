import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;

public final class fwvr {
    public static fvvj a(long v, long v1, fwwt fwwt0, fwvy[] arr_fwvy, fvvg[] arr_fvvg, boolean z, int v2, int v3, fvwz fvwz0) {
        fvvj fvvj0;
        long v8;
        HashSet hashSet1;
        int v7;
        int v4 = 0;
        if(fwwt0.a(v, arr_fwvy)) {
            HashSet hashSet0 = ggog.i(arr_fwvy.length);
            long v6 = 0x7FFFFFFFFFFFFFFFL;
            for(int v5 = 0; v5 < arr_fwvy.length; ++v5) {
                fwvy fwvy0 = arr_fwvy[v5];
                if(fwvy0 != null) {
                    v6 = Math.min(fwvy0.a, v6);
                }
            }
            if(v6 == 0x7FFFFFFFFFFFFFFFL) {
                v6 = v;
            }
            ArrayList arrayList0 = new ArrayList(arr_fwvy.length);
            while(v4 < arr_fwvy.length) {
                fwvy fwvy1 = arr_fwvy[v4];
                if(fwvy1 == null) {
                    v7 = v4;
                    hashSet1 = hashSet0;
                    v8 = v6;
                }
                else {
                    long v9 = fwvy1.b;
                    v7 = v4;
                    if(fwvr.c(fwvy1.c, v9, fwvy1.d)) {
                        long v10 = fwvy1.a;
                        long v11 = v - v10;
                        if(v11 <= 30000L && v11 <= v - v1 && v11 >= -30000L && hashSet0.add(Long.valueOf(v9))) {
                            hashSet1 = hashSet0;
                            v8 = v6;
                            arrayList0.add(fwvr.d(fwvy1, v9, v10, arr_fvvg));
                        }
                        else {
                            hashSet1 = hashSet0;
                            v8 = v6;
                        }
                    }
                    else {
                        hashSet1 = hashSet0;
                        v8 = v6;
                    }
                }
                v6 = v8;
                v4 = v7 + 1;
                hashSet0 = hashSet1;
            }
            fvvj0 = fwvr.e(v6, arrayList0, arr_fvvg, v3);
        }
        else {
            ArrayList arrayList1 = new ArrayList(arr_fwvy.length);
            HashSet hashSet2 = ggog.i(arr_fwvy.length);
            for(int v12 = 0; v12 < arr_fwvy.length; ++v12) {
                fwvy fwvy2 = arr_fwvy[v12];
                if(fwvy2 != null) {
                    long v13 = fwvy2.b;
                    if(fwvr.c(fwvy2.c, v13, fwvy2.d) && hashSet2.add(Long.valueOf(v13))) {
                        arrayList1.add(fwvr.d(fwvy2, v13, v, arr_fvvg));
                    }
                }
            }
            fvvj0 = fwvr.e(v, arrayList1, arr_fvvg, v3);
        }
        int v14 = fvvj0.d();
        fwso.l(fvwz0, fvvj0, arr_fwvy.length - v14, v2, z);
        return fvvj0;
    }

    public static List b(List list0) {
        if(!list0.isEmpty()) {
            BitSet bitSet0 = new BitSet(list0.size());
            gwps gwps0 = gwps.l(list0.size()).a();
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ScanResult scanResult0 = (ScanResult)list0.get(v1);
                if(scanResult0 != null && scanResult0.BSSID != null) {
                    long v2 = gxtu.d(scanResult0.BSSID);
                    if(v2 == -1L || !fwvr.c(scanResult0.SSID, v2, scanResult0.capabilities)) {
                        bitSet0.set(v1);
                    }
                    else if(!gwps0.h(v2)) {
                        bitSet0.set(v1);
                    }
                }
                else {
                    bitSet0.set(v1);
                }
            }
            int v3 = bitSet0.cardinality();
            if(v3 != 0) {
                List list1 = new ArrayList(list0.size() - v3);
                for(int v = 0; v < list0.size(); ++v) {
                    if(!bitSet0.get(v)) {
                        list1.add(((ScanResult)list0.get(v)));
                    }
                }
                return list1;
            }
        }
        return list0;
    }

    public static boolean c(String s, long v, String s1) {
        return s == null || !fpwe.a(v, s) ? v != -1L && v != 0xFFFFFFFFFFFFL && (s1 == null || !s1.contains("[IBSS]")) : false;
    }

    private static fvve d(fwvy fwvy0, long v, long v1, fvvg[] arr_fvvg) {
        String s = fwvy0.c == null ? "" : fwvy0.c.intern();
        if(fwvy0.e) {
            if(arr_fvvg != null) {
                int v3 = 0;
                int v4 = 0;
                int v5 = 0;
                int v6 = 0;
                for(int v2 = 0; v2 < arr_fvvg.length; ++v2) {
                    fvvg fvvg0 = arr_fvvg[v2];
                    if(fvvg0 != null && v == fvvg0.a) {
                        v3 = fvvg0.d;
                        v6 = (short)fvvg0.f;
                        v5 = (short)fvvg0.g;
                        v4 = (short)fvvg0.e;
                    }
                }
                return new fvuz(v, fwvy0.g, s, ((short)fwvy0.f), v1, fwvy0.i, fwvy0.j, v3, ((short)v4), ((short)v5), ((short)v6));
            }
            return new fvuz(v, fwvy0.g, s, ((short)fwvy0.f), v1, fwvy0.i, fwvy0.j, 0, 0, 0, 0);
        }
        return new fvve(v, fwvy0.g, s, ((short)fwvy0.f), v1, fwvy0.i, fwvy0.j);
    }

    private static fvvj e(long v, List list0, fvvg[] arr_fvvg, int v1) {
        int[] arr_v;
        fvvb fvvb0 = new fvvb(v, list0.size());
        fvvb0.c(v1);
        for(Object object0: list0) {
            fvve fvve0 = (fvve)object0;
            int v4 = 0;
            for(int v3 = 0; true; ++v3) {
                arr_v = fvve0.k;
                if(v3 >= arr_v.length) {
                    break;
                }
                if(arr_v[v3] != -1) {
                    ++v4;
                }
            }
            byte[] arr_b = new byte[v4];
            for(int v2 = 0; v2 < v4; ++v2) {
                arr_b[v2] = (byte)arr_v[v2];
            }
            if((fvve0 instanceof fvuz)) {
                fvvb0.b(((fvuz)fvve0).f, ((fvuz)fvve0).h, ((byte)((fvuz)fvve0).a()), ((int)((fvuz)fvve0).i), ((fvuz)fvve0).l, 0, ((fvuz)fvve0).a, ((fvuz)fvve0).b, ((fvuz)fvve0).c, ((fvuz)fvve0).d, ((fvuz)fvve0).j, arr_b);
            }
            else {
                fvvb0.b(fvve0.f, fvve0.h, ((byte)fvve0.a()), ((int)fvve0.i), fvve0.l, 0, -1, -1, 0, -1, fvve0.j, arr_b);
            }
        }
        return fvvb0.a(arr_fvvg);
    }
}

