import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.HasCapabilitiesRequest;
import java.io.IOException;

public final class ersf {
    public final ibnf a;
    private final ibrt b;

    public ersf(ibnf ibnf0, ibrt ibrt0) {
        ibuq.f(ibnf0, "googleAuthUtilWrapper");
        super();
        this.a = ibnf0;
        this.b = ibrt0;
    }

    public final Object a(String s, String s1, ibrl ibrl0) {
        ersa ersa0;
        if((ibrl0 instanceof ersa)) {
            ersa0 = (ersa)ibrl0;
            int v = ersa0.c;
            if((v & 0x80000000) == 0) {
                ersa0 = new ersa(this, ibrl0);
            }
            else {
                ersa0.c = v - 0x80000000;
            }
        }
        else {
            ersa0 = new ersa(this, ibrl0);
        }
        Object object0 = ersa0.a;
        Object object1 = ibrx.a;
        switch(ersa0.c) {
            case 0: {
                ibnx.b(object0);
                if(ibzk.D(s)) {
                    return ibnx.a(new IllegalArgumentException("Account Name cannot be null or blank"));
                }
                if(hykh.a.b().i()) {
                    try {
                        ersa0.d = s1;
                        ersa0.c = 1;
                        object0 = this.c(s, s1, ersa0);
                        if(object0 != object1) {
                            goto label_29;
                        }
                        return object1;
                    }
                    catch(IOException iOException0) {
                        return ibnx.a(new eruz(iOException0));
                    }
                    catch(IllegalStateException illegalStateException0) {
                        return ibnx.a(new eruy(illegalStateException0));
                    }
                    catch(InterruptedException interruptedException0) {
                        return ibnx.a(new eruy(interruptedException0));
                    }
                    catch(acsr acsr0) {
                        return ibnx.a(new eruz(acsr0));
                    }
                    catch(UserRecoverableAuthException userRecoverableAuthException0) {
                        return ibnx.a(new eruz(userRecoverableAuthException0));
                    }
                    catch(acse acse0) {
                        return ibnx.a(new eruy(acse0));
                    }
                    goto label_29;
                }
                try {
                    ersa0.d = s1;
                    ersa0.c = 2;
                    object0 = this.c(s, s1, ersa0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_48;
                }
                catch(IOException iOException1) {
                    break;
                }
                catch(acse acse1) {
                    return ibnx.a(new eruy(acse1));
                }
                catch(IllegalStateException illegalStateException1) {
                    return ibnx.a(new eruy(illegalStateException1));
                }
                catch(InterruptedException interruptedException1) {
                    return ibnx.a(new eruy(interruptedException1));
                }
            }
            case 1: {
                try {
                    s1 = ersa0.d;
                    ibnx.b(object0);
                label_29:
                    int v1 = ((Number)object0).intValue();
                    switch(v1) {
                        case 1: {
                            return Boolean.valueOf(true);
                        }
                        case 2: {
                            return Boolean.valueOf(false);
                        }
                        default: {
                            return ibnx.a(ersf.e(v1, s1));
                        }
                    }
                }
                catch(IOException iOException0) {
                    return ibnx.a(new eruz(iOException0));
                }
                catch(IllegalStateException illegalStateException0) {
                    return ibnx.a(new eruy(illegalStateException0));
                }
                catch(InterruptedException interruptedException0) {
                    return ibnx.a(new eruy(interruptedException0));
                }
                catch(acsr acsr0) {
                    return ibnx.a(new eruz(acsr0));
                }
                catch(UserRecoverableAuthException userRecoverableAuthException0) {
                    return ibnx.a(new eruz(userRecoverableAuthException0));
                }
                catch(acse acse0) {
                    return ibnx.a(new eruy(acse0));
                }
            }
            case 2: {
                try {
                    s1 = ersa0.d;
                    ibnx.b(object0);
                label_48:
                    int v2 = ((Number)object0).intValue();
                    switch(v2) {
                        case 1: {
                            return Boolean.valueOf(true);
                        }
                        case 2: {
                            return Boolean.valueOf(false);
                        }
                    }
                    return ibnx.a(ersf.e(v2, s1));
                }
                catch(IOException iOException1) {
                    break;
                }
                catch(acse acse1) {
                    return ibnx.a(new eruy(acse1));
                }
                catch(IllegalStateException illegalStateException1) {
                    return ibnx.a(new eruy(illegalStateException1));
                }
                catch(InterruptedException interruptedException1) {
                    return ibnx.a(new eruy(interruptedException1));
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibnx.a(new eruz(iOException1));
    }

    public final Object b(String s, String s1, ibrl ibrl0) {
        ersb ersb0;
        if((ibrl0 instanceof ersb)) {
            ersb0 = (ersb)ibrl0;
            int v = ersb0.c;
            if((v & 0x80000000) == 0) {
                ersb0 = new ersb(this, ibrl0);
            }
            else {
                ersb0.c = v - 0x80000000;
            }
        }
        else {
            ersb0 = new ersb(this, ibrl0);
        }
        Object object0 = ersb0.a;
        Object object1 = ibrx.a;
        switch(ersb0.c) {
            case 0: {
                ibnx.b(object0);
                ersb0.d = s1;
                ersb0.c = 1;
                object0 = this.d(s, ersb0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s1 = ersb0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        actw actw0 = new actw();
        actw0.b(((GoogleAccount)object0));
        actw0.c(gged_interceptors.l(s1));
        return actw0.a();
    }

    public final Object c(String s, String s1, ibrl ibrl0) {
        ersc ersc0;
        if((ibrl0 instanceof ersc)) {
            ersc0 = (ersc)ibrl0;
            int v = ersc0.c;
            if((v & 0x80000000) == 0) {
                ersc0 = new ersc(this, ibrl0);
            }
            else {
                ersc0.c = v - 0x80000000;
            }
        }
        else {
            ersc0 = new ersc(this, ibrl0);
        }
        Object object0 = ersc0.a;
        Object object1 = ibrx.a;
        switch(ersc0.c) {
            case 0: {
                ibnx.b(object0);
                ersc0.c = 1;
                object0 = this.b(s, s1, ersc0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                evql evql0 = ersp.a().e(((HasCapabilitiesRequest)object0));
                ersc0.c = 2;
                object0 = ictn.b(evql0, ersc0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public final Object d(String s, ibrl ibrl0) {
        String s1;
        ersd ersd0;
        if((ibrl0 instanceof ersd)) {
            ersd0 = (ersd)ibrl0;
            int v = ersd0.c;
            if((v & 0x80000000) == 0) {
                ersd0 = new ersd(this, ibrl0);
            }
            else {
                ersd0.c = v - 0x80000000;
            }
        }
        else {
            ersd0 = new ersd(this, ibrl0);
        }
        Object object0 = ersd0.a;
        Object object1 = ibrx.a;
        switch(ersd0.c) {
            case 0: {
                ibnx.b(object0);
                erse erse0 = new erse(this, s, null);
                ersd0.d = s;
                ersd0.c = 1;
                object0 = icbd.a(this.b, erse0, ersd0);
                if(object0 != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                s = ersd0.d;
                ibnx.b(object0);
            label_22:
                ibuq.e(object0, "withContext(...)");
                ersd0.d = s;
                ersd0.c = 2;
                object0 = ictn.b(((evql)object0), ersd0);
                if(object0 != object1) {
                    s1 = s;
                    break;
                }
                return object1;
            }
            case 2: {
                s1 = ersd0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        actt actt0 = new actt();
        actt0.b("com.google");
        actt0.d(((String)object0));
        actt0.c(s1);
        return actt0.a();
    }

    private static final eruy e(int v, String s) {
        String s1 = a.a(s, "Capability Check for ", " failed with result: ");
        switch(v) {
            case -1: {
                return new eruy(new IllegalStateException(s1 + "Request Failed"));
            }
            case 4: {
                return new eruy(new IllegalStateException(s1 + "Not permitted"));
            }
            case 5: {
                return new eruy(new IllegalStateException(s1 + "Unknown Capability"));
            }
            case 6: {
                return new eruy(new IllegalStateException(s1 + "Failed to sync"));
            }
            default: {
                return new eruy(new IllegalStateException(s1 + "Unknown Error"));
            }
        }
    }
}

