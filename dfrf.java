import android.content.Context;
import android.content.Intent;

public final class dfrf {
    public static final Intent a(Context context0, Intent intent0, dfre dfre0) {
        ibuq.f(intent0, "inputIntent");
        ibuq.f(dfre0, "action");
        dcwv dcwv0 = dcww.a(context0);
        if(hvqz.d().length() != 0 && dcwv0 == null) {
            return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.nearby.sharing.migration.MigrationNoticeActivity");
        }
        switch(dfre0.ordinal()) {
            case 0: {
                if(dcwv0 != null) {
                    return dfrf.b(intent0, dcwv0);
                }
                Intent intent1 = new Intent(intent0);
                if(!ibuq.m(intent1.getAction(), "android.intent.action.SEND_MULTIPLE") && !ibuq.m(intent1.getAction(), "android.intent.action.REMOTE_COPY")) {
                    intent1.setAction("android.intent.action.SEND");
                }
                if(hvod.c() && hvod.a.b().f()) {
                    intent1.setClassName(context0, "com.google.android.gms.nearby.sharing.main.MainActivity");
                }
                else {
                    intent1.setClassName(context0, "com.google.android.gms.nearby.sharing.send.SendActivity");
                }
                intent1.addFlags(0x10008000);
                return intent1;
            }
            case 1: {
                return dcwv0 == null ? null : dfrf.b(intent0, dcwv0);
            }
            case 2: {
                if(dcwv0 != null) {
                    Intent intent2 = new Intent("com.samsung.android.app.sharelive.ACTION_VISIBILITY_SETTINGS").setPackage(dcwv0.a).addFlags(0x10008000);
                    if(intent2 != null) {
                        return intent2;
                    }
                }
                Intent intent3 = new Intent(intent0);
                intent3.setClassName(context0, "com.google.android.gms.nearby.sharing.receive.ReceiveActivity");
                intent3.addFlags(0x10008000);
                return intent3;
            }
            case 3: {
                return dcwv0 == null ? null : new Intent("com.samsung.android.app.sharelive.ACTION_VISIBILITY_SETTINGS").setPackage(dcwv0.a).addFlags(0x10008000);
            }
            case 4: {
                return dcwv0 == null ? null : new Intent("com.samsung.android.app.sharelive.ACTION_SETTINGS").putExtra("setting_entering_mode", 9).setPackage(dcwv0.a).addFlags(0x10008000);
            }
            default: {
                throw new ibnq();
            }
        }
    }

    private static final Intent b(Intent intent0, dcwv dcwv0) {
        Intent intent1 = new Intent(intent0);
        intent1.setComponent(null);
        intent1.setPackage(dcwv0.a);
        if(!ibuq.m(intent1.getAction(), "android.intent.action.SEND_MULTIPLE")) {
            intent1.setAction("android.intent.action.SEND");
        }
        return intent1;
    }
}

