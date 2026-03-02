public final class bzk {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public bzk() {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = caa.c;
    }

    public bzk(int v) {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = caa.c;
        if(v < 0) {
            cad.a("Capacity must be a positive value.");
        }
        this.n(bzl.d(v));
    }

    public bzk(byte[] arr_b) {
        this(6);
    }

    public final Object a(Object object0) {
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
                    return v10 < 0 ? null : this.c[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v += 8;
        }
    }

    public final boolean b(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = this.d;
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

    public final boolean c(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = this.d;
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

    public final boolean d(Object object0) {
        Object[] arr_object = this.c;
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
                        if((0xFFL & v2) < 0x80L && ibuq.m(object0, arr_object[(v1 << 3) + v3])) {
                            return true;
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.e == 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bzk)) {
            return false;
        }
        if(((bzk)object0).e != this.e) {
            return false;
        }
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
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
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object1 = arr_object[v5];
                            Object object2 = arr_object1[v5];
                            if(object2 == null) {
                                if(((bzk)object0).a(object1) != null || !((bzk)object0).c(object1)) {
                                    return false;
                                }
                            }
                            else if(!ibuq.m(object2, ((bzk)object0).a(object1))) {
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

    public final boolean f() {
        return this.e != 0;
    }

    public final int g(Object object0) {
        long[] arr_v4;
        long[] arr_v3;
        long v33;
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
                int v13 = this.l(v2);
                if(this.f == 0 && (this.a[v13 >> 3] >> ((v13 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.d > 8 && Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)this.d) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v14 = this.d;
                        Object[] arr_object = this.b;
                        Object[] arr_object1 = this.c;
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
                                int v24 = this.l(v23 >>> 7);
                                int v25 = v23 >>> 7 & v14;
                                long v26 = (long)(v23 & 0x7F);
                                if((v24 - v25 & v14) / 8 == (v19 - v25 & v14) / 8) {
                                    arr_v[v19 >> 3] = v26 << v20 | ~(0xFFL << v20) & arr_v[v19 >> 3];
                                    int v27 = ibpg.v(arr_v);
                                    arr_v[v27] = arr_v[0];
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
                                        arr_object1[v24] = arr_object1[v19];
                                        arr_object1[v19] = null;
                                    }
                                    else {
                                        arr_v[v24 >> 3] = v31 | v30;
                                        Object object2 = arr_object[v24];
                                        arr_object[v24] = arr_object[v19];
                                        arr_object[v19] = object2;
                                        Object object3 = arr_object1[v24];
                                        arr_object1[v24] = arr_object1[v19];
                                        arr_object1[v19] = object3;
                                        --v19;
                                    }
                                    int v32 = ibpg.v(arr_v);
                                    arr_v[v32] = arr_v[0];
                                }
                                ++v19;
                                arr_v = arr_v;
                                v8 = v8;
                            }
                            else {
                                ++v19;
                            }
                        }
                        v33 = v8;
                        this.m();
                    }
                    else {
                        v33 = v8;
                        long[] arr_v1 = this.a;
                        Object[] arr_object2 = this.b;
                        Object[] arr_object3 = this.c;
                        int v34 = this.d;
                        this.n(bzl.b(this.d));
                        long[] arr_v2 = this.a;
                        Object[] arr_object4 = this.b;
                        Object[] arr_object5 = this.c;
                        int v35 = this.d;
                        int v36 = 0;
                        while(v36 < v34) {
                            if((arr_v1[v36 >> 3] >> ((v36 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object4 = arr_object2[v36];
                                int v37 = (object4 == null ? 0 : object4.hashCode()) * 0xCC9E2D51;
                                int v38 = v37 ^ v37 << 16;
                                int v39 = this.l(v38 >>> 7);
                                int v40 = (v39 & 7) << 3;
                                arr_v3 = arr_v2;
                                arr_v4 = arr_v1;
                                long v41 = arr_v2[v39 >> 3] & ~(0xFFL << v40) | ((long)(v38 & 0x7F)) << v40;
                                arr_v3[v39 >> 3] = v41;
                                arr_v3[(v39 - 7 & v35) + (v35 & 7) >> 3] = v41;
                                arr_object4[v39] = object4;
                                arr_object5[v39] = arr_object3[v36];
                            }
                            else {
                                arr_v3 = arr_v2;
                                arr_v4 = arr_v1;
                            }
                            ++v36;
                            arr_v1 = arr_v4;
                            arr_v2 = arr_v3;
                        }
                    }
                    v13 = this.l(v2);
                }
                else {
                    v33 = v8;
                }
                ++this.e;
                int v42 = this.f;
                long[] arr_v5 = this.a;
                long v43 = arr_v5[v13 >> 3];
                int v44 = (v13 & 7) << 3;
                if((v43 >> v44 & 0xFFL) != 0x80L) {
                    v7 = 0;
                }
                this.f = v42 - v7;
                int v45 = this.d;
                long v46 = v43 & ~(0xFFL << v44) | v33 << v44;
                arr_v5[v13 >> 3] = v46;
                arr_v5[(v13 - 7 & v45) + (v45 & 7) >> 3] = v46;
                return ~v13;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            v1 = v1;
        }
    }

    public final Object h(Object object0) {
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
                    return v10 < 0 ? null : this.i(v10);
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v += 8;
        }
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
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
                            int v6 = (v1 << 3) + v4;
                            Object object0 = arr_object[v6];
                            Object object1 = arr_object1[v6];
                            v2 += (object1 == null ? 0 : object1.hashCode()) ^ (object0 == null ? 0 : object0.hashCode());
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

    public final Object i(int v) {
        --this.e;
        long[] arr_v = this.a;
        int v1 = v >> 3;
        int v2 = this.d;
        int v3 = (v & 7) << 3;
        long v4 = arr_v[v1] & ~(0xFFL << v3) | 0xFEL << v3;
        arr_v[v1] = v4;
        arr_v[(v - 7 & v2) + (v2 & 7) >> 3] = v4;
        this.b[v] = null;
        Object[] arr_object = this.c;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        return object0;
    }

    public final void j() {
        this.e = 0;
        if(this.a != bzl.a) {
            ibpg.aj(this.a, 0x8080808080808080L);
            int v = this.d >> 3;
            long v1 = 0xFFL << ((this.d & 7) << 3);
            this.a[v] = this.a[v] & ~v1 | v1;
        }
        ibpg.f(this.c, null, 0, this.d);
        ibpg.f(this.b, null, 0, this.d);
        this.m();
    }

    public final void k(Object object0, Object object1) {
        int v = this.g(object0);
        if(v < 0) {
            v = ~v;
        }
        this.b[v] = object0;
        this.c[v] = object1;
    }

    private final int l(int v) {
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

    private final void m() {
        this.f = bzl.a(this.d) - this.e;
    }

    private final void n(int v) {
        Object[] arr_object;
        long[] arr_v;
        int v1 = 0;
        int v2 = v <= 0 ? 0 : Math.max(7, bzl.c(v));
        this.d = v2;
        if(v2 == 0) {
            arr_v = bzl.a;
        }
        else {
            arr_v = new long[v2 + 15 >> 3];
            ibpg.aj(arr_v, 0x8080808080808080L);
            long v3 = 0xFFL << ((v2 & 7) << 3);
            arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~v3 | v3;
        }
        this.a = arr_v;
        this.m();
        if(v2 == 0) {
            arr_object = caa.c;
        }
        else {
            v1 = v2;
            arr_object = new Object[v2];
        }
        this.b = arr_object;
        this.c = v1 == 0 ? caa.c : new Object[v1];
    }

    @Override
    public final String toString() {
        if(this.e()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        Object[] arr_object = this.b;
        Object[] arr_object1 = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v4;
                            Object object0 = arr_object[v6];
                            Object object1 = arr_object1[v6];
                            if(object0 == this) {
                                object0 = "(this)";
                            }
                            stringBuilder0.append(object0);
                            stringBuilder0.append("=");
                            if(object1 == this) {
                                object1 = "(this)";
                            }
                            stringBuilder0.append(object1);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(", ");
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v5 == 8) {
                        goto label_33;
                    }
                    break;
                }
            label_33:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

