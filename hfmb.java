import java.util.List;

public final class hfmb {
    public static gged_interceptors a(List list0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfnx.a).v_newBuilder();
            int v = 3;
            switch(((int)(((Integer)object0)))) {
                case 0x42FF337: 
                case 72702104: 
                case 73833047: 
                case 0x47F2B5A: 
                case 0x48D9F51: {
                    v = 2;
                    break;
                }
                case 68435380: 
                case 70701636: 
                case 72175901: 
                case 104729802: 
                case 105535705: 
                case 0x699AC6F: 
                case 126290990: {
                    break;
                }
                case 0x412DA9D: 
                case 0x41FD5E9: 
                case 0x42618B0: 
                case 0x4349E0E: 
                case 0x457E03B: 
                case 0x466508B: 
                case 0x48664E2: 
                case 0x4E04516: 
                case 0x4E5A734: 
                case 0x5356FB4: 
                case 0x5C551BB: 
                case 0x60D30D5: 
                case 104903338: 
                case 108180415: 
                case 108436427: 
                case 109303191: 
                case 0x6A5F13E: 
                case 0x6B5BC16: 
                case 0x6BBE17D: 
                case 0x6D8D0C8: 
                case 115095178: 
                case 0x6F0104D: 
                case 0x7042FCB: 
                case 0x74B64EA: 
                case 0x74B9C1E: 
                case 0x75475EF: 
                case 127255101: 
                case 127380830: 
                case 0x7A6DF1A: 
                case 0x7FE156D: {
                    v = 4;
                    break;
                }
                default: {
                    v = 5;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfnx)hftp0.b_message).c = v - 1;
            ((hfnx)hftp0.b_message).b |= 1;
            boolean z = hfls.a.contains(((Integer)object0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfnx hfnx0 = (hfnx)hftp0.b_message;
            hfnx0.b |= 2;
            hfnx0.d = z;
            ggdy0.i(((hfnx)hftp0.N_build()));
        }
        return ggdy0.h();
    }
}

