import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsInjectTestAlertIntentOperation;

public final class bgvr implements Runnable {
    public final CrisisAlertsInjectTestAlertIntentOperation a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public bgvr(CrisisAlertsInjectTestAlertIntentOperation crisisAlertsInjectTestAlertIntentOperation0, String s, String s1, boolean z, boolean z1) {
        this.a = crisisAlertsInjectTestAlertIntentOperation0;
        this.b = s;
        this.c = s1;
        this.d = z;
        this.e = z1;
    }

    @Override
    public final void run() {
        int v;
        switch(this.b) {
            case "PA": {
                v = 0;
                break;
            }
            case "SOS": {
                v = 1;
                break;
            }
            default: {
                v = -1;
            }
        }
        CrisisAlertsInjectTestAlertIntentOperation crisisAlertsInjectTestAlertIntentOperation0 = this.a;
        String s = this.c;
        boolean z = this.d;
        boolean z1 = this.e;
        switch(v) {
            case 0: {
                bgtb bgtb0 = crisisAlertsInjectTestAlertIntentOperation0.a;
                hgto hgto0 = hgto.b;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgtr.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgtr.b(((hgtr)hftp0.b_message));
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgts.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hgts)hftv0).c = "Golden Gate Park";
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((hgts)hftv1).b = "Loose Gaze of Racoons";
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hgts)hftp1.b_message).d = "San Francisco Board of Supervisors";
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgtr hgtr0 = (hgtr)hftp0.b_message;
                hgts hgts0 = (hgts)hftp1.N_build();
                hgts0.getClass();
                hgtr0.d = hgts0;
                hgtr0.b |= 1;
                bgtb0.b(CrisisAlertsInjectTestAlertIntentOperation.b(hgto0, s, hftp0, z, z1));
                return;
            }
            case 1: {
                bgtb bgtb1 = crisisAlertsInjectTestAlertIntentOperation0.a;
                hgto hgto1 = hgto.c;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgtr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgtr.b(((hgtr)hftp2.b_message));
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgtt.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hgtt)hftp3.b_message).b = "Test Sos Alert";
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgtr hgtr1 = (hgtr)hftp2.b_message;
                hgtt hgtt0 = (hgtt)hftp3.N_build();
                hgtt0.getClass();
                hgtr1.e = hgtt0;
                hgtr1.b |= 2;
                bgtb1.b(CrisisAlertsInjectTestAlertIntentOperation.b(hgto1, s, hftp2, z, z1));
            }
        }
    }
}

