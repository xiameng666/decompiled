import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing.Metadata;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

public final class bwtg {
    public static Thing a(Thing thing0) {
        String s2;
        Thing.Metadata thing$Metadata0 = thing0.c;
        boolean[] arr_z = thing$Metadata0.b();
        if(arr_z != null && arr_z.length != 0 && !arr_z[0]) {
            thing$Metadata0.d.putLongArray("scope", new long[]{1L});
        }
        int v1 = thing0.a;
        if(v1 == 10) {
            if(thing0.e.equals("Reservation")) {
                v1 = 10;
                goto label_11;
            }
            return thing0;
        }
    label_11:
        Bundle bundle0 = new Bundle(thing0.b);
        String s = thing0.e;
        if(s.equals("Reservation")) {
            bwtg.b(bundle0, "startTime", "startDate");
        }
        for(Object object0: bundle0.keySet()) {
            String s1 = (String)object0;
            Object object1 = bundle0.get(s1);
            if((object1 instanceof Parcelable[])) {
                Thing[] arr_thing = new Thing[((Parcelable[])object1).length];
                for(int v2 = 0; v2 < ((Parcelable[])object1).length; ++v2) {
                    arr_thing[v2] = bwtg.a(((Thing)((Parcelable[])object1)[v2]));
                }
                bundle0.putParcelableArray(s1, arr_thing);
            }
        }
        switch(v1) {
            case 1: {
                if(s.equals("Person")) {
                    bwtg.b(bundle0, "text", "email");
                }
                if(Arrays.asList(new String[]{"Document", "PresentationDocument", "NoteDocument", "TextDocument", "SpreadsheetDocument"}).contains(s)) {
                    bwtg.b(bundle0, "hasDocumentPermission", "hasDigitalDocumentPermission");
                }
                s2 = s;
                for(int v3 = 0; v3 < 6; ++v3) {
                    if(s.equals(new String[]{"Document", "PresentationDocument", "NoteDocument", "TextDocument", "SpreadsheetDocument", "DocumentPermission"}[v3])) {
                        s2 = new String[]{"DigitalDocument", "PresentationDigitalDocument", "NoteDigitalDocument", "TextDigitalDocument", "SpreadsheetDigitalDocument", "DigitalDocumentPermission"}[v3];
                    }
                }
                break;
            }
            case 2: {
                s2 = s;
                break;
            }
            default: {
                return new Thing(v1, bundle0, thing$Metadata0, thing0.d, s);
            }
        }
        if(Arrays.asList(new String[]{"File", "PresentationFile", "NoteFile", "TextFile", "SpreadsheetFile"}).contains(s)) {
            bwtg.b(bundle0, "hasFilePermission", "hasDigitalDocumentPermission");
        }
        for(int v = 0; v < 6; ++v) {
            if(s.equals(new String[]{"File", "PresentationFile", "NoteFile", "TextFile", "SpreadsheetFile", "FilePermission"}[v])) {
                s2 = new String[]{"DigitalDocument", "PresentationDigitalDocument", "NoteDigitalDocument", "TextDigitalDocument", "SpreadsheetDigitalDocument", "DigitalDocumentPermission"}[v];
            }
        }
        return new Thing(v1, bundle0, thing$Metadata0, thing0.d, s2);
    }

    private static void b(Bundle bundle0, String s, String s1) {
        if((bundle0.get(s) instanceof String[])) {
            bundle0.putStringArray(s1, bundle0.getStringArray(s));
            bundle0.remove(s);
            return;
        }
        if((bundle0.get(s) instanceof Parcelable[])) {
            bundle0.putParcelableArray(s1, bundle0.getParcelableArray(s));
            bundle0.remove(s);
            return;
        }
        if((bundle0.get(s) instanceof long[])) {
            bundle0.putLongArray(s1, bundle0.getLongArray(s));
            bundle0.remove(s);
        }
    }
}

