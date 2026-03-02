import java.util.Arrays;

public final class gblm {
    public final String a;
    public final String b;
    public final byte[] c;

    public gblm() {
        this("0", "0", new byte[0]);
    }

    public gblm(String s, String s1, byte[] arr_b) {
        ibuq.f(s, "sessionId");
        ibuq.f(s1, "savedInstanceSource");
        ibuq.f(arr_b, "savedInstance");
        super();
        this.a = s;
        this.b = s1;
        this.c = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gblm)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gblm)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((gblm)object0).b) ? ibuq.m(this.c, ((gblm)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c);
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + v;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c);
        return "SavedInstanceEntity(sessionId=" + this.a + ", savedInstanceSource=" + this.b + ", savedInstance=" + s + ")";
    }
}

