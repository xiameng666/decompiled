import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.libraries.bluetooth.fastpair.fmd.FmdRequest;
import com.google.android.libraries.bluetooth.fastpair.fmd.FmdResponse;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public final class gxwa extends wby implements gxwb {
    private final cxxd a;

    public gxwa() {
        super("com.google.location.nearby.common.fastpair.fmd.IDeviceFmdService");
    }

    public gxwa(Context context0) {
        super("com.google.location.nearby.common.fastpair.fmd.IDeviceFmdService");
        this.a = (cxxd)cusq.c(context0, cxxd.class);
    }

    @Override  // gxwb
    public final FmdResponse a(FmdRequest fmdRequest0) {
        if(fmdRequest0 == null) {
            cwfa.a.d().x("FastPair: request is null");
            return null;
        }
        cwij cwij0 = (cwij)cusq.c(this.a.d, cwij.class);
        if(fmdRequest0.c().isEmpty()) {
            cwfa.a.g().x("FastPair: malformatted mac address");
            return FmdResponse.d().a();
        }
        int v = fmdRequest0.b().ordinal();
        if(v != 1) {
            switch(v) {
                case 2: {
                    Context context0 = cwij0.d;
                    String s = fmdRequest0.c();
                    int v1 = fmdRequest0.a();
                    cxke cxke0 = ((cwex)cusq.c(context0, cwex.class)).d(s);
                    if(cxke0 != null && (cxke0.c & 2) != 0 && !cxke0.e.isEmpty()) {
                        ByteString hfsf0 = cxke0.e;
                        Account[] arr_account = cchj.b(context0).p("com.google");
                        if(arr_account != null && arr_account.length != 0) {
                            HashMap hashMap0 = new HashMap();
                            HashMap hashMap1 = new HashMap();
                            if(hashMap0.containsKey(hfsf0) && ((int)(((Integer)hashMap0.get(hfsf0)))) >= v1) {
                                cwfa.a.d().x("FastPair: fmd tos was already accepted and result cached.");
                                fgsn fgsn0 = FmdResponse.d();
                                fgsn0.a = 4;
                                fgsn0.b(((Integer)hashMap0.get(hfsf0)).intValue());
                                return fgsn0.a();
                            }
                            if(!hashMap1.containsKey(hfsf0) && v1 == -1) {
                                cwfa.a.g().x("FastPair: no previous tos version");
                                fgsn fgsn1 = FmdResponse.d();
                                fgsn1.a = 1;
                                return fgsn1.a();
                            }
                            RequestFuture requestFuture0 = RequestFuture.newFuture();
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlug.a).v_newBuilder();
                            if(v1 == -1) {
                                Integer integer0 = (Integer)hashMap1.get(hfsf0);
                                gftb.check(integer0);
                                v1 = (int)integer0;
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hlug hlug0 = (hlug)hftp0.b_message;
                            hlug0.b |= 2;
                            hlug0.c = v1;
                            cwim.b(requestFuture0, requestFuture0, ((hlug)hftp0.N_build()), bbfw.b());
                            try {
                                hluj hluj0 = (hluj)requestFuture0.get();
                                hlui hlui0 = hlui.a;
                                if((hlui.b(hluj0.c) == null ? hlui.a : hlui.b(hluj0.c)).equals(hlui0) && hluj0.b >= ((int)hvpg.A())) {
                                    hashMap0.put(hfsf0, Integer.valueOf(hluj0.b));
                                    hashMap1.remove(hfsf0);
                                    cwfa.a.d().x("FastPair: Successfully accepted ToS.");
                                    fgsn fgsn2 = FmdResponse.d();
                                    fgsn2.a = 2;
                                    fgsn2.b(hluj0.b);
                                    fgsn2.c(hluj0.d);
                                    return fgsn2.a();
                                }
                                ggtj ggtj0 = cwfa.a.d();
                                hlui hlui1 = hlui.b(hluj0.c);
                                if(hlui1 != null) {
                                    hlui0 = hlui1;
                                }
                                ggtj0.B("FastPair: ToS Request failed: %s", hlui0);
                                fgsn fgsn3 = FmdResponse.d();
                                fgsn3.a = 3;
                                fgsn3.b(hluj0.b);
                                fgsn3.c(hluj0.d);
                                return fgsn3.a();
                            }
                            catch(InterruptedException | ExecutionException exception0) {
                                ((ggtj)cwfa.a.g().s(exception0)).x("FastPair: Failed to send tos accept");
                                fgsn fgsn4 = FmdResponse.d();
                                fgsn4.a = 1;
                                return fgsn4.a();
                            }
                        }
                        cwfa.a.d().x("FastPair: No accounts on device.");
                        return FmdResponse.d().a();
                    }
                    cwfa.a.d().x("FastPair: accept: No account key found for provided mac");
                    return FmdResponse.d().a();
                }
                case 3: {
                    Context context1 = cwij0.d;
                    String s1 = fmdRequest0.c();
                    cxke cxke1 = ((cwex)cusq.c(context1, cwex.class)).d(s1);
                    if(cxke1 != null && (2 & cxke1.c) != 0 && !cxke1.e.isEmpty()) {
                        ByteString hfsf1 = cxke1.e;
                        Account[] arr_account1 = cchj.b(context1).p("com.google");
                        if(arr_account1 != null && arr_account1.length != 0) {
                            HashMap hashMap2 = new HashMap();
                            HashMap hashMap3 = new HashMap();
                            if(hashMap2.containsKey(hfsf1)) {
                                cwfa.a.d().x("FastPair: fmd tos was already accepted and result cached.");
                                fgsn fgsn5 = FmdResponse.d();
                                fgsn5.a = 3;
                                fgsn5.b(((Integer)hashMap2.get(hfsf1)).intValue());
                                return fgsn5.a();
                            }
                            RequestFuture requestFuture1 = RequestFuture.newFuture();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlug.a).v_newBuilder();
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hltt.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            hltt hltt0 = (hltt)hftp2.b_message;
                            hfsf1.getClass();
                            hltt0.b |= 8;
                            hltt0.e = hfsf1;
                            long v2 = bbmq.d(context1);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp2.b_message;
                            ((hltt)hftv0).b |= 4;
                            ((hltt)hftv0).d = v2;
                            if(!hftv0.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp2.b_message;
                            ((hltt)hftv1).b |= 1;
                            ((hltt)hftv1).c = false;
                            if(!hftv1.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            hltt hltt1 = (hltt)hftp2.b_message;
                            hltt1.b |= 16;
                            hltt1.f = true;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hlug hlug1 = (hlug)hftp1.b_message;
                            hltt hltt2 = (hltt)hftp2.N_build();
                            hltt2.getClass();
                            hlug1.d = hltt2;
                            hlug1.b |= 4;
                            cwim.b(requestFuture1, requestFuture1, ((hlug)hftp1.N_build()), bbfw.b());
                            try {
                                hluj hluj1 = (hluj)requestFuture1.get();
                                if((hlui.b(hluj1.c) == null ? hlui.a : hlui.b(hluj1.c)).equals(hlui.c)) {
                                    hashMap2.put(hfsf1, Integer.valueOf(hluj1.b));
                                    cjpa cjpa0 = cjqh.a(context1, "nearby", "trigget_fmd_tos_notification_count_preference", 0).c();
                                    cjpa0.f(hfsf1.toStringUtf8(), ((int)hvpg.p()));
                                    cjpd.g(cjpa0);
                                    hashMap3.remove(hfsf1);
                                    cwfa.a.d().x("FastPair: Successfully skipped FMD ToS.");
                                    fgsn fgsn6 = FmdResponse.d();
                                    fgsn6.a = 4;
                                    fgsn6.b(hluj1.b);
                                    fgsn6.c(hluj1.d);
                                    return fgsn6.a();
                                }
                                cwfa.a.d().B("FastPair: ToS Request failed: %s", (hlui.b(hluj1.c) == null ? hlui.a : hlui.b(hluj1.c)));
                                fgsn fgsn7 = FmdResponse.d();
                                fgsn7.b(hluj1.b);
                                fgsn7.c(hluj1.d);
                                fgsn7.a = 1;
                                return fgsn7.a();
                            }
                            catch(InterruptedException | ExecutionException exception1) {
                                ((ggtj)cwfa.a.g().s(exception1)).x("FastPair: Failed to send tos accept");
                                fgsn fgsn8 = FmdResponse.d();
                                fgsn8.a = 1;
                                return fgsn8.a();
                            }
                        }
                        cwfa.a.d().x("FastPair: No accounts on device.");
                        return FmdResponse.d().a();
                    }
                    cwfa.a.d().x("FastPair: skip: No account key found for provided mac");
                    return FmdResponse.d().a();
                }
                default: {
                    cwfa.a.d().B("FastPair: Failed to make fmd request %s", fmdRequest0.b());
                    return FmdResponse.d().a();
                }
            }
        }
        Context context2 = cwij0.d;
        String s2 = fmdRequest0.c();
        cxke cxke2 = ((cwex)cusq.c(context2, cwex.class)).d(s2);
        if(cxke2 != null && (2 & cxke2.c) != 0 && !cxke2.e.isEmpty()) {
            ByteString hfsf2 = cxke2.e;
            Account[] arr_account2 = cchj.b(context2).p("com.google");
            if(arr_account2 != null && arr_account2.length != 0) {
                return cwim.c(context2, hfsf2, false, new HashMap(), new HashMap());
            }
            cwfa.a.d().x("FastPair: No accounts on device.");
            return FmdResponse.d().a();
        }
        cwfa.a.d().x("FastPair: get: No account key found for provided mac");
        return FmdResponse.d().a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            FmdRequest fmdRequest0 = (FmdRequest)wbz.a(parcel0, FmdRequest.CREATOR);
            gxwa.gr(parcel0);
            FmdResponse fmdResponse0 = this.a(fmdRequest0);
            parcel1.writeNoException();
            wbz.g(parcel1, fmdResponse0);
            return true;
        }
        return false;
    }
}

