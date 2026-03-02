import java.util.Collection;

public final class bzg {
    public long[] a;
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int h;

    public bzg() {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = bzr.a;
        this.d = 0x7FFFFFFF;
        this.e = 0x7FFFFFFF;
    }

    public bzg(int v) {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = bzr.a;
        this.d = 0x7FFFFFFF;
        this.e = 0x7FFFFFFF;
        this.k(bzl.d(v));
    }

    public final boolean a(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = this.f;
        int v2 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v3 = v2 >>> 7 & v1;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = -((long)v5) >> 0x3F & this.a[(v3 >> 3) + 1] << 0x40 - v5 | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & 0xFEFEFEFEFEFEFEFFL + v7 & 0x8080808080808080L; v8 != 0L; v8 &= -1L + v8) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v1;
                if(ibuq.m(this.b[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                break;
            }
            v4 += 8;
            v3 = v3 + v4 & v1;
            v2 = v2;
        }
        return false;
    }

    public final boolean b() {
        return this.g == 0;
    }

    public final int c(Object object0) {
        long[] arr_v10;
        long[] arr_v9;
        int v15;
        long v14;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 >>> 7;
        int v3 = this.f;
        int v4 = v2 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            int v7 = 1;
            long v8 = (long)(v1 & 0x7F);
            long v9 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v10 = 0x101010101010101L * v8 ^ v9;
            for(long v11 = v10 - 0x101010101010101L & ~v10 & 0x8080808080808080L; v11 != 0L; v11 &= v11 - 1L) {
                int v12 = (Long.numberOfTrailingZeros(v11) >> 3) + v4 & v3;
                if(ibuq.m(this.b[v12], object0)) {
                    return v12;
                }
            }
            if(Long.compare(v9 & ~v9 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v13 = this.i(v2);
                if(this.h == 0 && (this.a[v13 >> 3] >> ((v13 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.f > 8 && Long.compare(((long)this.g) * 0x20L ^ 0x8000000000000000L, ((long)this.f) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        if(arr_v == null) {
                            v14 = v8;
                            v15 = v2;
                        }
                        else {
                            int v16 = this.f;
                            Object[] arr_object = this.b;
                            long[] arr_v1 = this.c;
                            long[] arr_v2 = new long[v16];
                            ibpg.ah(arr_v2, 0x7FFFFFFF7FFFFFFFL, v16);
                            int v17 = 0;
                            while(v17 < v16 + 7 >> 3) {
                                long v18 = arr_v[v17] & 0x8080808080808080L;
                                arr_v[v17] = ~v18 + (v18 >>> 7) & 0xFEFEFEFEFEFEFEFEL;
                                ++v17;
                                v2 = v2;
                            }
                            int v19 = v2;
                            int v20 = ibpg.v(arr_v);
                            arr_v[v20 - 1] = arr_v[v20 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                            arr_v[v20] = arr_v[0];
                            int v21 = 0;
                            while(v21 != v16) {
                                int v22 = (v21 & 7) << 3;
                                long v23 = arr_v[v21 >> 3] >> v22 & 0xFFL;
                                if(v23 != 0x80L && v23 == 0xFEL) {
                                    Object object1 = arr_object[v21];
                                    int v24 = (object1 == null ? 0 : object1.hashCode()) * 0xCC9E2D51;
                                    int v25 = v24 ^ v24 << 16;
                                    int v26 = this.i(v25 >>> 7);
                                    int v27 = v25 >>> 7 & v16;
                                    long v28 = (long)(v25 & 0x7F);
                                    if((v26 - v27 & v16) / 8 == (v21 - v27 & v16) / 8) {
                                        arr_v[v21 >> 3] = v28 << v22 | arr_v[v21 >> 3] & ~(0xFFL << v22);
                                        if(arr_v2[v21] == 0x7FFFFFFF7FFFFFFFL) {
                                            arr_v2[v21] = ((long)v21) | ((long)v21) << 0x20;
                                        }
                                        arr_v[arr_v.length - 1] = arr_v[0];
                                        ++v21;
                                    }
                                    else {
                                        long v29 = arr_v[v26 >> 3];
                                        int v30 = (v26 & 7) << 3;
                                        long v31 = v28 << v30;
                                        long v32 = v29 & ~(0xFFL << v30);
                                        if(Long.compare(v29 >> v30 & 0xFFL, 0x80L) == 0) {
                                            arr_v[v26 >> 3] = v32 | v31;
                                            arr_v[v21 >> 3] = arr_v[v21 >> 3] & ~(0xFFL << v22) | 0x80L << v22;
                                            arr_object[v26] = arr_object[v21];
                                            arr_object[v21] = null;
                                            arr_v1[v26] = arr_v1[v21];
                                            arr_v1[v21] = 0x3FFFFFFFFFFFFFFFL;
                                            int v33 = (int)(arr_v2[v21] >> 0x20 & 0xFFFFFFFFL);
                                            if(v33 == 0x7FFFFFFF) {
                                                arr_v2[v21] = 0x7FFFFFFF00000000L | ((long)v26);
                                            }
                                            else {
                                                arr_v2[v33] = arr_v2[v33] & 0xFFFFFFFF00000000L | ((long)v26);
                                                arr_v2[v21] = arr_v2[v21] & 0xFFFFFFFFL | 0xFFFFFFFF00000000L;
                                            }
                                            arr_v2[v26] = ((long)v21) << 0x20 | 0x7FFFFFFFL;
                                        }
                                        else {
                                            arr_v[v26 >> 3] = v32 | v31;
                                            Object object2 = arr_object[v26];
                                            arr_object[v26] = arr_object[v21];
                                            arr_object[v21] = object2;
                                            long v34 = arr_v1[v26];
                                            arr_v1[v26] = arr_v1[v21];
                                            arr_v1[v21] = v34;
                                            int v35 = (int)(arr_v2[v21] >> 0x20 & 0xFFFFFFFFL);
                                            if(v35 == 0x7FFFFFFF) {
                                                arr_v2[v21] = ((long)v26) << 0x20 | ((long)v26);
                                                v35 = v21;
                                            }
                                            else {
                                                arr_v2[v35] = arr_v2[v35] & 0xFFFFFFFF00000000L | ((long)v26);
                                                arr_v2[v21] = ((long)v26) << 0x20 | arr_v2[v21] & 0xFFFFFFFFL;
                                            }
                                            arr_v2[v26] = ((long)v35) << 0x20 | ((long)v21);
                                            --v21;
                                        }
                                        arr_v[arr_v.length - 1] = arr_v[0];
                                        ++v21;
                                        v19 = v19;
                                    }
                                    v8 = v8;
                                }
                                else {
                                    ++v21;
                                }
                            }
                            v14 = v8;
                            this.j();
                            long[] arr_v3 = this.c;
                            for(int v36 = 0; v36 < arr_v3.length; ++v36) {
                                long v37 = arr_v3[v36];
                                int v38 = (int)(v37 >> 0x1F & 0x7FFFFFFFL);
                                arr_v3[v36] = (v37 & 0xC000000000000000L | ((long)(v38 == 0x7FFFFFFF ? 0x7FFFFFFF : ((int)(arr_v2[v38] & 0xFFFFFFFFL))))) << 0x1F | ((long)(((int)(v37 & 0x7FFFFFFFL)) == 0x7FFFFFFF ? 0x7FFFFFFF : ((int)(arr_v2[((int)(v37 & 0x7FFFFFFFL))] & 0xFFFFFFFFL))));
                            }
                            int v39 = this.d;
                            if(v39 != 0x7FFFFFFF) {
                                this.d = (int)(arr_v2[v39] & 0xFFFFFFFFL);
                            }
                            int v40 = this.e;
                            if(v40 != 0x7FFFFFFF) {
                                this.e = (int)(arr_v2[v40] & 0xFFFFFFFFL);
                            }
                            v15 = v19;
                        }
                    }
                    else {
                        v14 = v8;
                        int v41 = bzl.b(this.f);
                        long[] arr_v4 = this.a;
                        Object[] arr_object1 = this.b;
                        long[] arr_v5 = this.c;
                        int v42 = this.f;
                        int[] arr_v6 = new int[v42];
                        this.k(v41);
                        long[] arr_v7 = this.a;
                        Object[] arr_object2 = this.b;
                        long[] arr_v8 = this.c;
                        int v43 = this.f;
                        int v44 = 0;
                        while(v44 < v42) {
                            if((arr_v4[v44 >> 3] >> ((v44 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object3 = arr_object1[v44];
                                int v45 = (object3 == null ? 0 : object3.hashCode()) * 0xCC9E2D51;
                                int v46 = v45 ^ v45 << 16;
                                int v47 = this.i(v46 >>> 7);
                                int v48 = (v47 & 7) << 3;
                                arr_v9 = arr_v7;
                                arr_v10 = arr_v4;
                                long v49 = arr_v7[v47 >> 3] & ~(0xFFL << v48) | ((long)(v46 & 0x7F)) << v48;
                                arr_v9[v47 >> 3] = v49;
                                arr_v9[(v47 - 7 & v43) + (v43 & 7) >> 3] = v49;
                                arr_object2[v47] = object3;
                                arr_v8[v47] = arr_v5[v44];
                                arr_v6[v44] = v47;
                            }
                            else {
                                arr_v9 = arr_v7;
                                arr_v10 = arr_v4;
                            }
                            ++v44;
                            arr_v4 = arr_v10;
                            arr_v7 = arr_v9;
                        }
                        long[] arr_v11 = this.c;
                        for(int v50 = 0; v50 < arr_v11.length; ++v50) {
                            long v51 = arr_v11[v50];
                            int v52 = (int)(v51 >> 0x1F & 0x7FFFFFFFL);
                            arr_v11[v50] = (v51 & 0xC000000000000000L | ((long)(v52 == 0x7FFFFFFF ? 0x7FFFFFFF : arr_v6[v52]))) << 0x1F | ((long)(((int)(v51 & 0x7FFFFFFFL)) == 0x7FFFFFFF ? 0x7FFFFFFF : arr_v6[((int)(v51 & 0x7FFFFFFFL))]));
                        }
                        int v53 = this.d;
                        if(v53 != 0x7FFFFFFF) {
                            this.d = arr_v6[v53];
                        }
                        int v54 = this.e;
                        if(v54 != 0x7FFFFFFF) {
                            this.e = arr_v6[v54];
                        }
                        v15 = v2;
                    }
                    v13 = this.i(v15);
                }
                else {
                    v14 = v8;
                }
                ++this.g;
                int v55 = this.h;
                long[] arr_v12 = this.a;
                long v56 = arr_v12[v13 >> 3];
                int v57 = (v13 & 7) << 3;
                if((v56 >> v57 & 0xFFL) != 0x80L) {
                    v7 = 0;
                }
                this.h = v55 - v7;
                int v58 = this.f;
                long v59 = v56 & ~(0xFFL << v57) | v14 << v57;
                arr_v12[v13 >> 3] = v59;
                arr_v12[(v13 - 7 & v58) + (v58 & 7) >> 3] = v59;
                return v13;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            v1 = v1;
        }
    }

    public final void d() {
        this.g = 0;
        if(this.a != bzl.a) {
            ibpg.aj(this.a, 0x8080808080808080L);
            int v = this.f >> 3;
            long v1 = 0xFFL << ((this.f & 7) << 3);
            this.a[v] = this.a[v] & ~v1 | v1;
        }
        ibpg.f(this.b, null, 0, this.f);
        ibpg.aj(this.c, 0x3FFFFFFFFFFFFFFFL);
        this.d = 0x7FFFFFFF;
        this.e = 0x7FFFFFFF;
        this.j();
    }

    public final void e(int v) {
        --this.g;
        long[] arr_v = this.a;
        int v1 = this.f;
        int v2 = (v & 7) << 3;
        long v3 = arr_v[v >> 3] & ~(0xFFL << v2) | 0xFEL << v2;
        arr_v[v >> 3] = v3;
        arr_v[(v - 7 & v1) + (v1 & 7) >> 3] = v3;
        this.b[v] = null;
        long[] arr_v1 = this.c;
        long v4 = arr_v1[v];
        int v5 = (int)(v4 >> 0x1F & 0x7FFFFFFFL);
        if(v5 == 0x7FFFFFFF) {
            this.d = (int)(v4 & 0x7FFFFFFFL);
        }
        else {
            arr_v1[v5] = arr_v1[v5] & 0xFFFFFFFF80000000L | ((long)(((int)(v4 & 0x7FFFFFFFL))));
        }
        if(((int)(v4 & 0x7FFFFFFFL)) == 0x7FFFFFFF) {
            this.e = v5;
        }
        else {
            arr_v1[((int)(v4 & 0x7FFFFFFFL))] = ((long)v5) << 0x1F | arr_v1[((int)(v4 & 0x7FFFFFFFL))] & 0xC00000007FFFFFFFL;
        }
        arr_v1[v] = 0x3FFFFFFFFFFFFFFFL;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bzg)) {
            return false;
        }
        if(((bzg)object0).g != this.g) {
            return false;
        }
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L && !((bzg)object0).a(arr_object[(v1 << 3) + v3])) {
                            return false;
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final boolean f(Object object0) {
        int v = this.g;
        int v1 = this.c(object0);
        this.b[v1] = object0;
        long[] arr_v = this.c;
        int v2 = this.d;
        arr_v[v1] = ((long)v2) & 0x7FFFFFFFL | 0x3FFFFFFF80000000L;
        if(v2 != 0x7FFFFFFF) {
            arr_v[v2] = (((long)v1) & 0x7FFFFFFFL) << 0x1F | arr_v[v2] & 0xC00000007FFFFFFFL;
        }
        this.d = v1;
        if(this.e == 0x7FFFFFFF) {
            this.e = v1;
        }
        return this.g != v;
    }

    public final boolean g(Object object0) {
        int v10;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = this.f;
        int v2 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v3 = v2 >>> 7 & v1;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = -((long)v5) >> 0x3F & this.a[(v3 >> 3) + 1] << 0x40 - v5 | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & 0xFEFEFEFEFEFEFEFFL + v7 & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v1;
                if(ibuq.m(this.b[v9], object0)) {
                    v10 = v9;
                    goto label_18;
                }
                v8 &= -1L + v8;
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                v10 = -1;
            label_18:
                if(v10 >= 0) {
                    this.e(v10);
                }
                return v10 >= 0;
            }
            v4 += 8;
            v3 = v3 + v4 & v1;
            v2 = v2;
        }
    }

    public final boolean h(Collection collection0) {
        ibuq.f(collection0, "elements");
        Object[] arr_object = this.b;
        int v = this.g;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v2 << 3) + v4;
                            if(!ibpo.aB(collection0, arr_object[v6])) {
                                this.e(v6);
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v5 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        return v != this.g;
    }

    @Override
    public final int hashCode() {
        int v = this.f * 0x1F + this.g;
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                long v3 = arr_v[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            Object object0 = arr_object[(v2 << 3) + v4];
                            if(!ibuq.m(object0, this)) {
                                v += (object0 == null ? 0 : object0.hashCode());
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v5 != 8) {
                        return v;
                    }
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    private final int i(int v) {
        long v6;
        int v1 = this.f;
        int v2 = v & v1;
        int v3 = 0;
        while(true) {
            int v4 = (v2 & 7) << 3;
            long v5 = this.a[(v2 >> 3) + 1] << 0x40 - v4 & -((long)v4) >> 0x3F | this.a[v2 >> 3] >>> v4;
            v6 = v5 & ~v5 << 7 & 0x8080808080808080L;
            if(v6 != 0L) {
                break;
            }
            v3 += 8;
            v2 = v2 + v3 & v1;
        }
        return v2 + (Long.numberOfTrailingZeros(v6) >> 3) & v1;
    }

    private final void j() {
        this.h = bzl.a(this.f) - this.g;
    }

    private final void k(int v) {
        long[] arr_v1;
        Object[] arr_object;
        int v3;
        long[] arr_v;
        int v1 = 0;
        int v2 = v <= 0 ? 0 : Math.max(7, bzl.c(v));
        this.f = v2;
        if(v2 == 0) {
            arr_v = bzl.a;
            v3 = 0;
        }
        else {
            arr_v = new long[v2 + 15 >> 3];
            ibpg.aj(arr_v, 0x8080808080808080L);
            v3 = v2;
        }
        this.a = arr_v;
        long v4 = 0xFFL << ((7 & v3) << 3);
        arr_v[v3 >> 3] = arr_v[v3 >> 3] & ~v4 | v4;
        this.j();
        if(v2 == 0) {
            arr_object = caa.c;
        }
        else {
            v1 = v2;
            arr_object = new Object[v2];
        }
        this.b = arr_object;
        if(v1 == 0) {
            arr_v1 = bzr.a;
        }
        else {
            arr_v1 = new long[v1];
            ibpg.aj(arr_v1, 0x3FFFFFFFFFFFFFFFL);
        }
        this.c = arr_v1;
    }

    @Override
    public final String toString() {
        bzf bzf0 = new bzf(this);
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Object[] arr_object = this.b;
        long[] arr_v = this.c;
        int v = this.e;
        int v1 = 0;
        while(v != 0x7FFFFFFF) {
            long v2 = arr_v[v] >> 0x1F;
            Object object0 = arr_object[v];
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            stringBuilder0.append(((CharSequence)bzf0.a(object0)));
            ++v1;
            v = (int)(v2 & 0x7FFFFFFFL);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

