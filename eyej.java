import java.util.List;

public final class eyej {
    public static final bboh a;

    static {
        eyej.a = bboh.b("ActiveUnlock", bbcu.fr);
    }

    public static final eyei a(exln exln0) {
        switch(exln0.ordinal()) {
            case 1: {
                return new eyeg("active_unlock_on_wake");
            }
            case 2: {
                return new eyeg("active_unlock_on_unlock_intent");
            }
            case 3: {
                return new eyeg("active_unlock_on_biometric_fail");
            }
            default: {
                return null;
            }
        }
    }

    public static final eyei b(exln exln0, List list0) {
        switch(exln0.ordinal()) {
            case 4: {
                return new eyeh("active_unlock_on_face_errors", exln.d, list0);
            }
            case 5: {
                return new eyeh("active_unlock_on_face_acquire_info", exln.d, list0);
            }
            case 6: {
                return new eyeh("active_unlock_on_unlock_intent_when_biometric_enrolled", exln.d, list0);
            }
            case 7: {
                return new eyeh("active_unlock_wakeups_considered_unlock_intents", exln.c, list0);
            }
            default: {
                return null;
            }
        }
    }
}

