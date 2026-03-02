public final class gqjr {
    private final String a;

    public gqjr() {
        this.a = "Metadata_";
    }

    public final String a(Object object0) {
        String s = object0.toString();
        boolean z = false;
        if(s != null && s.length() != 0) {
            int v = s.length();
            for(int v1 = 0; true; v1 += Character.charCount(v2)) {
                if(v1 >= v) {
                    z = true;
                    break;
                }
                int v2 = s.codePointAt(v1);
                if(!Character.isLetterOrDigit(v2)) {
                    break;
                }
            }
        }
        gftb.f(z, "Invalid key: %s", s);
        return this.a + object0;
    }
}

