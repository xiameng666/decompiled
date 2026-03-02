import j..time.LocalDate;

final class cagx implements ibtw {
    final cahe a;

    public cagx(cahe cahe0) {
        this.a = cahe0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        goz goz0 = (goz)object0;
        if((((Number)object1).intValue() & 3) == 2 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        cagz.f(0x7F1515EF, null, null, goz0, 0, 6);  // string:intrusiondetection_retrieval_description "If you suspect a security issue, 
                                                     // you or a trusted expert you ask for help can check to see what happened and who 
                                                     // might be responsible."
        cagz.f(0x7F1515F0, null, null, goz0, 0, 6);  // string:intrusiondetection_retrieval_download_instructions "To download logs, make 
                                                     // sure you\'re signed in to the Google Account you used to set up device protection. 
                                                     // You\'ll be asked to enter the screen lock for the device whose logs you want to 
                                                     // access."
        goz0.M(5004770);
        cahe cahe0 = this.a;
        boolean z = goz0.Z(cahe0);
        Object object2 = goz0.k();
        if(z || object2 == gop.a) {
            object2 = new cagv(cahe0);
            goz0.R(object2);
        }
        goz0.A();
        cagz.f(0x7F1515EC, null, ((ibth)object2), goz0, 0, 2);  // string:intrusiondetection_readonly_pref_4_desc "Learn about Intrusion Logging"
        cagz.c(cahe0.f, goz0, 0);
        cafp.a(cahe0.c, goz0, 0);
        for(Object object3: cahe0.d) {
            cage cage0 = (cage)object3;
            String s = cage0.b;
            LocalDate localDate0 = cage0.c;
            long v = cage0.a;
            goz0.M(-1633490746);
            int v1 = goz0.Z(cahe0) | goz0.Z(cage0);
            Object object4 = goz0.k();
            if(v1 != 0 || object4 == gop.a) {
                object4 = new cagw(cahe0, cage0, null);
                goz0.R(object4);
            }
            goz0.A();
            cagz.g(null, ((ibts)object4), s, localDate0, cahe0, v, goz0, 0);
            goz0 = goz0;
        }
        return ibom.a;
    }
}

