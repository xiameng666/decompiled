import android.view.inputmethod.ExtractedText;

public final class jgp {
    public static final ExtractedText a(jhk jhk0) {
        ExtractedText extractedText0 = new ExtractedText();
        extractedText0.text = jhk0.a();
        extractedText0.startOffset = 0;
        extractedText0.partialEndOffset = jhk0.a().length();
        extractedText0.partialStartOffset = -1;
        extractedText0.selectionStart = jbk.d(jhk0.c);
        extractedText0.selectionEnd = jbk.c(jhk0.c);
        extractedText0.flags = ibzk.F(jhk0.a(), '\n') ^ 1;
        return extractedText0;
    }
}

