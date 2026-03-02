public enum heyv implements hfub {
    UNKNOWN(0),
    NULL_PLACE_INFERENCE(1),
    PLACES_DID_CHANGE(2),
    NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD(3),
    SCREEN_IS_OFF(4),
    EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD(5),
    SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS(6);

    public final int h;

    private heyv(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

