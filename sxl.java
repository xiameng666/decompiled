enum sxl {
    CASE_1("Normal Case 1", false, false, false),
    CASE_2("Normal Case 2", false, true, false),
    CASE_3("Normal Case 3", true, false, false),
    CASE_4("Normal Case 4", true, true, false),
    EXTENDED_CASE_1("Extended Case 1", true, false, true),
    EXTENDED_CASE_2("Extended Case 2", false, true, true),
    EXTENDED_CASE_3("Extended Case 3", true, true, true);

    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    private sxl(String s1, boolean z, boolean z1, boolean z2) {
        this.h = s1;
        this.i = z;
        this.j = z1;
        this.k = z2;
    }

    @Override
    public final String toString() {
        return this.h;
    }
}

