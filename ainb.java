public final class ainb implements gfsi {
    public final aioc a;

    public ainb(aioc aioc0) {
        this.a = aioc0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = gfsx.m(((ajah)object0));
        aioc aioc0 = this.a;
        aioc0.a = gfsx0;
        wvj wvj0 = aioc0.b;
        if(wvj0 != null) {
            return new aiod(aioc0.a, wvj0);
        }
        throw new IllegalStateException("Missing required properties: accessEvaluationPerSnapshotDetails");
    }
}

