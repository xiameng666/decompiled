final class cakx implements gfsi {
    final Boolean a;
    final Boolean b;

    public cakx(Boolean boolean0, Boolean boolean1) {
        this.a = boolean0;
        this.b = boolean1;
        super();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = false;
        if(((Boolean)object0) == null) {
            return Boolean.valueOf(false);
        }
        if(this.a.booleanValue() && this.b.booleanValue() && ((Boolean)object0).booleanValue()) {
            z = true;
        }
        Object object1 = Boolean.valueOf(z);
        ((ggtj)caky.a.h()).B("Batch indexing status=%b", object1);
        return object1;
    }
}

