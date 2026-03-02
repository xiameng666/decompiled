public final class dxgf implements ibth {
    public final dxhl a;

    public dxgf(dxhl dxhl0) {
        this.a = dxhl0;
    }

    @Override  // ibth
    public final Object a() {
        Object object0 = this.a.d;
        if(object0 != null) {
            return object0;
        }
        ibuq.j("viewModelFactory");
        return null;
    }
}

