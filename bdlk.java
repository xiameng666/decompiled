public final class bdlk implements ibth {
    public final bdmb a;

    public bdlk(bdmb bdmb0) {
        this.a = bdmb0;
    }

    @Override  // ibth
    public final Object a() {
        acp acp0 = this.a.c;
        if(acp0 == null) {
            ibuq.j("openFileForImportActivityResultLauncher");
            acp0 = null;
        }
        acp0.b(new String[]{"text/csv", "text/comma-separated-values"});
        return ibom.a;
    }
}

