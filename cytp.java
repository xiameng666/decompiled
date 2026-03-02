import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

public final class cytp implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final MessageEventParcelable b;

    public cytp(WearableDataListenerChimeraService wearableDataListenerChimeraService0, MessageEventParcelable messageEventParcelable0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = messageEventParcelable0;
    }

    @Override
    public final void run() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        if(wearableDataListenerChimeraService0.l.equals(cyfr.c)) {
            boolean z = false;
            cust cust0 = cyjh.a;
            ((ggtj)cust0.d().ar(0x1FFB)).x("WDLS: receive message to update media status for wearable node");
            byte[] arr_b = this.b.c;
            if(arr_b != null && arr_b.length > 0) {
                if(arr_b[0] != 0) {
                    z = true;
                }
                ((ggtj)cust0.d().ar(0x2035)).B("WDLS: syncMediaStatus music is active = %b", Boolean.valueOf(z));
                cyxs cyxs0 = wearableDataListenerChimeraService0.h();
                if(cyxs0 == null) {
                    ((ggtj)cust0.g().ar(0x2036)).x("WDLS syncMediaStatus: local node is null");
                }
                else {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cyxs0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)cyxs0));
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cyxr.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    cyxr cyxr0 = (cyxr)hftp1.b_message;
                    cyxr0.b |= 1;
                    cyxr0.c = z;
                    long v = System.currentTimeMillis();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    cyxr cyxr1 = (cyxr)hftp1.b_message;
                    cyxr1.b |= 2;
                    cyxr1.d = v;
                    cyxr cyxr2 = (cyxr)hftp1.N_build();
                    if(!((cyxp)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((cyxp)hftp0))).ensureMutable();
                    }
                    cyxs cyxs1 = (cyxs)((cyxp)hftp0).b_message;
                    cyxr2.getClass();
                    cyxs1.p = cyxr2;
                    cyxs1.c |= 0x400;
                    cyxs cyxs2 = (cyxs)((ProtoLiteBuilder)(((cyxp)hftp0))).N_build();
                    wearableDataListenerChimeraService0.x(true, cyxs2);
                    wearableDataListenerChimeraService0.c = cyxs2;
                    wearableDataListenerChimeraService0.s(wearableDataListenerChimeraService0.a);
                }
            }
            else {
                ((ggtj)cust0.d().ar(0x2034)).x("WDLS: syncMediaStatus message event without data to parse");
            }
            wearableDataListenerChimeraService0.w(true);
        }
    }
}

