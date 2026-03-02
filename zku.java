import j..util.Objects;

final class zku extends okn {
    public zku(zkw zkw0) {
        Objects.requireNonNull(zkw0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "DELETE FROM `resource_info` WHERE `accountName` = ? AND `language` = ? AND `resourceKey` = ? AND `darkModeEnabled` = ? AND `callingAndroidApp` = ? AND `capabilitiesKey` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        owg0.h(1, ((zkx)object0).a);
        owg0.h(2, ((zkx)object0).b);
        byte[] arr_b = zhn.c(((zkx)object0).c);
        if(arr_b == null) {
            owg0.g(3);
        }
        else {
            owg0.e(3, arr_b);
        }
        owg0.f(4, ((long)((zkx)object0).d));
        owg0.h(5, ((zkx)object0).e);
        owg0.f(6, ((long)((zkx)object0).f));
    }
}

