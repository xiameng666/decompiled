import j..util.Objects;

final class iaxe implements Runnable {
    final iapk a;
    final iauz b;
    final iaof_metadata c;
    final iaxf d;

    public iaxe(iaxf iaxf0, iapk iapk0, iauz iauz0, iaof_metadata iaof0) {
        this.a = iapk0;
        this.b = iauz0;
        this.c = iaof0;
        Objects.requireNonNull(iaxf0);
        this.d = iaxf0;
        super();
    }

    @Override
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}

