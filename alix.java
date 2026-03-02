public final class alix implements gfsi {
    public final String a;

    public alix(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = (String)((alus)object0).e.get(this.a);
        return object1 != null ? object1 : "";
    }
}

