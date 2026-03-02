import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class hmni {
    public final List a;
    public hmnk b;

    public hmni() {
        this.a = new LinkedList();
    }

    public final byte a() {
        return this.b.g;
    }

    public final int b() {
        return this.b.a;
    }

    public final int c() {
        return this.b.g & 15;
    }

    public final hmnz d(int v, boolean z) {
        hmpy.V(v);
        for(Object object0: this.a) {
            hmnz hmnz0 = (hmnz)object0;
            if(hmnz0.d() == v) {
                return hmnz0;
            }
        }
        if(!z) {
            return null;
        }
        throw new hmnj(0xF0);
    }

    public final void e(byte[] arr_b, byte[] arr_b1) {
        int v = arr_b[0];
        hmoj hmoj0 = hmni.m(this.a);
        if(hmoj0 != null && ((v & 0xFF) == 12 || (v & 0xFF) == 28 || (v & 0xFF) == 108 || (v & 0xFF) == 220)) {
            byte[] arr_b2 = hmpy.F(new byte[][]{new byte[]{arr_b[0]}, new byte[]{arr_b[1]}, arr_b1});
            hmog hmog0 = hmoj0.d;
            byte[] arr_b3 = hmpy.F(new byte[][]{arr_b2, new byte[hmog0.e(arr_b2)]});
            byte[] arr_b4 = hmog0.l;
            if(arr_b4 != null) {
                arr_b3 = hmpy.F(new byte[][]{arr_b4, arr_b3});
            }
            hmog0.l = arr_b3;
        }
    }

    public final void f(byte[] arr_b, byte[] arr_b1, hmnz hmnz0) {
        hmoj hmoj0 = hmni.m(this.a);
        if(hmoj0 != null) {
            byte b = arr_b[0];
            byte b1 = arr_b[1];
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, 2, 5);
            byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, 8);
            if(hmpy.y(arr_b3) == 0) {
                int v = hmpy.y(hmpy.L(arr_b2));
                switch(hmnz0.g()) {
                    case 3: 
                    case 4: {
                        arr_b3 = hmpy.J(((hmoa)hmnz0).o() - v, 3);
                        break;
                    }
                    default: {
                        arr_b3 = hmpy.J(arr_b1.length - v, 3);
                    }
                }
            }
            byte[] arr_b4 = hmpy.F(new byte[][]{new byte[]{b}, new byte[]{b1}, arr_b2, arr_b3});
            hmoj0.d.f(arr_b1, arr_b4);
        }
    }

    public final void g(byte[] arr_b, byte[] arr_b1, hmnz hmnz0) {
        hmoj hmoj0 = hmni.m(this.a);
        if(hmoj0 != null) {
            byte b = arr_b[0];
            byte b1 = arr_b[1];
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, 2, 5);
            byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, 8);
            byte[] arr_b4 = Arrays.copyOfRange(arr_b, 8, 11);
            if(hmpy.y(arr_b4) == 0) {
                arr_b4 = hmpy.J(((hmoa)hmnz0).o() - hmpy.y(hmpy.L(arr_b3)), 3);
            }
            byte[] arr_b5 = hmpy.F(new byte[][]{new byte[]{b}, new byte[]{b1}, arr_b2, arr_b3, arr_b4});
            hmoj0.d.f(arr_b1, arr_b5);
        }
    }

    public final boolean h() {
        return (this.b.f & 2) != 0;
    }

    public final byte[] i() {
        return this.b.h() == null ? null : ((byte[])this.b.h().clone());
    }

    public final hmnr j(int v, hmno hmno0) {
        if(v < this.c()) {
            return hmno0.e(hmnr.b(this.b.a, v));
        }
        throw new hmnj(0x40);
    }

    public final hmnz k(int v) {
        for(Object object0: this.a) {
            hmnz hmnz0 = (hmnz)object0;
            if(hmnz0.e() == v) {
                return hmpy.R(this.a(), 5) ? hmnz0 : null;
            }
        }
        return null;
    }

    public final hmnz l(int v) {
        for(Object object0: this.a) {
            hmnz hmnz0 = (hmnz)object0;
            if((hmnz0.e() & 0x1F) == v) {
                return hmnz0;
            }
        }
        throw new hmnj(0x6A82);
    }

    public static final hmoj m(List list0) {
        for(Object object0: list0) {
            hmnz hmnz0 = (hmnz)object0;
            if(hmnz0.g() == 5) {
                return (hmoj)hmnz0;
            }
        }
        return null;
    }

    public final void n(boolean z, hmno hmno0) {
        for(Object object0: this.a) {
            ((hmnz)object0).m(z, hmno0);
        }
    }
}

