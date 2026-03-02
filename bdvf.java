public final class bdvf implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("SELECT accountName FROM weak_check_result")) {
            ggdy ggdy0 = new ggdy();
            while(true) {
                if(!owg0.k()) {
                    break;
                }
                ggdy0.i(owg0.d(0));
            }
            return ggdy0.h();
        }
    }
}

