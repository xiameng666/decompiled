import android.util.ArrayMap;
import android.uwb.UwbAddress;
import j..util.Objects;
import j..util.OptionalInt;
import java.util.Arrays;
import java.util.Map;

public final class kbq {
    public static final int a;
    private static final Map b;

    static {
        ArrayMap arrayMap0 = new ArrayMap();
        kbq.b = arrayMap0;
        arrayMap0.put(Integer.valueOf(1), new kbh());
        arrayMap0.put(Integer.valueOf(2), new kbi());
        arrayMap0.put(Integer.valueOf(3), new kbj());
        arrayMap0.put(Integer.valueOf(4), new kbk());
        arrayMap0.put(Integer.valueOf(5), new kbl());
        arrayMap0.put(Integer.valueOf(6), new kbm());
        arrayMap0.put(Integer.valueOf(7), new kbn());
        arrayMap0.put(Integer.valueOf(1001), new kbo());
        arrayMap0.put(Integer.valueOf(1000), new kbp());
        arrayMap0.put(Integer.valueOf(1002), new kbd());
        arrayMap0.put(Integer.valueOf(1003), new kbe());
        arrayMap0.put(Integer.valueOf(1004), new kbf());
        arrayMap0.put(Integer.valueOf(1005), new kbg());
    }

    public static hjlh a(int v, int v1, kda[] arr_kda, int[] arr_v, byte[] arr_b, kde kde0) {
        boolean z = false;
        UwbAddress[] arr_uwbAddress = (UwbAddress[])kbr.c(arr_kda, kde0.d).toArray(new UwbAddress[0]);
        int v2 = ((kdc)kbq.b.get(Integer.valueOf(v))).e();
        gftb.checkTrue(arr_uwbAddress != null && arr_uwbAddress.length > 0);
        for(int v3 = 0; v3 < arr_uwbAddress.length; ++v3) {
            UwbAddress uwbAddress0 = arr_uwbAddress[v3];
            Objects.requireNonNull(uwbAddress0);
            gftb.checkTrue(uwbAddress0.size() == 2);
        }
        if(v2 != 2) {
            arr_v = null;
        }
        if(arr_v == null || arr_uwbAddress.length == 1) {
            z = true;
        }
        if(v2 != 2) {
            arr_b = null;
        }
        gftb.checkTrue(z);
        return new hjlh(v1, arr_uwbAddress, arr_v, arr_b);
    }

