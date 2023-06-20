package com.marzhiievskyi.tradehubproject.exception_handling;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class CommonException {

    private String message;
    private HttpStatus httpStatus;
}
