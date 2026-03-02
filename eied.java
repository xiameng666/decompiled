import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.personalsafety.ringing.BleRingingIntentOperation;
import com.google.android.gms.personalsafety.ringing.FinderRingingIntentOperation;

public final class eied implements eieu {
    @Override  // eieu
    public final void e(Context context0, eiex eiex0) {
        Intent intent0;
        Integer integer0 = eiex0.b;
        if(integer0 == null) {
            ((ggtj)eicd.a.i()).x("deviceType is null");
            return;
        }
        switch(((int)integer0)) {
            case 5: {
                intent0 = IntentOperation.getStartIntent(context0, FinderRingingIntentOperation.class, "com.google.android.personalsafety.internal.ringing.RING_TAG");
                break;
            }
            case 1: 
            case 6: {
                intent0 = IntentOperation.getStartIntent(context0, BleRingingIntentOperation.class, "com.google.android.personalsafety.internal.ringing.RING_TAG");
                break;
            }
            default: {
                ((ggtj)eicd.a.i()).R("%s Unsupported deviceType: %s", "[S]", integer0);
                return;
            }
        }
        if(intent0 == null) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("TagRingingInfoMacAddress", eiex0.a);
        bundle0.putInt("TagRingingInfoDeviceType", integer0.intValue());
        Long long0 = eiex0.c;
        if(long0 != null) {
            bundle0.putLong("TagRingingInfoLastSeenEpochMillis", long0.longValue());
        }
        Long long1 = eiex0.e;
        if(long1 != null) {
            bundle0.putLong("TagRingingInfoRingingAttemptEpochMillis", long1.longValue());
        }
        gwog gwog0 = eiex0.i;
        if(gwog0 != null) {
            bundle0.putInt("TagRingingInfoPreRingingScanEnumInt", gwog0.f);
        }
        Long long2 = eiex0.g;
        if(long2 != null) {
            bundle0.putLong("TagRingingInfoPreRingingScanEpochMillis", long2.longValue());
        }
        Integer integer1 = eiex0.h;
        if(integer1 != null) {
            bundle0.putInt("TagRingingInfoRSSI", integer1.intValue());
        }
        Integer integer2 = eiex0.d;
        if(integer2 != null) {
            bundle0.putInt("TagRingingInfoLastConnectionStatus", integer2.intValue());
        }
        String s = eiex0.j;
        if(s != null) {
            bundle0.putString("TagRingingInfoFinderRingKey", s);
        }
        intent0.putExtras(bundle0);
        context0.startService(intent0);
    }
}

