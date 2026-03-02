public final class hmex extends hmeb {
    public hmex() {
        try {
            this.b(new hmgz(2));
        }
        catch(hmdl unused_ex) {
        }
    }

    public hmex(Character character0) {
        hmgz hmgz0 = hmgz.e(hmgv.b(character0.charValue()));
        hmgz0.t(2);
        this.a = hmgz0.i();
        super.b(hmgz0);
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("5F2A");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgz0.i();
    }
}

