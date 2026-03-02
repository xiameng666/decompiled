import android.content.Context;
import j..util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jeb.synthetic.TWR;

final class azhx implements Iterator {
    final azia a;
    private final String b;
    private final azgf c;
    private final Iterator d;

    public azhx(azia azia0, String s, azgf azgf0, Iterable iterable0) {
        Objects.requireNonNull(azia0);
        this.a = azia0;
        super();
        this.b = s;
        this.d = iterable0.iterator();
        this.c = azgf0;
    }

    @Override
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override
    public final Object next() {
        long v4;
        gdqb gdqb3;
        Throwable throwable3;
        hftr hftr1;
        azgf azgf1;
        gdqb gdqb2;
        ProtoLiteBuilder hftp0;
        hftr hftr0;
        hlsi hlsi0;
        gged_interceptors gged0;
        azfx azfx0;
        azgl azgl0;
        long v1;
        long v;
        Object object0;
        gdqb gdqb1;
        Iterator iterator0;
        azgf azgf0;
        String s;
        azia azia0;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/uploader/Uploader$BatchedLogRequestWrapperGenerator", "next", 0x46B, "BatchedLogRequestWrapperGenerator#next");
        try {
            if(this.hasNext()) {
                azia0 = this.a;
                s = this.b;
                azgf0 = this.c;
                iterator0 = this.d;
                gdqb1 = gdsp.e("com/google/android/gms/clearcut/uploader/Uploader", "nextBatchedLogRequestWrapper", 678, "Uploader#nextBatchedLogRequestWrapper");
                goto label_11;
            }
            goto label_224;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(gdqb0, throwable0);
            throw throwable0;
        }
        try {
        label_11:
            object0 = new azgp();
            v = (long)azie.b(((gful_cronetEngineProvider)new azhr()), "max_log_events_size_bytes", Long.valueOf(0x900000L));
            v1 = hrbk.a.b().a();
            while(true) {
            label_14:
                if(!iterator0.hasNext()) {
                    goto label_209;
                }
                Object object1 = iterator0.next();
                azgl0 = (azgl)object1;
                azfx0 = azgf0.f(v, azgl0);
                gged0 = azfx0.c;
                if(gged0.isEmpty()) {
                    goto label_22;
                }
                hlsi0 = azfx0.b;
                if(hlsi0 == null) {
                label_22:
                    iterator0 = iterator0;
                    gdqb0 = gdqb0;
                    s = s;
                    gdqb1 = gdqb1;
                    azgf0 = azgf0;
                    v = v;
                    continue;
                }
                hftr0 = (hftr)((ProtoLiteMessage)hlps.a).v_newBuilder();
                hftp0 = ((ProtoLiteMessage)hlpl.a).v_newBuilder();
                gdqb2 = gdqb0;
                if(!hftp0.b_message.isImmutable()) {
                    break;
                }
                goto label_34;
            }
        }
        catch(Throwable throwable1) {
            goto label_213;
        }
        try {
            hftp0.ensureMutable();
        }
        catch(Throwable throwable2) {
            goto label_53;
        }
        try {
        label_34:
            ((hlpl)hftp0.b_message).c = 4;
            ((hlpl)hftp0.b_message).b |= 1;
            if((hlsi0.b & 0x800) == 0) {
                azgf1 = azgf0;
                int v2 = bbms.a(azia0.b);
                Integer integer0 = v2;
                integer0.getClass();
                hlph hlph0 = bbmq.k(azia0.b, hlsi0.g, Integer.valueOf(hlsi0.d), (v2 == -1 ? null : integer0), bbmz.e(azia0.e), null);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hlph0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hlph0));
                hftr1 = (hftr)hftp1;
                goto label_56;
            }
        }
        catch(Throwable throwable1) {
            goto label_60;
        }
        try {
            hlph hlph1 = hlsi0.l == null ? hlph.a : hlsi0.l;
            azgf1 = azgf0;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hlph1).jf(5, null);
            hftp2.X(((ProtoLiteMessage)hlph1));
            hftr1 = (hftr)hftp2;
        }
        catch(Throwable throwable2) {
        label_53:
            throwable3 = throwable2;
            gdqb3 = gdqb1;
            goto label_216;
        }
        try {
        label_56:
            hlph hlph2 = (hlph)hftr1.b_message;
            gdqb3 = gdqb1;
        }
        catch(Throwable throwable1) {
        label_60:
            goto label_214;
        }
        try {
            if(hlph2.c == 0L && hlsi0.g) {
                long v3 = bbmq.d(azia0.b);
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                hlph hlph3 = (hlph)hftr1.b_message;
                v4 = v;
                hlph3.b |= 1;
                hlph3.c = v3;
            }
            else {
                v4 = v;
            }
            if(hlsi0.j) {
                if(!hftr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr1).ensureMutable();
                }
                hlph hlph4 = (hlph)hftr1.b_message;
                hlph4.b &= 0xFFFDFFFF;
                hlph4.t = hlph.a.t;
            }
            hlph hlph5 = (hlph)((ProtoLiteBuilder)hftr1).N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            hlph5.getClass();
            ((hlpl)hftv0).d = hlph5;
            ((hlpl)hftv0).b |= 8;
            long v5 = hlsi0.m;
            if(v5 != 0L) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlpl hlpl0 = (hlpl)hftp0.b_message;
                hlpl0.b |= 0x4000000;
                hlpl0.e = v5;
            }
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlps hlps0 = (hlps)hftr0.b_message;
            hlpl hlpl1 = (hlpl)hftp0.N_build();
            hlpl1.getClass();
            hlps0.e = hlpl1;
            hlps0.b |= 4;
            if((hlsi0.b & 8) != 0) {
                int v6 = hlsi0.e;
                if(v6 != -1) {
                    if(!hftr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr0).ensureMutable();
                    }
                    hlps hlps1 = (hlps)hftr0.b_message;
                    hlps1.b |= 8;
                    hlps1.f = v6;
                }
            }
            if(!hlsi0.i.isEmpty()) {
                String s1 = hlsi0.i;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlps hlps2 = (hlps)hftr0.b_message;
                s1.getClass();
                hlps2.b |= 16;
                hlps2.g = s1;
            }
            if((hlsi0.b & 0x80) != 0) {
                String s2 = hlsi0.h;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlps hlps3 = (hlps)hftr0.b_message;
                s2.getClass();
                hlps3.b |= 0x20;
                hlps3.h = s2;
            }
            for(Object object2: gged0) {
                hftr0.ds(((azfw)object2).b);
            }
            hlqe hlqe0 = hlqe.b(hlsi0.k);
            if(hlqe0 != null) {
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                ((hlps)hftr0.b_message).k = hlqe0.f;
                ((hlps)hftr0.b_message).b |= 0x80;
            }
            int v7 = azhi.e(s);
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((hlps)hftr0.b_message).l = v7 - 1;
            ((hlps)hftr0.b_message).b |= 0x100;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hlpn.a).v_newBuilder();
            Context context0 = azia0.b;
            boolean z = azib.e(context0);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hlpn hlpn0 = (hlpn)hftp3.b_message;
            hlpn0.b |= 1;
            hlpn0.c = z;
            boolean z1 = azib.d(context0);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            int v8 = 2;
            ((hlpn)hftv1).b |= 2;
            ((hlpn)hftv1).d = z1;
            boolean z2 = azia0.f;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            hlpn hlpn1 = (hlpn)hftp3.b_message;
            hlpn1.b |= 8;
            hlpn1.f = z2;
            int v9 = 1;
            if(azib.c(context0)) {
                v8 = 3;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hlpn)hftp3.b_message).e = v8 - 1;
            ((hlpn)hftp3.b_message).b |= 4;
            hlpn hlpn2 = (hlpn)hftp3.N_build();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlps hlps4 = (hlps)hftr0.b_message;
            hlpn2.getClass();
            hlps4.m = hlpn2;
            hlps4.b |= 0x200;
            if((hlsi0.b & 0x2000) != 0) {
                int v10 = hlsi0.n;
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlps hlps5 = (hlps)hftr0.b_message;
                hlps5.b |= 0x1000;
                hlps5.n = v10;
            }
            hlps hlps6 = (hlps)((ProtoLiteBuilder)hftr0).N_build();
            object0.b.add(hlps6);
            object0.a.add(azfx0);
            object0.c.add(azfx0);
            --v1;
            int v11 = gged0.size();
            long v13 = 0L;
            for(int v12 = 0; v12 < v11; ++v12) {
                v13 += (long)((azfw)gged0.get(v12)).b.size();
            }
            v = v4 - v13;
            int v14 = Long.compare(v, 0L);
            if(v14 <= 0 || v1 <= 0L) {
                azdl azdl0 = azia0.d;
                hlsi hlsi1 = azgl0.a;
                if(v14 <= 0) {
                    v9 = 0;
                }
                azdl0.f(hlsi1, v9);
            }
            else {
                iterator0 = iterator0;
                gdqb0 = gdqb2;
                s = s;
                gdqb1 = gdqb3;
                azgf0 = azgf1;
                goto label_14;
            }
            goto label_221;
        }
        catch(Throwable throwable1) {
            goto label_215;
        }
        try {
        label_209:
            gdqb2 = gdqb0;
            gdqb3 = gdqb1;
            goto label_221;
        }
        catch(Throwable throwable1) {
        label_213:
            gdqb2 = gdqb0;
        }
    label_214:
        gdqb3 = gdqb1;
    label_215:
        throwable3 = throwable1;
        try {
        label_216:
            gdqb3.close();
            throw throwable3;
        }
        catch(Throwable throwable4) {
            try {
                throwable3.addSuppressed(throwable4);
                throw throwable3;
            label_221:
                gdqb3.close();
            }
            catch(Throwable throwable0) {
                goto label_227;
            }
        }
        gdqb2.close();
        return object0;
        try {
        label_224:
            gdqb2 = gdqb0;
            throw new NoSuchElementException();
        }
        catch(Throwable throwable0) {
        label_227:
            TWR.safeClose$NT(gdqb2, throwable0);
            throw throwable0;
        }
    }
}

