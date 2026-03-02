public final class fwyr {
    public final int a;
    public final int b;
    public final long c;
    private final float d;

    public fwyr(int v, int v1, float f, long v2) {
        this.a = v;
        this.b = v1;
        this.d = f;
        this.c = v2;
    }

    @Override
    public final String toString() {
        return "HardwareAudioFusionModelResponse{confidence=" + this.d + ", elapsedRealTimeMillis=" + this.c + ", fusionActivity=" + this.a + ", fusionResultType=" + this.b + "}";
    }
}

