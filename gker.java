public enum gker implements hfub {
    CONSUME_CHUNK_RESULT_UNKNOWN(0),
    CONSUME_CHUNK_RESULT_SUCCESS(1),
    CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED(3),
    CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD(4),
    CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE(5);

    public final int f;

    private gker(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

