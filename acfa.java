import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;

public final class acfa {
    public static String a(Context context0, ContactPerson.ContactMethod contactPerson$ContactMethod0) {
        if(contactPerson$ContactMethod0 != null) {
            switch(contactPerson$ContactMethod0.a) {
                case 0: {
                    return "Notification";
                }
                case 3: {
                    break;
                }
                default: {
                    return contactPerson$ContactMethod0.b;
                }
            }
        }
        return null;
    }

    public static void b(ehjb ehjb0, ContactPerson contactPerson0, ContactPerson.ContactMethod contactPerson$ContactMethod0, boolean z) {
        int v1;
        if(contactPerson$ContactMethod0 != null && contactPerson$ContactMethod0.a == 3) {
            int v = 0x7F0802FD;  // drawable:common_acl_chip_green
            switch(contactPerson$ContactMethod0.b) {
                case "domain": {
                    if(z) {
                        v = 0x7F080303;  // drawable:common_acl_chip_red
                    }
                    v1 = 0x7F08031A;
                    break;
                }
                case "extendedCircles": {
                    if(z) {
                        v = 0x7F080303;  // drawable:common_acl_chip_red
                    }
                    v1 = 0x7F08031B;
                    break;
                }
                case "public": {
                    if(z) {
                        v = 0x7F080303;  // drawable:common_acl_chip_red
                    }
                    v1 = 0x7F08031E;
                    break;
                }
                default: {
                    v1 = 0x7F080319;
                    v = 0x7F0802FA;  // drawable:common_acl_chip_blue
                }
            }
            ehjb0.a();
            ehjb0.b = null;
            ehjb0.c = null;
            ehjb0.a.setImageResource(v1);
            ehjb0.e();
            ehjb0.setBackgroundResource(v);
            ehjb0.c(ehjb0.getResources().getDimensionPixelSize(0x7F070128));  // dimen:appinvite_avatar_circle_padding
            return;
        }
        AvatarReference avatarReference0 = contactPerson$ContactMethod0 == null ? null : contactPerson$ContactMethod0.c;
        if(avatarReference0 == null) {
            avatarReference0 = contactPerson0.d;
        }
        if(avatarReference0 == null) {
            Long long0 = contactPerson0.c;
            if(long0 != null) {
                long v2 = (long)long0;
                if(bata.b(ehjb0.b, long0)) {
                    BitmapDrawable bitmapDrawable0 = ehjb0.c;
                    if(bitmapDrawable0 != null) {
                        ehjb0.a.setImageDrawable(bitmapDrawable0);
                        ehjb0.e();
                    }
                    else if(ehjb0.d == null) {
                        ehjb0.d();
                        ehjb0.d = new ehja(ehjb0, v2, ehjb0.e);
                        ehjb0.d.execute(new Void[0]);
                    }
                }
                else {
                    ehjb0.a();
                    ehjb0.d();
                    ehjb0.b = long0;
                    ehjb0.c = null;
                    ehjb0.d = new ehja(ehjb0, ((long)ehjb0.b), ehjb0.e);
                    ehjb0.d.execute(new Void[0]);
                }
            }
        }
        ehjb0.setBackgroundResource(0);
        ehjb0.c(0);
    }
}

