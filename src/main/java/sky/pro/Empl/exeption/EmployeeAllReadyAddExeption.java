package sky.pro.Empl.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAllReadyAddExeption extends RuntimeException{
    public EmployeeAllReadyAddExeption() {
    }

    public EmployeeAllReadyAddExeption(String message) {
        super(message);
    }

    public EmployeeAllReadyAddExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAllReadyAddExeption(Throwable cause) {
        super(cause);
    }

    public EmployeeAllReadyAddExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
