final class rua implements icih {
    final ryh a;
    final icih b;

    public rua(ryh ryh0, icih icih0) {
        this.a = ryh0;
        this.b = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        sct.c("DefaultCrossProcessTaskManager", "observeTaskMetadata#onChange [" + this.a + "] metadataStore=" + ((rnv)object0));
        Object object1 = this.b.a(((rnv)object0), ibrl0);
        return object1 == ibrx.a ? object1 : ibom.a;
    }
}

