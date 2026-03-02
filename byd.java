public final class byd {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public byd() {
        this.a = bzl.a;
        this.b = byh.a;
        this.c = caa.c;
    }

    public byd(int v) {
        this.a = bzl.a;
        this.b = byh.a;
        this.c = caa.c;
        this.h(bzl.d(v));
    }

    public byd(byte[] arr_b) {
        this(6);
    }

    public final Object a(long v) {
        int v1 = byc.a(v) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v4 >> 3) + 1] << 0x40 - v6 | this.a[v4 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v2 & 0x7F)) * 0x101010101010101L;
            for(long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L; v9 != 0L; v9 &= -1L + v9) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    return v10 < 0 ? null : this.c[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final boolean b(long v) {
        int v1 = byc.a(v) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v4 >> 3) + 1] << 0x40 - v6 | this.a[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L; v9 != 0L; v9 &= -1L + v9) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    return v10 >= 0;
                }
            }
            if((~v7 << 6 & v7 & 0x8080808080808080L) != 0L) {
                break;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
        return false;
    }

    public final Object c(long v) {
        int v11;
        int v1 = byn.a(v) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v4 >> 3) + 1] << 0x40 - v6 | this.a[v4 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v2 & 0x7F)) * 0x101010101010101L;
            long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L;
            while(Long.compare(v9, 0L) != 0) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    v11 = v10;
                    goto label_18;
                }
                v9 &= -1L + v9;
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                v11 = -1;
            label_18:
                if(v11 >= 0) {
                    --this.e;
                    long[] arr_v = this.a;
                    int v12 = this.d;
                    int v13 = (v11 & 7) << 3;
                    long v14 = arr_v[v11 >> 3] & ~(0xFFL << v13) | 0xFEL << v13;
                    arr_v[v11 >> 3] = v14;
                    arr_v[(v11 - 7 & v12) + (v12 & 7) >> 3] = v14;
                    Object[] arr_object = this.c;
                    Object object0 = arr_object[v11];
                    arr_object[v11] = null;
                    return object0;
                }
                return null;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final void d() {
        this.e = 0;
        if(this.a != bzl.a) {
            ibpg.aj(this.a, 0x8080808080808080L);
            int v = this.d >> 3;
            long v1 = 0xFFL << ((this.d & 7) << 3);
            this.a[v] = this.a[v] & ~v1 | v1;
        }
        ibpg.f(this.c, null, 0, this.d);
        this.g();
    }

    public final void e(long v, Object object0) {
        long[] arr_v7;
        long[] arr_v6;
        int v16;
        int v11;
        int v1 = byn.a(v) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v4 >> 3) + 1] << 0x40 - v6 | this.a[v4 >> 3] >>> v6;
            long v8 = 0x101010101010101L * ((long)(v2 & 0x7F)) ^ v7;
            for(long v9 = ~v8 & 0xFEFEFEFEFEFEFEFFL + v8 & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    v11 = v10;
                    this.b[v11] = v;
                    this.c[v11] = object0;
                    return;
                }
            }
            if(Long.compare(v7 & ~v7 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v12 = this.f(v2 >>> 7);
                if(this.f == 0 && (this.a[v12 >> 3] >> ((v12 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.d > 8 && Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)this.d) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v13 = this.d;
                        long[] arr_v1 = this.b;
                        Object[] arr_object = this.c;
                        for(int v14 = 0; v14 < v13 + 7 >> 3; ++v14) {
                            long v15 = arr_v[v14] & 0x8080808080808080L;
                            arr_v[v14] = 0xFEFEFEFEFEFEFEFEL & ~v15 + (v15 >>> 7);
                        }
                        v16 = 0;
                        int v17 = ibpg.v(arr_v);
                        arr_v[v17 - 1] = arr_v[v17 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                        arr_v[v17] = arr_v[0];
                        for(int v18 = 0; v18 != v13; ++v18) {
                            int v19 = (v18 & 7) << 3;
                            long v20 = arr_v[v18 >> 3] >> v19 & 0xFFL;
                            if(v20 != 0x80L && v20 == 0xFEL) {
                                int v21 = byn.a(arr_v1[v18]) * 0xCC9E2D51;
                                int v22 = v21 ^ v21 << 16;
                                int v23 = this.f(v22 >>> 7);
                                int v24 = v22 >>> 7 & v13;
                                long v25 = (long)(v22 & 0x7F);
                                if((v23 - v24 & v13) / 8 == (v18 - v24 & v13) / 8) {
                                    arr_v[v18 >> 3] = arr_v[v18 >> 3] & ~(0xFFL << v19) | v25 << v19;
                                    int v26 = ibpg.v(arr_v);
                                    arr_v[v26] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                }
                                else {
                                    long v27 = arr_v[v23 >> 3];
                                    int v28 = (v23 & 7) << 3;
                                    long v29 = v25 << v28;
                                    long v30 = ~(0xFFL << v28) & v27;
                                    if((v27 >> v28 & 0xFFL) == 0x80L) {
                                        arr_v[v23 >> 3] = v30 | v29;
                                        arr_v[v18 >> 3] = arr_v[v18 >> 3] & ~(0xFFL << v19) | 0x80L << v19;
                                        arr_v1[v23] = arr_v1[v18];
                                        arr_v1[v18] = 0L;
                                        arr_object[v23] = arr_object[v18];
                                        arr_object[v18] = null;
                                    }
                                    else {
                                        arr_v[v23 >> 3] = v30 | v29;
                                        long v31 = arr_v1[v23];
                                        arr_v1[v23] = arr_v1[v18];
                                        arr_v1[v18] = v31;
                                        Object object1 = arr_object[v23];
                                        arr_object[v23] = arr_object[v18];
                                        arr_object[v18] = object1;
                                        --v18;
                                    }
                                    int v32 = ibpg.v(arr_v);
                                    arr_v[v32] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                }
                            }
                        }
                        this.g();
                    }
                    else {
                        v16 = 0;
                        long[] arr_v2 = this.a;
                        long[] arr_v3 = this.b;
                        Object[] arr_object1 = this.c;
                        int v33 = this.d;
                        this.h(bzl.b(this.d));
                        long[] arr_v4 = this.a;
                        long[] arr_v5 = this.b;
                        Object[] arr_object2 = this.c;
                        int v34 = this.d;
                        int v35 = 0;
                        while(v35 < v33) {
                            if((arr_v2[v35 >> 3] >> ((v35 & 7) << 3) & 0xFFL) < 0x80L) {
                                long v36 = arr_v3[v35];
                                int v37 = byn.a(v36) * 0xCC9E2D51;
                                int v38 = v37 ^ v37 << 16;
                                arr_v6 = arr_v4;
                                int v39 = this.f(v38 >>> 7);
                                int v40 = (v39 & 7) << 3;
                                arr_v7 = arr_v2;
                                long v41 = arr_v6[v39 >> 3] & ~(0xFFL << v40) | ((long)(v38 & 0x7F)) << v40;
                                arr_v6[v39 >> 3] = v41;
                                arr_v6[(v39 - 7 & v34) + (v34 & 7) >> 3] = v41;
                                arr_v5[v39] = v36;
                                arr_object2[v39] = arr_object1[v35];
                            }
                            else {
                                arr_v6 = arr_v4;
                                arr_v7 = arr_v2;
                            }
                            ++v35;
                            arr_v4 = arr_v6;
                            arr_v2 = arr_v7;
                        }
                    }
                    v12 = this.f(v2 >>> 7);
                }
                else {
                    v16 = 0;
                }
                v11 = v12;
                ++this.e;
                int v42 = this.f;
                long[] arr_v8 = this.a;
                long v43 = arr_v8[v11 >> 3];
                int v44 = (v11 & 7) << 3;
                if((v43 >> v44 & 0xFFL) == 0x80L) {
                    v16 = 1;
                }
                this.f = v42 - v16;
                int v45 = this.d;
                long v46 = v43 & ~(0xFFL << v44) | ((long)(v2 & 0x7F)) << v44;
                arr_v8[v11 >> 3] = v46;
                arr_v8[(v11 - 7 & v45) + (v45 & 7) >> 3] = v46;
                this.b[v11] = v;
                this.c[v11] = object0;
                return;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof byd)) {
            return false;
        }
        if(((byd)object0).e != this.e) {
            return false;
        }
        long[] arr_v = this.b;
        Object[] arr_object = this.c;
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
                            long v6 = arr_v[v5];
                            Object object1 = arr_object[v5];
                            if(object1 == null) {
                                if(((byd)object0).a(v6) != null || !((byd)object0).b(v6)) {
                                    return false;
                                }
                            }
                            else if(!ibuq.m(object1, ((byd)object0).a(v6))) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
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
        return true;
    }

    private final int f(int v) {
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

    private final void g() {
        this.f = bzl.a(this.d) - this.e;
    }

    private final void h(int v) {
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
        this.g();
        this.b = new long[v1];
        this.c = new Object[v1];
    }

    @Override
    public final int hashCode() {
        long[] arr_v = this.b;
        Object[] arr_object = this.c;
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
                            long v7 = arr_v[v6];
                            Object object0 = arr_object[v6];
                            v2 += (object0 == null ? 0 : object0.hashCode()) ^ byc.a(v7);
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
        int v9;
        int v7;
        if(this.e != 0) {
            StringBuilder stringBuilder0 = new StringBuilder("{");
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
            long[] arr_v1 = this.a;
            int v = arr_v1.length - 2;
            if(v >= 0) {
                int v2 = 0;
                for(int v1 = 0; true; v1 = v9 + 1) {
                    long v3 = arr_v1[v1];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v4 = 0;
                        while(true) {
                            int v5 = 8 - (~(v1 - v) >>> 0x1F);
                            if(v4 >= v5) {
                                break;
                            }
                            if((0xFFL & v3) < 0x80L) {
                                int v6 = (v1 << 3) + v4;
                                v7 = v1;
                                long v8 = arr_v[v6];
                                Object object0 = arr_object[v6];
                                stringBuilder0.append(v8);
                                stringBuilder0.append("=");
                                if(object0 == this) {
                                    object0 = "(this)";
                                }
                                stringBuilder0.append(object0);
                                ++v2;
                                if(v2 < this.e) {
                                    stringBuilder0.append(", ");
                                }
                            }
                            else {
                                v7 = v1;
                            }
                            v3 >>= 8;
                            ++v4;
                            v1 = v7;
                        }
                        if(v5 != 8) {
                            break;
                        }
                    }
                    v9 = v1;
                    if(v9 == v) {
                        break;
                    }
                }
            }
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }
        return "{}";
    }
}

