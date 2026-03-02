import java.util.ArrayList;
import java.util.List;

public class jsc implements jsa {
    public jsa a;
    public boolean b;
    public boolean c;
    final jsn d;
    int e;
    public int f;
    int g;
    jsd h;
    public boolean i;
    final List j;
    final List k;
    int l;

    public jsc(jsn jsn0) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.l = 1;
        this.g = 1;
        this.h = null;
        this.i = false;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.d = jsn0;
    }

    public final void a(jsa jsa0) {
        this.j.add(jsa0);
        if(this.i) {
            jsa0.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int v) {
        if(!this.i) {
            this.i = true;
            this.f = v;
            for(Object object0: this.j) {
                ((jsa)object0).f();
            }
        }
    }

    @Override  // jsa
    public final void f() {
        List list0 = this.k;
        for(Object object0: list0) {
            if(!((jsc)object0).i) {
                return;
            }
        }
        this.c = true;
        jsa jsa0 = this.a;
        if(jsa0 != null) {
            jsa0.f();
        }
        if(this.b) {
            this.d.f();
            return;
        }
        int v = 0;
        jsc jsc0 = null;
        for(Object object1: list0) {
            jsc jsc1 = (jsc)object1;
            if(!(jsc1 instanceof jsd)) {
                ++v;
                jsc0 = jsc1;
            }
        }
        if(jsc0 != null && v == 1 && jsc0.i) {
            jsd jsd0 = this.h;
            if(jsd0 == null) {
                this.c(jsc0.f + this.e);
                goto label_32;
            }
            else if(jsd0.i) {
                this.e = this.g * jsd0.f;
                this.c(jsc0.f + this.e);
                goto label_32;
            }
        }
        else {
        label_32:
            jsa jsa1 = this.a;
            if(jsa1 != null) {
                jsa1.f();
            }
        }
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.d.d.aj);
        stringBuilder0.append(":");
        switch(this.l) {
            case 1: {
                s = "UNKNOWN";
                break;
            }
            case 2: {
                s = "HORIZONTAL_DIMENSION";
                break;
            }
            case 3: {
                s = "VERTICAL_DIMENSION";
                break;
            }
            case 4: {
                s = "LEFT";
                break;
            }
            case 5: {
                s = "RIGHT";
                break;
            }
            case 6: {
                s = "TOP";
                break;
            }
            case 7: {
                s = "BOTTOM";
                break;
            }
            case 8: {
                s = "BASELINE";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        Integer integer0 = this.i ? ((int)this.f) : "unresolved";
        stringBuilder0.append(integer0);
        stringBuilder0.append(") <t=");
        stringBuilder0.append(this.k.size());
        stringBuilder0.append(":d=");
        stringBuilder0.append(this.j.size());
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

