public final class arhs implements Runnable {
    public final arht a;
    public final asbg b;

    public arhs(arht arht0, asbg asbg0) {
        this.a = arht0;
        this.b = asbg0;
    }

    @Override
    public final void run() {
        arhv.a.h("Retrying the remaining %d items in the queue.", new Object[]{((int)(this.a.c.j.size() + this.a.c.h.size()))});
        this.a.c.a(this.b);
    }
}

