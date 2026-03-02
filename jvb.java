import android.app.Notification.MessagingStyle;
import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

public final class jvb extends jvg {
    public final List a;
    private final List b;
    private jvx c;
    private CharSequence d;
    private Boolean e;

    public jvb() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public jvb(jvx jvx0) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        if(TextUtils.isEmpty(jvx0.a)) {
            throw new IllegalArgumentException("User\'s name must not be empty.");
        }
        this.c = jvx0;
    }

    @Deprecated
    public jvb(byte[] arr_b) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        jvw jvw0 = new jvw();
        jvw0.a = "";
        this.c = new jvx(jvw0);
    }

    @Override  // jvg
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override  // jvg
    protected final void b(Bundle bundle0) {
        super.b(bundle0);
        bundle0.remove("android.messagingStyleUser");
        bundle0.remove("android.selfDisplayName");
        bundle0.remove("android.conversationTitle");
        bundle0.remove("android.hiddenConversationTitle");
        bundle0.remove("android.messages");
        bundle0.remove("android.messages.historic");
        bundle0.remove("android.isGroupConversation");
    }

    @Override  // jvg
    protected final void c(Bundle bundle0) {
        super.c(bundle0);
        List list0 = this.a;
        list0.clear();
        if(bundle0.containsKey("android.messagingStyleUser")) {
            this.c = jvx.a(bundle0.getBundle("android.messagingStyleUser"));
        }
        else {
            jvw jvw0 = new jvw();
            jvw0.a = bundle0.getString("android.selfDisplayName");
            this.c = new jvx(jvw0);
        }
        CharSequence charSequence0 = bundle0.getCharSequence("android.conversationTitle");
        this.d = charSequence0;
        if(charSequence0 == null) {
            this.d = bundle0.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] arr_parcelable = bundle0.getParcelableArray("android.messages");
        if(arr_parcelable != null) {
            list0.addAll(jva.b(arr_parcelable));
        }
        Parcelable[] arr_parcelable1 = bundle0.getParcelableArray("android.messages.historic");
        if(arr_parcelable1 != null) {
            List list1 = jva.b(arr_parcelable1);
            this.b.addAll(list1);
        }
        if(bundle0.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle0.getBoolean("android.isGroupConversation"));
        }
    }

    @Override  // jvg
    public final void d(jvl jvl0) {
        boolean z = false;
        Boolean boolean0 = this.e;
        if(boolean0 != null) {
            z = boolean0.booleanValue();
        }
        this.e = Boolean.valueOf(z);
        Notification.MessagingStyle notification$MessagingStyle0 = jux.a(jvv.a(this.c));
        for(Object object0: this.a) {
            juv.a(notification$MessagingStyle0, ((jva)object0).a());
        }
        for(Object object1: this.b) {
            juw.a(notification$MessagingStyle0, ((jva)object1).a());
        }
        juv.b(notification$MessagingStyle0, this.d);
        jux.b(notification$MessagingStyle0, this.e.booleanValue());
        notification$MessagingStyle0.setBuilder(jvl0.a);
    }

    public static jvb g(Notification notification0) {
        jvg jvg0 = jvg.j(notification0);
        return (jvg0 instanceof jvb) ? ((jvb)jvg0) : null;
    }

    public final void h(jva jva0) {
        List list0 = this.a;
        list0.add(jva0);
        if(list0.size() > 25) {
            list0.remove(0);
        }
    }

    @Deprecated
    public final void i(CharSequence charSequence0, long v, CharSequence charSequence1) {
        jvw jvw0 = new jvw();
        jvw0.a = charSequence1;
        jva jva0 = new jva(charSequence0, v, new jvx(jvw0));
        List list0 = this.a;
        list0.add(jva0);
        if(list0.size() > 25) {
            list0.remove(0);
        }
    }

    @Override  // jvg
    public final void k(Bundle bundle0) {
        Bundle bundle2;
        super.k(bundle0);
        bundle0.putCharSequence("android.selfDisplayName", this.c.a);
        jvx jvx0 = this.c;
        Bundle bundle1 = new Bundle();
        bundle1.putCharSequence("name", jvx0.a);
        IconCompat iconCompat0 = jvx0.b;
        if(iconCompat0 == null) {
            bundle2 = null;
        }
        else {
            bundle2 = new Bundle();
            switch(iconCompat0.b) {
                case -1: {
                    bundle2.putParcelable("obj", ((Parcelable)iconCompat0.c));
                    break;
                }
                case 3: {
                    bundle2.putByteArray("obj", ((byte[])iconCompat0.c));
                    break;
                }
                case 1: 
                case 5: {
                    bundle2.putParcelable("obj", ((Bitmap)iconCompat0.c));
                    break;
                }
                case 2: 
                case 4: 
                case 6: {
                    bundle2.putString("obj", ((String)iconCompat0.c));
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid icon");
                }
            }
            bundle2.putInt("type", iconCompat0.b);
            bundle2.putInt("int1", iconCompat0.f);
            bundle2.putInt("int2", iconCompat0.g);
            bundle2.putString("string1", iconCompat0.k);
            ColorStateList colorStateList0 = iconCompat0.h;
            if(colorStateList0 != null) {
                bundle2.putParcelable("tint_list", colorStateList0);
            }
            PorterDuff.Mode porterDuff$Mode0 = iconCompat0.i;
            if(porterDuff$Mode0 != IconCompat.a) {
                bundle2.putString("tint_mode", porterDuff$Mode0.name());
            }
        }
        bundle1.putBundle("icon", bundle2);
        bundle1.putString("uri", jvx0.c);
        bundle1.putString("key", jvx0.d);
        bundle1.putBoolean("isBot", jvx0.e);
        bundle1.putBoolean("isImportant", jvx0.f);
        bundle0.putBundle("android.messagingStyleUser", bundle1);
        bundle0.putCharSequence("android.hiddenConversationTitle", this.d);
        if(this.d != null && this.e.booleanValue()) {
            bundle0.putCharSequence("android.conversationTitle", this.d);
        }
        List list0 = this.a;
        if(!list0.isEmpty()) {
            bundle0.putParcelableArray("android.messages", jva.c(list0));
        }
        List list1 = this.b;
        if(!list1.isEmpty()) {
            bundle0.putParcelableArray("android.messages.historic", jva.c(list1));
        }
        Boolean boolean0 = this.e;
        if(boolean0 != null) {
            bundle0.putBoolean("android.isGroupConversation", boolean0.booleanValue());
        }
    }
}

