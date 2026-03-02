public final class atsp implements Runnable {
    public final atss a;
    public final String b;
    public final String c;

    public atsp(atss atss0, String s, String s1) {
        this.a = atss0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final void run() {
        atrj atrj0;
        String s = this.b;
        synchronized(this.a.a.r) {
            atrj0 = (atrj)this.a.a.r.get(s);
        }
        if(atrj0 != null) {
            atrj0.a(this.c);
            return;
        }
        atst.a.c("Discarded message for unknown namespace \'%s\'", new Object[]{s});
    }
}

