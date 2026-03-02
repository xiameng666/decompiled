import android.app.PendingIntent;
import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Log;
import j..time.Instant;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class kwh {
    public static final kwk a(Slice slice0) {
        ibuq.f(slice0, "slice");
        SliceSpec sliceSpec0 = slice0.getSpec();
        ibuq.c(sliceSpec0);
        String s = sliceSpec0.getType();
        ibuq.e(s, "getType(...)");
        List list0 = slice0.getItems();
        ibuq.e(list0, "getItems(...)");
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        Object object0 = null;
        Object object1 = null;
        Object object2 = null;
        CharSequence charSequence0 = null;
        CharSequence charSequence1 = null;
        Object object3 = null;
        Instant instant0 = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object4 = iterator0.next();
            SliceItem sliceItem0 = (SliceItem)object4;
            if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                object0 = sliceItem0.getText();
            }
            else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                charSequence2 = sliceItem0.getText();
            }
            else {
                if(!sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                    if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                        charSequence3 = sliceItem0.getText();
                    }
                    else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                        charSequence1 = sliceItem0.getText();
                    }
                    else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                        object1 = sliceItem0.getText();
                    }
                    else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                        charSequence0 = sliceItem0.getText();
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
                    else if(!sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                        if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                            iterator0 = iterator0;
                            z2 = true;
                            continue;
                        }
                        else if(sliceItem0.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                            iterator0 = iterator0;
                            z3 = true;
                            continue;
                        }
                    }
                    else if(ibuq.m(sliceItem0.getText(), "true")) {
                        iterator0 = iterator0;
                        z = true;
                        continue;
                    }
                }
                else if(ibuq.m(sliceItem0.getText(), "true")) {
                    iterator0 = iterator0;
                    z1 = true;
                    continue;
                }
                iterator0 = iterator0;
            }
        }
        try {
            ibuq.c(object1);
            ibuq.c(object2);
            ibuq.c(object3);
            ibuq.c(object0);
            return new kwk(s, ((CharSequence)object1), ((PendingIntent)object2), z, charSequence0, charSequence1, ((Icon)object3), instant0, new kvm(object0.toString(), s, new Bundle()), z1, charSequence2, charSequence3, z2, true, z3, 0x1000);
        }
        catch(Exception exception0) {
            Log.i("CredentialEntry", "fromSlice failed with: " + exception0.getMessage());
            return null;
        }
    }

    public static final boolean b(kwk kwk0) {
        return kwk0.o ? kwk0.p : kwk0.m.getType() == 2 && kwk0.m.getResId() == 0x7F0801E8;  // drawable:adx_ic_other_sign_in
    }

    public static final void c(kwk kwk0, Slice.Builder slice$Builder0) {
        ibuq.f(kwk0, "entry");
        String s = "false";
        List list0 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID");
        Slice.Builder slice$Builder1 = slice$Builder0.addText(kwk0.b.a, null, list0);
        List list1 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID");
        Slice.Builder slice$Builder2 = slice$Builder1.addText(kwk0.c, null, list1).addText((kwk0.d ? "true" : "false"), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
        List list2 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN");
        slice$Builder2.addText(kwk0.e, null, list2);
        if(kwk0.j) {
            s = "true";
        }
        List list3 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME");
        Slice.Builder slice$Builder3 = slice$Builder0.addText(kwk0.l, null, list3);
        List list4 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME");
        Slice.Builder slice$Builder4 = slice$Builder3.addText(kwk0.h, null, list4);
        List list5 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME");
        Slice.Builder slice$Builder5 = slice$Builder4.addText(kwk0.k, null, list5).addText(s, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED"));
        List list6 = ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON");
        slice$Builder5.addIcon(kwk0.m, null, list6);
        try {
            if(kwh.b(kwk0)) {
                slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        if(kwk0.q) {
            slice$Builder0.addInt(1, null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
        }
        Instant instant0 = kwk0.n;
        if(instant0 != null) {
            slice$Builder0.addLong(instant0.toEpochMilli(), null, ibpo.b("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
        }
        Slice slice0 = new Slice.Builder(slice$Builder0).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build();
        slice$Builder0.addAction(kwk0.i, slice0, null);
    }
}

