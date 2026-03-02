public final class hmet extends hmeb {
    public hmet() {
        try {
            this.b(null);
        }
        catch(hmdl unused_ex) {
        }
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F35");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        if(hmgz0 != null && hmgz0.b() != 0) {
            super.b(hmgz0);
            this.a = hmgz0.a(0);
            return;
        }
        super.b(new hmgz(0));
        this.a = (byte)0;
    }
}

