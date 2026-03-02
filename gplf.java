public final class gplf implements Runnable {
    public final gplt a;
    public final String b;
    public final Throwable c;

    public gplf(gplt gplt0, String s, Throwable throwable0) {
        this.a = gplt0;
        this.b = s;
        this.c = throwable0;
    }

    @Override
    public final void run() {
        gplt gplt0 = this.a;
        for(Object object0: gplt0.b) {
            ((gmcd)object0).cancel(true);
        }
        iakv iakv0 = gplt0.j;
        if(iakv0 != null) {
            iakv0.a(this.b, this.c);
        }
    }
}

