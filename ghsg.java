public enum ghsg implements hfub {
    UNKNOWN_FRP_UNLOCK_OPERATION_RESULT(0),
    SUCCESS(1),
    NOT_ACTIVE(2),
    NO_PROFILE_BLOCKS(3),
    GRPC_ERROR(4),
    WRONG_ACCOUNT(5),
    WRONG_SECRETS(6),
    INTERRUPTED(7),
    GET_ACCOUNTS_ERROR(8),
    GET_TOKEN_ERROR(9),
    DEVELOPER_ERROR(10);

    public final int l;

    private ghsg(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

