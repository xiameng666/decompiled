public final class ajad {
    public ByteString a;
    public int b;
    private int c;
    private byte d;

    public final ajae a() {
        if(this.d == 1) {
            int v = this.b;
            if(v != 0) {
                return new ajae(this.a, v, this.c);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == 0) {
            stringBuilder0.append(" resultType");
        }
        if(this.d == 0) {
            stringBuilder0.append(" packageCount");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.c = v;
        this.d = 1;
    }
}

