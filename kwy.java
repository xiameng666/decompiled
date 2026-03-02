import android.app.PendingIntent;
import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Log;
import j..time.Instant;
import java.util.Collections;
import java.util.List;

public final class kwy {
    public static final kxa a(Slice slice0) {
        ibuq.f(slice0, "slice");
        List list0 = slice0.getItems();
        ibuq.e(list0, "getItems(...)");
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        Object object0 = null;
        Object object1 = null;
        CharSequence charSequence0 = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Instant instant0 = null;
        CharSequence charSequence1 = null;
        CharSequence charSequence2 = null;
        for(Object object5: list0) {
            SliceItem sliceItem0 = (SliceItem)object5;
            if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                object0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                charSequence1 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                if(!ibuq.m(sliceItem0.getText(), "true")) {
                    continue;
                }
                z1 = true;
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                charSequence2 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                object2 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                object1 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                charSequence0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")) {
                object4 = sliceItem0.getIcon();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")) {
                object3 = sliceItem0.getAction();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                instant0 = Instant.ofEpochMilli(sliceItem0.getLong());
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                if(!ibuq.m(sliceItem0.getText(), "true")) {
                    continue;
                }
                z = true;
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                z2 = true;
            }
            else {
                if(!sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                    continue;
                }
                z3 = true;
            }
        }
        try {
            ibuq.c(object1);
            ibuq.c(object2);
            ibuq.c(object3);
            ibuq.c(object4);
            Bundle bundle0 = new Bundle();
            ibuq.c(object0);
            String s = object0.toString();
            ibuq.f(s, "id");
            return new kxa(((CharSequence)object1), charSequence0, ((CharSequence)object2), ((PendingIntent)object3), ((Icon)object4), instant0, z, new kvq(bundle0, s, "{\"dummy_key\":\"dummy_value\"}", null), z1, charSequence1, charSequence2, null, z2, true, z3, 0x800);
        }
        catch(Exception exception0) {
            Log.i("PublicKeyCredEntry", "fromSlice failed with: " + exception0.getMessage());
            return null;
        }
    }

    public static final boolean b(kxa kxa0) {
        return kxa0.n ? kxa0.o : kxa0.k.getType() == 2 && kxa0.k.getResId() == 0x7F0801E9;  // drawable:adx_ic_passkey
    }

    public static final void c(kxa kxa0, Slice.Builder slice$Builder0) {
        ibuq.f(kxa0, "entry");
        String s = "false";
        List list0 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID");
        Slice.Builder slice$Builder1 = slice$Builder0.addText(kxa0.b.a, null, list0);
        List list1 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID");
        Slice.Builder slice$Builder2 = slice$Builder1.addText(kxa0.c, null, list1).addText((kxa0.d ? "true" : "false"), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
        List list2 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN");
        slice$Builder2.addText(kxa0.e, null, list2);
        if(kxa0.m) {
            s = "true";
        }
        List list3 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME");
        Slice.Builder slice$Builder3 = slice$Builder0.addText(kxa0.i, null, list3);
        List list4 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME");
        Slice.Builder slice$Builder4 = slice$Builder3.addText(kxa0.g, null, list4);
        List list5 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME");
        Slice.Builder slice$Builder5 = slice$Builder4.addText(kxa0.h, null, list5).addText(s, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED"));
        List list6 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON");
        slice$Builder5.addIcon(kxa0.k, null, list6);
        try {
            if(kwy.b(kxa0)) {
                slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        if(kxa0.p) {
            slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
        }
        Instant instant0 = kxa0.l;
        if(instant0 != null) {
            slice$Builder0.addLong(instant0.toEpochMilli(), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
        }
        Slice slice0 = new Slice.Builder(slice$Builder0).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build();
        slice$Builder0.addAction(kxa0.j, slice0, null);
    }
}

