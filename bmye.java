public final class bmye implements lqj {
    public final bmyh a;

    public bmye(bmyh bmyh0) {
        this.a = bmyh0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        bmpg bmpg0 = bmpf.a(this.a.getString(0x7F151155), null, 0x7F080C07, null, "QR_CODE", 3);  // string:fido_hybrid_button_text "Use a different phone or tablet"
        ggdy ggdy0 = new ggdy();
        bmpj bmpj0 = this.a.ak;
        ggdy0.k(((gged_interceptors)object0));
        ggdy0.i(bmpg0);
        bmpj0.f(ggdy0.h());
        this.a.ai.getViewTreeObserver().addOnGlobalLayoutListener(new bmyg(this.a));
    }
}

