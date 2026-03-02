public final class btf implements Runnable {
    public final bth a;

    public btf(bth bth0) {
        this.a = bth0;
    }

    @Override
    public final void run() {
        btg btg0 = this.a.b;
        if(btg0 != null) {
            for(Object object0: btg0.values()) {
                ((bss)object0).g();
            }
        }
    }
}

