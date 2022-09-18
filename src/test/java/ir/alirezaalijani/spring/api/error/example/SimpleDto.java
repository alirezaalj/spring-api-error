package ir.alirezaalijani.spring.api.error.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.*;

/**
 * @author alireza alijani : https://alirezaalijani.ir
 * @user alireza
 * @date 9/19/22 - 12:28 AM
 * @project spring-api-error
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimpleDto {
    @NotNull
    @Min(value = 0)
    private Integer id;
    @NotNull
    @Email
    private String email;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String questionText;
    private String generalFeedback;
    @NotNull
    @Min(value = 0) @Max(value = 100)
    private Double defaultMark;
    @Min(value = 0) @Max(1)
    private Double penalty;
    @NotNull
    private SimpleEnum simpleEnum;
    @Min(0) @Max(1)
    private Integer responseRequired;
    @Min(2) @Max(40)
    private Integer responseFieldLines;
    @Min(-1) @Max(3)
    private Integer attachments;
    @Min(1) @Max(3)
    private Integer attachmentsRequired;
    @Min(0) @Max(2097152)
    private Integer maxBytes;
}
