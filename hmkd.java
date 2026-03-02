public final class hmkd {
    final hmli a;
    final boolean b;

    public hmkd(hmli hmli0, boolean z) {
        this.b = z;
        if(!z) {
            this.a = hmli.c(hmli0);
            return;
        }
        this.a = hmli0;
    }

    public final hmli a() {
        return this.a == null || this.b ? this.a : hmli.c(this.a);
    }
}

