import java.util.Arrays;
import java.util.List;

public final class bxxw {
    public final String a;
    public final String b;
    public final List c;
    public final byte[] d;
    public final byte[] e;
    public final String f;

    public bxxw(String s, String s1, List list0, byte[] arr_b, byte[] arr_b1, String s2, int v) {
        if((v & 4) != 0) {
            list0 = ibps.a;
        }
        if((v & 2) != 0) {
            s1 = "";
        }
        if(1 == (v & 1)) {
            s = "";
        }
        ibuq.f(s, "type");
        ibuq.f(s1, "requestType");
        ibuq.f(list0, "protocolTypes");
        ibuq.f(arr_b, "data");
        ibuq.f(arr_b1, "matcher");
        ibuq.f(s2, "fulfillmentActionName");
        super();
        this.a = s;
        this.b = s1;
        this.c = list0;
        this.d = arr_b;
        this.e = arr_b1;
        this.f = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bxxw)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bxxw)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bxxw)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bxxw)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((bxxw)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((bxxw)object0).e) ? ibuq.m(this.f, ((bxxw)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.d);
        int v1 = Arrays.hashCode(this.e);
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + v) * 0x1F + v1) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.d);
        String s1 = Arrays.toString(this.e);
        return "RegistryWriteRequest(type=" + this.a + ", requestType=" + this.b + ", protocolTypes=" + this.c + ", data=" + s + ", matcher=" + s1 + ", fulfillmentActionName=" + this.f + ")";
    }
}

