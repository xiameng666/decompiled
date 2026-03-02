import android.content.Context;
import com.google.android.gms.chimera.modules.setupservices.AppContextProvider;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

public final class epfj implements evpo {
    public final epfl a;

    public epfj(epfl epfl0) {
        this.a = epfl0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            epfl.a.o("Failed checking usage reporting status", new Object[0]);
        }
        azui azui0 = (azui)evql0.j();
        batl.s(azui0);
        UsageReportingOptInOptions usageReportingOptInOptions0 = ((fajf)azui0.a).a;
        batl.s(usageReportingOptInOptions0);
        if(usageReportingOptInOptions0.b) {
            epfl epfl0 = this.a;
            baun baun0 = epfl.a;
            if(baun0.b(3)) {
                baun0.d("Sending Clearcut event:\n%s", new Object[]{new String(((ghon)epfl0.e.N_build()).toBytesArray())});
            }
            epfm epfm0 = epfl0.d;
            ghon ghon0 = (ghon)epfl0.e.N_build();
            if(hyda.d()) {
                epfm0.b.c(((ProtoLiteMessage)ghon0)).a();
                return null;
            }
            zay zay0 = new zay();
            AppContextProvider appContextProvider0 = AppContextProvider.c;
            Context context0 = appContextProvider0 == null ? babh.a() : appContextProvider0.a;
            ayvm ayvm0 = fhbe.b(context0, zay0);
            epfm0.a.j(((MessageLite)ghon0), ayvm0).d();
            return null;
        }
        epfl.a.d("Opted out of usage reporting: %s", new Object[]{azui0});
        return null;
    }
}

