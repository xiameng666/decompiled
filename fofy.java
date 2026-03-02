import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException.ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException.DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader.MdiException;
import java.util.concurrent.ExecutionException;

final class fofy {
    public final fodv a;
    public final fkvs b;
    private final gfsx c;
    private final String d;

    public fofy(Context context0, fkvs fkvs0, fodv fodv0, gfsx gfsx0) {
        this.b = fkvs0;
        this.a = fodv0;
        this.c = gfsx0;
        this.d = "com.google.android.gms";
    }

    final gmcd a(gfsi gfsi0) {
        return gdtf.k(this.a.a(), new fofx(this, gfsi0), gmap.a);
    }

    public final void b(foea foea0, gmcd gmcd0) {
        gftb.q(gmcd0.isDone());
        String s = "OK";
        try {
            gssv gssv0 = (gssv)gmbs.b(gmcd0, MdiOwnersLoader.MdiException.class);
            if(gssv0 == null) {
                s = "Absent";
                foea0.d(false);
            }
            else if(gssv0.b.size() > 0) {
                gdmq gdmq0 = ((gstw)gssv0.b.get(0)).d;
                if(gdmq0 == null) {
                    gdmq0 = gdmq.a;
                }
                if(gdmq0.e.size() > 0) {
                    gdnf gdnf0 = (gdnf)gdmq0.e.get(0);
                    foea0.d = gdnf0.c;
                    foea0.c(new hfuh(gdnf0.d, gdnf.a).contains(gdmv.j));
                    foea0.h = new hfuh(gdnf0.d, gdnf.a).contains(gdmv.h) ? 2 : 3;
                    foea0.e((new hfuh(gdnf0.d, gdnf.a).contains(gdmv.e) ? 2 : 3));
                }
                if(gdmq0.f.size() > 0) {
                    gdmg gdmg0 = (gdmg)gdmq0.f.get(0);
                    int v1 = gdmg0.b;
                    String s1 = null;
                    foea0.a = (v1 & 2) == 0 ? null : gdmg0.d;
                    foea0.b = (v1 & 0x40) == 0 ? null : gdmg0.f;
                    if((v1 & 0x80) != 0) {
                        s1 = gdmg0.g;
                    }
                    foea0.c = s1;
                }
                gdmz gdmz0 = fkzi.a(gssv0);
                if(gdmz0 != null) {
                    if(gdmz0.e) {
                        foea0.f = gdmz0.d;
                    }
                    else {
                        foea0.e = gdmz0.d;
                    }
                }
                if(gdmq0.k.size() == 1) {
                    int v2 = gdlc.a(((gdld)gdmq0.k.get(0)).b);
                    if(v2 == 0) {
                        foea0.g = 1;
                    }
                    else {
                        switch(v2) {
                            case 1: {
                                foea0.g = 1;
                                break;
                            }
                            case 2: {
                                foea0.g = 2;
                                break;
                            }
                            default: {
                                foea0.g = v2 == 4 ? 3 : 4;
                            }
                        }
                    }
                }
            }
            else {
                Log.w("OneGoogle", "GetPeopleResponse contains no persons");
                s = "NoPerson";
            }
            return;
        }
        catch(MdiOwnersLoader.MdiException | gmdd exception0) {
        }
        finally {
            ((fobz)((gftm)this.c).a).b(s, this.d);
        }
        Throwable throwable0 = exception0.getCause();
        s = fnwn.a(throwable0);
        aztb aztb0 = (aztb)fnwn.b(throwable0, aztb.class);
        if(aztb0 != null) {
            int v3 = aztb0.b();
            s = "ApiException-" + v3;
            switch(v3) {
                case 10: {
                    throw new ExecutionException(new MdiNotAvailableException.DeveloperErrorException(throwable0));
                }
                case 17: {
                    throw new ExecutionException(new MdiNotAvailableException.ApiNotConnectedException(throwable0));
                }
            }
        }
        Log.w("OneGoogle", String.format("Failed to load profile data. exception: %s", s));
    }
}

