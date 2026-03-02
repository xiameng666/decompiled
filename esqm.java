import j..util.Objects;

final class esqm implements essa {
    private final uwd a;
    private final String b;
    private boolean c;

    public esqm(esqn esqn0, uwj uwj0, uwm uwm0) {
        Objects.requireNonNull(esqn0);
        super();
        this.c = false;
        uwd uwd0 = new uwd(new uwk(uwj0, uwm0));
        this.a = uwd0;
        uwd0.a();
        this.b = uwm0.a;
    }

    @Override  // essa
    public final essh a() {
        return new esry(((int)this.a.b()), this.c, this.b);
    }

    @Override  // essa
    public final byte[] d(byte[] arr_b) {
        if(arr_b[0] != 0 || arr_b[1] != -92) {
            this.c = true;
        }
        return this.a.c(arr_b);
    }
}

