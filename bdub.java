import j..util.Objects;

final class bdub extends oko {
    public bdub(bduc bduc0) {
        Objects.requireNonNull(bduc0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `device_settings_table` (`settingName`,`value`) VALUES (?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        owg0.h(1, ((bdud)object0).a);
        byte[] arr_b = ((bdud)object0).b;
        if(arr_b == null) {
            owg0.g(2);
            return;
        }
        owg0.e(2, arr_b);
    }
}

