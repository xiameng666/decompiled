public enum bnbi {
    HINT_GET_ASSERTION("ga"),
    HINT_MAKE_CREDENTIAL("mc"),
    HINT_DIGITAL_CREDENTIAL_PRESENTMENT("dcp"),
    HINT_DIGITAL_CREDENTIAL_ISSUANCE("dci"),
    HINT_UNKNOWN("unknown");

    public final String f;

    private bnbi(String s1) {
        this.f = s1;
    }

    public static bnbi a(String s) {
        bnbi[] arr_bnbi = bnbi.values();
        for(int v = 0; v < arr_bnbi.length; ++v) {
            bnbi bnbi0 = arr_bnbi[v];
            if(bnbi0.f.equals(s)) {
                return bnbi0;
            }
        }
        return bnbi.e;
    }

    @Override
    public final String toString() {
        return this.f;
    }
}

