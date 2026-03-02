import j..util.Objects;

final class zkv extends okn {
    public zkv(zkw zkw0) {
        Objects.requireNonNull(zkw0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "UPDATE OR ABORT `resource_info` SET `accountName` = ?,`language` = ?,`resourceKey` = ?,`darkModeEnabled` = ?,`callingAndroidApp` = ?,`capabilitiesKey` = ?,`resource` = ?,`lastUpdatedMs` = ? WHERE `accountName` = ? AND `language` = ? AND `resourceKey` = ? AND `darkModeEnabled` = ? AND `callingAndroidApp` = ? AND `capabilitiesKey` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        String s = ((zkx)object0).a;
        owg0.h(1, s);
        String s1 = ((zkx)object0).b;
        owg0.h(2, s1);
        grxw grxw0 = ((zkx)object0).c;
        byte[] arr_b = zhn.c(grxw0);
        if(arr_b == null) {
            owg0.g(3);
        }
        else {
            owg0.e(3, arr_b);
        }
        long v = (long)((zkx)object0).d;
        owg0.f(4, v);
        String s2 = ((zkx)object0).e;
        owg0.h(5, s2);
        long v1 = (long)((zkx)object0).f;
        owg0.f(6, v1);
        zho zho0 = ((zkx)object0).g;
        if(zho0 == null) {
            owg0.g(7);
            owg0.g(8);
        }
        else {
            byte[] arr_b1 = zhn.d(zho0.a);
            if(arr_b1 == null) {
                owg0.g(7);
            }
            else {
                owg0.e(7, arr_b1);
            }
            owg0.f(8, zho0.b);
        }
        owg0.h(9, s);
        owg0.h(10, s1);
        byte[] arr_b2 = zhn.c(grxw0);
        if(arr_b2 == null) {
            owg0.g(11);
        }
        else {
            owg0.e(11, arr_b2);
        }
        owg0.f(12, v);
        owg0.h(13, s2);
        owg0.f(14, v1);
    }
}

