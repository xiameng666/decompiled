public final class bza {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public bza() {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = bxy.a;
    }

    public bza(int v) {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = bxy.a;
        if(v < 0) {
            cad.a("Capacity must be a positive value.");
        }
        this.k(bzl.d(v));
    }

    public bza(byte[] arr_b) {
        this(6);
    }

    public final int a(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = this.d;
        int v3 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        for(int v4 = v3 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v2;
            int v6 = (v5 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v5 >> 3) + 1] << 0x40 - v6 | this.a[v5 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v3 & 0x7F)) * 0x101010101010101L;
            for(long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L; v9 != 0L; v9 &= -1L + v9) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v2;
                if(ibuq.m(this.b[v10], object0)) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    public final int b(Object object0, int v) {
        int v1 = this.a(object0);
        return v1 < 0 ? v : this.c[v1];
    }

    public final boolean c() {
        return this.e != 0;
    }

    public final void d() {
        this.e = 0;
        if(this.a != bzl.a) {
            ibpg.aj(this.a, 0x8080808080808080L);
            int v = this.d >> 3;
            long v1 = 0xFFL << ((this.d & 7) << 3);
            this.a[v] = this.a[v] & ~v1 | v1;
        }
        ibpg.f(this.b, null, 0, this.d);
        this.j();
    }

    public final void e(int v) {
        --this.e;
        long[] arr_v = this.a;
        int v1 = v >> 3;
        int v2 = this.d;
        int v3 = (v & 7) << 3;
        long v4 = arr_v[v1] & ~(0xFFL << v3) | 0xFEL << v3;
        arr_v[v1] = v4;
        arr_v[(v - 7 & v2) + (v2 & 7) >> 3] = v4;
        this.b[v] = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bza)) {
            return false;
        }
        if(((bza)object0).e != this.e) {
            return false;
        }
        Object[] arr_object = this.b;
        int[] arr_v = this.c;
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
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object1 = arr_object[v5];
                            int v6 = arr_v[v5];
                            int v7 = ((bza)object0).a(object1);
                            if(v7 < 0 || v6 != ((bza)object0).c[v7]) {
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

    public final void f(Object object0, int v) {
        int v1 = this.i(object0);
        if(v1 < 0) {
            v1 = ~v1;
        }
        this.b[v1] = object0;
        this.c[v1] = v;
    }

    public final int g(Object object0, int v) {
        int v2;
        int v1 = this.i(object0);
        if(v1 < 0) {
            v1 = ~v1;
            v2 = -1;
        }
        else {
            v2 = this.c[v1];
        }
        this.b[v1] = object0;
        this.c[v1] = v;
        return v2;
    }

    private final int h(int v) {
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
    public final int hashCode() {
        Object[] arr_object = this.b;
        int[] arr_v = this.c;
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
                            int v6 = (v1 << 3) + v4;
                            Object object0 = arr_object[v6];
                            v2 += arr_v[v6] ^ (object0 == null ? 0 : object0.hashCode());
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

    private final int i(Object object0) {
        long[] arr_v7;
        long[] arr_v6;
        long v34;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 >>> 7;
        int v3 = this.d;
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
                int v13 = this.h(v2);
                if(this.f == 0 && (this.a[v13 >> 3] >> ((v13 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.d > 8 && Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)this.d) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v14 = this.d;
                        Object[] arr_object = this.b;
                        int[] arr_v1 = this.c;
                        int v15 = v14 + 7;
                        int v16 = 0;
                        while(v16 < v15 >> 3) {
                            long v17 = arr_v[v16] & 0x8080808080808080L;
                            arr_v[v16] = 0xFEFEFEFEFEFEFEFEL & ~v17 + (v17 >>> 7);
                            ++v16;
                            v15 = v15;
                        }
                        int v18 = ibpg.v(arr_v);
                        arr_v[v18 - 1] = arr_v[v18 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                        arr_v[v18] = arr_v[0];
                        int v19 = 0;
                        while(v19 != v14) {
                            int v20 = (v19 & 7) << 3;
                            long v21 = arr_v[v19 >> 3] >> v20 & 0xFFL;
                            if(v21 != 0x80L && v21 == 0xFEL) {
                                Object object1 = arr_object[v19];
                                int v22 = (object1 == null ? 0 : object1.hashCode()) * 0xCC9E2D51;
                                int v23 = v22 ^ v22 << 16;
                                int v24 = this.h(v23 >>> 7);
                                int v25 = v23 >>> 7 & v14;
                                long v26 = (long)(v23 & 0x7F);
                                if((v24 - v25 & v14) / 8 == (v19 - v25 & v14) / 8) {
                                    arr_v[v19 >> 3] = v26 << v20 | ~(0xFFL << v20) & arr_v[v19 >> 3];
                                    int v27 = ibpg.v(arr_v);
                                    arr_v[v27] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                }
                                else {
                                    long v28 = arr_v[v24 >> 3];
                                    int v29 = (v24 & 7) << 3;
                                    long v30 = v26 << v29;
                                    long v31 = ~(0xFFL << v29) & v28;
                                    if((v28 >> v29 & 0xFFL) == 0x80L) {
                                        arr_v[v24 >> 3] = v31 | v30;
                                        arr_v[v19 >> 3] = arr_v[v19 >> 3] & ~(0xFFL << v20) | 0x80L << v20;
                                        arr_object[v24] = arr_object[v19];
                                        arr_object[v19] = null;
                                        arr_v1[v24] = arr_v1[v19];
                                        arr_v1[v19] = 0;
                                    }
                                    else {
                                        arr_v[v24 >> 3] = v31 | v30;
                                        Object object2 = arr_object[v24];
                                        arr_object[v24] = arr_object[v19];
                                        arr_object[v19] = object2;
                                        int v32 = arr_v1[v24];
                                        arr_v1[v24] = arr_v1[v19];
                                        arr_v1[v19] = v32;
                                        --v19;
                                    }
                                    int v33 = ibpg.v(arr_v);
                                    arr_v[v33] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                }
                                ++v19;
                                arr_v = arr_v;
                                v8 = v8;
                            }
                            else {
                                ++v19;
                            }
                        }
                        v34 = v8;
                        this.j();
                    }
                    else {
                        v34 = v8;
                        long[] arr_v2 = this.a;
                        Object[] arr_object1 = this.b;
                        int[] arr_v3 = this.c;
                        int v35 = this.d;
                        this.k(bzl.b(this.d));
                        long[] arr_v4 = this.a;
                        Object[] arr_object2 = this.b;
                        int[] arr_v5 = this.c;
                        int v36 = this.d;
                        int v37 = 0;
                        while(v37 < v35) {
                            if((arr_v2[v37 >> 3] >> ((v37 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object3 = arr_object1[v37];
                                int v38 = (object3 == null ? 0 : object3.hashCode()) * 0xCC9E2D51;
                                int v39 = v38 ^ v38 << 16;
                                int v40 = this.h(v39 >>> 7);
                                int v41 = (v40 & 7) << 3;
                                arr_v6 = arr_v4;
                                arr_v7 = arr_v2;
                                long v42 = arr_v4[v40 >> 3] & ~(0xFFL << v41) | ((long)(v39 & 0x7F)) << v41;
                                arr_v6[v40 >> 3] = v42;
                                arr_v6[(v40 - 7 & v36) + (v36 & 7) >> 3] = v42;
                                arr_object2[v40] = object3;
                                arr_v5[v40] = arr_v3[v37];
                            }
                            else {
                                arr_v6 = arr_v4;
                                arr_v7 = arr_v2;
                            }
                            ++v37;
                            arr_v2 = arr_v7;
                            arr_v4 = arr_v6;
                        }
                    }
                    v13 = this.h(v2);
                }
                else {
                    v34 = v8;
                }
                ++this.e;
                int v43 = this.f;
                long[] arr_v8 = this.a;
                long v44 = arr_v8[v13 >> 3];
                int v45 = (v13 & 7) << 3;
                if((v44 >> v45 & 0xFFL) != 0x80L) {
                    v7 = 0;
                }
                this.f = v43 - v7;
                int v46 = this.d;
                long v47 = v44 & ~(0xFFL << v45) | v34 << v45;
                arr_v8[v13 >> 3] = v47;
                arr_v8[(v13 - 7 & v46) + (v46 & 7) >> 3] = v47;
                return ~v13;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            v1 = v1;
        }
    }

    private final void j() {
        this.f = bzl.a(this.d) - this.e;
    }

    private final void k(int v) {
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
        this.j();
        this.b = new Object[v1];
        this.c = new int[v1];
    }

    @Override
    public final String toString() {
        if(this.e != 0) {
            StringBuilder stringBuilder0 = new StringBuilder("{");
            Object[] arr_object = this.b;
            int[] arr_v = this.c;
            long[] arr_v1 = this.a;
            int v = arr_v1.length - 2;
            if(v >= 0) {
                int v1 = 0;
                int v2 = 0;
                while(true) {
                    long v3 = arr_v1[v1];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        for(int v4 = 0; true; ++v4) {
                            int v5 = 8 - (~(v1 - v) >>> 0x1F);
                            if(v4 >= v5) {
                                break;
                            }
                            if((0xFFL & v3) < 0x80L) {
                                int v6 = (v1 << 3) + v4;
                                Object object0 = arr_object[v6];
                                int v7 = arr_v[v6];
                                if(object0 == this) {
                                    object0 = "(this)";
                                }
                                stringBuilder0.append(object0);
                                stringBuilder0.append("=");
                                stringBuilder0.append(v7);
                                ++v2;
                                if(v2 < this.e) {
                                    stringBuilder0.append(", ");
                                }
                            }
                            v3 >>= 8;
                        }
                        if(v5 == 8) {
                            goto label_30;
                        }
                        break;
                    }
                label_30:
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

