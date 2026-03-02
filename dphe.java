public final class dphe implements bboe {
    public final String a;
    public final dpdw b;

    public dphe(String s, dpdw dpdw0) {
        this.a = s;
        this.b = dpdw0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        Object object1 = (dpdv)object0;
        dpdy dpdy0 = (dpdy)((ProtoLiteBuilder)this.b).N_build();
        ((dpdv)object1).k(this.a, dpdy0);
        return object1;
    }
}

