public final class brwd implements Runnable {
    @Override
    public final void run() {
        Object object0 = ggbz.a;
        Object object1 = ggna.a;
        if(hrmn.g() && !hrmn.i() && brwc.a().i()) {
            object0 = brwc.a().d();
        }
        else {
            ((ggtj)brwg.a.j()).x("DataCollectionRegistryFullEntries is missing");
        }
        if(hrmn.f() && brwh.a().i()) {
            object1 = brwh.a().d();
        }
        else {
            ((ggtj)brwg.a.j()).x("DataCollectionRpcMethodNameCollectionDefinition is missing");
        }
        if(babh.a() == null) {
            ((ggtj)brwg.a.i()).x("GmsApplicationContext is missing, failed to initialize GMS Core Data Collection Registry.");
        }
        else {
            if(hrmn.i()) {
                brwa.b(new brwe(), ((gged_interceptors)object1));
            }
            else {
                brwa.a(((ggft)object0), ((gged_interceptors)object1));
            }
            if(!hrmn.h()) {
                clat.b(((gful_cronetEngineProvider)new brwf()));
            }
        }
        if(hrmn.g()) {
            brwc.b();
        }
        if(hrmn.f()) {
            brwh.b();
        }
    }
}

