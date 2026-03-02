public final class akrc implements evqf {
    public final ayuc a;
    public final int b;

    public akrc(ayuc ayuc0, int v) {
        this.a = ayuc0;
        this.b = v;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((azui)object0).q();
        ayuc ayuc0 = this.a;
        if(z) {
            akrd.d(ayuc0);
            return;
        }
        if(((azui)object0).p() == 3 && hpyb.b().b.contains(Integer.valueOf(this.b - 1))) {
            akrd.d(ayuc0);
        }
    }
}

