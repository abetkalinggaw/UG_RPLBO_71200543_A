package LoginRegister.com;

public class PasswordException extends Throwable {
    private int errCode;
    private String errMessage;

    public PasswordException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode==1){
            errMessage="Maaf, password tidak boleh kosong!";
        }else if(this.errCode==2){
            errMessage="Maaf, password minimal 7 karakter!";
        }else if(this.errCode==3){
            errMessage="Maaf, password tidak boleh sama dengan username!";
        }else if(this.errCode==4){
            errMessage="Maaf, password harus mengandung huruf kecil, huruf besar, angka, dan simbol!";
        }else if(this.errCode==5){
            errMessage="Maaf, password tidak sama!";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}

