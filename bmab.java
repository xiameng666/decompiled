public enum bmab {
    GET_RETRIES(1),
    GET_KEY_AGREEMENT(2),
    SET_PIN(3),
    CHANGE_PIN(4),
    GET_PIN_TOKEN(5),
    GET_PIN_UV_AUTH_TOKEN_USING_UV_WITH_PERMISSIONS(6),
    GET_UV_RETRIES(7),
    GET_PIN_UV_AUTH_TOKEN_USING_PIN_WITH_PERMISSIONS(9);

    public final int i;

    private bmab(int v1) {
        this.i = v1;
    }
}

