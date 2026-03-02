import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.SystemUpdateManager;
import com.google.android.gms.update.SystemUpdateStatus;
import j..util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public final class ezyg {
    public static final fage a;
    public final Context b;
    public final Object c;
    public final Map d;
    private static final baun e;

    static {
        ezyg.e = fabk.d("StatusUpdatePublishControl");
        ezyg.a = new ezyf();
    }

    public ezyg(Context context0) {
        this.c = new Object();
        this.b = context0;
        this.d = new HashMap();
    }

    public final void a() {
        int v1;
        SystemUpdateStatus systemUpdateStatus0 = ((ezxs)ezxs.l.b()).b();
        int v = systemUpdateStatus0.c;
        Intent intent0 = ezxd.a().putExtra("status", v);
        Context context0 = this.b;
        context0.sendBroadcast(intent0);
        if(((Boolean)ezwo.d(hvzy.J, Boolean.class)).booleanValue()) {
            context0.sendBroadcast(new Intent("com.google.android.update.SYSTEM_UPDATE").putExtra("status", v));
        }
        synchronized(this.c) {
            Iterator iterator0 = this.d.entrySet().iterator();
            while(true) {
                v1 = 0;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                ezup ezup0 = (ezup)((Map.Entry)object1).getValue();
                if(ezup0.asBinder().isBinderAlive()) {
                    try {
                        ezup0.a(systemUpdateStatus0);
                    }
                    catch(RemoteException remoteException0) {
                        ezyg.e.g("Failed to trigger status update callback.", remoteException0, new Object[0]);
                    }
                }
                else {
                    iterator0.remove();
                }
            }
        }
        if(((Boolean)ezwo.d(hvzy.H, Boolean.class)).booleanValue()) {
            Context context1 = this.b;
            gfsx gfsx0 = gfsx.l(((SystemUpdateManager)context1.getSystemService("system_update")));
            if(!gfsx0.i()) {
                ezyg.e.m("SystemUpdateManager not available for updating system update info", new Object[0]);
                return;
            }
            hlnn hlnn0 = faaa.c();
            PersistableBundle persistableBundle0 = new PersistableBundle();
            int v2 = systemUpdateStatus0.c;
            switch(v2) {
                case 0: {
                    v1 = 1;
                    break;
                }
                case 1: {
                    v1 = 2;
                    break;
                }
                default: {
                    if(v2 != 2 && v2 != 3) {
                        switch(v2) {
                            case 5: 
                            case 278: 
                            case 0x613: 
                            case 0x713: 
                            case 2067: 
                            case 0x913: 
                            case 0xA13: {
                                v1 = 1;
                                break;
                            }
                            case 4: 
                            case 15: 
                            case 0x106: 
                            case 0x107: 
                            case 0x10B: 
                            case 0x206: 
                            case 0x207: 
                            case 0x306: 
                            case 0x307: 
                            case 0x30B: 
                            case 0x407: 
                            case 0x40B: 
                            case 0x50B: 
                            case 0x510: 
                            case 0x512: 
                            case 0x513: 
                            case 0x610: 
                            case 0x710: 
                            case 0x80B: 
                            case 0x810: 
                            case 0x90B: 
                            case 0x910: 
                            case 0xA0B: 
                            case 0xB0B: {
                                goto label_46;
                            }
                            case 0x60B: 
                            case 0x70B: 
                            case 0xC0B: 
                            case 0xD0B: {
                                v1 = 2;
                                break;
                            }
                            default: {
                                if(v2 != 22 && v2 != 23 && v2 != 24) {
                                    switch(v2) {
                                        case 0x110: {
                                            v1 = 4;
                                            break;
                                        }
                                        case 0x210: {
                                            v1 = 5;
                                            break;
                                        }
                                        case 273: 
                                        case 274: 
                                        case 275: 
                                        case 529: 
                                        case 530: 
                                        case 531: {
                                            goto label_46;
                                        }
                                        default: {
                                            if(v2 == 0x310 || v2 == 785 || v2 == 786 || v2 == 787 || (v2 == 1040 || v2 == 1041 || v2 == 1042 || v2 == 1043)) {
                                                goto label_46;
                                            }
                                        }
                                    }
                                }
                                else {
                                    v1 = 1;
                                    break;
                                }
                            }
                        }
                    }
                    else {
                    label_46:
                        v1 = 3;
                    }
                }
            }
            persistableBundle0.putInt("status", v1);
            if(!gfta.c(systemUpdateStatus0.a)) {
                if(v1 != 1) {
                    persistableBundle0.putBoolean("is_security_update", ezwj.d().booleanValue());
                    persistableBundle0.putString("title", ezwj.p());
                }
                hlnk hlnk0 = hlnn0.f == null ? hlnk.a : hlnn0.f;
                if(!hlnk0.f.isEmpty()) {
                    persistableBundle0.putString("target_security_patch_level", hlnk0.f);
                }
                if(!hlnk0.c.isEmpty()) {
                    persistableBundle0.putString("target_build_fingerprint", new gfss("|").b(hlnk0.c));
                }
            }
            SystemUpdateManager systemUpdateManager0 = (SystemUpdateManager)gfsx0.d();
            Bundle bundle0 = systemUpdateManager0.retrieveSystemUpdateInfo();
            for(Object object2: persistableBundle0.keySet()) {
                if(Objects.equals(persistableBundle0.get(((String)object2)), bundle0.get(((String)object2)))) {
                    continue;
                }
                else {
                    systemUpdateManager0.updateSystemUpdateInfo(persistableBundle0);
                    if(hwcm.a.b().a()) {
                        context1.sendBroadcast(new Intent("com.google.android.update.SYSTEM_UPDATE_INFO_UPDATE"), "android.permission.READ_SYSTEM_UPDATE_INFO");
                        return;
                    }
                }
                break;
            }
        }
    }
}

