import j..util.Objects;

final class ddkq extends oko {
    public ddkq(ddks ddks0) {
        Objects.requireNonNull(ddks0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR IGNORE INTO `AnalyticsTransferMetadata` (`id`,`first_successful_transfer_date`,`previous_successful_transfer_date`,`transfer_count`) VALUES (nullif(?, 0),?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        ddkk ddkk0 = (ddkk)object0;
        owg0.f(1, ((long)ddkk0.a));
        owg0.f(2, ((long)ddkk0.b));
        owg0.f(3, ((long)ddkk0.c));
        owg0.f(4, ((long)ddkk0.d));
    }
}

