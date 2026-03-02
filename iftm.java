public final class iftm {
    public iftg a;
    public int b;
    public int[] c;

    public iftm(iftg iftg0, int v) {
        this.a = iftg0;
        this.b = v;
        int[] arr_v = new int[v + 1];
        this.c = arr_v;
        arr_v[v] = 1;
    }

    public iftm(iftg iftg0, byte[] arr_b) {
        this.a = iftg0;
        int v = 8;
        int v1;
        for(v1 = 1; iftg0.a > v; ++v1) {
            v += 8;
        }
        if(arr_b.length % v1 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[arr_b.length / v1];
        int v2 = 0;
        while(true) {
            int[] arr_v = this.c;
            int v4 = arr_v.length;
            if(v2 >= v4) {
                break;
            }
            int v5 = 0;
            for(int v3 = 0; v5 < v; ++v3) {
                this.c[v2] ^= (arr_b[v3] & 0xFF) << v5;
                v5 += 8;
            }
            if(!this.a.c(this.c[v2])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            ++v2;
            continue;
        }
        if(v4 != 1 && arr_v[v4 - 1] == 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.j();
    }

    public iftm(iftg iftg0, int[] arr_v) {
        int[] arr_v1;
        this.a = iftg0;
        int v = iftm.a(arr_v);
        if(v == -1) {
            arr_v1 = new int[1];
        }
        else if(arr_v.length == v + 1) {
            arr_v1 = ifth.b(arr_v);
        }
        else {
            int[] arr_v2 = new int[v + 1];
            System.arraycopy(arr_v, 0, arr_v2, 0, v + 1);
            arr_v1 = arr_v2;
        }
        this.c = arr_v1;
        this.j();
    }

    public iftm(iftm iftm0) {
        this.a = iftm0.a;
        this.b = iftm0.b;
        this.c = ifth.b(iftm0.c);
    }

    public static int a(int[] arr_v) {
        int v = arr_v.length;
        do {
            --v;
        }
        while(v >= 0 && arr_v[v] == 0);
        return v;
    }

    public final int b(int v) {
        return v < 0 || v > this.b ? 0 : this.c[v];
    }

    public final int c() {
        int v = this.c.length - 1;
        return this.c[v] == 0 ? -1 : v;
    }

    public static int d(int[] arr_v) {
        int v = iftm.a(arr_v);
        return v == -1 ? 0 : arr_v[v];
    }

    public final iftm e(int v) {
        if(!this.a.c(v)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        int[] arr_v = this.h(this.c, v);
        return new iftm(this.a, arr_v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != null && (object0 instanceof iftm) && this.a.equals(((iftm)object0).a) && this.b == ((iftm)object0).b) {
            int[] arr_v = this.c;
            int[] arr_v1 = ((iftm)object0).c;
            int v = iftm.a(arr_v);
            if(v == iftm.a(arr_v1)) {
                for(int v1 = 0; v1 <= v; ++v1) {
                    if(arr_v[v1] != arr_v1[v1]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(iftm iftm0) {
        this.c = iftm.i(this.c, iftm0.c);
        this.j();
    }

    public final void g(int v) {
        if(!this.a.c(v)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.c = this.h(this.c, v);
        this.j();
    }

    public final int[] h(int[] arr_v, int v) {
        int v1 = iftm.a(arr_v);
        if(v1 != -1) {
            switch(v) {
                case 0: {
                    break;
                }
                case 1: {
                    return ifth.b(arr_v);
                }
                default: {
                    int[] arr_v1 = new int[v1 + 1];
                    while(v1 >= 0) {
                        arr_v1[v1] = this.a.b(arr_v[v1], v);
                        --v1;
                    }
                    return arr_v1;
                }
            }
        }
        return new int[1];
    }

    @Override
    public final int hashCode() {
        int v = this.a.b;
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = this.c;
            if(v1 >= arr_v.length) {
                break;
            }
            v = v * 0x1F + arr_v[v1];
        }
        return v;
    }

    public static final int[] i(int[] arr_v, int[] arr_v1) {
        int[] arr_v2;
        if(arr_v.length < arr_v1.length) {
            arr_v2 = new int[arr_v1.length];
            System.arraycopy(arr_v1, 0, arr_v2, 0, arr_v1.length);
        }
        else {
            int[] arr_v3 = new int[arr_v.length];
            System.arraycopy(arr_v, 0, arr_v3, 0, arr_v.length);
            arr_v = arr_v1;
            arr_v2 = arr_v3;
        }
        int v = arr_v.length;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            arr_v2[v] ^= arr_v[v];
        }
        return arr_v2;
    }

    private final void j() {
        this.b = this.c.length - 1;
        while(true) {
            int v = this.b;
            if(v < 0 || this.c[v] != 0) {
                break;
            }
            this.b = v - 1;
        }
    }

    @Override
    public final String toString() {
        String s = " Polynomial over " + this.a.toString() + ": \n";
        for(int v = 0; true; ++v) {
            int[] arr_v = this.c;
            if(v >= arr_v.length) {
                break;
            }
            iftg iftg0 = this.a;
            int v1 = arr_v[v];
            String s1 = "";
            for(int v2 = 0; v2 < iftg0.a; ++v2) {
                s1 = ((((byte)v1) & 1) == 0 ? "0" : "1") + s1;
                v1 >>>= 1;
            }
            s = s + s1 + "Y^" + v + "+";
        }
        return s + ";";
    }
}

