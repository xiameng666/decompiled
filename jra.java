import java.util.Arrays;
import java.util.Objects;

public final class jra {
    int a;
    protected final jrc b;
    public int[] c;
    public int[] d;
    public float[] e;
    public int f;
    private final jrb g;
    private int h;
    private int i;
    private boolean j;

    public jra(jrb jrb0, jrc jrc0) {
        this.a = 0;
        this.h = 8;
        this.c = new int[8];
        this.d = new int[8];
        this.e = new float[8];
        this.f = -1;
        this.i = -1;
        this.j = false;
        this.g = jrb0;
        this.b = jrc0;
    }

    public final float a(jri jri0) {
        int v = this.f;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.c[v] == jri0.c) {
                return this.e[v];
            }
            v = this.d[v];
        }
        return 0.0f;
    }

    public final float b(int v) {
        int v1 = this.f;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.e[v1];
            }
            v1 = this.d[v1];
        }
        return 0.0f;
    }

    public final float c(jri jri0, boolean z) {
        int v = this.f;
        if(v != -1) {
            int v1 = 0;
            int v2 = -1;
            while(v != -1 && v1 < this.a) {
                if(this.c[v] == jri0.c) {
                    if(v == this.f) {
                        this.f = this.d[v];
                    }
                    else {
                        this.d[v2] = this.d[v];
                    }
                    if(z) {
                        jri0.b(this.g);
                    }
                    --jri0.l;
                    --this.a;
                    this.c[v] = -1;
                    if(this.j) {
                        this.i = v;
                    }
                    return this.e[v];
                }
                ++v1;
                v2 = v;
                v = this.d[v];
            }
        }
        return 0.0f;
    }

    public final jri d(int v) {
        int v1 = this.f;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.b.a[this.c[v1]];
            }
            v1 = this.d[v1];
        }
        return null;
    }

    public final void e(jri jri0, float f, boolean z) {
        if(Float.compare(f, -0.001f) <= 0 || f >= 0.001f) {
            int v = this.f;
            if(v == -1) {
                this.f = 0;
                this.e[0] = f;
                this.c[0] = jri0.c;
                this.d[0] = -1;
                ++jri0.l;
                jri0.a(this.g);
                ++this.a;
                if(this.j) {
                    return;
                }
                int v1 = this.i + 1;
                this.i = v1;
                int v2 = this.c.length;
                if(v1 < v2) {
                    return;
                }
                this.j = true;
                this.i = v2 - 1;
                return;
            }
            int v3 = 0;
            int v4 = -1;
            while(true) {
                if(v == -1 || v3 >= this.a) {
                    int v7 = this.i;
                    if(this.j) {
                        int[] arr_v = this.c;
                        if(arr_v[v7] != -1) {
                            v7 = arr_v.length;
                        }
                    }
                    else {
                        ++v7;
                    }
                    int v8 = this.c.length;
                    if(v7 >= v8 && this.a < v8) {
                        int v9 = 0;
                        while(true) {
                            int[] arr_v1 = this.c;
                            if(v9 >= arr_v1.length) {
                                goto label_63;
                            }
                            if(arr_v1[v9] == -1) {
                                v7 = v9;
                                goto label_63;
                            }
                            ++v9;
                        }
                    }
                    else {
                    label_63:
                        int v10 = this.c.length;
                        if(v7 >= v10) {
                            int v11 = this.h + this.h;
                            this.h = v11;
                            this.j = false;
                            this.i = v10 - 1;
                            this.e = Arrays.copyOf(this.e, v11);
                            this.c = Arrays.copyOf(this.c, this.h);
                            this.d = Arrays.copyOf(this.d, this.h);
                            v7 = v10;
                        }
                    }
                    this.c[v7] = jri0.c;
                    this.e[v7] = f;
                    if(v4 == -1) {
                        this.d[v7] = this.f;
                        this.f = v7;
                    }
                    else {
                        int[] arr_v2 = this.d;
                        arr_v2[v7] = arr_v2[v4];
                        arr_v2[v4] = v7;
                    }
                    ++jri0.l;
                    jri0.a(this.g);
                    ++this.a;
                    if(!this.j) {
                        ++this.i;
                    }
                    int v12 = this.c.length;
                    if(this.i < v12) {
                        break;
                    }
                    this.j = true;
                    this.i = v12 - 1;
                    break;
                }
                int v5 = this.c[v];
                int v6 = jri0.c;
                if(v5 == v6) {
                    float[] arr_f = this.e;
                    float f1 = arr_f[v] + f;
                    if(Float.compare(f1, -0.001f) > 0 && (f1 < 0.001f)) {
                        f1 = 0.0f;
                    }
                    arr_f[v] = f1;
                    if(f1 != 0.0f) {
                        break;
                    }
                    if(v == this.f) {
                        this.f = this.d[v];
                    }
                    else {
                        this.d[v4] = this.d[v];
                    }
                    if(z) {
                        jri0.b(this.g);
                    }
                    if(this.j) {
                        this.i = v;
                    }
                    --jri0.l;
                    --this.a;
                    return;
                }
                if(v5 < v6) {
                    v4 = v;
                }
                v = this.d[v];
                ++v3;
            }
        }
    }

    public final void f() {
        int v = this.f;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            jri jri0 = this.b.a[this.c[v]];
            if(jri0 != null) {
                jri0.b(this.g);
            }
            v = this.d[v];
        }
        this.f = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(jri jri0, float f) {
        if(Float.compare(f, 0.0f) == 0) {
            this.c(jri0, true);
            return;
        }
        int v = this.f;
        if(v == -1) {
            this.f = 0;
            this.e[0] = f;
            this.c[0] = jri0.c;
            this.d[0] = -1;
            ++jri0.l;
            jri0.a(this.g);
            ++this.a;
            if(!this.j) {
                int v1 = this.i + 1;
                this.i = v1;
                int v2 = this.c.length;
                if(v1 >= v2) {
                    this.j = true;
                    this.i = v2 - 1;
                }
            }
        }
        else {
            int v4 = -1;
            for(int v3 = 0; v != -1 && v3 < this.a; ++v3) {
                int v5 = this.c[v];
                int v6 = jri0.c;
                if(v5 == v6) {
                    this.e[v] = f;
                    return;
                }
                if(v5 < v6) {
                    v4 = v;
                }
                v = this.d[v];
            }
            int v7 = this.i;
            if(this.j) {
                int[] arr_v = this.c;
                if(arr_v[v7] != -1) {
                    v7 = arr_v.length;
                }
            }
            else {
                ++v7;
            }
            int v8 = this.c.length;
            if(v7 >= v8 && this.a < v8) {
                int v9 = 0;
                while(true) {
                    int[] arr_v1 = this.c;
                    if(v9 >= arr_v1.length) {
                        goto label_50;
                    }
                    if(arr_v1[v9] == -1) {
                        v7 = v9;
                        goto label_50;
                    }
                    ++v9;
                }
            }
            else {
            label_50:
                int v10 = this.c.length;
                if(v7 >= v10) {
                    int v11 = this.h + this.h;
                    this.h = v11;
                    this.j = false;
                    this.i = v10 - 1;
                    this.e = Arrays.copyOf(this.e, v11);
                    this.c = Arrays.copyOf(this.c, this.h);
                    this.d = Arrays.copyOf(this.d, this.h);
                    v7 = v10;
                }
            }
            this.c[v7] = jri0.c;
            this.e[v7] = f;
            if(v4 == -1) {
                this.d[v7] = this.f;
                this.f = v7;
            }
            else {
                int[] arr_v2 = this.d;
                arr_v2[v7] = arr_v2[v4];
                arr_v2[v4] = v7;
            }
            ++jri0.l;
            jri0.a(this.g);
            int v12 = this.a + 1;
            this.a = v12;
            if(!this.j) {
                ++this.i;
            }
            int v13 = this.c.length;
            if(v12 >= v13) {
                this.j = true;
            }
            if(this.i >= v13) {
                this.j = true;
                this.i = v13 - 1;
            }
        }
    }

    @Override
    public final String toString() {
        int v = this.f;
        String s = "";
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            jri jri0 = this.b.a[this.c[v]];
            Objects.toString(jri0);
            s = s + " -> " + this.e[v] + " : " + jri0;
            v = this.d[v];
        }
        return s;
    }
}

