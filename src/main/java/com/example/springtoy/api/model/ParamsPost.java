package com.example.springtoy.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParamsPost {
    @ApiModelProperty(value = "작성자명", required = true)
    private String author;
    @ApiModelProperty(value = "제목", required = true)
    private String title;
    @ApiModelProperty(value = "내용", required = true)
    private String content;

}
