import java.util.Arrays;
import org.json.JSONException;

final class hmmp extends hmnx implements fsat, ftrr, hmnd {
    public hmmp(hmno hmno0, hmnf hmnf0, hmmi hmmi0, hmpv hmpv0, int v, hmmo hmmo0) {
        super(hmno0, hmnf0, hmmi0, hmpv0, v, hmmo0);
    }

    public hmmp(hmno hmno0, hmnf hmnf0, hmpv hmpv0) {
        super(hmno0, hmnf0, hmpv0);
    }

    public hmmp(hmno hmno0, hmnf hmnf0, hmpv hmpv0, hmmo hmmo0) {
        super(hmno0, hmnf0, hmpv0, hmmo0);
    }

    @Override  // ftrr, fsat
    public final void a() {
        if(!this.j || this.d.j) {
            super.Y(true);
        }
        this.d.h.clear();
        super.n();
    }

    @Override  // ftrr, fsat
    public final byte[] b(byte[] arr_b) {
        byte[] arr_b7;
        byte b2;
        byte[] arr_b5;
        boolean z3;
        boolean z2;
        int v7;
        boolean z1;
        boolean z;
        int v2;
        this.h = (byte[])arr_b.clone();
        byte[] arr_b1 = this.h;
        int v = arr_b1[0] & 0xFF;
        hmos hmos0 = this.d;
        hmos0.f = v == 0x90;
        hmos0.g = false;
        if(v == 0) {
            this.h = Arrays.copyOfRange(arr_b1, 1, arr_b1.length);
        }
        else {
            arr_b1 = null;
        }
        try {
            byte b = -92;
            if(v == 0x90) {
                hmnx.Z(this.h[2] == 0 && this.h[3] == 0, 0x86);
                hmnx.Z(this.h.length >= 5, 0x7E);
                byte[] arr_b2 = this.h;
                int v1 = arr_b2[4];
                if(v1 != 0) {
                label_33:
                    if((v1 & 0xFF) == 0) {
                        hmnx.Z(arr_b2.length == 5, 0x7E);
                    }
                    else {
                        hmnx.Z(arr_b2.length == (v1 & 0xFF) + 6, 0x7E);
                    }
                    hmnx.Z(this.h[this.h.length - 1] == 0, 0x7E);
                    hmos0.g = true;
                    v2 = v1 & 0xFF;
                    z = false;
                }
                else if(arr_b2.length <= 5) {
                    v1 = 0;
                    goto label_33;
                }
                else {
                    hmnx.Z(arr_b2.length >= 7, 0x7E);
                    v2 = hmpy.y(Arrays.copyOfRange(this.h, 5, 7));
                    if(v2 == 0) {
                        hmnx.Z(this.h.length == 7, 0x7E);
                        hmnx.Z(this.h[this.h.length - 1] == 0, 0x7E);
                        hmnx.Z(this.h[this.h.length - 2] == 0, 0x7E);
                        hmnx.Z(this.h[this.h.length - 3] == 0, 0x7E);
                    }
                    else {
                        hmnx.Z(this.h.length == v2 + 9, 0x7E);
                        hmnx.Z(this.h[this.h.length - 1] == 0, 0x7E);
                        hmnx.Z(this.h[this.h.length - 2] == 0, 0x7E);
                    }
                    z = true;
                }
                int v3 = this.h[1];
                if(v3 == 0xFFFFFF82 || v3 == 0xFFFFFF84 || (v3 == -120 || v3 == -92) || (v3 == -80 || v3 == -78 || v3 == -42 || v3 == -30)) {
                    throw new hmnj((hmos0.d == -81 ? 202 : 28));
                }
                super.i(((byte)v3), hmos0.c);
                byte[] arr_b3 = this.h;
                int v4 = arr_b3[1] & 0xFF;
                this.h = z ? Arrays.copyOfRange(arr_b3, 6, v2 + 7) : Arrays.copyOfRange(arr_b3, 4, v2 + 5);
                this.h[0] = (byte)v4;
            }
            else if(v == 0) {
                int v5 = this.h[0];
                if(this.e != null) {
                    switch(v5) {
                        case -80: 
                        case -78: 
                        case -42: {
                            hmnx.Z(((boolean)(this.r() ^ 1)), 27010);
                            hmnx.Z(((boolean)(this.p() ^ 1)), 27013);
                            break;
                        }
                        case -30: {
                            v5 = -30;
                            hmnx.Z(((boolean)(this.r() ^ 1)), 27010);
                            hmnx.Z(((boolean)(this.p() ^ 1)), 27013);
                            break;
                        }
                    }
                }
                if(v5 != 0xFFFFFF82 && v5 != 0xFFFFFF84 && (v5 != -120 && v5 != -92) && (v5 != -80 && v5 != -78 && v5 != -42 && v5 != -30)) {
                    throw new hmnj(28);
                }
            }
            byte[] arr_b4 = this.h;
            if(this.a != null) {
                int v6 = arr_b4[0];
                this.at(arr_b4);
            }
            byte b1 = this.h[0];
            hmom[] arr_hmom = hmon.a;
            hmnx.Z(arr_hmom[b1 & 0xFF] != null, (hmos0.d == -81 ? 202 : 28));
            if(this.e.i() && this.e.h >= 0xFFFF) {
                throw new hmnj(30);
            }
            if(b1 == -81) {
                hmnx.Z(hmos0.d == -81, 28);
                switch(hmos0.c) {
                    case -69: 
                    case -67: 
                    case 0x60: 
                    case 97: 
                    case 106: 
                    case 109: {
                        z1 = this.h.length == 1;
                        break;
                    }
                    default: {
                        z1 = this.h.length > 0;
                    }
                }
                hmnx.Z(z1, 0x7E);
                ++hmos0.e;
                v7 = hmos0.c;
            }
            else {
                if(hmos0.d != -81) {
                    b = b1;
                label_99:
                    z2 = true;
                }
                else if(!hmpy.S(hmos0.c)) {
                    b = b1;
                label_96:
                    z2 = false;
                }
                else if(b1 != -92) {
                    b = b1;
                    goto label_96;
                }
                else if(this.h[2] != 0) {
                    goto label_96;
                }
                else {
                    goto label_99;
                }
                hmnx.Z(z2, 202);
                hmnx.Z(b != -16, 11);
                int v8 = hmos0.c;
                hmos0.e = 0;
                hmos0.c = b;
                super.i(b, ((byte)v8));
                if(this.r()) {
                    int v9 = arr_hmom[b & 0xFF].b;
                    if(v9 <= 0) {
                        goto label_114;
                    }
                    else if(this.h.length >= v9) {
                        z3 = true;
                    }
                    else {
                        z3 = false;
                    }
                }
                else {
                label_114:
                    int v10 = arr_hmom[b & 0xFF].b;
                    if(v10 <= 0) {
                        z3 = v10 >= 0 || this.h.length >= -v10;
                    }
                    else if(this.h.length == v10) {
                        z3 = true;
                    }
                    else {
                        z3 = false;
                    }
                }
                hmnx.Z(z3, 0x7E);
                v7 = b;
            }
            if(arr_hmom[v7 & 0xFF].a) {
                super.j();
            }
            arr_b5 = super.t(((byte)v7));
            b2 = arr_b5[0];
        }
        catch(hmnj hmnj0) {
            hmnf hmnf0 = this.a;
            int v11 = hmnj0.a;
            String s = hmnj.a(v11);
            if(hmnf0 != null) {
                hmnf0.a(s, hmnj0);
            }
            if(v == 0) {
                if(v11 == 28) {
                    v11 = 0x6D00;
                }
                else if(v11 < 0xFF) {
                    v11 = 27013;
                }
                arr_b5 = new byte[]{((byte)(v11 >> 8 & 0xFF)), ((byte)v11)};
                b2 = -1;
            }
            else {
                b2 = (byte)v11;
                arr_b5 = new byte[]{((byte)v11)};
            }
        }
        this.at(arr_b5);
        hmos hmos1 = this.d;
        hmos1.d = b2;
        if(b2 == 0xFFFFFF83) {
            byte[] arr_b6 = new byte[arr_b5.length];
            System.arraycopy(arr_b5, 2, arr_b6, 0, arr_b5.length - 2);
            arr_b6[arr_b5.length - 2] = 98;
            arr_b6[arr_b5.length - 1] = (byte)0x83;
            arr_b7 = arr_b6;
        }
        else if(v == 0 && b2 == 0) {
            b2 = 0;
            goto label_163;
        }
        else if(v == 0x90) {
        label_163:
            if(v == 0x90 && b2 == 0xFFFFFF86) {
                arr_b7 = new byte[]{106, (byte)0x86};
            }
            else {
                arr_b7 = new byte[arr_b5.length + 1];
                System.arraycopy(arr_b5, 1, arr_b7, 0, arr_b5.length - 1);
                arr_b7[arr_b5.length - 1] = (byte)(v == 0 ? 0x90 : 0x91);
                arr_b7[arr_b5.length] = b2;
            }
        }
        else {
            arr_b7 = arr_b5;
        }
        hmqj hmqj0 = hmqb.a(v == 0, arr_b1, arr_b7, this.h, v == 0x90);
        hmos1.h.add(hmqj0);
        if(hmos1.k) {
            if(this.l) {
                super.Y(false);
                this.l = false;
            }
            else if(this.o != null) {
                try {
                    int v12 = this.n;
                    if(v12 == 5) {
                        this.m = super.al();
                        hmos1.j = false;
                    }
                    else if(v12 != 3) {
                        this.m = super.al();
                        this.o.e(this.m);
                        hmos1.j = false;
                    }
                }
                catch(JSONException jSONException0) {
                    this.a.a(jSONException0.getMessage(), jSONException0);
                }
            }
            this.d.k = false;
        }
        if(b2 != 0 && (b2 != 0xFFFFFF83 && b2 != -81 && b2 != 1)) {
            this.d.d(false, this.i);
            this.d.c(this.i);
            if(!this.e.k()) {
                this.e.f(false, false);
                this.e.c();
                this.e.a = 0;
            }
        }
        return arr_b7;
    }
}

