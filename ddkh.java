public final class ddkh implements evpo {
    public final ddki a;

    public ddkh(ddki ddki0) {
        this.a = ddki0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Object object0 = (Boolean)evql0.j();
        if(((Boolean)object0).booleanValue()) {
            cutr.e(this.a.a, "com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED");
        }
        return object0;
    }
}

