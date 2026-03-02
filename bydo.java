public final class bydo extends bydk {
    public final String c;
    public final String d;
    public final byte[] e;
    private final String f;

    public bydo(String s, String s1, String s2, String s3, byte[] arr_b) {
        super(s, null);
        this.c = s1;
        this.f = s2;
        this.d = s3;
        this.e = arr_b;
    }

    @Override
    public final String toString() {
        return "ExportDisplayContent(fulfillmentActionName=" + this.a + ", metadata=null, username=" + this.c + ", providerName=" + this.f + ", displayName=" + this.d + ", icon=" + this.e + ")";
    }
}

