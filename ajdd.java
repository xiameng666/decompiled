public final class ajdd implements evqk {
    public final ajde a;
    public final int b;

    public ajdd(ajde ajde0, int v) {
        this.a = ajde0;
        this.b = v;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        Void void0 = (Void)object0;
        ajde.a.d("bulkRegister was successful, trying registerSync", new Object[0]);
        return this.a.b.cE("com.google.android.gms.auth_account", this.b, new String[]{"ANDROID_AUTH"}, null, "").e(new ajdc(this.a));
    }
}

