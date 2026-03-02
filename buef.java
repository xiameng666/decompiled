import j..time.Instant;

public final class buef implements ibts {
    public final Instant a;
    public final String b;
    public final buds c;

    public buef(Instant instant0, String s, buds buds0) {
        this.a = instant0;
        this.b = s;
        this.c = buds0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("UPDATE OR REPLACE storage_card_eligibility SET wasDismissed=1, lastImpressionInstant=? WHERE accountName = ? AND storageConsumption < ?")) {
            String s = this.b;
            buds buds0 = this.c;
            Long long0 = buex.a(this.a);
            if(long0 == null) {
                owg0.g(1);
            }
            else {
                owg0.f(1, long0.longValue());
            }
            owg0.h(2, s);
            owg0.h(3, buer.f(buds0));
            owg0.k();
        }
        return ibom.a;
    }
}

