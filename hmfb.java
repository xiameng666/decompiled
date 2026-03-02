public final class hmfb extends hmeb {
    public hmfb() {
        try {
            this.b(new hmgz(1));
        }
        catch(hmdl unused_ex) {
        }
    }

    public hmfb(Byte byte0) {
        this.a = byte0;
        super.b(new hmgz(0));
    }

    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9C");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        Object object0 = null;
        if(hmgz0 != null && hmgz0.b() != 0) {
            object0 = hmgz0.a(0);
        }
        this.a = object0;
    }
}

