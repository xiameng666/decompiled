public final class ajal {
    public int a;
    private int b;
    private byte c;

    public final ajam a() {
        if(this.c == 1) {
            int v = this.a;
            if(v != 0) {
                return new ajam(v, this.b);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == 0) {
            stringBuilder0.append(" resultType");
        }
        if(this.c == 0) {
            stringBuilder0.append(" packageCount");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.b = v;
        this.c = 1;
    }
}

