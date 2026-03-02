import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class hmnx implements hmnd {
    public final hmnf a;
    final Random b;
    protected hmor c;
    protected final hmos d;
    protected hmnt e;
    protected final byte[] f;
    protected final byte[] g;
    protected byte[] h;
    protected final hmno i;
    public boolean j;
    Map k;
    public boolean l;
    public JSONObject m;
    public int n;
    public hmmi o;
    private final hmpv p;
    private final byte[] q;
    private final hmnv r;
    private final hmnw s;
    private final hmnu t;
    private hmmo u;

    static {
    }

    public hmnx(hmno hmno0, hmnf hmnf0, hmmi hmmi0, hmpv hmpv0, int v, hmmo hmmo0) {
        this.b = new SecureRandom();
        this.n = 5;
        this.e = new hmnt(this);
        this.f = new byte[0];
        this.g = new byte[]{0};
        this.j = false;
        this.k = new HashMap();
        this.q = new byte[]{4, (byte)0xA1, 0, -14, 0, 26, 5, 4, (byte)0xA1, 6, 2, 0, 26, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 23};
        this.r = new hmnv(this);
        this.s = new hmnw(this);
        this.t = new hmnu(this);
        this.l = false;
        this.i = hmno0;
        this.a = hmnf0;
        this.o = hmmi0;
        this.p = hmpv0;
        this.n = v;
        this.u = hmmo0;
        ((hmnl)hmno0).a = this.k;
        this.d = new hmos();
    }

    public hmnx(hmno hmno0, hmnf hmnf0, hmpv hmpv0) {
        this.b = new SecureRandom();
        this.n = 5;
        this.e = new hmnt(this);
        this.f = new byte[0];
        this.g = new byte[]{0};
        this.j = false;
        this.k = new HashMap();
        this.q = new byte[]{4, (byte)0xA1, 0, -14, 0, 26, 5, 4, (byte)0xA1, 6, 2, 0, 26, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 23};
        this.r = new hmnv(this);
        this.s = new hmnw(this);
        this.t = new hmnu(this);
        this.l = false;
        this.i = hmno0;
        this.a = hmnf0;
        this.p = hmpv0;
        ((hmnl)hmno0).a = this.k;
        this.d = new hmos();
    }

    public hmnx(hmno hmno0, hmnf hmnf0, hmpv hmpv0, hmmo hmmo0) {
        this.b = new SecureRandom();
        this.n = 5;
        this.e = new hmnt(this);
        this.f = new byte[0];
        this.g = new byte[]{0};
        this.j = false;
        this.k = new HashMap();
        this.q = new byte[]{4, (byte)0xA1, 0, -14, 0, 26, 5, 4, (byte)0xA1, 6, 2, 0, 26, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 23};
        this.r = new hmnv(this);
        this.s = new hmnw(this);
        this.t = new hmnu(this);
        this.l = false;
        this.i = hmno0;
        this.a = hmnf0;
        this.p = hmpv0;
        this.u = hmmo0;
        ((hmnl)hmno0).a = this.k;
        this.d = new hmos();
    }

    protected final byte[] A() {
        if(this.e.m()) {
            int v = this.h.length;
            hmnx.Z(v == 6 || v == 10 || v == 14 || v == 18 || v == 26, 0x7E);
        }
        else {
            hmnx.Z(this.h.length == 6 || this.h.length == 10 || this.h.length == 14 || this.h.length == 18, 0x7E);
        }
        hmni hmni0 = this.d.a(true);
        hmnz hmnz0 = hmni0.d(this.d(1, 1), true);
        hmnx.Z(hmnz0 instanceof hmol, 0x9D);
        hmnx.Z(this.q(hmnz0, 14, false, true), 0xAE);
        if(!this.e.i()) {
            hmnx.Z(this.h.length == 6, 0x7E);
        }
        int v1 = this.ao(hmnz0, 14, false);
        this.aA(v1);
        this.ar(v1, this.h, 2, 4);
        this.ax(hmni0, hmnz0, hmnx.am(hmnz0, 14));
        hmok hmok0 = new hmok(this.h, null);
        if(hmok0.e()) {
            throw new hmnj(0x9E);
        }
        ((hmol)hmnz0).e.b(hmok0);
        hmok hmok1 = ((hmol)hmnz0).e;
        hmoh hmoh0 = ((hmol)hmnz0).d;
        if(hmok1.d(hmoh0.j) || hmoh0.k.d(((hmol)hmnz0).e)) {
            throw new hmnj(190);
        }
        if(!((hmol)hmnz0).g) {
            ((hmol)hmnz0).n();
        }
        ((hmol)hmnz0).h = false;
        ((hmol)hmnz0).f.a(hmok0);
        ((hmol)hmnz0).b = true;
        ((hmol)hmnz0).g = true;
        return this.P();
    }

    protected final byte[] B() {
        hmnt hmnt0 = this.e;
        Queue queue0 = this.t.a;
        this.aw(this.r() && this.h[0] != -81, 9, 1);
        hmos hmos0 = this.d;
        if(hmos0.e == 0) {
            hmni hmni0 = hmos0.a(false);
            byte[] arr_b = this.f;
            hmnx.Z(hmni0 == null, 0x9D);
            hmnx.Z(this.c.c() || hmnt0.c, 0xAE);
            for(Object object0: this.c.a) {
                arr_b = hmnx.X(new byte[][]{arr_b, hmpy.T(3, ((hmni)object0).b())});
            }
            int v = arr_b.length;
            byte[] arr_b1 = this.an(arr_b);
            byte[] arr_b2 = Arrays.copyOfRange(arr_b1, 1, arr_b1.length);
            queue0.clear();
            if(arr_b2.length <= 58) {
                queue0.add(arr_b2);
            }
            else {
                while(v >= 57) {
                    byte[] arr_b3 = Arrays.copyOfRange(arr_b2, 0, 57);
                    arr_b2 = Arrays.copyOfRange(arr_b2, 57, arr_b2.length);
                    queue0.add(arr_b3);
                    v += -57;
                }
                if(arr_b2.length <= 58) {
                    queue0.add(arr_b2);
                }
                else {
                    queue0.add(Arrays.copyOfRange(arr_b2, 0, v));
                    queue0.add(Arrays.copyOfRange(arr_b2, v, arr_b2.length));
                }
            }
        }
        if(queue0.isEmpty()) {
            return hmnx.V(0, this.f);
        }
        byte[] arr_b4 = (byte[])queue0.remove();
        return queue0.isEmpty() ? hmnx.V(0, arr_b4) : hmnx.as(arr_b4);
    }

    protected final byte[] C() {
        hmnt hmnt0 = this.e;
        Queue queue0 = this.t.a;
        boolean z = true;
        this.aw(this.r() && this.h[0] != -81, 9, 1);
        hmos hmos0 = this.d;
        hmnx.Z(hmos0.a(false) == null, 0x9D);
        if(!this.c.c() && !hmnt0.c) {
            z = false;
        }
        hmnx.Z(z, 0xAE);
        if(hmos0.e == 0) {
            queue0.clear();
            byte[] arr_b = this.f;
            byte[] arr_b1 = null;
            for(Object object0: this.c.a) {
                hmni hmni0 = (hmni)object0;
                if(hmni0.i() != null) {
                    byte[] arr_b2 = (byte[])hmni0.b.d.clone();
                    if(arr_b1 != null) {
                        queue0.add(arr_b1);
                    }
                    arr_b = hmnx.X(new byte[][]{arr_b, arr_b2});
                    arr_b1 = arr_b2;
                }
            }
            if(this.e.c && !this.e.k()) {
                byte[] arr_b3 = this.an(arr_b);
                byte[] arr_b4 = Arrays.copyOfRange(arr_b3, arr_b3.length - 8, arr_b3.length);
                if(arr_b1 == null) {
                    arr_b1 = new byte[0];
                }
                arr_b1 = hmnx.X(new byte[][]{arr_b1, arr_b4});
            }
            if(arr_b1 != null) {
                queue0.add(arr_b1);
            }
        }
        if(queue0.isEmpty()) {
            return this.P();
        }
        byte[] arr_b5 = (byte[])queue0.remove();
        return queue0.isEmpty() ? hmnx.V(0, arr_b5) : hmnx.as(arr_b5);
    }

    protected final byte[] D() {
        boolean z = true;
        this.aw(this.r(), 9, 1);
        hmni hmni0 = this.d.a(true);
        if(!hmni0.h() && !this.e.h()) {
            z = false;
        }
        byte[] arr_b = this.f;
        hmnx.Z(z, 0xAE);
        for(Object object0: hmni0.a) {
            arr_b = hmnx.W(arr_b, ((hmnz)object0).d());
        }
        return this.an(arr_b);
    }

    protected final byte[] E() {
        this.aw(this.r(), 10, 2);
        hmni hmni0 = this.d.a(false);
        if(hmni0 != null) {
            hmnt hmnt0 = this.e;
            hmnz hmnz0 = hmni0.d(this.d(1, 1), false);
            hmnx.Z(hmni0.h() || hmnt0.h(), 0xAE);
            hmnx.Z(hmnz0 != null, 0xF0);
            int v = hmnz0.g();
            byte[] arr_b = hmnx.W(this.f, v);
            int v1 = hmnz0.c();
            byte[] arr_b1 = hmnx.W(arr_b, hmnz0.c());
            if(hmnz0.l() == 1 && hmnz0.c.e) {
                v1 |= 2;
                arr_b1[1] = hmpy.J(v1, 1)[0];
            }
            byte[] arr_b2 = hmnx.X(new byte[][]{arr_b1, hmpy.T(2, hmnz0.b())});
            if((hmnz0 instanceof hmny)) {
                return this.an(hmnx.X(new byte[][]{arr_b2, hmpy.T(3, ((hmny)hmnz0).f())}));
            }
            if((hmnz0 instanceof hmoa)) {
                return this.an(hmnx.X(new byte[][]{hmnx.X(new byte[][]{hmnx.X(new byte[][]{arr_b2, hmpy.T(3, ((hmoa)hmnz0).p())}), hmpy.T(3, ((hmoa)hmnz0).n())}), hmpy.T(3, ((hmoa)hmnz0).o())}));
            }
            if((hmnz0 instanceof hmoj)) {
                arr_b2 = hmnx.W(hmnx.W(arr_b2, 2), ((int)this.i.e(hmnr.b(hmni0.b(), 15)).a));
                hmog hmog0 = ((hmoj)hmnz0).d;
                if(hmog0.m != 0xFFFFFFFFL) {
                    arr_b2[1] = hmpy.J(v1 | 0x20, 1)[0];
                    return this.an(hmnx.X(new byte[][]{arr_b2, hmpy.L(hmpy.K(hmog0.m))}));
                }
            }
            else if((hmnz0 instanceof hmol)) {
                arr_b2 = hmnx.W(hmnx.X(new byte[][]{hmnx.X(new byte[][]{hmnx.X(new byte[][]{arr_b2, ((hmol)hmnz0).d.j.f()}), ((hmol)hmnz0).d.k.f()}), ((hmol)hmnz0).d.m.f()}), 0);
                if(((hmol)hmnz0).p()) {
                    arr_b2[arr_b2.length - 1] = (byte)(arr_b2[arr_b2.length - 1] | 1);
                }
                if(((hmol)hmnz0).o()) {
                    arr_b2[arr_b2.length - 1] = (byte)(arr_b2[arr_b2.length - 1] | 2);
                }
            }
            return this.an(arr_b2);
        }
        hmpy.V(this.d(1, 1));
        throw new hmnj(0x9D);
    }

    protected final byte[] F() {
        this.aw(this.r() && this.h[0] != -81, 9, 1);
        hmni hmni0 = this.d.a(true);
        hmnx.Z((hmni0.b.g & 0x20) != 0, 0xF0);
        Queue queue0 = this.t.a;
        byte[] arr_b = this.f;
        hmnx.Z(hmni0.h() || this.e.h(), 0xAE);
        if(this.d.e == 0) {
            queue0.clear();
            byte[] arr_b1 = arr_b;
            for(Object object0: hmni0.a) {
                hmnz hmnz0 = (hmnz)object0;
                switch(hmnz0.g()) {
                    case 2: 
                    case 5: {
                        continue;
                    }
                    default: {
                        arr_b1 = hmnx.X(new byte[][]{arr_b1, hmpy.T(2, hmnz0.e())});
                    }
                }
            }
            byte[] arr_b2 = this.an(arr_b1);
            byte[] arr_b3 = Arrays.copyOfRange(arr_b2, 1, arr_b2.length);
            if(arr_b3.length > 60) {
                queue0.add(Arrays.copyOfRange(arr_b3, 0, 60));
                queue0.add(Arrays.copyOfRange(arr_b3, 60, arr_b3.length));
            }
            else if(arr_b3.length > 0) {
                queue0.add(arr_b3);
            }
        }
        if(queue0.isEmpty()) {
            return hmnx.V(0, arr_b);
        }
        byte[] arr_b4 = (byte[])queue0.remove();
        return queue0.isEmpty() ? hmnx.V(0, arr_b4) : hmnx.as(arr_b4);
    }

    protected final byte[] G() {
        byte[] arr_b = new byte[2];
        this.aw(this.r(), 9, 1);
        hmni hmni0 = this.d.a(false);
        hmnt hmnt0 = this.e;
        if(hmni0 != null) {
            hmnx.Z(hmni0.h() || hmnt0.h(), 0xAE);
            arr_b[0] = hmni0.b.f;
            arr_b[1] = (byte)(hmni0.a() & -33);
            return this.an(arr_b);
        }
        hmnx.Z(this.c.c() || hmnt0.c, 0xAE);
        arr_b[0] = this.c.b.d;
        arr_b[1] = 1;
        int v = hmor.f(this.i).d;
        if(v == 3) {
            arr_b[1] = (byte)(arr_b[1] | 0x40);
            return this.an(arr_b);
        }
        if(v == 1) {
            arr_b[1] = (byte)(arr_b[1] | 0x80);
        }
        return this.an(arr_b);
    }

    protected final byte[] H() {
        int v = 2;
        if(!this.e.m()) {
            hmnx.Z(this.h.length == 2, 0x7E);
        }
        hmni hmni0 = this.d.a(false);
        int v1 = this.d(1, 1);
        this.h();
        if((v1 & 0x40) != 0) {
            v = 3;
        }
        hmnx.Z(this.h.length == v, 0x7E);
        hmnx.Z(v1 <= 0x7F, (hmni0 == null ? 0x9E : 0x9D));
        hmnx.Z(v1 <= 0x3F, 0x9D);
        if(hmni0 != null) {
            return this.an(new byte[]{hmni0.j(v1, this.i).a});
        }
        if(v1 != 0) {
            throw v1 == 16 || v1 == 17 || v1 == 18 || (v1 == 0x20 || v1 == 33 || v1 == 34 || v1 == 35) ? new hmnj(0x9D) : new hmnj(0x40);
        }
        return this.an(new byte[]{hmor.f(this.i).a});
    }

    protected final byte[] I() {
        hmnx.Z(this.e.l() || this.e.m(), 0xAE);
        if(this.e.m() || this.e.l()) {
            hmnx.Z(this.h.length >= 9, 0x7E);
        }
        this.ar(2, this.h, this.h.length - 8, 0);
        this.h = Arrays.copyOfRange(this.h, 0, this.h.length - 8);
        int v = this.u.b.a();
        this.d.n = v ^ 1;
        return 1 == v ? hmnx.V(0, this.aq(3, new byte[]{-91}, false)) : hmnx.V(0, this.aq(3, new byte[]{90}, false));
    }

    protected final byte[] J() {
        hmos hmos0 = this.d;
        hmni hmni0 = hmos0.a(false);
        int v = 4;
        hmnx.Z(this.h.length >= 4, 0x6700);
        hmnx.Z(this.d(1, 1) == 0, (hmos0.b == null ? 27013 : 27270));
        int v1 = this.d(2, 1);
        hmnx.Z(v1 >> 3 != 0x1F, 27270);
        hmnz hmnz0 = v1 >> 3 == 0 ? hmos0.b : hmni0.l(v1 >> 3);
        hmnw hmnw0 = this.s;
        hmnw0.e = hmnz0;
        hmnx.Z((v1 & 7) == 0, 27270);
        hmnx.Z(hmnw0.e instanceof hmoa, 27013);
        hmnx.Z(this.h.length >= 5, 0x6700);
        int v2 = this.d(3, 1);
        hmnw0.d = v2;
        int v3 = this.h.length;
        if(v3 > 6 && v2 == 0) {
            int v4 = this.d(4, 1) << 8 | this.d(5, 1);
            hmnw0.d = v4;
            hmnx.Z(v4 + 6 == this.h.length, 0x6700);
            v = 6;
        }
        else {
            hmnx.Z(v2 + 4 == v3, 0x6700);
        }
        hmnz hmnz1 = hmnw0.e;
        hmnx.Z((hmnz1 instanceof hmoc) || ((hmoa)hmnz1).o() < ((hmoa)hmnz1).n(), 27013);
        hmnx.Z(hmnw0.d <= ((hmoa)hmnz1).p(), 27013);
        int v5 = ((hmoa)hmnz1).p();
        int v6 = ((hmoa)hmnz1).o();
        hmnx.Z(this.q(hmnw0.e, 6, false, false), 27010);
        int v7 = this.ao(hmnw0.e, 6, false);
        hmnw0.f = v7;
        hmnx.Z(v7 == 1, 27010);
        hmnw0.c = ((hmoa)hmnz1).o() * ((hmoa)hmnz1).p();
        if((hmnw0.e instanceof hmoc) && v6 == ((hmoa)hmnz1).n() - 1 && !((hmoa)hmnz1).b) {
            byte[] arr_b = hmnw0.e.k(0, hmnw0.e.f());
            byte[] arr_b1 = new byte[arr_b.length];
            if(hmnw0.e.l() == 3) {
                byte[] arr_b2 = this.i.d(arr_b, v5, hmnw0.e.f() - v5);
                this.i.a(arr_b1, arr_b2, 0);
            }
            else {
                System.arraycopy(arr_b, v5, arr_b1, 0, arr_b.length - v5);
            }
            hmnw0.e.j(0, arr_b1);
            hmnw0.c -= v5;
        }
        hmnw0.e.j(hmnw0.c, Arrays.copyOfRange(this.h, v, hmnw0.d + v));
        hmni0.n(true, this.i);
        hmos0.b = hmnw0.e;
        this.o();
        return this.g;
    }

    protected final byte[] K() {
        int v;
        boolean z = false;
        hmnx.Z(this.e.n() != null, 27013);
        hmni hmni0 = this.d.a(false);
        if(hmni0 == null) {
            v = hmor.f(this.i).d;
        }
        else {
            switch(hmni0.b.g >> 6 & 3) {
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 1;
                    break;
                }
                default: {
                    v = 2;
                }
            }
        }
        if(hmni0 == null) {
            hmnx.Z(this.d(2, 1) == 0, 27010);
            hmnt hmnt0 = this.e;
            hmnt0.j = hmor.f(this.i);
            this.e.b = 0;
        }
        else {
            int v1 = this.d(2, 1) - 0x80;
            hmnx.Z(v1 >= 0 && v1 <= 13, 27270);
            hmnx.Z(v1 < hmni0.c(), 27010);
            hmnt hmnt1 = this.e;
            hmnt1.j = hmni0.j(v1, this.i);
            this.e.b = v1;
        }
        if(this.h.length == 22 || this.h.length == 38) {
            hmnx.Z(this.d(3, 2) == 0, 0x6700);
            this.h = hmnx.X(new byte[][]{Arrays.copyOfRange(this.h, 0, 3), Arrays.copyOfRange(this.h, 5, this.h.length)});
        }
        hmnx.Z(this.d(3, 1) + 4 == this.h.length, 0x6700);
        int v2 = 16;
        switch(this.d(1, 1)) {
            case 0: {
                break;
            }
            case 2: {
                hmnx.Z(v == 2, 27010);
                if(this.d(3, 1) == 16) {
                    z = true;
                }
                hmnx.Z(z, 0x6A87);
                break;
            }
            case 4: {
                hmnx.Z(v == 3, 27010);
                if(this.d(3, 1) == 0x20) {
                    z = true;
                }
                hmnx.Z(z, 0x6A87);
                break;
            }
            case 9: {
                hmnx.Z(v == 1, 27010);
                if(this.d(3, 1) == 0x20) {
                    z = true;
                }
                hmnx.Z(z, 0x6A87);
                break;
            }
            default: {
                throw new hmnj(27270);
            }
        }
        if(v == 2) {
            v2 = 8;
        }
        this.e.e();
        this.at(this.e.j.c());
        this.at(this.e.f);
        int v3 = v2 + v2 + 4;
        this.at(Arrays.copyOfRange(this.h, 4, v3));
        byte[] arr_b = this.S(this.e.j, this.e.f, Arrays.copyOfRange(this.h, 4, v2 + 4));
        byte[] arr_b1 = this.S(this.e.j, this.e.f, Arrays.copyOfRange(this.h, v2 + 4, v3));
        this.at(arr_b);
        this.at(arr_b1);
        hmnx.Z(Arrays.equals(arr_b1, this.e.n()), 27010);
        this.at(this.e.n());
        this.e.g(arr_b);
        return this.P();
    }

    protected final byte[] L() {
        int v5;
        boolean z2;
        boolean z1;
        boolean z = true;
        int v = 4;
        switch(this.d(1, 1)) {
            case 0: 
            case 2: 
            case 4: 
            case 9: {
                z1 = true;
                break;
            }
            default: {
                z1 = false;
            }
        }
        hmnx.Z(z1, 27270);
        int v1 = hmpy.z(this.d(2, 1));
        int v2 = hmpy.A(this.d(2, 1));
        if(v1 == 0 && v2 == 0) {
            z2 = true;
        }
        else if(v1 != 8 || v2 > 13) {
            z2 = false;
        }
        else {
            z2 = true;
        }
        hmnx.Z(z2, 27270);
        hmos hmos0 = this.d;
        if(hmos0.a(false) == null) {
            hmnx.Z(this.d(2, 1) == 0, 27270);
        }
        else {
            hmnx.Z(this.d(2, 1) - 0x80 == this.e.b, 27270);
        }
        if(this.h.length == 16 || this.h.length == 24) {
            hmnx.Z(this.d(3, 2) == 0, 0x6700);
            hmnx.Z(this.d(this.h.length - 2, 1) == 0, 0x6C00);
            byte[] arr_b = hmnx.X(new byte[][]{Arrays.copyOfRange(this.h, 0, 3), Arrays.copyOfRange(this.h, 5, this.h.length - 1)});
            arr_b[arr_b.length - 1] = this.h[this.h.length - 1];
            this.h = arr_b;
        }
        int v3 = (byte)this.e.n().length;
        int v4 = this.h.length;
        switch(v4 - v3) {
            case 5: {
                v5 = v3 + v3;
                int v6 = this.d(v4 - 1, 1);
                hmnx.Z(this.d(3, 1) + 5 == this.h.length, 0x6700);
                hmnx.Z(v6 == v5 || v6 == 0, 0x6C00);
                break;
            }
            case 8: {
                v5 = v3 + v3;
                int v7 = this.f(v4 - 2);
                hmnx.Z(this.d(3, 1) == 0, 0x6700);
                hmnx.Z(v7 == v5 || v7 == 0, 0x6C00);
                break;
            }
            default: {
                hmnx.Z(this.d(3, 1) + 5 == this.h.length, 0x6700);
                if(this.h.length != 13 && this.h.length != 21) {
                    z = false;
                }
                hmnx.Z(z, 0x6700);
                throw this.h.length != 13 || v3 != 16 ? new hmnj(27010) : new hmnj(0x6C00);
            }
        }
        int v8 = this.d(1, 1);
        switch(v8) {
            case 0: {
                break;
            }
            case 2: {
                hmnx.Z(this.e.j.d == 2, 27010);
                break;
            }
            case 4: {
                hmnx.Z(this.e.j.d == 3, 27010);
                break;
            }
            default: {
                if(v8 != 9) {
                    throw new hmnj(27270);
                }
                hmnx.Z(this.e.j.d == 1, 27010);
                break;
            }
        }
        byte[] arr_b1 = Arrays.copyOf(this.e.n(), v3);
        this.at(arr_b1);
        byte[] arr_b2 = this.h;
        if(arr_b2.length != v3 + 5) {
            v = 6;
        }
        byte[] arr_b3 = Arrays.copyOfRange(arr_b2, v, v + v3);
        this.at(arr_b3);
        this.e.g(this.U(this.e.j));
        this.at(this.e.n());
        this.R(arr_b1, this.e.n(), this.e.j);
        this.at(this.e.k.c());
        byte[] arr_b4 = new byte[v5];
        System.arraycopy(this.e.n(), 0, arr_b4, 0, v3);
        System.arraycopy(arr_b3, 0, arr_b4, v3, v3);
        this.at(arr_b4);
        byte[] arr_b5 = this.T(this.e.j, this.e.f, arr_b4, false);
        this.e.e();
        hmnt hmnt0 = this.e;
        hmni hmni0 = hmos0.a(false);
        boolean z3 = hmos0.a(false) != null;
        if(hmni0 != null) {
            z = false;
        }
        hmnt0.f(z, z3);
        byte[] arr_b6 = this.an(arr_b5);
        this.e.a = 130;
        return arr_b6;
    }

    protected final byte[] M() {
        int v10;
        int v9;
        boolean z1;
        hmos hmos0 = this.d;
        boolean z = false;
        hmni hmni0 = hmos0.a(false);
        int v = 1;
        hmnx.Z(hmni0 != null, 27013);
        hmnx.Z(this.h.length == 4 || this.h.length == 6, 0x6700);
        int v1 = this.h.length == 6 ? 1 : 0;
        int v2 = 5;
        int v3 = v1 == 0 ? this.d(3, 1) : this.d(4, 1) << 8 | this.d(5, 1);
        hmnx.Z(v1 == 0 || this.d(3, 1) == 0, 0x6700);
        if(v3 == 0) {
            v3 = 1 == v1 ? 0x7FFF : 0x100;
        }
        int v4 = this.d(1, 1);
        hmnx.Z(v4 != 0xFF, 27270);
        int v5 = this.d(2, 1);
        hmnx.Z(v5 >> 3 != 0x1F, 27270);
        switch(v5 & 7) {
            case 4: {
                v2 = v5 & 7;
                z1 = true;
                break;
            }
            case 5: {
                z1 = true;
                break;
            }
            default: {
                v2 = v5 & 7;
                z1 = false;
            }
        }
        hmnx.Z(z1, 27270);
        hmnz hmnz0 = v5 >> 3 == 0 ? hmos0.b : hmni0.l(v5 >> 3);
        hmnv hmnv0 = this.r;
        hmnx.Z(hmnz0 instanceof hmoa, 27013);
        hmnx.Z(this.q(hmnz0, 10, false, false), 27010);
        int v6 = this.ao(hmnz0, 10, false);
        hmnv0.b = v6;
        hmnx.Z(v6 == 1 || v6 == 2, 27010);
        int v7 = ((hmoa)hmnz0).o();
        int v8 = ((hmoa)hmnz0).p();
        if(v7 > 0 && v4 <= v7) {
            z = true;
        }
        hmnx.Z(z, 27013);
        if(!this.e.i()) {
            v9 = 0;
        }
        else if(this.e.k() && hmnv0.b == 2) {
            v9 = 4;
        }
        else if(this.e.l()) {
            v9 = 8;
        }
        else {
            v9 = 0;
        }
        hmnx.Z(v3 > v9, 0x6C00);
        if(v4 == 0) {
            v10 = (v7 - 1) * v8;
        }
        else {
            if((hmnz0 instanceof hmod)) {
                v = v7;
            }
            if(v4 == v) {
                v10 = (v7 - 1) * v8;
            }
            else if(v2 == 4) {
                v10 = (v7 - ((hmnz0 instanceof hmod) ? v7 - v4 : v4 - 1) - 1) * v8;
            }
            else {
                int v11 = (hmnz0 instanceof hmod) ? (v4 - 1) * v8 : (v7 - v4) * v8;
                v8 = v8 * v7 - v11;
                v10 = v11;
            }
        }
        if(v1 == 0 && v3 == 0x100) {
            if(v8 + v9 > 0x100) {
                throw new hmnj(0x6C00);
            }
            v3 = 0x100;
        }
        hmnv0.a = ((hmoa)hmnz0).k(v10, Math.min(v3 - v9, v8));
        byte[] arr_b = hmnv0.a;
        if(arr_b.length > 0x100) {
            hmnv0.a = Arrays.copyOfRange(arr_b, 0, 0x100);
        }
        hmnv0.a = this.aq(hmnv0.b, hmnv0.a, false);
        hmos0.b = hmnz0;
        return hmnx.V(0, hmnv0.a);
    }

    protected final byte[] N() {
        hmni hmni3;
        boolean z2;
        int v9;
        boolean z1;
        int v5;
        int v4;
        int v3;
        boolean z;
        hmnt hmnt0 = this.e;
        hmnx.Z(this.h.length >= 3, 0x6700);
        int v = this.d(1, 1);
        int v1 = this.d(2, 1);
        switch(v1) {
            case 0: {
                z = true;
                break;
            }
            case 12: {
                z = true;
                v1 = 12;
                break;
            }
            default: {
                z = false;
            }
        }
        hmnx.Z(z, 27270);
        int v2 = 6;
        if(this.h.length >= 6 && this.d(3, 1) == 0) {
            hmnx.Z(this.f(4) != 0 || this.h.length == 6, 0x6700);
            if(this.h.length == 6) {
                v3 = this.f(4);
                v4 = 1;
                v5 = 0;
            }
            else {
                v5 = this.f(4);
                int v6 = this.h.length;
                hmnx.Z(v6 == v5 + 6 || v6 == v5 + 8, 0x6700);
                int v7 = this.h.length == v5 + 8 ? 1 : 0;
                v4 = v7;
                v3 = v7 == 0 ? 0 : this.f(6);
            }
        }
        else {
            if(this.h.length == 3) {
                v3 = 0;
                v4 = 0;
                v5 = 0;
            }
            else {
                int v8 = this.d(3, 1);
                if(v8 != 0) {
                    z1 = true;
                    v9 = v8;
                }
                else if(this.h.length == 4) {
                    z1 = true;
                    v9 = 0;
                }
                else {
                    v9 = 0;
                    z1 = false;
                }
                hmnx.Z(z1, 0x6700);
                int v10 = this.h.length;
                hmnx.Z(v10 == v9 + 4 || v10 == v9 + 5, 0x6700);
                int v11 = this.h.length == v9 + 5 ? 1 : 0;
                if(v11 == 0) {
                    v5 = v8;
                    v4 = 0;
                    v3 = 0;
                }
                else {
                    int v12 = this.d(v9 + 4, 1);
                    if(v12 == 0) {
                        v12 = 0x100;
                    }
                    v4 = v11;
                    v3 = v12;
                    v5 = v8;
                }
            }
            v2 = 4;
        }
        hmos hmos0 = this.d;
        hmni hmni0 = hmos0.a(false);
        switch(v) {
            case 0: {
                goto label_63;
            }
            case 1: {
                goto label_85;
            }
            case 2: {
                goto label_96;
            }
            case 3: {
                goto label_102;
            }
            case 4: {
                goto label_110;
            }
        }
        throw new hmnj(27270);
    label_63:
        hmnx.Z(v5 == 2 || (this.h.length == 3 || this.h.length == 4), 0x6A87);
        int v13 = this.h.length <= v2 ? 0 : this.f(v2);
        if(v13 != 0x3F00 && !Arrays.equals(this.h, new byte[]{-92, 0, 0, 0}) && !Arrays.equals(this.h, new byte[]{-92, 0, 0})) {
            if(hmni0 == null) {
                hmni hmni1 = this.c.a(v13);
                hmnx.Z(hmni1 != null, 0x6A82);
                hmnt0.f(false, false);
                hmos0.d(false, this.i);
                hmos0.a = hmni1;
                this.l(hmni1);
                hmos0.b = null;
                z2 = this.ay();
                goto label_128;
            }
            hmnz hmnz0 = hmni0.k(v13);
            hmnx.Z(hmnz0 != null, 0x6A82);
            hmos0.b = hmnz0;
        }
        else {
            hmos0.d(false, this.i);
            hmnt0.f(false, false);
            hmos0.a = null;
            hmos0.b = null;
            goto label_108;
        label_85:
            hmnx.Z(v5 == 2, 0x6A87);
            hmnx.Z(hmni0 == null, 0x6A82);
            hmni hmni2 = this.c.a(this.f(v2));
            hmnx.Z(hmni2 != null, 0x6A82);
            hmnt0.f(false, false);
            hmos0.d(false, this.i);
            hmos0.a = hmni2;
            this.l(hmni2);
            hmos0.b = null;
            z2 = this.ay();
            goto label_128;
        label_96:
            hmnx.Z(v5 == 2, 0x6A87);
            hmnx.Z(hmni0 != null, 0x6A82);
            hmnz hmnz1 = hmni0.k(this.f(v2));
            hmnx.Z(hmnz1 != null, 0x6A82);
            hmos0.b = hmnz1;
            goto label_108;
        label_102:
            hmnx.Z(v5 == 0, 0x6A87);
            hmnx.Z(hmni0 != null, 0x6A82);
            hmnt0.f(false, false);
            hmos0.d(false, this.i);
            hmos0.a = null;
            hmos0.b = null;
        }
    label_108:
        boolean z3 = false;
        goto label_129;
    label_110:
        hmnx.Z(v5 > 0 && v5 <= 16, 0x6A87);
        byte[] arr_b = Arrays.copyOfRange(this.h, v2, v5 + v2);
        if(!Arrays.equals(arr_b, new byte[]{-46, 0x76, 0, 0, (byte)0x85, 1, 0}) && !Arrays.equals(arr_b, new byte[]{-46, 0x76, 0, 0, (byte)0x85, 1, 1})) {
            for(Object object0: this.c.a) {
                hmni3 = (hmni)object0;
                if(hmni3.i() == null || !Arrays.equals(arr_b, hmni3.b.h())) {
                    continue;
                }
                goto label_120;
            }
            hmni3 = null;
        label_120:
            hmos0.d(false, this.i);
            hmos0.a = hmni3 == null ? hmos0.a(false) : hmni3;
            hmos0.b = null;
            hmos0.c(this.i);
            hmnt0.f(false, false);
            hmnx.Z(hmni3 != null, 0x6A82);
            z2 = this.ay();
            this.l(hmni3);
        label_128:
            z3 = z2;
        label_129:
            switch(v1) {
                case 0: {
                    hmni hmni4 = hmos0.a(false);
                    if(hmni4 != null && (v == 0 || (v == 1 || v == 4))) {
                        hmnz hmnz2 = hmni4.d(0x1F, false);
                        if(hmnz2 == null) {
                            return z3 ? new byte[]{(byte)0x83, 98} : this.g;
                        }
                        int v14 = hmnz2.b();
                        boolean z4 = hmpy.M(v14, 1) == 14 || hmpy.M(v14, 3) == 14;
                        if(v3 == 0 || v3 > hmnz2.f()) {
                            v3 = hmnz2.f();
                        }
                        if(((hmnz2 instanceof hmoi) || (hmnz2 instanceof hmob)) && z4 && v4 != 0) {
                            byte[] arr_b1 = hmnz2.k(0, v3);
                            return z3 ? hmnx.X(new byte[][]{new byte[]{(byte)0x83, 98}, arr_b1}) : hmnx.V(0, arr_b1);
                        }
                    }
                    return z3 ? new byte[]{(byte)0x83, 98} : this.g;
                }
                case 12: {
                    return z3 ? new byte[]{(byte)0x83, 98} : this.g;
                }
                default: {
                    throw new hmnj(27270);
                }
            }
        }
        hmos0.b();
        if(hmni0 != null) {
            hmos0.a = hmni0;
            hmos0.d(false, this.i);
            hmos0.b = null;
            hmos0.c(this.i);
            hmos0.a = null;
        }
        this.e.f(false, false);
        this.m();
        return this.P();
    }

    protected final byte[] O(byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length + 6];
        arr_b1[0] = arr_b[0];
        hmpy.Q(arr_b1, 1, 2, this.e.h);
        System.arraycopy(this.e.i, 0, arr_b1, 3, 4);
        System.arraycopy(arr_b, 1, arr_b1, 7, arr_b.length - 1);
        return this.i.i(this.e.m, arr_b1, new byte[16], 2);
    }

    protected final byte[] P() {
        return this.an(this.f);
    }

    protected final byte[] Q(byte[] arr_b, boolean z) {
        int v = arr_b.length - 1;
        byte[] arr_b1 = new byte[arr_b.length];
        if(z) {
            byte[] arr_b2 = this.i.d(arr_b, 0, v);
            this.i.a(arr_b1, arr_b2, 1);
            byte[] arr_b3 = this.i.d(arr_b, v, 1);
            this.i.a(arr_b1, arr_b3, 0);
            return arr_b1;
        }
        byte[] arr_b4 = this.i.d(arr_b, 1, v);
        this.i.a(arr_b1, arr_b4, 0);
        byte[] arr_b5 = this.i.d(arr_b, 0, 1);
        this.i.a(arr_b1, arr_b5, v);
        return arr_b1;
    }

    protected final void R(byte[] arr_b, byte[] arr_b1, hmnr hmnr0) {
        int v1;
        int v = hmnr0.d;
        switch(v - 1) {
            case 0: 
            case 1: {
                v1 = 16;
                break;
            }
            case 2: {
                v1 = 24;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        byte[] arr_b2 = new byte[v1];
        boolean z = hmnr0.b;
        switch(v - 1) {
            case 0: {
                byte[] arr_b3 = this.i.d(arr_b, 0, 4);
                this.i.a(arr_b2, arr_b3, 0);
                byte[] arr_b4 = this.i.d(arr_b1, 0, 4);
                this.i.a(arr_b2, arr_b4, 4);
                byte[] arr_b5 = this.i.d(arr_b, 12, 4);
                this.i.a(arr_b2, arr_b5, 8);
                byte[] arr_b6 = this.i.d(arr_b1, 12, 4);
                this.i.a(arr_b2, arr_b6, 12);
                break;
            }
            case 1: {
                if(z) {
                    byte[] arr_b7 = this.i.d(arr_b, 0, 4);
                    this.i.a(arr_b2, arr_b7, 0);
                    byte[] arr_b8 = this.i.d(arr_b1, 0, 4);
                    this.i.a(arr_b2, arr_b8, 4);
                    byte[] arr_b9 = this.i.d(arr_b, 0, 4);
                    this.i.a(arr_b2, arr_b9, 8);
                    byte[] arr_b10 = this.i.d(arr_b1, 0, 4);
                    this.i.a(arr_b2, arr_b10, 12);
                }
                else {
                    byte[] arr_b11 = this.i.d(arr_b, 0, 4);
                    this.i.a(arr_b2, arr_b11, 0);
                    byte[] arr_b12 = this.i.d(arr_b1, 0, 4);
                    this.i.a(arr_b2, arr_b12, 4);
                    byte[] arr_b13 = this.i.d(arr_b, 4, 4);
                    this.i.a(arr_b2, arr_b13, 8);
                    byte[] arr_b14 = this.i.d(arr_b1, 4, 4);
                    this.i.a(arr_b2, arr_b14, 12);
                }
                break;
            }
            case 2: {
                byte[] arr_b15 = this.i.d(arr_b, 0, 4);
                this.i.a(arr_b2, arr_b15, 0);
                byte[] arr_b16 = this.i.d(arr_b1, 0, 4);
                this.i.a(arr_b2, arr_b16, 4);
                byte[] arr_b17 = this.i.d(arr_b, 6, 4);
                this.i.a(arr_b2, arr_b17, 8);
                byte[] arr_b18 = this.i.d(arr_b1, 6, 4);
                this.i.a(arr_b2, arr_b18, 12);
                byte[] arr_b19 = this.i.d(arr_b, 12, 4);
                this.i.a(arr_b2, arr_b19, 16);
                byte[] arr_b20 = this.i.d(arr_b1, 12, 4);
                this.i.a(arr_b2, arr_b20, 20);
            }
        }
        this.at(arr_b2);
        hmnt hmnt0 = this.e;
        hmnt0.k = new hmnr(v, arr_b2, z);
    }

    protected final byte[] S(hmnr hmnr0, byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = new byte[arr_b1.length];
        this.i.f(hmnr0, arr_b, arr_b1, arr_b2, this.e.e);
        return arr_b2;
    }

    protected final byte[] T(hmnr hmnr0, byte[] arr_b, byte[] arr_b1, boolean z) {
        int v = hmnr0.a();
        byte[] arr_b2 = new byte[hmpy.O(arr_b1.length + ((int)z), v)];
        this.i.g(hmnr0, arr_b, arr_b1, arr_b2, ((boolean)(((int)z))));
        return arr_b2;
    }

    protected final byte[] U(hmnr hmnr0) {
        int v = hmnr0.d == 1 || hmnr0.d == 3 ? 16 : 8;
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)this.b.nextInt(0x100);
        }
        return arr_b;
    }

    protected static final byte[] V(int v, byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length + 1];
        arr_b1[0] = (byte)v;
        System.arraycopy(arr_b, 0, arr_b1, 1, arr_b.length);
        return arr_b1;
    }

    protected static final byte[] W(byte[] arr_b, int v) {
        byte[] arr_b1 = new byte[arr_b.length + 1];
        arr_b1[arr_b.length] = (byte)v;
        System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
        return arr_b1;
    }

    protected static final byte[] X(byte[][] arr2_b) {
        int v = 0;
        for(int v1 = 0; v1 < 2; ++v1) {
            v += arr2_b[v1].length;
        }
        byte[] arr_b = new byte[v];
        int v2 = 0;
        for(int v3 = 0; v3 < 2; ++v3) {
            byte[] arr_b1 = arr2_b[v3];
            System.arraycopy(arr_b1, 0, arr_b, v2, arr_b1.length);
            v2 += arr_b1.length;
        }
        return arr_b;
    }

    public final void Y(boolean z) {
        hmnh hmnh0;
        if(this.p != null) {
            try {
                hmos hmos0 = this.d;
                List list0 = hmos0.h;
                if(this.c.b() != null) {
                    if(hmos0.n) {
                        hmos0.n = false;
                        new hmnj(0xEA);
                        hmnh0 = new hmnh(8);
                    }
                    else {
                        try {
                            hmqg hmqg0 = new hmqg();
                            hmqc.a(this.c.b(), hmqg0);
                            hmnh0 = new hmnh(hmqa.a(list0, hmqg0).a);
                        }
                        catch(hmou | hmov exception0) {
                            this.a.a(exception0.getMessage(), exception0);
                            hmnh0 = new hmnh(1);
                        }
                    }
                }
                else if(list0.isEmpty()) {
                    hmnh0 = new hmnh(4);
                }
                else {
                    boolean z1 = false;
                    Iterator iterator0 = list0.iterator();
                    do {
                        if(!iterator0.hasNext()) {
                            if(z1) {
                                hmnh0 = new hmnh(4);
                                goto label_69;
                            }
                            hmos hmos1 = this.d;
                            if(hmos1 == null) {
                                hmnh0 = new hmnh(7);
                                goto label_69;
                            }
                            hmnh0 = hmos1.j || hmos1.l ? new hmnh(2) : new hmnh(7);
                            goto label_69;
                        }
                        Object object0 = iterator0.next();
                        hmqj hmqj0 = (hmqj)object0;
                        if(hmqj0.b == null) {
                            hmnh0 = new hmnh(4);
                            goto label_69;
                        }
                        int v = Integer.parseInt(hmqj0.a, 16);
                        int v1 = Integer.parseInt(hmqj0.b, 16);
                        if(v == 0xA4) {
                            if(Integer.parseInt(hmqj0.c.substring(0, 2), 16) == 4 && v1 != 0x9000) {
                                new hmnj(0xA4);
                                hmnh0 = new hmnh(3);
                                goto label_69;
                            }
                            v = 0xA4;
                        }
                        hmos hmos2 = this.d;
                        if(hmos2.n) {
                            hmos2.n = false;
                            new hmnj(v);
                            hmnh0 = new hmnh(8);
                            goto label_69;
                        }
                        if(v == 61 || v == 0x8D || (((byte)v) == 0xFFFFFF8B || ((byte)v) == -36) || (((byte)v) == 12 || ((byte)v) == 28) || ((byte)v) == 59) {
                            int v2 = Integer.parseInt(hmqj0.c.substring(0, 2), 16);
                            if(hmos2 != null) {
                                try {
                                    if(hmos2.a(true).d(v2, true).g() != 0 && hmnj.b(v1)) {
                                        z1 = true;
                                    }
                                }
                                catch(hmnj unused_ex) {
                                }
                            }
                        }
                        else if(v == 0xC7 && hmnj.b(v1)) {
                            z1 = false;
                        }
                        new hmnj(v1);
                        if(v1 == 0xAE) {
                            hmnh0 = new hmnh(6);
                            goto label_69;
                        }
                        if(v1 == 28) {
                            hmnh0 = new hmnh(5);
                            goto label_69;
                        }
                    }
                    while(hmnj.b(v1));
                    hmnh0 = new hmnh(1);
                }
            label_69:
                hmos hmos3 = this.d;
                boolean z2 = hmos3.j;
                if(this.m == null || z2) {
                    this.m = this.b(z);
                }
                hmoo hmoo0 = new hmoo(hmnh0, this.m, z2);
                this.p.f(hmoo0);
                hmos3.j = false;
                hmos3.l = false;
            }
            catch(JSONException jSONException0) {
                this.a.a(jSONException0.getMessage(), jSONException0);
            }
        }
    }

    protected static final void Z(boolean z, int v) {
        if(z) {
            return;
        }
        throw new hmnj(v);
    }

    private final int a() {
        if(this.e.i() && (!this.e.k() || this.r.b != 1)) {
            return this.e.m() || this.e.k.d != 1 ? 56 : 0x30;
        }
        return this.d.f ? 58 : 59;
    }

    private final void aA(int v) {
        int v1 = 10;
        boolean z = false;
        if(v == 1) {
            if(this.h.length == 6) {
                z = true;
            }
            hmnx.Z(z, 0x7E);
            return;
        }
        if(v == 2) {
            if(!this.e.k()) {
                v1 = 14;
            }
            if(this.h.length == v1) {
                z = true;
            }
            hmnx.Z(z, 0x7E);
            return;
        }
        hmnt hmnt0 = this.e;
        if(hmnt0.j.d == 1) {
            if(this.h.length == (hmnt0.l() ? 18 : 26)) {
                z = true;
            }
            hmnx.Z(z, 0x7E);
            return;
        }
        if(this.h.length == 10) {
            z = true;
        }
        hmnx.Z(z, 0x7E);
    }

    protected static final byte[] aa() {
        throw new hmnj(28);
    }

    protected static final byte[] ab() {
        throw new hmnj(28);
    }

    protected static final byte[] ac() {
        throw new hmnj(28);
    }

    protected static final byte[] ad() {
        throw new hmnj(28);
    }

    protected static final byte[] ae() {
        throw new hmnj(28);
    }

    protected static final byte[] af() {
        throw new hmnj(28);
    }

    protected static final byte[] ag() {
        throw new hmnj(28);
    }

    protected static final byte[] ah() {
        throw new hmnj(28);
    }

    protected static final byte[] ai() {
        throw new hmnj(28);
    }

    protected static final byte[] aj() {
        throw new hmnj(28);
    }

    protected static final byte[] ak() {
        throw new hmnj(28);
    }

    public final JSONObject al() {
        return this.b(false);
    }

    protected static final boolean am(hmnz hmnz0, int v) {
        boolean z = false;
        for(int v1 = 0; v1 < 4; ++v1) {
            if(hmpy.R(v, v1) && hmpy.M(hmnz0.b(), v1) == 14) {
                z = true;
            }
        }
        return z;
    }

    protected final byte[] an(byte[] arr_b) {
        hmnt hmnt0 = this.e;
        hmnr hmnr0 = hmnt0.k;
        if(hmnt0.i()) {
            if(hmnt0.l()) {
                byte[] arr_b1 = hmnx.W(arr_b, 0);
                return hmnx.V(0, hmnx.X(new byte[][]{arr_b, this.i.i(hmnr0, arr_b1, hmnt0.f, 3)}));
            }
            return hmnt0.m() ? hmnx.V(0, hmnx.X(new byte[][]{arr_b, this.O(hmnx.V(0, arr_b))})) : hmnx.V(0, arr_b);
        }
        return hmnx.V(0, arr_b);
    }

    protected final int ao(hmnz hmnz0, int v, boolean z) {
        if(!z && this.e.i()) {
            hmnt hmnt0 = this.e;
            boolean z1 = false;
            for(int v1 = 0; v1 < 4; ++v1) {
                if(hmpy.R(v, v1) && (hmnt0.d && hmnt0.b == hmpy.M(hmnz0.b(), v1))) {
                    z1 = true;
                }
            }
            return z1 ? hmnz0.l() : 1;
        }
        return 1;
    }

    protected final byte[] ap(int v) {
        int v1 = 1;
        if(this.r()) {
            if(v != 1) {
                v1 = 2;
            }
            return hmnx.V(0, this.aq(v1, this.f, false));
        }
        return this.P();
    }

    protected final byte[] aq(int v, byte[] arr_b, boolean z) {
        byte[] arr_b1 = (byte[])arr_b.clone();
        hmnt hmnt0 = this.e;
        if(hmnt0.k() || hmnt0.m()) {
            hmnt0.e();
        }
        if(hmnt0.i()) {
            switch(v) {
                case 1: {
                    if(hmnt0.l()) {
                        hmnr hmnr0 = hmnt0.k;
                        byte[] arr_b2 = hmnx.W(arr_b1, 0);
                        return hmnx.X(new byte[][]{arr_b1, this.i.i(hmnr0, arr_b2, hmnt0.f, 3)});
                    }
                    break;
                }
                case 2: {
                    if(hmnt0.k()) {
                        return hmnx.X(new byte[][]{arr_b1, this.i.h(hmnt0.k, arr_b1, hmnt0.f)});
                    }
                    if(hmnt0.l()) {
                        hmnr hmnr1 = hmnt0.k;
                        byte[] arr_b3 = hmnx.W(arr_b1, 0);
                        return hmnx.X(new byte[][]{arr_b1, this.i.i(hmnr1, arr_b3, hmnt0.f, 3)});
                    }
                    return hmnx.X(new byte[][]{arr_b1, this.O(hmnx.V(0, arr_b1))});
                }
                case 3: {
                    if(hmnt0.k()) {
                        byte[] arr_b4 = this.i.b(arr_b1);
                        byte[] arr_b5 = hmnx.X(new byte[][]{arr_b1, new byte[2]});
                        this.i.a(arr_b5, arr_b4, arr_b5.length - 2);
                        return this.T(hmnt0.k, hmnt0.f, arr_b5, z);
                    }
                    if(hmnt0.l()) {
                        byte[] arr_b6 = this.i.c(arr_b1, true);
                        byte[] arr_b7 = hmnx.X(new byte[][]{arr_b1, new byte[4]});
                        this.i.a(arr_b7, arr_b6, arr_b7.length - 4);
                        return this.T(hmnt0.k, hmnt0.f, arr_b7, z);
                    }
                    if(hmnt0.m()) {
                        this.k(false);
                        byte[] arr_b8 = new byte[arr_b1.length + 1 + (-(arr_b1.length + 1) & 15)];
                        this.i.g(hmnt0.l, hmnt0.f, arr_b1, arr_b8, true);
                        return hmnx.X(new byte[][]{arr_b8, this.O(hmnx.V(0, arr_b8))});
                    }
                    break;
                }
                default: {
                    return arr_b1;
                }
            }
        }
        return arr_b1;
    }

    protected final void ar(int v, byte[] arr_b, int v1, int v2) {
        byte[] arr_b1 = null;
        hmnt hmnt0 = this.e;
        boolean z = false;
        boolean z1 = true;
        if(v == 1) {
            if(hmnt0.l()) {
                hmnr hmnr0 = hmnt0.k;
                if(hmnr0 != null) {
                    this.i.i(hmnr0, arr_b, hmnt0.f, 4);
                }
            }
            int v3 = arr_b[0] == 0x5F ? this.e() : v2;
            if(arr_b.length == v3 + v1) {
                z = true;
            }
            hmnx.Z(z, 0x7E);
            if(this.r()) {
                hmnt0.d();
            }
        }
        else {
            switch(v) {
                case 2: {
                    int v4 = v1 + v2;
                    if(arr_b.length != hmnt0.b() + v4) {
                        z1 = false;
                    }
                    hmnx.Z(z1, 0x7E);
                    if(hmnt0.k() || hmnt0.m()) {
                        hmnt0.e();
                    }
                    byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, v4);
                    byte[] arr_b3 = Arrays.copyOfRange(arr_b, v1, v4);
                    if(hmnt0.k()) {
                        arr_b1 = this.i.h(hmnt0.k, arr_b3, hmnt0.f);
                    }
                    else if(hmnt0.l()) {
                        arr_b1 = this.i.i(hmnt0.k, arr_b2, hmnt0.f, 3);
                    }
                    else if(hmnt0.m()) {
                        arr_b1 = this.O(Arrays.copyOfRange(arr_b, 0, arr_b.length - 8));
                    }
                    hmnx.Z(Arrays.equals(arr_b1, Arrays.copyOfRange(arr_b, v4, hmnt0.b() + v4)), 30);
                    if(hmnt0.m()) {
                        hmnt0.d();
                        return;
                    }
                    break;
                }
                case 3: {
                    if(hmnt0.m()) {
                        int v5 = arr_b.length - 8;
                        hmnx.Z(Arrays.equals(this.O(Arrays.copyOfRange(arr_b, 0, v5)), Arrays.copyOfRange(arr_b, v5, arr_b.length)), 30);
                        if(v2 > 0) {
                            this.k(true);
                            int v6 = arr_b.length - v1 - 8;
                            hmnr hmnr1 = this.e.l;
                            byte[] arr_b4 = this.e.f;
                            byte[] arr_b5 = Arrays.copyOfRange(arr_b, v1, v5);
                            byte[] arr_b6 = new byte[v6];
                            this.i.f(hmnr1, arr_b4, arr_b5, arr_b6, false);
                            System.arraycopy(arr_b6, 0, arr_b, v1, v6);
                            boolean z2 = arr_b[0] != -60 || this.d(1, 1) == this.e.b;
                            if(arr_b[0] == 0x5F) {
                                this.g(this.e, arr_b6);
                            }
                            int v7 = arr_b[0] & 0xFF;
                            if(!hmpy.S(v7) || (v7 == 0xBA || v7 == 0xDB)) {
                                hmnx.Z(true, 30);
                            }
                        }
                        this.e.d();
                        return;
                    }
                    int v8 = hmnt0.k.a();
                    int v9 = (arr_b[0] != 0x5F || !this.c.d() ? hmpy.O(v2 + hmnt0.a(), v8) : v2) + v1;
                    hmnx.Z(arr_b.length == v9, 0x7E);
                    if(hmnt0.k()) {
                        hmnt0.e();
                    }
                    byte[] arr_b7 = Arrays.copyOfRange(arr_b, v1, v9);
                    byte[] arr_b8 = this.S(hmnt0.k, hmnt0.f, arr_b7);
                    System.arraycopy(arr_b8, 0, arr_b, v1, arr_b8.length);
                    int v10 = arr_b[0] != 0x5F || !this.c.d() ? v2 : this.g(hmnt0, arr_b8);
                    byte[] arr_b9 = Arrays.copyOfRange(arr_b, 0, v1 + v10);
                    hmno hmno0 = this.i;
                    byte[] arr_b10 = hmno0.d(arr_b8, 0, v10);
                    if(hmnt0.k()) {
                        arr_b1 = hmno0.b(arr_b10);
                    }
                    else if(hmnt0.l()) {
                        arr_b1 = hmno0.c(arr_b9, false);
                    }
                    hmnx.Z(Arrays.equals(arr_b1, hmno0.d(arr_b8, v10, hmnt0.a())), 30);
                    hmnx.Z(true, 30);
                    break;
                }
            }
        }
    }

    protected static final byte[] as(byte[] arr_b) {
        return hmnx.V(0xAF, arr_b);
    }

    protected final void at(byte[] arr_b) {
        if(this.a != null) {
            hmpy.C(arr_b);
        }
    }

    private final void au(hmoj hmoj0, boolean z) {
        byte[] arr_b = hmoj0 == null ? null : hmoj0.d.l;
        boolean z1 = true;
        if(z) {
            if(!this.az() && arr_b == null) {
                z1 = false;
            }
            hmnx.Z(z1, 12);
            return;
        }
        hmnx.Z(this.az(), 12);
    }

    private final void av(hmnw hmnw0, byte[] arr_b) {
        int v = this.e.j.a();
        hmnx.Z(v - hmnw0.d % v == arr_b.length - hmnw0.d, 0x7E);
    }

    private final void aw(boolean z, int v, int v1) {
        boolean z1 = true;
        if(z) {
            hmnx.Z(this.h.length == v, 0x7E);
            this.h();
        }
        if(this.h.length != v1) {
            z1 = false;
        }
        hmnx.Z(z1, 0x7E);
    }

    private final void ax(hmni hmni0, hmnz hmnz0, boolean z) {
        byte[] arr_b1;
        if(this.p()) {
            byte[] arr_b = this.h;
            if(hmnz0.l() == 1 || z) {
                arr_b1 = Arrays.copyOfRange(this.h, 2, this.h.length);
            }
            else if(hmnz0.l() == 2) {
                arr_b1 = Arrays.copyOfRange(this.h, 2, this.h.length - (this.e.k() ? 4 : 8));
            }
            else {
                hmnt hmnt0 = this.e;
                arr_b1 = hmnt0.j.d == 1 ? Arrays.copyOfRange(this.h, 2, this.h.length - (hmnt0.l() ? 12 : 20)) : Arrays.copyOfRange(this.h, 2, this.h.length - 4);
            }
            hmni0.e(arr_b, arr_b1);
        }
    }

    private final boolean ay() {
        List list0 = this.d.a(true).a;
        this.d.a(true);
        hmoj hmoj0 = hmni.m(list0);
        return hmoj0 != null && hmoj0.d.o >= hmoj0.d.m;
    }

    private final boolean az() {
        int v = 0;
        for(Object object0: this.d.a(true).a) {
            hmnz hmnz0 = (hmnz)object0;
            if(hmnz0.g() != 0) {
                v |= hmnz0.b;
            }
        }
        return v != 0;
    }

    private final JSONObject b(boolean z) {
        JSONObject jSONObject5;
        Iterator iterator6;
        Iterator iterator5;
        hmor hmor0 = this.c;
        if(hmor0 != null) {
            LinkedList linkedList0 = new LinkedList();
            for(Object object0: hmor0.a) {
                LinkedList linkedList1 = new LinkedList();
                for(Object object1: ((hmni)object0).a) {
                    linkedList1.add(((hmnz)object1).h());
                }
                ((hmni)object0).b.e = linkedList1;
                linkedList0.add(((hmni)object0).b.a());
            }
            hmoq hmoq0 = hmor0.b;
            hmoq0.e = linkedList0;
            hmoq hmoq1 = new hmoq();
            hmoq1.d = hmoq0.d;
            hmoq1.f = hmoq0.f;
            hmoq1.a = (byte[])hmoq0.a.clone();
            hmoq1.c = hmoq0.c;
            hmoq1.b = hmoq0.b;
            hmoq1.g = hmoq0.g;
            hmoq1.l = hmoq0.l;
            List list0 = hmoq0.j;
            if(list0.contains("isAuthVCMandatory")) {
                hmoq1.a(hmoq0.h);
            }
            if(list0.contains("isPCMandatory")) {
                hmoq1.b(hmoq0.i);
            }
            LinkedList linkedList2 = new LinkedList();
            for(Object object2: hmoq0.e) {
                linkedList2.add(((hmnk)object2).a());
            }
            hmoq1.e = linkedList2;
            hmoq1.k = hmoq0.k;
            JSONObject jSONObject0 = new JSONObject();
            JSONObject jSONObject1 = new JSONObject();
            jSONObject0.put("DESFireState", jSONObject1);
            jSONObject0.put("type", hmoq1.k);
            jSONObject0.put("version", "1.0");
            jSONObject0.put("lastModifiedDate", hmpy.C(hmpy.G()));
            int v = hmoq1.l;
            if(v != 0 && v != 5) {
                jSONObject0.put("persistenceMode", hmqh.a(v));
            }
            JSONObject jSONObject2 = hmoq1.g;
            if(jSONObject2 != null) {
                jSONObject0.put("transactionSequence", jSONObject2);
            }
            jSONObject1.put("piccKeySettings", ((int)hmoq1.d));
            jSONObject1.put("isRandomIdEnabled", hmoq1.b);
            jSONObject1.put("isFormatDisabled", hmoq1.c);
            jSONObject1.put("piccUid", hmpy.C(hmoq1.a));
            jSONObject1.put("freeBlocks", hmoq1.f);
            List list1 = hmoq1.j;
            if(list1.contains("isAuthVCMandatory")) {
                jSONObject1.put("isAuthVCMandatory", hmoq1.h);
            }
            if(list1.contains("isPCMandatory")) {
                jSONObject1.put("isPCMandatory", hmoq1.i);
            }
            JSONArray jSONArray0 = new JSONArray();
            Iterator iterator3 = hmoq1.e.iterator();
            while(iterator3.hasNext()) {
                Object object3 = iterator3.next();
                hmnk hmnk0 = (hmnk)object3;
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray1 = new JSONArray();
                Iterator iterator4 = hmnk0.e.iterator();
                while(iterator4.hasNext()) {
                    Object object4 = iterator4.next();
                    hmoe hmoe0 = (hmoe)object4;
                    JSONObject jSONObject4 = new JSONObject();
                    int v1 = hmoe0.i - 1;
                    if(hmoe0.i == 0) {
                        throw null;
                    }
                    jSONObject4.put("commModeType", v1);
                    jSONObject4.put("fileType", hmoe0.f);
                    jSONObject4.put("accessRights", hmoe0.c);
                    jSONObject4.put("fileNumber", hmoe0.b);
                    if(hmoe0.f != 5) {
                        jSONObject4.put("isoFileId", hmoe0.d);
                    }
                    jSONObject4.put("isPlainWith0x2", hmoe0.e);
                    if(hmoe0.h.contains("additionalAccessRights")) {
                        byte[][] arr2_b = hmoe0.g;
                        iterator5 = iterator3;
                        JSONArray jSONArray2 = new JSONArray();
                        iterator6 = iterator4;
                        for(int v2 = 0; v2 < arr2_b.length; ++v2) {
                            jSONArray2.put(v2, hmpy.C(arr2_b[v2]));
                        }
                        jSONObject4.put("additionalAccessRights", jSONArray2);
                    }
                    else {
                        iterator5 = iterator3;
                        iterator6 = iterator4;
                    }
                    jSONObject4.put("data", new String(hmql.b(hmoe0.a), StandardCharsets.US_ASCII));
                    switch(hmoe0.f) {
                        case 2: {
                            jSONObject5 = jSONObject3;
                            jSONObject4.put("lowerLimit", hmop.b(((hmoh)hmoe0).j));
                            jSONObject4.put("upperLimit", hmop.b(((hmoh)hmoe0).k));
                            jSONObject4.put("valueFinal", hmop.b(((hmoh)hmoe0).l));
                            hmok hmok0 = ((hmoh)hmoe0).m;
                            if(hmok0 != null) {
                                jSONObject4.put("limitedCreditFinal", hmop.b(hmok0));
                            }
                            jSONObject4.put("flags", ((hmoh)hmoe0).n);
                            break;
                        }
                        case 3: 
                        case 4: {
                            jSONObject5 = jSONObject3;
                            jSONObject4.put("recordSize", ((hmof)hmoe0).j);
                            jSONObject4.put("maxNumberOfRecords", ((hmof)hmoe0).k);
                            jSONObject4.put("numberOfRecords", ((hmof)hmoe0).l);
                            break;
                        }
                        case 5: {
                            jSONObject5 = jSONObject3;
                            jSONObject4.put("tmcLimit", ((hmog)hmoe0).m);
                            jSONObject4.put("readerId", hmpy.C(((hmog)hmoe0).n));
                            break;
                        }
                        default: {
                            jSONObject5 = jSONObject3;
                        }
                    }
                    jSONArray1.put(jSONObject4);
                    jSONObject3 = jSONObject5;
                    iterator3 = iterator5;
                    iterator4 = iterator6;
                    continue;
                }
                jSONObject3.put("files", jSONArray1);
                jSONObject3.put("applicationId", hmnk0.a);
                jSONObject3.put("applicationISOFileId", hmnk0.b);
                jSONObject3.put("keySettingsOne", ((int)hmnk0.f));
                jSONObject3.put("keySettingsTwo", ((int)hmnk0.g));
                List list2 = hmnk0.o;
                if(list2.contains("keySettingsThree")) {
                    jSONObject3.put("keySettingsThree", hmpy.D(hmnk0.i));
                }
                if(list2.contains("aksVersion")) {
                    jSONObject3.put("aksVersion", hmpy.D(hmnk0.k));
                }
                if(list2.contains("rollKey")) {
                    jSONObject3.put("rollKey", ((int)hmnk0.j));
                }
                if(list2.contains("smConfig")) {
                    jSONObject3.put("smConfig", hmpy.C(hmnk0.l));
                }
                if(list2.contains("pdCap1.2")) {
                    jSONObject3.put("pdCap1.2", hmpy.D(hmnk0.m));
                }
                if(list2.contains("pdCap2")) {
                    jSONObject3.put("pdCap2", hmpy.C(hmnk0.n));
                }
                if(hmnk0.h() != null && hmnk0.h().length > 0) {
                    jSONObject3.put("dfName", hmpy.C(hmnk0.h()));
                }
                jSONArray0.put(jSONObject3);
                iterator3 = iterator3;
            }
            jSONObject1.put("applications", jSONArray0);
            JSONObject jSONObject6 = jSONObject0.getJSONObject("DESFireState");
            Map map0 = this.k;
            JSONArray jSONArray3 = new JSONArray();
            for(Object object5: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object5;
                if(!((hmnr)map$Entry0.getValue()).c.equals(hmnr.b(0, 0xFF))) {
                    hmnr hmnr0 = (hmnr)map$Entry0.getValue();
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("type", hmnq.a(hmnr0.d));
                    jSONObject7.put("version", hmpy.D(hmnr0.a));
                    jSONObject7.put("singleDes", hmnr0.b);
                    jSONObject7.put("alias", hmnr0.c);
                    jSONArray3.put(jSONObject7);
                }
            }
            jSONObject6.put("jsonKeyMap", jSONArray3);
            if(z) {
                this.n();
            }
            return jSONObject0;
        }
        return null;
    }

    @Override  // hmnd
    public final void c(JSONObject jSONObject0) {
        hmoi hmoi0;
        try {
            this.c = new hmor();
            hmoq hmoq0 = hmop.a(jSONObject0);
            JSONArray jSONArray0 = (JSONArray)jSONObject0.getJSONObject("DESFireState").get("jsonKeyMap");
            HashMap hashMap0 = new HashMap();
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = (JSONObject)jSONArray0.get(v);
                    hashMap0.put(jSONObject1.getString("alias"), new hmnr(jSONObject1));
                }
            }
            this.k = hashMap0;
            ((hmnl)this.i).a = hashMap0;
            hmor hmor0 = this.c;
            hmoq hmoq1 = hmor0.b;
            hmoq1.d = hmoq0.d;
            hmoq1.f = hmoq0.f;
            hmoq1.a = (byte[])hmoq0.a.clone();
            hmoq1.c = hmoq0.c;
            hmoq1.b = hmoq0.b;
            hmoq1.g = hmoq0.g;
            hmoq1.l = hmoq0.l;
            hmoq1.k = hmoq0.k;
            List list0 = hmoq0.j;
            if(list0.contains("isAuthVCMandatory")) {
                hmoq1.a(hmoq0.h);
            }
            if(list0.contains("isPCMandatory")) {
                hmoq1.b(hmoq0.i);
            }
            for(Object object0: hmoq0.e) {
                hmoq1.e.add(((hmnk)object0).a());
            }
            for(Object object1: hmoq0.e) {
                hmnk hmnk0 = (hmnk)object1;
                hmni hmni0 = new hmni();
                if(hmni0.b == null) {
                    hmni0.b = new hmnk(hmnk0.a, hmnk0.f, hmnk0.g);
                }
                hmnk hmnk1 = hmni0.b;
                if(hmnk0.h() != null && hmnk0.h().length > 0) {
                    hmnk1.c = (byte[])hmnk0.h().clone();
                }
                byte[] arr_b = hmnk0.d;
                if(arr_b != null && arr_b.length > 0) {
                    hmnk1.d = (byte[])arr_b.clone();
                }
                List list1 = hmnk0.o;
                if(list1.contains("keySettingsThree")) {
                    hmnk1.c(hmnk0.i);
                }
                if(list1.contains("aksVersion")) {
                    hmnk1.b(hmnk0.k);
                }
                if(list1.contains("rollKey")) {
                    hmnk1.f(hmnk0.j);
                }
                if(list1.contains("smConfig")) {
                    hmnk1.g(hmnk0.l);
                }
                if(list1.contains("pdCap1.2")) {
                    hmnk1.d(hmnk0.m);
                }
                if(list1.contains("pdCap2")) {
                    hmnk1.e(hmnk0.n);
                }
                hmnk1.f = hmnk0.f;
                hmnk1.g = hmnk0.g;
                hmnk1.h = 0;
                hmnk1.a = hmnk0.a;
                hmnk1.b = hmnk0.b;
                for(Object object2: hmnk0.e) {
                    hmnk1.e.add(((hmoe)object2).a());
                }
                for(Object object3: hmni0.b.e) {
                    if(((hmoe)object3) == null) {
                        throw new hmou("File should not be null");
                    }
                    switch(((hmoe)object3).f) {
                        case 0: {
                            hmoi0 = new hmoi();
                            break;
                        }
                        case 1: {
                            hmoi0 = new hmob();
                            break;
                        }
                        case 2: {
                            hmoi0 = new hmol();
                            break;
                        }
                        case 3: {
                            hmoi0 = new hmod();
                            break;
                        }
                        case 4: {
                            hmoi0 = new hmoc();
                            break;
                        }
                        case 5: {
                            hmoi0 = new hmoj();
                            break;
                        }
                        default: {
                            throw new hmou("Invalid file type.");
                        }
                    }
                    hmoi0.a(((hmoe)object3));
                    hmni0.a.add(hmoi0);
                    continue;
                }
                hmor0.a.add(hmni0);
            }
            this.d.b();
            this.m();
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage(), jSONException0);
        }
    }

    protected final int d(int v, int v1) {
        hmnx.Z(v + v1 <= this.h.length, 0x7E);
        return hmpy.N(this.h, v, v1);
    }

    protected final int e() {
        if(!this.c.d()) {
            return 3;
        }
        boolean z = hmpy.E(this.h[2], ((byte)5));
        if(hmpy.E(this.h[2], ((byte)7))) {
            int v = this.d(5, 1);
            return v + v + 4;
        }
        return z ? 7 : 3;
    }

    protected final int f(int v) {
        return this.h[v + 1] & 0xFF | (this.h[v] & 0xFF) << 8;
    }

    protected final int g(hmnt hmnt0, byte[] arr_b) {
        boolean z = true;
        int v = 0;
        if(hmnt0.m()) {
            int v1 = arr_b.length - 1;
            int v2 = 0;
            while(v1 >= 0) {
                int v3 = arr_b[v1];
                if(v3 == 0) {
                    ++v2;
                    v3 = 0;
                }
                if(v3 == 0xFFFFFF80) {
                    return arr_b.length - (v2 + 1);
                }
                --v1;
            }
            return arr_b.length - v2;
        }
        int v4 = this.e();
        int v5 = hmnt0.j.a();
        int v6 = hmnt0.a() + v4;
        int v7 = (v5 - v6 % v5) % v5;
        hmnx.Z(v6 + v7 == arr_b.length, 30);
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, v6, arr_b.length);
        if(v7 != arr_b1.length) {
            z = false;
        }
        hmnx.Z(z, 30);
        while(v < arr_b1.length) {
            if(arr_b1[v] != 0) {
                throw new hmnj(30);
            }
            ++v;
            continue;
        }
        return v4;
    }

    protected final void h() {
        if(this.r()) {
            hmnx.Z(this.h.length >= 9, 0x7E);
            this.ar(2, this.h, this.h.length - 8, 0);
            this.h = Arrays.copyOfRange(this.h, 0, this.h.length - 8);
        }
    }

    public final void i(byte b, byte b1) {
        int v = 0xFFFFFF84;
        if(b1 == 0xFFFFFF84) {
            if(b == -120) {
                throw new hmnj(0x6D00);
            }
            b1 = (byte)0x84;
        }
        boolean z = false;
        if(b1 == 0xFFFFFF82) {
            if(this.d.d == 0) {
                if(b == -120) {
                    z = true;
                }
                hmnx.Z(z, (1 == ((b == 0xFFFFFF82 ? 1 : 0) | ((b == 0xFFFFFF84 ? 1 : 0) | ((b == -30 ? 1 : 0) | ((b == -78 ? 1 : 0) | ((b == -42 ? 1 : 0) | ((b == -80 ? 1 : 0) | (b == -92 ? 1 : 0))))))) ? 27013 : 202));
            }
            b1 = (byte)0x82;
        }
        if(b != 0xFFFFFF82) {
            v = b1;
        }
        else if(b1 != 0xFFFFFF84 || this.d.d != 0) {
            throw new hmnj(0x6D00);
        }
        if(b == -120 && (v != 0xFFFFFF82 || this.d.d != 0)) {
            throw new hmnj(0x6D00);
        }
    }

    public final void j() {
        if(this.d.e <= 0) {
            hmnt hmnt0 = this.e;
            if(hmnt0.k != null && hmnt0.l()) {
                this.i.i(hmnt0.k, this.h, hmnt0.f, 4);
            }
        }
    }

    protected final void k(boolean z) {
        byte[] arr_b = new byte[16];
        byte b = 90;
        arr_b[0] = z ? -91 : 90;
        if(!z) {
            b = -91;
        }
        arr_b[1] = b;
        System.arraycopy(this.e.i, 0, arr_b, 2, 4);
        byte[] arr_b1 = hmpy.T(2, this.e.h);
        arr_b[6] = arr_b1[0];
        arr_b[7] = arr_b1[1];
        this.i.g(this.e.l, new byte[16], arr_b, arr_b, false);
        System.arraycopy(arr_b, 0, this.e.f, 0, 16);
    }

    public final void l(hmni hmni0) {
        if(hmni0 != null) {
            hmno hmno0 = this.i;
            byte[] arr_b = this.c.e();
            int v = hmni0.b();
            hmoj hmoj0 = hmni.m(hmni0.a);
            if(hmoj0 != null) {
                byte[] arr_b1 = hmoj0.d.g(hmoj0.d.o + 1L);
                byte[] arr_b2 = hmpy.F(new byte[][]{hmog.k, arr_b1, arr_b});
                hmoj0.d.q = new hmnr(1, hmno0.i(hmno0.e(hmnr.b(v, 15)), arr_b2, new byte[16], 1), false);
                byte[] arr_b3 = hmoj0.d.g(hmoj0.d.o + 1L);
                byte[] arr_b4 = hmpy.F(new byte[][]{hmog.j, arr_b3, arr_b});
                hmoj0.d.r = new hmnr(1, hmno0.i(hmno0.e(hmnr.b(v, 15)), arr_b4, new byte[16], 1), false);
            }
        }
    }

    public final void m() {
        for(Object object0: this.c.a) {
            hmni hmni0 = (hmni)object0;
            if(hmni0.b() == 0xEEE000) {
                hmos hmos0 = this.d;
                hmos0.a = hmni0;
                for(Object object1: hmni0.a) {
                    hmnz hmnz0 = (hmnz)object1;
                    if(hmnz0.d() == 0) {
                        hmos0.b = hmnz0;
                    }
                }
            }
        }
    }

    public final void n() {
        this.d.b();
        this.e = new hmnt(this);
    }

    protected final void o() {
        this.d.j = true;
        this.d.k = true;
        this.d.l = true;
    }

    public final boolean p() {
        List list0 = this.d.a(true).a;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                if(((hmnz)object0).g() == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean q(hmnz hmnz0, int v, boolean z, boolean z1) {
        hmnt hmnt0 = this.e;
        boolean z2 = false;
        boolean z3 = true;
        for(int v1 = 0; v1 < 4; ++v1) {
            if(hmpy.R(v, v1)) {
                int v2 = hmpy.M(hmnz0.b(), v1);
                if(v2 == 14) {
                    z2 = true;
                    v2 = 14;
                }
                else if(hmnt0.d && hmnt0.b == v2) {
                    z2 = true;
                }
                if(v2 != 15) {
                    z3 = false;
                }
            }
        }
        if(z3) {
            throw new hmnj((z1 ? 0x9D : 27010));
        }
        return z2 || z;
    }

    protected final boolean r() {
        return this.e.i() && this.e.m();
    }

    protected final byte[] s() {
        return hmnx.as(this.f);
    }

    public final byte[] t(byte b) {
        int v35;
        boolean z4;
        int v24;
        hmnz hmnz6;
        int v23;
        boolean z2;
        hmnr hmnr0;
        if((b & 0xFF) != 170) {
            int v = 0x9D;
            int v1 = 0;
            boolean z = true;
            switch(b & 0xFF) {
                case 0xBA: {
                    goto label_435;
                }
                case 0xAB: 
                case 0xBB: {
                    goto label_359;
                }
                case 0xC0: 
                case 0xC1: {
                    return hmnx.ag();
                }
                case 0xC7: {
                    return this.y();
                }
                case 200: {
                    return this.x();
                }
                case 0xEA: {
                    return this.I();
                }
                case 0xEB: {
                    return hmnx.ad();
                }
            }
            int v2 = 0x6700;
            int v3 = 4;
            switch(b & 0xFF) {
                case 12: {
                    return this.z();
                }
                case 10: 
                case 26: {
                    break;
                }
                case 28: {
                    int v5 = this.h.length;
                    hmnx.Z(v5 == 6 || v5 == 10 || v5 == 14 || (v5 == 18 || v5 == 26), 0x7E);
                    hmni hmni0 = this.d.a(true);
                    hmnz hmnz1 = hmni0.d(this.d(1, 1), true);
                    hmnx.Z(hmnz1 instanceof hmol, 0x9D);
                    hmnx.Z(this.q(hmnz1, 6, false, true), 0xAE);
                    if(!this.e.i()) {
                        hmnx.Z(this.h.length == 6, 0x7E);
                    }
                    hmnx.Z(((hmol)hmnz1).p(), 0x9D);
                    int v6 = this.ao(hmnz1, 6, false);
                    this.aA(v6);
                    this.ar(v6, this.h, 2, 4);
                    hmok hmok0 = new hmok(this.h, null);
                    this.ax(hmni0, hmnz1, hmnx.am(hmnz1, 6));
                    if(hmok0.e()) {
                        throw new hmnj(0x9E);
                    }
                    if(((hmol)hmnz1).h && hmok0.c()) {
                        throw new hmnj(190);
                    }
                    ((hmol)hmnz1).e.a(hmok0);
                    if(((hmol)hmnz1).g) {
                        if(!((hmol)hmnz1).f.d(hmok0)) {
                            goto label_83;
                        }
                        throw new hmnj(190);
                    }
                    if(((hmol)hmnz1).d.m.d(hmok0)) {
                        throw new hmnj(190);
                    }
                label_83:
                    hmok hmok1 = ((hmol)hmnz1).e;
                    hmoh hmoh0 = ((hmol)hmnz1).d;
                    if(hmok1.d(hmoh0.j) || hmoh0.k.d(((hmol)hmnz1).e)) {
                        throw new hmnj(190);
                    }
                    ((hmol)hmnz1).n();
                    ((hmol)hmnz1).b = true;
                    ((hmol)hmnz1).h = hmok0.c();
                    return this.ap(v6);
                }
                case 69: {
                    return this.G();
                }
                case 81: {
                    this.aw(this.r(), 9, 1);
                    hmnx.Z(this.e.i(), 0xAE);
                    return hmnx.V(0, this.aq(3, this.c.e(), false));
                }
                case 84: {
                    return hmnx.ac();
                }
                case 90: {
                    if(this.h.length != 7) {
                        v = 0x7E;
                    }
                    hmnx.Z(this.h.length == 4, v);
                    int v17 = this.d(1, 3);
                    this.e.f(false, false);
                    this.e.c();
                    this.e.a = 0;
                    hmos hmos2 = this.d;
                    hmno hmno0 = this.i;
                    hmos2.d(false, hmno0);
                    hmos2.a = null;
                    if(v17 != 0) {
                        for(Object object0: this.c.a) {
                            hmni hmni1 = (hmni)object0;
                            if(hmni1.b() != v17) {
                                continue;
                            }
                            hmos2.a = hmni1;
                            v1 = this.ay();
                            this.l(hmni1);
                            hmos2.c(hmno0);
                            return v1 ? new byte[]{1} : this.P();
                        }
                        throw new hmnj(0xA0);
                    }
                    hmos2.c(hmno0);
                    return v1 ? new byte[]{1} : this.P();
                }
                case 92: {
                    throw new hmnj(28);
                }
                case 100: {
                    return this.H();
                }
                case 106: {
                    return this.B();
                }
                case 0x71: 
                case 0x77: {
                    return this.w();
                }
                case 130: {
                    return this.K();
                }
                case 0x84: {
                    hmnx.Z(this.h.length == 4 || this.h.length == 6, (this.d(3, 1) + 4 == this.h.length || this.d(3, 1) + 5 == this.h.length ? 0x6C00 : 0x6700));
                    hmnx.Z(this.d(1, 2) == 0, 27270);
                    int v18 = this.h.length == 4 ? this.d(3, 1) : this.f(4);
                    hmnx.Z(this.h.length == 4 || this.d(3, 1) == 0, 0x6700);
                    hmni hmni2 = this.d.a(false);
                    this.e.f(false, false);
                    this.e.c();
                    hmnt hmnt2 = this.e;
                    hmnt2.a = this.d(0, 1);
                    hmnt hmnt3 = this.e;
                    hmnt3.b = this.d(1, 1);
                    this.e.e();
                    this.e.e = false;
                    if(hmni2 == null) {
                        hmnr0 = hmor.f(this.i);
                    }
                    else {
                        hmnr0 = hmni2.c() <= 0 ? null : hmni2.j(0, this.i);
                    }
                    this.e.j = hmnr0;
                    switch(v18) {
                        case 8: {
                            break;
                        }
                        case 16: {
                            v18 = 16;
                            break;
                        }
                        default: {
                            z = false;
                        }
                    }
                    hmnx.Z(z, 0x6C00);
                    hmnt hmnt4 = this.e;
                    int v19 = v18 == 8 ? 8 : 16;
                    byte[] arr_b8 = new byte[v19];
                    while(v1 < v19) {
                        arr_b8[v1] = (byte)this.b.nextInt(0x100);
                        ++v1;
                    }
                    hmnt4.g(arr_b8);
                    return this.an(this.e.n());
                }
                case 0x88: {
                    return this.L();
                }
                case 59: 
                case 61: 
                case 0x8B: 
                case 0x8D: {
                    hmnw hmnw0 = this.s;
                    hmnt hmnt1 = this.e;
                    hmos hmos1 = this.d;
                    boolean z1 = hmos1.c == 59 || hmos1.c == 61;
                    if(z1) {
                        hmnx.Z(this.h.length <= (hmos1.f ? 55 : 60), 0x7E);
                    }
                    if(hmos1.e == 0) {
                        hmnz hmnz2 = hmos1.a(true).d(this.d(1, 1), true);
                        switch(this.h[0]) {
                            case 0xFFFFFF8B: 
                            case 59: {
                                z2 = true;
                                break;
                            }
                            default: {
                                z2 = false;
                            }
                        }
                        hmnw0.c = this.d(2, 3);
                        hmnw0.d = this.d(5, 3);
                        if(z2) {
                            hmnz hmnz3 = hmos1.a(true).d(this.d(1, 1), true);
                            hmnx.Z(hmnz3 instanceof hmoa, 0x9D);
                            hmnx.Z(this.q(hmnz3, 6, false, true), 0xAE);
                            int v7 = ((hmoa)hmnz3).p();
                            int v8 = ((hmoa)hmnz3).o();
                            hmnx.Z((((hmoa)hmnz3) instanceof hmoc) || v8 < ((hmoa)hmnz3).n(), 190);
                            hmnx.Z(hmnw0.c + hmnw0.d <= v7, 190);
                            hmnx.Z(hmnw0.d > 0, 0x9E);
                            hmnx.Z(true, 0x9D);
                            hmnx.Z(((boolean)(((hmoa)hmnz3).d ^ 1)), 0x9D);
                            hmnw0.c += v8 * v7;
                            if((hmnz3 instanceof hmoc) && v8 == ((hmoa)hmnz3).n() - 1) {
                                if(!((hmoa)hmnz3).b) {
                                    byte[] arr_b3 = hmnz3.k(0, hmnz3.f());
                                    byte[] arr_b4 = new byte[arr_b3.length];
                                    if(hmnz3.l() == 3) {
                                        this.i.a(arr_b4, this.i.d(arr_b3, v7, hmnz3.f() - v7), 0);
                                    }
                                    else {
                                        System.arraycopy(arr_b3, v7, arr_b4, 0, arr_b3.length - v7);
                                    }
                                    hmnz3.j(0, arr_b4);
                                }
                                hmnw0.c -= v7;
                            }
                        }
                        else {
                            hmnz hmnz4 = hmos1.a(true).d(this.d(1, 1), true);
                            hmnx.Z(hmnz4 instanceof hmny, 0x9D);
                            hmnx.Z(this.q(hmnz4, 6, false, true), 0xAE);
                            hmnx.Z(hmnw0.c + hmnw0.d <= ((hmny)hmnz4).f(), 190);
                            hmnx.Z(hmnw0.d > 0, 0x9E);
                        }
                        hmnw0.e = hmnz2;
                        hmnw0.b = this.h;
                        hmnw0.a = hmnw0.d;
                        int v9 = this.ao(hmnz2, 6, false);
                        hmnw0.f = v9;
                        if(v9 == 2) {
                            hmnw0.a(hmnt1.b());
                        }
                        else if(v9 == 3) {
                            if(this.r()) {
                                hmnw0.a = hmpy.O(hmnw0.a + 1, 16) + 8;
                            }
                            else {
                                hmnw0.a(hmnt1.a());
                                int v10 = hmnt1.j.a();
                                hmnw0.a = hmpy.O(hmnw0.a, v10);
                            }
                        }
                        hmnw0.a(8);
                    }
                    else {
                        hmnw0.b = hmnx.X(new byte[][]{hmnw0.b, Arrays.copyOfRange(this.h, 1, this.h.length)});
                    }
                    int v11 = hmnw0.b.length;
                    int v12 = hmnw0.a;
                    if(v11 < v12) {
                        hmnx.Z(z1, 0x7E);
                        return this.s();
                    }
                    hmnx.Z(v12 == v11, 0x7E);
                    this.ar(hmnw0.f, hmnw0.b, 8, hmnw0.d);
                    if(this.r() && hmnw0.f == 3) {
                        byte[] arr_b5 = Arrays.copyOfRange(hmnw0.b, 8, hmnw0.a - 8);
                        int v13 = arr_b5.length - 1;
                        int v14 = v13;
                        while(v14 >= 0) {
                            int v15 = arr_b5[v14];
                            if(v15 == 0xFFFFFF80) {
                                v13 = v14;
                                break;
                            }
                            if(v15 != 0) {
                                throw new hmnj(30);
                            }
                            --v14;
                            continue;
                        }
                        if(hmnw0.d == v13) {
                            v1 = 1;
                        }
                        hmnx.Z(((boolean)v1), 0x7E);
                    }
                    byte[] arr_b6 = Arrays.copyOfRange(hmnw0.b, 8, hmnw0.d + 8);
                    byte[] arr_b7 = hmnw0.b;
                    hmnz hmnz5 = hmnw0.e;
                    if(this.p()) {
                        hmos1.a(true).f(arr_b7, arr_b6, hmnz5);
                    }
                    hmnw0.e.j(hmnw0.c, arr_b6);
                    if((hmnw0.e instanceof hmoi)) {
                        int v16 = this.n - 1;
                        if(this.n == 0) {
                            throw null;
                        }
                        if(v16 == 0 || v16 == 1) {
                            this.o();
                        }
                        hmos1.j = true;
                        return this.ap(hmnw0.f);
                    }
                    return this.ap(hmnw0.f);
                }
                case 0xA4: {
                    return this.N();
                }
                case 0xA7: {
                    return this.u();
                }
                case 0xB0: {
                    hmos hmos3 = this.d;
                    hmni hmni3 = hmos3.a(false);
                    hmnx.Z(hmni3 != null, 27013);
                    hmnx.Z(this.h.length == 3 || this.h.length == 4 || this.h.length == 6, 0x6700);
                    int v20 = this.h.length == 6 ? 1 : 0;
                    int v21 = this.d(1, 1);
                    if(v20 == 0) {
                        v23 = this.h.length <= 3 ? 0 : this.d(3, 1);
                    }
                    else {
                        int v22 = this.d(4, 1) << 8;
                        v23 = this.d(5, 1) | v22;
                    }
                    hmnx.Z(v20 == 0 || this.d(3, 1) == 0, 0x6700);
                    if(v23 == 0) {
                        v23 = 1 == v20 ? 0x7FFF : 0x100;
                    }
                    if(v21 > 0x7F) {
                        hmnx.Z((v21 & 0x7F) <= 30, 27270);
                        hmnz6 = (v21 & 0x7F) == 0 ? hmos3.b : hmni3.l(v21 & 0x7F);
                        v24 = this.d(2, 1);
                    }
                    else {
                        hmnz6 = hmos3.b;
                        v24 = this.d(1, 1) << 8 | this.d(2, 1);
                    }
                    if(hmnz6 == null) {
                        throw new hmnj(27013);
                    }
                    hmnx.Z(hmnz6 instanceof hmny, 27013);
                    hmnx.Z(v24 <= hmnz6.f(), 0x6700);
                    hmnx.Z(this.q(hmnz6, 10, false, true), 27010);
                    hmnv hmnv0 = this.r;
                    int v25 = this.ao(hmnz6, 10, false);
                    hmnv0.b = v25;
                    hmnx.Z(v25 == 1 || v25 == 2, 27010);
                    hmnx.Z(this.h.length != 3, 0x6C00);
                    if(this.e.i()) {
                        if(this.e.k() && hmnv0.b == 2) {
                            v23 += -4;
                        }
                        else if(this.e.l()) {
                            v23 += -8;
                        }
                    }
                    if(v23 <= 0) {
                        z = false;
                    }
                    hmnx.Z(z, 0x6C00);
                    if(v24 + v23 > hmnz6.f()) {
                        v23 = hmnz6.f() - v24;
                    }
                    byte[] arr_b9 = hmnz6.k(v24, v23);
                    hmnv0.a = this.aq(hmnv0.b, arr_b9, false);
                    hmos3.b = hmnz6;
                    return hmnx.V(0, hmnv0.a);
                }
                case 0xB2: {
                    return this.M();
                }
                case 0xAD: 
                case 0xBD: {
                label_359:
                    hmnv hmnv1 = this.r;
                    hmnt hmnt5 = this.e;
                    hmos hmos5 = this.d;
                    if(hmos5.e == 0) {
                        if(this.r()) {
                            hmnx.Z(this.h.length == 8 || this.h.length == 16, 0x7E);
                        }
                        else {
                            hmnx.Z(this.h.length == 8, 0x7E);
                        }
                        hmnz hmnz7 = hmos5.a(true).d(this.d(1, 1), true);
                        switch(this.h[0]) {
                            case -85: 
                            case -69: {
                                z4 = true;
                                break;
                            }
                            default: {
                                z4 = false;
                            }
                        }
                        int v32 = this.d(2, 3);
                        int v33 = this.d(5, 3);
                        boolean z5 = v33 == 0;
                        hmnv1.b = this.ao(hmnz7, 10, false);
                        if(z4) {
                            hmnx.Z(hmnz7 instanceof hmoa, 0x9D);
                            hmnx.Z(this.q(hmnz7, 10, false, true), 0xAE);
                            if(this.r()) {
                                hmnx.Z(this.h.length == (hmnv1.b == 1 ? 8 : 16), 0x7E);
                            }
                            int v34 = ((hmoa)hmnz7).p();
                            hmnx.Z(v32 <= ((hmoa)hmnz7).o() - 1, 190);
                            hmnx.Z(v33 <= ((hmoa)hmnz7).o() - v32, 190);
                            if(v33 == 0) {
                                v33 = ((hmoa)hmnz7).o() - v32;
                            }
                            hmnv1.a = ((hmoa)hmnz7).k((((hmoa)hmnz7).o() - v32 - v33) * v34, v33 * v34);
                        }
                        else if((hmnz7 instanceof hmoj)) {
                            hmnx.Z(this.q(hmnz7, 8, false, true), 0xAE);
                            if(this.r()) {
                                hmnx.Z(this.h.length == (hmnv1.b == 1 ? 8 : 16), 0x7E);
                            }
                            if(v33 == 0) {
                                hmnx.Z(v32 < 12, 190);
                                v33 = 12 - v32;
                            }
                            else {
                                hmnx.Z(v32 + v33 <= 12, 190);
                            }
                            hmnv1.a = ((hmoj)hmnz7).k(v32, v33);
                        }
                        else {
                            hmnx.Z(hmnz7 instanceof hmny, 0x9D);
                            hmnx.Z(this.q(hmnz7, 10, false, true), 0xAE);
                            if(this.r()) {
                                hmnx.Z(this.h.length == (hmnv1.b == 1 ? 8 : 16), 0x7E);
                            }
                            if(v33 == 0) {
                                hmnx.Z(v32 < ((hmny)hmnz7).f(), 190);
                                v33 = ((hmny)hmnz7).f() - v32;
                            }
                            else {
                                hmnx.Z(v32 + v33 <= ((hmny)hmnz7).f(), 190);
                            }
                            hmnv1.a = ((hmny)hmnz7).k(v32, v33);
                        }
                        if(hmnv1.b != 1 || hmnt5.l()) {
                            this.j();
                        }
                        if(this.r()) {
                            this.ar(hmnv1.b, this.h, 8, 0);
                        }
                        if(hmnz7.g() != 5) {
                            byte[] arr_b10 = hmnv1.a;
                            if(this.p()) {
                                hmos5.a(true).f(this.h, arr_b10, hmnz7);
                            }
                        }
                        hmnv1.a = this.aq(hmnv1.b, hmnv1.a, z5);
                    }
                    else {
                        hmnx.Z(this.h.length == 1, 0x7E);
                    }
                    if(hmos5.c == -69 || hmos5.c == -67) {
                        if(hmos5.e == 0) {
                            v35 = this.a();
                        }
                        else {
                            v35 = hmnv1.a.length > 58 ? this.a() : 58;
                        }
                        byte[] arr_b11 = hmnv1.a;
                        if(arr_b11.length > v35) {
                            byte[] arr_b12 = Arrays.copyOfRange(arr_b11, 0, v35);
                            hmnv1.a = Arrays.copyOfRange(hmnv1.a, v35, hmnv1.a.length);
                            return hmnx.as(arr_b12);
                        }
                    }
                    if(hmos5.g && hmos5.f) {
                        if(hmnv1.a.length > 0x100) {
                            z = false;
                        }
                        hmnx.Z(z, 0x7E);
                    }
                    return hmnx.V(0, hmnv1.a);
                label_435:
                    hmnw hmnw2 = this.s;
                    hmnt hmnt6 = this.e;
                    hmos hmos6 = this.d;
                    hmni hmni5 = hmos6.a(true);
                    hmnx.Z(hmni5 != null, 0x9D);
                    boolean z6 = hmos6.c == -37;
                    if(z6) {
                        hmnx.Z(this.h.length <= (hmos6.f ? 55 : 60), 0x7E);
                    }
                    if(hmos6.e == 0) {
                        hmnz hmnz8 = hmni5.d(this.d(1, 1), true);
                        hmnx.Z(hmnz8 instanceof hmoa, 0x9D);
                        hmnx.Z(this.q(hmnz8, 2, false, true), 0xAE);
                        int v36 = this.d(2, 3);
                        int v37 = this.d(5, 3);
                        int v38 = this.d(8, 3);
                        hmnw2.e = hmnz8;
                        hmnw2.b = this.h;
                        hmnw2.a = v38;
                        int v39 = this.ao(hmnz8, 6, false);
                        hmnw2.f = v39;
                        if(v39 != 3) {
                            if(v39 == 2) {
                                hmnw2.a(hmnt6.b());
                            }
                        }
                        else if(this.r()) {
                            hmnw2.a = hmpy.O(hmnw2.a + 1, 16) + 8;
                        }
                        else {
                            hmnw2.a(hmnt6.a());
                            int v40 = hmnt6.j.a();
                            hmnw2.a = hmpy.O(hmnw2.a, v40);
                        }
                        hmnw2.a(11);
                        int v41 = ((hmoa)hmnz8).p();
                        hmnx.Z(v36 < ((hmoa)hmnz8).n(), 190);
                        hmnx.Z(v37 + 1 <= ((hmoa)hmnz8).p(), 190);
                        hmnx.Z(v37 + v38 <= ((hmoa)hmnz8).p(), 190);
                        hmnx.Z(true, 0x9D);
                        if(((hmoa)hmnz8).d) {
                            hmnx.Z(((hmoa)hmnz8).e == v36, 0x9D);
                        }
                        else {
                            hmnx.Z(((boolean)(((hmoa)hmnz8).b ^ 1)), 0x9D);
                        }
                        if((hmnz8 instanceof hmod)) {
                            hmnx.Z(((hmoa)hmnz8).o() < ((hmoa)hmnz8).n(), 190);
                        }
                        hmnx.Z(v36 < ((hmoa)hmnz8).o(), 190);
                        hmnw2.c = (((hmoa)hmnz8).o() - 1 - v36) * v41 + v37;
                        hmnw2.d = v38;
                        ((hmoa)hmnw2.e).e = v36;
                        hmnx.Z(v38 > 0, 0x9E);
                    }
                    else {
                        hmnw2.b = hmnx.X(new byte[][]{hmnw2.b, Arrays.copyOfRange(this.h, 1, this.h.length)});
                    }
                    int v42 = hmnw2.b.length;
                    int v43 = hmnw2.a;
                    if(v42 < v43) {
                        hmnx.Z(z6, 0x7E);
                        return this.s();
                    }
                    hmnx.Z(v42 == v43, 0x7E);
                    this.ar(hmnw2.f, hmnw2.b, 11, hmnw2.d);
                    if(this.r() && hmnw2.f == 3) {
                        byte[] arr_b13 = Arrays.copyOfRange(hmnw2.b, 11, hmnw2.b.length - 8);
                        this.av(hmnw2, arr_b13);
                        int v44 = arr_b13.length - 1;
                        int v45 = v44;
                        while(v45 >= 0) {
                            int v46 = arr_b13[v45];
                            if(v46 == 0xFFFFFF80) {
                                v44 = v45;
                                break;
                            }
                            if(v46 != 0) {
                                throw new hmnj(30);
                            }
                            --v45;
                            continue;
                        }
                        hmnx.Z(hmnw2.d == v44, 0x7E);
                    }
                    int v47 = hmnw2.d;
                    byte[] arr_b14 = new byte[v47];
                    System.arraycopy(Arrays.copyOfRange(hmnw2.b, 11, v47 + 11), 0, arr_b14, 0, v47);
                    byte[] arr_b15 = hmnw2.b;
                    hmnz hmnz9 = hmnw2.e;
                    if(this.p()) {
                        hmos6.a(true).g(arr_b15, arr_b14, hmnz9);
                    }
                    hmnw2.e.j(hmnw2.c, arr_b14);
                    ((hmoa)hmnw2.e).d = true;
                    return this.P();
                }
                case 0xC4: {
                    return hmnx.ab();
                }
                case 0xD6: {
                    hmnw hmnw1 = this.s;
                    hmos hmos4 = this.d;
                    hmni hmni4 = hmos4.a(false);
                    hmnx.Z(this.h.length >= 5, 0x6700);
                    int v26 = this.d(1, 1);
                    int v27 = this.d(3, 1);
                    hmnw1.d = v27;
                    int v28 = this.h.length;
                    if(v28 > 6 && v27 == 0) {
                        int v29 = this.d(4, 1) << 8;
                        int v30 = this.d(5, 1) | v29;
                        hmnw1.d = v30;
                        boolean z3 = v30 + 6 == this.h.length;
                        if(v26 == 0) {
                            if(hmos4.b == null) {
                                v26 = 0;
                                v2 = 27013;
                            }
                            else {
                                v26 = 0;
                            }
                        }
                        hmnx.Z(z3, v2);
                        v3 = 6;
                    }
                    else {
                        hmnx.Z(v27 + 4 == v28, 0x6700);
                    }
                    hmnw1.b = this.h;
                    if(v26 > 0x7F) {
                        hmnx.Z((v26 & 0x7F) <= 30, 27270);
                        hmnw1.e = (v26 & 0x7F) == 0 ? hmos4.b : hmni4.l(v26 & 0x7F);
                        hmnw1.c = this.d(2, 1);
                    }
                    else {
                        hmnw1.e = hmos4.b;
                        hmnw1.c = this.d(1, 1) << 8 | this.d(2, 1);
                    }
                    hmnx.Z(hmnw1.e instanceof hmny, 27013);
                    hmnx.Z(hmnw1.c + hmnw1.d <= hmnw1.e.f(), 27013);
                    hmnx.Z(this.q(hmnw1.e, 6, false, false), 27010);
                    int v31 = this.ao(hmnw1.e, 6, false);
                    hmnw1.f = v31;
                    if(v31 == 1) {
                        v1 = 1;
                    }
                    hmnx.Z(((boolean)v1), 27010);
                    hmnw1.e.j(hmnw1.c, Arrays.copyOfRange(hmnw1.b, v3, hmnw1.d + v3));
                    hmni4.n(true, this.i);
                    hmos4.b = hmnw1.e;
                    this.o();
                    return this.g;
                }
                case 0xDF: {
                    return hmnx.ak();
                }
                case 0xE2: {
                    return this.J();
                }
                case 0xF5: {
                    return this.E();
                }
                case 0xFC: {
                    throw new hmnj(28);
                }
                default: {
                    switch(b & 0xFF) {
                        case 0x5F: {
                            return hmnx.aa();
                        }
                        case 0x60: {
                            byte[] arr_b1 = this.q;
                            hmor hmor0 = this.c;
                            if(!hmor0.b.b) {
                                System.arraycopy(hmor0.e(), 0, arr_b1, 14, this.c.e().length);
                            }
                            switch(this.d.e) {
                                case 0: {
                                    this.aw(this.r(), 9, 1);
                                    return hmnx.as(Arrays.copyOfRange(arr_b1, 0, 7));
                                }
                                case 1: {
                                    goto label_52;
                                }
                                case 2: {
                                    goto label_56;
                                }
                            }
                            throw new hmnj(202);
                        label_52:
                            if(this.h.length == 1) {
                                v1 = 1;
                            }
                            hmnx.Z(((boolean)v1), 0x7E);
                            return hmnx.as(Arrays.copyOfRange(arr_b1, 7, 14));
                        label_56:
                            hmnx.Z(this.h.length == 1, 0x7E);
                            byte[] arr_b2 = this.an(arr_b1);
                            return hmnx.X(new byte[][]{Arrays.copyOfRange(arr_b2, 0, 1), Arrays.copyOfRange(arr_b2, 15, arr_b2.length)});
                        }
                        case 97: {
                            break;
                        }
                        default: {
                            switch(b & 0xFF) {
                                case 108: {
                                    goto label_19;
                                }
                                case 109: {
                                    return this.C();
                                }
                                case 110: {
                                    throw new hmnj(28);
                                }
                                case 0x6F: {
                                    return this.D();
                                }
                                default: {
                                    switch(b & 0xFF) {
                                        case 202: {
                                            return hmnx.ae();
                                        }
                                        case 204: {
                                            return hmnx.ai();
                                        }
                                        case 203: 
                                        case 205: {
                                            return hmnx.af();
                                        }
                                        case 206: {
                                            return hmnx.ah();
                                        }
                                    }
                                }
                            }
                            switch(b & 0xFF) {
                                case 0xDA: {
                                    return hmnx.aj();
                                }
                                case 0xDB: {
                                    goto label_435;
                                }
                                case 220: {
                                    return this.A();
                                }
                            }
                            throw new hmnj(28);
                        label_19:
                            if(this.e.m()) {
                                hmnx.Z(this.h.length == 2 || this.h.length == 10, 0x7E);
                            }
                            else {
                                hmnx.Z(this.h.length == 2, 0x7E);
                            }
                            hmnt hmnt0 = this.e;
                            hmos hmos0 = this.d;
                            hmnz hmnz0 = hmos0.a(true).d(this.d(1, 1), true);
                            hmnx.Z(hmnz0 instanceof hmol, 0x9D);
                            hmnx.Z(this.q(hmnz0, 14, ((hmol)hmnz0).o(), true), 0xAE);
                            int v4 = this.ao(((hmol)hmnz0), 14, ((hmol)hmnz0).o());
                            if(this.r()) {
                                if(v4 == 1) {
                                    hmnt0.d();
                                }
                                else {
                                    this.h();
                                }
                            }
                            byte[] arr_b = ((hmol)hmnz0).d.l.f();
                            if(v4 != 1 || hmnt0.l()) {
                                this.j();
                            }
                            if(this.p()) {
                                hmos0.a(true).e(this.h, arr_b);
                            }
                            return hmnx.V(0, this.aq(v4, arr_b, false));
                        }
                    }
                    return this.F();
                }
            }
        }
        return this.v();
    }

    protected final byte[] u() {
        boolean z = true;
        this.aw(this.r(), 9, 1);
        hmos hmos0 = this.d;
        hmoj hmoj0 = hmni.m(hmos0.a(true).a);
        if(hmoj0 == null) {
            z = false;
        }
        this.au(hmoj0, z);
        hmos0.d(false, this.i);
        hmos0.c(this.i);
        return this.P();
    }

    protected final byte[] v() {
        int v = 16;
        hmnt hmnt0 = this.e;
        boolean z = false;
        hmni hmni0 = this.d.a(false);
        boolean z1 = true;
        if(this.d.e == 0) {
            hmnx.Z(this.h.length == 2, 0x7E);
            hmnt0.f(false, false);
            hmnt0.c();
            hmnt0.a = this.d(0, 1);
            int v1 = this.d(1, 1);
            hmnt0.b = v1;
            hmnx.Z((v1 & 0x40) == 0, 0x9E);
            hmnx.Z((hmnt0.b & 0x80) == 0, 0x9D);
            if(hmni0 != null) {
                hmnt0.j = hmni0.j(hmnt0.b, this.i);
                goto label_22;
            }
            int v2 = hmnt0.b;
            switch(v2) {
                case 0: {
                    hmnt0.j = this.i.e(hmnr.b(0, 0));
                label_22:
                    if(hmnt0.j()) {
                        if(hmnt0.j.d != 2) {
                            z1 = false;
                        }
                        hmnx.Z(z1, 0xAE);
                    }
                    else {
                        int v3 = hmnt0.a;
                        if(v3 == 170) {
                            if(hmnt0.j.d != 1) {
                                z1 = false;
                            }
                            hmnx.Z(z1, 0xAE);
                        }
                        else if(v3 == 26) {
                            if(hmnt0.j.d != 2 && hmnt0.j.d != 3) {
                                z1 = false;
                            }
                            hmnx.Z(z1, 0xAE);
                        }
                    }
                    hmnt0.e = hmnt0.j();
                    hmnt0.g(this.U(hmnt0.j));
                    hmnt0.e();
                    return hmnx.as(this.T(hmnt0.j, hmnt0.f, hmnt0.n(), false));
                }
                case 1: 
                case 2: 
                case 3: {
                    break;
                }
                default: {
                    if(v2 != 4) {
                        throw v2 == 16 || v2 == 17 || v2 == 18 || (v2 == 0x20 || v2 == 33 || v2 == 34 || v2 == 35) ? new hmnj(0x9D) : new hmnj(0x40);
                    }
                }
            }
            if(this.h[0] == -86) {
                z = true;
            }
            hmnx.Z(z, 0xAE);
            throw new hmnj(0x9D);
        }
        if(hmnt0.j.d != 1 && hmnt0.j.d != 3) {
            v = 8;
        }
        int v4 = v + v;
        hmnx.Z(this.h.length == v4 + 1, 0x7E);
        if(hmnt0.k()) {
            hmnt0.e();
        }
        byte[] arr_b = Arrays.copyOfRange(this.h, 1, v4 + 1);
        byte[] arr_b1 = this.S(hmnt0.j, hmnt0.f, arr_b);
        byte[] arr_b2 = Arrays.copyOfRange(arr_b1, 0, v);
        hmnx.Z(Arrays.equals(this.Q(Arrays.copyOfRange(arr_b1, v, v4), true), hmnt0.n()), 0xAE);
        if(hmnt0.k()) {
            hmnt0.e();
        }
        byte[] arr_b3 = this.Q(arr_b2, false);
        byte[] arr_b4 = this.an(this.T(hmnt0.j, hmnt0.f, arr_b3, false));
        this.R(arr_b2, hmnt0.n(), hmnt0.j);
        hmnt0.e();
        if(hmni0 != null) {
            z = true;
        }
        hmnt0.f(hmni0 == null, z);
        return arr_b4;
    }

    protected final byte[] w() {
        hmno hmno1;
        byte[] arr_b14;
        byte[] arr_b12;
        hmnt hmnt0 = this.e;
        boolean z = false;
        hmni hmni0 = this.d.a(false);
        boolean z1 = true;
        if(this.d.e == 0) {
            byte[] arr_b = this.h;
            if(arr_b[0] == 0x71) {
                hmnx.Z(arr_b.length >= 3, 0x7E);
                int v = this.d(2, 1);
                hmnx.Z(this.h.length - 3 == v, 0x7E);
                byte[] arr_b1 = new byte[v];
                System.arraycopy(this.h, 3, arr_b1, 0, v);
                System.arraycopy(arr_b1, 0, hmnt0.g, 0, Math.min(v, 6));
            }
            else {
                hmnx.Z(arr_b.length == 2, 0x7E);
                hmnx.Z(this.r(), 0x9D);
            }
            hmnt0.f(false, false);
            hmnt0.l = null;
            hmnt0.m = null;
            hmnt0.a = this.d(0, 1);
            int v1 = this.d(1, 1);
            hmnt0.b = v1;
            hmnx.Z((v1 & 0x40) == 0, 0x9E);
            hmnx.Z((hmnt0.b & 0x80) == 0, 0x9D);
            if(hmni0 != null) {
                hmnt0.j = hmni0.j(hmnt0.b, this.i);
                goto label_32;
            }
            int v2 = hmnt0.b;
            switch(v2) {
                case 0: {
                    hmnt0.j = this.i.e(hmnr.b(0, 0));
                    hmnx.Z(hmnt0.j != null && hmnt0.j.c() != null && hmnt0.j.c().length != 0, 0x9D);
                label_32:
                    if(hmnt0.j.d != 1) {
                        z1 = false;
                    }
                    hmnx.Z(z1, 0xAE);
                    hmnt hmnt1 = this.e;
                    hmnt1.e = false;
                    hmnt1.g(this.U(hmnt1.j));
                    hmnt0.e();
                    byte[] arr_b2 = new byte[16];
                    hmnr hmnr0 = hmnt0.j;
                    byte[] arr_b3 = hmnt0.f;
                    byte[] arr_b4 = hmnt0.n();
                    this.i.g(hmnr0, arr_b3, arr_b4, arr_b2, false);
                    return hmnx.as(arr_b2);
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    throw new hmnj(0xAE);
                }
                default: {
                    throw v2 == 16 || v2 == 17 || v2 == 18 || (v2 == 0x20 || v2 == 33 || v2 == 34 || v2 == 35) ? new hmnj(0x9D) : new hmnj(0x40);
                }
            }
        }
        hmnx.Z(this.h.length == 33, 0x7E);
        byte[] arr_b5 = Arrays.copyOfRange(this.h, 1, 33);
        hmnt0.e();
        hmnr hmnr1 = hmnt0.j;
        byte[] arr_b6 = hmnt0.f;
        byte[] arr_b7 = new byte[arr_b5.length];
        hmno hmno0 = this.i;
        hmno0.f(hmnr1, arr_b6, arr_b5, arr_b7, false);
        byte[] arr_b8 = Arrays.copyOfRange(arr_b7, 0, 16);
        hmnx.Z(Arrays.equals(this.Q(Arrays.copyOfRange(arr_b7, 16, 0x20), true), hmnt0.n()), 0xAE);
        byte[] arr_b9 = this.Q(arr_b8, false);
        hmnt0.e();
        if(hmnt0.a == 0x71) {
            byte[] arr_b10 = new byte[4];
            this.b.nextBytes(arr_b10);
            hmnt0.i = arr_b10;
            hmnt0.h = 0;
            byte[] arr_b11 = new byte[0x20];
            System.arraycopy(hmnt0.i, 0, arr_b11, 0, 4);
            System.arraycopy(arr_b9, 0, arr_b11, 4, 16);
            if(hmni0 == null) {
                arr_b12 = new byte[6];
                hmni0 = null;
            }
            else {
                arr_b12 = hmni0.b.n;
            }
            System.arraycopy(arr_b12, 0, arr_b11, 20, arr_b12.length);
            System.arraycopy(hmnt0.g, 0, arr_b11, arr_b12.length + 20, 6);
            byte[] arr_b13 = new byte[0x20];
            hmno0.g(hmnt0.j, hmnt0.f, arr_b11, arr_b13, false);
            arr_b14 = this.an(arr_b13);
            hmno1 = hmno0;
        }
        else {
            byte[] arr_b15 = new byte[16];
            hmno0.g(hmnt0.j, hmnt0.f, arr_b9, arr_b15, false);
            hmno1 = hmno0;
            arr_b14 = this.an(arr_b15);
        }
        byte[] arr_b16 = hmne.a(arr_b8, hmnt0.n());
        byte[] arr_b17 = hmno1.i(this.e.j, arr_b16, new byte[16], 1);
        hmnt hmnt2 = this.e;
        hmnt2.l = new hmnr(1, arr_b17, false);
        arr_b16[0] = 90;
        arr_b16[1] = -91;
        byte[] arr_b18 = hmno1.i(this.e.j, arr_b16, new byte[16], 1);
        hmnt hmnt3 = this.e;
        hmnt3.m = new hmnr(1, arr_b18, false);
        hmnt0.e();
        if(hmni0 != null) {
            z = true;
        }
        hmnt0.f(hmni0 == null, z);
        return arr_b14;
    }

    protected final byte[] x() {
        if(!this.e.i()) {
            hmnx.Z(this.h.length == 17, 0x7E);
        }
        else if(!this.e.m() && !this.e.l()) {
            hmnx.Z(this.h.length == 21, 0x7E);
        }
        else {
            hmnx.Z(this.h.length == 25, 0x7E);
            this.h();
        }
        hmos hmos0 = this.d;
        hmni hmni0 = hmos0.a(true);
        hmnx.Z(this.p(), 0x9D);
        if(this.e.i() && !this.e.m()) {
            this.ar(2, this.h, 1, 16);
        }
        for(Object object0: hmni0.a) {
            hmnz hmnz0 = (hmnz)object0;
            if(hmnz0.g() == 5) {
                int v = 4;
                int v1 = hmpy.L(hmpy.J(((hmoj)hmnz0).b(), 2))[1] >> 4 & 15;
                hmnx.Z(v1 != 15, 0x9D);
                if(v1 < 14) {
                    hmnx.Z(this.e.i() && this.e.b == v1, 0xAE);
                }
                hmnx.Z(((boolean)(hmos0.m ^ 1)), 0x9D);
                if(!this.e.i() || !this.e.k()) {
                    v = !this.e.i() || !this.e.l() ? 0 : 8;
                }
                byte[] arr_b = this.h;
                boolean z = this.e.i();
                hmog hmog0 = ((hmoj)hmnz0).d;
                byte[] arr_b1 = new byte[16];
                byte[] arr_b2 = (byte[])hmog0.n.clone();
                this.i.g(hmog0.q, new byte[16], arr_b2, arr_b1, false);
                ((hmoj)hmnz0).e = Arrays.copyOfRange(arr_b, 1, arr_b.length - v);
                byte[] arr_b3 = ((hmoj)hmnz0).e;
                byte[] arr_b4 = {arr_b[0]};
                byte[] arr_b5 = hmog0.l;
                if(arr_b5 != null) {
                    arr_b4 = hmpy.F(new byte[][]{arr_b5, arr_b4});
                }
                byte[] arr_b6 = z ? hmpy.F(new byte[][]{arr_b4, arr_b3, arr_b1}) : hmpy.F(new byte[][]{arr_b4, arr_b3});
                hmog0.l = hmpy.F(new byte[][]{arr_b6, new byte[hmog0.e(arr_b6)]});
                ((hmoj)hmnz0).e = z ? ((hmoj)hmnz0).e : null;
                ((hmoj)hmnz0).b = true;
                hmos0.m = true;
                return this.e.i() ? this.an(arr_b1) : this.P();
            }
        }
        throw new hmnj(0x9D);
    }

    protected final byte[] y() {
        byte[] arr_b2;
        boolean z1;
        int v;
        boolean z = false;
        if(this.r()) {
            hmnx.Z(this.h.length == 9 || this.h.length == 10, 0x7E);
        }
        this.h();
        hmnx.Z(this.h.length == 1 || this.h.length == 2, 0x7E);
        hmos hmos0 = this.d;
        hmni hmni0 = hmos0.a(true);
        if(this.h.length == 2) {
            v = this.d(1, 1) & 1;
            switch(this.d(1, 1)) {
                case 0: 
                case 1: {
                    z1 = true;
                    break;
                }
                default: {
                    z1 = false;
                }
            }
            hmnx.Z(z1, 0x9E);
        }
        else {
            v = 0;
        }
        List list0 = hmni0.a;
        hmoj hmoj0 = hmni.m(list0);
        if(v != 0 && hmoj0 == null) {
            throw new hmnj(0x9E);
        }
        this.au(hmoj0, hmoj0 != null);
        hmoj hmoj1 = hmni.m(hmos0.a(true).a);
        if(hmoj1 != null && (hmpy.L(hmpy.J(hmoj1.b(), 2))[1] >> 4 & 15) != 15) {
            hmnx.Z(hmos0.m, 0x9D);
        }
        if(hmoj0 != null) {
            hmnx.Z(((boolean)(this.ay() ^ 1)), 0x9D);
        }
        hmos0.d(true, this.i);
        hmos0.c(this.i);
        if(this.h.length == 2 && hmoj0 != null) {
            hmoj hmoj2 = hmni.m(list0);
            if(hmoj2 == null) {
                arr_b2 = null;
            }
            else {
                long v1 = hmoj2.d.o;
                hmnx.Z(v1 != 0xFFFFFFFFL, 0x9D);
                byte[] arr_b = hmoj2.d.g(v1);
                byte[] arr_b1 = hmoj2.d.p;
                if(arr_b1 != null) {
                    z = true;
                }
                hmnx.Z(z, 0x9E);
                arr_b2 = hmnx.X(new byte[][]{arr_b, arr_b1});
            }
        }
        else {
            arr_b2 = null;
        }
        this.l(hmni0);
        hmoj hmoj3 = hmni.m(list0);
        if(hmoj3 != null) {
            hmoj3.n();
        }
        int v2 = this.n - 1;
        if(this.n != 0) {
            switch(v2) {
                case 0: 
                case 1: {
                    this.o();
                    return v == 0 ? this.P() : this.an(arr_b2);
                }
                case 2: 
                case 4: {
                    this.j = true;
                    hmos0.j = true;
                    hmos0.k = true;
                    hmos0.l = true;
                    this.l = true;
                    return v == 0 ? this.P() : this.an(arr_b2);
                }
                default: {
                    return v == 0 ? this.P() : this.an(arr_b2);
                }
            }
        }
        throw null;
    }

    protected final byte[] z() {
        if(this.e.m()) {
            int v = this.h.length;
            hmnx.Z(v == 6 || v == 10 || v == 14 || v == 18 || v == 26, 0x7E);
        }
        else {
            hmnx.Z(this.h.length == 6 || this.h.length == 10 || this.h.length == 14 || this.h.length == 18, 0x7E);
        }
        hmni hmni0 = this.d.a(true);
        hmnz hmnz0 = hmni0.d(this.d(1, 1), true);
        hmnx.Z(hmnz0 instanceof hmol, 0x9D);
        hmnx.Z(this.q(hmnz0, 2, false, true), 0xAE);
        boolean z = hmnx.am(hmnz0, 2);
        if(!this.e.i()) {
            hmnx.Z(this.h.length == 6, 0x7E);
        }
        int v1 = this.ao(hmnz0, 2, false);
        this.aA(v1);
        this.ar(v1, this.h, 2, 4);
        this.ax(hmni0, hmnz0, z);
        hmok hmok0 = new hmok(this.h, null);
        if(hmok0.e()) {
            throw new hmnj(0x9E);
        }
        ((hmol)hmnz0).e.a(hmok0);
        hmok hmok1 = ((hmol)hmnz0).e;
        hmoh hmoh0 = ((hmol)hmnz0).d;
        if(hmok1.d(hmoh0.j) || hmoh0.k.d(((hmol)hmnz0).e)) {
            throw new hmnj(190);
        }
        ((hmol)hmnz0).b = true;
        return this.ap(v1);
    }
}

