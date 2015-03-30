package io.swagger.client;

public class ApiException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    int code = 0;
  String message = null;

    public ApiException() {
        super();
    }

    public ApiException(Throwable t) {
        super(t);
    }

  public ApiException(int code, String message) {
    this.code = code;
        this.message = message + "Code: " + code;
  }

  public int getCode() {
    return code;
  }
  
  public void setCode(int code) {
    this.code = code;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
}