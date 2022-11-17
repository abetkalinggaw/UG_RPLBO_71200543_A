package LoginRegister.com;

public class EmailException extends Exception{
    private int errCode;
    private String errMessage;

    public EmailException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode==1){
            errMessage="Maaf, email tidak boleh kosong!!";
        }else if(this.errCode==2){
            errMessage="Maaf, email yang anda masukkan tidak valid";
        }
    }

    public String getErrMessage() {
        return errMessage;
    }

    public int getErrCode() {
        return errCode;
    }
}
