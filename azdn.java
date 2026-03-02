import android.content.Context;
import jeb.synthetic.TWR;

public final class azdn {
    static ayvj a;

    static {
    }

    public static azdl a(Context context0, azgg azgg0) {
        azdl azdl0;
        gdqb gdqb1;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/metalogger/MetaLoggerFactory", "createMetaLogger", 0x1F, "MetaLoggerFactory#createMetaLogger");
        try {
            hraq hraq0 = hraq.a;
            if(!hraq0.b().c()) {
                if(hraq0.b().e()) {
                    if(azdn.a == null) {
                        azdn.a = new azdg(context0);
                    }
                    if(azdn.a.b()) {
                        gdqb1 = gdsp.e("com/google/android/gms/clearcut/metalogger/MetaLoggerFactory", "useFakeLogger", 74, "hasLogsOtherThanMetalogCounters");
                        goto label_11;
                    }
                }
                else {
                    azdn.a = null;
                    gdqb1 = gdsp.e("com/google/android/gms/clearcut/metalogger/MetaLoggerFactory", "useFakeLogger", 74, "hasLogsOtherThanMetalogCounters");
                    try {
                    label_11:
                        ggqk ggqk0 = azgg0.b().E();
                        while(true) {
                            if(!ggqk0.hasNext()) {
                                goto label_25;
                            }
                            Object object0 = ggqk0.next();
                            if(((azge)object0).A()) {
                                break;
                            }
                        }
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(gdqb1, throwable1);
                        throw throwable1;
                    }
                    gdqb1.close();
                    aytt aytt0 = new aytt(context0, "METALOG_COUNTERS");
                    if(hraq.c()) {
                        aytt0.g = new azdm();
                    }
                    azdl0 = new azdj(context0, new ayvf(aytt0.a(), "METALOG_COUNTERS", ((int)hraq.a.b().a())));
                    goto label_31;
                label_25:
                    gdqb1.close();
                }
            }
            azdl0 = new azdk();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(gdqb0, throwable0);
            throw throwable0;
        }
    label_31:
        gdqb0.close();
        return azdl0;
    }
}

