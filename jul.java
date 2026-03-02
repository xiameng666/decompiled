import android.app.Notification.BubbleMetadata.Builder;
import android.app.Notification.BubbleMetadata;
import android.graphics.drawable.Icon;

final class jul {
    static Notification.BubbleMetadata a(jun jun0) {
        Notification.BubbleMetadata.Builder notification$BubbleMetadata$Builder0;
        String s = jun0.g;
        if(s == null) {
            Icon icon0 = jxw.c(jun0.c);
            notification$BubbleMetadata$Builder0 = new Notification.BubbleMetadata.Builder(jun0.a, icon0);
        }
        else {
            notification$BubbleMetadata$Builder0 = new Notification.BubbleMetadata.Builder(s);
        }
        boolean z = true;
        Notification.BubbleMetadata.Builder notification$BubbleMetadata$Builder1 = notification$BubbleMetadata$Builder0.setDeleteIntent(jun0.b).setAutoExpandBubble(1 == (jun0.f & 1));
        if((jun0.f & 2) == 0) {
            z = false;
        }
        notification$BubbleMetadata$Builder1.setSuppressNotification(z);
        int v = jun0.d;
        if(v != 0) {
            notification$BubbleMetadata$Builder0.setDesiredHeight(v);
        }
        int v1 = jun0.e;
        if(v1 != 0) {
            notification$BubbleMetadata$Builder0.setDesiredHeightResId(v1);
        }
        return notification$BubbleMetadata$Builder0.build();
    }

    static jun b(Notification.BubbleMetadata notification$BubbleMetadata0) {
        jum jum0 = notification$BubbleMetadata0.getShortcutId() == null ? new jum(notification$BubbleMetadata0.getIntent(), jxw.b(notification$BubbleMetadata0.getIcon())) : new jum(notification$BubbleMetadata0.getShortcutId());
        jum0.a(1, notification$BubbleMetadata0.getAutoExpandBubble());
        jum0.f = notification$BubbleMetadata0.getDeleteIntent();
        jum0.a(2, notification$BubbleMetadata0.isNotificationSuppressed());
        if(notification$BubbleMetadata0.getDesiredHeight() != 0) {
            jum0.c = Math.max(notification$BubbleMetadata0.getDesiredHeight(), 0);
            jum0.d = 0;
        }
        if(notification$BubbleMetadata0.getDesiredHeightResId() != 0) {
            jum0.d = notification$BubbleMetadata0.getDesiredHeightResId();
            jum0.c = 0;
        }
        String s = jum0.g;
        if(s == null && jum0.a == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if(s == null && jum0.b == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        int v = jum0.e;
        jun jun0 = new jun(jum0.a, jum0.f, jum0.b, jum0.c, jum0.d, v, s);
        jun0.f = v;
        return jun0;
    }
}

