public final class ddkb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ddkb(String s, String s1, String s2, String s3, String s4, String s5) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
    }

    @Override
    public final String toString() {
        return String.format("ConsentText<title=%s, description=%s, footer=%s, learnMoreDescription=%s, positiveButtonText=%s, negativeButtonText=%s>", this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

