public final class dlzx implements dmba {
    private final dmcs a;

    public dlzx(dmcs dmcs0) {
        this.a = dmcs0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 65) {
            throw new IllegalArgumentException("Cannot evaluate filter that is not SanifairEligibleVoucherCountFilter.");
        }
        hwrt.d();
        if(hwrt.c()) {
            hjvb hjvb0 = hjwe0.b == 65 ? ((hjvb)hjwe0.c) : hjvb.a;
            ibuq.e(hjvb0, "getSanifairEligibleVoucherCountFilter(...)");
            Integer integer0 = this.a.a();
            if(integer0 == null) {
                return false;
            }
            if((hjvb0.b & 2) != 0 && ((int)integer0) > (hjvb0.d == null ? hftw.a : hjvb0.d).b) {
                return false;
            }
            return (hjvb0.b & 1) == 0 ? true : ((int)integer0) >= (hjvb0.c == null ? hftw.a : hjvb0.c).b;
        }
        return false;
    }
}

