final class sm implements Runnable {
    final sn a;

    public sm(sn sn0) {
        this.a = sn0;
        super();
    }

    @Override
    public final void run() {
        sn sn0 = this.a;
        if(sn0.e != null && sn0.e.isAttachedToWindow() && sn0.e.getCount() > sn0.e.getChildCount() && sn0.e.getChildCount() <= sn0.k) {
            sn0.r.setInputMethodMode(2);
            sn0.v();
        }
    }
}

