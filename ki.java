final class ki implements nm {
    final kl a;
    private boolean b;

    public ki(kl kl0) {
        this.a = kl0;
        super();
    }

    @Override  // nm
    public final void a(na na0, boolean z) {
        if(this.b) {
            return;
        }
        this.b = true;
        this.a.c.e();
        this.a.a.onPanelClosed(108, na0);
        this.b = false;
    }

    @Override  // nm
    public final boolean b(na na0) {
        this.a.a.onMenuOpened(108, na0);
        return true;
    }
}

