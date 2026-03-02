public final class byds extends bydk {
    public final String c;
    public final String d;
    public final String e;
    public final byte[] f;
    public final String g;
    public final byte[] h;
    public final byte[] i;

    public byds(String s, String s1, String s2, String s3, String s4, byte[] arr_b, String s5, byte[] arr_b1, byte[] arr_b2) {
        super(s, s1);
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = arr_b;
        this.g = s5;
        this.h = arr_b1;
        this.i = arr_b2;
    }

    @Override
    public final String toString() {
        return "PaymentCredentialDisplayContent(fulfillmentActionName=" + this.a + ", metadata=" + this.b + ", merchantName=" + this.c + ", paymentMethodName=" + this.d + ", paymentMethodSubtitle=" + this.e + ", paymentMethodIcon=" + this.f + ", transactionAmount=" + this.g + ", bankIcon=" + this.h + ", paymentProviderIcon=" + this.i + ")";
    }
}

