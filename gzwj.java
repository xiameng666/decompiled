public enum gzwj implements hfub {
    AC_UNKNOWN(0),
    AC_GET_REPORTING_STATE_SAFE(1),
    AC_TRY_OPT_IN(2),
    AC_TRY_OPT_IN_REQUEST(3),
    AC_REQUEST_UPLOAD(4),
    AC_CANCEL_UPLOAD(5),
    AC_REPORT_PLACE(6),
    AC_SEND_DATA(7),
    @Deprecated
    AC_INCOGNITO_MODE_TOGGLE_ON(8),
    @Deprecated
    AC_INCOGNITO_MODE_TOGGLE_OFF(9),
    AC_PRIVATE_MODE_TOGGLE_ON(10),
    AC_PRIVATE_MODE_TOGGLE_OFF(11);

    public final int m;

    private gzwj(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.m;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

