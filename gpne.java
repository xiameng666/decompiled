public final class gpne {
    public byte a;
    private boolean b;

    public final gpnf a() {
        if(this.a != 7) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.a & 1) == 0) {
                stringBuilder0.append(" enableCelLogsiteMetadata");
            }
            if((this.a & 2) == 0) {
                stringBuilder0.append(" enableSafeFormatArgs");
            }
            if((this.a & 4) == 0) {
                stringBuilder0.append(" includeSuppressedExceptions");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new gpnf(this.b);
    }

    public final void b(boolean z) {
        this.b = z;
        this.a = (byte)(this.a | 2);
    }
}

