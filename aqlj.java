import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class aqlj {
    private final aqwe a;
    private final aqys b;
    private final Context c;

    public aqlj(aqwe aqwe0, aqys aqys0, Context context0) {
        this.a = aqwe0;
        this.b = aqys0;
        this.c = context0;
    }

    public final void a(Account account0, String s, Map map0) {
        try {
            long v = (long)(((Long)bbmq.c.i()));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqfe.a).v_newBuilder();
            String s1 = aqxr.d(this.c, account0, "android");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe0 = (aqfe)hftp0.b_message;
            aqfe0.b |= 16;
            aqfe0.f = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe1 = (aqfe)hftp0.b_message;
            aqfe1.b |= 1;
            aqfe1.c = v;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe2 = (aqfe)hftp0.b_message;
            aqfe2.b |= 2;
            aqfe2.d = v;
            aqfb[] arr_aqfb = new aqfb[((ggnf)map0).d];
            int v1 = 0;
            for(Object object0: ((ggeo)map0).w()) {
                arax arax0 = (arax)map0.get(((String)object0));
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqfb.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqfb aqfb0 = (aqfb)hftp1.b_message;
                ((String)object0).getClass();
                aqfb0.b |= 1;
                aqfb0.c = (String)object0;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aqei.a).v_newBuilder();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hkzm.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hkzm)hftp3.b_message).c = 2;
                ((hkzm)hftp3.b_message).b |= 1;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                aqei aqei0 = (aqei)hftp2.b_message;
                hkzm hkzm0 = (hkzm)hftp3.N_build();
                hkzm0.getClass();
                aqei0.d = hkzm0;
                aqei0.b |= 2;
                ByteString hfsf0 = arax0.getDefaultInstanceForType();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                aqei aqei1 = (aqei)hftp2.b_message;
                aqei1.b |= 1;
                aqei1.c = hfsf0;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aqfb aqfb1 = (aqfb)hftp1.b_message;
                aqei aqei2 = (aqei)hftp2.N_build();
                aqei2.getClass();
                aqfb1.d = aqei2;
                aqfb1.b |= 2;
                arr_aqfb[v1] = (aqfb)hftp1.N_build();
                ++v1;
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)aqfc.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            aqfc aqfc0 = (aqfc)hftp4.b_message;
            aqfc0.b |= 1;
            aqfc0.c = s;
            List list0 = Arrays.asList(arr_aqfb);
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            aqfc aqfc1 = (aqfc)hftp4.b_message;
            hfuo hfuo0 = aqfc1.d;
            if(!hfuo0.c()) {
                aqfc1.d = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, aqfc1.d);
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            aqfc aqfc2 = (aqfc)hftp4.b_message;
            aqfc2.b |= 2;
            aqfc2.e = true;
            aqfc aqfc3 = (aqfc)hftp4.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe3 = (aqfe)hftp0.b_message;
            aqfc3.getClass();
            aqfe3.p = aqfc3;
            aqfe3.b |= 0x20000;
            this.a.c(account0, hftp0);
        }
        catch(aqxy aqxy0) {
            this.b.s(2, gifo.j, 4, aqxy0.a);
            throw aqxy0;
        }
        catch(IOException iOException0) {
            this.b.r(9, gifo.j, 4);
            throw new aqyc(iOException0);
        }
        catch(aqxu | acse exception0) {
            this.b.r(7, gifo.j, 4);
            throw new aqyc(exception0);
        }
    }
}

