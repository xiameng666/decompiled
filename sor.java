import android.app.PendingIntent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;

public final class sor {
    public final int a;
    public final PendingIntent b;
    public final int c;

    protected sor(int v) {
        this(v, null, 0, null);
    }

    private sor(int v, PendingIntent pendingIntent0, int v1, String s) {
        this.a = v;
        this.c = v1;
        this.b = pendingIntent0;
        if(s != null) {
            Html.fromHtml(s, 0x3F);
        }
    }

    public static sor a(Bundle bundle0) {
        int v4;
        if(bundle0 == null) {
            return new sor(1);
        }
        int v = 0;
        int v1 = bundle0.getInt("status_code", 0);
        int v2 = 7;
        int v3 = 100;
        if(v1 == 100) {
            v4 = 100;
        }
        else {
            switch(v1) {
                case 0: {
                    v4 = 0;
                    break;
                }
                case 1: {
                    v4 = 1;
                    break;
                }
                case 2: {
                    v4 = 2;
                    break;
                }
                case 3: {
                    v4 = 3;
                    break;
                }
                case 4: {
                    v4 = 4;
                    break;
                }
                case 5: {
                    v4 = 5;
                    break;
                }
                case 6: {
                    v4 = 6;
                    break;
                }
                case 7: {
                    v4 = 7;
                    break;
                }
                case 8: {
                    v4 = 8;
                    break;
                }
                case 9: {
                    v4 = 9;
                    break;
                }
                default: {
                    Log.w("PlayP2pClient.Constants", "Unrecognized StatusCode enum encountered: " + v1);
                    v4 = 0;
                }
            }
        }
        int v5 = bundle0.getInt("pending_intent_reason", 0);
        switch(v5) {
            case 0: {
                break;
            }
            case 1: {
                v = 1;
                break;
            }
            case 2: {
                v = 2;
                break;
            }
            case 3: {
                v = 3;
                break;
            }
            default: {
                Log.w("PlayP2pClient.Constants", "Unrecognized PendingIntentReason enum encountered: " + v5);
            }
        }
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("pending_intent");
        String s = bundle0.getString("tos_text_html");
        if(v4 != 2) {
            v3 = v4;
        }
        else if(!bundle0.getBoolean("tos_needed", true) || !TextUtils.isEmpty(s)) {
            v3 = 2;
        }
        if(v3 == 2 || v3 == 6 || v3 != 7) {
            v2 = v3;
        }
        return new sor(v2, pendingIntent0, v, s);
    }
}

