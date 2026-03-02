public enum ffeo {
    ON_CHANNEL_OPENED("onChannelOpened"),
    ON_CHANNEL_CLOSED("onChannelClosed"),
    ON_CHANNEL_INPUT_CLOSED("onChannelInputClosed"),
    ON_CHANNEL_OUTPUT_CLOSED("onChannelOutputClosed");

    public final String e;

    static {
        ggfp.M(ffeo.a.e, ffeo.b.e, ffeo.c.e, ffeo.d.e);
    }

    private ffeo(String s1) {
        this.e = s1;
    }

    @Override
    public final String toString() {
        return this.e;
    }
}

