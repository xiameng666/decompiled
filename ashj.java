import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.gms.backup.settings.component.BackupOptInHelper.NoUnderlineUrlSpan;
import java.util.Arrays;

public final class ashj {
    public static CharSequence a(Context context0, grjy grjy0) {
        String s = context0.getResources().getString(grjy0.b.d(2));
        String s1 = context0.getResources().getString(grjy0.b.d(3));
        String s2 = context0.getResources().getString(grjy0.b.d(4));
        CharSequence charSequence0 = new SpannableStringBuilder();
        ((SpannableStringBuilder)charSequence0).append(s);
        if(!s1.isEmpty()) {
            ((SpannableStringBuilder)charSequence0).append("\n\n").append(s1);
        }
        if(!s2.isEmpty()) {
            ((SpannableStringBuilder)charSequence0).append("\n\n").append(s2);
        }
        return charSequence0;
    }

    public static boolean b(Context context0) {
        return aqjl.a.j(context0);
    }

    public static boolean c(Context context0) {
        return ashj.d(context0) || ashj.b(context0);
    }

    public static boolean d(Context context0) {
        return context0.getPackageManager().hasSystemFeature("com.google.android.apps.photos.NEXUS_PRELOAD") && ashj.b(context0);
    }

    public static CharSequence e(Context context0, grjy grjy0, ProtoLiteBuilder hftp0) {
        String s = context0.getResources().getString(grjy0.b.d(0));
        String s1 = context0.getResources().getString(grjy0.b.d(1));
        CharSequence charSequence0 = new SpannableStringBuilder();
        ((SpannableStringBuilder)charSequence0).append(s);
        SpannableString spannableString0 = new SpannableString(s1);
        grjy grjy1 = ((grje)hftp0.b_message).e;
        if(grjy1 == null) {
            grjy1 = grjy.a;
        }
        int[] arr_v = glwy.n(grjy1.b);
        grjy grjy2 = ((grje)hftp0.b_message).e;
        if(grjy2 == null) {
            grjy2 = grjy.a;
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, grjy2.b.size() - 1);
        grjy grjy3 = ((grje)hftp0.b_message).e;
        grjy grjy4 = grjy3 == null ? grjy.a : grjy3;
        if(grjy3 == null) {
            grjy3 = grjy.a;
        }
        int v = grjy4.b.d(grjy3.b.size() - 1);
        String[] arr_s = new String[arr_v1.length - 1];
        int v1 = 0;
        for(int v2 = 1; v2 < arr_v1.length; ++v2) {
            arr_s[v1] = context0.getResources().getString(arr_v1[v2]);
            ++v1;
        }
        String s2 = context0.getResources().getString(arr_v1[0], arr_s);
        SpannableString spannableString1 = new SpannableString(context0.getResources().getString(v));
        spannableString1.setSpan(new BackupOptInHelper.NoUnderlineUrlSpan(), 0, spannableString1.length(), 17);
        CharSequence charSequence1 = TextUtils.expandTemplate(s2, new CharSequence[]{spannableString1});
        Resources resources0 = context0.getResources();
        grjy grjy5 = ((grje)hftp0.b_message).g;
        if(grjy5 == null) {
            grjy5 = grjy.a;
        }
        spannableString0.setSpan(new ashi(context0, charSequence1, resources0.getString(grjy5.b.d(0)), hftp0), 0, spannableString0.length(), 17);
        ((SpannableStringBuilder)charSequence0).append(" ").append(spannableString0);
        return charSequence0;
    }
}

