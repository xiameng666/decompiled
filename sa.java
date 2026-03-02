import android.util.SparseIntArray;

public abstract class sa {
    final SparseIntArray a;
    final SparseIntArray b;
    public boolean c;

    public sa() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
        this.c = false;
    }

    public int a(int v, int v1) {
        int v7;
        int v3;
        int v2 = this.b(v);
        if(v2 == v1) {
            return 0;
        }
        if(this.c) {
            SparseIntArray sparseIntArray0 = this.a;
            v3 = -1;
            int v4 = sparseIntArray0.size() - 1;
            int v5 = 0;
            while(v5 <= v4) {
                int v6 = v5 + v4 >>> 1;
                if(sparseIntArray0.keyAt(v6) < v) {
                    v5 = v6 + 1;
                }
                else {
                    v4 = v6 - 1;
                }
            }
            if(v5 - 1 >= 0 && v5 - 1 < sparseIntArray0.size()) {
                v3 = sparseIntArray0.keyAt(v5 - 1);
            }
            if(v3 >= 0) {
                v7 = sparseIntArray0.get(v3) + this.b(v3);
                ++v3;
            }
            else {
                v7 = 0;
                v3 = 0;
            }
        }
        else {
            v7 = 0;
            v3 = 0;
        }
        while(v3 < v) {
            int v8 = this.b(v3);
            v7 += v8;
            if(v7 == v1) {
                v7 = 0;
            }
            else if(v7 > v1) {
                v7 = v8;
            }
            ++v3;
        }
        return v2 + v7 > v1 ? 0 : v7;
    }

    public abstract int b(int arg1);

    public final int c(int v, int v1) {
        if(!this.c) {
            return this.a(v, v1);
        }
        SparseIntArray sparseIntArray0 = this.a;
        int v2 = sparseIntArray0.get(v, -1);
        if(v2 != -1) {
            return v2;
        }
        int v3 = this.a(v, v1);
        sparseIntArray0.put(v, v3);
        return v3;
    }

    public final int d(int v, int v1) {
        int v2 = this.b(v);
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            int v6 = this.b(v3);
            v4 += v6;
            if(v4 == v1) {
                ++v5;
                v4 = 0;
            }
            else if(v4 > v1) {
                ++v5;
                v4 = v6;
            }
        }
        return v4 + v2 <= v1 ? v5 : v5 + 1;
    }

    public final void e() {
        this.b.clear();
    }

    public final void f() {
        this.a.clear();
    }
}

