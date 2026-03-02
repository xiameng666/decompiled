public final class aivq {
    public String a;
    public int b;
    public int c;
    private long d;
    private byte e;

    public final aivr a() {
        if(this.e == 1) {
            int v = this.b;
            if(v != 0) {
                int v1 = this.c;
                if(v1 != 0) {
                    return new aivr(v, this.d, v1, this.a);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == 0) {
            stringBuilder0.append(" restoreMode");
        }
        if(this.e == 0) {
            stringBuilder0.append(" androidId");
        }
        if(this.c == 0) {
            stringBuilder0.append(" restoreTriggerType");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(long v) {
        this.d = v;
        this.e = 1;
    }
}