    public static hjlk b(int v, kda kda0, kcw kcw0, kde kde0) {
        int v3;
        int v1;
        Integer integer0 = (int)kcw0.a;
        kcy kcy0 = (kcy)kcz.a.get(integer0);
        kdc kdc0 = (kdc)kbq.b.get(integer0);
        Integer integer1 = (int)0;
        if(v == 0) {
            kdc0.f();
            v1 = 0;
        }
        else {
            kdc0.f();
            v1 = 1;
        }
        if(kdc0.b() == 1001) {
            v1 = 8;
        }
        hjlj hjlj0 = new hjlj();
        hjle hjle0 = hjlj0.a;
        hjle0.b(hjlz.e);
        hjlj0.e = kdc0.d();
        int v2 = kdc0.c();
        hjle hjle1 = hjlj0.f;
        hjle1.b(Integer.valueOf(v2));
        hjle hjle2 = hjlj0.c;
        hjle2.b(Integer.valueOf(v));
        hjle hjle3 = hjlj0.d;
        hjle3.b(Integer.valueOf(v1));
        hjle hjle4 = hjlj0.b;
        hjle4.b(Integer.valueOf(kcw0.b));
        boolean z = kde0.d;
        hjlj0.g = kbr.b(kda0, z);
        hjlj0.B = kcw0.k ? 0 : kdc0.a();
        hjlj0.q = kcw0.f.a;
        hjlj0.r = kcw0.f.b;
        hjlj0.i = (int)(((double)kcw0.j) * 499.2 * 1000.0 / 416.0);
        hjlj0.j = kcy0.d;
        OptionalInt optionalInt0 = kde0.f < 0 ? OptionalInt.empty() : OptionalInt.of(kde0.f);
        switch(kcw0.h) {
            case 1: {
                v3 = kcy0.a;
                break;
            }
            case 2: {
                v3 = kcy0.c;
                break;
            }
            case 3: {
                v3 = kcy0.b;
                break;
            }
            default: {
                throw new IllegalArgumentException("Argument updateRate is invalid.");
            }
        }
        hjlj0.k = optionalInt0.orElse(v3);
        hjlj0.C = kcz.a(kcw0.i.a);
        hjlj0.D = kcw0.i.b;
        hjlj0.E = kcw0.i.c;
        hjlj0.p = 3;
        hjlj0.w = kdc0.e();
        hjlj0.F = 10000L;
        hjlj0.H = kcw0.l.a;
        hjlj0.m = kcw0.l.b;
        if(kdc0.e() == 0) {
            byte[] arr_b = Arrays.copyOfRange(kcw0.d, 2, 8);
            hjlj0.y = z ? kbr.f(Arrays.copyOf(kcw0.d, 2)) : Arrays.copyOf(kcw0.d, 2);
            hjlj0.z = arr_b;
        }
        else {
            switch(kdc0.e()) {
                case 3: {
                    hjlj0.u = kcw0.d;
                    hjlj0.A = true;
                    break;
                }
                case 4: {
                    hjlj0.u = kcw0.d;
                    hjlj0.x.b(Integer.valueOf(kcw0.c));
                    hjlj0.v = kcw0.e;
                }
            }
        }
        if(kcy0.e) {
            hjlj0.l = 1;
        }
        if(v1 == 8) {
            hjlj0.s = 1;
            hjlj0.n = 60;
        }
        else {
            hjlj0.h = kbr.c(((kda[])kcw0.g.toArray(new kda[0])), z);
        }
        switch(kdc0.b()) {
            case 1003: 
            case 1005: {
                hjlj0.t = 1;
            }
        }
        switch(kdc0.b()) {
            case 1002: 
            case 1003: 
            case 1004: 
            case 1005: {
                hjlj0.o = false;
                hjlj0.G = 0;
            }
        }
        gftb.checkTrue(hjlj0.g != null && hjlj0.g.size() == 2);
        if(hjlj0.a()) {
            gftb.check(hjlj0.h);
            for(Object object0: hjlj0.h) {
                UwbAddress uwbAddress0 = (UwbAddress)object0;
                gftb.checkTrue(uwbAddress0 != null && uwbAddress0.size() == 2);
            }
        }
        byte[] arr_b1 = hjlj0.g.toBytes();
        byte[] arr_b2 = hjlz.c;
        gftb.checkTrue(((boolean)(Arrays.equals(arr_b1, arr_b2) ^ 1)));
        if(hjlj0.a()) {
            for(Object object1: hjlj0.h) {
                gftb.checkTrue(((boolean)(Arrays.equals(((UwbAddress)object1).toBytes(), arr_b2) ^ 1)));
            }
        }
        if(hjlj0.w == 0) {
            gftb.checkTrue(hjlj0.y != null && hjlj0.y.length == 2);
            gftb.checkTrue(hjlj0.z != null && hjlj0.z.length == 6);
        }
        if(hjlj0.w != 2) {
            hjle hjle5 = hjlj0.x;
            if(!hjle5.a) {
                hjle5.b(integer1);
            }
        }
        if(hjlj0.w == 3) {
            gftb.checkTrue(hjlj0.u != null && (hjlj0.u.length == 16 || hjlj0.u.length == 0x20));
        }
        if(hjlj0.w == 4) {
            gftb.checkTrue(hjlj0.u != null && (hjlj0.u.length == 16 || hjlj0.u.length == 0x20));
            if(((int)(((Integer)hjle2.a()))) == 0) {
                hjle hjle6 = hjlj0.x;
                if(!hjle6.a) {
                    hjle6.b(integer1);
                }
                gftb.checkTrue(hjlj0.v != null && (hjlj0.v.length == 16 || hjlj0.v.length == 0x20));
            }
        }
        gftb.checkTrue(true);
        gftb.checkTrue(true);
        gftb.checkTrue(true);
        int v4 = hjlj0.C;
        if(v4 == 0) {
            gftb.checkTrue(hjlj0.D == 0);
            gftb.checkTrue(hjlj0.E == 20000);
            gftb.checkTrue(true);
            gftb.checkTrue(true);
            gftb.checkTrue(true);
            gftb.checkTrue(true);
        }
        else {
            switch(v4) {
                case 3: {
                    gftb.checkTrue(hjlj0.D == 0);
                    gftb.checkTrue(hjlj0.E == 20000);
                    gftb.checkTrue(false);
                    break;
                }
                case 4: {
                    gftb.checkTrue(hjlj0.D != 0 || hjlj0.E != 20000);
                    break;
                }
                case 2: 
                case 5: {
                    gftb.checkTrue(hjlj0.D != 0 || hjlj0.E != 20000);
                    gftb.checkTrue(true);
                    gftb.checkTrue(true);
                    gftb.checkTrue(true);
                    gftb.checkTrue(true);
                }
            }
        }
        if(((int)(((Integer)hjle3.a()))) == 8) {
            gftb.checkTrue(hjlj0.w == 0 && ((int)(((Integer)hjle1.a()))) == 1 && hjlj0.s == 1);
        }
        return new hjlk(((hjld)hjle0.a()), ((int)(((Integer)hjle4.a()))), ((int)(((Integer)hjle2.a()))), ((int)(((Integer)hjle3.a()))), hjlj0.e, ((int)(((Integer)hjle1.a()))), hjlj0.g, hjlj0.h, hjlj0.i, hjlj0.j, hjlj0.k, hjlj0.l, hjlj0.m, hjlj0.n, hjlj0.o, hjlj0.p, hjlj0.q, hjlj0.r, hjlj0.s, hjlj0.t, hjlj0.u, hjlj0.v, hjlj0.w, ((int)(((Integer)hjlj0.x.a()))), hjlj0.y, hjlj0.z, hjlj0.A, hjlj0.B, hjlj0.C, hjlj0.D, hjlj0.E, ((long)hjlj0.F), hjlj0.G, hjlj0.H);
    }

    public static hjmb c(int v, int v1, kda[] arr_kda, int[] arr_v, byte[] arr_b, kde kde0) {
        Integer integer0 = v1;
        UwbAddress[] arr_uwbAddress = (UwbAddress[])kbr.c(arr_kda, kde0.d).toArray(new UwbAddress[0]);
        int v2 = ((kdc)kbq.b.get(Integer.valueOf(v))).e();
        int[] arr_v1 = v2 == 2 ? arr_v : null;
        return v2 == 2 ? hjma.a(integer0, arr_uwbAddress, arr_v1, arr_b, null, null, null, null) : hjma.a(integer0, arr_uwbAddress, arr_v1, null, null, null, null, null);
    }

    public static boolean d(int v) {
        return ((kdc)kbq.b.get(Integer.valueOf(v))).c() == 0;
    }
}

