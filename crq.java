public final class crq implements ibts {
    public final ibuz a;

    public crq(ibuz ibuz0) {
        this.a = ibuz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v;
        ibuz ibuz0 = this.a;
        if(ibuz0.a) {
            v = 1;
        }
        else {
            ibuq.d(((ijm)object0), "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            v = ((dch)(((ijm)object0))).b ? 1 : 0;
        }
        ibuz0.a = v;
        return Boolean.valueOf(((boolean)(v ^ 1)));
    }
}

