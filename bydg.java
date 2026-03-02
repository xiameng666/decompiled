public final class bydg implements Runnable {
    public final bydh a;

    public bydg(bydh bydh0) {
        this.a = bydh0;
    }

    @Override
    public final void run() {
        ((ggtj)this.a.b.h()).B("Request callback done, unbinding from remote service: %s", this.a.a);
        this.a.c();
    }
}

