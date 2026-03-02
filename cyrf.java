public final class cyrf implements gfsi {
    public final cyrp a;

    public cyrf(cyrp cyrp0) {
        this.a = cyrp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = Boolean.valueOf(((cyjs)object0).b.size() > 0);
        this.a.d.set(object1);
        return object1;
    }
}

