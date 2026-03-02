public final class czqi {
    private int a;
    private boolean b;
    private boolean c;
    private byte d;

    public final czqj a() {
        if(this.d != 7) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.d & 1) == 0) {
                stringBuilder0.append(" powerLevel");
            }
            if((this.d & 2) == 0) {
                stringBuilder0.append(" isConnectable");
            }
            if((this.d & 4) == 0) {
                stringBuilder0.append(" isPrivateGatt");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new czqj(this.a, this.b, this.c);
    }

    public final void b(boolean z) {
        this.b = z;
        this.d = (byte)(this.d | 2);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte)(this.d | 4);
    }

    public final void d(int v) {
        this.a = v;
        this.d = (byte)(this.d | 1);
    }
}

