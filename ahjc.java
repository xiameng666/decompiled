public final class ahjc {
    public int a;
    public String b;
    public boolean c;
    public String d;
    public String e;

    public ahjc() {
        this.a = 0x7F0806BB;
        this.c = false;
    }

    public final void a(int v, boolean z) {
        this.c = z;
        this.a = v;
    }

    public final void b(int v) {
        switch(v - 1) {
            case 0: {
                this.a(0x7F080DAA, false);
                return;
            }
            case 1: {
                this.a(0x7F080D17, false);
                return;
            }
            default: {
                this.a(0x7F0806BB, true);
            }
        }
    }
}

