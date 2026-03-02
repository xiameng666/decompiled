import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class igvm implements ftrr {
    private SecretKey a;
    private SecretKey b;
    private final igvd c;
    private igvc d;
    private final byte[] e;
    private byte f;
    private boolean[] g;
    private SecretKey h;
    private boolean[] i;
    private final byte[] j;
    private final ftrs k;
    private int l;
    private int m;
    private final igvp n;
    private final dqqy o;

    public igvm(igvd igvd0, fsbl fsbl0, ftrs ftrs0, dqqy dqqy0) {
        this.a = null;
        this.b = null;
        this.e = new byte[8];
        this.f = -2;
        this.g = new boolean[3];
        this.j = new byte[8];
        this.c = igvd0;
        this.i = new boolean[igvd0.a()];
        this.a = (SecretKey)fsbl0.a.a;
        this.b = new SecretKeySpec(igvq.h(fsbl0.c.getJSONArray("authKeyB")), "DESede");
        this.k = ftrs0;
        this.o = dqqy0;
        this.l = 0;
        this.m = 0;
        this.n = new igvp();
    }

    @Override  // ftrr
    public final void a() {
        int v = 5;
        int v1 = this.n.a;
        switch(v1) {
            case 0: {
                v = 9;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 1: 
            case 3: {
                break;
            }
            default: {
                v = v1 == 4 ? 2 : 1;
            }
        }
        igvk igvk0 = new igvk(v, this.c, this.k);
        this.o.a(igvk0);
    }

    @Override  // ftrr
    public final byte[] b(byte[] arr_b) {
        igvd igvd1;
        byte b;
        igvc igvc0 = new igvc(arr_b);
        this.d = igvc0;
        int v = 0;
        if(!igvc0.g) {
            return new byte[]{103, 0};
        }
        try {
            if(igvc0.h) {
                int v1 = igvc0.f;
                igvd igvd0 = this.c;
                byte[] arr_b1 = igvd0.i();
                if(v1 == 0 || v1 > arr_b1.length) {
                    v1 = arr_b1.length;
                }
                this.d.g(arr_b1, 0, v1);
                this.f = -2;
                this.i = new boolean[igvd0.a()];
                this.g = new boolean[3];
                this.m = 0;
                this.n.a(0);
                return this.d.e();
            }
            int v2 = igvc.c(igvc0.a, 0);
            switch(v2) {
                case 0x20: {
                    this.n.a(3);
                    if(this.d.d(2) != 0x40) {
                        throw new igvg(27270);
                    }
                    if(!this.g[2]) {
                        throw new igvg(27010);
                    }
                    int v3 = this.f;
                    if(v3 == -2 || v3 == 0) {
                        throw new igvg(27014);
                    }
                    igvc igvc1 = this.d;
                    if(igvc1.e != 8) {
                        throw new igvg(0x6700);
                    }
                    int v4 = this.l;
                    if(v4 < 1000) {
                        this.l = v4 + 1;
                    }
                    if(Arrays.equals(this.c.c[v3].c, igvc1.b)) {
                        this.i[this.f] = true;
                        this.l = 0;
                        return this.d.e();
                    }
                    this.i[this.f] = false;
                    try {
                        Thread.sleep(this.l * 25);
                    }
                    catch(InterruptedException unused_ex) {
                    }
                    throw new igvg(0x6300);
                }
                case 130: {
                    this.n.a(2);
                    boolean[] arr_z = this.g;
                    arr_z[2] = false;
                    arr_z[1] = false;
                    if(!arr_z[0]) {
                        throw new igvg(27010);
                    }
                    arr_z[0] = false;
                    if(this.d.a() != 2 || this.d.b() != 0xFFFFFF81) {
                        throw new igvg(27270);
                    }
                    if(this.d.e != 8) {
                        throw new igvg(0x6700);
                    }
                    try {
                        Cipher cipher0 = Cipher.getInstance("DESede/CBC/NoPadding");
                        cipher0.init(1, this.a, new IvParameterSpec(new byte[8]));
                        byte[] arr_b2 = cipher0.doFinal(this.e);
                    }
                    catch(Exception exception1) {
                        exception1.printStackTrace();
                        throw new igvg(0x6A81);
                    }
                    if(!Arrays.equals(arr_b2, this.d.b)) {
                        throw new igvg(27013);
                    }
                    this.g[1] = true;
                    return this.d.e();
                }
                case 0x84: {
                    this.n.a(2);
                    boolean[] arr_z1 = this.g;
                    arr_z1[0] = false;
                    arr_z1[1] = false;
                    arr_z1[2] = false;
                    if(this.m == 1) {
                        throw new igvg(27014);
                    }
                    this.m = 1;
                    if(this.d.d(2) != 0) {
                        throw new igvg(27270);
                    }
                    if(this.d.f != 8) {
                        throw new igvg(0x6C08);
                    }
                    new SecureRandom().nextBytes(this.e);
                    this.d.g(this.e, 0, 8);
                    this.g[0] = true;
                    return this.d.e();
                }
                case 0x88: {
                    this.n.a(2);
                    boolean[] arr_z2 = this.g;
                    arr_z2[2] = false;
                    arr_z2[0] = false;
                    if(!arr_z2[1]) {
                        throw new igvg(27010);
                    }
                    arr_z2[1] = false;
                    if(this.d.a() != 2 || this.d.b() != 0xFFFFFF82) {
                        throw new igvg(27270);
                    }
                    if(this.d.e != 8) {
                        throw new igvg(0x6700);
                    }
                    byte[] arr_b3 = new byte[16];
                    System.arraycopy(this.e, 4, arr_b3, 0, 4);
                    System.arraycopy(this.d.b, 4, arr_b3, 4, 4);
                    System.arraycopy(this.e, 0, arr_b3, 8, 4);
                    System.arraycopy(this.d.b, 0, arr_b3, 12, 4);
                    for(int v5 = 0; true; ++v5) {
                        if(v5 >= 8) {
                            throw new igvg(27010);
                        }
                        if(arr_b3[v5] != this.d.b[v5]) {
                            break;
                        }
                    }
                    try {
                        Cipher cipher1 = Cipher.getInstance("DESede/CBC/NoPadding");
                        cipher1.init(1, this.b, new IvParameterSpec(new byte[8]));
                        byte[] arr_b4 = new byte[24];
                        cipher1.doFinal(arr_b3, 0, 16, arr_b4, 0);
                        System.arraycopy(arr_b4, 0, arr_b4, 16, 8);
                        this.h = new SecretKeySpec(arr_b4, "DESede");
                        cipher1.init(1, this.b, new IvParameterSpec(new byte[8]));
                        byte[] arr_b5 = cipher1.doFinal(this.d.b);
                        this.d.f(arr_b5);
                        this.g[2] = true;
                        this.m = 0;
                        return this.d.e();
                    }
                    catch(Exception exception2) {
                        exception2.printStackTrace();
                        throw new igvg(0x6A81);
                    }
                }
                case 0xA4: {
                    switch(this.d.d(2)) {
                        case 0: {
                            igvc igvc2 = this.d;
                            if(igvc2.e != 2) {
                                throw new igvg(0x6A87);
                            }
                            byte[] arr_b6 = igvc2.b;
                            if(arr_b6[0] == 1) {
                                if(this.f != -2) {
                                    throw new igvg(27014);
                                }
                                int v6 = this.c.a();
                                if(arr_b6[1] >= v6) {
                                    throw new igvg(0x6A82);
                                }
                                this.f = this.d.b[1];
                                return this.d.e();
                            }
                            this.f = -2;
                            return this.d.e();
                        }
                        case 0x800: {
                            int v7 = this.d.d(5);
                            igvc igvc3 = this.d;
                            switch(igvc3.e) {
                                case 2: {
                                    goto label_137;
                                }
                                case 4: {
                                    goto label_146;
                                }
                            }
                            throw new igvg(0x6A87);
                        label_137:
                            if(v7 == 0xFFFFDF10) {
                                b = -2;
                                goto label_150;
                            }
                            if((v7 & 0xFFFFFF00) != 0x100) {
                                throw new igvg(0x6A80);
                            }
                            if(this.f != -2) {
                                throw new igvg(27014);
                            }
                            b = (byte)(v7 & 0xFF);
                            goto label_150;
                        label_146:
                            if(v7 == 0xFFFFDF10) {
                                byte[] arr_b7 = igvc3.b;
                                if(arr_b7[2] == 1) {
                                    b = arr_b7[3];
                                label_150:
                                    if(b != -2 && b >= this.c.a()) {
                                        throw new igvg(0x6A82);
                                    }
                                    int v8 = this.f;
                                    if(b != v8 && v8 >= 0) {
                                        this.i[v8] = false;
                                    }
                                    this.f = b;
                                    return this.d.e();
                                }
                            }
                            throw new igvg(0x6A80);
                        }
                        default: {
                            throw new igvg(27270);
                        }
                    }
                }
                case 0xB0: {
                    this.n.a(1);
                    this.e(false);
                    return this.d.e();
                }
                case 1200: {
                    this.n.a(1);
                    this.e(true);
                    return this.d.e();
                }
                case 0x4D6: {
                    igvd1 = this.c;
                    int v9 = igvd1.a() - 2;
                    if(this.f < v9) {
                        this.n.a(3);
                    }
                    else {
                        this.n.a(4);
                    }
                    break;
                }
                default: {
                    throw (v2 & 0xFFFFFF00) == 0 || (v2 & 0xFFFFFF00) == 0x400 ? new igvg(0x6D00) : new igvg(0x6E00);
                }
            }
            int v10 = igvd1.a();
            if(this.f >= v10) {
                throw new igvg(27014);
            }
            if(!this.i[this.f]) {
                throw new igvg(27010);
            }
            if(this.d.a() != 0xFFFFFF81) {
                throw new igvg(27270);
            }
            int v11 = this.d.b() & 0xFF;
            igvc igvc4 = this.d;
            int v12 = igvc4.e;
            if(v12 < 9) {
                throw new igvg(0x6700);
            }
            this.d(igvc4.b, 0, v12 - 8);
            byte[] arr_b8 = Arrays.copyOfRange(this.d.b, v12 - 8, v12);
            if(!Arrays.equals(this.j, arr_b8)) {
                throw new igvg(27010);
            }
            igvo igvo0 = igvd1.c[this.f];
            byte[] arr_b9 = igvo0.a;
            if(v11 >= arr_b9.length) {
                throw new igvg(0x6B00);
            }
            if(v11 + (v12 - 8) > arr_b9.length) {
                throw new igvg(0x6700);
            }
            System.arraycopy(this.d.b, 0, arr_b9, v11, v12 - 8);
            igvo0.b = true;
            return this.d.e();
        }
        catch(Exception exception0) {
            if(exception0.getMessage() != null) {
                this.k.a("Unexpected error", exception0);
            }
            if((exception0 instanceof igvg)) {
                igvc igvc5 = this.d;
                int v13 = ((igvg)exception0).a;
                int v14 = igvc5.d;
                if(v14 >= 0xFE) {
                    igvc5.d = 0;
                }
                else {
                    v = v14;
                }
                igvc5.d = v + 1;
                igvc5.c[v] = (byte)(v13 >> 8);
                igvc5.d = v + 2;
                igvc5.c[v + 1] = (byte)(v13 & 0xFF);
                return Arrays.copyOf(igvc5.c, v + 2);
            }
            return new byte[]{0x6F, 0};
        }
    }

    private final int c(byte b, int v, int v1) {
        int v2 = this.d.f;
        if(this.d.a() != b) {
            throw new igvg(27270);
        }
        if(v >= v1) {
            throw new igvg(0x6B00);
        }
        if(v + v2 <= v1) {
            return v2 == 0 ? ((short)(v1 - v)) : v2;
        }
        throw new igvg(0x6700);
    }

    private final void d(byte[] arr_b, int v, int v1) {
        try {
            int v2 = (v1 - 1 >> 3) + 1 << 3;
            byte[] arr_b1 = new byte[v2];
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
            Cipher cipher0 = Cipher.getInstance("DESede/CBC/NoPadding");
            cipher0.init(1, this.h, new IvParameterSpec(new byte[8]));
            System.arraycopy(cipher0.doFinal(arr_b1), v2 - 8, this.j, 0, 8);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            throw new igvg(0x6A81);
        }
    }

    private final void e(boolean z) {
        int v = this.d.b() & 0xFF;
        if(z && !this.g[2]) {
            throw new igvg(27010);
        }
        int v1 = this.f;
        if(v1 != -2) {
            byte[] arr_b = this.c.c[v1].a;
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, arr_b.length);
            this.f(arr_b1, v, this.c((byte)0x81, v, arr_b1.length), z);
            return;
        }
        int v2 = this.c((byte)0x8F, v + 2, 25);
        this.f(igvd.a, v + 2, v2, z);
    }

    private final void f(byte[] arr_b, int v, int v1, boolean z) {
        if(z) {
            this.d(arr_b, v, v1);
            this.d.g(arr_b, v, v1);
            this.d.f(this.j);
            return;
        }
        this.d.g(arr_b, v, v1);
    }
}

