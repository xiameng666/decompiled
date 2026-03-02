import android.os.RemoteException;
import java.io.IOException;

public final class bgkw {
    private static final bboh a;
    private final foeg b;

    static {
        bgkw.a = bboh.b("PWMAccountInfoProvider", bbcu.cX);
    }

    public bgkw(foeg foeg0) {
        this.b = foeg0;
    }

    public static Object a(bgkw bgkw0, String s, ibrl ibrl0) {
        bgkv bgkv0;
        if((ibrl0 instanceof bgkv)) {
            bgkv0 = (bgkv)ibrl0;
            int v = bgkv0.c;
            if((v & 0x80000000) == 0) {
                bgkv0 = new bgkv(bgkw0, ibrl0);
            }
            else {
                bgkv0.c = v - 0x80000000;
            }
        }
        else {
            bgkv0 = new bgkv(bgkw0, ibrl0);
        }
        Object object0 = bgkv0.a;
        Object object1 = ibrx.a;
        switch(bgkv0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gmcd gmcd0 = bgkw0.b.b(s);
                    ibuq.e(gmcd0, "loadOwner(...)");
                    bgkv0.d = s;
                    bgkv0.c = 1;
                    object0 = icpu.c(gmcd0, bgkv0);
                    if(object0 == object1) {
                        return object1;
                    label_21:
                        s = bgkv0.d;
                        ibnx.b(object0);
                    }
                    if(((foec)object0) != null) {
                        String s1 = ((foec)object0).c;
                        String s2 = ((foec)object0).h;
                        if(s2 == null) {
                            s2 = ((foec)object0).i;
                        }
                        return new bgku(s, s1, s2);
                    }
                    return null;
                }
                catch(azqj azqj0) {
                    break;
                }
                catch(azqi azqi0) {
                    a.ae(bgkw.a.j(), "Couldn\'t fetch current account information.", azqi0);
                    return null;
                }
                catch(foee foee0) {
                    a.ae(bgkw.a.j(), "Couldn\'t fetch current account information.", foee0);
                    return null;
                }
                catch(RemoteException remoteException0) {
                    a.ae(bgkw.a.j(), "Couldn\'t fetch current account information.", remoteException0);
                    return null;
                }
                catch(aztb aztb0) {
                    a.ae(bgkw.a.j(), "Couldn\'t fetch current account information.", aztb0);
                    return null;
                }
                catch(IOException iOException0) {
                    a.ae(bgkw.a.j(), "Couldn\'t fetch current account information.", iOException0);
                    return null;
                }
            }
            case 1: {
                goto label_21;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bgkw.a.j(), "Couldn\'t fetch current account information.", azqj0);
        return null;
    }
}

