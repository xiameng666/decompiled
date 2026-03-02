import android.content.Context;
import android.util.Log;

public final class aywj implements glzn {
    public final aywl a;

    public aywj(aywl aywl0) {
        this.a = aywl0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        aywl aywl0 = this.a;
        if(Long.compare(((hlso)object0).c, 0L) == 0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlso.a).v_newBuilder();
            long v = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlso hlso0 = (hlso)hftp0.b_message;
            hlso0.b |= 1;
            hlso0.c = v;
            hlso hlso1 = (hlso)hftp0.N_build();
            return azez.a(aywl0.a).b(hlso1);
        }
        if(System.currentTimeMillis() - ((hlso)object0).c >= hqzp.a.d().a()) {
            Log.w("CCTBackstopTask", "Backstop checks have failed.");
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlow.a).v_newBuilder();
            long v1 = ((hlso)object0).c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hlow)hftv0).b |= 1;
            ((hlow)hftv0).c = v1;
            long v2 = ((hlso)object0).d;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((hlow)hftv1).b |= 2;
            ((hlow)hftv1).d = v2;
            int v3 = ((hlso)object0).e;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlow hlow0 = (hlow)hftp1.b_message;
            hlow0.b |= 4;
            hlow0.e = v3;
            hlow hlow1 = (hlow)hftp1.N_build();
            Context context0 = aywl0.a;
            azfx azfx0 = azhd.a(context0, "CLEARCUT_BACKSTOP", ((MessageLite)hlow1), ayvn.c, false, "");
            hlsi hlsi0 = azfx0.b;
            batl.s(hlsi0);
            hftr hftr0 = (hftr)((ProtoLiteMessage)hlps.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlpl.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hlpl)hftp2.b_message).c = 4;
            ((hlpl)hftp2.b_message).b |= 1;
            hlph hlph0 = hlsi0.l == null ? hlph.a : hlsi0.l;
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hlph0).jf(5, null);
            hftp3.X(((ProtoLiteMessage)hlph0));
            if(((hlph)((hftr)hftp3).b_message).c == 0L && hlsi0.g) {
                long v4 = bbmq.d(context0);
                if(!((hftr)hftp3).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((hftr)hftp3))).ensureMutable();
                }
                hlph hlph1 = (hlph)((hftr)hftp3).b_message;
                hlph1.b |= 1;
                hlph1.c = v4;
            }
            long v5 = hlsi0.m;
            if(v5 != 0L) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hlpl hlpl0 = (hlpl)hftp2.b_message;
                hlpl0.b |= 0x4000000;
                hlpl0.e = v5;
            }
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hlpl hlpl1 = (hlpl)hftp2.b_message;
            hlph hlph2 = (hlph)((ProtoLiteBuilder)(((hftr)hftp3))).N_build();
            hlph2.getClass();
            hlpl1.d = hlph2;
            hlpl1.b |= 8;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlps hlps0 = (hlps)hftr0.b_message;
            hlpl hlpl2 = (hlpl)hftp2.N_build();
            hlpl2.getClass();
            hlps0.e = hlpl2;
            hlps0.b |= 4;
            if(!hlsi0.i.isEmpty()) {
                String s = hlsi0.i;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlps hlps1 = (hlps)hftr0.b_message;
                s.getClass();
                hlps1.b |= 16;
                hlps1.g = s;
            }
            if((hlsi0.b & 0x80) != 0 && !hlsi0.j) {
                String s1 = hlsi0.h;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlps hlps2 = (hlps)hftr0.b_message;
                s1.getClass();
                hlps2.b |= 0x20;
                hlps2.h = s1;
            }
            if((hlsi0.b & 0x2000) != 0) {
                int v6 = hlsi0.n;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlps hlps3 = (hlps)hftr0.b_message;
                hlps3.b |= 0x1000;
                hlps3.n = v6;
            }
            if((hlsi0.b & 0x400) != 0) {
                hlqe hlqe0 = hlqe.b(hlsi0.k);
                if(hlqe0 != null) {
                    if(!hftr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr0).ensureMutable();
                    }
                    ((hlps)hftr0.b_message).k = hlqe0.f;
                    ((hlps)hftr0.b_message).b |= 0x80;
                }
            }
            azhd.d(context0, bbmn.r(context0), hftr0);
            azhd.e(7, hftr0);
            azhd.c(azfx0.c, hftr0);
            hlps hlps4 = azhd.b(hftr0);
            azgp azgp0 = new azgp();
            azgp0.d(hlps4, azfx0);
            String s2 = (String)aywo.a.b();
            int v7 = aywl0.b.a(hlsi0, azgp0, null, s2, gfqx.a).b;
            if(v7 >= 300) {
                Log.e("CCTBackstopTask", String.format("Failed to send Backstop to Clearcut servers (status %d).", v7));
            }
            else if(v7 == 0xCF) {
                Log.e("CCTBackstopTask", String.format("Failed to send Backstop to Clearcut servers (status %d).", ((int)0xCF)));
            }
            aywl0.c.close();
            return gmbx.a;
        }
        return gmbx.a;
    }
}

