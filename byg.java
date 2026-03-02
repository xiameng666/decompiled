public final class byg {
    public long[] a;
    public long[] b;
    public int c;
    public int d;
    public int e;

    public byg() {
        this.a = bzl.a;
        this.b = byh.a;
    }

    public byg(int v) {
        this.a = bzl.a;
        this.b = byh.a;
        this.d(bzl.d(v));
    }

    public final boolean a(long v) {
        int v1 = byf.a(v) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.c;
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

    public final int b(int v) {
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

    public final void c() {
        this.e = bzl.a(this.c) - this.d;
    }

    public final void d(int v) {
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
        this.c();
        this.b = new long[v1];
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof byg)) {
            return false;
        }
        if(((byg)object0).d != this.d) {
            return false;
        }
        long[] arr_v = this.b;
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
                        if((0xFFL & v2) < 0x80L && !((byg)object0).a(arr_v[(v1 << 3) + v3])) {
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

    @Override
    public final int hashCode() {
        long[] arr_v = this.b;
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
                            v2 += byf.a(arr_v[(v1 << 3) + v4]);
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
        long[] arr_v = this.b;
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
                            long v6 = arr_v[(v1 << 3) + v4];
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

