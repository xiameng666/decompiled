public final class atln {
    public String a;
    private Long b;
    private int c;

    public atln() {
    }

    public atln(atlo atlo0) {
        this.a = atlo0.a;
        this.c = atlo0.c;
        this.b = atlo0.b;
    }

    public final atlo a() {
        String s = this.a;
        if(s != null) {
            int v = this.c;
            if(v != 0) {
                Long long0 = this.b;
                if(long0 != null) {
                    return new atlo(s, v, long0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" pkg");
        }
        if(this.c == 0) {
            stringBuilder0.append(" appState");
        }
        if(this.b == null) {
            stringBuilder0.append(" firstOpenTimestamp");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        if(v == 0) {
            throw new NullPointerException("Null appState");
        }
        this.c = v;
    }

    public final void c(Long long0) {
        if(long0 == null) {
            throw new NullPointerException("Null firstOpenTimestamp");
        }
        this.b = long0;
    }
}

