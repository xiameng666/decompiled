import android.accounts.Account;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;

public final class bgks {
    public final acsq a;
    private static final bboh b;
    private final Account c;
    private final ibrt d;

    static {
        bgks.b = bboh.b("AccountCapabilityReader", bbcu.cX);
    }

    public bgks(acsq acsq0, Account account0, ibrt ibrt0) {
        ibuq.f(acsq0, "googleAuthUtilWrapper");
        super();
        this.a = acsq0;
        this.c = account0;
        this.d = ibrt0;
    }

    public static Object a(bgks bgks0, ibrl ibrl0) {
        Integer integer0;
        bgkq bgkq0;
        if((ibrl0 instanceof bgkq)) {
            bgkq0 = (bgkq)ibrl0;
            int v = bgkq0.c;
            if((v & 0x80000000) == 0) {
                bgkq0 = new bgkq(bgks0, ibrl0);
            }
            else {
                bgkq0.c = v - 0x80000000;
            }
        }
        else {
            bgkq0 = new bgkq(bgks0, ibrl0);
        }
        Object object0 = bgkq0.a;
        Object object1 = ibrx.a;
        switch(bgkq0.c) {
            case 0: {
                ibnx.b(object0);
                HasCapabilitiesRequest hasCapabilitiesRequest0 = new HasCapabilitiesRequest(bgks0.c, new String[]{gqkf.a.a});
                try {
                    bgkr bgkr0 = new bgkr(bgks0, hasCapabilitiesRequest0, null);
                    bgkq0.c = 1;
                    object0 = icbd.a(bgks0.d, bgkr0, bgkq0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        ibnx.b(object0);
                    }
                    integer0 = (Integer)object0;
                    goto label_29;
                }
                catch(IOException iOException0) {
                    break;
                }
                catch(acse acse0) {
                    a.ae(bgks.b.j(), "Fetching capability failed.", acse0);
                    return Boolean.valueOf(false);
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bgks.b.j(), "Fetching capability failed.", iOException0);
        return Boolean.valueOf(false);
    label_29:
        if(integer0 != null && ((int)integer0) == 1) {
            return Boolean.valueOf(true);
        }
        if(integer0 == null || ((int)integer0) != 2) {
            ggtj ggtj0 = (ggtj)bgks.b.j();
            ibuq.c(integer0);
            ggtj0.z("Reading capability returned unexpected code: %d.", integer0.intValue());
        }
        return Boolean.valueOf(false);
    }
}

