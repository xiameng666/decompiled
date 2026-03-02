import j..util.Objects;

final class eikr extends oko {
    public eikr(eikt eikt0) {
        Objects.requireNonNull(eikt0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `DeviceData` (`macAddress`,`deviceType`,`optionalDeviceData`,`creationTimestampMillis`,`lastUpdatedTimestampMillis`,`alertLifecycleId`,`alertStatus`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        eiki eiki0 = (eiki)object0;
        owg0.h(1, eiki0.a);
        owg0.f(2, ((long)eiki0.b));
        owg0.e(3, eiki0.c.toBytesArray());
        owg0.f(4, eiki0.d);
        owg0.f(5, eiki0.e);
        owg0.f(6, ((long)eiki0.f));
        owg0.h(7, eikt.d(eiki0.g));
    }
}

