import java.util.Arrays;

public final class gbks {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;
    public byte[] f;
    public final long g;

    public gbks() {
        this("0", "0", "actionName", 0, new byte[0], new byte[0], 0L);
    }

    public gbks(String s, String s1, String s2, int v, byte[] arr_b, byte[] arr_b1, long v1) {
        ibuq.f(s, "sessionId");
        ibuq.f(s1, "actionId");
        ibuq.f(s2, "actionName");
        ibuq.f(arr_b, "actionRequest");
        ibuq.f(arr_b1, "actionResponse");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = arr_b;
        this.f = arr_b1;
        this.g = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbks)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gbks)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((gbks)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((gbks)object0).c)) {
            return false;
        }
        if(this.d != ((gbks)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((gbks)object0).e)) {
            return false;
        }
        return ibuq.m(this.f, ((gbks)object0).f) ? this.g == ((gbks)object0).g : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.e);
        int v1 = Arrays.hashCode(this.f);
        return (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d) * 0x1F + v) * 0x1F + v1) * 0x1F + ((int)(this.g ^ this.g >>> 0x20));
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.e);
        String s1 = Arrays.toString(this.f);
        return "ActionEntity(sessionId=" + this.a + ", actionId=" + this.b + ", actionName=" + this.c + ", actionState=" + this.d + ", actionRequest=" + s + ", actionResponse=" + s1 + ", actionCreatedTime=" + this.g + ")";
    }
}

