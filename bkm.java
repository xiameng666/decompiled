public interface bkm extends blr {
    public static final bjr F;
    public static final bjr l;
    public static final bjr m;

    static {
        bkm.l = new bjr("camerax.core.imageInput.inputFormat", Integer.TYPE, null);
        bkm.m = new bjr("camerax.core.imageInput.secondaryInputFormat", Integer.TYPE, null);
        bkm.F = new bjr("camerax.core.imageInput.inputDynamicRange", bat.class, null);
    }

    int a();

    bat e();
}

