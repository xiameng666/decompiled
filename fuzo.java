final class fuzo {
    int a;
    int b;
    int c;

    public fuzo() {
        this.a = 0;
        this.b = 0;
        this.c = -1;
    }

    final int a(int v) {
        return fuzo.d(v) == this.c ? this.a : 0;
    }

    final void b(int v) {
        gftb.checkTrue(v != 3);
        int v1 = fuzo.d(v);
        if(v1 != this.c) {
            this.c = v1;
            this.a = 0;
            this.b = 0;
        }
        ++this.a;
    }

    final void c(int v) {
        if(this.c != 3) {
            this.c = 3;
            this.a = 0;
            this.b = 0;
        }
        if(((long)v) > humv.c()) {
            ++this.b;
        }
        else {
            this.b = 0;
        }
        ++this.a;
    }

    private static final int d(int v) {
        switch(v) {
            case 7: {
                return 2;
            }
            case 8: {
                return 2;
            }
            default: {
                return v;
            }
        }
    }
}

