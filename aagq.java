public final class aagq implements Runnable {
    public final aahd a;
    public final int[] b;

    public aagq(aahd aahd0, int[] arr_v) {
        this.a = aahd0;
        this.b = arr_v;
    }

    @Override
    public final void run() {
        this.a.aq.dispatchNestedScroll(1, 0, 0, 0, this.b);
        this.a.aq.stopNestedScroll();
    }
}

