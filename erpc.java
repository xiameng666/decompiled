import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

public final class erpc {
    public static final int a;
    private static final erqc b;

    static {
        erpc.b = new erqc(new String[]{"AccountTransferUtils"});
    }

    public static boolean a(BootstrapOptions bootstrapOptions0) {
        erpc.b.j("3pmfm supported by target device %s", new Object[]{Boolean.valueOf(bootstrapOptions0.n)});
        erpc.b.j("3pmfm allowed by target client %s", new Object[]{Boolean.valueOf(bootstrapOptions0.o)});
        Object[] arr_object = {Boolean.valueOf(hyim.g())};
        erpc.b.j("3pmfm export allowed by smartsetup %s", arr_object);
        Object[] arr_object1 = {Boolean.valueOf(hyim.i())};
        erpc.b.j("3pmfm forced %s", arr_object1);
        if(bootstrapOptions0.n) {
            return hyim.i() ? true : bootstrapOptions0.o && hyim.g();
        }
        return false;
    }
}

