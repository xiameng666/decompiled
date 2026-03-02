import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

public final class dcap implements cumu {
    @Override  // cumu
    public final String a(Object object0) {
        String s = NearbySharingChimeraService.G(((dchs)object0).a);
        int v = ((dchs)object0).b;
        switch(v) {
            case 0: {
                return s + " | " + "GOOGLE";
            }
            case 1: {
                return s + " | " + "SAMSUNG";
            }
            default: {
                return s + " | " + ("UNKNOWN[" + v + "]");
            }
        }
    }
}

