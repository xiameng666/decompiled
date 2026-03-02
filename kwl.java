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

public final class kwl {
    public static final kwn a(Slice slice0) {
        ibuq.f(slice0, "slice");
        List list0 = slice0.getItems();
        ibuq.e(list0, "getItems(...)");
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        CharSequence charSequence0 = null;
        Object object0 = null;
        CharSequence charSequence1 = null;
        Object object1 = null;
        Object object2 = null;
        Instant instant0 = null;
        Object object3 = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        for(Object object4: list0) {
            SliceItem sliceItem0 = (SliceItem)object4;
            if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                charSequence0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                charSequence2 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                if(!ibuq.m(sliceItem0.getText(), "true")) {
                    continue;
                }
                z1 = true;
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                charSequence3 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                object1 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                object0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                charSequence1 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")) {
                object3 = sliceItem0.getIcon();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")) {
                object2 = sliceItem0.getAction();
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
            ibuq.c(object0);
            ibuq.c(object1);
            ibuq.c(object2);
            ibuq.c(object3);
            Bundle bundle0 = new Bundle();
            ibuq.c(charSequence0);
            return new kwn(((CharSequence)object0), charSequence1, ((CharSequence)object1), ((PendingIntent)object2), instant0, ((Icon)object3), z, kvn.a(bundle0, charSequence0.toString()), z1, charSequence2, charSequence3, z2, true, z3, 0x800);
        }
        catch(Exception exception0) {
            Log.i("PasswordCredentialEntry", "fromSlice failed with: " + exception0.getMessage());
            return null;
        }
    }

    public static final boolean b(kwn kwn0) {
        return kwn0.n ? kwn0.o : kwn0.l.getType() == 2 && kwn0.l.getResId() == 0x7F0801EA;  // drawable:adx_ic_password
    }

    public static final void c(kwn kwn0, Slice.Builder slice$Builder0) {
        ibuq.f(kwn0, "entry");
        String s = "false";
        List list0 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID");
        Slice.Builder slice$Builder1 = slice$Builder0.addText(kwn0.b.a, null, list0);
        List list1 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID");
        Slice.Builder slice$Builder2 = slice$Builder1.addText(kwn0.c, null, list1).addText((kwn0.d ? "true" : "false"), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
        List list2 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN");
        slice$Builder2.addText(kwn0.e, null, list2);
        if(kwn0.m) {
            s = "true";
        }
        List list3 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME");
        Slice.Builder slice$Builder3 = slice$Builder0.addText(kwn0.i, null, list3);
        List list4 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME");
        Slice.Builder slice$Builder4 = slice$Builder3.addText(kwn0.g, null, list4);
        List list5 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME");
        Slice.Builder slice$Builder5 = slice$Builder4.addText(kwn0.h, null, list5).addText(s, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED"));
        List list6 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON");
        slice$Builder5.addIcon(kwn0.l, null, list6);
        try {
            if(kwl.b(kwn0)) {
                slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        if(kwn0.p) {
            slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
        }
        Instant instant0 = kwn0.k;
        if(instant0 != null) {
            slice$Builder0.addLong(instant0.toEpochMilli(), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
        }
        Slice slice0 = new Slice.Builder(slice$Builder0).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build();
        slice$Builder0.addAction(kwn0.j, slice0, null);
    }
}

