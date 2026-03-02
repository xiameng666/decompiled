public final class ekiz {
    public final ekit a;
    public final ekih b;
    public final ejze c;
    public final gmcg d;
    private static ekiz e;

    private ekiz(ekit ekit0, ekih ekih0, ejze ejze0) {
        this.a = ekit0;
        this.b = ekih0;
        this.c = ejze0;
        this.d = new bblp(0x7FFFFFFF, 9);
    }

    public static ekiz a(ekit ekit0, ekih ekih0, ejze ejze0) {
        synchronized(ekiz.class) {
            if(ekiz.e == null) {
                ekiz.e = new ekiz(ekit0, ekih0, ejze0);
            }
        }
        return ekiz.e;
    }
}

