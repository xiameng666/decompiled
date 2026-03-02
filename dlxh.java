public final class dlxh implements gftc {
    public final boolean a;

    public dlxh(boolean z) {
        this.a = z;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        if(this.a) {
            gtkb gtkb0 = ((gtkg)object0).v;
            if(gtkb0 == null) {
                gtkb0 = gtkb.b;
            }
            return (gtls.b(gtkb0.e) == null ? gtls.h : gtls.b(gtkb0.e)) == gtls.b;
        }
        return false;
    }
}

