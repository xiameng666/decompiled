public final class acko {
    private final StringBuilder a;
    private boolean b;
    private int c;

    public acko() {
        this.a = new StringBuilder();
        this.b = false;
        this.c = 0;
    }

    public final void a(String s) {
        int v = s.indexOf("\n");
        if(v == 0) {
            this.a.append("\n");
            this.b = true;
            if(s.length() <= 1) {
                return;
            }
            this.a(s.substring(1));
            return;
        }
        if(v > 0) {
            this.a(s.substring(0, v));
            this.a.append("\n");
            this.b = true;
            if(s.length() > v + 1) {
                this.a(s.substring(v + 1));
            }
            return;
        }
        if(this.b) {
            for(int v1 = 0; v1 < this.c; ++v1) {
                this.a.append("  ");
            }
            this.b = false;
        }
        this.a.append(s);
    }

    public final void b(Object object0) {
        this.a(object0.toString());
    }

    public final void c() {
        int v = this.c;
        if(v == 0) {
            throw new IllegalStateException("Cannot set indent level below 0.");
        }
        this.c = v - 1;
    }

    public final void d() {
        ++this.c;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

