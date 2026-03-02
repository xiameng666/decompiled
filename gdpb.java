final class gdpb extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        frbi.g();
        Object object0 = new gdqn();
        synchronized(gdpc.c) {
            gdpc.c.put(Thread.currentThread(), object0);
        }
        return object0;
    }
}

