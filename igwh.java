final class igwh extends igwt {
    public igwh(igvt igvt0) {
        super(igvt0, "ScalingFactor", 2);
    }

    @Override  // igwt
    public final String toString() {
        return new String[]{"1x", "10x", "100x", "1000x"}[this.e];
    }
}

