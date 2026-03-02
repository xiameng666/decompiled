import android.app.backup.BackupRestoreEventLogger.DataTypeResult;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map.Entry;

public final class aqqm {
    private static final baun a;

    static {
        aqqm.a = aqql.a("BackupManagerMonitorEventParser");
    }

    public static hkye a(Bundle bundle0) {
        gged_interceptors gged0;
        boolean z1;
        int v = 0;
        if(bundle0 == null) {
            aqqm.a.f("Backup manager monitor event bundle cannot be null", new Object[0]);
            return null;
        }
        hkxz hkxz0 = (hkxz)((ProtoLiteMessage)hkye.a).v_newBuilder();
        long v1 = SystemClock.elapsedRealtime();
        if(!hkxz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkxz0).ensureMutable();
        }
        hkye hkye0 = (hkye)hkxz0.b_message;
        hkye0.b |= 1;
        hkye0.c = v1;
        if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_ID") && bundle0.containsKey("android.app.backup.extra.LOG_EVENT_CATEGORY")) {
            int v2 = bundle0.getInt("android.app.backup.extra.LOG_EVENT_ID");
            if(!hkxz0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkxz0).ensureMutable();
            }
            hkye hkye1 = (hkye)hkxz0.b_message;
            hkye1.b |= 2;
            hkye1.d = v2;
            int v3 = bundle0.getInt("android.app.backup.extra.LOG_EVENT_CATEGORY");
            if(!hkxz0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkxz0).ensureMutable();
            }
            hkye hkye2 = (hkye)hkxz0.b_message;
            hkye2.b |= 4;
            hkye2.e = v3;
            if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME")) {
                String s = bundle0.getString("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME");
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye3 = (hkye)hkxz0.b_message;
                s.getClass();
                hkye3.b |= 8;
                hkye3.f = s;
            }
            if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION")) {
                int v4 = bundle0.getInt("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION");
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye4 = (hkye)hkxz0.b_message;
                hkye4.b |= 16;
                hkye4.g = v4;
            }
            if(bundle0.containsKey("android.app.backup.extra.LOG_CANCEL_ALL")) {
                boolean z = bundle0.getBoolean("android.app.backup.extra.LOG_CANCEL_ALL");
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye5 = (hkye)hkxz0.b_message;
                hkye5.b |= 0x20;
                hkye5.h = z;
            }
            hqhn hqhn0 = hqhn.a;
            if(hqhn0.d().n() && bundle0.containsKey("android.app.backup.extra.CANCELLATION_REASON")) {
                int v5 = hkyb.a(((int)bundle0.getLong("android.app.backup.extra.CANCELLATION_REASON")) + 1);
                if(v5 != 0) {
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    ((hkye)hkxz0.b_message).i = v5 - 1;
                    ((hkye)hkxz0.b_message).b |= 0x40;
                }
            }
            if(bundle0.containsKey("android.app.backup.extra.LOG_ILLEGAL_KEY")) {
                Object[] arr_object = {bundle0.getString("android.app.backup.extra.LOG_ILLEGAL_KEY")};
                aqqm.a.j("BackupManagerMonitor.EXTRA_LOG_ILLEGAL_KEY: %s", arr_object);
            }
            if(bundle0.containsKey("android.app.backup.extra.LOG_PREFLIGHT_ERROR")) {
                long v6 = bundle0.getLong("android.app.backup.extra.LOG_PREFLIGHT_ERROR");
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye6 = (hkye)hkxz0.b_message;
                hkye6.b |= 0x80;
                hkye6.j = v6;
            }
            if(bundle0.containsKey("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP")) {
                String s1 = bundle0.getString("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP");
                String s2 = s1.split(":", -1)[0];
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye7 = (hkye)hkxz0.b_message;
                s2.getClass();
                hkye7.b |= 0x100;
                hkye7.k = s2;
                aqqm.a.j("BackupManagerMonitor.EXTRA_LOG_EXCEPTION_FULL_BACKUP: %s", new Object[]{s1});
            }
            hqlt hqlt0 = hqlt.a;
            if(hqlt0.o().aA()) {
                int v7 = aqqm.c((bundle0.containsKey("android.app.backup.extra.OPERATION_TYPE") ? bundle0.getInt("android.app.backup.extra.OPERATION_TYPE") : -1));
                if(hqhn0.d().m() && v7 == 1) {
                    int v8 = ((hkye)hkxz0.b_message).d;
                    if(v8 == 7) {
                        v7 = 1;
                    }
                    else if(v8 <= 21) {
                        v7 = 2;
                    }
                    else if(v8 <= 0x30) {
                        v7 = 3;
                    }
                    else if(v8 > 50) {
                        switch(v8) {
                            case 51: {
                                v7 = 2;
                                break;
                            }
                            case 52: {
                                v7 = 1;
                                break;
                            }
                            default: {
                                if(v8 <= 81) {
                                    v7 = 3;
                                }
                                else if(v8 == 82) {
                                    v7 = 2;
                                }
                                else {
                                    v7 = 1;
                                }
                            }
                        }
                    }
                    else {
                        v7 = 1;
                    }
                }
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                ((hkye)hkxz0.b_message).l = v7 - 1;
                ((hkye)hkxz0.b_message).b |= 0x200;
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(hqlt0.o().aq()) {
                if(((hkye)hkxz0.b_message).d == 52) {
                    if(!bundle0.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME") || !hqlt.n().b.contains(bundle0.getString("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME"))) {
                        aqqm.a.j("Skipping agent logs: package is not allowlisted", new Object[0]);
                        gged0 = ggna.a;
                    }
                    else if(!bundle0.containsKey("android.app.backup.extra.LOG_AGENT_LOGGING_RESULTS")) {
                        gged0 = ggna.a;
                    }
                    else {
                        gged0 = gged_interceptors.i(bundle0.getParcelableArrayList("android.app.backup.extra.LOG_AGENT_LOGGING_RESULTS"));
                    }
                    if(gged0.isEmpty()) {
                        return null;
                    }
                    int v9 = gged0.size();
                    while(v < v9) {
                        BackupRestoreEventLogger.DataTypeResult backupRestoreEventLogger$DataTypeResult0 = (BackupRestoreEventLogger.DataTypeResult)gged0.get(v);
                        hkxx hkxx0 = aqqm.b(backupRestoreEventLogger$DataTypeResult0);
                        for(Object object0: backupRestoreEventLogger$DataTypeResult0.getErrors().entrySet()) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkxw.a).v_newBuilder();
                            String s3 = (String)((Map.Entry)object0).getKey();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hkxw hkxw0 = (hkxw)hftp0.b_message;
                            s3.getClass();
                            hkxw0.b |= 1;
                            hkxw0.c = s3;
                            long v10 = (long)(((int)(((Integer)((Map.Entry)object0).getValue()))));
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hkxw hkxw1 = (hkxw)hftp0.b_message;
                            hkxw1.b |= 2;
                            hkxw1.d = v10;
                            hkxx0.a(hftp0);
                        }
                        hkxz0.a(hkxx0);
                        ++v;
                    }
                    if(!z1) {
                        int v11 = bundle0.containsKey("android.app.backup.extra.OPERATION_TYPE") ? bundle0.getInt("android.app.backup.extra.OPERATION_TYPE") : -1;
                        if(!hkxz0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hkxz0).ensureMutable();
                        }
                        ((hkye)hkxz0.b_message).l = aqqm.c(v11) - 1;
                        ((hkye)hkxz0.b_message).b |= 0x200;
                        return (hkye)((ProtoLiteBuilder)hkxz0).N_build();
                    }
                }
            }
            else if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME") && hqlt.n().b.contains(bundle0.getString("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME"))) {
                if(bundle0.containsKey("android.app.backup.extra.LOG_AGENT_LOGGING_RESULTS")) {
                    ArrayList arrayList0 = bundle0.getParcelableArrayList("android.app.backup.extra.LOG_AGENT_LOGGING_RESULTS");
                    int v12 = arrayList0.size();
                    while(v < v12) {
                        BackupRestoreEventLogger.DataTypeResult backupRestoreEventLogger$DataTypeResult1 = (BackupRestoreEventLogger.DataTypeResult)arrayList0.get(v);
                        hkxx hkxx1 = aqqm.b(backupRestoreEventLogger$DataTypeResult1);
                        for(Object object1: backupRestoreEventLogger$DataTypeResult1.getErrors().entrySet()) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkxw.a).v_newBuilder();
                            String s4 = (String)((Map.Entry)object1).getKey();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hkxw hkxw2 = (hkxw)hftp1.b_message;
                            s4.getClass();
                            hkxw2.b |= 1;
                            hkxw2.c = s4;
                            long v13 = (long)(((int)(((Integer)((Map.Entry)object1).getValue()))));
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hkxw hkxw3 = (hkxw)hftp1.b_message;
                            hkxw3.b |= 2;
                            hkxw3.d = v13;
                            hkxx1.a(hftp1);
                        }
                        hkxz0.a(hkxx1);
                        ++v;
                    }
                }
                if(!z1) {
                    int v14 = bundle0.containsKey("android.app.backup.extra.OPERATION_TYPE") ? bundle0.getInt("android.app.backup.extra.OPERATION_TYPE") : -1;
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    ((hkye)hkxz0.b_message).l = aqqm.c(v14) - 1;
                    ((hkye)hkxz0.b_message).b |= 0x200;
                    return (hkye)((ProtoLiteBuilder)hkxz0).N_build();
                }
            }
            else {
                aqqm.a.j("Skipping agent logs: package is not allowlisted", new Object[0]);
            }
            return (hkye)((ProtoLiteBuilder)hkxz0).N_build();
        }
        aqqm.a.f("Event id and category are not optional fields.", new Object[0]);
        return null;
    }

    private static hkxx b(BackupRestoreEventLogger.DataTypeResult backupRestoreEventLogger$DataTypeResult0) {
        hkxx hkxx0 = (hkxx)((ProtoLiteMessage)hkxy.a).v_newBuilder();
        String s = backupRestoreEventLogger$DataTypeResult0.getDataType();
        if(!hkxx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkxx0).ensureMutable();
        }
        hkxy hkxy0 = (hkxy)hkxx0.b_message;
        s.getClass();
        hkxy0.b |= 1;
        hkxy0.c = s;
        long v = (long)backupRestoreEventLogger$DataTypeResult0.getSuccessCount();
        if(!hkxx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkxx0).ensureMutable();
        }
        hkxy hkxy1 = (hkxy)hkxx0.b_message;
        hkxy1.b |= 4;
        hkxy1.e = v;
        int v1 = backupRestoreEventLogger$DataTypeResult0.getSuccessCount() + backupRestoreEventLogger$DataTypeResult0.getFailCount();
        if(!hkxx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkxx0).ensureMutable();
        }
        hkxy hkxy2 = (hkxy)hkxx0.b_message;
        hkxy2.b |= 2;
        hkxy2.d = (long)v1;
        if(backupRestoreEventLogger$DataTypeResult0.getMetadataHash() != null) {
            ByteString hfsf0 = ByteString.copyFrom(backupRestoreEventLogger$DataTypeResult0.getMetadataHash());
            if(!hkxx0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkxx0).ensureMutable();
            }
            hkxy hkxy3 = (hkxy)hkxx0.b_message;
            hkxy3.b |= 8;
            hkxy3.g = hfsf0;
        }
        return hkxx0;
    }

    private static int c(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 1: {
                return 3;
            }
            default: {
                return 1;
            }
        }
    }
}

