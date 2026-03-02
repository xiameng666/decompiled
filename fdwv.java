public final class fdwv {
    private fdwu a;

    public final fdww a() {
        fdwu fdwu0 = this.a;
        if(fdwu0 != null) {
            return new fdww(fdwu0);
        }
        throw new IllegalStateException("Missing required properties: dataSyncMode");
    }

    public final void b(fdwu fdwu0) {
        if(fdwu0 == null) {
            throw new NullPointerException("Null dataSyncMode");
        }
        this.a = fdwu0;
    }
}

