public final class fvpl {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public fvpl() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    @Override
    public final String toString() {
        return "UploadSummary [numFileOpenSucc=" + this.a + ", numFileOpenFailed=" + this.b + ", numFileOpenInterrupted=0, numInvalidFileFormat=" + this.c + ", numGLocUploadSucc=" + this.d + ", numGLocUploadFailed=" + this.e + "]";
    }
}

