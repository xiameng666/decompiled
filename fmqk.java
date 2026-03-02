import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.avatar.AnonymousConversationAvatarView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jeb.synthetic.FIN;

public final class fmqk {
    private static WeakReference a;
    private final LruCache b;

    static {
        fmqk.a = new WeakReference(null);
    }

    public fmqk() {
        this.b = new LruCache(50);
    }

    public static fmqk a() {
        fmqk fmqk0;
        synchronized(fmqk.class) {
            fmqk0 = (fmqk)fmqk.a.get();
            if(fmqk0 == null) {
                fmqk fmqk1 = new fmqk();
                fmqk.a = new WeakReference(fmqk1);
                return fmqk1;
            }
        }
        return fmqk0;
    }

    public final Bitmap b(fmev fmev0, gfsx gfsx0, int v, fmql fmql0, boolean z) {
        Bitmap bitmap1;
        Bitmap bitmap0;
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        ConversationId conversationId0 = fmev0.a;
        if(conversationId0 != null) {
            fmqh fmqh0 = new fmqh(conversationId0, v, z);
            LruCache lruCache0 = this.b;
            fmqj fmqj0 = (fmqj)lruCache0.get(fmqh0);
            if(fmqj0 != null) {
                gfsx gfsx1 = fmqj0.b;
                if(gfsx1.equals(fmev0.c) && fmqj0.c == fmev0.hashCode()) {
                    if(gfsx1.i() || !conversationId0.e().equals(ConversationId.IdType.a)) {
                        goto label_19;
                    }
                    if(gfsx0.i()) {
                        if(!fmqj0.d) {
                            gfsx gfsx2 = ((fmeo)gfsx0.d()).d;
                            if(fmqj0.e.equals(gfsx2) && (fmqj0.f.i() && ((int)(((Integer)fmqj0.f.d()))) == ((fmeo)gfsx0.d()).hashCode())) {
                                bitmap0 = fmqj0.a;
                                goto label_64;
                            label_19:
                                bitmap0 = fmqj0.a;
                                goto label_64;
                            }
                        }
                    }
                    else if(fmqj0.d) {
                        goto label_19;
                    }
                }
            }
            fmqi fmqi0 = new fmqi(null);
            fmqi0.c = fmev0.hashCode();
            fmqi0.g = (byte)(fmqi0.g | 1);
            gfsx gfsx3 = fmev0.c;
            if(gfsx3 != null) {
                fmqi0.b = gfsx3;
                int v2 = fmqh0.a;
                AnonymousConversationAvatarView anonymousConversationAvatarView0 = fmql0.a;
                gfsx gfsx4 = fmev0.d;
                if(gfsx4.i()) {
                    bitmap1 = anonymousConversationAvatarView0.a.c(Arrays.asList(new Bitmap[]{((Bitmap)gfsx4.d())}), v2);
                }
                else if(conversationId0.e() == ConversationId.IdType.a && gfsx0.i()) {
                    Object object0 = gfsx0.d();
                    fmqm fmqm0 = anonymousConversationAvatarView0.a;
                    int v3 = anonymousConversationAvatarView0.f;
                    int[] arr_v = anonymousConversationAvatarView0.d;
                    int v4 = anonymousConversationAvatarView0.e;
                    Drawable drawable0 = anonymousConversationAvatarView0.getContext().getDrawable(0x7F080A54);
                    bitmap1 = fmqm0.a(((fmeo)object0), v3, arr_v, v4, gfqx.a, drawable0);
                }
                else {
                    int v5 = conversationId0.hashCode();
                    gfsx gfsx5 = fmev0.b;
                    if(gfsx5.i()) {
                        v5 = ((String)gfsx5.d()).hashCode();
                    }
                    bitmap1 = anonymousConversationAvatarView0.a.c(Arrays.asList(new Bitmap[]{anonymousConversationAvatarView0.a.b(anonymousConversationAvatarView0.d[Math.abs(v5 % anonymousConversationAvatarView0.d.length)], anonymousConversationAvatarView0.getContext().getDrawable(0x7F080A54), anonymousConversationAvatarView0.e, v2)}), v2);
                }
                if(bitmap1 != null) {
                    fmqi0.a = bitmap1;
                    if(gfsx0.i()) {
                        fmqi0.f = gfsx.m(Integer.valueOf(((fmeo)gfsx0.d()).hashCode()));
                        gfsx gfsx6 = ((fmeo)gfsx0.d()).d;
                        if(gfsx6 != null) {
                            fmqi0.e = gfsx6;
                            fmqi0.a(false);
                            goto label_58;
                        }
                        throw new NullPointerException("Null contactImageUrl");
                    }
                    else {
                        fmqi0.a(true);
                    }
                label_58:
                    if(fmqi0.g == 3) {
                        Bitmap bitmap2 = fmqi0.a;
                        if(bitmap2 != null) {
                            fmqj fmqj1 = new fmqj(bitmap2, fmqi0.b, fmqi0.c, fmqi0.d, fmqi0.e, fmqi0.f);
                            lruCache0.put(fmqh0, fmqj1);
                            bitmap0 = fmqj1.a;
                        label_64:
                            FIN.finallyCodeBegin$NT(v1);
                            return bitmap0;
                        }
                    }
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if(fmqi0.a == null) {
                        stringBuilder0.append(" avatar");
                    }
                    if((fmqi0.g & 1) == 0) {
                        stringBuilder0.append(" conversationProfileHashCode");
                    }
                    if((fmqi0.g & 2) == 0) {
                        stringBuilder0.append(" isDefault");
                    }
                    throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
                }
                throw new NullPointerException("Null avatar");
            }
            throw new NullPointerException("Null conversationImageUrl");
        }
        throw new NullPointerException("Null conversationId");
    }
}

