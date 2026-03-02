public final class bxq {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public bxq() {
        this.a = bzl.a;
        this.b = bxy.a;
        this.c = bxy.a;
    }

    public bxq(int v) {
        this.a = bzl.a;
        this.b = bxy.a;
        this.c = bxy.a;
        this.g(bzl.d(v));
    }

    public bxq(byte[] arr_b) {
        this(6);
    }

    public final int a(int v) {
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = -((long)v5) >> 0x3F & this.a[(v3 >> 3) + 1] << 0x40 - v5 | this.a[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & 0xFEFEFEFEFEFEFEFFL + v7 & 0x8080808080808080L; v8 != 0L; v8 &= -1L + v8) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    return v9;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void b() {
        this.e = 0;
        if(this.a != bzl.a) {
            ibpg.aj(this.a, 0x8080808080808080L);
            int v = this.d >> 3;
            long v1 = 0xFFL << ((this.d & 7) << 3);
            this.a[v] = this.a[v] & ~v1 | v1;
        }
        this.f();
    }

    public final void c(int v, int v1) {
        long[] arr_v10;
        long[] arr_v9;
        long v37;
        int v15;
        int v2 = v;
        int v3 = v2 * 0xCC9E2D51 ^ v2 * 0xCC9E2D51 << 16;
        int v4 = v3 >>> 7;
        int v5 = this.d;
        int v6 = v4 & v5;
        int v7 = 0;
        while(true) {
            int v8 = (v6 & 7) << 3;
            int v9 = 1;
            long v10 = (long)(v3 & 0x7F);
            long v11 = this.a[(v6 >> 3) + 1] << 0x40 - v8 & -((long)v8) >> 0x3F | this.a[v6 >> 3] >>> v8;
            long v12 = 0x101010101010101L * v10 ^ v11;
            long v13 = v12 - 0x101010101010101L & ~v12 & 0x8080808080808080L;
            while(v13 != 0L) {
                int v14 = (Long.numberOfTrailingZeros(v13) >> 3) + v6 & v5;
                if(this.b[v14] == v2) {
                    v15 = v14;
                    goto label_130;
                }
                v13 &= v13 - 1L;
            }
            if(Long.compare(v11 & ~v11 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v16 = this.e(v4);
                if(this.f == 0 && (this.a[v16 >> 3] >> ((v16 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.d > 8 && Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)this.d) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v17 = this.d;
                        int[] arr_v1 = this.b;
                        int[] arr_v2 = this.c;
                        for(int v18 = 0; v18 < v17 + 7 >> 3; ++v18) {
                            long v19 = arr_v[v18] & 0x8080808080808080L;
                            arr_v[v18] = 0xFEFEFEFEFEFEFEFEL & ~v19 + (v19 >>> 7);
                        }
                        int v20 = ibpg.v(arr_v);
                        arr_v[v20 - 1] = arr_v[v20 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                        arr_v[v20] = arr_v[0];
                        int v21 = 0;
                        while(v21 != v17) {
                            int v22 = (v21 & 7) << 3;
                            long v23 = arr_v[v21 >> 3] >> v22 & 0xFFL;
                            if(v23 != 0x80L && v23 == 0xFEL) {
                                int v24 = arr_v1[v21] * 0xCC9E2D51;
                                int v25 = v24 ^ v24 << 16;
                                int v26 = this.e(v25 >>> 7);
                                int v27 = v25 >>> 7 & v17;
                                long v28 = (long)(v25 & 0x7F);
                                if((v26 - v27 & v17) / 8 == (v21 - v27 & v17) / 8) {
                                    arr_v[v21 >> 3] = v28 << v22 | ~(0xFFL << v22) & arr_v[v21 >> 3];
                                    int v29 = ibpg.v(arr_v);
                                    arr_v[v29] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                }
                                else {
                                    long v30 = arr_v[v26 >> 3];
                                    int v31 = (v26 & 7) << 3;
                                    long v32 = v28 << v31;
                                    long v33 = ~(0xFFL << v31) & v30;
                                    if((v30 >> v31 & 0xFFL) == 0x80L) {
                                        arr_v[v26 >> 3] = v33 | v32;
                                        arr_v[v21 >> 3] = arr_v[v21 >> 3] & ~(0xFFL << v22) | 0x80L << v22;
                                        arr_v1[v26] = arr_v1[v21];
                                        arr_v1[v21] = 0;
                                        arr_v2[v26] = arr_v2[v21];
                                        arr_v2[v21] = 0;
                                    }
                                    else {
                                        arr_v[v26 >> 3] = v33 | v32;
                                        int v34 = arr_v1[v26];
                                        arr_v1[v26] = arr_v1[v21];
                                        arr_v1[v21] = v34;
                                        int v35 = arr_v2[v26];
                                        arr_v2[v26] = arr_v2[v21];
                                        arr_v2[v21] = v35;
                                        --v21;
                                    }
                                    int v36 = ibpg.v(arr_v);
                                    arr_v[v36] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                }
                                ++v21;
                                v10 = v10;
                            }
                            else {
                                ++v21;
                            }
                        }
                        v37 = v10;
                        this.f();
                    }
                    else {
                        v37 = v10;
                        long[] arr_v3 = this.a;
                        int[] arr_v4 = this.b;
                        int[] arr_v5 = this.c;
                        int v38 = this.d;
                        this.g(bzl.b(this.d));
                        long[] arr_v6 = this.a;
                        int[] arr_v7 = this.b;
                        int[] arr_v8 = this.c;
                        int v39 = this.d;
                        int v40 = 0;
                        while(v40 < v38) {
                            if((arr_v3[v40 >> 3] >> ((v40 & 7) << 3) & 0xFFL) < 0x80L) {
                                int v41 = arr_v4[v40];
                                int v42 = v41 * 0xCC9E2D51;
                                int v43 = v42 ^ v42 << 16;
                                int v44 = this.e(v43 >>> 7);
                                int v45 = (v44 & 7) << 3;
                                arr_v9 = arr_v6;
                                arr_v10 = arr_v3;
                                long v46 = arr_v6[v44 >> 3] & ~(0xFFL << v45) | ((long)(v43 & 0x7F)) << v45;
                                arr_v9[v44 >> 3] = v46;
                                arr_v9[(v44 - 7 & v39) + (v39 & 7) >> 3] = v46;
                                arr_v7[v44] = v41;
                                arr_v8[v44] = arr_v5[v40];
                            }
                            else {
                                arr_v9 = arr_v6;
                                arr_v10 = arr_v3;
                            }
                            ++v40;
                            arr_v3 = arr_v10;
                            arr_v6 = arr_v9;
                        }
                    }
                    v16 = this.e(v4);
                }
                else {
                    v37 = v10;
                }
                ++this.e;
                int v47 = this.f;
                long[] arr_v11 = this.a;
                long v48 = arr_v11[v16 >> 3];
                int v49 = (v16 & 7) << 3;
                if((v48 >> v49 & 0xFFL) != 0x80L) {
                    v9 = 0;
                }
                this.f = v47 - v9;
                int v50 = this.d;
                long v51 = v48 & ~(0xFFL << v49) | v37 << v49;
                arr_v11[v16 >> 3] = v51;
                arr_v11[(v16 - 7 & v50) + (v50 & 7) >> 3] = v51;
                v15 = ~v16;
            label_130:
                if(v15 < 0) {
                    v15 = ~v15;
                }
                this.b[v15] = v;
                this.c[v15] = v1;
                return;
            }
            v7 += 8;
            v6 = v6 + v7 & v5;
            v2 = v;
            v3 = v3;
        }
    }

    public final int d(int v) {
        int v1 = this.a(v);
        return v1 < 0 ? -1 : this.c[v1];
    }

    private final int e(int v) {
        long v6;
        int v1 = this.d;
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

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bxq)) {
            return false;
        }
        if(((bxq)object0).e != this.e) {
            return false;
        }
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            int v6 = arr_v[v5];
                            int v7 = arr_v1[v5];
                            int v8 = ((bxq)object0).a(v6);
                            if(v8 < 0 || v7 != ((bxq)object0).c[v8]) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_28;
                    }
                    break;
                }
            label_28:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    private final void f() {
        this.f = bzl.a(this.d) - this.e;
    }

    private final void g(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, bzl.c(v));
        this.d = v1;
        if(v1 == 0) {
            arr_v = bzl.a;
        }
        else {
            arr_v = new long[v1 + 15 >> 3];
            ibpg.aj(arr_v, 0x8080808080808080L);
        }
        this.a = arr_v;
        long v2 = 0xFFL << ((v1 & 7) << 3);
        arr_v[v1 >> 3] = arr_v[v1 >> 3] & ~v2 | v2;
        this.f();
        this.b = new int[v1];
        this.c = new int[v1];
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v4;
                            v2 += arr_v1[v6] ^ arr_v[v6];
                        }
                        v3 >>= 8;
                    }
                    if(v5 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override
    public final String toString() {
        if(this.e != 0) {
            StringBuilder stringBuilder0 = new StringBuilder("{");
            int[] arr_v = this.b;
            int[] arr_v1 = this.c;
            long[] arr_v2 = this.a;
            int v = arr_v2.length - 2;
            if(v >= 0) {
                int v1 = 0;
                int v2 = 0;
                while(true) {
                    long v3 = arr_v2[v1];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        for(int v4 = 0; true; ++v4) {
                            int v5 = 8 - (~(v1 - v) >>> 0x1F);
                            if(v4 >= v5) {
                                break;
                            }
                            if((0xFFL & v3) < 0x80L) {
                                int v6 = (v1 << 3) + v4;
                                int v7 = arr_v[v6];
                                int v8 = arr_v1[v6];
                                stringBuilder0.append(v7);
                                stringBuilder0.append("=");
                                stringBuilder0.append(v8);
                                ++v2;
                                if(v2 < this.e) {
                                    stringBuilder0.append(", ");
                                }
                            }
                            v3 >>= 8;
                        }
                        if(v5 == 8) {
                            goto label_28;
                        }
                        break;
                    }
                label_28:
                    if(v1 == v) {
                        break;
                    }
                    ++v1;
                }
            }
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }
        return "{}";
    }
}

