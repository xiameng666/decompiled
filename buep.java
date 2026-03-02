import j..util.Objects;

final class buep extends oko {
    public buep(buer buer0) {
        Objects.requireNonNull(buer0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR IGNORE INTO `storage_card_eligibility` (`id`,`accountName`,`subscriptionStatus`,`storageConsumption`,`timesShown`,`firstImpressionInstant`,`lastImpressionInstant`,`wasDismissed`) VALUES (?,?,?,?,?,?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        owg0.e(1, oqz.b(((buew)object0).a));
        owg0.h(2, ((buew)object0).b);
        owg0.h(3, buer.h(((buew)object0).c));
        owg0.h(4, buer.f(((buew)object0).d));
        owg0.f(5, ((long)((buew)object0).e));
        Long long0 = buex.a(((buew)object0).f);
        if(long0 == null) {
            owg0.g(6);
        }
        else {
            owg0.f(6, long0.longValue());
        }
        Long long1 = buex.a(((buew)object0).g);
        if(long1 == null) {
            owg0.g(7);
        }
        else {
            owg0.f(7, long1.longValue());
        }
        owg0.f(8, ((long)((buew)object0).h));
    }
}

