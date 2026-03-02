import java.util.HashMap;
import java.util.Map;

public final class fdyo implements Comparable {
    public final fdxn a;
    public int b;
    public fdxn c;
    public boolean d;
    public final Map e;
    public final boolean f;
    public boolean g;

    private fdyo(fdxn fdxn0, int v, boolean z) {
        this.e = new HashMap();
        this.a = fdxn0;
        this.b = v;
        this.f = z;
    }

    public fdyo(fdxn fdxn0, boolean z) {
        this.e = new HashMap();
        this.a = fdxn0;
        this.f = z;
    }

    public final int a(fdyo fdyo0) {
        return this.a.a.compareTo(fdyo0.a.a);
    }

    protected final fdyo b() {
        fdyo fdyo0 = new fdyo(this.a, this.b, this.f);
        fdyo0.e.putAll(this.e);
        fdyo0.d = this.d;
        fdyo0.c = this.c;
        return fdyo0;
    }

    public final String c(boolean z) {
        fdxn fdxn1;
        StringBuilder stringBuilder0 = new StringBuilder("NodeInfo{");
        boolean z1 = this.f;
        if(fdxu.w(z1, z, this)) {
            stringBuilder0.append(this.a.b);
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("id=");
        stringBuilder0.append(this.a.a);
        stringBuilder0.append(", isWatch=");
        stringBuilder0.append(z1);
        stringBuilder0.append(", isLeaf=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", hops=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", bestRoute=");
        if(fdxu.w(z1, z, null)) {
            fdxn1 = this.c;
        }
        else {
            fdxn fdxn0 = this.c;
            fdxn1 = fdxn0 == null ? this.c : fdxn0.a;
        }
        stringBuilder0.append(fdxn1);
        stringBuilder0.append(", connections[");
        boolean z2 = false;
        for(Object object0: this.e.values()) {
            if(z2) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(((fdyp)object0));
            z2 = true;
        }
        stringBuilder0.append("]}");
        return stringBuilder0.toString();
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((fdyo)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fdyo) ? this.a.equals(((fdyo)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.c(false);
    }
}

