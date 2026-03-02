import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import jeb.synthetic.FIN;

public final class tyq implements tym {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public tyo f;
    public Bitmap g;
    public Boolean h;
    public Bitmap.Config i;
    public final umk j;
    private int[] k;
    private final int[] l;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;

    static {
    }

    public tyq(umk umk0, tyo tyo0, ByteBuffer byteBuffer0, int v) {
        this.l = new int[0x100];
        this.i = Bitmap.Config.ARGB_8888;
        this.j = umk0;
        this.f = new tyo();
        this.c(tyo0, byteBuffer0, v);
    }

    @Override  // tym
    public final Bitmap a() {
        int[] arr_v7;
        int v98;
        int v94;
        int v92;
        int v79;
        int v76;
        int v72;
        boolean z;
        int v56;
        int v55;
        int v39;
        byte[] arr_b4;
        int v31;
        int v3;
        synchronized(this) {
            if(this.f.c <= 0 || this.e < 0) {
                this.q = 1;
            }
            if(this.q != 1 && this.q != 2) {
                this.q = 0;
                if(this.b == null) {
                    this.b = this.j.c(0xFF);
                }
                tyn tyn0 = (tyn)this.f.e.get(this.e);
                int v1 = this.e - 1;
                tyn tyn1 = v1 < 0 ? null : ((tyn)this.f.e.get(v1));
                int[] arr_v = tyn0.k == null ? this.f.a : tyn0.k;
                this.k = arr_v;
                if(arr_v == null) {
                    this.q = 1;
                    return null;
                }
                if(tyn0.f) {
                    System.arraycopy(arr_v, 0, this.l, 0, 0x100);
                    this.k = this.l;
                    this.l[tyn0.h] = 0;
                    if(tyn0.g == 2 && this.e == 0) {
                        this.h = Boolean.valueOf(true);
                    }
                }
                int[] arr_v1 = this.d;
                if(tyn1 == null) {
                    Bitmap bitmap0 = this.g;
                    if(bitmap0 != null) {
                        this.j.a(bitmap0);
                    }
                    this.g = null;
                    Arrays.fill(arr_v1, 0);
                }
                if(tyn1 != null && tyn1.g == 3 && this.g == null) {
                    Arrays.fill(arr_v1, 0);
                }
                if(tyn1 != null) {
                    int v2 = tyn1.g;
                    if(v2 > 0) {
                        if(v2 == 2) {
                            if(tyn0.f) {
                                v3 = 0;
                            }
                            else {
                                v3 = this.f.l;
                                if(tyn0.k != null && this.f.j == tyn0.h) {
                                    v3 = 0;
                                }
                            }
                            int v4 = this.r;
                            int v5 = tyn1.d / v4;
                            int v6 = tyn1.b / v4;
                            int v7 = tyn1.c / v4;
                            int v8 = this.t;
                            int v9 = v6 * v8 + tyn1.a / v4;
                            for(int v10 = v9; v10 < v9 + v5 * v8; v10 += this.t) {
                                for(int v11 = v10; v11 < v10 + v7; ++v11) {
                                    arr_v1[v11] = v3;
                                }
                            }
                        }
                        else if(v2 == 3) {
                            Bitmap bitmap1 = this.g;
                            if(bitmap1 != null) {
                                bitmap1.getPixels(arr_v1, 0, this.t, 0, 0, this.t, this.s);
                            }
                        }
                    }
                }
                if(tyn0 != null) {
                    this.a.position(tyn0.j);
                }
                int v12 = tyn0 == null ? this.f.f * this.f.g : tyn0.d * tyn0.c;
                if(this.c == null || this.c.length < v12) {
                    this.c = this.j.c(v12);
                }
                byte[] arr_b = this.c;
                if(this.m == null) {
                    this.m = new short[0x1000];
                }
                short[] arr_v2 = this.m;
                if(this.n == null) {
                    this.n = new byte[0x1000];
                }
                byte[] arr_b1 = this.n;
                if(this.o == null) {
                    this.o = new byte[0x1001];
                }
                byte[] arr_b2 = this.o;
                int v13 = this.d();
                int v14 = (1 << v13) + 1;
                int v15 = (1 << v13) + 2;
                int v16 = (1 << v13 + 1) - 1;
                for(int v17 = 0; v17 < 1 << v13; ++v17) {
                    arr_v2[v17] = 0;
                    arr_b1[v17] = (byte)v17;
                }
                byte[] arr_b3 = this.b;
                int v18 = 0;
                int v19 = 0;
                int v20 = 0;
                int v21 = 0;
                int v22 = 0;
                int v23 = 0;
                int v24 = 0;
                int v25 = 0;
                int v26 = v13 + 1;
                int v27 = v15;
                int v28 = v16;
                int v29 = -1;
                while(v18 < v12) {
                    if(v19 == 0) {
                        int v30 = this.d();
                        if(v30 <= 0) {
                            v19 = 0;
                            v31 = v18;
                            arr_b4 = arr_b3;
                        }
                        else {
                            v31 = v18;
                            arr_b4 = arr_b3;
                            v19 = v30;
                            this.a.get(this.b, 0, Math.min(v30, this.a.remaining()));
                        }
                        if(v19 <= 0) {
                            this.q = 3;
                        }
                        else {
                            v22 = 0;
                            goto label_119;
                        }
                        break;
                    }
                    v31 = v18;
                    arr_b4 = arr_b3;
                label_119:
                    v21 += (arr_b4[v22] & 0xFF) << v20;
                    ++v22;
                    --v19;
                    int v32 = v20 + 8;
                    int v33 = v27;
                    int v34 = v26;
                    int v35 = v24;
                    int v36 = v31;
                    while(true) {
                        if(v32 >= v34) {
                            int v37 = v21 & v28;
                            v21 >>= v34;
                            int v38 = v32 - v34;
                            if(v37 == 1 << v13) {
                                v34 = v13 + 1;
                                v33 = v15;
                                v28 = v16;
                                v29 = -1;
                                v32 = v38;
                                continue;
                            }
                            else if(v37 == v14) {
                                v24 = v35;
                                v26 = v34;
                                v18 = v36;
                                v20 = v38;
                                arr_b3 = arr_b4;
                                break;
                            }
                            else {
                                ++v36;
                                if(v29 == -1) {
                                    arr_b[v23] = arr_b1[v37];
                                    v35 = v37;
                                    v29 = v35;
                                    v32 = v38;
                                    ++v23;
                                }
                                else {
                                    if(v37 >= v33) {
                                        arr_b2[v25] = (byte)v35;
                                        ++v25;
                                        v39 = v29;
                                    }
                                    else {
                                        v39 = v37;
                                    }
                                    while(v39 >= 1 << v13) {
                                        arr_b2[v25] = arr_b1[v39];
                                        v39 = arr_v2[v39];
                                        ++v25;
                                    }
                                    int v40 = arr_b1[v39] & 0xFF;
                                    byte b = (byte)v40;
                                    arr_b[v23] = b;
                                    ++v23;
                                    while(v25 > 0) {
                                        --v25;
                                        arr_b[v23] = arr_b2[v25];
                                        ++v36;
                                        ++v23;
                                    }
                                    if(v33 < 0x1000) {
                                        arr_v2[v33] = (short)v29;
                                        arr_b1[v33] = b;
                                        ++v33;
                                        if((v33 & v28) == 0 && v33 < 0x1000) {
                                            v28 += v33;
                                            ++v34;
                                        }
                                    }
                                    v35 = v40;
                                    v29 = v37;
                                    v32 = v38;
                                }
                                v14 = v14;
                                continue;
                            }
                        }
                        v24 = v35;
                        v26 = v34;
                        v18 = v36;
                        v20 = v32;
                        arr_b3 = arr_b4;
                        break;
                    }
                    v27 = v33;
                }
                Arrays.fill(arr_b, v23, v12, 0);
                if(!tyn0.e && this.r == 1) {
                    int[] arr_v3 = this.d;
                    int v41 = tyn0.d;
                    int v42 = tyn0.b;
                    int v43 = tyn0.c;
                    int v44 = tyn0.a;
                    int v45 = this.e;
                    int v46 = this.t;
                    byte[] arr_b5 = this.c;
                    int[] arr_v4 = this.k;
                    int v47 = 0;
                    int v48 = -1;
                    while(v47 < v41) {
                        int v49 = (v47 + v42) * v46;
                        int v50 = v49 + v44;
                        int v51 = v50 + v43;
                        int v52 = v49 + v46;
                        int v53 = tyn0.c * v47;
                        int v54 = v50;
                        while(true) {
                            if(v52 < v51) {
                                v55 = v41;
                                v56 = v52;
                            }
                            else {
                                v55 = v41;
                                v56 = v51;
                            }
                            if(v54 >= v56) {
                                break;
                            }
                            int v57 = arr_b5[v53];
                            int v58 = v57 & 0xFF;
                            if(v58 != v48) {
                                int v59 = arr_v4[v58];
                                if(v59 == 0) {
                                    v48 = v57;
                                }
                                else {
                                    arr_v3[v54] = v59;
                                }
                            }
                            ++v54;
                            ++v53;
                            v41 = v55;
                        }
                        ++v47;
                        arr_v3 = arr_v3;
                        v41 = v55;
                    }
                    if(this.h != null && this.h.booleanValue()) {
                        z = true;
                    }
                    else if(this.h != null || v45 != 0 || v48 == -1) {
                        z = false;
                    }
                    else {
                        z = true;
                    }
                    this.h = Boolean.valueOf(z);
                }
                else {
                    int[] arr_v5 = this.d;
                    int v60 = this.r;
                    int v61 = tyn0.d / v60;
                    int v62 = tyn0.b / v60;
                    int v63 = tyn0.c / v60;
                    int v64 = tyn0.a / v60;
                    int v65 = this.e;
                    int v66 = this.t;
                    int v67 = this.s;
                    byte[] arr_b6 = this.c;
                    int[] arr_v6 = this.k;
                    Boolean boolean0 = this.h;
                    int v68 = 8;
                    int v69 = 0;
                    int v70 = 0;
                    int v71 = 1;
                    while(v70 < v61) {
                        if(tyn0.e) {
                            if(v69 >= v61) {
                                v72 = v69;
                                switch(v71 + 1) {
                                    case 2: {
                                        v72 = 4;
                                        v71 = 2;
                                        break;
                                    }
                                    case 3: {
                                        v68 = 4;
                                        v71 = 3;
                                        v72 = 2;
                                        break;
                                    }
                                    case 4: {
                                        v71 = 4;
                                        v68 = 2;
                                        v72 = 1;
                                        break;
                                    }
                                    default: {
                                        ++v71;
                                    }
                                }
                            }
                            else {
                                v72 = v69;
                            }
                            v69 = v72 + v68;
                        }
                        else {
                            v72 = v70;
                        }
                        int v73 = v72 + v62;
                        if(v73 < v67) {
                            int v74 = v73 * v66;
                            int v75 = v74 + v64;
                            v76 = v69;
                            int v77 = v75 + v63;
                            int v78 = v74 + v66;
                            v79 = v61;
                            int v80 = v70 * v60 * tyn0.c;
                            if(v78 < v77) {
                                v77 = v78;
                            }
                            if(v60 == 1) {
                                int v81 = v75;
                                while(v81 < v77) {
                                    int v82 = arr_v6[arr_b6[v80] & 0xFF];
                                    if(v82 != 0) {
                                        arr_v5[v81] = v82;
                                    }
                                    else if(v65 == 0 && boolean0 == null) {
                                        boolean0 = Boolean.valueOf(true);
                                    }
                                    ++v81;
                                    ++v80;
                                }
                            }
                            else {
                                int v83 = v80 + (v77 - v75) * v60;
                                int v84 = v75;
                                while(v84 < v77) {
                                    int v85 = tyn0.c;
                                    int v86 = v80;
                                    int v87 = 0;
                                    int v88 = 0;
                                    int v89 = 0;
                                    int v90 = 0;
                                    int v91 = 0;
                                    while(true) {
                                        if(v86 < v80 + this.r) {
                                            byte[] arr_b7 = this.c;
                                            v92 = v84;
                                            if(v86 < arr_b7.length && v86 < v83) {
                                                int v93 = this.k[arr_b7[v86] & 0xFF];
                                                if(v93 == 0) {
                                                    v94 = v86;
                                                }
                                                else {
                                                    v94 = v86;
                                                    v87 += v93 >> 24 & 0xFF;
                                                    v88 += v93 >> 16 & 0xFF;
                                                    v89 += v93 >> 8 & 0xFF;
                                                    v90 += v93 & 0xFF;
                                                    ++v91;
                                                }
                                                v86 = v94 + 1;
                                                v84 = v92;
                                                continue;
                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        v92 = v84;
                                        break;
                                    }
                                    int v95 = v80 + v85;
                                    int v96 = v95;
                                    while(v96 < this.r + v95) {
                                        byte[] arr_b8 = this.c;
                                        if(v96 >= arr_b8.length || v96 >= v83) {
                                            break;
                                        }
                                        int v97 = this.k[arr_b8[v96] & 0xFF];
                                        if(v97 == 0) {
                                            v98 = v83;
                                        }
                                        else {
                                            v98 = v83;
                                            v87 += v97 >> 24 & 0xFF;
                                            v88 += v97 >> 16 & 0xFF;
                                            v89 += v97 >> 8 & 0xFF;
                                            v90 += v97 & 0xFF;
                                            ++v91;
                                        }
                                        ++v96;
                                        v95 = v95;
                                        v83 = v98;
                                    }
                                    int v99 = v91 == 0 ? 0 : v87 / v91 << 24 | v88 / v91 << 16 | v89 / v91 << 8 | v90 / v91;
                                    if(v99 != 0) {
                                        arr_v5[v92] = v99;
                                    }
                                    else if(v65 == 0 && boolean0 == null) {
                                        boolean0 = Boolean.valueOf(true);
                                    }
                                    v80 += v60;
                                    v84 = v92 + 1;
                                    v77 = v77;
                                    v60 = v60;
                                    v83 = v83;
                                }
                            }
                        }
                        else {
                            v76 = v69;
                            v79 = v61;
                        }
                        ++v70;
                        v62 = v62;
                        v69 = v76;
                        v61 = v79;
                        v60 = v60;
                    }
                    if(this.h == null) {
                        this.h = Boolean.valueOf((boolean0 == null ? false : boolean0.booleanValue()));
                    }
                }
                if(this.p && (tyn0.g == 0 || tyn0.g == 1)) {
                    if(this.g == null) {
                        this.g = this.e();
                    }
                    arr_v7 = arr_v1;
                    this.g.setPixels(arr_v7, 0, this.t, 0, 0, this.t, this.s);
                }
                else {
                    arr_v7 = arr_v1;
                }
                Bitmap bitmap2 = this.e();
                bitmap2.setPixels(arr_v7, 0, this.t, 0, 0, this.t, this.s);
                return bitmap2;
            }
        }
        return null;
    }

    @Override  // tym
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final void c(tyo tyo0, ByteBuffer byteBuffer0, int v) {
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        if(v > 0) {
            int v2 = Integer.highestOneBit(v);
            this.q = 0;
            this.f = tyo0;
            this.e = -1;
            ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
            this.a = byteBuffer1;
            byteBuffer1.position(0);
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            for(Object object0: tyo0.e) {
                if(((tyn)object0).g == 3) {
                    this.p = true;
                }
                else {
                    continue;
                }
                break;
            }
            this.r = v2;
            int v3 = tyo0.f;
            this.t = v3 / v2;
            int v4 = tyo0.g;
            this.s = v4 / v2;
            this.c = this.j.c(v3 * v4);
            int v5 = this.t * this.s;
            ues ues0 = this.j.b;
            this.d = ues0 == null ? new int[v5] : ((int[])ues0.a(v5, int[].class));
            FIN.finallyCodeBegin$NT(v1);
            return;
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + v);
    }

    private final int d() {
        return this.a.get() & 0xFF;
    }

    private final Bitmap e() {
        Bitmap bitmap0 = this.j.a.b(this.t, this.s, (this.h == null || this.h.booleanValue() ? Bitmap.Config.ARGB_8888 : this.i));
        bitmap0.setHasAlpha(true);
        return bitmap0;
    }
}

