public final class ddlx implements Comparable {
    public final jwo a;
    public boolean b;

    public ddlx(jwo jwo0) {
        this.b = false;
        this.a = jwo0;
    }

    @Override
    public final int compareTo(Object object0) {
        jwo jwo0 = this.a;
        int v = jwo0.m;
        int v1 = ((ddlx)object0).a.m;
        if(v != v1) {
            return v > v1 ? -1 : 1;
        }
        return jwo0.e.toString().compareTo(jwo0.e.toString());
    }
}

