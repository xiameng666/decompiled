import j..util.Objects;

final class eyad extends oko {
    public eyad(eyaf eyaf0) {
        Objects.requireNonNull(eyaf0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR ABORT INTO `EnrolledDevice` (`id`,`name`,`publicKey`,`bluetoothAddress`,`unenrolledByAssociated`,`attestationTimestamp`,`notificationEvents`,`unenrolledByAssociatedReason`,`enrollmentTimestamp`,`unenrolledByPrimary`,`rangingMethodStateMap`,`consentedToDowngradeRangingMethod`,`rangingMethodDefaultStateMap`,`notificationEventTimestamps`,`pdRangingMethodStateMap`,`rangingOffsetConfigIdMap`,`consentedToDowngradeTempRestrictedRangingMethodPersistently`,`nodeId`,`address`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        owg0.f(1, ((exzk)object0).a);
        owg0.h(2, ((exzk)object0).b);
        owg0.e(3, ((exzk)object0).c);
        owg0.h(4, ((exzk)object0).e);
        owg0.f(5, ((long)((exzk)object0).f));
        owg0.f(6, ((exzk)object0).g);
        owg0.h(7, exsy.a(((exzk)object0).h));
        int v = ((exzk)object0).r;
        if(v == 0) {
            owg0.g(8);
        }
        else {
            owg0.h(8, eyaf.r(v));
        }
        owg0.f(9, ((exzk)object0).i);
        owg0.f(10, ((long)((exzk)object0).j));
        owg0.h(11, exsy.d(((exzk)object0).k));
        owg0.f(12, ((long)((exzk)object0).l));
        owg0.h(13, exsy.c(((exzk)object0).m));
        owg0.h(14, exsy.b(((exzk)object0).n));
        owg0.h(15, exsy.d(((exzk)object0).o));
        owg0.h(16, exsy.e(((exzk)object0).p));
        owg0.f(17, ((long)((exzk)object0).q));
        exhm exhm0 = ((exzk)object0).d;
        exhn exhn0 = exhm0.a;
        if(exhn0 == null) {
            owg0.g(18);
        }
        else {
            owg0.h(18, exhn0.a);
        }
        exhl exhl0 = exhm0.b;
        if(exhl0 != null) {
            owg0.h(19, exhl0.a);
            return;
        }
        owg0.g(19);
    }
}

