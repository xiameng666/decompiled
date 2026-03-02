import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

public final class ggvf extends gguv {
    private static final boolean a;
    private static final boolean b;
    private static final gguu c;

    static {
        ggvf.a = ggve.a();
        ggvf.b = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        ggvf.c = new ggvd();
    }

    @Override  // gguv
    protected ggtx e(String s) {
        AtomicReference atomicReference0 = ggvk.d;
        if(atomicReference0.get() != null) {
            return ((ggva)atomicReference0.get()).a(s);
        }
        int v = s.length();
        do {
            --v;
            if(v < 0) {
                break;
            }
            int v1 = s.charAt(v);
            if(v1 == 36) {
                s = s.replace('$', '.');
                break;
            }
        }
        while(v1 != 46);
        ggtx ggtx0 = new ggvk(s);
        ggvi.a.offer(ggtx0);
        if(atomicReference0.get() == null) {
            return ggtx0;
        }
        ggvk.e();
        return ggtx0;
    }

    @Override  // gguv
    protected gguu h() {
        return ggvf.c;
    }

    @Override  // gguv
    protected ggvy j() {
        return ggvl.a;
    }

    @Override  // gguv
    protected String m() {
        return "platform: Android";
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // String Decryptor: 1 succeeded, 0 failed
    static boolean r() {
        return ggvf.b;
    }

    // String Decryptor: 1 succeeded, 0 failed
    static boolean s() {
        return ggvf.a;
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            String s = ggvf.q();
            return ggve.class.getName().equals(s);
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

