public final class ikh implements Runnable {
    @Override
    public final void run() {
        bzd bzd0 = ili.W;
        synchronized(bzd0) {
            Object[] arr_object = bzd0.a;
            int v1 = bzd0.b;
            for(int v2 = 0; v2 < v1; ++v2) {
                ili ili0 = (ili)arr_object[v2];
                ili0.F(ili0.k);
            }
        }
    }
}

