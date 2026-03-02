import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class estr {
    public static byte a;
    protected static final Map b;
    byte c;
    esur d;
    esur e;
    public esta f;
    public static int g;
    public essp h;
    private byte[] i;

    static {
        estr.b = new estg();
    }

    public estr() {
        this.i = new byte[0];
    }

    public estr(essp essp0) {
        this.h = essp0;
        this.i = new byte[0];
    }

    final boolean A(estn estn0) {
        byte[] arr_b = this.d.c("DF15");
        if(arr_b.length != 0) {
            Map map0 = esuh.g;
            if(map0.containsKey(estn0)) {
                idoy idoy0 = (idoy)map0.get(estn0);
                return idoy0 == null ? false : 1 == (arr_b[((byte)(((Byte)idoy0.a)))] >> ((byte)(((Byte)idoy0.b))) & 1);
            }
        }
        return false;
    }

    public final boolean B(esto esto0) {
        return ByteBuffer.wrap(this.h.s).get(estb.w.X) == -91 && esto0.compareTo(esto.b) == 0;
    }

    public final boolean C(estq estq0) {
        byte[] arr_b = this.d.c("9F35");
        StringBuilder stringBuilder0 = new StringBuilder();
        if(estq0 == estq.i) {
            stringBuilder0.append(((String)esuh.c.get(estq.d)));
            stringBuilder0.append(((String)esuh.c.get(estq.h)));
        }
        else if(estq0 == estq.j) {
            stringBuilder0.append(((String)esuh.c.get(estq.b)));
            stringBuilder0.append(((String)esuh.c.get(estq.f)));
        }
        else if(estq0 == estq.k) {
            stringBuilder0.append(((String)esuh.c.get(estq.c)));
            stringBuilder0.append(((String)esuh.c.get(estq.g)));
        }
        else {
            stringBuilder0.append(((String)esuh.c.get(estq0)));
        }
        int v = 0;
        while(v < stringBuilder0.length() - 1) {
            String s = stringBuilder0.substring(v, v + 2);
            if(!essz.a(arr_b).equals(s)) {
                v += 2;
                continue;
            }
            return true;
        }
        return false;
    }

    final boolean D(estp estp0, int v) {
        return esuh.d.containsKey(estp0) && ((int)(((Integer)esuh.d.get(estp0)))) == v;
    }

    final boolean E() {
        int v = Integer.parseInt(esuq.e(this.d.c("9C")));
        for(Object object0: esuh.d.entrySet()) {
            if(v == ((int)(((Integer)((Map.Entry)object0).getValue())))) {
                return true;
            }
        }
        return false;
    }

    public static byte[] F() {
        return new byte[]{-1, -1};
    }

    public final byte[] G(este este0) {
        byte[] arr_b = new byte[0];
        Map map0 = esuh.b;
        if(map0.containsKey(este0)) {
            idoy idoy0 = (idoy)map0.get(este0);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.Y());
                byteBuffer0.position(((Integer)idoy0.a).intValue());
                arr_b = new byte[((int)(((Integer)idoy0.b)))];
                byteBuffer0.get(arr_b, 0, ((Integer)idoy0.b).intValue());
            }
        }
        return arr_b;
    }

    public final byte[] H(estf estf0) {
        byte[] arr_b = new byte[0];
        Map map0 = esuh.a;
        if(map0.containsKey(estf0)) {
            idoy idoy0 = (idoy)map0.get(estf0);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.Z());
                byteBuffer0.position(((Integer)idoy0.a).intValue());
                arr_b = new byte[((int)(((Integer)idoy0.b)))];
                byteBuffer0.get(arr_b, 0, ((Integer)idoy0.b).intValue());
            }
        }
        return arr_b;
    }

    public final byte[] I(String s) {
        byte[] arr_b = new byte[0];
        HashMap hashMap0 = esuh.i;
        if(hashMap0.containsKey(s)) {
            idoy idoy0 = (idoy)hashMap0.get(s);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.aa());
                byteBuffer0.position(((Integer)idoy0.a).intValue());
                arr_b = new byte[((int)(((Integer)idoy0.b)))];
                byteBuffer0.get(arr_b, 0, ((Integer)idoy0.b).intValue());
            }
        }
        return arr_b;
    }

    public final esta J(int v) {
        return estr.g == v ? esta.i : esta.a;
    }

    public final int K() {
        switch(ByteBuffer.wrap(this.h.s).get(estb.d.X)) {
            case 0: {
                return 3;
            }
            case 40: {
                return 1;
            }
            case 80: {
                return 2;
            }
            default: {
                return 5;
            }
        }
    }

    public final int L(byte[] arr_b, int v, byte[] arr_b1, int v1, int v2) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        byteBuffer0.position(v);
        byte[] arr_b2 = new byte[v2];
        byteBuffer0.get(arr_b2);
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b1);
        byteBuffer1.position(v1);
        byte[] arr_b3 = new byte[v2];
        byteBuffer1.get(arr_b3);
        if(!Arrays.equals(estr.P(arr_b2), arr_b3)) {
            this.f = esta.n;
            return 6;
        }
        return 2;
    }

    public final void M(int v) {
        int v1;
        switch(v - 1) {
            case 0: {
                v1 = 40;
                break;
            }
            case 1: {
                v1 = 80;
                break;
            }
            case 2: {
                v1 = 0;
                break;
            }
            default: {
                v1 = 55;
            }
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
        byteBuffer0.put(estb.z.X, ((byte)v1));
        byteBuffer0.put(estb.d.X, ((byte)v1));
        essp essp0 = this.h;
        essp0.s = byteBuffer0.array();
    }

    public static void N(int v) {
        int v1 = 3;
        if(v - 1 != 2) {
            switch(v - 1) {
                case 3: {
                    v1 = 4;
                    break;
                }
                case 4: {
                    v1 = 5;
                    break;
                }
                default: {
                    v1 = 6;
                }
            }
        }
        estr.g = v1;
    }

    public final boolean O(int v) {
        int v1 = 6;
        switch(v - 1) {
            case 0: {
                return estr.t(this.c, v1);
            }
            case 1: {
                v1 = 7;
                return estr.t(this.c, v1);
            }
            case 2: {
                return !estr.t(this.c, ((byte)7)) && !estr.t(this.c, ((byte)6));
            }
            default: {
                return estr.t(this.c, ((byte)4));
            }
        }
    }

    public static final byte[] P(byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b1[v] = (byte)(arr_b[v] ^ 0xFF);
        }
        return arr_b1;
    }

    public final void Q() {
        byte[] arr_b = esul.c();
        this.i = arr_b;
        byte[] arr_b1 = (byte[])arr_b.clone();
    }

    final boolean R() {
        this.h.M.c("9F02");
        byte[] arr_b = this.h.M.c("9F02");
        return Arrays.equals(new byte[6], arr_b);
    }

    public final byte[] S(estm estm0, byte[] arr_b) {
        byte[] arr_b1 = new byte[2];
        Map map0 = esuh.h;
        if(map0.containsKey(estm0)) {
            idoy idoy0 = (idoy)map0.get(estm0);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
                byteBuffer0.position(((Byte)idoy0.a).byteValue());
                byteBuffer0.get(arr_b1, 0, 2);
                arr_b1[((byte)(((Byte)idoy0.a)))] = (byte)(((byte)(1 << ((byte)(((Byte)idoy0.b))))) | arr_b1[((byte)(((Byte)idoy0.a)))]);
                byteBuffer0.position(((Byte)idoy0.a).byteValue());
                byteBuffer0.put(arr_b1, 0, 2);
            }
        }
        return arr_b1;
    }

    public final ByteBuffer a(BigInteger bigInteger0) {
        String s = esuq.c(bigInteger0.toString(10));
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(6);
        byte[] arr_b = essz.b(s);
        return byteBuffer0.put(ests.a, 0, 6 - s.length() / 2).put(arr_b);
    }

    public final void b() {
        byte[] arr_b = Arrays.copyOfRange(this.h.Y(), 1, 3);
        byte[] arr_b1 = Arrays.copyOfRange(this.h.Y(), 0, this.h.Y().length);
        if(this.h.d() != null) {
            LinkedHashMap linkedHashMap0 = this.h.d();
            linkedHashMap0.put(essz.a(arr_b), arr_b1);
            this.h.D(linkedHashMap0);
            return;
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        linkedHashMap1.put(essz.a(arr_b), arr_b1);
        this.h.D(linkedHashMap1);
    }

    public final void c(byte[] arr_b) {
        byte[] arr_b1 = Arrays.copyOfRange(this.h.Y(), 1, 3);
        if(this.h.f() != null) {
            Map map0 = this.h.f();
            map0.put(essz.a(arr_b1), essz.a(arr_b));
            this.h.C(map0);
            return;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put(essz.a(arr_b1), essz.a(arr_b));
        this.h.C(linkedHashMap0);
    }

    final void d(esti esti0) {
        Map map0 = esuh.j;
        if(map0.containsKey(esti0)) {
            idoy idoy0 = (idoy)map0.get(esti0);
            if(idoy0 != null) {
                byte[] arr_b = new byte[10];
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
                byteBuffer0.position(estb.E.X);
                byteBuffer0.get(arr_b, 0, 10);
                arr_b[((byte)(((Byte)idoy0.a)))] = (byte)(~(1 << ((byte)(((Byte)idoy0.b)))) & arr_b[((byte)(((Byte)idoy0.a)))]);
                byteBuffer0.position(estb.E.X);
                byteBuffer0.put(arr_b, 0, 10);
                essp essp0 = this.h;
                essp0.s = byteBuffer0.array();
            }
        }
    }

    final void e(estk estk0) {
        Map map0 = esuh.e;
        if(map0.containsKey(estk0)) {
            idoy idoy0 = (idoy)map0.get(estk0);
            byte[] arr_b = new byte[8];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
            int v = estb.n.X;
            byteBuffer0.position(v);
            byteBuffer0.get(arr_b, 0, 8);
            if(idoy0 != null) {
                arr_b[((byte)(((Byte)idoy0.a)))] = (byte)(~(1 << ((byte)(((Byte)idoy0.b)))) & arr_b[((byte)(((Byte)idoy0.a)))]);
                byteBuffer0.position(v);
                byteBuffer0.put(arr_b, 0, 8);
                essp essp0 = this.h;
                essp0.s = byteBuffer0.array();
            }
        }
        else {
            if(estk0 == estk.V) {
                this.d(esti.z);
                return;
            }
            if(estk0 == estk.W) {
                this.d(esti.A);
            }
        }
    }

    final void f() {
        Map map0 = esuh.f;
        estl estl0 = estl.d;
        if(map0.containsKey(estl0)) {
            Byte byte0 = (Byte)map0.get(estl0);
            byte[] arr_b = new byte[2];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
            int v = estb.c.X;
            byteBuffer0.position(v);
            byteBuffer0.get(arr_b, 0, 2);
            if(byte0 != null) {
                arr_b[0] = (byte)(~(1 << ((byte)byte0)) & arr_b[0]);
                byteBuffer0.position(v);
                byteBuffer0.put(arr_b, 0, 2);
                essp essp0 = this.h;
                essp0.s = byteBuffer0.array();
                this.m(arr_b, this.h.t, 2);
            }
        }
    }

    public static void g() {
        estr.a = 90;
    }

    public final void h() {
        Arrays.fill(ByteBuffer.wrap(this.h.aa()).array(), 0);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
        Arrays.fill(byteBuffer0.array(), estb.m.X, byteBuffer0.limit(), 0);
        estr.a = 90;
    }

    protected final void i(byte[] arr_b) {
        if(!this.h.f().isEmpty()) {
            Map map0 = this.h.f();
            ((LinkedHashMap)map0).remove(essz.a(arr_b));
            this.h.C(map0);
        }
    }

    protected final void j(byte[] arr_b) {
        if(!this.h.d().isEmpty()) {
            LinkedHashMap linkedHashMap0 = this.h.d();
            linkedHashMap0.remove(essz.a(arr_b));
            this.h.D(linkedHashMap0);
        }
    }

    public final void k(esti esti0) {
        Map map0 = esuh.j;
        if(map0.containsKey(esti0)) {
            idoy idoy0 = (idoy)map0.get(esti0);
            byte[] arr_b = new byte[10];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
            int v = estb.E.X;
            byteBuffer0.position(v);
            byteBuffer0.get(arr_b, 0, 10);
            if(idoy0 != null) {
                arr_b[((byte)(((Byte)idoy0.a)))] = (byte)(((byte)(1 << ((byte)(((Byte)idoy0.b))))) | arr_b[((byte)(((Byte)idoy0.a)))]);
                byteBuffer0.position(v);
                byteBuffer0.put(arr_b, 0, 10);
                essp essp0 = this.h;
                essp0.s = byteBuffer0.array();
            }
        }
    }

    public final void l(estk estk0) {
        Map map0 = esuh.e;
        if(map0.containsKey(estk0)) {
            idoy idoy0 = (idoy)map0.get(estk0);
            byte[] arr_b = new byte[8];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
            int v = estb.n.X;
            byteBuffer0.position(v);
            byteBuffer0.get(arr_b, 0, 8);
            if(idoy0 != null) {
                arr_b[((byte)(((Byte)idoy0.a)))] = (byte)(((byte)(1 << ((byte)(((Byte)idoy0.b))))) | arr_b[((byte)(((Byte)idoy0.a)))]);
                byteBuffer0.position(v);
                byteBuffer0.put(arr_b, 0, 8);
                essp essp0 = this.h;
                essp0.s = byteBuffer0.array();
            }
        }
    }

    public final void m(byte[] arr_b, byte[] arr_b1, int v) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1);
        byteBuffer0.position(v);
        byteBuffer0.put(estr.P(arr_b));
    }

    final void n(estl estl0) {
        Map map0 = esuh.f;
        if(map0.containsKey(estl0)) {
            Byte byte0 = (Byte)map0.get(estl0);
            byte[] arr_b = new byte[2];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
            int v = estb.c.X;
            byteBuffer0.position(v);
            byteBuffer0.get(arr_b, 0, 2);
            if(byte0 != null) {
                arr_b[0] = (byte)(((byte)(1 << ((byte)byte0))) | arr_b[0]);
                byteBuffer0.position(v);
                byteBuffer0.put(arr_b, 0, 2);
                essp essp0 = this.h;
                essp0.s = byteBuffer0.array();
                this.m(arr_b, this.h.t, 2);
            }
        }
    }

    public final void o(byte[] arr_b) {
        System.arraycopy(this.i, 0, arr_b, 0, arr_b.length);
    }

    public final void p(este este0, byte[] arr_b) {
        Map map0 = esuh.b;
        if(map0.containsKey(este0)) {
            idoy idoy0 = (idoy)map0.get(este0);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.Y());
                byteBuffer0.position(((Integer)idoy0.a).intValue());
                byteBuffer0.put(arr_b, 0, ((Integer)idoy0.b).intValue());
                this.h.A(byteBuffer0.array());
            }
        }
    }

    public final void q(estf estf0, byte[] arr_b) {
        Map map0 = esuh.a;
        if(map0.containsKey(estf0)) {
            idoy idoy0 = (idoy)map0.get(estf0);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.Z());
                byteBuffer0.position(((Integer)idoy0.a).intValue());
                byteBuffer0.put(arr_b, 0, ((Integer)idoy0.b).intValue());
                this.h.B(byteBuffer0.array());
            }
        }
    }

    final void r(String s, byte[] arr_b) {
        HashMap hashMap0 = esuh.i;
        if(hashMap0.containsKey(s)) {
            idoy idoy0 = (idoy)hashMap0.get(s);
            if(idoy0 != null) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.aa());
                byteBuffer0.position(((Integer)idoy0.a).intValue());
                Integer integer0 = (Integer)idoy0.b;
                if(arr_b.length == ((int)integer0)) {
                    byteBuffer0.put(arr_b, 0, integer0.intValue());
                    this.h.E(byteBuffer0.array());
                }
            }
        }
    }

    public final boolean s(esth esth0) {
        Map map0 = estr.b;
        if(map0.containsKey(esth0)) {
            idoy idoy0 = (idoy)map0.get(esth0);
            byte[] arr_b = this.h.K();
            return (arr_b[((byte)(((Byte)idoy0.a)))] >> ((byte)(((Byte)idoy0.b))) & 1) == 1;
        }
        return false;
    }

    public static boolean t(byte b, int v) {
        return (b >> v & 1) == 1;
    }

    final boolean u(estj estj0, byte[] arr_b) {
        Map map0 = esuh.k;
        if(map0.containsKey(estj0)) {
            idoy idoy0 = (idoy)map0.get(estj0);
            return idoy0 == null ? false : 1 == (arr_b[((byte)(((Byte)idoy0.a)))] >> ((byte)(((Byte)idoy0.b))) & 1);
        }
        return false;
    }

    final boolean v(estp estp0) {
        return this.D(estp0, Integer.parseInt(essz.a(this.d.c("9C"))));
    }

    public final boolean w(estk estk0) {
        Map map0 = esuh.e;
        if(map0.containsKey(estk0)) {
            idoy idoy0 = (idoy)map0.get(estk0);
            byte[] arr_b = new byte[8];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.h.s);
            byteBuffer0.position(estb.n.X);
            byteBuffer0.get(arr_b, 0, 8);
            return idoy0 == null ? false : 1 == (arr_b[((byte)(((Byte)idoy0.a)))] >> ((byte)(((Byte)idoy0.b))) & 1);
        }
        return false;
    }

    final boolean x(estl estl0) {
        Map map0 = esuh.f;
        if(map0.containsKey(estl0)) {
            Byte byte0 = (Byte)map0.get(estl0);
            return byte0 == null ? false : 1 == (ByteBuffer.wrap(this.h.s).get(estb.c.X) >> ((byte)byte0) & 1);
        }
        return false;
    }

    /*
    String Decryptor: 4 succeeded, 3 failed
    - Failure: y(v3<estr>)<boolean> @ Lestr;->A(Lestn;)Z+0h
    - Failure: y(v2<estr>)<boolean> @ Lestr;->E()Z+0h
    - Failure: y(v2<estr>)<boolean> @ Lestr;->v(Lestp;)Z+0h
    */
    public final boolean y() {
        return estr.a == -91;
    }

    public final boolean z(estm estm0, byte[] arr_b) {
        Map map0 = esuh.h;
        if(map0.containsKey(estm0)) {
            idoy idoy0 = (idoy)map0.get(estm0);
            return idoy0 == null ? false : 1 == (arr_b[((byte)(((Byte)idoy0.a)))] >> ((byte)(((Byte)idoy0.b))) & 1);
        }
        return false;
    }
}

