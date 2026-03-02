public abstract class gfsh {
    protected abstract int a(Object arg1);

    protected abstract boolean b(Object arg1, Object arg2);

    public final int c(Object object0) {
        return object0 == null ? 0 : this.a(object0);
    }

    public final boolean d(Object object0, Object object1) {
        if(object0 == object1) {
            return true;
        }
        return object0 == null || object1 == null ? false : this.b(object0, object1);
    }
}

