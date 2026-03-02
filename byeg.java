import java.util.List;

public final class byeg extends bydk {
    public final String c;
    public final String d;
    public final byte[] e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public byeg(String s, String s1, String s2, String s3, byte[] arr_b, List list0, String s4, String s5, String s6, String s7, String s8) {
        super(s, s1);
        this.c = s2;
        this.d = s3;
        this.e = arr_b;
        this.f = list0;
        this.g = s4;
        this.h = s5;
        this.i = s6;
        this.j = s7;
        this.k = s8;
    }

    @Override
    public final String toString() {
        return "VerificationCredentialDisplayContent(fulfillmentActionName=" + this.a + ", metadata=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", icon=" + this.e + ", fields=" + this.f + ", disclaimer=" + this.g + ", secondaryDisclaimer=" + this.h + ", urlDisplayText=" + this.i + ", urlValue=" + this.j + ", warning=" + this.k + ")";
    }
}

