public final class bzn {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    private int e;

    public bzn() {
        this.a = bzl.a;
        this.b = caa.c;
    }

    public bzn(int v) {
        this.a = bzl.a;
        this.b = caa.c;
        this.p(bzl.d(v));
    }

    public bzn(byte[] arr_b) {
        this(6);
    }

    public final boolean a(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = this.c;
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
        return this.d == 0;
    }

    public final boolean c() {
        return this.d != 0;
    }

    public final void d() {
        this.d = 0;
        if(this.a != bzl.a) {
            ibpg.aj(this.a, 0x8080808080808080L);
            int v = this.c >> 3;
            long v1 = 0xFFL << ((this.c & 7) << 3);
            this.a[v] = this.a[v] & ~v1 | v1;
        }
        ibpg.f(this.b, null, 0, this.c);
        this.o();
    }

    public final void e(Object object0) {
        int v11;
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = this.c;
        int v3 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v4 = v3 >>> 7;
        while(true) {
            int v5 = v4 & v2;
            int v6 = (v5 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v5 >> 3) + 1] << 0x40 - v6 | this.a[v5 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v3 & 0x7F)) * 0x101010101010101L;
            long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L;
            while(v9 != 0L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v2;
                if(ibuq.m(this.b[v10], object0)) {
                    v11 = v10;
                    goto label_19;
                }
                v9 &= -1L + v9;
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                v11 = -1;
            label_19:
                if(v11 >= 0) {
                    this.i(v11);
                }
                return;
            }
            v += 8;
            v4 = v5 + v;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bzn)) {
            return false;
        }
        if(((bzn)object0).d != this.d) {
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
                        if((0xFFL & v2) < 0x80L && !((bzn)object0).a(arr_object[(v1 << 3) + v3])) {
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

    public final void f(bzn bzn0) {
        ibuq.f(bzn0, "elements");
        Object[] arr_object = bzn0.b;
        long[] arr_v = bzn0.a;
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
                        if((0xFFL & v2) < 0x80L) {
                            this.h(arr_object[(v1 << 3) + v3]);
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void g(Iterable iterable0) {
        ibuq.f(iterable0, "elements");
        for(Object object0: iterable0) {
            this.h(object0);
        }
    }

    public final void h(Object object0) {
        this.b[this.m(object0)] = object0;
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v4];
                            v2 += (object0 == null ? 0 : object0.hashCode());
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

    public final void i(int v) {
        --this.d;
        long[] arr_v = this.a;
        int v1 = v >> 3;
        int v2 = this.c;
        int v3 = (v & 7) << 3;
        long v4 = arr_v[v1] & ~(0xFFL << v3) | 0xFEL << v3;
        arr_v[v1] = v4;
        arr_v[(v - 7 & v2) + (v2 & 7) >> 3] = v4;
        this.b[v] = null;
    }

    public final boolean j(Object object0) {
        int v = this.d;
        this.b[this.m(object0)] = object0;
        return this.d != v;
    }

    public final boolean k(Iterable iterable0) {
        ibuq.f(iterable0, "elements");
        int v = this.d;
        this.g(iterable0);
        return v != this.d;
    }

    public final boolean l(Object object0) {
        int v10;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = this.c;
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
                    this.i(v10);
                }
                return v10 >= 0;
            }
            v4 += 8;
            v3 = v3 + v4 & v1;
            v2 = v2;
        }
    }

    private final int m(Object object0) {
        long[] arr_v4;
        long[] arr_v3;
        int v32;
        long v31;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 >>> 7;
        int v3 = this.c;
        int v4 = v2 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = (long)(v1 & 0x7F);
            long v8 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v9 = 0x101010101010101L * v7 ^ v8;
            for(long v10 = v9 - 0x101010101010101L & ~v9 & 0x8080808080808080L; v10 != 0L; v10 &= v10 - 1L) {
                int v11 = (Long.numberOfTrailingZeros(v10) >> 3) + v4 & v3;
                if(ibuq.m(this.b[v11], object0)) {
                    return v11;
                }
            }
            if(Long.compare(v8 & ~v8 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v12 = this.n(v2);
                if(this.e == 0 && (this.a[v12 >> 3] >> ((v12 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.c > 8 && Long.compare(((long)this.d) * 0x20L ^ 0x8000000000000000L, ((long)this.c) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v13 = this.c;
                        Object[] arr_object = this.b;
                        for(int v14 = 0; v14 < v13 + 7 >> 3; ++v14) {
                            long v15 = arr_v[v14] & 0x8080808080808080L;
                            arr_v[v14] = 0xFEFEFEFEFEFEFEFEL & ~v15 + (v15 >>> 7);
                        }
                        int v16 = ibpg.v(arr_v);
                        arr_v[v16 - 1] = arr_v[v16 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                        arr_v[v16] = arr_v[0];
                        int v17 = 0;
                        while(v17 != v13) {
                            int v18 = (v17 & 7) << 3;
                            long v19 = arr_v[v17 >> 3] >> v18 & 0xFFL;
                            if(v19 != 0x80L && v19 == 0xFEL) {
                                Object object1 = arr_object[v17];
                                int v20 = (object1 == null ? 0 : object1.hashCode()) * 0xCC9E2D51;
                                int v21 = v20 ^ v20 << 16;
                                int v22 = this.n(v21 >>> 7);
                                int v23 = v21 >>> 7 & v13;
                                long v24 = (long)(v21 & 0x7F);
                                if((v22 - v23 & v13) / 8 == (v17 - v23 & v13) / 8) {
                                    arr_v[v17 >> 3] = ~(0xFFL << v18) & arr_v[v17 >> 3] | v24 << v18;
                                    int v25 = ibpg.v(arr_v);
                                    arr_v[v25] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v17;
                                }
                                else {
                                    long v26 = arr_v[v22 >> 3];
                                    int v27 = (v22 & 7) << 3;
                                    long v28 = v24 << v27;
                                    long v29 = v26 & ~(0xFFL << v27);
                                    if((v26 >> v27 & 0xFFL) == 0x80L) {
                                        arr_v[v22 >> 3] = v29 | v28;
                                        arr_v[v17 >> 3] = ~(0xFFL << v18) & arr_v[v17 >> 3] | 0x80L << v18;
                                        arr_object[v22] = arr_object[v17];
                                        arr_object[v17] = null;
                                    }
                                    else {
                                        arr_v[v22 >> 3] = v29 | v28;
                                        Object object2 = arr_object[v22];
                                        arr_object[v22] = arr_object[v17];
                                        arr_object[v17] = object2;
                                        --v17;
                                    }
                                    int v30 = ibpg.v(arr_v);
                                    arr_v[v30] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v17;
                                    arr_v = arr_v;
                                    v7 = v7;
                                }
                            }
                            else {
                                ++v17;
                            }
                        }
                        v31 = v7;
                        v32 = 1;
                        this.o();
                    }
                    else {
                        v31 = v7;
                        v32 = 1;
                        long[] arr_v1 = this.a;
                        Object[] arr_object1 = this.b;
                        int v33 = this.c;
                        this.p(bzl.b(this.c));
                        long[] arr_v2 = this.a;
                        Object[] arr_object2 = this.b;
                        int v34 = this.c;
                        int v35 = 0;
                        while(v35 < v33) {
                            if((arr_v1[v35 >> 3] >> ((v35 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object3 = arr_object1[v35];
                                int v36 = (object3 == null ? 0 : object3.hashCode()) * 0xCC9E2D51;
                                int v37 = v36 ^ v36 << 16;
                                int v38 = this.n(v37 >>> 7);
                                int v39 = (v38 & 7) << 3;
                                arr_v3 = arr_v2;
                                arr_v4 = arr_v1;
                                long v40 = ~(0xFFL << v39) & arr_v2[v38 >> 3] | ((long)(v37 & 0x7F)) << v39;
                                arr_v3[v38 >> 3] = v40;
                                arr_v3[(v38 - 7 & v34) + (v34 & 7) >> 3] = v40;
                                arr_object2[v38] = object3;
                            }
                            else {
                                arr_v3 = arr_v2;
                                arr_v4 = arr_v1;
                            }
                            ++v35;
                            arr_v1 = arr_v4;
                            arr_v2 = arr_v3;
                        }
                    }
                    v12 = this.n(v2);
                }
                else {
                    v31 = v7;
                    v32 = 1;
                }
                ++this.d;
                int v41 = this.e;
                long[] arr_v5 = this.a;
                long v42 = arr_v5[v12 >> 3];
                int v43 = (v12 & 7) << 3;
                if((v42 >> v43 & 0xFFL) != 0x80L) {
                    v32 = 0;
                }
                this.e = v41 - v32;
                int v44 = this.c;
                long v45 = v42 & ~(0xFFL << v43) | v31 << v43;
                arr_v5[v12 >> 3] = v45;
                arr_v5[(v12 - 7 & v44) + (v44 & 7) >> 3] = v45;
                return v12;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            v1 = v1;
        }
    }

    private final int n(int v) {
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

    private final void o() {
        this.e = bzl.a(this.c) - this.d;
    }

    private final void p(int v) {
        long[] arr_v;
        int v1 = 0;
        int v2 = v <= 0 ? 0 : Math.max(7, bzl.c(v));
        this.c = v2;
        if(v2 == 0) {
            arr_v = bzl.a;
        }
        else {
            arr_v = new long[v2 + 15 >> 3];
            ibpg.aj(arr_v, 0x8080808080808080L);
            v1 = v2;
        }
        this.a = arr_v;
        long v3 = 0xFFL << ((7 & v1) << 3);
        arr_v[v1 >> 3] = v3 | arr_v[v1 >> 3] & ~v3;
        this.o();
        this.b = v2 == 0 ? caa.c : new Object[v2];
    }

    @Override
    public final String toString() {
        bzm bzm0 = new bzm(this);
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
        alab1:
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(v2 != 0) {
                                stringBuilder0.append(", ");
                            }
                            if(v2 == -1) {
                                stringBuilder0.append("...");
                                break alab1;
                            }
                            stringBuilder0.append(((CharSequence)bzm0.a(object0)));
                            ++v2;
                        }
                        v3 >>= 8;
                    }
                    if(v5 == 8) {
                        goto label_26;
                    }
                    break;
                }
            label_26:
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

