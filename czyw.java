import java.util.ArrayList;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription.Type;
import org.webrtc.SessionDescription;

public final class czyw {
    public static gyuk a(czyv czyv0, SessionDescription sessionDescription0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyuk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyuk)hftp0.b_message).f = 2;
        ((gyuk)hftp0.b_message).b |= 2;
        gyug gyug0 = czyw.h(czyv0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyuk gyuk0 = (gyuk)hftp0.b_message;
        gyug0.getClass();
        gyuk0.e = gyug0;
        gyuk0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyuc.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyui.a).v_newBuilder();
        String s = sessionDescription0.b;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyui gyui0 = (gyui)hftp2.b_message;
        s.getClass();
        gyui0.b |= 1;
        gyui0.c = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyuc gyuc0 = (gyuc)hftp1.b_message;
        gyui gyui1 = (gyui)hftp2.N_build();
        gyui1.getClass();
        gyuc0.c = gyui1;
        gyuc0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyuk gyuk1 = (gyuk)hftp0.b_message;
        gyuc gyuc1 = (gyuc)hftp1.N_build();
        gyuc1.getClass();
        gyuk1.d = gyuc1;
        gyuk1.c = 4;
        return (gyuk)hftp0.N_build();
    }

    public static gyuk b(czyv czyv0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyud.a).v_newBuilder();
            String s = ((IceCandidate)object0).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gyud)hftv0).b |= 1;
            ((gyud)hftv0).c = s;
            String s1 = ((IceCandidate)object0).a;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s1.getClass();
            ((gyud)hftv1).b |= 2;
            ((gyud)hftv1).d = s1;
            int v = ((IceCandidate)object0).b;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyud gyud0 = (gyud)hftp0.b_message;
            gyud0.b |= 4;
            gyud0.e = v;
            arrayList0.add(((gyud)hftp0.N_build()));
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyuk.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyuk)hftp1.b_message).f = 3;
        ((gyuk)hftp1.b_message).b |= 2;
        gyug gyug0 = czyw.h(czyv0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyuk gyuk0 = (gyuk)hftp1.b_message;
        gyug0.getClass();
        gyuk0.e = gyug0;
        gyuk0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyue.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyue gyue0 = (gyue)hftp2.b_message;
        hfuo hfuo0 = gyue0.b;
        if(!hfuo0.c()) {
            gyue0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, gyue0.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyuk gyuk1 = (gyuk)hftp1.b_message;
        gyue gyue1 = (gyue)hftp2.N_build();
        gyue1.getClass();
        gyuk1.d = gyue1;
        gyuk1.c = 5;
        return (gyuk)hftp1.N_build();
    }

    public static gyuk c(czyv czyv0, SessionDescription sessionDescription0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyuk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyuk)hftp0.b_message).f = 1;
        ((gyuk)hftp0.b_message).b |= 2;
        gyug gyug0 = czyw.h(czyv0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyuk gyuk0 = (gyuk)hftp0.b_message;
        gyug0.getClass();
        gyuk0.e = gyug0;
        gyuk0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyuf.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyui.a).v_newBuilder();
        String s = sessionDescription0.b;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyui gyui0 = (gyui)hftp2.b_message;
        s.getClass();
        gyui0.b |= 1;
        gyui0.c = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyuf gyuf0 = (gyuf)hftp1.b_message;
        gyui gyui1 = (gyui)hftp2.N_build();
        gyui1.getClass();
        gyuf0.c = gyui1;
        gyuf0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyuk gyuk1 = (gyuk)hftp0.b_message;
        gyuf gyuf1 = (gyuf)hftp1.N_build();
        gyuf1.getClass();
        gyuk1.d = gyuf1;
        gyuk1.c = 3;
        return (gyuk)hftp0.N_build();
    }

    public static gyuk d(czyv czyv0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyuk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyuk)hftp0.b_message).f = 4;
        ((gyuk)hftp0.b_message).b |= 2;
        gyug gyug0 = czyw.h(czyv0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyuk gyuk0 = (gyuk)hftp0.b_message;
        gyug0.getClass();
        gyuk0.e = gyug0;
        gyuk0.b |= 1;
        gyuh gyuh0 = gyuh.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyuk gyuk1 = (gyuk)hftp0.b_message;
        gyuh0.getClass();
        gyuk1.d = gyuh0;
        gyuk1.c = 6;
        return (gyuk)hftp0.N_build();
    }

    public static List e(gyuk gyuk0) {
        List list0 = new ArrayList();
        if(gyuk0.c == 5) {
            for(Object object0: ((gyue)gyuk0.d).b) {
                gyud gyud0 = (gyud)object0;
                Object object1 = null;
                if((gyud0.b & 1) != 0 && (gyud0.b & 2) != 0 && (gyud0.b & 4) != 0) {
                    object1 = new IceCandidate(gyud0.d, gyud0.e, gyud0.c);
                }
                if(object1 != null) {
                    list0.add(object1);
                }
            }
        }
        return list0;
    }

    public static SessionDescription f(gyuk gyuk0) {
        if(gyuk0.c == 4) {
            gyui gyui0 = ((gyuc)gyuk0.d).c;
            if(gyui0 == null) {
                gyui0 = gyui.a;
            }
            return (gyui0.b & 1) == 0 ? null : new SessionDescription(SessionDescription.Type.c, gyui0.c);
        }
        return null;
    }

    public static SessionDescription g(gyuk gyuk0) {
        if(gyuk0.c == 3) {
            gyui gyui0 = ((gyuf)gyuk0.d).c;
            if(gyui0 == null) {
                gyui0 = gyui.a;
            }
            return (gyui0.b & 1) == 0 ? null : new SessionDescription(SessionDescription.Type.a, gyui0.c);
        }
        return null;
    }

    private static gyug h(czyv czyv0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyug.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyug gyug0 = (gyug)hftp0.b_message;
        czyv0.a.getClass();
        gyug0.b |= 1;
        gyug0.c = czyv0.a;
        return (gyug)hftp0.N_build();
    }
}

