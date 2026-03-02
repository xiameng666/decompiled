public final class hmoc extends hmoa {
    public hmoc() {
        this.f.f = 4;
    }

    @Override  // hmnz
    public final int g() {
        return this.f.f;
    }

    @Override  // hmoa
    protected final void q() {
        hmof hmof0 = this.f;
        int v = hmof0.l;
        if(v < hmof0.k - 1) {
            hmof0.l = v + 1;
        }
    }
}

