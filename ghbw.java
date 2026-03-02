public final class ghbw {
    public ghae a;
    public ghae b;

    public ghbw() {
        this.a = null;
        this.b = null;
    }

    public final void a(ghae ghae0, ghae ghae1) {
        this.a = ghae0;
        this.b = ghae1;
    }

    @Override
    public final String toString() {
        String s = "null";
        String s1 = this.a == null ? "null" : this.a.s();
        ghae ghae0 = this.b;
        if(ghae0 != null) {
            s = ghae0.s();
        }
        return a.r(s, s1, "-");
    }
}

