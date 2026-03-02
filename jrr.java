import java.util.ArrayList;
import java.util.Arrays;

public final class jrr extends jrv {
    public int a;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public jro[] aH;
    public int aI;
    private final ArrayList aW;
    private jro[] aX;
    private jro[] aY;
    private int[] aZ;
    public int as;
    public int at;
    public float au;
    public float av;
    public float aw;
    public float ax;
    public float ay;
    public float az;
    public int b;
    public int c;
    public int d;

    public jrr() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.as = -1;
        this.at = -1;
        this.au = 0.5f;
        this.av = 0.5f;
        this.aw = 0.5f;
        this.ax = 0.5f;
        this.ay = 0.5f;
        this.az = 0.5f;
        this.aA = 0;
        this.aB = 0;
        this.aC = 2;
        this.aD = 2;
        this.aE = 0;
        this.aF = -1;
        this.aG = 0;
        this.aW = new ArrayList();
        this.aX = null;
        this.aY = null;
        this.aZ = null;
        this.aI = 0;
    }

    @Override  // jrv
    public final void W(int v, int v1, int v2, int v3) {
        int v101;
        int v93;
        int v80;
        int v79;
        int v77;
        jrn jrn14;
        int v66;
        boolean z;
        int v58;
        int v56;
        int v52;
        int v44;
        int v32;
        jro jro4;
        int v27;
        jrq jrq0;
        int v23;
        int v22;
        int v21;
        int v20;
        int v18;
        int v7;
        if(this.aK > 0) {
            jss jss0 = this.V == null ? null : ((jrp)this.V).aI;
            if(jss0 != null) {
                int v4 = 0;
                while(v4 < this.aK) {
                    jro jro0 = this.aJ[v4];
                    if(jro0 != null && !(jro0 instanceof jrs)) {
                        int v5 = jro0.O(0);
                        int v6 = jro0.O(1);
                        if(v5 != 3 || jro0.t == 1 || v6 != 3) {
                            v7 = v6;
                        label_14:
                            if(v5 == 3) {
                                v5 = 2;
                            }
                            if(v6 == 3) {
                                v7 = 2;
                            }
                            this.aU.i = v5;
                            this.aU.j = v7;
                            this.aU.a = jro0.j();
                            this.aU.b = jro0.h();
                            jss0.a(jro0, this.aU);
                            jro0.F(this.aU.c);
                            jro0.A(this.aU.d);
                            jro0.x(this.aU.e);
                        }
                        else if(jro0.u == 1) {
                            v7 = 3;
                            goto label_14;
                        }
                    }
                    ++v4;
                }
                goto label_32;
            }
            this.Z(0, 0);
            this.aR = false;
            return;
        }
    label_32:
        int v8 = this.aP;
        int v9 = this.aQ;
        int v10 = this.aL;
        int v11 = this.aM;
        int v12 = 0;
        int v13 = 0;
        int v14 = v1 - v8 - v9;
        int v15 = this.aG;
        if(v15 == 1) {
            v14 = v3 - v10 - v11;
            v15 = 1;
        }
        if(v15 == 0) {
            if(this.a == -1) {
                this.a = 0;
            }
            if(this.b == -1) {
                this.b = 0;
            }
        }
        else {
            if(this.a == -1) {
                this.a = 0;
            }
            if(this.b == -1) {
                this.b = 0;
            }
        }
        jro[] arr_jro = this.aJ;
        int v17 = 0;
        for(int v16 = 0; true; ++v16) {
            v18 = this.aK;
            if(v16 >= v18) {
                break;
            }
            if(this.aJ[v16].ai == 8) {
                ++v17;
            }
        }
        if(v17 > 0) {
            arr_jro = new jro[v18 - v17];
            int v19 = 0;
            v18 = 0;
            while(v19 < this.aK) {
                jro jro1 = this.aJ[v19];
                if(jro1.ai != 8) {
                    arr_jro[v18] = jro1;
                    ++v18;
                }
                ++v19;
                v8 = v8;
            }
        }
        jro[] arr_jro1 = arr_jro;
        this.aH = arr_jro1;
        this.aI = v18;
        switch(this.aE) {
            case 0: {
                v20 = v9;
                v21 = v10;
                v22 = v11;
                v23 = v8;
                int v24 = this.aG;
                if(v18 != 0) {
                    ArrayList arrayList0 = this.aW;
                    if(arrayList0.size() == 0) {
                        jrq0 = new jrq(this, v24, this.K, this.L, this.M, this.N, v14);
                        arrayList0.add(jrq0);
                    }
                    else {
                        jrq jrq1 = (jrq)arrayList0.get(0);
                        jrq1.b = 0;
                        jrq1.a = null;
                        jrq1.c = 0;
                        jrq1.d = 0;
                        jrq1.e = 0;
                        jrq1.f = 0;
                        jrq1.g = 0;
                        jrq1.f(v24, this.K, this.L, this.M, this.N, this.aP, this.aL, this.aQ, this.aM, v14);
                        jrq0 = jrq1;
                    }
                    for(int v25 = 0; v25 < v18; ++v25) {
                        jrq0.c(arr_jro1[v25]);
                    }
                    v12 = jrq0.b();
                    v13 = jrq0.a();
                }
                break;
            }
            case 1: {
                v20 = v9;
                v21 = v10;
                v22 = v11;
                v23 = v8;
                int v26 = this.aG;
                if(v18 != 0) {
                    ArrayList arrayList1 = this.aW;
                    arrayList1.clear();
                    jrn jrn0 = this.K;
                    jrn jrn1 = this.L;
                    jrn jrn2 = this.M;
                    jrn jrn3 = this.N;
                    jrq jrq2 = new jrq(this, v26, jrn0, jrn1, jrn2, jrn3, v14);
                    arrayList1.add(jrq2);
                    if(v26 == 0) {
                        v27 = 0;
                        int v28 = 0;
                        int v29 = 0;
                        while(v28 < v18) {
                            int v30 = v27;
                            jro jro2 = arr_jro1[v28];
                            int v31 = this.c(jro2, v14);
                            jro jro3 = jro2;
                            if(jro3.P() == 3) {
                                ++v30;
                            }
                            if((v29 == v14 || this.aA + v29 + v31 > v14) && jrq2.a != null || v28 > 0 && (this.aF > 0 && v28 % this.aF == 0)) {
                                jrn0 = jrn0;
                                jrq2 = new jrq(this, 0, jrn0, jrn1, jrn2, jrn3, v14);
                                jrq2.e = v28;
                                arrayList1.add(jrq2);
                                v29 = v31;
                                jro4 = jro3;
                            }
                            else {
                                jro4 = jro3;
                                jrn0 = jrn0;
                                if(v28 > 0) {
                                    v29 += this.aA + v31;
                                    jrq2 = jrq2;
                                }
                                else {
                                    v29 = v31;
                                }
                            }
                            jrq2.c(jro4);
                            ++v28;
                            v27 = v30;
                        }
                        v32 = 0;
                    }
                    else {
                        v32 = v26;
                        int v33 = 0;
                        int v34 = 0;
                        int v35 = 0;
                        while(v34 < v18) {
                            jro jro5 = arr_jro1[v34];
                            int v36 = this.a(jro5, v14);
                            int v37 = jro5.Q() == 3 ? v35 + 1 : v35;
                            if((v33 == v14 || this.aB + v33 + v36 > v14) && jrq2.a != null || v34 > 0 && (this.aF > 0 && v34 % this.aF == 0)) {
                                jrn0 = jrn0;
                                jrq2 = new jrq(this, v32, jrn0, jrn1, jrn2, jrn3, v14);
                                jrq2.e = v34;
                                arrayList1.add(jrq2);
                            }
                            else {
                                jrn0 = jrn0;
                                if(v34 > 0) {
                                    v33 += this.aB + v36;
                                    goto label_173;
                                }
                            }
                            v33 = v36;
                        label_173:
                            jrq2.c(jro5);
                            ++v34;
                            v35 = v37;
                            arr_jro1 = arr_jro1;
                        }
                        v27 = v35;
                    }
                    int v38 = arrayList1.size();
                    int v39 = this.aP;
                    int v40 = this.aL;
                    int v41 = this.aQ;
                    int v42 = this.aM;
                    if(v27 > 0 && (this.P() == 2 || this.Q() == 2)) {
                        for(int v43 = 0; v43 < v38; v43 = v44 + 1) {
                            jrq jrq3 = (jrq)arrayList1.get(v43);
                            if(v32 == 0) {
                                v44 = v43;
                                jrq3.e(v14 - jrq3.b());
                            }
                            else {
                                v44 = v43;
                                jrq3.e(v14 - jrq3.a());
                            }
                        }
                    }
                    jrn jrn4 = jrn1;
                    jrn jrn5 = jrn3;
                    int v45 = v39;
                    int v46 = v40;
                    int v47 = v41;
                    int v48 = v42;
                    jrn jrn6 = jrn0;
                    int v49 = 0;
                    int v50 = 0;
                    int v51 = 0;
                    jrn jrn7 = jrn2;
                    while(v49 < v38) {
                        jrq jrq4 = (jrq)arrayList1.get(v49);
                        if(v32 == 0) {
                            if(v49 < v38 - 1) {
                                jrn5 = ((jrq)arrayList1.get(v49 + 1)).a.L;
                                v48 = 0;
                            }
                            else {
                                jrn5 = jrn3;
                                v48 = this.aM;
                            }
                            jrn jrn8 = jrq4.a.N;
                            jrq4.f(0, jrn6, jrn4, jrn7, jrn5, v45, v46, v47, v48, v14);
                            v50 = Math.max(v50, jrq4.b());
                            v51 += jrq4.a();
                            v51 = v49 <= 0 ? v51 + jrq4.a() : v51 + this.aB;
                            jrn4 = jrn8;
                            v52 = 0;
                            v46 = 0;
                        }
                        else {
                            if(v49 < v38 - 1) {
                                jrn7 = ((jrq)arrayList1.get(v49 + 1)).a.K;
                                v47 = 0;
                            }
                            else {
                                jrn7 = jrn2;
                                v47 = this.aQ;
                            }
                            jrn jrn9 = jrq4.a.M;
                            v52 = v32;
                            jrq4.f(v52, jrn6, jrn4, jrn7, jrn5, v45, v46, v47, v48, v14);
                            v50 += jrq4.b();
                            v51 = Math.max(v51, jrq4.a());
                            if(v49 > 0) {
                                v50 += this.aA;
                            }
                            jrn6 = jrn9;
                            v45 = 0;
                        }
                        ++v49;
                        v32 = v52;
                    }
                    v12 = v50;
                    v13 = v51;
                }
                break;
            }
            case 2: {
                v20 = v9;
                v21 = v10;
                v22 = v11;
                v23 = v8;
                int v53 = this.aG;
                if(v53 == 0) {
                    int v54 = this.aF;
                    if(v54 <= 0) {
                        v56 = 0;
                        int v57 = 0;
                        for(int v55 = 0; v55 < v18; ++v55) {
                            if(v55 > 0) {
                                v57 += this.aA;
                            }
                            jro jro6 = arr_jro1[v55];
                            if(jro6 != null) {
                                v57 += this.c(jro6, v14);
                                if(v57 > v14) {
                                    break;
                                }
                                ++v56;
                            }
                        }
                    }
                    else {
                        v56 = v54;
                    }
                    v58 = 0;
                }
                else {
                    int v59 = this.aF;
                    if(v59 <= 0) {
                        int v61 = 0;
                        v58 = 0;
                        for(int v60 = 0; v60 < v18; ++v60) {
                            if(v60 > 0) {
                                v61 += this.aB;
                            }
                            jro jro7 = arr_jro1[v60];
                            if(jro7 != null) {
                                v61 += this.a(jro7, v14);
                                if(v61 > v14) {
                                    break;
                                }
                                ++v58;
                            }
                        }
                    }
                    else {
                        v58 = v59;
                    }
                    v56 = 0;
                }
                if(this.aZ == null) {
                    this.aZ = new int[2];
                }
                if(v58 == 0 && v53 == 1) {
                    z = true;
                }
                else if(v56 != 0 || v53 != 0) {
                    z = false;
                }
                else {
                    z = true;
                }
                while(!z) {
                    if(v53 == 0) {
                        v58 = (int)Math.ceil(((float)v18) / ((float)v56));
                    }
                    else {
                        v56 = (int)Math.ceil(((float)v18) / ((float)v58));
                    }
                    jro[] arr_jro2 = this.aY;
                    if(arr_jro2 != null && arr_jro2.length >= v56) {
                        Arrays.fill(arr_jro2, null);
                    }
                    else {
                        this.aY = new jro[v56];
                    }
                    jro[] arr_jro3 = this.aX;
                    if(arr_jro3 != null && arr_jro3.length >= v58) {
                        Arrays.fill(arr_jro3, null);
                    }
                    else {
                        this.aX = new jro[v58];
                    }
                    for(int v62 = 0; v62 < v56; ++v62) {
                        int v63 = 0;
                        while(v63 < v58) {
                            int v64 = v53 == 1 ? v62 * v58 + v63 : v63 * v56 + v62;
                            if(v64 < arr_jro1.length) {
                                jro jro8 = arr_jro1[v64];
                                if(jro8 == null) {
                                    v66 = v53;
                                }
                                else {
                                    int v65 = this.c(jro8, v14);
                                    jro[] arr_jro4 = this.aY;
                                    jro jro9 = arr_jro4[v62];
                                    v66 = v53;
                                    if(jro9 == null || jro9.j() < v65) {
                                        arr_jro4[v62] = jro8;
                                    }
                                    int v67 = this.a(jro8, v14);
                                    jro[] arr_jro5 = this.aX;
                                    jro jro10 = arr_jro5[v63];
                                    if(jro10 == null || jro10.h() < v67) {
                                        arr_jro5[v63] = jro8;
                                    }
                                }
                            }
                            else {
                                v66 = v53;
                            }
                            ++v63;
                            v53 = v66;
                        }
                    }
                    int v69 = 0;
                    for(int v68 = 0; v68 < v56; ++v68) {
                        jro jro11 = this.aY[v68];
                        if(jro11 != null) {
                            if(v68 > 0) {
                                v69 += this.aA;
                            }
                            v69 += this.c(jro11, v14);
                        }
                    }
                    int v71 = 0;
                    for(int v70 = 0; v70 < v58; ++v70) {
                        jro jro12 = this.aX[v70];
                        if(jro12 != null) {
                            if(v70 > 0) {
                                v71 += this.aB;
                            }
                            v71 += this.a(jro12, v14);
                        }
                    }
                    v12 = v69;
                    v13 = v71;
                    if(v53 != 0) {
                        if(v71 > v14 && v58 > 1) {
                            --v58;
                            goto label_371;
                        }
                    }
                    else if(v69 > v14 && v56 > 1) {
                        --v56;
                        goto label_371;
                    }
                    z = true;
                label_371:
                    v53 = v53;
                }
                int[] arr_v = this.aZ;
                arr_v[0] = v56;
                arr_v[1] = v58;
                break;
            }
            case 3: {
                int v72 = this.aG;
                if(v18 == 0) {
                label_532:
                    v20 = v9;
                    v21 = v10;
                    v22 = v11;
                    v23 = v8;
                }
                else {
                    ArrayList arrayList2 = this.aW;
                    arrayList2.clear();
                    jrn jrn10 = this.K;
                    jrn jrn11 = this.L;
                    jrn jrn12 = this.M;
                    jrn jrn13 = this.N;
                    v21 = v10;
                    v22 = v11;
                    int v73 = v8;
                    v20 = v9;
                    jrq jrq5 = new jrq(this, v72, jrn10, jrn11, jrn12, jrn13, v14);
                    arrayList2.add(jrq5);
                    if(v72 == 0) {
                        jrn14 = jrn10;
                        int v74 = 0;
                        int v75 = 0;
                        int v76 = 0;
                        v77 = 0;
                        while(v74 < v18) {
                            jro jro13 = arr_jro1[v74];
                            int v78 = this.c(jro13, v14);
                            if(jro13.P() == 3) {
                                ++v77;
                            }
                            if((v75 == v14 || this.aA + v75 + v78 > v14) && jrq5.a != null || v74 > 0 && (this.aF > 0 && v76 + 1 > this.aF)) {
                                v79 = v74;
                                jrn11 = jrn11;
                                jrn12 = jrn12;
                                jrq5 = new jrq(this, 0, jrn14, jrn11, jrn12, jrn13, v14);
                                jrq5.e = v79;
                                arrayList2.add(jrq5);
                                v75 = v78;
                                v76 = 1;
                            }
                            else {
                                v79 = v74;
                                jrn11 = jrn11;
                                jrn12 = jrn12;
                                if(v79 > 0) {
                                    v75 += this.aA + v78;
                                    ++v76;
                                    jrq5 = jrq5;
                                }
                                else {
                                    v75 = v78;
                                    ++v76;
                                }
                            }
                            jrq5.c(jro13);
                            v74 = v79 + 1;
                            v73 = v73;
                        }
                        v23 = v73;
                        v80 = 0;
                    }
                    else {
                        jrn14 = jrn10;
                        v23 = v73;
                        v80 = v72;
                        int v81 = 0;
                        int v82 = 0;
                        int v83 = 0;
                        int v84;
                        for(v84 = 0; v83 < v18; v84 = v85) {
                            ++v82;
                            int v85 = v84;
                            jro jro14 = arr_jro1[v83];
                            int v86 = this.a(jro14, v14);
                            if(jro14.Q() == 3) {
                                ++v85;
                            }
                            if((v81 == v14 || this.aB + v81 + v86 > v14) && jrq5.a != null || v83 > 0 && (this.aF > 0 && v82 > this.aF)) {
                                jrn11 = jrn11;
                                jrn12 = jrn12;
                                jrq5 = new jrq(this, v80, jrn14, jrn11, jrn12, jrn13, v14);
                                jrq5.e = v83;
                                arrayList2.add(jrq5);
                                v81 = v86;
                                v82 = 1;
                            }
                            else {
                                jrn11 = jrn11;
                                jrn12 = jrn12;
                                if(v83 > 0) {
                                    v81 += this.aB + v86;
                                    jrq5 = jrq5;
                                }
                                else {
                                    v81 = v86;
                                }
                            }
                            jrq5.c(jro14);
                            ++v83;
                        }
                        v77 = v84;
                    }
                    int v87 = arrayList2.size();
                    int v88 = this.aP;
                    int v89 = this.aL;
                    int v90 = this.aQ;
                    int v91 = this.aM;
                    if(v77 > 0 && (this.P() == 2 || this.Q() == 2)) {
                        int v92 = 0;
                        while(v92 < v87) {
                            jrq jrq6 = (jrq)arrayList2.get(v92);
                            if(v80 == 0) {
                                v93 = v88;
                                jrq6.e(v14 - jrq6.b());
                            }
                            else {
                                v93 = v88;
                                jrq6.e(v14 - jrq6.a());
                            }
                            ++v92;
                            v88 = v93;
                        }
                    }
                    int v94 = v89;
                    jrn jrn15 = jrn12;
                    jrn jrn16 = jrn13;
                    int v95 = v90;
                    int v96 = v91;
                    int v97 = v88;
                    jrn jrn17 = jrn14;
                    int v98 = 0;
                    int v99 = 0;
                    jrn jrn18 = jrn11;
                    int v100 = 0;
                    while(v98 < v87) {
                        jrq jrq7 = (jrq)arrayList2.get(v98);
                        if(v80 == 0) {
                            if(v98 < v87 - 1) {
                                jrn16 = ((jrq)arrayList2.get(v98 + 1)).a.L;
                                v96 = 0;
                            }
                            else {
                                jrn16 = jrn13;
                                v96 = this.aM;
                            }
                            jrn jrn19 = jrq7.a.N;
                            jrq7.f(0, jrn17, jrn18, jrn15, jrn16, v97, v94, v95, v96, v14);
                            v99 = Math.max(v99, jrq7.b());
                            v100 += jrq7.a();
                            v100 = v98 <= 0 ? v100 + jrq7.a() : v100 + this.aB;
                            jrn18 = jrn19;
                            v101 = 0;
                            v94 = 0;
                        }
                        else {
                            if(v98 < v87 - 1) {
                                jrn15 = ((jrq)arrayList2.get(v98 + 1)).a.K;
                                v95 = 0;
                            }
                            else {
                                jrn15 = jrn12;
                                v95 = this.aQ;
                            }
                            jrn jrn20 = jrq7.a.M;
                            v101 = v80;
                            jrq7.f(v101, jrn17, jrn18, jrn15, jrn16, v97, v94, v95, v96, v14);
                            v99 += jrq7.b();
                            v100 = Math.max(v100, jrq7.a());
                            if(v98 > 0) {
                                v99 += this.aA;
                            }
                            jrn17 = jrn20;
                            v97 = 0;
                        }
                        ++v98;
                        v80 = v101;
                    }
                    v12 = v99;
                    v13 = v100;
                }
                break;
            }
            default: {
                goto label_532;
            }
        }
        int v102 = v12 + v23 + v20;
        int v103 = v13 + v21 + v22;
        if(v == 0x40000000) {
            v102 = v1;
        }
        else if(v == 0x80000000) {
            v102 = Math.min(v102, v1);
        }
        else if(v != 0) {
            v102 = 0;
        }
        if(v2 == 0x40000000) {
            v103 = v3;
        }
        else if(v2 == 0x80000000) {
            v103 = Math.min(v103, v3);
        }
        else if(v2 != 0) {
            v103 = 0;
        }
        this.Z(v102, v103);
        this.F(v102);
        this.A(v103);
        this.aR = this.aK > 0;
    }

    public final int a(jro jro0, int v) {
        if(jro0 == null) {
            return 0;
        }
        if(jro0.Q() == 3) {
            int v1 = jro0.u;
            if(v1 == 0) {
                return 0;
            }
            if(v1 == 2) {
                int v2 = (int)(jro0.B * ((float)v));
                if(v2 != jro0.h()) {
                    jro0.k = true;
                    this.aa(jro0, jro0.P(), jro0.j(), 1, v2);
                }
                return v2;
            }
            return v1 == 3 ? ((int)(((float)jro0.j()) * jro0.Y + 0.5f)) : jro0.h();
        }
        return jro0.h();
    }

    @Override  // jro
    public final void b(jrd jrd0, boolean z) {
        float f1;
        int v6;
        super.b(jrd0, z);
        boolean z1 = this.V != null && ((jrp)this.V).d;
        switch(this.aE) {
            case 0: {
                ArrayList arrayList0 = this.aW;
                if(arrayList0.size() > 0) {
                    ((jrq)arrayList0.get(0)).d(z1, 0, true);
                }
                break;
            }
            case 1: {
                ArrayList arrayList1 = this.aW;
                int v = arrayList1.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((jrq)arrayList1.get(v1)).d(z1, v1, v1 == v - 1);
                }
                break;
            }
            case 2: {
                if(this.aZ != null && this.aY != null && this.aX != null) {
                    for(int v2 = 0; v2 < this.aI; ++v2) {
                        this.aH[v2].u();
                    }
                    int[] arr_v = this.aZ;
                    int v3 = arr_v[0];
                    int v4 = arr_v[1];
                    float f = this.au;
                    jro jro0 = null;
                    int v5 = 0;
                    while(v5 < v3) {
                        if(z1) {
                            v6 = v3 - v5 - 1;
                            f1 = 1.0f - this.au;
                        }
                        else {
                            f1 = f;
                            v6 = v5;
                        }
                        jro jro1 = this.aY[v6];
                        if(jro1 != null && jro1.ai != 8) {
                            if(v5 == 0) {
                                jro1.q(jro1.K, this.K, this.aP);
                                jro1.ak = this.a;
                                jro1.af = f1;
                                v5 = 0;
                            }
                            if(v5 == v3 - 1) {
                                jro1.q(jro1.M, this.M, this.aQ);
                            }
                            if(v5 > 0 && jro0 != null) {
                                jro1.q(jro1.K, jro0.M, this.aA);
                                jro0.q(jro0.M, jro1.K, 0);
                            }
                            jro0 = jro1;
                        }
                        ++v5;
                        f = f1;
                    }
                    for(int v7 = 0; v7 < v4; ++v7) {
                        jro jro2 = this.aX[v7];
                        if(jro2 != null && jro2.ai != 8) {
                            if(v7 == 0) {
                                jro2.q(jro2.L, this.L, this.aL);
                                jro2.al = this.b;
                                jro2.ag = this.av;
                                v7 = 0;
                            }
                            if(v7 == v4 - 1) {
                                jro2.q(jro2.N, this.N, this.aM);
                            }
                            if(v7 > 0 && jro0 != null) {
                                jro2.q(jro2.L, jro0.N, this.aB);
                                jro0.q(jro0.N, jro2.L, 0);
                            }
                            jro0 = jro2;
                        }
                    }
                    for(int v8 = 0; v8 < v3; ++v8) {
                        for(int v9 = 0; v9 < v4; ++v9) {
                            int v10 = this.aG == 1 ? v8 * v4 + v9 : v9 * v3 + v8;
                            jro[] arr_jro = this.aH;
                            if(v10 < arr_jro.length) {
                                jro jro3 = arr_jro[v10];
                                if(jro3 != null && jro3.ai != 8) {
                                    jro jro4 = this.aY[v8];
                                    jro jro5 = this.aX[v9];
                                    if(jro3 != jro4) {
                                        jro3.q(jro3.K, jro4.K, 0);
                                        jro3.q(jro3.M, jro4.M, 0);
                                    }
                                    if(jro3 != jro5) {
                                        jro3.q(jro3.L, jro5.L, 0);
                                        jro3.q(jro3.N, jro5.N, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 3: {
                ArrayList arrayList2 = this.aW;
                int v11 = arrayList2.size();
                for(int v12 = 0; v12 < v11; ++v12) {
                    ((jrq)arrayList2.get(v12)).d(z1, v12, v12 == v11 - 1);
                }
            }
        }
        this.aR = false;
    }

    public final int c(jro jro0, int v) {
        if(jro0 == null) {
            return 0;
        }
        if(jro0.P() == 3) {
            int v1 = jro0.t;
            if(v1 == 0) {
                return 0;
            }
            if(v1 == 2) {
                int v2 = (int)(jro0.y * ((float)v));
                if(v2 != jro0.j()) {
                    jro0.k = true;
                    this.aa(jro0, 1, v2, jro0.Q(), jro0.h());
                }
                return v2;
            }
            return v1 == 3 ? ((int)(((float)jro0.h()) * jro0.Y + 0.5f)) : jro0.j();
        }
        return jro0.j();
    }
}

