import j..util.Objects;

final class bueq extends okn {
    public bueq(buer buer0) {
        Objects.requireNonNull(buer0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "UPDATE OR REPLACE `storage_card_eligibility` SET `id` = ?,`accountName` = ?,`subscriptionStatus` = ?,`storageConsumption` = ?,`timesShown` = ?,`firstImpressionInstant` = ?,`lastImpressionInstant` = ?,`wasDismissed` = ? WHERE `accountName` = ? AND `subscriptionStatus` = ? AND `storageConsumption` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        owg0.e(1, oqz.b(((buew)object0).a));
        String s = ((buew)object0).b;
        owg0.h(2, s);
        budu budu0 = ((buew)object0).c;
        owg0.h(3, buer.h(budu0));
        buds buds0 = ((buew)object0).d;
        owg0.h(4, buer.f(buds0));
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
        owg0.h(9, s);
        owg0.h(10, buer.h(budu0));
        owg0.h(11, buer.f(buds0));
    }
}

