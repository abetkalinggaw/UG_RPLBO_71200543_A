package LoginRegister.com;

public class LoginException extends Throwable {
    private int errCode;
    private String errMessage;

    public LoginException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode==1){
            errMessage="Maaf, username tidak boleh kosong!";
        }else if(this.errCode==2){
            errMessage="Maaf, password tidak boleh kosong!";
        }
        else if(this.errCode==3){
            errMessage="Maaf, username atau password anda salah!";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
