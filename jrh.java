import java.util.Arrays;

public final class jrh extends jrb {
    public int f;
    final jrg g;
    private jri[] h;
    private jri[] i;

    public jrh(jrc jrc0) {
        super(jrc0);
        this.h = new jri[0x80];
        this.i = new jri[0x80];
        this.f = 0;
        this.g = new jrg(this);
    }

    @Override  // jrb
    public final void d(jrd jrd0, jrb jrb0, boolean z) {
        jri jri0 = jrb0.a;
        if(jri0 == null) {
            return;
        }
        jra jra0 = jrb0.e;
        int v = jra0.a;
        for(int v1 = 0; v1 < v; ++v1) {
            jri jri1 = jra0.d(v1);
            float f = jra0.b(v1);
            jrg jrg0 = this.g;
            jrg0.a = jri1;
            if(jrg0.a.b) {
                boolean z1 = true;
                for(int v2 = 0; v2 < 9; ++v2) {
                    float[] arr_f = jrg0.a.i;
                    float f1 = arr_f[v2] + jri0.i[v2] * f;
                    arr_f[v2] = f1;
                    if((Math.abs(f1) < 0.0001f)) {
                        jrg0.a.i[v2] = 0.0f;
                    }
                    else {
                        z1 = false;
                    }
                }
                if(z1) {
                    jrg0.b.n(jrg0.a);
                }
            }
            else {
                for(int v3 = 0; v3 < 9; ++v3) {
                    float f2 = jri0.i[v3];
                    if(f2 == 0.0f) {
                        jrg0.a.i[v3] = 0.0f;
                    }
                    else {
                        jrg0.a.i[v3] = Math.abs(f2 * f) < 0.0001f ? 0.0f : f2 * f;
                    }
                }
                this.m(jri1);
            }
            this.b += jrb0.b * f;
        }
        this.n(jri0);
    }

    @Override  // jrb
    public final boolean e() {
        return this.f == 0;
    }

    @Override  // jrb
    public final jri k(boolean[] arr_z) {
        int v = 0;
        int v1 = -1;
        while(v < this.f) {
            jri[] arr_jri = this.h;
            jri jri0 = arr_jri[v];
            if(!arr_z[jri0.c]) {
                jrg jrg0 = this.g;
                jrg0.a = jri0;
                int v2 = 8;
                if(v1 == -1) {
                    while(v2 >= 0) {
                        float f = jrg0.a.i[v2];
                        if(f > 0.0f) {
                            break;
                        }
                        if(f >= 0.0f) {
                            --v2;
                            continue;
                        }
                        v1 = v;
                        goto label_29;
                    }
                    v1 = -1;
                }
                else {
                    jri jri1 = arr_jri[v1];
                    while(v2 >= 0) {
                        float f1 = jri1.i[v2];
                        float f2 = jrg0.a.i[v2];
                        if(f2 == f1) {
                            --v2;
                            continue;
                        }
                        if(!(f2 < f1)) {
                            break;
                        }
                        v1 = v;
                        break;
                    }
                }
            }
        label_29:
            ++v;
        }
        return v1 == -1 ? null : this.h[v1];
    }

    public final void m(jri jri0) {
        int v3;
        jri[] arr_jri = this.h;
        if(this.f + 1 > arr_jri.length) {
            jri[] arr_jri1 = (jri[])Arrays.copyOf(arr_jri, arr_jri.length + arr_jri.length);
            this.h = arr_jri1;
            this.i = (jri[])Arrays.copyOf(arr_jri1, arr_jri1.length + arr_jri1.length);
        }
        jri[] arr_jri2 = this.h;
        int v = this.f;
        arr_jri2[v] = jri0;
        this.f = v + 1;
        if(v + 1 > 1 && arr_jri2[v].c > jri0.c) {
            for(int v2 = 0; true; ++v2) {
                v3 = this.f;
                if(v2 >= v3) {
                    break;
                }
                this.i[v2] = this.h[v2];
            }
            Arrays.sort(this.i, 0, v3, new jrf());
            for(int v1 = 0; v1 < this.f; ++v1) {
                this.h[v1] = this.i[v1];
            }
        }
        jri0.b = true;
        jri0.a(this);
    }

    public final void n(jri jri0) {
        int v1;
        for(int v = 0; v < this.f; ++v) {
            if(this.h[v] == jri0) {
                while(true) {
                    v1 = this.f - 1;
                    if(v >= v1) {
                        break;
                    }
                    this.h[v] = this.h[v + 1];
                    ++v;
                }
                this.f = v1;
                jri0.b = false;
                return;
            }
        }
    }

    @Override  // jrb
    public final String toString() {
        String s = " goal -> (" + this.b + ") : ";
        for(int v = 0; v < this.f; ++v) {
            this.g.a = this.h[v];
            s = s + this.g + " ";
        }
        return s;
    }
}

