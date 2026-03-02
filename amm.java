import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

final class amm implements lqj {
    final amo a;

    public amm(amo amo0) {
        this.a = amo0;
        super();
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v3;
        amo amo0 = this.a;
        Handler handler0 = amo0.ag;
        Runnable runnable0 = amo0.ah;
        handler0.removeCallbacks(runnable0);
        int v = (int)(((Integer)object0));
        if(amo0.al != null) {
            int v1 = amo0.ai.x;
            Context context0 = amo0.getContext();
            Drawable drawable0 = null;
            int v2 = 0;
            if(context0 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            }
            else if(v1 != 0) {
            label_20:
                if(v1 != 1) {
                label_26:
                    if(v1 != 2) {
                        v3 = v1;
                    label_34:
                        if(v1 == 1 && v == 3) {
                            v1 = v3;
                            drawable0 = context0.getDrawable(0x7F08041C);  // drawable:fingerprint_dialog_fp_icon
                        }
                        else {
                            v1 = v3;
                        }
                    }
                    else if(v != 1) {
                        v3 = 2;
                        goto label_34;
                    }
                    else {
                        v1 = 2;
                        drawable0 = context0.getDrawable(0x7F08041C);  // drawable:fingerprint_dialog_fp_icon
                    }
                }
                else if(v == 2) {
                    v1 = 1;
                    drawable0 = context0.getDrawable(0x7F08041B);
                }
                else {
                    v1 = 1;
                    goto label_26;
                }
            }
            else if(v == 1) {
                v1 = 0;
                v = 1;
                drawable0 = context0.getDrawable(0x7F08041C);  // drawable:fingerprint_dialog_fp_icon
            }
            else {
                v1 = 0;
                goto label_20;
            }
            if(drawable0 != null) {
                amo0.al.setImageDrawable(drawable0);
                if(v1 != 0) {
                    v2 = v1;
                label_45:
                    if(v2 != 1) {
                        if(v2 == 2 && v == 1) {
                        label_49:
                            if((drawable0 instanceof AnimatedVectorDrawable)) {
                                ((AnimatedVectorDrawable)drawable0).start();
                            }
                        }
                    }
                    else if(v == 2) {
                        goto label_49;
                    }
                }
                else if(v == 1) {
                }
                else {
                    goto label_45;
                }
                amo0.ai.x = v;
            }
        }
        int v4 = (int)(((Integer)object0));
        TextView textView0 = amo0.am;
        if(textView0 != null) {
            textView0.setTextColor((v4 == 2 ? amo0.aj : amo0.ak));
        }
        handler0.postDelayed(runnable0, 2000L);
    }
}

