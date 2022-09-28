package com.ead.course.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ModuleDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
}
