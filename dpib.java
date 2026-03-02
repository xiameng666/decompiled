public final class dpib implements bboe {
    public final String a;
    public final dpdy b;

    public dpib(String s, dpdy dpdy0) {
        this.a = s;
        this.b = dpdy0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        Object object1 = (dpdv)object0;
        ((dpdv)object1).k(this.a, this.b);
        return object1;
    }
}

