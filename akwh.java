import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akwh {
    private static final gqus a;
    private final ajes b;
    private final akwf c;

    static {
        akwh.a = gqus.m;
    }

    public akwh(ajes ajes0) {
        this(ajes0, new akwf());
    }

    public akwh(ajes ajes0, akwf akwf0) {
        this.b = ajes0;
        this.c = akwf0;
    }

    public final void a(Context context0, Account account0, int v) {
        String s1;
        boolean z1;
        int v2;
        List list3;
        aliu aliu0 = new aliu();
        if(!hpyz.j()) {
            aliu0.n(5);
            return;
        }
        if(account0 != null && bbmn.m(context0, account0)) {
            byte[] arr_b = alfp.b(context0);
            if(arr_b != null) {
                SyncedCryptauthDevice syncedCryptauthDevice0 = hpyz.g() ? null : alfr.c(context0, account0.name, true);
                SyncedCryptauthDevice syncedCryptauthDevice1 = alfr.c(context0, account0.name, false);
                akwf akwf0 = this.c;
                alvm alvm0 = new alvm(context0);
                List list0 = syncedCryptauthDevice0 == null ? null : akua.a(syncedCryptauthDevice0.a());
                if(hpyz.a.d().i()) {
                    if(syncedCryptauthDevice0 == null && syncedCryptauthDevice1 == null) {
                        list0 = akwf.b(akwf0.a.a(), false, alvm0);
                    }
                    else {
                        List list1 = akua.a((syncedCryptauthDevice1 == null ? syncedCryptauthDevice0.a() : syncedCryptauthDevice1.a()));
                        boolean z = list0 != null && list0.equals(list1);
                        List list2 = akwf0.a.a();
                        allu allu0 = (allu)list2.get(0);
                        int v1 = 0;
                        while(true) {
                            if(v1 >= list1.size()) {
                                list3 = list2;
                                v2 = -1;
                                break;
                            }
                            allu allu1 = (allu)list1.get(v1);
                            list3 = list2;
                            if(allu1.c == allu0.c && allu1.d == allu0.d) {
                                v2 = v1;
                                break;
                            }
                            ++v1;
                            list2 = list3;
                        }
                        if(v2 == -1) {
                            list0 = akwf.b(list3, false, alvm0);
                        }
                        else if(v2 != 0) {
                            List list4 = list1.subList(v2, list1.size());
                            list4.addAll(list3.subList(list4.size(), 4));
                            list0 = akwf.b(list4, false, alvm0);
                        }
                        else if(!z) {
                            list0 = akwf.b(list1, false, alvm0);
                        }
                        else {
                            int v3 = list1.size() - 1;
                            byte[] arr_b1 = alvm0.b(((allu)list1.get(v3)).c);
                            allu allu2 = (allu)list3.get(v3);
                            if(arr_b1 != null && !Arrays.equals(((allu)list1.get(v3)).b.toByteArray(), arr_b1)) {
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)allu.a).v_newBuilder();
                                long v4 = ((allu)list1.get(v3)).c;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((allu)hftp0.b_message).c = v4;
                                long v5 = ((allu)list1.get(v3)).d;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((allu)hftp0.b_message).d = v5;
                                ByteString hfsf0 = ByteString.copyFrom(arr_b1);
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((allu)hftp0.b_message).b = hfsf0;
                                allu2 = (allu)hftp0.N_build();
                                z1 = false;
                            }
                            else {
                                z1 = true;
                            }
                            list1.remove(v3);
                            list1.add(allu2);
                            list0 = akwf.b(list1, z1, alvm0);
                        }
                    }
                    new aliu().C("beacon_seed_coordinator_v2_result", akwf.a(list0));
                }
                else {
                    new aliu().C("beacon_seed_coordinator_v1_result", akwf.a(list0));
                }
                alvm0.a(list0);
                if(list0 != null && !list0.isEmpty()) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)allv.a).v_newBuilder();
                    ByteString hfsf1 = ByteString.copyFrom(arr_b);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((allv)hftp1.b_message).b = hfsf1;
                    String s = Build.MODEL;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    s.getClass();
                    ((allv)hftv0).c = s;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    allv allv0 = (allv)hftp1.b_message;
                    hfuo hfuo0 = allv0.d;
                    if(!hfuo0.c()) {
                        allv0.d = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(list0, allv0.d);
                    if(!hpzm.k() || cjmf.b(context0, "android.permission.BLUETOOTH_CONNECT") == 0) {
                        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
                        s1 = bluetoothAdapter0 == null ? null : bluetoothAdapter0.getAddress();
                    }
                    else {
                        s1 = null;
                    }
                    if(s1 != null) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((allv)hftp1.b_message).e = s1;
                    }
                    allv allv1 = (allv)hftp1.N_build();
                    ajes ajes0 = this.b;
                    byte[] arr_b2 = allv1.toBytesArray();
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    if(hpzc.i()) {
                        arrayList1.add(Integer.valueOf(gqus.n.a()));
                        arrayList1.add(Integer.valueOf(gqus.o.a()));
                    }
                    arrayList1.add(Integer.valueOf(gqus.p.a()));
                    arrayList1.add(Integer.valueOf(gqus.q.a()));
                    gqus[] arr_gqus = gqus.values();
                    for(int v6 = 0; v6 < arr_gqus.length; ++v6) {
                        gqus gqus0 = arr_gqus[v6];
                        if(!gqus0.equals(gqus.a) && !gqus0.equals(gqus.r)) {
                            int v7 = gqus0.a();
                            Integer integer0 = v7;
                            integer0.getClass();
                            if(v7 <= akwh.a.a() || arrayList1.contains(integer0)) {
                                arrayList0.add(gqus0.name());
                                arrayList0.add(gqus0.name() + "_SUPPORTED");
                            }
                        }
                    }
                    evql evql0 = ajes0.jn(new ajdn(ajes0, account0, v, arr_b2, gged_interceptors.i(arrayList0)));
                    try {
                        evrg.o(evql0, hpyz.c(), TimeUnit.SECONDS);
                    }
                    catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                        aliu0.n(2);
                        throw new akwg(exception0);
                    }
                    aliu0.n((syncedCryptauthDevice1 == null ? 0 : 1));
                    return;
                }
                aliu0.n(4);
                throw new akwg("Failed to generate beacon seeds");
            }
            aliu0.n(3);
            throw new akwg("Failed to retrieve public key");
        }
        aliu0.n(6);
    }
}

