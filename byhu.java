public class byhu extends byhy {
    public final String a;
    public final byhw b;
    public final String c;
    public final String d;
    public final String e;

    public byhu(String s, byhw byhw0, String s1) {
        this(s, byhw0, s1, null, null);
    }

    public byhu(String s, byhw byhw0, String s1, String s2, String s3) {
        ibuq.f(s, "providerId");
        super();
        this.a = s;
        this.b = byhw0;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    @Override
    public String toString() {
        return "BaseEntry{providerId=" + this.a + ", credentialId=" + this.b + ", fulfillmentActionName=" + this.c + ", setId=" + this.d + "}";
    }
}

