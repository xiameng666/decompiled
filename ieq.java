public final class ieq {
    private final ijh a;

    public ieq() {
        this.a = new ijh(ies.a);
    }

    public final ify a() {
        ify ify0 = (ify)this.a.first();
        this.e(ify0);
        return ify0;
    }

    public final void b(ify ify0) {
        if(!ify0.am()) {
            hxt.d("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(ify0);
    }

    public final boolean c(ify ify0) {
        return this.a.contains(ify0);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(ify ify0) {
        if(!ify0.am()) {
            hxt.d("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(ify0);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

