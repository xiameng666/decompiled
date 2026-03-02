final class ucw {
    private boolean a;
    private boolean b;
    private boolean c;

    final void a() {
        synchronized(this) {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    final boolean b() {
        synchronized(this) {
            this.b = true;
        }
        return this.e();
    }

    final boolean c() {
        synchronized(this) {
            this.c = true;
        }
        return this.e();
    }

    final boolean d() {
        synchronized(this) {
            this.a = true;
        }
        return this.e();
    }

    private final boolean e() {
        return (this.c || this.b) && this.a;
    }
}

