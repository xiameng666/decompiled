import android.content.Context;
import com.google.android.gms.backup.ParcelableDevice;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.List;

public final class ekgr {
    public static final bboh a;
    public static final gmcg b;

    static {
        ekgr.a = bboh.b("CBR_DeviceBackupsUtil", bbcu.bN);
        ekgr.b = new bblp(1, 9);
    }

    public static evql a(Context context0, String s, ejyt ejyt0) {
        evql evql0 = evrg.a(new bblp(1, 9), new ejys(ejyt0)).g(new ekgo(context0, s));
        evql0.A(new ekgp());
        return evql0;
    }

    static List b(Context context0, String s, String s1, boolean z) {
        gssp gssp0;
        ekat ekat0 = new ekat();
        List list0 = new ArrayList();
        ekfu ekfu0 = new ekfu(context0);
        ekat0.a();
        if(z) {
            baqr baqr0 = ekfr.a(context0, s);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsso.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gssl.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gssl gssl0 = (gssl)hftp1.b_message;
            s1.getClass();
            gssl0.b = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsso gsso0 = (gsso)hftp0.b_message;
            gssl gssl1 = (gssl)hftp1.N_build();
            gssl1.getClass();
            gsso0.c = gssl1;
            gsso0.b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gssh.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gssh)hftp2.b_message).b = 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsso gsso1 = (gsso)hftp0.b_message;
            gssh gssh0 = (gssh)hftp2.N_build();
            gssh0.getClass();
            gsso1.d = gssh0;
            gsso1.b |= 2;
            gsso gsso2 = (gsso)hftp0.N_build();
            gssp0 = new ekft(ekfu0.a, cmlp.a, ckuh.b).a(baqr0, gsso2, hxuc.b());
        }
        else {
            baqr baqr1 = ekfr.a(context0, s);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gsso.a).v_newBuilder();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gssl.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gssl gssl2 = (gssl)hftp4.b_message;
            s1.getClass();
            gssl2.b = s1;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gsso gsso3 = (gsso)hftp3.b_message;
            gssl gssl3 = (gssl)hftp4.N_build();
            gssl3.getClass();
            gsso3.c = gssl3;
            gsso3.b |= 1;
            gsso gsso4 = (gsso)hftp3.N_build();
            gssp0 = new ekft(ekfu0.a, cmlp.a, ckuh.b).a(baqr1, gsso4, hxuc.b());
        }
        ekat0.b(context0, "fetch_backups", true);
        for(Object object0: gssp0.b) {
            gsut gsut0 = (gsut)object0;
            if(!z && ((long)(gsut0.g == null ? gsuv.a : gsut0.g).b) >= hxun.a.b().a()) {
                ((ggtj)((ggtj)ekgr.a.h()).ar(0x3515)).z("Filtered Footprints backup with SDK version: %d", (gsut0.g == null ? gsuv.a : gsut0.g).b);
                ((ggtj)((ggtj)ekgr.a.h()).ar(0x3513)).z("Filtered Footprints backup with SDK version: %d", (gsut0.g == null ? gsuv.a : gsut0.g).b);
            }
            else {
                String s2 = gsut0.b;
                String s3 = gsut0.e;
                Long long0 = (long)gsut0.f;
                Long long1 = ekgn.a(context0, gsut0.b);
                Long long2 = (long)gsut0.c;
                List list1 = null;
                for(Object object1: gsut0.d) {
                    new SourceStats[]{new SourceStatsEntity(((gsvi)object1).b, ((int)((gsvi)object1).c), ((int)((gsvi)object1).d))};
                    SourceStatsEntity sourceStatsEntity0 = new SourceStatsEntity(((gsvi)object1).b, ((int)((gsvi)object1).c), ((int)((gsvi)object1).d));
                    if(list1 == null) {
                        list1 = new ArrayList();
                    }
                    list1.add(sourceStatsEntity0.l());
                }
                BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0 = new BackedUpContactsPerDeviceEntity(s2, long2, list1, s3, long0, long1, null, true);
                List list2 = backedUpContactsPerDeviceEntity0.g();
                list0.add(new BackedUpContactsPerDeviceEntity(backedUpContactsPerDeviceEntity0.a, backedUpContactsPerDeviceEntity0.b, list2, backedUpContactsPerDeviceEntity0.c, backedUpContactsPerDeviceEntity0.d, backedUpContactsPerDeviceEntity0.e, backedUpContactsPerDeviceEntity0.f, false));
            }
        }
        return list0;
    }

    public static List c(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aqfl.a), ((ParcelableDevice)object0).a, 0, ((ParcelableDevice)object0).a.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            list1.add(((aqfl)hftv0));
        }
        return list1;
    }

    public static boolean d(aqfl aqfl0) {
        return aqfl0.f >= hxun.a.b().b() && aqfk.a(aqfl0.h) == 3;
    }
}

