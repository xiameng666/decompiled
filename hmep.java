public final class hmep extends hmeb {
    public hmep() {
        try {
            this.b(new hmgz(2));
        }
        catch(hmdl unused_ex) {
        }
    }

    public hmep(Character character0) {
        this.a = (long)character0.charValue();
        hmgz hmgz0 = hmgz.e(hmgv.b(character0.charValue()));
        hmgz0.t(2);
        super.b(hmgz0);
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F1A");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = hmgv.a(hmgz0.a);
    }
}

