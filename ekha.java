import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreSuggestionEntity;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class ekha extends cjtm {
    private final ekfe a;
    private final String b;
    private final String c;
    private ejyt d;

    public ekha(ekfe ekfe0, String s, String s1, azug azug0) {
        super(0x87, "PromoRomanescoRestores", azug0);
        this.a = ekfe0;
        this.c = s;
        this.b = s1;
    }

    private final void b(List list0, Context context0, boolean z) {
        ArrayList arrayList0;
        String s = this.b;
        if(ejyr.a(context0, new Account(s, "com.google")).booleanValue()) {
            try {
                List list1 = ekgr.b(context0, s, "", z);
                if(z) {
                    if(this.d == null) {
                        this.d = ejyt.a(context0);
                    }
                    ekgq ekgq0 = new ekgq(context0, s, this.d);
                    List list2 = ekgr.c(((List)ekgr.b.e(ekgq0).get()));
                    HashSet hashSet0 = new HashSet();
                    for(Object object1: list2) {
                        aqfl aqfl0 = (aqfl)object1;
                        if(ekgr.d(aqfl0)) {
                            hashSet0.add(Long.valueOf(aqfl0.c));
                        }
                    }
                    Iterator iterator2 = list1.iterator();
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        if(!hashSet0.contains(((BackedUpContactsPerDeviceEntity)object2).b)) {
                            iterator2.remove();
                        }
                    }
                    new ejyu(context0);
                    gfsx gfsx0 = ejyu.a(context0);
                    arrayList0 = new ArrayList();
                    for(Object object3: list1) {
                        BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity1 = (BackedUpContactsPerDeviceEntity)object3;
                        if(gfsx0.i()) {
                            Object object4 = gfsx0.d();
                            if(!backedUpContactsPerDeviceEntity1.b.equals(object4)) {
                                arrayList0.add(backedUpContactsPerDeviceEntity1);
                            }
                        }
                        else {
                            arrayList0.add(backedUpContactsPerDeviceEntity1);
                        }
                    }
                }
                else {
                    String s1 = gfta.b(new ejyu(context0).b(s));
                    arrayList0 = new ArrayList();
                    for(Object object0: list1) {
                        BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0 = (BackedUpContactsPerDeviceEntity)object0;
                        if(!backedUpContactsPerDeviceEntity0.a.equals(s1)) {
                            arrayList0.add(backedUpContactsPerDeviceEntity0);
                        }
                    }
                }
                Set set0 = ekav.a(context0);
                for(Object object5: arrayList0) {
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity2 = (BackedUpContactsPerDeviceEntity)object5;
                    int v = 0;
                    for(Object object6: backedUpContactsPerDeviceEntity2.g()) {
                        SourceStats sourceStats0 = (SourceStats)object6;
                        if(ekgn.a(context0, backedUpContactsPerDeviceEntity2.a) <= 0L && !set0.contains(sourceStats0.c()) && !TextUtils.equals("com.google", sourceStats0.c())) {
                            v += (int)sourceStats0.b();
                        }
                    }
                    if(v > 0) {
                        list0.add(new RestoreSuggestionEntity((z ? Long.toString(backedUpContactsPerDeviceEntity2.b.longValue()) : backedUpContactsPerDeviceEntity2.a), backedUpContactsPerDeviceEntity2.c, v, backedUpContactsPerDeviceEntity2.d, z));
                    }
                    ejze ejze0 = ejze.a();
                    String s2 = this.c;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giui.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giue.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((giue)hftv0).c = z;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((giue)hftv1).b = v;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    giue giue0 = (giue)hftp1.b_message;
                    s2.getClass();
                    giue0.d = s2;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giui giui0 = (giui)hftp0.b_message;
                    giue giue1 = (giue)hftp1.N_build();
                    giue1.getClass();
                    giui0.v = giue1;
                    giui0.b |= 0x20000;
                    ejze0.t(hftp0);
                }
                return;
            }
            catch(acse unused_ex) {
                Log.e("PromoRomanescoRestores", "Auth Exception when fetching restore suggestion contacts from server");
                ejze.a().n("", 3, 3, "fetch_promo_error:authentication_failure");
                this.j(Status.d);
                return;
            }
            catch(iapl iapl0) {
                Log.e("PromoRomanescoRestores", "Status Exception when fetching restore suggestion contacts from server");
                ejze.a().n("", 3, 3, "fetch_promo_error:status_error:" + iapl0.a.t.toString());
                this.j(Status.d);
                return;
            }
            catch(ExecutionException unused_ex) {
                Log.e("PromoRomanescoRestores", "Execution Exception when fetching gms backups from server");
                this.j(Status.d);
                return;
            }
            catch(hfur unused_ex) {
                Log.e("PromoRomanescoRestores", "InvalidProtocolBuffer Exception when fetching gms backups from server");
                this.j(Status.d);
                return;
            }
            catch(InterruptedException unused_ex) {
                goto label_101;
            }
        }
        return;
    label_101:
        Log.e("PromoRomanescoRestores", "Interrupted Exception when fetching gms backups from server");
        this.j(Status.d);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ArrayList arrayList0 = new ArrayList();
        this.b(arrayList0, context0, false);
        if(hxuf.a.b().c()) {
            this.b(arrayList0, context0, true);
        }
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.a.a(Status.b, arrayList0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null, ApiMetadata.b);
    }
}

