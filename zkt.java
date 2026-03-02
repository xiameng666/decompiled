import j..util.Objects;

final class zkt extends oko {
    public zkt(zkw zkw0) {
        Objects.requireNonNull(zkw0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `resource_info` (`accountName`,`language`,`resourceKey`,`darkModeEnabled`,`callingAndroidApp`,`capabilitiesKey`,`resource`,`lastUpdatedMs`) VALUES (?,?,?,?,?,?,?,?)";
    }

    @Override  // oko
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
        zho zho0 = ((zkx)object0).g;
        if(zho0 != null) {
            byte[] arr_b1 = zhn.d(zho0.a);
            if(arr_b1 == null) {
                owg0.g(7);
            }
            else {
                owg0.e(7, arr_b1);
            }
            owg0.f(8, zho0.b);
            return;
        }
        owg0.g(7);
        owg0.g(8);
    }
}

