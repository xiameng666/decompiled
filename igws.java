public final class igws extends igvx {
    private final int e;

    public igws(igvt igvt0) {
        super(igvt0, "Gender");
        igvv igvv0 = igvt0.e();
        this.e(new igwr(igvt0, "Gender2"));
        this.e(new igwr(igvt0, "Gender1"));
        igvt0.g(igvv0);
        this.e = igvt0.c(2);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return (int)this.e;
    }

    @Override  // igvx
    public final String toString() {
        switch(this.e) {
            case 0: {
                return "Unknown";
            }
            case 1: {
                return "Male";
            }
            case 2: {
                return "Female";
            }
            case 3: {
                return "Not Specified";
            }
            default: {
                return "Error";
            }
        }
    }
}

