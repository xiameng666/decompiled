import android.accounts.Account;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class ajrc {
    public final Account a;
    public ianj_grpcChannel b;
    private static final baun c;

    static {
        ajrc.c = akea.a("GrpcClient");
    }

    public ajrc(Account account0) {
        this.a = account0;
    }

    public static ianj_grpcChannel a() {
        return ianl.l(hput.a.c().z(), ((int)hput.a.c().p())).a();
    }

    public final Object b(ajra ajra0, ajrb ajrb0) {
        Object object1;
        Object object0 = ajra0.a();
        bbfj.b(0x4800);
        int v = 1;
        try {
            int v2 = 1;
            while(v2 <= 3) {
                try {
                    object1 = ajrb0.a(object0);
                }
                catch(iapn iapn0) {
                    iaph iaph0 = iapn0.a.t;
                    ajrc.c.n("Grpc call failed with status: %s (%s)", iapn0, new Object[]{iaph0, iapn0.a.u});
                    if(v2 != 3) {
                        int v3 = iaph0.ordinal();
                        if(v3 != 12 && v3 != 14) {
                            switch(v3) {
                                case 4: {
                                    if(hput.b() <= 0L) {
                                        this.d();
                                        ++v2;
                                        continue;
                                    }
                                    break;
                                }
                                case 3: 
                                case 5: 
                                case 6: 
                                case 7: 
                                case 8: 
                                case 9: {
                                    break;
                                }
                                default: {
                                    this.d();
                                    ++v2;
                                    continue;
                                }
                            }
                        }
                    }
                    if(hput.f() && iaph0 == iaph.q && (iapn0.getCause() instanceof acse)) {
                        throw new ajqz("Failed to make network request", iapn0, 7, ((iapn0.getCause() instanceof UserRecoverableAuthException) ? -16 : -17));
                    }
                    String s = a.ab(ajrb0, "Failed to call ");
                    int v4 = iaph0.ordinal();
                    if(v4 != 1 && v4 != 14) {
                        switch(v4) {
                            case 5: {
                                v = 9;
                                break;
                            }
                            case 6: {
                                v = 10;
                                break;
                            }
                            case 9: {
                                v = 8;
                                break;
                            }
                            case 4: 
                            case 8: 
                            case 10: {
                                break;
                            }
                            default: {
                                v = 2;
                            }
                        }
                    }
                    throw new ajqz(s, iapn0, v, iaph0.r);
                }
                return object1;
            }
        }
        finally {
            bbfj.a();
        }
        throw new ajqz("Grpc call error", 11);
    }

    public final List c(String s) {
        int v;
        try {
            String s1 = new adgg(AppContextProvider.a()).b(AppContextProvider.a(), this.a, s);
            List list0 = new ArrayList();
            list0.add(new iaqk(AppContextProvider.a(), s1, true));
            String s2 = ajrc.e("com.google.android.gms");
            if(s2 != null) {
                list0.add(new iaqd(s2));
            }
            iaof_metadata iaof0 = new iaof_metadata();
            iaof0.i(new iant("X-Goog-Api-Key", iaof_metadata.c), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
            iaof0.i(new iant("X-Android-Package", iaof_metadata.c), "com.google.android.gms");
            iaof0.i(new iant("X-Android-Cert", iaof_metadata.c), bbmq.l(AppContextProvider.a(), "com.google.android.gms"));
            list0.add(new ibjz(iaof0));
            return list0;
        }
        catch(IOException | acse exception0) {
            if((exception0 instanceof UserRecoverableAuthException)) {
                v = -16;
            }
            else if((exception0 instanceof acse)) {
                v = -17;
            }
            else {
                v = -18;
            }
            throw new ajqz("Failed to create stub", exception0, 7, v);
        }
    }

    public final void d() {
        ianj_grpcChannel ianj0 = this.b;
        if(ianj0 != null) {
            ianj0.d();
            this.b = null;
        }
    }

    public static final String e(String s) {
        try {
            return new aiga(AppContextProvider.a()).b(s);
        }
        catch(IOException | acse exception0) {
            ajrc.c.i("Exception while trying to retrieve appCert.", exception0, new Object[0]);
            return null;
        }
    }
}

