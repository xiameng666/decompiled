public final class byy {
    public long[] a;
    public Object[] b;
    public float[] c;
    public int d;
    public int e;
    private int f;

    public byy() {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = bxo.a;
    }

    public byy(int v) {
        this.a = bzl.a;
        this.b = caa.c;
        this.c = bxo.a;
        this.e(bzl.d(v));
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

    public final void b(Object object0, float f) {
        long[] arr_v4;
        long[] arr_v3;
        int v33;
        long v32;
        int v12;
        Object object1 = object0;
        int v = object1 == null ? 0 : object1.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 >>> 7;
        int v3 = this.d;
        int v4 = v2 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = (long)(v1 & 0x7F);
            long v8 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v9 = 0x101010101010101L * v7 ^ v8;
            long v10 = v9 - 0x101010101010101L & ~v9 & 0x8080808080808080L;
            while(v10 != 0L) {
                int v11 = (Long.numberOfTrailingZeros(v10) >> 3) + v4 & v3;
                if(ibuq.m(this.b[v11], object1)) {
                    v12 = v11;
                    goto label_134;
                }
                v10 &= v10 - 1L;
            }
            if(Long.compare(v8 & ~v8 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v13 = this.c(v2);
                if(this.f == 0 && (this.a[v13 >> 3] >> ((v13 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.d > 8 && Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)this.d) * 25L ^ 0x8000000000000000L) <= 0) {
                        long[] arr_v = this.a;
                        int v14 = this.d;
                        Object[] arr_object = this.b;
                        float[] arr_f = this.c;
                        for(int v15 = 0; v15 < v14 + 7 >> 3; ++v15) {
                            long v16 = arr_v[v15] & 0x8080808080808080L;
                            arr_v[v15] = 0xFEFEFEFEFEFEFEFEL & ~v16 + (v16 >>> 7);
                        }
                        int v17 = ibpg.v(arr_v);
                        arr_v[v17 - 1] = arr_v[v17 - 1] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
                        arr_v[v17] = arr_v[0];
                        int v18 = 0;
                        while(v18 != v14) {
                            int v19 = (v18 & 7) << 3;
                            long v20 = arr_v[v18 >> 3] >> v19 & 0xFFL;
                            if(v20 != 0x80L && v20 == 0xFEL) {
                                Object object2 = arr_object[v18];
                                int v21 = (object2 == null ? 0 : object2.hashCode()) * 0xCC9E2D51;
                                int v22 = v21 ^ v21 << 16;
                                int v23 = this.c(v22 >>> 7);
                                int v24 = v22 >>> 7 & v14;
                                long v25 = (long)(v22 & 0x7F);
                                if((v23 - v24 & v14) / 8 == (v18 - v24 & v14) / 8) {
                                    arr_v[v18 >> 3] = arr_v[v18 >> 3] & ~(0xFFL << v19) | v25 << v19;
                                    int v26 = ibpg.v(arr_v);
                                    arr_v[v26] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v18;
                                }
                                else {
                                    long v27 = arr_v[v23 >> 3];
                                    int v28 = (v23 & 7) << 3;
                                    long v29 = v25 << v28;
                                    long v30 = ~(0xFFL << v28) & v27;
                                    if((v27 >> v28 & 0xFFL) == 0x80L) {
                                        arr_v[v23 >> 3] = v30 | v29;
                                        arr_v[v18 >> 3] = arr_v[v18 >> 3] & ~(0xFFL << v19) | 0x80L << v19;
                                        arr_object[v23] = arr_object[v18];
                                        arr_object[v18] = null;
                                        arr_f[v23] = arr_f[v18];
                                        arr_f[v18] = 0.0f;
                                    }
                                    else {
                                        arr_v[v23 >> 3] = v30 | v29;
                                        Object object3 = arr_object[v23];
                                        arr_object[v23] = arr_object[v18];
                                        arr_object[v18] = object3;
                                        float f1 = arr_f[v23];
                                        arr_f[v23] = arr_f[v18];
                                        arr_f[v18] = f1;
                                        --v18;
                                    }
                                    int v31 = ibpg.v(arr_v);
                                    arr_v[v31] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v18;
                                    v7 = v7;
                                }
                            }
                            else {
                                ++v18;
                            }
                        }
                        v32 = v7;
                        v33 = 0;
                        this.d();
                    }
                    else {
                        v32 = v7;
                        v33 = 0;
                        long[] arr_v1 = this.a;
                        Object[] arr_object1 = this.b;
                        float[] arr_f1 = this.c;
                        int v34 = this.d;
                        this.e(bzl.b(this.d));
                        long[] arr_v2 = this.a;
                        Object[] arr_object2 = this.b;
                        float[] arr_f2 = this.c;
                        int v35 = this.d;
                        int v36 = 0;
                        while(v36 < v34) {
                            if((arr_v1[v36 >> 3] >> ((v36 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object4 = arr_object1[v36];
                                int v37 = (object4 == null ? 0 : object4.hashCode()) * 0xCC9E2D51;
                                int v38 = v37 ^ v37 << 16;
                                int v39 = this.c(v38 >>> 7);
                                int v40 = (v39 & 7) << 3;
                                arr_v3 = arr_v2;
                                arr_v4 = arr_v1;
                                long v41 = arr_v2[v39 >> 3] & ~(0xFFL << v40) | ((long)(v38 & 0x7F)) << v40;
                                arr_v3[v39 >> 3] = v41;
                                arr_v3[(v39 - 7 & v35) + (v35 & 7) >> 3] = v41;
                                arr_object2[v39] = object4;
                                arr_f2[v39] = arr_f1[v36];
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
                    v13 = this.c(v2);
                }
                else {
                    v32 = v7;
                    v33 = 0;
                }
                ++this.e;
                int v42 = this.f;
                long[] arr_v5 = this.a;
                long v43 = arr_v5[v13 >> 3];
                int v44 = (v13 & 7) << 3;
                if((v43 >> v44 & 0xFFL) == 0x80L) {
                    v33 = 1;
                }
                this.f = v42 - v33;
                int v45 = this.d;
                long v46 = v43 & ~(0xFFL << v44) | v32 << v44;
                arr_v5[v13 >> 3] = v46;
                arr_v5[(v13 - 7 & v45) + (v45 & 7) >> 3] = v46;
                v12 = ~v13;
            label_134:
                if(v12 < 0) {
                    v12 = ~v12;
                }
                this.b[v12] = object0;
                this.c[v12] = f;
                return;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            object1 = object0;
            v1 = v1;
        }
    }

    private final int c(int v) {
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

    private final void d() {
        this.f = bzl.a(this.d) - this.e;
    }

    private final void e(int v) {
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
        this.d();
        this.b = new Object[v1];
        this.c = new float[v1];
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof byy)) {
            return false;
        }
        if(((byy)object0).e != this.e) {
            return false;
        }
        Object[] arr_object = this.b;
        float[] arr_f = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 0;
                    while(true) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object1 = arr_object[v5];
                            float f = arr_f[v5];
                            int v6 = ((byy)object0).a(object1);
                            if(v6 >= 0 && f == ((byy)object0).c[v6]) {
                                goto label_25;
                            }
                            return false;
                        }
                    label_25:
                        v2 >>= 8;
                        ++v3;
                    }
                    if(v4 == 8) {
                        goto label_29;
                    }
                    break;
                }
            label_29:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.b;
        float[] arr_f = this.c;
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
                            v2 += Float.floatToIntBits(arr_f[v6]) ^ (object0 == null ? 0 : object0.hashCode());
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
            Object[] arr_object = this.b;
            float[] arr_f = this.c;
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
                                float f = arr_f[v6];
                                if(object0 == this) {
                                    object0 = "(this)";
                                }
                                stringBuilder0.append(object0);
                                stringBuilder0.append("=");
                                stringBuilder0.append(f);
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

