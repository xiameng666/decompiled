public final class bxx {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    private int e;

    public bxx() {
        this.a = bzl.a;
        this.b = bxy.a;
    }

    public bxx(int v) {
        this.a = bzl.a;
        this.b = bxy.a;
        if(v < 0) {
            cad.a("Capacity must be a positive value.");
        }
        this.g(bzl.d(v));
    }

    public bxx(byte[] arr_b) {
        this(6);
    }

    public final boolean a(int v) {
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = -((long)v5) >> 0x3F & this.a[(v3 >> 3) + 1] << 0x40 - v5 | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & 0xFEFEFEFEFEFEFEFFL + v7 & 0x8080808080808080L; v8 != 0L; v8 &= -1L + v8) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    return v9 >= 0;
                }
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                break;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
        return false;
    }

    public final void b() {
        this.e = bzl.a(this.c) - this.d;
    }

    public final void c(int v) {
        --this.d;
        long[] arr_v = this.a;
        int v1 = v >> 3;
        int v2 = this.c;
        int v3 = (v & 7) << 3;
        long v4 = arr_v[v1] & ~(0xFFL << v3) | 0xFEL << v3;
        arr_v[v1] = v4;
        arr_v[(v - 7 & v2) + (v2 & 7) >> 3] = v4;
    }

    public final boolean d(int v) {
        long[] arr_v7;
        long[] arr_v6;
        long v35;
        int v14;
        int v1 = v;
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7;
        int v5 = this.c;
        int v6 = v4 & v5;
        int v7 = 0;
        while(true) {
            int v8 = (v6 & 7) << 3;
            long v9 = (long)(v2 & 0x7F);
            long v10 = this.a[(v6 >> 3) + 1] << 0x40 - v8 & -((long)v8) >> 0x3F | this.a[v6 >> 3] >>> v8;
            long v11 = 0x101010101010101L * v9 ^ v10;
            for(long v12 = v11 - 0x101010101010101L & ~v11 & 0x8080808080808080L; v12 != 0L; v12 &= v12 - 1L) {
                int v13 = (Long.numberOfTrailingZeros(v12) >> 3) + v6 & v5;
                if(this.b[v13] == v1) {
                    v14 = v13;
                    this.b[v14] = v;
                    return this.d != v3;
                }
            }
            if(Long.compare(v10 & ~v10 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v15 = this.f(v4);
                if(this.e == 0 && (this.a[v15 >> 3] >> ((v15 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.c > 8 && Long.compare(((long)this.d) * 0x20L ^ 0x8000000000000000L, ((long)this.c) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v16 = this.c;
                        int[] arr_v1 = this.b;
                        for(int v17 = 0; v17 < v16 + 7 >> 3; ++v17) {
                            long v18 = arr_v[v17] & 0x8080808080808080L;
                            arr_v[v17] = 0xFEFEFEFEFEFEFEFEL & ~v18 + (v18 >>> 7);
                        }
                        int v19 = ibpg.v(arr_v);
                        arr_v[v19 - 1] = arr_v[v19 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                        arr_v[v19] = arr_v[0];
                        int v20 = 0;
                        while(v20 != v16) {
                            int v21 = (v20 & 7) << 3;
                            long v22 = arr_v[v20 >> 3] >> v21 & 0xFFL;
                            if(v22 != 0x80L && v22 == 0xFEL) {
                                int v23 = arr_v1[v20] * 0xCC9E2D51;
                                int v24 = v23 ^ v23 << 16;
                                int v25 = this.f(v24 >>> 7);
                                int v26 = v24 >>> 7 & v16;
                                long v27 = (long)(v24 & 0x7F);
                                if((v25 - v26 & v16) / 8 == (v20 - v26 & v16) / 8) {
                                    arr_v[v20 >> 3] = arr_v[v20 >> 3] & ~(0xFFL << v21) | v27 << v21;
                                    int v28 = ibpg.v(arr_v);
                                    arr_v[v28] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v20;
                                }
                                else {
                                    long v29 = arr_v[v25 >> 3];
                                    int v30 = (v25 & 7) << 3;
                                    long v31 = v27 << v30;
                                    long v32 = ~(0xFFL << v30) & v29;
                                    if((v29 >> v30 & 0xFFL) == 0x80L) {
                                        arr_v[v25 >> 3] = v32 | v31;
                                        arr_v[v20 >> 3] = arr_v[v20 >> 3] & ~(0xFFL << v21) | 0x80L << v21;
                                        arr_v1[v25] = arr_v1[v20];
                                        arr_v1[v20] = 0;
                                    }
                                    else {
                                        arr_v[v25 >> 3] = v32 | v31;
                                        int v33 = arr_v1[v25];
                                        arr_v1[v25] = arr_v1[v20];
                                        arr_v1[v20] = v33;
                                        --v20;
                                    }
                                    int v34 = ibpg.v(arr_v);
                                    arr_v[v34] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v20;
                                    v9 = v9;
                                }
                            }
                            else {
                                ++v20;
                            }
                        }
                        v35 = v9;
                        this.b();
                    }
                    else {
                        v35 = v9;
                        long[] arr_v2 = this.a;
                        int[] arr_v3 = this.b;
                        int v36 = this.c;
                        this.g(bzl.b(this.c));
                        long[] arr_v4 = this.a;
                        int[] arr_v5 = this.b;
                        int v37 = this.c;
                        int v38 = 0;
                        while(v38 < v36) {
                            if((arr_v2[v38 >> 3] >> ((v38 & 7) << 3) & 0xFFL) < 0x80L) {
                                int v39 = arr_v3[v38];
                                int v40 = v39 * 0xCC9E2D51;
                                int v41 = v40 ^ v40 << 16;
                                int v42 = this.f(v41 >>> 7);
                                int v43 = (v42 & 7) << 3;
                                arr_v6 = arr_v4;
                                arr_v7 = arr_v2;
                                long v44 = arr_v4[v42 >> 3] & ~(0xFFL << v43) | ((long)(v41 & 0x7F)) << v43;
                                arr_v6[v42 >> 3] = v44;
                                arr_v6[(v42 - 7 & v37) + (v37 & 7) >> 3] = v44;
                                arr_v5[v42] = v39;
                            }
                            else {
                                arr_v6 = arr_v4;
                                arr_v7 = arr_v2;
                            }
                            ++v38;
                            arr_v2 = arr_v7;
                            arr_v4 = arr_v6;
                        }
                    }
                    v14 = this.f(v4);
                }
                else {
                    v35 = v9;
                    v14 = v15;
                }
                ++this.d;
                int v45 = this.e;
                long[] arr_v8 = this.a;
                long v46 = arr_v8[v14 >> 3];
                int v47 = (v14 & 7) << 3;
                this.e = v45 - ((v46 >> v47 & 0xFFL) == 0x80L ? 1 : 0);
                int v48 = this.c;
                long v49 = v46 & ~(0xFFL << v47) | v35 << v47;
                arr_v8[v14 >> 3] = v49;
                arr_v8[(v14 - 7 & v48) + (v48 & 7) >> 3] = v49;
                this.b[v14] = v;
                return this.d != v3;
            }
            v7 += 8;
            v6 = v6 + v7 & v5;
            v1 = v;
            v2 = v2;
        }
    }

    public final boolean e(int v) {
        int v10;
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = -((long)v5) >> 0x3F & this.a[(v3 >> 3) + 1] << 0x40 - v5 | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & 0xFEFEFEFEFEFEFEFFL + v7 & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    v10 = v9;
                    goto label_17;
                }
                v8 &= -1L + v8;
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                v10 = -1;
            label_17:
                if(v10 >= 0) {
                    this.c(v10);
                }
                return v10 >= 0;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bxx)) {
            return false;
        }
        if(((bxx)object0).d != this.d) {
            return false;
        }
        int[] arr_v = this.b;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L && !((bxx)object0).a(arr_v[(v1 << 3) + v3])) {
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

    private final int f(int v) {
        long v6;
        int v1 = this.c;
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

    private final void g(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, bzl.c(v));
        this.c = v1;
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
        this.b();
        this.b = new int[v1];
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.b;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            v2 += arr_v[(v1 << 3) + v4];
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
        StringBuilder stringBuilder0 = new StringBuilder("[");
        int[] arr_v = this.b;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
        alab1:
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = arr_v[(v1 << 3) + v4];
                            if(v2 != 0) {
                                stringBuilder0.append(", ");
                            }
                            if(v2 == -1) {
                                stringBuilder0.append("...");
                                break alab1;
                            }
                            stringBuilder0.append(v6);
                            ++v2;
                        }
                        v3 >>= 8;
                    }
                    if(v5 == 8) {
                        goto label_25;
                    }
                    break;
                }
            label_25:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

