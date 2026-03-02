public final class dmaa implements dmba {
    public final dybr a;

    public dmaa(String s, String s1) {
        this.a = new dybr(s, s1);
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        Object object0 = icpu.e(iccl.b(cclw.d), new dlzz(hjwe0, this, null)).get();
        ibuq.e(object0, "get(...)");
        return ((Boolean)object0).booleanValue();
    }
}

