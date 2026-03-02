public final class iftk {
    protected int a;
    protected int b;
    private int[][] c;
    private int d;

    public iftk() {
        throw null;
    }

    public iftk(int v, int[][] arr2_v) {
        int v2 = arr2_v[0].length;
        if(v2 != v + 0x1F >> 5) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.b = v;
        this.a = arr2_v.length;
        this.d = v2;
        for(int v1 = 0; v1 < this.a; ++v1) {
            int[] arr_v = arr2_v[v1];
            int v3 = this.d - 1;
            arr_v[v3] &= ((v & 0x1F) == 0 ? -1 : (1 << (v & 0x1F)) - 1);
        }
        this.c = arr2_v;
    }

    public iftk(iftk iftk0) {
        this.b = iftk0.b;
        this.a = iftk0.a;
        this.d = iftk0.d;
        this.c = new int[iftk0.c.length][];
        for(int v = 0; true; ++v) {
            int[][] arr2_v = this.c;
            if(v >= arr2_v.length) {
                break;
            }
            arr2_v[v] = ifth.b(iftk0.c[v]);
        }
    }

    public iftk(byte[] arr_b) {
        if(arr_b.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.a = iftj.a(arr_b, 0);
        int v = iftj.a(arr_b, 4);
        this.b = v;
        int v1 = this.a;
        if(v1 <= 0 || (v + 7 >>> 3) * v1 != arr_b.length - 8) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        int v2 = v + 0x1F >>> 5;
        this.d = v2;
        this.c = new int[v1][v2];
        int v3 = 8;
        for(int v4 = 0; v4 < this.a; ++v4) {
            for(int v5 = 0; v5 < v >> 5; ++v5) {
                this.c[v4][v5] = iftj.a(arr_b, v3);
                v3 += 4;
            }
            int v6 = 0;
            while(v6 < (v & 0x1F)) {
                int[] arr_v = this.c[v4];
                arr_v[v >> 5] ^= (arr_b[v3] & 0xFF) << v6;
                v6 += 8;
                ++v3;
            }
        }
    }

    public final byte[] a() {
        int v = this.a;
        int v1 = 8;
        byte[] arr_b = new byte[(this.b + 7 >>> 3) * v + 8];
        iftj.b(v, arr_b, 0);
        iftj.b(this.b, arr_b, 4);
        int v2 = this.b >>> 5;
        int v3 = this.b & 0x1F;
        for(int v4 = 0; v4 < this.a; ++v4) {
            for(int v5 = 0; v5 < v2; ++v5) {
                iftj.b(this.c[v4][v5], arr_b, v1);
                v1 += 4;
            }
            int v6 = 0;
            while(v6 < v3) {
                arr_b[v1] = (byte)(this.c[v4][v2] >>> v6 & 0xFF);
                v6 += 8;
                ++v1;
            }
        }
        return arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof iftk)) {
            return false;
        }
        if(this.a == ((iftk)object0).a && this.b == ((iftk)object0).b && this.d == ((iftk)object0).d) {
            for(int v = 0; v < this.a; ++v) {
                if(!ifth.a(this.c[v], ((iftk)object0).c[v])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a * 0x1F + this.b) * 0x1F + this.d;
        for(int v1 = 0; v1 < this.a; ++v1) {
            v = v * 0x1F + iftq.b(this.c[v1]);
        }
        return v;
    }

    @Override
    public final String toString() {
        int v = this.b & 0x1F;
        int v1 = v == 0 ? this.d : this.d - 1;
        StringBuffer stringBuffer0 = new StringBuffer();
        for(int v2 = 0; v2 < this.a; ++v2) {
            stringBuffer0.append(v2 + ": ");
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.c[v2][v3];
                for(int v5 = 0; v5 < 0x20; ++v5) {
                    if((v4 >>> v5 & 1) == 0) {
                        stringBuffer0.append('0');
                    }
                    else {
                        stringBuffer0.append('1');
                    }
                }
                stringBuffer0.append(' ');
            }
            int v6 = this.c[v2][this.d - 1];
            for(int v7 = 0; v7 < v; ++v7) {
                if((v6 >>> v7 & 1) == 0) {
                    stringBuffer0.append('0');
                }
                else {
                    stringBuffer0.append('1');
                }
            }
            stringBuffer0.append('\n');
        }
        return stringBuffer0.toString();
    }
}

