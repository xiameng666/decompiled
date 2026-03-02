import android.os.Bundle;

public final class gbfk {
    public final int a;
    public final int b;
    public final Bundle c;
    public final Bundle d;
    private final String e;

    public gbfk(int v, String s, int v1, Bundle bundle0, Bundle bundle1) {
        ibuq.f(s, "actionName");
        ibuq.f(bundle0, "actionRequest");
        super();
        this.a = v;
        this.e = s;
        this.b = v1;
        this.c = bundle0;
        this.d = bundle1;
    }

    public final gbks a(String s) {
        ibuq.f(s, "sessionId");
        Bundle bundle0 = this.d;
        String s1 = String.valueOf(this.a);
        byte[] arr_b = gcur.c(this.c);
        if(bundle0 != null) {
            byte[] arr_b1 = gcur.c(bundle0);
            return arr_b1 == null ? new gbks(s, s1, this.e, this.b, arr_b, new byte[0], System.currentTimeMillis()) : new gbks(s, s1, this.e, this.b, arr_b, arr_b1, System.currentTimeMillis());
        }
        return new gbks(s, s1, this.e, this.b, arr_b, new byte[0], System.currentTimeMillis());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbfk)) {
            return false;
        }
        if(this.a != ((gbfk)object0).a) {
            return false;
        }
        if(!ibuq.m(this.e, ((gbfk)object0).e)) {
            return false;
        }
        if(this.b != ((gbfk)object0).b) {
            return false;
        }
        return ibuq.m(this.c, ((gbfk)object0).c) ? ibuq.m(this.d, ((gbfk)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a * 0x1F + this.e.hashCode()) * 0x1F + this.b) * 0x1F + this.c.hashCode();
        return this.d == null ? v * 0x1F : v * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "ActionData(executionId=" + this.a + ", actionName=" + this.e + ", actionState=" + this.b + ", actionRequest=" + this.c + ", actionResponse=" + this.d + ")";
    }
}

