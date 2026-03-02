public final class amkk implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((gged_interceptors)object0).size();
        boolean z = false;
        int v1 = 0;
        while(v1 < v) {
            heqn heqn0 = (heqn)((gged_interceptors)object0).get(v1);
            ++v1;
            if(heqn0.c.equalsIgnoreCase("credentials_enable_service")) {
                String s = heqn0.d;
                if(!"false".equalsIgnoreCase(s)) {
                    "true".equalsIgnoreCase(s);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return Boolean.valueOf(true);
    }
}

