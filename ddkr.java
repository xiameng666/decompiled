import j..util.Objects;

final class ddkr extends okn {
    public ddkr(ddks ddks0) {
        Objects.requireNonNull(ddks0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "UPDATE OR ABORT `AnalyticsTransferMetadata` SET `id` = ?,`first_successful_transfer_date` = ?,`previous_successful_transfer_date` = ?,`transfer_count` = ? WHERE `id` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        ddkk ddkk0 = (ddkk)object0;
        long v = (long)ddkk0.a;
        owg0.f(1, v);
        owg0.f(2, ((long)ddkk0.b));
        owg0.f(3, ((long)ddkk0.c));
        owg0.f(4, ((long)ddkk0.d));
        owg0.f(5, v);
    }
}

