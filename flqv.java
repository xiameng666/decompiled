public final class flqv {
    public String a;
    private flra b;

    public final flqw a() {
        String s = this.a;
        if(s != null) {
            flra flra0 = this.b;
            if(flra0 != null) {
                return new flqw(s, flra0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" tag");
        }
        if(this.b == null) {
            stringBuilder0.append(" lighterRetryPolicy");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(flra flra0) {
        if(flra0 == null) {
            throw new NullPointerException("Null lighterRetryPolicy");
        }
        this.b = flra0;
    }
}

