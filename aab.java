public final class aab implements lpp {
    public final aao a;

    public aab(aao aao0) {
        this.a = aao0;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_DESTROY) {
            aao aao0 = this.a;
            aao0.g.b();
            if(!aao0.isChangingConfigurations()) {
                aao0.getViewModelStore().c();
            }
            aao0.j.b.getWindow().getDecorView().removeCallbacks(aao0.j);
            aao0.j.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(aao0.j);
        }
    }
}

