public final class dwgb extends dwgc {
    public static final dwgb a;

    static {
        dwgb.a = new dwgb();
    }

    @Override  // frxf
    public final void a(du du0) {
        eflw eflw0 = new eflw();
        eflw0.b = du0.getString(0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
        eflw0.d = du0.getString(0x7F1507EB);  // string:common_back "Back"
        eflw0.y = new dwga(du0);
        eflw0.a = 2;
        eflw0.a().I(du0.getParentFragmentManager(), "notice_screen_error_dialog_tag");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dwgb)) {
            return false;
        }
        dwgb dwgb0 = (dwgb)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return -434912005;
    }

    @Override
    public final String toString() {
        return "ShowErrorDialog";
    }
}

