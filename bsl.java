public final class bsl implements Runnable {
    public final bss a;
    public final int b;
    public final int c;

    public bsl(bss bss0, int v, int v1) {
        this.a = bss0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        boolean z;
        bss bss0 = this.a;
        int v = this.b;
        if(bss0.i == v) {
            z = false;
        }
        else {
            bss0.i = v;
            z = true;
        }
        int v1 = this.c;
        if(bss0.h != v1) {
            bss0.h = v1;
        }
        else if(!z) {
            return;
        }
        bss0.j();
    }
}

