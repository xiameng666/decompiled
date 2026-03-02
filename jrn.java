import java.util.ArrayList;
import java.util.HashSet;

public final class jrn {
    public HashSet a;
    public int b;
    public boolean c;
    public final jro d;
    public jrn e;
    public int f;
    int g;
    public jri h;
    public final int i;

    public jrn(jro jro0, int v) {
        this.a = null;
        this.f = 0;
        this.g = 0x80000000;
        this.d = jro0;
        this.i = v;
    }

    public final int a() {
        return this.c ? this.b : 0;
    }

    public final int b() {
        if(this.d.ai == 8) {
            return 0;
        }
        return this.g == 0x80000000 || (this.e == null || this.e.d.ai != 8) ? this.f : this.g;
    }

    public final jrn c() {
        switch(this.i - 1) {
            case 1: {
                return this.d.M;
            }
            case 2: {
                return this.d.N;
            }
            case 3: {
                return this.d.K;
            }
            case 4: {
                return this.d.L;
            }
            default: {
                return null;
            }
        }
    }

    public final void d(int v, ArrayList arrayList0, jsm jsm0) {
        HashSet hashSet0 = this.a;
        if(hashSet0 != null) {
            for(Object object0: hashSet0) {
                jsf.a(((jrn)object0).d, v, arrayList0, jsm0);
            }
        }
    }

    public final void e() {
        jrn jrn0 = this.e;
        if(jrn0 != null) {
            HashSet hashSet0 = jrn0.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
                if(this.e.a.size() == 0) {
                    this.e.a = null;
                }
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = 0x80000000;
        this.c = false;
        this.b = 0;
    }

    public final void f(int v) {
        this.b = v;
        this.c = true;
    }

    public final void g(int v) {
        if(this.j()) {
            this.g = v;
        }
    }

    public final boolean h() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return false;
        }
        for(Object object0: hashSet0) {
            if(((jrn)object0).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return this.a == null ? false : this.a.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(jrn jrn0) {
        if(jrn0 == null) {
            return false;
        }
        int v = this.i;
        int v1 = jrn0.i;
        if(v1 == v) {
            return v != 6 || jrn0.d.G && this.d.G;
        }
        int v2 = 9;
        int v3 = 4;
        int v4 = 2;
        switch(v - 1) {
            case 1: 
            case 3: {
                v2 = 8;
                goto label_15;
            }
            case 2: 
            case 4: {
                v4 = 3;
                v3 = 5;
            label_15:
                boolean z = v1 == v4 || v1 == v3;
                if((jrn0.d instanceof jrs)) {
                    return z ? true : v1 == v2;
                }
                return z;
            }
            case 5: {
                return v1 != 2 && v1 != 4;
            }
            case 6: {
                return v1 != 6 && v1 != 8 && v1 != 9;
            }
            default: {
                return false;
            }
        }
    }

    public final void l(jrn jrn0, int v) {
        this.n(jrn0, v, 0x80000000, false);
    }

    public final void m() {
        jri jri0 = this.h;
        if(jri0 == null) {
            this.h = new jri(1);
            return;
        }
        jri0.c();
    }

    public final void n(jrn jrn0, int v, int v1, boolean z) {
        if(jrn0 == null) {
            this.e();
            return;
        }
        if(!z && !this.k(jrn0)) {
            return;
        }
        this.e = jrn0;
        if(jrn0.a == null) {
            jrn0.a = new HashSet();
        }
        HashSet hashSet0 = this.e.a;
        if(hashSet0 != null) {
            hashSet0.add(this);
        }
        this.f = v;
        this.g = v1;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.d.aj);
        stringBuilder0.append(":");
        switch(this.i) {
            case 2: {
                s = "LEFT";
                break;
            }
            case 3: {
                s = "TOP";
                break;
            }
            case 4: {
                s = "RIGHT";
                break;
            }
            case 5: {
                s = "BOTTOM";
                break;
            }
            case 6: {
                s = "BASELINE";
                break;
            }
            case 7: {
                s = "CENTER";
                break;
            }
            case 8: {
                s = "CENTER_X";
                break;
            }
            default: {
                s = "CENTER_Y";
            }
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

