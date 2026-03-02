import java.util.List;

public final class byee extends bydk {
    public final String c;
    public final byte[] d;
    public final List e;
    public final String f;
    public final String g;

    public byee(String s, String s1, byte[] arr_b, List list0, String s2, String s3) {
        super(s, null);
        this.c = s1;
        this.d = arr_b;
        this.e = list0;
        this.f = s2;
        this.g = s3;
    }

    @Override
    public final String toString() {
        return "UserInfoCredentialDisplayContent(fulfillmentActionName=" + this.a + ", metadata=null, title=" + this.c + ", icon=" + this.d + ", fields=" + this.e + ", urlDisplayText=" + this.f + ", urlValue=" + this.g + ")";
    }
}

