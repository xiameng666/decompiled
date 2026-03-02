import java.security.SecureRandom;
import java.util.Arrays;
import org.json.JSONException;

final class hmmq extends hmox implements fsat, ftrr, hmnd {
    public hmmq(hmno hmno0, hmnf hmnf0, hmmi hmmi0, hmpv hmpv0, int v) {
        super(hmno0, hmnf0, hmmi0, hmpv0, v);
    }

    public hmmq(hmno hmno0, hmnf hmnf0, hmpv hmpv0) {
        super(hmno0, hmnf0, hmpv0);
    }

    @Override  // ftrr, fsat
    public final void a() {
        try {
            hmoo hmoo0 = this.K(true);
            this.j.f(hmoo0);
            this.k.q = false;
            this.k.p = false;
        }
        catch(JSONException jSONException0) {
            this.i.a(jSONException0.getMessage(), jSONException0);
        }
        this.k.s.clear();
    }

    @Override  // ftrr, fsat
    public final byte[] b(byte[] arr_b) {
        byte[] arr_b50;
        hmno hmno2;
        byte[] arr_b41;
        hmps hmps7;
        byte[] arr_b29;
        byte[] arr_b30;
        byte[] arr_b28;
        byte[] arr_b26;
        byte[] arr_b27;
        hmps hmps3;
        byte[] arr_b16;
        hmps hmps2;
        byte b;
        byte[] arr_b15;
        int v5;
        byte[] arr_b4;
        byte[] arr_b2;
        byte[] arr_b3;
        int v3;
        byte[] arr_b1;
        boolean z;
        int v = arr_b[0] & 0xFF;
        try {
            if(super.k()) {
                int v1 = this.k.t - 1;
                if(this.k.t == 0) {
                    throw null;
                }
                switch(v1) {
                    case 0: {
                        switch(arr_b[1]) {
                            case 0xFFFFFF82: 
                            case -92: {
                                z = true;
                                break;
                            }
                            default: {
                                z = false;
                            }
                        }
                        hmpb.f(z, 11);
                        break;
                    }
                    case 2: {
                        int v2 = arr_b[1];
                        hmpb.f(v2 != 0xFFFFFF82, 27013);
                        hmpb.f(v2 == -92, 11);
                    }
                }
            }
            arr_b1 = null;
            v3 = 5;
            switch(v) {
                case 0: {
                    arr_b3 = (byte[])arr_b.clone();
                    break;
                }
                case 0x90: {
                    goto label_73;
                }
                default: {
                    arr_b2 = (byte[])arr_b.clone();
                    goto label_94;
                }
            }
        }
        catch(hmoy hmoy0) {
            arr_b3 = null;
            goto label_455;
        }
        try {
            hmox.P(arr_b3);
            switch(arr_b3[1]) {
                case 0xFFFFFF82: {
                    hmps hmps0 = this.k;
                    hmps0.t = 3;
                    hmpb.f(hmpa.b(arr_b3, arr_b3[1] & 0xFF), 0x6700);
                    hmpb.f(arr_b3[0] == 0, 0x6E00);
                    hmpb.f(arr_b3[2] == 0 && arr_b3[3] == 0, 27270);
                    hmpb.f(arr_b3[4] == 8, 0x6700);
                    byte[] arr_b5 = Arrays.copyOfRange(arr_b3, 5, arr_b3.length);
                    if(hmps0.o == null) {
                        throw new hmoy(27013);
                    }
                    hmpk hmpk0 = (hmpk)this.m.c.get(Integer.valueOf(0xA081));
                    hmnr hmnr0 = this.h.e(hmpk0.a);
                    if(Arrays.equals(this.h.i(hmnr0, hmps0.o, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2), arr_b5)) {
                        hmps0.t = 2;
                    }
                    arr_b4 = hmox.c;
                    goto label_461;
                }
                case -92: {
                    hmpb.f(hmpa.b(arr_b3, arr_b3[1] & 0xFF), 0x6700);
                    hmpb.f(arr_b3[0] == 0, 0x6E00);
                    hmpb.f(arr_b3[2] == 4 && arr_b3[3] == 0, 27270);
                    hmpb.f(arr_b3[4] == Arrays.copyOfRange(arr_b3, 5, arr_b3.length - 1).length, 0x6700);
                    hmpb.f(arr_b3[4] <= 16, 0x6A87);
                    int v4 = arr_b3[4];
                    byte[] arr_b6 = new byte[v4];
                    System.arraycopy(this.m.a.b(0xB001).b(), 0, arr_b6, 0, v4);
                    byte[] arr_b7 = new byte[v4];
                    System.arraycopy(arr_b3, 5, arr_b7, 0, v4);
                    if(super.k()) {
                        this.k.t = 1;
                        byte[] arr_b8 = hmpy.H(16);
                        byte[] arr_b9 = hmpy.F(new byte[][]{hmox.f, arr_b8});
                        byte[] arr_b10 = hmpy.F(new byte[][]{new byte[]{3}, new byte[2], this.m.f, new byte[6]});
                        this.k.o = hmpy.F(new byte[][]{arr_b8, arr_b10});
                        byte[] arr_b11 = hmpb.U(arr_b8, arr_b10);
                        hmpk hmpk1 = (hmpk)this.m.c.get(Integer.valueOf(0xA080));
                        hmnr hmnr1 = this.h.e(hmpk1.a);
                        byte[] arr_b12 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        this.h.g(hmnr1, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, arr_b11, arr_b12, false);
                        arr_b4 = hmpb.t(hmpy.F(new byte[][]{arr_b9, arr_b12}));
                    }
                    else if(!Arrays.equals(arr_b7, this.m.e)) {
                        if(!Arrays.equals(arr_b7, arr_b6)) {
                            throw new hmoy(0x6A82);
                        }
                        arr_b4 = hmox.c;
                    }
                    else {
                        arr_b4 = hmpb.t(this.m.d);
                    }
                    goto label_461;
                }
                default: {
                    arr_b4 = new byte[]{11};
                    goto label_461;
                }
            }
        }
        catch(hmoy hmoy0) {
            goto label_455;
        }
        try {
        label_73:
            if(arr_b.length == 5) {
                v5 = 0;
                v3 = 0;
                goto label_85;
            }
            else {
                v5 = hmpy.y(new byte[]{arr_b[4]});
                if(v5 != 0) {
                label_85:
                    int v6 = v5 + v3;
                    if(arr_b.length < v6) {
                        arr_b2 = hmox.b;
                    }
                    else {
                        byte[] arr_b13 = Arrays.copyOfRange(arr_b, v3, v6);
                        byte[] arr_b14 = new byte[arr_b13.length + 1];
                        arr_b14[0] = arr_b[1];
                        System.arraycopy(arr_b13, 0, arr_b14, 1, arr_b13.length);
                        arr_b2 = arr_b14;
                    }
                }
                else if(arr_b.length >= 9) {
                    v5 = hmpb.P(arr_b, 5);
                    v3 = 7;
                    goto label_85;
                }
                else {
                    arr_b2 = hmox.b;
                }
            }
        label_94:
            arr_b15 = arr_b2;
        }
        catch(hmoy hmoy0) {
            arr_b3 = null;
            goto label_455;
        }
        try {
            hmox.P(arr_b15);
            b = arr_b15[0];
            super.h(b);
        }
        catch(hmoy hmoy0) {
            goto label_453;
        }
        try {
        alab1:
            switch(b) {
                case -62: 
                case -61: {
                    goto label_186;
                }
                case -56: {
                    goto label_247;
                }
                case 0x60: {
                    goto label_284;
                }
                case 0x72: {
                    goto label_369;
                }
                case 0x70: 
                case 0x76: {
                    goto label_315;
                }
                case 120: {
                    goto label_429;
                }
                default: {
                    if(b != 0xFFFFFFA0 && b != 0xFFFFFFA1 && b != -94 && b != -93) {
                        switch(b) {
                            case -81: {
                                goto label_284;
                            }
                            case -80: 
                            case 0xFFFFFFB1: 
                            case -78: 
                            case -77: 
                            case -76: 
                            case -75: 
                            case -74: 
                            case -73: 
                            case -72: 
                            case -71: {
                                goto label_186;
                            }
                            case 0x30: 
                            case 49: 
                            case 50: 
                            case 51: 
                            case 52: 
                            case 53: 
                            case 54: 
                            case 55: {
                                goto label_110;
                            }
                            default: {
                                arr_b4 = hmox.e;
                                break alab1;
                            }
                        }
                    }
                    else {
                        goto label_160;
                    }
                    goto label_448;
                }
            }
        }
        catch(hmoy hmoy1) {
            goto label_433;
        }
        catch(Throwable throwable0) {
            goto label_442;
        }
        try {
            hmps hmps1 = this.k;
            if(hmps1.n != 0x60 || b != -81) {
                hmps1.n = b;
            }
            goto label_448;
        }
        catch(hmoy hmoy0) {
            goto label_453;
        }
        try {
        label_110:
            int v7 = arr_b15[0];
            hmps2 = this.k;
            hmpb.f(hmps2.w != null, 11);
            hmpb.f(hmps2.k < 0xFFFF, 7);
            if(hmpb.o(arr_b15[0])) {
                hmpb.f(super.j(hmpb.c(arr_b15)), 6);
            }
            switch(v7) {
                case 0x30: {
                    byte[] arr_b17 = this.B(arr_b15);
                    arr_b16 = hmpb.r(0x90, super.v(Arrays.copyOfRange(arr_b17, 1, arr_b17.length)));
                    break;
                }
                case 49: {
                    byte[] arr_b18 = this.B(arr_b15);
                    arr_b16 = hmpb.w(super.v(Arrays.copyOfRange(arr_b18, 1, arr_b18.length)));
                    break;
                }
                case 50: {
                    arr_b16 = this.B(arr_b15);
                    break;
                }
                case 51: {
                    arr_b16 = this.B(arr_b15);
                    break;
                }
                case 52: {
                    byte[] arr_b19 = this.A(arr_b15);
                    arr_b16 = hmpb.r(0x90, super.v(Arrays.copyOfRange(arr_b19, 1, arr_b19.length)));
                    break;
                }
                case 53: {
                    byte[] arr_b20 = this.A(arr_b15);
                    arr_b16 = hmpb.w(super.v(Arrays.copyOfRange(arr_b20, 1, arr_b20.length)));
                    break;
                }
                case 54: {
                    arr_b16 = this.A(arr_b15);
                    break;
                }
                case 55: {
                    byte[] arr_b21 = this.A(arr_b15);
                    arr_b16 = hmpb.w(Arrays.copyOfRange(arr_b21, 1, arr_b21.length));
                    break;
                }
                default: {
                    arr_b16 = new byte[]{11};
                }
            }
            if((v7 & 4) == 4) {
                int v8 = hmps2.b;
                if(v8 >= (this.m.g.b[0] & 0xFF)) {
                    throw new hmoy(7);
                }
                hmps2.b = v8 + 1;
            }
            else {
                hmps2.f();
            }
            byte[] arr_b22 = Arrays.copyOfRange(arr_b15, 1, 3);
            byte[] arr_b23 = Arrays.copyOfRange(arr_b16, 1, arr_b16.length);
            byte b1 = arr_b15[3];
            byte b2 = arr_b16[0];
            byte[] arr_b24 = hmps2.c;
            if(arr_b24 == null) {
                byte[] arr_b25 = hmps2.h();
                hmps2.c = hmpy.F(new byte[][]{new byte[]{b2}, arr_b25, this.H(), arr_b22, new byte[]{b1}, arr_b23});
            }
            else {
                hmps2.c = hmpy.F(new byte[][]{arr_b24, arr_b22, new byte[]{b1}, arr_b23});
            }
            arr_b4 = (v7 & 1) == 1 ? super.n(arr_b16) : arr_b16;
        }
        catch(hmoy hmoy1) {
            goto label_433;
        }
        catch(Throwable throwable0) {
            goto label_442;
        }
        try {
            if(hmps2.n != 0x60 || b != -81) {
                hmps2.n = b;
            }
            goto label_448;
        }
        catch(hmoy hmoy0) {
            goto label_453;
        }
        try {
        label_160:
            hmps3 = this.k;
            hmpb.f(hmps3.j < 0xFFFF, 7);
            hmpb.f((Arrays.copyOfRange(arr_b15, 3, arr_b15.length - 8).length & 15) == 0, 12);
            int v9 = arr_b15[0];
            hmpb.f(hmps3.w != null, 11);
            switch(v9) {
                case 0xFFFFFFA0: {
                    arr_b27 = this.E(arr_b15);
                    break;
                }
                case 0xFFFFFFA1: {
                    arr_b27 = this.E(arr_b15);
                    break;
                }
                case -94: {
                    arr_b27 = this.F(arr_b15);
                    break;
                }
                case -93: {
                    arr_b27 = this.F(arr_b15);
                    break;
                }
                default: {
                    arr_b26 = hmox.e;
                    goto label_182;
                }
            }
            hmps3.p = true;
            arr_b26 = super.p(arr_b15, arr_b27);
            int v10 = this.o - 1;
            if(this.o == 0) {
                throw null;
            }
            if(v10 == 0 || v10 == 1) {
                super.f();
            }
        }
        catch(hmoy hmoy1) {
            goto label_433;
        }
        catch(Throwable throwable0) {
            goto label_442;
        }
        try {
        label_182:
            if(hmps3.n != 0x60 || b != -81) {
                hmps3.n = b;
            }
            arr_b4 = arr_b26;
            goto label_448;
        }
        catch(hmoy hmoy0) {
            goto label_453;
        }
        try {
        label_186:
            int v11 = 5;
            hmps hmps4 = this.k;
            hmpb.f(hmps4.w != null, 11);
            int v12 = arr_b15[0];
            if(hmpb.m(((byte)v12))) {
                arr_b28 = null;
            }
            else {
                switch(v12) {
                    case -76: {
                        arr_b28 = null;
                        break;
                    }
                    case -75: {
                        arr_b28 = null;
                        break;
                    }
                    default: {
                        if(hmpb.l(arr_b15[0])) {
                            v11 = 3;
                        }
                        arr_b28 = Arrays.copyOfRange(super.u(Arrays.copyOfRange(arr_b15, v11, arr_b15.length - 8)), 0, 4);
                    }
                }
            }
            switch(arr_b15[0]) {
                case -80: {
                    arr_b30 = this.y(arr_b15);
                    break;
                }
                case 0xFFFFFFB1: {
                    arr_b30 = this.y(arr_b15);
                    break;
                }
                case -78: {
                    arr_b30 = super.w(arr_b15);
                    break;
                }
                case -77: {
                    arr_b30 = super.w(arr_b15);
                    break;
                }
                case -76: {
                    arr_b30 = super.D(arr_b15);
                    break;
                }
                case -75: {
                    arr_b30 = super.D(arr_b15);
                    break;
                }
                case -74: {
                    arr_b30 = super.z(arr_b15);
                    break;
                }
                case -73: {
                    arr_b30 = super.z(arr_b15);
                    break;
                }
                case -72: {
                    arr_b30 = super.x(arr_b15);
                    break;
                }
                case -71: {
                    arr_b30 = super.x(arr_b15);
                    break;
                }
                case -62: {
                    arr_b30 = super.C(arr_b15);
                    break;
                }
                case -61: {
                    arr_b30 = super.C(arr_b15);
                    break;
                }
                default: {
                    arr_b29 = hmox.e;
                    goto label_241;
                }
            }
            arr_b29 = super.o(arr_b15, arr_b30, arr_b28);
            int v13 = this.o - 1;
            if(this.o == 0) {
                throw null;
            }
            if(v13 == 0 || v13 == 1) {
                int v15 = arr_b15[0];
                if(!hmpb.l(((byte)v15)) && !hmpb.m(((byte)v15))) {
                    hmps4.p = true;
                    super.f();
                }
            }
            else if(v13 == 3 || v13 == 4) {
                int v14 = arr_b15[0];
                if(!hmpb.l(((byte)v14)) && !hmpb.m(((byte)v14))) {
                    hmps4.p = true;
                }
            }
        label_241:
            if(hmps4.n != 0x60 || b != -81) {
                hmps4.n = b;
                arr_b4 = arr_b29;
            }
            else {
                arr_b4 = arr_b29;
                goto label_448;
            label_247:
                int v16 = hmpb.c(arr_b15);
                hmpq hmpq0 = super.Q(v16);
                hmpb.f(hmpa.a(arr_b15), 12);
                hmps hmps5 = this.k;
                hmpb.f(hmps5.j < 0xFFFF, 7);
                hmpb.f(v16 > 0 && v16 <= 0xFF, 9);
                super.d(arr_b15);
                hmpb.f(hmpq0 != null, 9);
                hmpb.f(hmpq0.a() && hmpq0.c != null, 9);
                hmpt hmpt0 = this.l;
                hmpb.f(hmpb.B(hmpt0.c) < 0xFFFFFFFFL, 5);
                hmpb.f(hmps5.n != -56, 5);
                hmpb.f(this.m(v16), 6);
                if(hmph.d(v16)) {
                    super.g(v16);
                }
                this.N(v16, this.m.a.c(v16), 2);
                this.N(v16, this.m.a.c(v16), 4);
                hmpb.f(true, 6);
                hmps5.m();
                byte[] arr_b31 = hmpq0.c;
                hmnr hmnr2 = super.L(hmpq0.a.intValue());
                byte[] arr_b32 = hmpb.J(hmpb.y(hmpb.L(Arrays.copyOfRange(hmpq0.b, 0, 4))) + 1, 4);
                byte[] arr_b33 = hmpy.F(new byte[][]{hmox.d, arr_b32, this.m.f});
                hmpt0.f = new hmnr(1, this.h.i(hmnr2, arr_b33, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1), false);
                hmnr hmnr3 = hmpt0.f;
                byte[] arr_b34 = new byte[arr_b31.length];
                this.h.g(hmnr3, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, arr_b31, arr_b34, false);
                byte[] arr_b35 = Arrays.copyOfRange(arr_b15, 3, arr_b15.length - 8);
                byte[] arr_b36 = super.t(arr_b34);
                hmpq0.c = arr_b35;
                hmpt0.d = super.R(arr_b15, hmpq0, arr_b34, arr_b35);
                byte[] arr_b37 = hmpy.F(new byte[][]{arr_b34, arr_b36});
                if(this.l() && (this.m.j == 1 || this.m.j == 2)) {
                    super.f();
                }
                arr_b4 = hmpb.w(arr_b37);
                hmps5.n = -56;
                goto label_448;
            label_284:
                hmps hmps6 = this.k;
                hmps6.m = true;
                byte[] arr_b38 = this.g;
                hmpb.f(hmpa.a(arr_b15), 12);
                switch(arr_b15[0]) {
                    case -81: {
                        hmpb.f(arr_b15.length == 1, 12);
                        break;
                    }
                    case 0x60: {
                        if(hmps6.w == null) {
                            hmpb.f(arr_b15.length == 1, 12);
                            break;
                        }
                    }
                }
                super.e(arr_b15);
                int v17 = hmps6.a;
                switch(v17) {
                    case 0: {
                        hmps6.a = 1;
                        arr_b4 = hmpb.q(Arrays.copyOfRange(arr_b38, 0, 7));
                        break;
                    }
                    case 1: {
                        hmps6.a = 2;
                        arr_b4 = hmpb.q(Arrays.copyOfRange(arr_b38, 7, 14));
                        break;
                    }
                    default: {
                        if(v17 != 2) {
                            throw new hmoy(11);
                        }
                        hmps6.a = 0;
                        byte[] arr_b39 = hmpb.w(arr_b38);
                        hmps6.m = false;
                        if(hmps6.w == null) {
                            arr_b4 = hmpb.w(Arrays.copyOfRange(arr_b39, 15, arr_b39.length));
                        }
                        else {
                            hmps6.l();
                            byte[] arr_b40 = this.G(super.q(arr_b39[0], arr_b38));
                            arr_b4 = hmpb.w(hmpy.F(new byte[][]{Arrays.copyOfRange(arr_b39, 15, arr_b39.length), arr_b40}));
                        }
                    }
                }
                if(hmps6.n != 0x60 || b != -81) {
                    hmps6.n = b;
                    goto label_448;
                label_315:
                    int v18 = 16;
                    hmps7 = this.k;
                    hmps7.m = true;
                    int v19 = arr_b15[0] == 0x70 ? hmpb.a(arr_b15, 3, 1) : 0;
                    if(v19 > 6) {
                        arr_b41 = Arrays.copyOfRange(arr_b15, 0, 10);
                        v19 = 6;
                    }
                    else {
                        arr_b41 = arr_b15;
                    }
                    hmpb.f(hmpa.a(arr_b41), 12);
                    int v20 = hmpb.c(arr_b41);
                    hmps7.e = hmpb.a(arr_b41, 0, 1);
                    if(!hmpb.i(v20)) {
                        throw new hmoy(9);
                    }
                    hmps7.f = v20;
                    Integer integer0 = v20;
                    hmpk hmpk2 = (hmpk)this.m.c.get(integer0);
                    if(hmpk2 == null) {
                        hmpk2 = hmox.M();
                    }
                    hmno hmno0 = this.h;
                    hmps7.w = hmno0.e(hmpk2.a);
                    hmpb.f(hmps7.w != null, 6);
                    hmpb.f(hmps7.w.d == 1, 6);
                    if(hmps7.w.d != 1 && hmps7.w.d != 3) {
                        v18 = 8;
                    }
                    byte[] arr_b42 = new byte[v18];
                    new SecureRandom().nextBytes(arr_b42);
                    hmps7.d = (byte[])arr_b42.clone();
                    if(hmps7.g()) {
                        byte[] arr_b43 = new byte[6];
                        hmpb.f(arr_b41.length - 4 == v19, 12);
                        System.arraycopy(arr_b41, 4, arr_b43, 0, v19);
                        hmps7.h = arr_b43;
                        hmox.O(new Object[]{"Key bytes localPcdCap2 ==> ", arr_b43, "keyBlockNumber ==> ", integer0});
                        hmps7.u = null;
                        hmps7.v = null;
                        hmps7.d();
                        hmps7.c = null;
                        if(this.l != null) {
                            hmps7.e();
                        }
                    }
                    else {
                        hmps7.g = hmps7.k() == 1 ? super.s() : new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        if(this.l != null) {
                            hmps7.e();
                        }
                    }
                    byte[] arr_b44 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    hmno0.g(hmps7.w, hmps7.g, hmps7.i(), arr_b44, false);
                    arr_b29 = hmpb.r(0xFFFFFF90, arr_b44);
                    if(hmps7.n != 0x60 || b != -81) {
                        hmps7.n = b;
                        arr_b4 = arr_b29;
                        goto label_448;
                    }
                    arr_b4 = arr_b29;
                }
            }
            goto label_448;
        }
        catch(hmoy hmoy1) {
            goto label_433;
        }
        catch(Throwable throwable0) {
            goto label_442;
        }
        hmps7.n = b;
        arr_b4 = arr_b29;
        goto label_448;
        try {
            try {
            label_369:
                hmpb.f(hmpa.a(arr_b15), 12);
                byte[] arr_b45 = Arrays.copyOfRange(arr_b15, 1, 33);
                byte[] arr_b46 = new byte[arr_b45.length];
                hmps hmps8 = this.k;
                if(hmps8.g()) {
                    hmps8.d();
                }
                else if(hmps8.k() != 1) {
                    hmps8.d();
                }
                else {
                    hmps8.g = super.r();
                }
                hmpb.f(hmps8.w != null, 11);
                hmno hmno1 = this.h;
                hmno1.f(hmps8.w, hmps8.g, arr_b45, arr_b46, false);
                byte[] arr_b47 = Arrays.copyOfRange(arr_b46, 0, 16);
                hmpb.f(Arrays.equals(this.I(Arrays.copyOfRange(arr_b46, 16, 0x20), true), hmps8.i()), 6);
                byte[] arr_b48 = this.I(arr_b47, false);
                if(hmps8.g()) {
                    hmps8.d();
                    hmps8.c();
                    hmps8.i = hmpy.H(4);
                    byte[] arr_b51 = new byte[0x20];
                    System.arraycopy(this.H(), 0, arr_b51, 0, 4);
                    System.arraycopy(arr_b48, 0, arr_b51, 4, 16);
                    System.arraycopy(hmps8.h, 0, arr_b51, 20, 6);
                    System.arraycopy(hmps8.h, 0, arr_b51, 26, 6);
                    byte[] arr_b52 = new byte[0x20];
                    hmno1.g(hmps8.w, hmps8.g, arr_b51, arr_b52, false);
                    arr_b50 = hmpb.w(arr_b52);
                    hmno2 = hmno1;
                }
                else {
                    hmps8.f();
                    hmps8.c = null;
                    byte[] arr_b49 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    if(hmps8.k() == 1) {
                        hmps8.g = super.s();
                    }
                    else {
                        hmps8.d();
                    }
                    hmno1.g(hmps8.w, hmps8.g, arr_b48, arr_b49, false);
                    hmno2 = hmno1;
                    arr_b50 = hmpb.w(arr_b49);
                }
                if(hmps8.h[0] == 1) {
                    byte[] arr_b53 = hmne.a(arr_b47, hmps8.i());
                    hmps8.u = new hmnr(1, hmno2.i(hmps8.w, arr_b53, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1), false);
                    arr_b53[0] = 90;
                    arr_b53[1] = -91;
                    hmps8.v = new hmnr(1, hmno2.i(hmps8.w, arr_b53, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1), false);
                }
                else {
                    byte[] arr_b54 = hmps8.i();
                    byte[] arr_b55 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    hmno2.g(hmps8.w, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{arr_b47[11], arr_b47[12], arr_b47[13], arr_b47[14], arr_b47[15], arr_b54[11], arr_b54[12], arr_b54[13], arr_b54[14], arr_b54[15], ((byte)(arr_b47[4] ^ arr_b54[4])), ((byte)(arr_b47[5] ^ arr_b54[5])), ((byte)(arr_b47[6] ^ arr_b54[6])), ((byte)(arr_b47[7] ^ arr_b54[7])), ((byte)(arr_b47[8] ^ arr_b54[8])), 17}, arr_b55, false);
                    hmps8.u = new hmnr(1, arr_b55, false);
                    byte[] arr_b56 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    hmno2.g(hmps8.w, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{arr_b47[7], arr_b47[8], arr_b47[9], arr_b47[10], arr_b47[11], arr_b54[7], arr_b54[8], arr_b54[9], arr_b54[10], arr_b54[11], ((byte)(arr_b47[0] ^ arr_b54[0])), ((byte)(arr_b47[1] ^ arr_b54[1])), ((byte)(arr_b47[2] ^ arr_b54[2])), ((byte)(arr_b47[3] ^ arr_b54[3])), ((byte)(arr_b47[4] ^ arr_b54[4])), 34}, arr_b56, false);
                    hmps8.v = new hmnr(1, arr_b56, false);
                }
                hmps8.m = false;
                hmox.O(new Object[]{"Key bytes result ==> ", arr_b50});
                hmps8.n = 0x72;
                arr_b4 = arr_b50;
                goto label_448;
            label_429:
                hmpb.f(hmpa.a(arr_b15), 12);
                this.k.b();
                goto label_446;
            }
            catch(hmoy hmoy1) {
            label_433:
                this.S(hmoy.a(hmoy1.a), hmoy1);
                hmps hmps9 = this.k;
                hmps9.m = false;
                byte[] arr_b57 = {((byte)hmoy1.a)};
                try {
                    if(hmps9.n != 0x60 || b != -81) {
                        hmps9.n = b;
                    }
                    arr_b4 = arr_b57;
                    goto label_448;
                label_442:
                    hmps hmps10 = this.k;
                    if(hmps10.n != 0x60 || b != -81) {
                        hmps10.n = b;
                    }
                    throw throwable0;
                label_446:
                    this.k.n = 120;
                    arr_b4 = new byte[]{(byte)0x90};
                label_448:
                    if(v == 0x90) {
                        arr_b4 = hmpb.u(arr_b4);
                    }
                    arr_b3 = null;
                    goto label_462;
                }
                catch(hmoy hmoy0) {
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_442;
        }
    label_453:
        arr_b3 = null;
        arr_b1 = arr_b15;
    label_455:
        int v21 = hmoy0.a;
        this.S(hmoy.a(v21), hmoy0);
        if(v == 0) {
            arr_b4 = new byte[]{((byte)(v21 >> 8 & 0xFF)), ((byte)v21)};
        }
        else {
            arr_b4 = v == 0x90 ? hmpb.u(new byte[]{((byte)v21)}) : new byte[]{((byte)v21)};
        }
    label_461:
        arr_b15 = arr_b1;
    label_462:
        hmqj hmqj0 = hmqb.a(v == 0, arr_b3, arr_b4, arr_b15, v == 0x90);
        this.n.add(hmqj0);
        this.k.s.add(hmqj0);
        hmpy.C(arr_b4);
        return arr_b4;
    }
}

