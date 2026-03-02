public final class dwhg extends dwhh {
    public static final dwhg a;

    static {
        dwhg.a = new dwhg();
    }

    @Override  // frxf
    public final void a(du du0) {
        eflw eflw0 = new eflw();
        eflw0.b = du0.getString(0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
        eflw0.d = du0.getString(0x7F1507EB);  // string:common_back "Back"
        eflw0.y = new dwhf(du0);
        eflw0.a = 2;
        eflw0.a().I(du0.getParentFragmentManager(), "process_walletable_resource_intent_error_dialog");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dwhg)) {
            return false;
        }
        dwhg dwhg0 = (dwhg)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0x1F8CAE1C;
    }

    @Override
    public final String toString() {
        return "ShowErrorDialog";
    }
}

