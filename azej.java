import android.content.Context;
import android.os.Build;

public final class azej implements gful_cronetEngineProvider {
    public final Context a;

    public azej(Context context0) {
        this.a = context0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        boolean z = fhcd.h(this.a);
        hftr hftr0 = bbmq.ag(this.a, z, null, Integer.valueOf(0xF1B18AD), null, null);
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlph hlph0 = (hlph)hftr0.b_message;
        hlph0.b &= 0xFFFFFDFF;
        hlph hlph1 = hlph.a;
        hlph0.k = hlph1.k;
        if((((hlph)hftr0.b_message).b & 1) != 0) {
            hftr hftr1 = (hftr)((ProtoLiteMessage)hlph1).v_newBuilder();
            long v = ((hlph)hftr0.b_message).c;
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            hlph hlph2 = (hlph)hftr1.b_message;
            hlph2.b |= 1;
            hlph2.c = v;
            ((hlph)((ProtoLiteBuilder)hftr1).N_build()).getDefaultInstanceForType();
        }
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlph hlph3 = (hlph)hftr0.b_message;
        int v1 = hlph3.b;
        hlph3.b = v1 & -2;
        hlph3.c = 0L;
        if((v1 & 0x400) != 0) {
            hftr hftr2 = (hftr)((ProtoLiteMessage)hlph1).v_newBuilder();
            String s = ((hlph)hftr0.b_message).l;
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            hlph hlph4 = (hlph)hftr2.b_message;
            s.getClass();
            hlph4.b |= 0x400;
            hlph4.l = s;
            ((hlph)((ProtoLiteBuilder)hftr2).N_build()).getDefaultInstanceForType();
        }
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlph hlph5 = (hlph)hftr0.b_message;
        hlph5.b &= 0xFFFFFBFF;
        hlph5.l = hlph1.l;
        hftr hftr3 = (hftr)((ProtoLiteMessage)hlph1).v_newBuilder();
        if(!hftr3.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr3).ensureMutable();
        }
        hlph hlph6 = (hlph)hftr3.b_message;
        String s1 = Build.FINGERPRINT;
        s1.getClass();
        hlph6.b |= 0x20000;
        hlph6.t = s1;
        ((hlph)((ProtoLiteBuilder)hftr3).N_build()).getDefaultInstanceForType();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlph hlph7 = (hlph)hftr0.b_message;
        hlph7.b &= 0xFFFDFFFF;
        hlph7.t = hlph1.t;
        ((hlph)((ProtoLiteBuilder)hftr0).N_build()).getDefaultInstanceForType();
        return new azel();
    }
}

