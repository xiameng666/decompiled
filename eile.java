import j..util.Objects;

final class eile extends oko {
    public eile(eilf eilf0) {
        Objects.requireNonNull(eilf0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `Scan` (`macAddress`,`creationTimestampMillis`,`lastUpdatedTimestampMillis`,`state`,`bleScan`,`locationScan`) VALUES (?,?,?,?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        String s;
        owg0.h(1, ((eikw)object0).a);
        owg0.f(2, ((eikw)object0).b);
        owg0.f(3, ((eikw)object0).c);
        switch(((eikw)object0).f - 1) {
            case 0: {
                s = "UNKNOWN";
                break;
            }
            case 1: {
                s = "STATE_STILL";
                break;
            }
            case 2: {
                s = "STATE_MOVING";
                break;
            }
            default: {
                s = "STATE_OFF";
            }
        }
        owg0.h(4, s);
        owg0.e(5, ((eikw)object0).d.toBytesArray());
        owg0.e(6, ((eikw)object0).e.toBytesArray());
    }
}

