package tamgiac;

public class TamGiac {
    private int canha;
    private int canhb;
    private int canhc;

    public TamGiac(int canha, int canhb, int canhc) {
        if (canha <= 0 || canhb <= 0 || canhc <= 0) {
            System.out.println("dữ liệu không hợp lệ");
        }
        this.canha = canha;
        this.canhb = canhb;
        this.canhc = canhc;
    }

    public int CheckTrangle() {
        boolean isTrangle = false;
        if (canha < canhb + canhc && canhb < canhc + canha && canhc < canha + canhb)
            isTrangle = true;

        if (isTrangle) {
            if (canha == canhb && canhb == canhc)
                return 2;
        } else if (canha != canhb && canha != canhc && canhb != canhc)
            return 0;
        else{
            return 1;
        }
        return -1;
    }

}
