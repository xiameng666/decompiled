import com.google.android.gms.common.api.Status;
import j..util.Optional;

final class ebwm {
    static int a(Status status0) {
        switch(status0.i) {
            case 4: {
                return 4;
            }
            case 5: {
                return 5;
            }
            case 6: {
                return 6;
            }
            case 7: {
                return 7;
            }
            case 8: {
                return 8;
            }
            case 10: {
                return 9;
            }
            case 13: {
                return 10;
            }
            case 14: {
                return 11;
            }
            case 15: {
                return 12;
            }
            case 16: {
                return 13;
            }
            case 17: {
                return 14;
            }
            case 18: {
                return 15;
            }
            case 19: {
                return 16;
            }
            case 20: {
                return 17;
            }
            case 21: {
                return 18;
            }
            case 22: {
                return 19;
            }
            case 15012: {
                return 3;
            }
            default: {
                return 20;
            }
        }
    }

    static void b(dmgi dmgi0, int v, int v1, Optional optional0) {
        Optional optional1 = optional0.isPresent() ? ((fsim)optional0.get()).a.n() : Optional.empty();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hall.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hall hall0 = (hall)hftp0.b_message;
        hall0.b = halk.a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hall)hftv0).c = 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hall)hftp0.b_message).d = v1 - 2;
        if(optional1.isPresent()) {
            dynd dynd0 = (dynd)optional1.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hall hall1 = (hall)hftp0.b_message;
            hall1.e = dynd0.a();
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hall hall2 = (hall)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp1.b_message;
        hall2.getClass();
        hapr0.bC = hall2;
        hapr0.g |= 2;
        dmgi0.b(((hapr)hftp1.N_build()));
    }

    static void c(dmgi dmgi0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hall.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hall hall0 = (hall)hftp0.b_message;
        hall0.b = halk.a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hall)hftp0.b_message).c = 1;
        hall hall1 = (hall)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp1.b_message;
        hall1.getClass();
        hapr0.bC = hall1;
        hapr0.g |= 2;
        dmgi0.b(((hapr)hftp1.N_build()));
    }
}

